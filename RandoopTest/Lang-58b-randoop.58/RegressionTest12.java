import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
@FixMethodOrder(MethodSorters.NAME_ASCENDING) public class RegressionTest12 {
  public static boolean debug=false;
  @Test public void test001() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test001#10");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test001");
    java.lang.String str2=org.apache.commons.lang.StringUtils.prechomp("########################AAAAAAAAAAAAAAAAAAAA########################################################i!","a                                                HI!");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "########################AAAAAAAAAAAAAAAAAAAA########################################################i!"+ "'",str2.equals("########################AAAAAAAAAAAAAAAAAAAA########################################################i!"));
  }
  @Test public void test002() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test002#18");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test002");
    java.lang.String[] strArray4=org.apache.commons.lang.StringUtils.splitByWholeSeparator("A                                                hi!                                                 ","A                                                hi!                                                 ",(int)'#');
    java.lang.String[] strArray6=org.apache.commons.lang.StringUtils.stripAll(strArray4,"aaaaaaaaa");
    int int7=org.apache.commons.lang.StringUtils.lastIndexOfAny("AAAAAAAAA ",strArray4);
    java.lang.String[] strArray8=org.apache.commons.lang.StringUtils.stripAll(strArray4);
    org.junit.Assert.assertNotNull(strArray4);
    org.junit.Assert.assertNotNull(strArray6);
    org.junit.Assert.assertTrue("'" + int7 + "' != '"+ 10+ "'",int7 == 10);
    org.junit.Assert.assertNotNull(strArray8);
  }
  @Test public void test003() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test003#32");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test003");
    float float3=org.apache.commons.lang.math.NumberUtils.max((float)134,0.0f,(float)891);
    org.junit.Assert.assertTrue("'" + float3 + "' != '"+ 891.0f+ "'",float3 == 891.0f);
  }
  @Test public void test004() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test004#40");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test004");
    java.lang.String str2=org.apache.commons.lang.StringUtils.getPrechomp("      ...","Aaaaaaaaa4");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test005() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test005#48");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test005");
    java.lang.String str1=org.apache.commons.lang.StringUtils.capitalize("44Aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "44Aaaaaaaaa"+ "'",str1.equals("44Aaaaaaaaa"));
  }
  @Test public void test006() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test006#56");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test006");
    java.lang.String[] strArray1=org.apache.commons.lang.StringUtils.split("a  a A                                                hi!                                                 a aaaaaaaaa                                                                                        a aaaaaaaaa");
    org.junit.Assert.assertNotNull(strArray1);
  }
  @Test public void test007() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test007#64");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test007");
    java.lang.String str3=org.apache.commons.lang.StringUtils.replaceOnce("","","aaaaaaaaa i!");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ ""+ "'",str3.equals(""));
  }
  @Test public void test008() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test008#72");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test008");
    long[] longArray4=new long[]{48L,0,99,(byte)0};
    long[] longArray5=null;
    long[] longArray7=new long[]{'#'};
    long[] longArray11=new long[]{97,(-1),' '};
    boolean boolean12=org.apache.commons.lang.math.NumberUtils.equals(longArray7,longArray11);
    long long13=org.apache.commons.lang.math.NumberUtils.max(longArray7);
    boolean boolean14=org.apache.commons.lang.math.NumberUtils.equals(longArray5,longArray7);
    long[] longArray16=new long[]{'#'};
    long[] longArray20=new long[]{97,(-1),' '};
    boolean boolean21=org.apache.commons.lang.math.NumberUtils.equals(longArray16,longArray20);
    long long22=org.apache.commons.lang.math.NumberUtils.max(longArray16);
    long long23=org.apache.commons.lang.math.NumberUtils.min(longArray16);
    long long24=org.apache.commons.lang.math.NumberUtils.max(longArray16);
    boolean boolean25=org.apache.commons.lang.math.NumberUtils.equals(longArray7,longArray16);
    long[] longArray28=new long[]{1,97};
    long long29=org.apache.commons.lang.math.NumberUtils.min(longArray28);
    boolean boolean30=org.apache.commons.lang.math.NumberUtils.equals(longArray7,longArray28);
    long[] longArray32=new long[]{'#'};
    long[] longArray36=new long[]{97,(-1),' '};
    boolean boolean37=org.apache.commons.lang.math.NumberUtils.equals(longArray32,longArray36);
    long[] longArray39=new long[]{'#'};
    long[] longArray43=new long[]{97,(-1),' '};
    boolean boolean44=org.apache.commons.lang.math.NumberUtils.equals(longArray39,longArray43);
    long long45=org.apache.commons.lang.math.NumberUtils.max(longArray39);
    boolean boolean46=org.apache.commons.lang.math.NumberUtils.equals(longArray36,longArray39);
    long long47=org.apache.commons.lang.math.NumberUtils.max(longArray39);
    long long48=org.apache.commons.lang.math.NumberUtils.max(longArray39);
    boolean boolean49=org.apache.commons.lang.math.NumberUtils.equals(longArray7,longArray39);
    boolean boolean50=org.apache.commons.lang.math.NumberUtils.equals(longArray4,longArray7);
    long[] longArray51=null;
    long[] longArray53=new long[]{'#'};
    long[] longArray57=new long[]{97,(-1),' '};
    boolean boolean58=org.apache.commons.lang.math.NumberUtils.equals(longArray53,longArray57);
    long long59=org.apache.commons.lang.math.NumberUtils.max(longArray53);
    boolean boolean60=org.apache.commons.lang.math.NumberUtils.equals(longArray51,longArray53);
    long[] longArray62=new long[]{'#'};
    long[] longArray66=new long[]{97,(-1),' '};
    boolean boolean67=org.apache.commons.lang.math.NumberUtils.equals(longArray62,longArray66);
    long long68=org.apache.commons.lang.math.NumberUtils.max(longArray62);
    long long69=org.apache.commons.lang.math.NumberUtils.min(longArray62);
    long long70=org.apache.commons.lang.math.NumberUtils.max(longArray62);
    boolean boolean71=org.apache.commons.lang.math.NumberUtils.equals(longArray53,longArray62);
    long long72=org.apache.commons.lang.math.NumberUtils.min(longArray62);
    long long73=org.apache.commons.lang.math.NumberUtils.max(longArray62);
    long long74=org.apache.commons.lang.math.NumberUtils.min(longArray62);
    long long75=org.apache.commons.lang.math.NumberUtils.min(longArray62);
    boolean boolean76=org.apache.commons.lang.math.NumberUtils.equals(longArray4,longArray62);
    org.junit.Assert.assertNotNull(longArray4);
    org.junit.Assert.assertNotNull(longArray7);
    org.junit.Assert.assertNotNull(longArray11);
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '"+ false+ "'",boolean12 == false);
    org.junit.Assert.assertTrue("'" + long13 + "' != '"+ 35L+ "'",long13 == 35L);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '"+ false+ "'",boolean14 == false);
    org.junit.Assert.assertNotNull(longArray16);
    org.junit.Assert.assertNotNull(longArray20);
    org.junit.Assert.assertTrue("'" + boolean21 + "' != '"+ false+ "'",boolean21 == false);
    org.junit.Assert.assertTrue("'" + long22 + "' != '"+ 35L+ "'",long22 == 35L);
    org.junit.Assert.assertTrue("'" + long23 + "' != '"+ 35L+ "'",long23 == 35L);
    org.junit.Assert.assertTrue("'" + long24 + "' != '"+ 35L+ "'",long24 == 35L);
    org.junit.Assert.assertTrue("'" + boolean25 + "' != '"+ true+ "'",boolean25 == true);
    org.junit.Assert.assertNotNull(longArray28);
    org.junit.Assert.assertTrue("'" + long29 + "' != '"+ 1L+ "'",long29 == 1L);
    org.junit.Assert.assertTrue("'" + boolean30 + "' != '"+ false+ "'",boolean30 == false);
    org.junit.Assert.assertNotNull(longArray32);
    org.junit.Assert.assertNotNull(longArray36);
    org.junit.Assert.assertTrue("'" + boolean37 + "' != '"+ false+ "'",boolean37 == false);
    org.junit.Assert.assertNotNull(longArray39);
    org.junit.Assert.assertNotNull(longArray43);
    org.junit.Assert.assertTrue("'" + boolean44 + "' != '"+ false+ "'",boolean44 == false);
    org.junit.Assert.assertTrue("'" + long45 + "' != '"+ 35L+ "'",long45 == 35L);
    org.junit.Assert.assertTrue("'" + boolean46 + "' != '"+ false+ "'",boolean46 == false);
    org.junit.Assert.assertTrue("'" + long47 + "' != '"+ 35L+ "'",long47 == 35L);
    org.junit.Assert.assertTrue("'" + long48 + "' != '"+ 35L+ "'",long48 == 35L);
    org.junit.Assert.assertTrue("'" + boolean49 + "' != '"+ true+ "'",boolean49 == true);
    org.junit.Assert.assertTrue("'" + boolean50 + "' != '"+ false+ "'",boolean50 == false);
    org.junit.Assert.assertNotNull(longArray53);
    org.junit.Assert.assertNotNull(longArray57);
    org.junit.Assert.assertTrue("'" + boolean58 + "' != '"+ false+ "'",boolean58 == false);
    org.junit.Assert.assertTrue("'" + long59 + "' != '"+ 35L+ "'",long59 == 35L);
    org.junit.Assert.assertTrue("'" + boolean60 + "' != '"+ false+ "'",boolean60 == false);
    org.junit.Assert.assertNotNull(longArray62);
    org.junit.Assert.assertNotNull(longArray66);
    org.junit.Assert.assertTrue("'" + boolean67 + "' != '"+ false+ "'",boolean67 == false);
    org.junit.Assert.assertTrue("'" + long68 + "' != '"+ 35L+ "'",long68 == 35L);
    org.junit.Assert.assertTrue("'" + long69 + "' != '"+ 35L+ "'",long69 == 35L);
    org.junit.Assert.assertTrue("'" + long70 + "' != '"+ 35L+ "'",long70 == 35L);
    org.junit.Assert.assertTrue("'" + boolean71 + "' != '"+ true+ "'",boolean71 == true);
    org.junit.Assert.assertTrue("'" + long72 + "' != '"+ 35L+ "'",long72 == 35L);
    org.junit.Assert.assertTrue("'" + long73 + "' != '"+ 35L+ "'",long73 == 35L);
    org.junit.Assert.assertTrue("'" + long74 + "' != '"+ 35L+ "'",long74 == 35L);
    org.junit.Assert.assertTrue("'" + long75 + "' != '"+ 35L+ "'",long75 == 35L);
    org.junit.Assert.assertTrue("'" + boolean76 + "' != '"+ false+ "'",boolean76 == false);
  }
  @Test public void test009() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test009#170");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test009");
    java.lang.String str2=org.apache.commons.lang.StringUtils.difference("  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa ","        aa        aa        aa        aA!ih");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "      aa        aa        aa        aA!ih"+ "'",str2.equals("      aa        aa        aa        aA!ih"));
  }
  @Test public void test010() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test010#178");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test010");
    java.lang.String str2=org.apache.commons.lang.StringUtils.stripEnd("H","aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "H"+ "'",str2.equals("H"));
  }
  @Test public void test011() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test011#186");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test011");
    java.lang.String str1=org.apache.commons.lang.StringUtils.stripToNull("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"+ "'",str1.equals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
  }
  @Test public void test012() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test012#194");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test012");
    boolean boolean1=org.apache.commons.lang.math.NumberUtils.isDigits("aaaaaaaaaaaaaaaaaaaa");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test013() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test013#202");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test013");
    float float2=org.apache.commons.lang.math.NumberUtils.toFloat("                        AAAAAAAAAAAAAAAAAAAA                                                        ",(float)155);
    org.junit.Assert.assertTrue("'" + float2 + "' != '"+ 155.0f+ "'",float2 == 155.0f);
  }
  @Test public void test014() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test014#210");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test014");
    float float3=org.apache.commons.lang.math.NumberUtils.max(155.0f,(float)41L,51.0f);
    org.junit.Assert.assertTrue("'" + float3 + "' != '"+ 155.0f+ "'",float3 == 155.0f);
  }
  @Test public void test015() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test015#218");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test015");
    java.util.Collection collection0=null;
    java.lang.String str2=org.apache.commons.lang.StringUtils.join(collection0,"Hi!                                ");
    org.junit.Assert.assertNull(str2);
  }
  @Test public void test016() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test016#227");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test016");
    long[] longArray4=new long[]{10L,35L,'#',1L};
    long long5=org.apache.commons.lang.math.NumberUtils.min(longArray4);
    long long6=org.apache.commons.lang.math.NumberUtils.max(longArray4);
    org.junit.Assert.assertNotNull(longArray4);
    org.junit.Assert.assertTrue("'" + long5 + "' != '"+ 1L+ "'",long5 == 1L);
    org.junit.Assert.assertTrue("'" + long6 + "' != '"+ 35L+ "'",long6 == 35L);
  }
  @Test public void test017() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test017#239");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test017");
    java.lang.String str1=org.apache.commons.lang.StringUtils.deleteSpaces("44444444444444444444444444444                                                HI");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "44444444444444444444444444444HI"+ "'",str1.equals("44444444444444444444444444444HI"));
  }
  @Test public void test018() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test018#247");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test018");
    java.lang.String str1=org.apache.commons.lang.StringUtils.clean("aahi!");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "aahi!"+ "'",str1.equals("aahi!"));
  }
  @Test public void test019() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test019#255");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test019");
    java.lang.String str1=org.apache.commons.lang.StringUtils.chompLast("#############################################################################          ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "#############################################################################          "+ "'",str1.equals("#############################################################################          "));
  }
  @Test public void test020() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test020#263");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test020");
    java.lang.String str1=org.apache.commons.lang.StringUtils.trimToEmpty("aAHI!");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "aAHI!"+ "'",str1.equals("aAHI!"));
  }
  @Test public void test021() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test021#271");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test021");
    java.lang.String str1=org.apache.commons.lang.StringUtils.stripToEmpty("                             aaaaaaaaa                                                                  ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "aaaaaaaaa"+ "'",str1.equals("aaaaaaaaa"));
  }
  @Test public void test022() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test022#279");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test022");
    java.lang.String str3=org.apache.commons.lang.StringUtils.leftPad("aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa",20,'a');
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa"+ "'",str3.equals("aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa"));
  }
  @Test public void test023() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test023#287");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test023");
    java.util.Iterator iterator0=null;
    java.lang.String str2=org.apache.commons.lang.StringUtils.join(iterator0,"      aa        aa        aa        aA!ih");
    org.junit.Assert.assertNull(str2);
  }
  @Test public void test024() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test024#296");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test024");
    java.lang.String str2=org.apache.commons.lang.StringUtils.chomp("a                                                HI!","44444444444444444444444        ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "a                                                HI!"+ "'",str2.equals("a                                                HI!"));
  }
  @Test public void test025() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test025#304");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test025");
    java.lang.String str4=org.apache.commons.lang.StringUtils.replace("AA                                  ","                        aaaaaaaaaaaaaaaaaaaa                                                        ","aA HI!",0);
    org.junit.Assert.assertTrue("'" + str4 + "' != '"+ "AA                                  "+ "'",str4.equals("AA                                  "));
  }
  @Test public void test026() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test026#312");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test026");
    java.lang.String str1=org.apache.commons.lang.StringUtils.chopNewline("########         A#########");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "########         A#########"+ "'",str1.equals("########         A#########"));
  }
  @Test public void test027() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test027#320");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test027");
    java.lang.String str1=org.apache.commons.lang.StringUtils.trimToEmpty("                                       AAAAAAAAA                 ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "AAAAAAAAA"+ "'",str1.equals("AAAAAAAAA"));
  }
  @Test public void test028() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test028#328");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test028");
    boolean boolean1=org.apache.commons.lang.StringUtils.isNumericSpace("AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test029() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test029#336");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test029");
    java.lang.String str1=org.apache.commons.lang.StringUtils.capitalise("!iaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "!iaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA"+ "'",str1.equals("!iaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA"));
  }
  @Test public void test030() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test030#344");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test030");
    double double3=org.apache.commons.lang.math.NumberUtils.max((double)82,(double)7L,(double)10);
    org.junit.Assert.assertTrue("'" + double3 + "' != '"+ 82.0d+ "'",double3 == 82.0d);
  }
  @Test public void test031() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test031#352");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test031");
    java.lang.String str1=org.apache.commons.lang.StringUtils.trimToEmpty("44444444444444444444444444444                                                HI!");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "44444444444444444444444444444                                                HI!"+ "'",str1.equals("44444444444444444444444444444                                                HI!"));
  }
  @Test public void test032() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test032#360");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test032");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAlpha("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test033() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test033#368");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test033");
    boolean boolean1=org.apache.commons.lang.StringUtils.isNumericSpace("                                                hi!");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test034() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test034#376");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test034");
    int int2=org.apache.commons.lang.math.NumberUtils.stringToInt("hi!   #################################################################################",(int)(byte)1);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 1+ "'",int2 == 1);
  }
  @Test public void test035() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test035#384");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test035");
    int int2=org.apache.commons.lang.StringUtils.indexOf("Hi!###################################A","");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 0+ "'",int2 == 0);
  }
  @Test public void test036() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test036#392");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test036");
    java.lang.String str2=org.apache.commons.lang.StringUtils.removeEnd("aaaaaaaaaaaaaaaaaaaaaaaaaa","aaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!        ...");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "aaaaaaaaaaaaaaaaaaaaaaaaaa"+ "'",str2.equals("aaaaaaaaaaaaaaaaaaaaaaaaaa"));
  }
  @Test public void test037() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test037#400");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test037");
    java.lang.String str1=org.apache.commons.lang.StringUtils.reverse("                                                                                                 a  a A                                                hi!                                                 a aaaaaaaaa                                                                                        a aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "aaaaaaaaa a                                                                                        aaaaaaaaa a                                                 !ih                                                A a  a                                                                                                 "+ "'",str1.equals("aaaaaaaaa a                                                                                        aaaaaaaaa a                                                 !ih                                                A a  a                                                                                                 "));
  }
  @Test public void test038() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test038#408");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test038");
    int int2=org.apache.commons.lang.math.NumberUtils.compare((float)156,0.0f);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 1+ "'",int2 == 1);
  }
  @Test public void test039() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test039#416");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test039");
    int int2=org.apache.commons.lang.math.NumberUtils.compare(99.0f,(float)(short)100);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test040() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test040#424");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test040");
    try {
      java.lang.Integer int1=org.apache.commons.lang.math.NumberUtils.createInteger("444444444444444444444444444444444444444444444...");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"444444444444444444444444444444444444444444444...\"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test041() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test041#435");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test041");
    java.lang.String str1=org.apache.commons.lang.StringUtils.stripToEmpty("aaaaaaaaa                                       ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "aaaaaaaaa"+ "'",str1.equals("aaaaaaaaa"));
  }
  @Test public void test042() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test042#443");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test042");
    double double1=org.apache.commons.lang.math.NumberUtils.toDouble("########         A#########");
    org.junit.Assert.assertTrue("'" + double1 + "' != '"+ 0.0d+ "'",double1 == 0.0d);
  }
  @Test public void test043() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test043#451");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test043");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAlphanumeric("iaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaAiaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaAiaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaAiaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaAiaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaAiaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaAiaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaAiaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaAiaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaAiaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test044() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test044#459");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test044");
    try {
      java.lang.String str4=org.apache.commons.lang.StringUtils.overlayString("","##a",155,104);
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 155");
    }
 catch (    java.lang.StringIndexOutOfBoundsException e) {
    }
  }
  @Test public void test045() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test045#470");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test045");
    int int3=org.apache.commons.lang.StringUtils.indexOf("Hi!###################################A",'a',(int)(short)10);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test046() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test046#478");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test046");
    float float3=org.apache.commons.lang.math.NumberUtils.min(51.0f,(float)20,(float)54);
    org.junit.Assert.assertTrue("'" + float3 + "' != '"+ 20.0f+ "'",float3 == 20.0f);
  }
  @Test public void test047() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test047#486");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test047");
    int int2=org.apache.commons.lang.StringUtils.indexOfAny(".                             Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaa","A                                                hi!                                                 ");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 1+ "'",int2 == 1);
  }
  @Test public void test048() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test048#494");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test048");
    java.lang.String str1=org.apache.commons.lang.StringUtils.capitaliseAllWords("            hi!            ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "            Hi!            "+ "'",str1.equals("            Hi!            "));
  }
  @Test public void test049() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test049#502");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test049");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.splitByWholeSeparator("           hi!            ","                         I!                         ");
    org.junit.Assert.assertNotNull(strArray2);
  }
  @Test public void test050() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test050#510");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test050");
    boolean boolean2=org.apache.commons.lang.StringUtils.containsNone("                                                                                                     ... !ih","AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAI!");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test051() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test051#518");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test051");
    java.lang.String str1=org.apache.commons.lang.StringUtils.capitalise("###                     aaaaaaaaa                  A         A         A         A         A         A         A         A         A         A                      ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "###                     aaaaaaaaa                  A         A         A         A         A         A         A         A         A         A                      "+ "'",str1.equals("###                     aaaaaaaaa                  A         A         A         A         A         A         A         A         A         A                      "));
  }
  @Test public void test052() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test052#526");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test052");
    int int3=org.apache.commons.lang.math.NumberUtils.min(93,13,(int)(byte)-1);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test053() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test053#534");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test053");
    java.lang.String str1=org.apache.commons.lang.StringUtils.trimToEmpty(".                             Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaa");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ ".                             Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaa"+ "'",str1.equals(".                             Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaa"));
  }
  @Test public void test054() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test054#542");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test054");
    java.lang.String str1=org.apache.commons.lang.StringUtils.capitalise("a                                                hi!                                                 ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "A                                                hi!                                                 "+ "'",str1.equals("A                                                hi!                                                 "));
  }
  @Test public void test055() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test055#550");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test055");
    int int2=org.apache.commons.lang.StringUtils.indexOf("                         i!                         ",'#');
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test056() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test056#558");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test056");
    java.lang.String[] strArray3=org.apache.commons.lang.StringUtils.splitByWholeSeparator("Hi!"," ");
    java.lang.String str5=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray3,' ');
    java.lang.Class<?> wildcardClass6=strArray3.getClass();
    int int7=org.apache.commons.lang.StringUtils.lastIndexOfAny("A",strArray3);
    java.lang.String[] strArray8=org.apache.commons.lang.StringUtils.stripAll(strArray3);
    java.lang.String str9=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray3);
    java.lang.String str10=org.apache.commons.lang.StringUtils.concatenate((java.lang.Object[])strArray3);
    try {
      java.lang.String str14=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray3,'4',0,24);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
    }
 catch (    java.lang.ArrayIndexOutOfBoundsException e) {
    }
    org.junit.Assert.assertNotNull(strArray3);
    org.junit.Assert.assertTrue("'" + str5 + "' != '"+ "Hi!"+ "'",str5.equals("Hi!"));
    org.junit.Assert.assertNotNull(wildcardClass6);
    org.junit.Assert.assertTrue("'" + int7 + "' != '"+ (-1)+ "'",int7 == (-1));
    org.junit.Assert.assertNotNull(strArray8);
    org.junit.Assert.assertTrue("'" + str9 + "' != '"+ "Hi!"+ "'",str9.equals("Hi!"));
    org.junit.Assert.assertTrue("'" + str10 + "' != '"+ "Hi!"+ "'",str10.equals("Hi!"));
  }
  @Test public void test057() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test057#583");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test057");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAsciiPrintable("                                              hi!");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test058() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test058#591");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test058");
    java.lang.String str1=org.apache.commons.lang.StringUtils.escape("                aaaaaaaaa                  ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "                aaaaaaaaa                  "+ "'",str1.equals("                aaaaaaaaa                  "));
  }
  @Test public void test059() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test059#599");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test059");
    java.lang.String str3=org.apache.commons.lang.StringUtils.rightPad("                                                                                                    ",(int)(byte)10,"                                    AAAAAAAAAAAAAAAAAAAA  aAAAAAAAA                                       HI!                                                 ");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "                                                                                                    "+ "'",str3.equals("                                                                                                    "));
  }
  @Test public void test060() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test060#607");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test060");
    int int3=org.apache.commons.lang.StringUtils.lastIndexOf("                                                                                        ",'4',9);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test061() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test061#615");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test061");
    double double3=org.apache.commons.lang.math.NumberUtils.max((double)98,97.0d,(double)891.0f);
    org.junit.Assert.assertTrue("'" + double3 + "' != '"+ 891.0d+ "'",double3 == 891.0d);
  }
  @Test public void test062() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test062#623");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test062");
    boolean boolean1=org.apache.commons.lang.StringUtils.isNumericSpace("4444444hI AAAAAAAAA                                                                                        ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test063() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test063#631");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test063");
    java.lang.String str1=org.apache.commons.lang.StringUtils.trimToEmpty("4444444hI AAAAAAAAA");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "4444444hI AAAAAAAAA"+ "'",str1.equals("4444444hI AAAAAAAAA"));
  }
  @Test public void test064() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test064#639");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test064");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAsciiPrintable("Hi!   #######################################################################################       A");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test065() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test065#647");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test065");
    try {
      java.lang.Float float1=org.apache.commons.lang.math.NumberUtils.createFloat("4444444444444444444444444444444444                            ...");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4444444444444444444444444444444444                            ...\"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test066() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test066#658");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test066");
    int int2=org.apache.commons.lang.StringUtils.indexOfDifference("aaaaaaaaa","########         A#########");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 0+ "'",int2 == 0);
  }
  @Test public void test067() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test067#666");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test067");
    java.lang.String[] strArray3=org.apache.commons.lang.StringUtils.split("    !I       A         A         A         A         A         A         A         A         A         A","aaaaaaaaa                                       hi!");
    int int4=org.apache.commons.lang.StringUtils.indexOfAny("aaaaa",strArray3);
    org.junit.Assert.assertNotNull(strArray3);
    org.junit.Assert.assertTrue("'" + int4 + "' != '"+ (-1)+ "'",int4 == (-1));
  }
  @Test public void test068() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test068#676");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test068");
    java.lang.String str2=org.apache.commons.lang.StringUtils.center("                         HI!",0);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                         HI!"+ "'",str2.equals("                         HI!"));
  }
  @Test public void test069() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test069#684");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test069");
    int int2=org.apache.commons.lang.math.NumberUtils.compare((double)29L,(double)24L);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 1+ "'",int2 == 1);
  }
  @Test public void test070() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test070#692");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test070");
    java.lang.String[] strArray4=org.apache.commons.lang.StringUtils.split("                                ","                                                              ",2);
    int int5=org.apache.commons.lang.StringUtils.lastIndexOfAny("A                                                HI!",strArray4);
    org.junit.Assert.assertNotNull(strArray4);
    org.junit.Assert.assertTrue("'" + int5 + "' != '"+ (-1)+ "'",int5 == (-1));
  }
  @Test public void test071() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test071#702");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test071");
    boolean boolean1=org.apache.commons.lang.StringUtils.isWhitespace("                                                                                   aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test072() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test072#710");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test072");
    int int3=org.apache.commons.lang.StringUtils.lastIndexOf("A########                          ","hi!                         ...",(int)(short)10);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test073() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test073#718");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test073");
    java.lang.String str3=org.apache.commons.lang.StringUtils.replaceChars("AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa","aaaaaaaaai!   ","aaaaaaaaaaaaaaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa"+ "'",str3.equals("AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa"));
  }
  @Test public void test074() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test074#726");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test074");
    java.lang.String str3=org.apache.commons.lang.StringUtils.mid("",37,42);
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ ""+ "'",str3.equals(""));
  }
  @Test public void test075() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test075#734");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test075");
    int int1=org.apache.commons.lang.math.NumberUtils.toInt("                aaaaaaaaa                  ");
    org.junit.Assert.assertTrue("'" + int1 + "' != '"+ 0+ "'",int1 == 0);
  }
  @Test public void test076() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test076#742");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test076");
    int int3=org.apache.commons.lang.math.NumberUtils.max(77,36,77);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ 77+ "'",int3 == 77);
  }
  @Test public void test077() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test077#750");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test077");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.splitByWholeSeparator("aaaaaaaaa                                       ","hI!   #######################################################################################       a");
    org.junit.Assert.assertNotNull(strArray2);
  }
  @Test public void test078() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test078#758");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test078");
    java.lang.String str2=org.apache.commons.lang.StringUtils.defaultString("                                                 !ih                                                ","aaaaaaa                                                    aaaaaaaaaaaaaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                                                 !ih                                                "+ "'",str2.equals("                                                 !ih                                                "));
  }
  @Test public void test079() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test079#766");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test079");
    java.lang.String str1=org.apache.commons.lang.StringUtils.deleteWhitespace("!IAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "!IAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"+ "'",str1.equals("!IAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"));
  }
  @Test public void test080() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test080#774");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test080");
    java.lang.String str3=org.apache.commons.lang.StringUtils.replaceOnce("Aaaaaaaaa","Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa","aaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "Aaaaaaaaa"+ "'",str3.equals("Aaaaaaaaa"));
  }
  @Test public void test081() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test081#782");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test081");
    java.lang.String[] strArray1=null;
    int int2=org.apache.commons.lang.StringUtils.lastIndexOfAny("4",strArray1);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test082() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test082#791");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test082");
    boolean boolean1=org.apache.commons.lang.StringUtils.isNotBlank(" a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia           ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test083() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test083#799");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test083");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.split("  ################################","aAHI!");
    java.lang.String str3=org.apache.commons.lang.StringUtils.concatenate((java.lang.Object[])strArray2);
    org.junit.Assert.assertNotNull(strArray2);
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "  ################################"+ "'",str3.equals("  ################################"));
  }
  @Test public void test084() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test084#809");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test084");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringBetween("...4444444444444444444444444444444...","###                                                                                       aaaaaaaaa         ");
    org.junit.Assert.assertNull(str2);
  }
  @Test public void test085() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test085#817");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test085");
    java.lang.String str3=org.apache.commons.lang.StringUtils.center("    !I       A         A         A         A         A         A         A         A         A         A",36,"hI!   #######################################################################################       a");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "    !I       A         A         A         A         A         A         A         A         A         A"+ "'",str3.equals("    !I       A         A         A         A         A         A         A         A         A         A"));
  }
  @Test public void test086() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test086#825");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test086");
    double double2=org.apache.commons.lang.math.NumberUtils.toDouble("!i aaaaaaaaa!i aaaaaaaaa!i aaaaaaaaa!i aaaaaaaaa!i aaaaaaaaaaaaaaaaaa                          !i aaaaaaaaa!i aaaaaaaaa!i aaaaaaaaa!i aaaaaaaaa!i aaaaaaaaa!",(double)(byte)-1);
    org.junit.Assert.assertTrue("'" + double2 + "' != '"+ (-1.0d)+ "'",double2 == (-1.0d));
  }
  @Test public void test087() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test087#833");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test087");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringBeforeLast("aaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!                                aaaaaaaaaaaaaaaaaaaaaaaaaaaaa","aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "aaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!                                aaaaaaaaaaaaaaaaaaaaaaaaaaaaa"+ "'",str2.equals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!                                aaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
  }
  @Test public void test088() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test088#841");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test088");
    java.lang.String str2=org.apache.commons.lang.StringUtils.center("                                                                                                                                                                     ",104);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                                                                                                                                                                     "+ "'",str2.equals("                                                                                                                                                                     "));
  }
  @Test public void test089() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test089#849");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test089");
    long long1=org.apache.commons.lang.math.NumberUtils.toLong("                                    aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa                                       hi!                                                 ");
    org.junit.Assert.assertTrue("'" + long1 + "' != '"+ 0L+ "'",long1 == 0L);
  }
  @Test public void test090() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test090#857");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test090");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAsciiPrintable("    a     ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test091() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test091#865");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test091");
    byte[] byteArray0=null;
    byte[] byteArray4=new byte[]{(byte)100,(byte)0,(byte)100};
    byte[] byteArray7=new byte[]{(byte)-1,(byte)-1};
    boolean boolean8=org.apache.commons.lang.math.NumberUtils.equals(byteArray4,byteArray7);
    byte byte9=org.apache.commons.lang.math.NumberUtils.min(byteArray7);
    byte[] byteArray13=new byte[]{(byte)100,(byte)0,(byte)100};
    byte[] byteArray16=new byte[]{(byte)-1,(byte)-1};
    boolean boolean17=org.apache.commons.lang.math.NumberUtils.equals(byteArray13,byteArray16);
    byte byte18=org.apache.commons.lang.math.NumberUtils.min(byteArray16);
    boolean boolean19=org.apache.commons.lang.math.NumberUtils.equals(byteArray7,byteArray16);
    byte[] byteArray20=null;
    boolean boolean21=org.apache.commons.lang.math.NumberUtils.equals(byteArray16,byteArray20);
    byte byte22=org.apache.commons.lang.math.NumberUtils.min(byteArray16);
    byte byte23=org.apache.commons.lang.math.NumberUtils.max(byteArray16);
    byte byte24=org.apache.commons.lang.math.NumberUtils.max(byteArray16);
    boolean boolean25=org.apache.commons.lang.math.NumberUtils.equals(byteArray0,byteArray16);
    org.junit.Assert.assertNotNull(byteArray4);
    org.junit.Assert.assertNotNull(byteArray7);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '"+ false+ "'",boolean8 == false);
    org.junit.Assert.assertTrue("'" + byte9 + "' != '"+ (byte)-1+ "'",byte9 == (byte)-1);
    org.junit.Assert.assertNotNull(byteArray13);
    org.junit.Assert.assertNotNull(byteArray16);
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '"+ false+ "'",boolean17 == false);
    org.junit.Assert.assertTrue("'" + byte18 + "' != '"+ (byte)-1+ "'",byte18 == (byte)-1);
    org.junit.Assert.assertTrue("'" + boolean19 + "' != '"+ true+ "'",boolean19 == true);
    org.junit.Assert.assertTrue("'" + boolean21 + "' != '"+ false+ "'",boolean21 == false);
    org.junit.Assert.assertTrue("'" + byte22 + "' != '"+ (byte)-1+ "'",byte22 == (byte)-1);
    org.junit.Assert.assertTrue("'" + byte23 + "' != '"+ (byte)-1+ "'",byte23 == (byte)-1);
    org.junit.Assert.assertTrue("'" + byte24 + "' != '"+ (byte)-1+ "'",byte24 == (byte)-1);
    org.junit.Assert.assertTrue("'" + boolean25 + "' != '"+ false+ "'",boolean25 == false);
  }
  @Test public void test092() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test092#901");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test092");
    java.lang.String str2=org.apache.commons.lang.StringUtils.left("           4            ",63);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "           4            "+ "'",str2.equals("           4            "));
  }
  @Test public void test093() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test093#909");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test093");
    java.lang.String str3=org.apache.commons.lang.StringUtils.replaceOnce("                   ","                     "," AAAAAAa a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a ");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "                   "+ "'",str3.equals("                   "));
  }
  @Test public void test094() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test094#917");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test094");
    long long1=org.apache.commons.lang.math.NumberUtils.toLong("   #################...   ");
    org.junit.Assert.assertTrue("'" + long1 + "' != '"+ 0L+ "'",long1 == 0L);
  }
  @Test public void test095() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test095#925");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test095");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringAfterLast("                                    aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa                                       hi!                                                 ","4444444hI!AAAAAAAAA                                                                                        ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test096() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test096#933");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test096");
    try {
      java.lang.Double double1=org.apache.commons.lang.math.NumberUtils.createDouble("Aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa                                                hi!aaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa ");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"Aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa                                                hi!aaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa\"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test097() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test097#944");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test097");
    boolean boolean1=org.apache.commons.lang.math.NumberUtils.isDigits("aaaaaaaaAaa");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test098() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test098#952");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test098");
    java.lang.String str2=org.apache.commons.lang.StringUtils.strip("                         I!                         ","                                                                                                                  HI!");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test099() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test099#960");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test099");
    java.lang.String str2=org.apache.commons.lang.StringUtils.leftPad("444444444444444444444444444444444444444444444          444444444444444444444444444444444444",34);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "444444444444444444444444444444444444444444444          444444444444444444444444444444444444"+ "'",str2.equals("444444444444444444444444444444444444444444444          444444444444444444444444444444444444"));
  }
  @Test public void test100() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test100#968");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test100");
    java.lang.String str3=org.apache.commons.lang.StringUtils.leftPad("aaaaaaaaaaaaaaaaaaaa",88,"aaa ");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "aaa aaa aaa aaa aaa aaa aaa aaa aaa aaa aaa aaa aaa aaa aaa aaa aaa aaaaaaaaaaaaaaaaaaaa"+ "'",str3.equals("aaa aaa aaa aaa aaa aaa aaa aaa aaa aaa aaa aaa aaa aaa aaa aaa aaa aaaaaaaaaaaaaaaaaaaa"));
  }
  @Test public void test101() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test101#976");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test101");
    int int2=org.apache.commons.lang.math.NumberUtils.compare((float)63,(float)134);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test102() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test102#984");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test102");
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
    boolean boolean24=org.apache.commons.lang.math.NumberUtils.equals(doubleArray7,doubleArray21);
    double double25=org.apache.commons.lang.math.NumberUtils.min(doubleArray21);
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
    org.junit.Assert.assertTrue("'" + boolean24 + "' != '"+ false+ "'",boolean24 == false);
    org.junit.Assert.assertTrue("'" + double25 + "' != '"+ (-1.0d)+ "'",double25 == (-1.0d));
  }
  @Test public void test103() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test103#1018");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test103");
    java.lang.String[] strArray1=org.apache.commons.lang.StringUtils.splitPreserveAllTokens("aA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA");
    org.junit.Assert.assertNotNull(strArray1);
  }
  @Test public void test104() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test104#1026");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test104");
    java.lang.String str1=org.apache.commons.lang.StringUtils.chopNewline("...                    ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "...                    "+ "'",str1.equals("...                    "));
  }
  @Test public void test105() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test105#1034");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test105");
    char[] charArray12=new char[]{'#','4','#','#',' '};
    int int13=org.apache.commons.lang.StringUtils.indexOfAnyBut("Aaaaaaaaa ",charArray12);
    boolean boolean14=org.apache.commons.lang.StringUtils.containsNone("",charArray12);
    boolean boolean15=org.apache.commons.lang.StringUtils.containsOnly("aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa ",charArray12);
    int int16=org.apache.commons.lang.StringUtils.indexOfAnyBut("                             hi!                                   A                             ",charArray12);
    boolean boolean17=org.apache.commons.lang.StringUtils.containsNone("h",charArray12);
    boolean boolean18=org.apache.commons.lang.StringUtils.containsOnly("",charArray12);
    int int19=org.apache.commons.lang.StringUtils.indexOfAnyBut("Hi!",charArray12);
    org.junit.Assert.assertNotNull(charArray12);
    org.junit.Assert.assertTrue("'" + int13 + "' != '"+ 0+ "'",int13 == 0);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '"+ true+ "'",boolean14 == true);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '"+ false+ "'",boolean15 == false);
    org.junit.Assert.assertTrue("'" + int16 + "' != '"+ 29+ "'",int16 == 29);
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '"+ true+ "'",boolean17 == true);
    org.junit.Assert.assertTrue("'" + boolean18 + "' != '"+ true+ "'",boolean18 == true);
    org.junit.Assert.assertTrue("'" + int19 + "' != '"+ 0+ "'",int19 == 0);
  }
  @Test public void test106() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test106#1056");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test106");
    int int3=org.apache.commons.lang.StringUtils.indexOf("4444444444444          444444444444444444444444444444444444","AAAAAAAAA",12);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test107() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test107#1064");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test107");
    double double2=org.apache.commons.lang.math.NumberUtils.toDouble("Aa hi!Aa hi!Aa hi!Aa ...",(double)100);
    org.junit.Assert.assertTrue("'" + double2 + "' != '"+ 100.0d+ "'",double2 == 100.0d);
  }
  @Test public void test108() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test108#1072");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test108");
    java.lang.String[] strArray1=org.apache.commons.lang.StringUtils.splitPreserveAllTokens("aaaaaaaaa i!            ");
    org.junit.Assert.assertNotNull(strArray1);
  }
  @Test public void test109() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test109#1080");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test109");
    int[] intArray2=new int[]{' ',1};
    int int3=org.apache.commons.lang.math.NumberUtils.max(intArray2);
    int int4=org.apache.commons.lang.math.NumberUtils.min(intArray2);
    int[] intArray7=new int[]{100,1};
    int[] intArray14=new int[]{(byte)-1,100,(short)0,100,'#',100};
    boolean boolean15=org.apache.commons.lang.math.NumberUtils.equals(intArray7,intArray14);
    int[] intArray18=new int[]{100,1};
    int[] intArray25=new int[]{(byte)-1,100,(short)0,100,'#',100};
    boolean boolean26=org.apache.commons.lang.math.NumberUtils.equals(intArray18,intArray25);
    int[] intArray30=new int[]{'4',0,(byte)0};
    int[] intArray33=new int[]{100,1};
    int[] intArray40=new int[]{(byte)-1,100,(short)0,100,'#',100};
    boolean boolean41=org.apache.commons.lang.math.NumberUtils.equals(intArray33,intArray40);
    int[] intArray48=new int[]{'4',(short)100,(short)100,52,(byte)1,(short)100};
    boolean boolean49=org.apache.commons.lang.math.NumberUtils.equals(intArray40,intArray48);
    int int50=org.apache.commons.lang.math.NumberUtils.max(intArray48);
    boolean boolean51=org.apache.commons.lang.math.NumberUtils.equals(intArray30,intArray48);
    boolean boolean52=org.apache.commons.lang.math.NumberUtils.equals(intArray25,intArray48);
    boolean boolean53=org.apache.commons.lang.math.NumberUtils.equals(intArray7,intArray48);
    boolean boolean54=org.apache.commons.lang.math.NumberUtils.equals(intArray2,intArray7);
    int int55=org.apache.commons.lang.math.NumberUtils.max(intArray7);
    int int56=org.apache.commons.lang.math.NumberUtils.max(intArray7);
    org.junit.Assert.assertNotNull(intArray2);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ 32+ "'",int3 == 32);
    org.junit.Assert.assertTrue("'" + int4 + "' != '"+ 1+ "'",int4 == 1);
    org.junit.Assert.assertNotNull(intArray7);
    org.junit.Assert.assertNotNull(intArray14);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '"+ false+ "'",boolean15 == false);
    org.junit.Assert.assertNotNull(intArray18);
    org.junit.Assert.assertNotNull(intArray25);
    org.junit.Assert.assertTrue("'" + boolean26 + "' != '"+ false+ "'",boolean26 == false);
    org.junit.Assert.assertNotNull(intArray30);
    org.junit.Assert.assertNotNull(intArray33);
    org.junit.Assert.assertNotNull(intArray40);
    org.junit.Assert.assertTrue("'" + boolean41 + "' != '"+ false+ "'",boolean41 == false);
    org.junit.Assert.assertNotNull(intArray48);
    org.junit.Assert.assertTrue("'" + boolean49 + "' != '"+ false+ "'",boolean49 == false);
    org.junit.Assert.assertTrue("'" + int50 + "' != '"+ 100+ "'",int50 == 100);
    org.junit.Assert.assertTrue("'" + boolean51 + "' != '"+ false+ "'",boolean51 == false);
    org.junit.Assert.assertTrue("'" + boolean52 + "' != '"+ false+ "'",boolean52 == false);
    org.junit.Assert.assertTrue("'" + boolean53 + "' != '"+ false+ "'",boolean53 == false);
    org.junit.Assert.assertTrue("'" + boolean54 + "' != '"+ false+ "'",boolean54 == false);
    org.junit.Assert.assertTrue("'" + int55 + "' != '"+ 100+ "'",int55 == 100);
    org.junit.Assert.assertTrue("'" + int56 + "' != '"+ 100+ "'",int56 == 100);
  }
  @Test public void test110() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test110#1130");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test110");
    double[] doubleArray4=new double[]{(-1.0f),'#',1.0f,35L};
    double[] doubleArray5=new double[]{};
    boolean boolean6=org.apache.commons.lang.math.NumberUtils.equals(doubleArray4,doubleArray5);
    double[] doubleArray11=new double[]{(-1.0f),'#',1.0f,35L};
    double[] doubleArray12=new double[]{};
    boolean boolean13=org.apache.commons.lang.math.NumberUtils.equals(doubleArray11,doubleArray12);
    double[] doubleArray18=new double[]{(-1.0f),'#',1.0f,35L};
    double[] doubleArray19=new double[]{};
    boolean boolean20=org.apache.commons.lang.math.NumberUtils.equals(doubleArray18,doubleArray19);
    double[] doubleArray21=null;
    boolean boolean22=org.apache.commons.lang.math.NumberUtils.equals(doubleArray19,doubleArray21);
    boolean boolean23=org.apache.commons.lang.math.NumberUtils.equals(doubleArray12,doubleArray21);
    double[] doubleArray28=new double[]{(-1.0f),'#',1.0f,35L};
    double[] doubleArray29=new double[]{};
    boolean boolean30=org.apache.commons.lang.math.NumberUtils.equals(doubleArray28,doubleArray29);
    boolean boolean31=org.apache.commons.lang.math.NumberUtils.equals(doubleArray12,doubleArray28);
    double[] doubleArray32=null;
    double[] doubleArray37=new double[]{(-1.0f),'#',1.0f,35L};
    double[] doubleArray38=new double[]{};
    boolean boolean39=org.apache.commons.lang.math.NumberUtils.equals(doubleArray37,doubleArray38);
    boolean boolean40=org.apache.commons.lang.math.NumberUtils.equals(doubleArray32,doubleArray38);
    boolean boolean41=org.apache.commons.lang.math.NumberUtils.equals(doubleArray28,doubleArray32);
    double[] doubleArray46=new double[]{(-1.0f),'#',1.0f,35L};
    double[] doubleArray47=new double[]{};
    boolean boolean48=org.apache.commons.lang.math.NumberUtils.equals(doubleArray46,doubleArray47);
    double[] doubleArray49=new double[]{};
    double[] doubleArray54=new double[]{(-1.0f),'#',1.0f,35L};
    double[] doubleArray55=new double[]{};
    boolean boolean56=org.apache.commons.lang.math.NumberUtils.equals(doubleArray54,doubleArray55);
    boolean boolean57=org.apache.commons.lang.math.NumberUtils.equals(doubleArray49,doubleArray55);
    boolean boolean58=org.apache.commons.lang.math.NumberUtils.equals(doubleArray46,doubleArray49);
    double double59=org.apache.commons.lang.math.NumberUtils.max(doubleArray46);
    double[] doubleArray64=new double[]{(-1.0f),'#',1.0f,35L};
    double[] doubleArray65=new double[]{};
    boolean boolean66=org.apache.commons.lang.math.NumberUtils.equals(doubleArray64,doubleArray65);
    double[] doubleArray67=new double[]{};
    double[] doubleArray72=new double[]{(-1.0f),'#',1.0f,35L};
    double[] doubleArray73=new double[]{};
    boolean boolean74=org.apache.commons.lang.math.NumberUtils.equals(doubleArray72,doubleArray73);
    boolean boolean75=org.apache.commons.lang.math.NumberUtils.equals(doubleArray67,doubleArray73);
    boolean boolean76=org.apache.commons.lang.math.NumberUtils.equals(doubleArray64,doubleArray67);
    boolean boolean77=org.apache.commons.lang.math.NumberUtils.equals(doubleArray46,doubleArray64);
    boolean boolean78=org.apache.commons.lang.math.NumberUtils.equals(doubleArray28,doubleArray64);
    boolean boolean79=org.apache.commons.lang.math.NumberUtils.equals(doubleArray5,doubleArray28);
    double double80=org.apache.commons.lang.math.NumberUtils.max(doubleArray28);
    org.junit.Assert.assertNotNull(doubleArray4);
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '"+ false+ "'",boolean6 == false);
    org.junit.Assert.assertNotNull(doubleArray11);
    org.junit.Assert.assertNotNull(doubleArray12);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '"+ false+ "'",boolean13 == false);
    org.junit.Assert.assertNotNull(doubleArray18);
    org.junit.Assert.assertNotNull(doubleArray19);
    org.junit.Assert.assertTrue("'" + boolean20 + "' != '"+ false+ "'",boolean20 == false);
    org.junit.Assert.assertTrue("'" + boolean22 + "' != '"+ false+ "'",boolean22 == false);
    org.junit.Assert.assertTrue("'" + boolean23 + "' != '"+ false+ "'",boolean23 == false);
    org.junit.Assert.assertNotNull(doubleArray28);
    org.junit.Assert.assertNotNull(doubleArray29);
    org.junit.Assert.assertTrue("'" + boolean30 + "' != '"+ false+ "'",boolean30 == false);
    org.junit.Assert.assertTrue("'" + boolean31 + "' != '"+ false+ "'",boolean31 == false);
    org.junit.Assert.assertNotNull(doubleArray37);
    org.junit.Assert.assertNotNull(doubleArray38);
    org.junit.Assert.assertTrue("'" + boolean39 + "' != '"+ false+ "'",boolean39 == false);
    org.junit.Assert.assertTrue("'" + boolean40 + "' != '"+ false+ "'",boolean40 == false);
    org.junit.Assert.assertTrue("'" + boolean41 + "' != '"+ false+ "'",boolean41 == false);
    org.junit.Assert.assertNotNull(doubleArray46);
    org.junit.Assert.assertNotNull(doubleArray47);
    org.junit.Assert.assertTrue("'" + boolean48 + "' != '"+ false+ "'",boolean48 == false);
    org.junit.Assert.assertNotNull(doubleArray49);
    org.junit.Assert.assertNotNull(doubleArray54);
    org.junit.Assert.assertNotNull(doubleArray55);
    org.junit.Assert.assertTrue("'" + boolean56 + "' != '"+ false+ "'",boolean56 == false);
    org.junit.Assert.assertTrue("'" + boolean57 + "' != '"+ true+ "'",boolean57 == true);
    org.junit.Assert.assertTrue("'" + boolean58 + "' != '"+ false+ "'",boolean58 == false);
    org.junit.Assert.assertTrue("'" + double59 + "' != '"+ 35.0d+ "'",double59 == 35.0d);
    org.junit.Assert.assertNotNull(doubleArray64);
    org.junit.Assert.assertNotNull(doubleArray65);
    org.junit.Assert.assertTrue("'" + boolean66 + "' != '"+ false+ "'",boolean66 == false);
    org.junit.Assert.assertNotNull(doubleArray67);
    org.junit.Assert.assertNotNull(doubleArray72);
    org.junit.Assert.assertNotNull(doubleArray73);
    org.junit.Assert.assertTrue("'" + boolean74 + "' != '"+ false+ "'",boolean74 == false);
    org.junit.Assert.assertTrue("'" + boolean75 + "' != '"+ true+ "'",boolean75 == true);
    org.junit.Assert.assertTrue("'" + boolean76 + "' != '"+ false+ "'",boolean76 == false);
    org.junit.Assert.assertTrue("'" + boolean77 + "' != '"+ true+ "'",boolean77 == true);
    org.junit.Assert.assertTrue("'" + boolean78 + "' != '"+ true+ "'",boolean78 == true);
    org.junit.Assert.assertTrue("'" + boolean79 + "' != '"+ false+ "'",boolean79 == false);
    org.junit.Assert.assertTrue("'" + double80 + "' != '"+ 35.0d+ "'",double80 == 35.0d);
  }
  @Test public void test111() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test111#1224");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test111");
    java.lang.String[] strArray3=org.apache.commons.lang.StringUtils.split("Hi!   #######################################################################################       A","aaaaaaaaa                                       hi!",104);
    java.lang.String str4=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray3);
    org.junit.Assert.assertNotNull(strArray3);
    org.junit.Assert.assertTrue("'" + str4 + "' != '"+ "H#######################################################################################A"+ "'",str4.equals("H#######################################################################################A"));
  }
  @Test public void test112() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test112#1234");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test112");
    java.lang.String[] strArray1=org.apache.commons.lang.StringUtils.split("aaaaaaaaa                          44444444444444444444444444444444444444444444444444444444444");
    org.junit.Assert.assertNotNull(strArray1);
  }
  @Test public void test113() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test113#1242");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test113");
    boolean boolean1=org.apache.commons.lang.math.NumberUtils.isDigits("          ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test114() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test114#1250");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test114");
    float float3=org.apache.commons.lang.math.NumberUtils.max(0.0f,52.0f,32.0f);
    org.junit.Assert.assertTrue("'" + float3 + "' != '"+ 52.0f+ "'",float3 == 52.0f);
  }
  @Test public void test115() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test115#1258");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test115");
    java.lang.String str2=org.apache.commons.lang.StringUtils.left("",36);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test116() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test116#1266");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test116");
    java.lang.String str4=org.apache.commons.lang.StringUtils.overlay("                                                                    aaaaaaaaa i!","                                    AAAAAAAAAAAAAAAAAAAA  aAAAAAAAA                                       HI!                                                 ",(int)'4',52);
    org.junit.Assert.assertTrue("'" + str4 + "' != '"+ "                                                                                        AAAAAAAAAAAAAAAAAAAA  aAAAAAAAA                                       HI!                                                                 aaaaaaaaa i!"+ "'",str4.equals("                                                                                        AAAAAAAAAAAAAAAAAAAA  aAAAAAAAA                                       HI!                                                                 aaaaaaaaa i!"));
  }
  @Test public void test117() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test117#1274");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test117");
    int int3=org.apache.commons.lang.StringUtils.lastIndexOf("","    ...",100);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test118() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test118#1282");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test118");
    java.lang.String[] strArray1=org.apache.commons.lang.StringUtils.splitPreserveAllTokens("hi!");
    java.lang.String str3=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray1,'a');
    java.lang.String str5=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray1,'a');
    java.lang.String str7=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray1,"                                                4                                                ");
    java.lang.String str8=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray1);
    org.junit.Assert.assertNotNull(strArray1);
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "hi!"+ "'",str3.equals("hi!"));
    org.junit.Assert.assertTrue("'" + str5 + "' != '"+ "hi!"+ "'",str5.equals("hi!"));
    org.junit.Assert.assertTrue("'" + str7 + "' != '"+ "hi!"+ "'",str7.equals("hi!"));
    org.junit.Assert.assertTrue("'" + str8 + "' != '"+ "hi!"+ "'",str8.equals("hi!"));
  }
  @Test public void test119() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test119#1298");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test119");
    java.lang.String str1=org.apache.commons.lang.StringUtils.stripToEmpty("          #############################           HI!            ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "#############################           HI!"+ "'",str1.equals("#############################           HI!"));
  }
  @Test public void test120() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test120#1306");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test120");
    java.lang.String str2=org.apache.commons.lang.StringUtils.getPrechomp("                                           ","           HI!            ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test121() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test121#1314");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test121");
    java.lang.String[] strArray1=org.apache.commons.lang.StringUtils.split("AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa");
    java.lang.String str2=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray1);
    java.lang.String str3=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray1);
    org.junit.Assert.assertNotNull(strArray1);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa"+ "'",str2.equals("AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa"));
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa"+ "'",str3.equals("AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa"));
  }
  @Test public void test122() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test122#1326");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test122");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substring(" i!a                                          ",80);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test123() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test123#1334");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test123");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.splitByWholeSeparator("","           4            ");
    org.junit.Assert.assertNotNull(strArray2);
  }
  @Test public void test124() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test124#1342");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test124");
    int int2=org.apache.commons.lang.math.NumberUtils.compare((double)96,0.0d);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 1+ "'",int2 == 1);
  }
  @Test public void test125() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test125#1350");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test125");
    boolean boolean1=org.apache.commons.lang.StringUtils.isNumeric("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test126() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test126#1358");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test126");
    java.lang.String str2=org.apache.commons.lang.StringUtils.left("!iH                ",32);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "!iH                "+ "'",str2.equals("!iH                "));
  }
  @Test public void test127() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test127#1366");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test127");
    float float3=org.apache.commons.lang.math.NumberUtils.min((float)7L,(float)(-1L),(float)52);
    org.junit.Assert.assertTrue("'" + float3 + "' != '"+ (-1.0f)+ "'",float3 == (-1.0f));
  }
  @Test public void test128() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test128#1374");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test128");
    int int3=org.apache.commons.lang.StringUtils.ordinalIndexOf("IH","",28);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ 0+ "'",int3 == 0);
  }
  @Test public void test129() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test129#1382");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test129");
    try {
      java.lang.String str4=org.apache.commons.lang.StringUtils.overlayString("                                                                                                    ","",155,0);
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 155");
    }
 catch (    java.lang.StringIndexOutOfBoundsException e) {
    }
  }
  @Test public void test130() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test130#1393");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test130");
    double[] doubleArray4=new double[]{(-1.0f),'#',1.0f,35L};
    double[] doubleArray5=new double[]{};
    boolean boolean6=org.apache.commons.lang.math.NumberUtils.equals(doubleArray4,doubleArray5);
    double[] doubleArray7=new double[]{};
    double[] doubleArray12=new double[]{(-1.0f),'#',1.0f,35L};
    double[] doubleArray13=new double[]{};
    boolean boolean14=org.apache.commons.lang.math.NumberUtils.equals(doubleArray12,doubleArray13);
    boolean boolean15=org.apache.commons.lang.math.NumberUtils.equals(doubleArray7,doubleArray13);
    boolean boolean16=org.apache.commons.lang.math.NumberUtils.equals(doubleArray4,doubleArray7);
    double double17=org.apache.commons.lang.math.NumberUtils.max(doubleArray4);
    double[] doubleArray22=new double[]{(-1.0f),'#',1.0f,35L};
    double[] doubleArray23=new double[]{};
    boolean boolean24=org.apache.commons.lang.math.NumberUtils.equals(doubleArray22,doubleArray23);
    double[] doubleArray25=new double[]{};
    double[] doubleArray30=new double[]{(-1.0f),'#',1.0f,35L};
    double[] doubleArray31=new double[]{};
    boolean boolean32=org.apache.commons.lang.math.NumberUtils.equals(doubleArray30,doubleArray31);
    boolean boolean33=org.apache.commons.lang.math.NumberUtils.equals(doubleArray25,doubleArray31);
    boolean boolean34=org.apache.commons.lang.math.NumberUtils.equals(doubleArray22,doubleArray25);
    boolean boolean35=org.apache.commons.lang.math.NumberUtils.equals(doubleArray4,doubleArray22);
    double double36=org.apache.commons.lang.math.NumberUtils.min(doubleArray22);
    org.junit.Assert.assertNotNull(doubleArray4);
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '"+ false+ "'",boolean6 == false);
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertNotNull(doubleArray12);
    org.junit.Assert.assertNotNull(doubleArray13);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '"+ false+ "'",boolean14 == false);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '"+ true+ "'",boolean15 == true);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '"+ false+ "'",boolean16 == false);
    org.junit.Assert.assertTrue("'" + double17 + "' != '"+ 35.0d+ "'",double17 == 35.0d);
    org.junit.Assert.assertNotNull(doubleArray22);
    org.junit.Assert.assertNotNull(doubleArray23);
    org.junit.Assert.assertTrue("'" + boolean24 + "' != '"+ false+ "'",boolean24 == false);
    org.junit.Assert.assertNotNull(doubleArray25);
    org.junit.Assert.assertNotNull(doubleArray30);
    org.junit.Assert.assertNotNull(doubleArray31);
    org.junit.Assert.assertTrue("'" + boolean32 + "' != '"+ false+ "'",boolean32 == false);
    org.junit.Assert.assertTrue("'" + boolean33 + "' != '"+ true+ "'",boolean33 == true);
    org.junit.Assert.assertTrue("'" + boolean34 + "' != '"+ false+ "'",boolean34 == false);
    org.junit.Assert.assertTrue("'" + boolean35 + "' != '"+ true+ "'",boolean35 == true);
    org.junit.Assert.assertTrue("'" + double36 + "' != '"+ (-1.0d)+ "'",double36 == (-1.0d));
  }
  @Test public void test131() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test131#1441");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test131");
    int int2=org.apache.commons.lang.math.NumberUtils.stringToInt("                                                ",47);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 47+ "'",int2 == 47);
  }
  @Test public void test132() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test132#1449");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test132");
    try {
      java.lang.Integer int1=org.apache.commons.lang.math.NumberUtils.createInteger("44444444444444444444444444444                                                HI!");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"44444444444444444444444444444                                                HI!\"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test133() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test133#1460");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test133");
    java.lang.String str1=org.apache.commons.lang.StringUtils.defaultString("a");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "a"+ "'",str1.equals("a"));
  }
  @Test public void test134() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test134#1468");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test134");
    try {
      java.lang.Float float1=org.apache.commons.lang.math.NumberUtils.createFloat("AAAAAAAAAAAAAAAAAAAA  aAAAAAAAA                                       HI!");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"AAAAAAAAAAAAAAAAAAAA  aAAAAAAAA                                       HI!\"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test135() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test135#1479");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test135");
    java.lang.String str2=org.apache.commons.lang.StringUtils.removeStart("Aahi!","Aaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa A");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "Aahi!"+ "'",str2.equals("Aahi!"));
  }
  @Test public void test136() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test136#1487");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test136");
    java.lang.String str1=org.apache.commons.lang.StringUtils.strip("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"+ "'",str1.equals("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
  }
  @Test public void test137() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test137#1495");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test137");
    int int2=org.apache.commons.lang.StringUtils.indexOf("","AAAAAAAAAAAAAAAAAAAA##aAAAAAAAAAAAAAAAAAAAA##aA");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test138() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test138#1503");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test138");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAlphanumeric("4AHI!");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test139() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test139#1511");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test139");
    byte byte3=org.apache.commons.lang.math.NumberUtils.min((byte)0,(byte)1,(byte)-1);
    org.junit.Assert.assertTrue("'" + byte3 + "' != '"+ (byte)-1+ "'",byte3 == (byte)-1);
  }
  @Test public void test140() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test140#1519");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test140");
    try {
      java.lang.String str4=org.apache.commons.lang.StringUtils.overlayString("aaa ","    a     ",63,27);
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 63");
    }
 catch (    java.lang.StringIndexOutOfBoundsException e) {
    }
  }
  @Test public void test141() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test141#1530");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test141");
    long long3=org.apache.commons.lang.math.NumberUtils.max(54L,0L,(long)134);
    org.junit.Assert.assertTrue("'" + long3 + "' != '"+ 134L+ "'",long3 == 134L);
  }
  @Test public void test142() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test142#1538");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test142");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringBefore("                                                HI!","Hi!                                                                                             ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                                                HI!"+ "'",str2.equals("                                                HI!"));
  }
  @Test public void test143() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test143#1546");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test143");
    java.lang.String str2=org.apache.commons.lang.StringUtils.removeEnd("   aaaaaaaaa                                        ","hA         A         A        #############################aaaaaaaaaaaaaaaaaaaa##Aaaaaaaa#############################################################aaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaahA         A         A         A         A         A         A         A         A         A       i!##a##a#");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "   aaaaaaaaa                                        "+ "'",str2.equals("   aaaaaaaaa                                        "));
  }
  @Test public void test144() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test144#1554");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test144");
    boolean boolean1=org.apache.commons.lang.math.NumberUtils.isDigits("Aa hi!Aa hi!Aa hi!Aa ...");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test145() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test145#1562");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test145");
    java.lang.String str2=org.apache.commons.lang.StringUtils.remove("Aa hi!Aa hi!Aa hi!Aa hi!Aa hi!Aa hi!AAAAAAAAAA ","4444444Hi!aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "Aa hi!Aa hi!Aa hi!Aa hi!Aa hi!Aa hi!AAAAAAAAAA "+ "'",str2.equals("Aa hi!Aa hi!Aa hi!Aa hi!Aa hi!Aa hi!AAAAAAAAAA "));
  }
  @Test public void test146() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test146#1570");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test146");
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
    float float24=org.apache.commons.lang.math.NumberUtils.min(floatArray20);
    float[] floatArray31=new float[]{(-1.0f),0,96,94,(byte)-1,(-1)};
    float[] floatArray36=new float[]{10,(byte)1,1L,(byte)-1};
    float float37=org.apache.commons.lang.math.NumberUtils.max(floatArray36);
    boolean boolean38=org.apache.commons.lang.math.NumberUtils.equals(floatArray31,floatArray36);
    boolean boolean39=org.apache.commons.lang.math.NumberUtils.equals(floatArray20,floatArray31);
    float[] floatArray46=new float[]{10L,(short)10,0.0f,' ',(-1),'4'};
    float float47=org.apache.commons.lang.math.NumberUtils.min(floatArray46);
    float[] floatArray54=new float[]{(-1.0f),0,96,94,(byte)-1,(-1)};
    float[] floatArray59=new float[]{10,(byte)1,1L,(byte)-1};
    float float60=org.apache.commons.lang.math.NumberUtils.max(floatArray59);
    boolean boolean61=org.apache.commons.lang.math.NumberUtils.equals(floatArray54,floatArray59);
    float[] floatArray65=new float[]{(byte)-1,(-1.0f),(byte)100};
    float float66=org.apache.commons.lang.math.NumberUtils.max(floatArray65);
    float[] floatArray68=new float[]{(byte)1};
    float float69=org.apache.commons.lang.math.NumberUtils.max(floatArray68);
    boolean boolean70=org.apache.commons.lang.math.NumberUtils.equals(floatArray65,floatArray68);
    boolean boolean71=org.apache.commons.lang.math.NumberUtils.equals(floatArray59,floatArray68);
    boolean boolean72=org.apache.commons.lang.math.NumberUtils.equals(floatArray46,floatArray68);
    float float73=org.apache.commons.lang.math.NumberUtils.min(floatArray46);
    float float74=org.apache.commons.lang.math.NumberUtils.min(floatArray46);
    float float75=org.apache.commons.lang.math.NumberUtils.min(floatArray46);
    boolean boolean76=org.apache.commons.lang.math.NumberUtils.equals(floatArray20,floatArray46);
    float float77=org.apache.commons.lang.math.NumberUtils.max(floatArray46);
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
    org.junit.Assert.assertTrue("'" + float24 + "' != '"+ 1.0f+ "'",float24 == 1.0f);
    org.junit.Assert.assertNotNull(floatArray31);
    org.junit.Assert.assertNotNull(floatArray36);
    org.junit.Assert.assertTrue("'" + float37 + "' != '"+ 10.0f+ "'",float37 == 10.0f);
    org.junit.Assert.assertTrue("'" + boolean38 + "' != '"+ false+ "'",boolean38 == false);
    org.junit.Assert.assertTrue("'" + boolean39 + "' != '"+ false+ "'",boolean39 == false);
    org.junit.Assert.assertNotNull(floatArray46);
    org.junit.Assert.assertTrue("'" + float47 + "' != '"+ (-1.0f)+ "'",float47 == (-1.0f));
    org.junit.Assert.assertNotNull(floatArray54);
    org.junit.Assert.assertNotNull(floatArray59);
    org.junit.Assert.assertTrue("'" + float60 + "' != '"+ 10.0f+ "'",float60 == 10.0f);
    org.junit.Assert.assertTrue("'" + boolean61 + "' != '"+ false+ "'",boolean61 == false);
    org.junit.Assert.assertNotNull(floatArray65);
    org.junit.Assert.assertTrue("'" + float66 + "' != '"+ 100.0f+ "'",float66 == 100.0f);
    org.junit.Assert.assertNotNull(floatArray68);
    org.junit.Assert.assertTrue("'" + float69 + "' != '"+ 1.0f+ "'",float69 == 1.0f);
    org.junit.Assert.assertTrue("'" + boolean70 + "' != '"+ false+ "'",boolean70 == false);
    org.junit.Assert.assertTrue("'" + boolean71 + "' != '"+ false+ "'",boolean71 == false);
    org.junit.Assert.assertTrue("'" + boolean72 + "' != '"+ false+ "'",boolean72 == false);
    org.junit.Assert.assertTrue("'" + float73 + "' != '"+ (-1.0f)+ "'",float73 == (-1.0f));
    org.junit.Assert.assertTrue("'" + float74 + "' != '"+ (-1.0f)+ "'",float74 == (-1.0f));
    org.junit.Assert.assertTrue("'" + float75 + "' != '"+ (-1.0f)+ "'",float75 == (-1.0f));
    org.junit.Assert.assertTrue("'" + boolean76 + "' != '"+ false+ "'",boolean76 == false);
    org.junit.Assert.assertTrue("'" + float77 + "' != '"+ 52.0f+ "'",float77 == 52.0f);
  }
  @Test public void test147() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test147#1644");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test147");
    float[] floatArray6=new float[]{10L,(short)10,0.0f,' ',(-1),'4'};
    float float7=org.apache.commons.lang.math.NumberUtils.min(floatArray6);
    java.lang.Class<?> wildcardClass8=floatArray6.getClass();
    float[] floatArray12=new float[]{(byte)-1,(-1.0f),(byte)100};
    float float13=org.apache.commons.lang.math.NumberUtils.max(floatArray12);
    boolean boolean14=org.apache.commons.lang.math.NumberUtils.equals(floatArray6,floatArray12);
    float float15=org.apache.commons.lang.math.NumberUtils.min(floatArray6);
    float[] floatArray22=new float[]{(-1.0f),0,96,94,(byte)-1,(-1)};
    float[] floatArray27=new float[]{10,(byte)1,1L,(byte)-1};
    float float28=org.apache.commons.lang.math.NumberUtils.max(floatArray27);
    boolean boolean29=org.apache.commons.lang.math.NumberUtils.equals(floatArray22,floatArray27);
    float[] floatArray33=new float[]{(byte)-1,(-1.0f),(byte)100};
    float float34=org.apache.commons.lang.math.NumberUtils.max(floatArray33);
    float[] floatArray36=new float[]{(byte)1};
    float float37=org.apache.commons.lang.math.NumberUtils.max(floatArray36);
    boolean boolean38=org.apache.commons.lang.math.NumberUtils.equals(floatArray33,floatArray36);
    boolean boolean39=org.apache.commons.lang.math.NumberUtils.equals(floatArray27,floatArray36);
    float[] floatArray43=new float[]{(byte)-1,(-1.0f),(byte)100};
    float float44=org.apache.commons.lang.math.NumberUtils.max(floatArray43);
    float[] floatArray46=new float[]{(byte)1};
    float float47=org.apache.commons.lang.math.NumberUtils.max(floatArray46);
    boolean boolean48=org.apache.commons.lang.math.NumberUtils.equals(floatArray43,floatArray46);
    float float49=org.apache.commons.lang.math.NumberUtils.max(floatArray43);
    float[] floatArray50=null;
    boolean boolean51=org.apache.commons.lang.math.NumberUtils.equals(floatArray43,floatArray50);
    float float52=org.apache.commons.lang.math.NumberUtils.min(floatArray43);
    boolean boolean53=org.apache.commons.lang.math.NumberUtils.equals(floatArray36,floatArray43);
    float[] floatArray56=new float[]{48,4};
    float float57=org.apache.commons.lang.math.NumberUtils.max(floatArray56);
    boolean boolean58=org.apache.commons.lang.math.NumberUtils.equals(floatArray36,floatArray56);
    float[] floatArray63=new float[]{10,(byte)1,1L,(byte)-1};
    float float64=org.apache.commons.lang.math.NumberUtils.max(floatArray63);
    float float65=org.apache.commons.lang.math.NumberUtils.max(floatArray63);
    boolean boolean66=org.apache.commons.lang.math.NumberUtils.equals(floatArray56,floatArray63);
    boolean boolean67=org.apache.commons.lang.math.NumberUtils.equals(floatArray6,floatArray63);
    float float68=org.apache.commons.lang.math.NumberUtils.max(floatArray63);
    org.junit.Assert.assertNotNull(floatArray6);
    org.junit.Assert.assertTrue("'" + float7 + "' != '"+ (-1.0f)+ "'",float7 == (-1.0f));
    org.junit.Assert.assertNotNull(wildcardClass8);
    org.junit.Assert.assertNotNull(floatArray12);
    org.junit.Assert.assertTrue("'" + float13 + "' != '"+ 100.0f+ "'",float13 == 100.0f);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '"+ false+ "'",boolean14 == false);
    org.junit.Assert.assertTrue("'" + float15 + "' != '"+ (-1.0f)+ "'",float15 == (-1.0f));
    org.junit.Assert.assertNotNull(floatArray22);
    org.junit.Assert.assertNotNull(floatArray27);
    org.junit.Assert.assertTrue("'" + float28 + "' != '"+ 10.0f+ "'",float28 == 10.0f);
    org.junit.Assert.assertTrue("'" + boolean29 + "' != '"+ false+ "'",boolean29 == false);
    org.junit.Assert.assertNotNull(floatArray33);
    org.junit.Assert.assertTrue("'" + float34 + "' != '"+ 100.0f+ "'",float34 == 100.0f);
    org.junit.Assert.assertNotNull(floatArray36);
    org.junit.Assert.assertTrue("'" + float37 + "' != '"+ 1.0f+ "'",float37 == 1.0f);
    org.junit.Assert.assertTrue("'" + boolean38 + "' != '"+ false+ "'",boolean38 == false);
    org.junit.Assert.assertTrue("'" + boolean39 + "' != '"+ false+ "'",boolean39 == false);
    org.junit.Assert.assertNotNull(floatArray43);
    org.junit.Assert.assertTrue("'" + float44 + "' != '"+ 100.0f+ "'",float44 == 100.0f);
    org.junit.Assert.assertNotNull(floatArray46);
    org.junit.Assert.assertTrue("'" + float47 + "' != '"+ 1.0f+ "'",float47 == 1.0f);
    org.junit.Assert.assertTrue("'" + boolean48 + "' != '"+ false+ "'",boolean48 == false);
    org.junit.Assert.assertTrue("'" + float49 + "' != '"+ 100.0f+ "'",float49 == 100.0f);
    org.junit.Assert.assertTrue("'" + boolean51 + "' != '"+ false+ "'",boolean51 == false);
    org.junit.Assert.assertTrue("'" + float52 + "' != '"+ (-1.0f)+ "'",float52 == (-1.0f));
    org.junit.Assert.assertTrue("'" + boolean53 + "' != '"+ false+ "'",boolean53 == false);
    org.junit.Assert.assertNotNull(floatArray56);
    org.junit.Assert.assertTrue("'" + float57 + "' != '"+ 48.0f+ "'",float57 == 48.0f);
    org.junit.Assert.assertTrue("'" + boolean58 + "' != '"+ false+ "'",boolean58 == false);
    org.junit.Assert.assertNotNull(floatArray63);
    org.junit.Assert.assertTrue("'" + float64 + "' != '"+ 10.0f+ "'",float64 == 10.0f);
    org.junit.Assert.assertTrue("'" + float65 + "' != '"+ 10.0f+ "'",float65 == 10.0f);
    org.junit.Assert.assertTrue("'" + boolean66 + "' != '"+ false+ "'",boolean66 == false);
    org.junit.Assert.assertTrue("'" + boolean67 + "' != '"+ false+ "'",boolean67 == false);
    org.junit.Assert.assertTrue("'" + float68 + "' != '"+ 10.0f+ "'",float68 == 10.0f);
  }
  @Test public void test148() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test148#1721");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test148");
    java.lang.String str2=org.apache.commons.lang.StringUtils.prechomp("                                                                                                 a  a A                                                hi!                                                 a aaaaaaaaa                                                                                        a aaaaaaaaa","hi!");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                                                 a aaaaaaaaa                                                                                        a aaaaaaaaa"+ "'",str2.equals("                                                 a aaaaaaaaa                                                                                        a aaaaaaaaa"));
  }
  @Test public void test149() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test149#1729");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test149");
    try {
      java.lang.String str4=org.apache.commons.lang.StringUtils.overlayString("aaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa A","  4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444",12,117);
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -69");
    }
 catch (    java.lang.StringIndexOutOfBoundsException e) {
    }
  }
  @Test public void test150() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test150#1740");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test150");
    int int3=org.apache.commons.lang.StringUtils.indexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#########################HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa","... !IH...AAAAAAAAAAAAAAAAAAAA",(int)(byte)10);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test151() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test151#1748");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test151");
    java.lang.String str1=org.apache.commons.lang.StringUtils.trimToNull("                                                                                                ");
    org.junit.Assert.assertNull(str1);
  }
  @Test public void test152() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test152#1756");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test152");
    java.lang.String str1=org.apache.commons.lang.StringUtils.chopNewline("!IAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "!IAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA"+ "'",str1.equals("!IAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA"));
  }
  @Test public void test153() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test153#1764");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test153");
    java.lang.String str2=org.apache.commons.lang.StringUtils.reverseDelimited("...",'#');
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "..."+ "'",str2.equals("..."));
  }
  @Test public void test154() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test154#1772");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test154");
    long[] longArray1=new long[]{'#'};
    long[] longArray5=new long[]{97,(-1),' '};
    boolean boolean6=org.apache.commons.lang.math.NumberUtils.equals(longArray1,longArray5);
    long[] longArray8=new long[]{'#'};
    long[] longArray12=new long[]{97,(-1),' '};
    boolean boolean13=org.apache.commons.lang.math.NumberUtils.equals(longArray8,longArray12);
    long long14=org.apache.commons.lang.math.NumberUtils.max(longArray8);
    boolean boolean15=org.apache.commons.lang.math.NumberUtils.equals(longArray5,longArray8);
    long[] longArray17=new long[]{'#'};
    long[] longArray21=new long[]{97,(-1),' '};
    boolean boolean22=org.apache.commons.lang.math.NumberUtils.equals(longArray17,longArray21);
    long long23=org.apache.commons.lang.math.NumberUtils.max(longArray21);
    long long24=org.apache.commons.lang.math.NumberUtils.max(longArray21);
    long long25=org.apache.commons.lang.math.NumberUtils.min(longArray21);
    long long26=org.apache.commons.lang.math.NumberUtils.max(longArray21);
    long long27=org.apache.commons.lang.math.NumberUtils.max(longArray21);
    boolean boolean28=org.apache.commons.lang.math.NumberUtils.equals(longArray5,longArray21);
    long long29=org.apache.commons.lang.math.NumberUtils.min(longArray21);
    long long30=org.apache.commons.lang.math.NumberUtils.max(longArray21);
    org.junit.Assert.assertNotNull(longArray1);
    org.junit.Assert.assertNotNull(longArray5);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '"+ false+ "'",boolean6 == false);
    org.junit.Assert.assertNotNull(longArray8);
    org.junit.Assert.assertNotNull(longArray12);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '"+ false+ "'",boolean13 == false);
    org.junit.Assert.assertTrue("'" + long14 + "' != '"+ 35L+ "'",long14 == 35L);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '"+ false+ "'",boolean15 == false);
    org.junit.Assert.assertNotNull(longArray17);
    org.junit.Assert.assertNotNull(longArray21);
    org.junit.Assert.assertTrue("'" + boolean22 + "' != '"+ false+ "'",boolean22 == false);
    org.junit.Assert.assertTrue("'" + long23 + "' != '"+ 97L+ "'",long23 == 97L);
    org.junit.Assert.assertTrue("'" + long24 + "' != '"+ 97L+ "'",long24 == 97L);
    org.junit.Assert.assertTrue("'" + long25 + "' != '"+ (-1L)+ "'",long25 == (-1L));
    org.junit.Assert.assertTrue("'" + long26 + "' != '"+ 97L+ "'",long26 == 97L);
    org.junit.Assert.assertTrue("'" + long27 + "' != '"+ 97L+ "'",long27 == 97L);
    org.junit.Assert.assertTrue("'" + boolean28 + "' != '"+ true+ "'",boolean28 == true);
    org.junit.Assert.assertTrue("'" + long29 + "' != '"+ (-1L)+ "'",long29 == (-1L));
    org.junit.Assert.assertTrue("'" + long30 + "' != '"+ 97L+ "'",long30 == 97L);
  }
  @Test public void test155() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test155#1816");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test155");
    java.lang.String str3=org.apache.commons.lang.StringUtils.leftPad("4444444hI!AAAAAAAAA                                                                                        ",95,"44444444444444444444444444444                                                HI!");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "4444444hI!AAAAAAAAA                                                                                        "+ "'",str3.equals("4444444hI!AAAAAAAAA                                                                                        "));
  }
  @Test public void test156() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test156#1824");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test156");
    boolean boolean1=org.apache.commons.lang.math.NumberUtils.isDigits("a                                                hi!                                                 ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test157() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test157#1832");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test157");
    long long1=org.apache.commons.lang.math.NumberUtils.toLong("4                                                ");
    org.junit.Assert.assertTrue("'" + long1 + "' != '"+ 0L+ "'",long1 == 0L);
  }
  @Test public void test158() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test158#1840");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test158");
    java.lang.String str2=org.apache.commons.lang.StringUtils.defaultString("                             Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!","#########");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                             Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!"+ "'",str2.equals("                             Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!"));
  }
  @Test public void test159() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test159#1848");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test159");
    long long2=org.apache.commons.lang.math.NumberUtils.toLong("...        HI!",0L);
    org.junit.Assert.assertTrue("'" + long2 + "' != '"+ 0L+ "'",long2 == 0L);
  }
  @Test public void test160() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test160#1856");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test160");
    try {
      java.math.BigDecimal bigDecimal1=org.apache.commons.lang.math.NumberUtils.createBigDecimal("           ...hi! ...           aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test161() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test161#1867");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test161");
    int int3=org.apache.commons.lang.math.NumberUtils.min(54,0,48);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ 0+ "'",int3 == 0);
  }
  @Test public void test162() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test162#1875");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test162");
    java.lang.String str1=org.apache.commons.lang.StringUtils.chompLast("44444444444444444444444");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "44444444444444444444444"+ "'",str1.equals("44444444444444444444444"));
  }
  @Test public void test163() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test163#1883");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test163");
    int int2=org.apache.commons.lang.StringUtils.indexOfDifference("","4444444Hi!                     ");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 0+ "'",int2 == 0);
  }
  @Test public void test164() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test164#1891");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test164");
    boolean boolean1=org.apache.commons.lang.StringUtils.isEmpty("IH");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test165() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test165#1899");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test165");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringAfterLast("4444444444444444444444444444444444...","!ih aA44444444444444444444444         AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaa");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test166() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test166#1907");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test166");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.split("                         HI!","");
    org.junit.Assert.assertNotNull(strArray2);
  }
  @Test public void test167() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test167#1915");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test167");
    java.lang.String str2=org.apache.commons.lang.StringUtils.strip("...aaaa...","");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "...aaaa..."+ "'",str2.equals("...aaaa..."));
  }
  @Test public void test168() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test168#1923");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test168");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.splitByWholeSeparator("a                                                HI!                                                 ","aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#########################HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    org.junit.Assert.assertNotNull(strArray2);
  }
  @Test public void test169() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test169#1931");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test169");
    boolean boolean2=org.apache.commons.lang.StringUtils.contains("","44444444444444444444444444444444444444444444444444444444444444444444");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test170() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test170#1939");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test170");
    try {
      java.lang.Number number1=org.apache.commons.lang.math.NumberUtils.createNumber("AAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAA a");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: AAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAA a is not a valid number.");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test171() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test171#1950");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test171");
    java.lang.String str1=org.apache.commons.lang.StringUtils.uncapitalize("aaaa");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "aaaa"+ "'",str1.equals("aaaa"));
  }
  @Test public void test172() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test172#1958");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test172");
    java.lang.String str1=org.apache.commons.lang.StringUtils.stripToNull("AAAAAAAAAAAAAAAAAAAA");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "AAAAAAAAAAAAAAAAAAAA"+ "'",str1.equals("AAAAAAAAAAAAAAAAAAAA"));
  }
  @Test public void test173() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test173#1966");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test173");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substring("",99);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test174() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test174#1974");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test174");
    java.lang.String str2=org.apache.commons.lang.StringUtils.stripStart("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!","4444444hI!AAAAAAAAA");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!"+ "'",str2.equals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!"));
  }
  @Test public void test175() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test175#1982");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test175");
    java.lang.String str2=org.apache.commons.lang.StringUtils.abbreviate("aaaaaaaaAaaaaaaaaaaaaaaaa",95);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "aaaaaaaaAaaaaaaaaaaaaaaaa"+ "'",str2.equals("aaaaaaaaAaaaaaaaaaaaaaaaa"));
  }
  @Test public void test176() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test176#1990");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test176");
    java.lang.String str2=org.apache.commons.lang.StringUtils.remove("  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa ",' ');
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "AaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaa"+ "'",str2.equals("AaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaa"));
  }
  @Test public void test177() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test177#1998");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test177");
    int int2=org.apache.commons.lang.StringUtils.lastIndexOf("aAHI!","   ");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test178() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test178#2006");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test178");
    byte byte3=org.apache.commons.lang.math.NumberUtils.min((byte)1,(byte)10,(byte)100);
    org.junit.Assert.assertTrue("'" + byte3 + "' != '"+ (byte)1+ "'",byte3 == (byte)1);
  }
  @Test public void test179() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test179#2014");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test179");
    java.lang.String str3=org.apache.commons.lang.StringUtils.replace("A         A         A        ","aaaaaaaa","aaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "A         A         A        "+ "'",str3.equals("A         A         A        "));
  }
  @Test public void test180() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test180#2022");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test180");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAlphaSpace("    !i       a         a         a         a         a         a         a         a         a         a");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test181() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test181#2030");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test181");
    java.util.Iterator iterator0=null;
    java.lang.String str2=org.apache.commons.lang.StringUtils.join(iterator0,"IH");
    org.junit.Assert.assertNull(str2);
  }
  @Test public void test182() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test182#2039");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test182");
    try {
      java.lang.Integer int1=org.apache.commons.lang.math.NumberUtils.createInteger("44444444444444444444444444444444444444444444444444444444444444444444444444444");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"44444444444444444444444444444444444444444444444444444444444444444444444444444\"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test183() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test183#2050");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test183");
    java.lang.String str3=org.apache.commons.lang.StringUtils.replace("4444444Hi!","","aaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!                                aaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "4444444Hi!"+ "'",str3.equals("4444444Hi!"));
  }
  @Test public void test184() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test184#2058");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test184");
    java.lang.String str2=org.apache.commons.lang.StringUtils.removeEnd("","4444444Hi!aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test185() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test185#2066");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test185");
    java.lang.String str3=org.apache.commons.lang.StringUtils.getNestedString("a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a ","444444444444444444444444444444444444444444444          444444444444444444444444444444444444444444444","##########################A        A        A        A        ");
    org.junit.Assert.assertNull(str3);
  }
  @Test public void test186() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test186#2074");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test186");
    java.lang.String[] strArray3=org.apache.commons.lang.StringUtils.split("#############################################################################          ","                 ");
    java.lang.String[] strArray4=org.apache.commons.lang.StringUtils.stripAll(strArray3);
    java.lang.String[] strArray6=org.apache.commons.lang.StringUtils.stripAll(strArray4,"A         A         A         A         A         A         A         A         A         A       i!    ");
    int int7=org.apache.commons.lang.StringUtils.lastIndexOfAny("",strArray4);
    org.junit.Assert.assertNotNull(strArray3);
    org.junit.Assert.assertNotNull(strArray4);
    org.junit.Assert.assertNotNull(strArray6);
    org.junit.Assert.assertTrue("'" + int7 + "' != '"+ (-1)+ "'",int7 == (-1));
  }
  @Test public void test187() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test187#2088");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test187");
    java.lang.String[] strArray3=org.apache.commons.lang.StringUtils.splitByWholeSeparator("                                 ... !ih...aaaaaaaaaaaaaaaaaaaa                                ","                          #A",117);
    org.junit.Assert.assertNotNull(strArray3);
  }
  @Test public void test188() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test188#2096");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test188");
    java.lang.String str2=org.apache.commons.lang.StringUtils.defaultString("###                                                                                       aaaaaaaaa ","");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "###                                                                                       aaaaaaaaa "+ "'",str2.equals("###                                                                                       aaaaaaaaa "));
  }
  @Test public void test189() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test189#2104");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test189");
    int int2=org.apache.commons.lang.StringUtils.lastIndexOf("aa ",'a');
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 1+ "'",int2 == 1);
  }
  @Test public void test190() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test190#2112");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test190");
    java.lang.String[] strArray3=org.apache.commons.lang.StringUtils.splitPreserveAllTokens("hi","                                              hi",2);
    org.junit.Assert.assertNotNull(strArray3);
  }
  @Test public void test191() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test191#2120");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test191");
    java.lang.String str3=org.apache.commons.lang.StringUtils.center("                                                            AAAAAAAAA                                       ",87,'a');
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "                                                            AAAAAAAAA                                       "+ "'",str3.equals("                                                            AAAAAAAAA                                       "));
  }
  @Test public void test192() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test192#2128");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test192");
    boolean boolean1=org.apache.commons.lang.StringUtils.isNumeric("aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test193() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test193#2136");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test193");
    java.lang.String str3=org.apache.commons.lang.StringUtils.leftPad("aaaaaaaaa ",0,"##A");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "aaaaaaaaa "+ "'",str3.equals("aaaaaaaaa "));
  }
  @Test public void test194() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test194#2144");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test194");
    double[] doubleArray0=new double[]{};
    double[] doubleArray5=new double[]{(-1.0f),'#',1.0f,35L};
    double[] doubleArray6=new double[]{};
    boolean boolean7=org.apache.commons.lang.math.NumberUtils.equals(doubleArray5,doubleArray6);
    boolean boolean8=org.apache.commons.lang.math.NumberUtils.equals(doubleArray0,doubleArray6);
    double[] doubleArray13=new double[]{(-1.0f),'#',1.0f,35L};
    double[] doubleArray14=new double[]{};
    boolean boolean15=org.apache.commons.lang.math.NumberUtils.equals(doubleArray13,doubleArray14);
    double[] doubleArray20=new double[]{(-1.0f),'#',1.0f,35L};
    double[] doubleArray21=new double[]{};
    boolean boolean22=org.apache.commons.lang.math.NumberUtils.equals(doubleArray20,doubleArray21);
    double[] doubleArray27=new double[]{(-1.0f),'#',1.0f,35L};
    double[] doubleArray28=new double[]{};
    boolean boolean29=org.apache.commons.lang.math.NumberUtils.equals(doubleArray27,doubleArray28);
    double[] doubleArray30=null;
    boolean boolean31=org.apache.commons.lang.math.NumberUtils.equals(doubleArray28,doubleArray30);
    boolean boolean32=org.apache.commons.lang.math.NumberUtils.equals(doubleArray21,doubleArray30);
    double[] doubleArray37=new double[]{(-1.0f),'#',1.0f,35L};
    double[] doubleArray38=new double[]{};
    boolean boolean39=org.apache.commons.lang.math.NumberUtils.equals(doubleArray37,doubleArray38);
    boolean boolean40=org.apache.commons.lang.math.NumberUtils.equals(doubleArray21,doubleArray37);
    double[] doubleArray41=null;
    double[] doubleArray46=new double[]{(-1.0f),'#',1.0f,35L};
    double[] doubleArray47=new double[]{};
    boolean boolean48=org.apache.commons.lang.math.NumberUtils.equals(doubleArray46,doubleArray47);
    boolean boolean49=org.apache.commons.lang.math.NumberUtils.equals(doubleArray41,doubleArray47);
    boolean boolean50=org.apache.commons.lang.math.NumberUtils.equals(doubleArray37,doubleArray41);
    double[] doubleArray55=new double[]{(-1.0f),'#',1.0f,35L};
    double[] doubleArray56=new double[]{};
    boolean boolean57=org.apache.commons.lang.math.NumberUtils.equals(doubleArray55,doubleArray56);
    double[] doubleArray58=new double[]{};
    double[] doubleArray63=new double[]{(-1.0f),'#',1.0f,35L};
    double[] doubleArray64=new double[]{};
    boolean boolean65=org.apache.commons.lang.math.NumberUtils.equals(doubleArray63,doubleArray64);
    boolean boolean66=org.apache.commons.lang.math.NumberUtils.equals(doubleArray58,doubleArray64);
    boolean boolean67=org.apache.commons.lang.math.NumberUtils.equals(doubleArray55,doubleArray58);
    double double68=org.apache.commons.lang.math.NumberUtils.max(doubleArray55);
    double[] doubleArray73=new double[]{(-1.0f),'#',1.0f,35L};
    double[] doubleArray74=new double[]{};
    boolean boolean75=org.apache.commons.lang.math.NumberUtils.equals(doubleArray73,doubleArray74);
    double[] doubleArray76=new double[]{};
    double[] doubleArray81=new double[]{(-1.0f),'#',1.0f,35L};
    double[] doubleArray82=new double[]{};
    boolean boolean83=org.apache.commons.lang.math.NumberUtils.equals(doubleArray81,doubleArray82);
    boolean boolean84=org.apache.commons.lang.math.NumberUtils.equals(doubleArray76,doubleArray82);
    boolean boolean85=org.apache.commons.lang.math.NumberUtils.equals(doubleArray73,doubleArray76);
    boolean boolean86=org.apache.commons.lang.math.NumberUtils.equals(doubleArray55,doubleArray73);
    boolean boolean87=org.apache.commons.lang.math.NumberUtils.equals(doubleArray37,doubleArray73);
    double double88=org.apache.commons.lang.math.NumberUtils.min(doubleArray73);
    boolean boolean89=org.apache.commons.lang.math.NumberUtils.equals(doubleArray14,doubleArray73);
    boolean boolean90=org.apache.commons.lang.math.NumberUtils.equals(doubleArray6,doubleArray73);
    org.junit.Assert.assertNotNull(doubleArray0);
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '"+ false+ "'",boolean7 == false);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '"+ true+ "'",boolean8 == true);
    org.junit.Assert.assertNotNull(doubleArray13);
    org.junit.Assert.assertNotNull(doubleArray14);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '"+ false+ "'",boolean15 == false);
    org.junit.Assert.assertNotNull(doubleArray20);
    org.junit.Assert.assertNotNull(doubleArray21);
    org.junit.Assert.assertTrue("'" + boolean22 + "' != '"+ false+ "'",boolean22 == false);
    org.junit.Assert.assertNotNull(doubleArray27);
    org.junit.Assert.assertNotNull(doubleArray28);
    org.junit.Assert.assertTrue("'" + boolean29 + "' != '"+ false+ "'",boolean29 == false);
    org.junit.Assert.assertTrue("'" + boolean31 + "' != '"+ false+ "'",boolean31 == false);
    org.junit.Assert.assertTrue("'" + boolean32 + "' != '"+ false+ "'",boolean32 == false);
    org.junit.Assert.assertNotNull(doubleArray37);
    org.junit.Assert.assertNotNull(doubleArray38);
    org.junit.Assert.assertTrue("'" + boolean39 + "' != '"+ false+ "'",boolean39 == false);
    org.junit.Assert.assertTrue("'" + boolean40 + "' != '"+ false+ "'",boolean40 == false);
    org.junit.Assert.assertNotNull(doubleArray46);
    org.junit.Assert.assertNotNull(doubleArray47);
    org.junit.Assert.assertTrue("'" + boolean48 + "' != '"+ false+ "'",boolean48 == false);
    org.junit.Assert.assertTrue("'" + boolean49 + "' != '"+ false+ "'",boolean49 == false);
    org.junit.Assert.assertTrue("'" + boolean50 + "' != '"+ false+ "'",boolean50 == false);
    org.junit.Assert.assertNotNull(doubleArray55);
    org.junit.Assert.assertNotNull(doubleArray56);
    org.junit.Assert.assertTrue("'" + boolean57 + "' != '"+ false+ "'",boolean57 == false);
    org.junit.Assert.assertNotNull(doubleArray58);
    org.junit.Assert.assertNotNull(doubleArray63);
    org.junit.Assert.assertNotNull(doubleArray64);
    org.junit.Assert.assertTrue("'" + boolean65 + "' != '"+ false+ "'",boolean65 == false);
    org.junit.Assert.assertTrue("'" + boolean66 + "' != '"+ true+ "'",boolean66 == true);
    org.junit.Assert.assertTrue("'" + boolean67 + "' != '"+ false+ "'",boolean67 == false);
    org.junit.Assert.assertTrue("'" + double68 + "' != '"+ 35.0d+ "'",double68 == 35.0d);
    org.junit.Assert.assertNotNull(doubleArray73);
    org.junit.Assert.assertNotNull(doubleArray74);
    org.junit.Assert.assertTrue("'" + boolean75 + "' != '"+ false+ "'",boolean75 == false);
    org.junit.Assert.assertNotNull(doubleArray76);
    org.junit.Assert.assertNotNull(doubleArray81);
    org.junit.Assert.assertNotNull(doubleArray82);
    org.junit.Assert.assertTrue("'" + boolean83 + "' != '"+ false+ "'",boolean83 == false);
    org.junit.Assert.assertTrue("'" + boolean84 + "' != '"+ true+ "'",boolean84 == true);
    org.junit.Assert.assertTrue("'" + boolean85 + "' != '"+ false+ "'",boolean85 == false);
    org.junit.Assert.assertTrue("'" + boolean86 + "' != '"+ true+ "'",boolean86 == true);
    org.junit.Assert.assertTrue("'" + boolean87 + "' != '"+ true+ "'",boolean87 == true);
    org.junit.Assert.assertTrue("'" + double88 + "' != '"+ (-1.0d)+ "'",double88 == (-1.0d));
    org.junit.Assert.assertTrue("'" + boolean89 + "' != '"+ false+ "'",boolean89 == false);
    org.junit.Assert.assertTrue("'" + boolean90 + "' != '"+ false+ "'",boolean90 == false);
  }
  @Test public void test195() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test195#2250");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test195");
    java.lang.String str3=org.apache.commons.lang.StringUtils.mid("a ",(-1),51);
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "a "+ "'",str3.equals("a "));
  }
  @Test public void test196() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test196#2258");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test196");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAsciiPrintable("                 ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test197() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test197#2266");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test197");
    java.lang.String str2=org.apache.commons.lang.StringUtils.reverseDelimited("",'4');
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test198() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test198#2274");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test198");
    java.lang.String str1=org.apache.commons.lang.StringUtils.chomp("####################");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "####################"+ "'",str1.equals("####################"));
  }
  @Test public void test199() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test199#2282");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test199");
    long[] longArray1=new long[]{'#'};
    long[] longArray5=new long[]{97,(-1),' '};
    boolean boolean6=org.apache.commons.lang.math.NumberUtils.equals(longArray1,longArray5);
    long[] longArray8=new long[]{'#'};
    long[] longArray12=new long[]{97,(-1),' '};
    boolean boolean13=org.apache.commons.lang.math.NumberUtils.equals(longArray8,longArray12);
    long long14=org.apache.commons.lang.math.NumberUtils.max(longArray8);
    boolean boolean15=org.apache.commons.lang.math.NumberUtils.equals(longArray5,longArray8);
    long long16=org.apache.commons.lang.math.NumberUtils.min(longArray5);
    org.junit.Assert.assertNotNull(longArray1);
    org.junit.Assert.assertNotNull(longArray5);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '"+ false+ "'",boolean6 == false);
    org.junit.Assert.assertNotNull(longArray8);
    org.junit.Assert.assertNotNull(longArray12);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '"+ false+ "'",boolean13 == false);
    org.junit.Assert.assertTrue("'" + long14 + "' != '"+ 35L+ "'",long14 == 35L);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '"+ false+ "'",boolean15 == false);
    org.junit.Assert.assertTrue("'" + long16 + "' != '"+ (-1L)+ "'",long16 == (-1L));
  }
  @Test public void test200() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test200#2306");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test200");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAsciiPrintable("4444444...");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test201() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test201#2314");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test201");
    int int2=org.apache.commons.lang.math.NumberUtils.toInt("                                                              ",(int)' ');
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 32+ "'",int2 == 32);
  }
  @Test public void test202() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test202#2322");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test202");
    java.lang.String str2=org.apache.commons.lang.StringUtils.repeat("                                                ...                          ......                 ",13);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                                                ...                          ......                                                                 ...                          ......                                                                 ...                          ......                                                                 ...                          ......                                                                 ...                          ......                                                                 ...                          ......                                                                 ...                          ......                                                                 ...                          ......                                                                 ...                          ......                                                                 ...                          ......                                                                 ...                          ......                                                                 ...                          ......                                                                 ...                          ......                 "+ "'",str2.equals("                                                ...                          ......                                                                 ...                          ......                                                                 ...                          ......                                                                 ...                          ......                                                                 ...                          ......                                                                 ...                          ......                                                                 ...                          ......                                                                 ...                          ......                                                                 ...                          ......                                                                 ...                          ......                                                                 ...                          ......                                                                 ...                          ......                                                                 ...                          ......                 "));
  }
  @Test public void test203() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test203#2330");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test203");
    boolean boolean2=org.apache.commons.lang.StringUtils.contains("                                                4                                                ",' ');
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ true+ "'",boolean2 == true);
  }
  @Test public void test204() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test204#2338");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test204");
    java.lang.String str2=org.apache.commons.lang.StringUtils.leftPad("hi!                                                                                             ",0);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "hi!                                                                                             "+ "'",str2.equals("hi!                                                                                             "));
  }
  @Test public void test205() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test205#2346");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test205");
    java.lang.String[] strArray4=org.apache.commons.lang.StringUtils.splitByWholeSeparator("4444444hI!AAAAAAAAA                                                                                        ","aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa ",4);
    int int5=org.apache.commons.lang.StringUtils.lastIndexOfAny("Aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaa",strArray4);
    java.lang.String[] strArray6=org.apache.commons.lang.StringUtils.stripAll(strArray4);
    org.junit.Assert.assertNotNull(strArray4);
    org.junit.Assert.assertTrue("'" + int5 + "' != '"+ (-1)+ "'",int5 == (-1));
    org.junit.Assert.assertNotNull(strArray6);
  }
  @Test public void test206() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test206#2358");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test206");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.splitPreserveAllTokens("Aaaaaaaaaaaaaaaaaaaa##Aaaaaaaahi!aaaaaaaaaaaaaaaaaaaa##Aaaaaaaa");
    int int3=org.apache.commons.lang.StringUtils.indexOfAny("aaaaaaaaai!   ",strArray2);
    org.junit.Assert.assertNotNull(strArray2);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test207() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test207#2368");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test207");
    float float1=org.apache.commons.lang.math.NumberUtils.toFloat("aaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    org.junit.Assert.assertTrue("'" + float1 + "' != '"+ 0.0f+ "'",float1 == 0.0f);
  }
  @Test public void test208() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test208#2376");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test208");
    double double2=org.apache.commons.lang.math.NumberUtils.toDouble("#####AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaa",27.0d);
    org.junit.Assert.assertTrue("'" + double2 + "' != '"+ 27.0d+ "'",double2 == 27.0d);
  }
  @Test public void test209() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test209#2384");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test209");
    long long3=org.apache.commons.lang.math.NumberUtils.min(20L,0L,(long)52);
    org.junit.Assert.assertTrue("'" + long3 + "' != '"+ 0L+ "'",long3 == 0L);
  }
  @Test public void test210() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test210#2392");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test210");
    java.lang.String str2=org.apache.commons.lang.StringUtils.chompLast("AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAIAAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAIAAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAIAAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAIAAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAIAAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAIAAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAIAAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAIAAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAI","Hi!###################################A");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAIAAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAIAAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAIAAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAIAAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAIAAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAIAAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAIAAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAIAAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAI"+ "'",str2.equals("AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAIAAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAIAAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAIAAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAIAAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAIAAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAIAAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAIAAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAIAAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAI"));
  }
  @Test public void test211() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test211#2400");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test211");
    double double3=org.apache.commons.lang.math.NumberUtils.min(4.4444444444444446E67d,(double)99,(double)34L);
    org.junit.Assert.assertTrue("'" + double3 + "' != '"+ 34.0d+ "'",double3 == 34.0d);
  }
  @Test public void test212() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test212#2408");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test212");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAlphanumeric("a                                                hi!                                                ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test213() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test213#2416");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test213");
    java.lang.String str1=org.apache.commons.lang.StringUtils.defaultString("                                          aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "                                          aaaaaaaaa "+ "'",str1.equals("                                          aaaaaaaaa "));
  }
  @Test public void test214() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test214#2424");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test214");
    java.lang.String str1=org.apache.commons.lang.StringUtils.strip("!ih...AaaaaaaaaAaaaaaaaaAaaaaaaaaAa...!");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "!ih...AaaaaaaaaAaaaaaaaaAaaaaaaaaAa...!"+ "'",str1.equals("!ih...AaaaaaaaaAaaaaaaaaAaaaaaaaaAa...!"));
  }
  @Test public void test215() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test215#2432");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test215");
    int int3=org.apache.commons.lang.StringUtils.indexOf("aaaaaaaaa i!aaaaaaaaa i!","",7);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ 7+ "'",int3 == 7);
  }
  @Test public void test216() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test216#2440");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test216");
    java.lang.String str1=org.apache.commons.lang.StringUtils.deleteSpaces("......");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "......"+ "'",str1.equals("......"));
  }
  @Test public void test217() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test217#2448");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test217");
    try {
      java.math.BigDecimal bigDecimal1=org.apache.commons.lang.math.NumberUtils.createBigDecimal("!###################################A");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test218() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test218#2459");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test218");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringAfterLast("!i aaaaaaaaa                                          ","                    ##A       hi!                    ##A       ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test219() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test219#2467");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test219");
    java.lang.String str3=org.apache.commons.lang.StringUtils.rightPad("########################AAAAAAAAAAAAAAAAAAAA########################################################",117,'#');
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "########################AAAAAAAAAAAAAAAAAAAA#########################################################################"+ "'",str3.equals("########################AAAAAAAAAAAAAAAAAAAA#########################################################################"));
  }
  @Test public void test220() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test220#2475");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test220");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringBetween("","aaaaaaaaaa           4            ");
    org.junit.Assert.assertNull(str2);
  }
  @Test public void test221() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test221#2483");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test221");
    java.lang.String str1=org.apache.commons.lang.StringUtils.uncapitalise("aAHI");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "aAHI"+ "'",str1.equals("aAHI"));
  }
  @Test public void test222() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test222#2491");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test222");
    java.lang.String str2=org.apache.commons.lang.StringUtils.repeat("44444..!ih..",93);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih.."+ "'",str2.equals("44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih.."));
  }
  @Test public void test223() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test223#2499");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test223");
    java.lang.String str2=org.apache.commons.lang.StringUtils.stripEnd("                                                ","AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                                                "+ "'",str2.equals("                                                "));
  }
  @Test public void test224() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test224#2507");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test224");
    int int2=org.apache.commons.lang.math.NumberUtils.stringToInt("                     ",54);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 54+ "'",int2 == 54);
  }
  @Test public void test225() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test225#2515");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test225");
    int int1=org.apache.commons.lang.math.NumberUtils.toInt("         !ih         ");
    org.junit.Assert.assertTrue("'" + int1 + "' != '"+ 0+ "'",int1 == 0);
  }
  @Test public void test226() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test226#2523");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test226");
    boolean boolean1=org.apache.commons.lang.StringUtils.isWhitespace("                          AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test227() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test227#2531");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test227");
    short[] shortArray0=null;
    short[] shortArray3=new short[]{(byte)10,(byte)-1};
    short short4=org.apache.commons.lang.math.NumberUtils.max(shortArray3);
    short[] shortArray7=new short[]{(byte)1,(byte)1};
    boolean boolean8=org.apache.commons.lang.math.NumberUtils.equals(shortArray3,shortArray7);
    short[] shortArray11=new short[]{(byte)10,(byte)-1};
    short short12=org.apache.commons.lang.math.NumberUtils.max(shortArray11);
    short[] shortArray15=new short[]{(byte)1,(byte)1};
    boolean boolean16=org.apache.commons.lang.math.NumberUtils.equals(shortArray11,shortArray15);
    short short17=org.apache.commons.lang.math.NumberUtils.min(shortArray11);
    short[] shortArray20=new short[]{(byte)10,(byte)-1};
    short short21=org.apache.commons.lang.math.NumberUtils.max(shortArray20);
    short[] shortArray24=new short[]{(byte)1,(byte)1};
    boolean boolean25=org.apache.commons.lang.math.NumberUtils.equals(shortArray20,shortArray24);
    short short26=org.apache.commons.lang.math.NumberUtils.max(shortArray20);
    boolean boolean27=org.apache.commons.lang.math.NumberUtils.equals(shortArray11,shortArray20);
    boolean boolean28=org.apache.commons.lang.math.NumberUtils.equals(shortArray7,shortArray20);
    short short29=org.apache.commons.lang.math.NumberUtils.max(shortArray20);
    short short30=org.apache.commons.lang.math.NumberUtils.min(shortArray20);
    short[] shortArray33=new short[]{(byte)10,(byte)-1};
    short short34=org.apache.commons.lang.math.NumberUtils.max(shortArray33);
    short[] shortArray37=new short[]{(byte)1,(byte)1};
    boolean boolean38=org.apache.commons.lang.math.NumberUtils.equals(shortArray33,shortArray37);
    short short39=org.apache.commons.lang.math.NumberUtils.min(shortArray33);
    short[] shortArray42=new short[]{(byte)10,(byte)-1};
    short short43=org.apache.commons.lang.math.NumberUtils.max(shortArray42);
    short[] shortArray46=new short[]{(byte)1,(byte)1};
    boolean boolean47=org.apache.commons.lang.math.NumberUtils.equals(shortArray42,shortArray46);
    short short48=org.apache.commons.lang.math.NumberUtils.max(shortArray42);
    boolean boolean49=org.apache.commons.lang.math.NumberUtils.equals(shortArray33,shortArray42);
    boolean boolean50=org.apache.commons.lang.math.NumberUtils.equals(shortArray20,shortArray33);
    short short51=org.apache.commons.lang.math.NumberUtils.min(shortArray33);
    boolean boolean52=org.apache.commons.lang.math.NumberUtils.equals(shortArray0,shortArray33);
    try {
      short short53=org.apache.commons.lang.math.NumberUtils.max(shortArray0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
    }
 catch (    java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNotNull(shortArray3);
    org.junit.Assert.assertTrue("'" + short4 + "' != '"+ (short)10+ "'",short4 == (short)10);
    org.junit.Assert.assertNotNull(shortArray7);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '"+ false+ "'",boolean8 == false);
    org.junit.Assert.assertNotNull(shortArray11);
    org.junit.Assert.assertTrue("'" + short12 + "' != '"+ (short)10+ "'",short12 == (short)10);
    org.junit.Assert.assertNotNull(shortArray15);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '"+ false+ "'",boolean16 == false);
    org.junit.Assert.assertTrue("'" + short17 + "' != '"+ (short)-1+ "'",short17 == (short)-1);
    org.junit.Assert.assertNotNull(shortArray20);
    org.junit.Assert.assertTrue("'" + short21 + "' != '"+ (short)10+ "'",short21 == (short)10);
    org.junit.Assert.assertNotNull(shortArray24);
    org.junit.Assert.assertTrue("'" + boolean25 + "' != '"+ false+ "'",boolean25 == false);
    org.junit.Assert.assertTrue("'" + short26 + "' != '"+ (short)10+ "'",short26 == (short)10);
    org.junit.Assert.assertTrue("'" + boolean27 + "' != '"+ true+ "'",boolean27 == true);
    org.junit.Assert.assertTrue("'" + boolean28 + "' != '"+ false+ "'",boolean28 == false);
    org.junit.Assert.assertTrue("'" + short29 + "' != '"+ (short)10+ "'",short29 == (short)10);
    org.junit.Assert.assertTrue("'" + short30 + "' != '"+ (short)-1+ "'",short30 == (short)-1);
    org.junit.Assert.assertNotNull(shortArray33);
    org.junit.Assert.assertTrue("'" + short34 + "' != '"+ (short)10+ "'",short34 == (short)10);
    org.junit.Assert.assertNotNull(shortArray37);
    org.junit.Assert.assertTrue("'" + boolean38 + "' != '"+ false+ "'",boolean38 == false);
    org.junit.Assert.assertTrue("'" + short39 + "' != '"+ (short)-1+ "'",short39 == (short)-1);
    org.junit.Assert.assertNotNull(shortArray42);
    org.junit.Assert.assertTrue("'" + short43 + "' != '"+ (short)10+ "'",short43 == (short)10);
    org.junit.Assert.assertNotNull(shortArray46);
    org.junit.Assert.assertTrue("'" + boolean47 + "' != '"+ false+ "'",boolean47 == false);
    org.junit.Assert.assertTrue("'" + short48 + "' != '"+ (short)10+ "'",short48 == (short)10);
    org.junit.Assert.assertTrue("'" + boolean49 + "' != '"+ true+ "'",boolean49 == true);
    org.junit.Assert.assertTrue("'" + boolean50 + "' != '"+ true+ "'",boolean50 == true);
    org.junit.Assert.assertTrue("'" + short51 + "' != '"+ (short)-1+ "'",short51 == (short)-1);
    org.junit.Assert.assertTrue("'" + boolean52 + "' != '"+ false+ "'",boolean52 == false);
  }
  @Test public void test228() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test228#2607");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test228");
    java.lang.String str1=org.apache.commons.lang.StringUtils.lowerCase("                                                                 ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "                                                                 "+ "'",str1.equals("                                                                 "));
  }
  @Test public void test229() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test229#2615");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test229");
    java.lang.String str1=org.apache.commons.lang.StringUtils.deleteSpaces("AaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "AaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaa"+ "'",str1.equals("AaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaa"));
  }
  @Test public void test230() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test230#2623");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test230");
    java.lang.String str1=org.apache.commons.lang.StringUtils.lowerCase("HI... !ih...                                AAAAAAAA... !ih...                                AAAAAAAAAAAAAAAAAAAA");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "hi... !ih...                                aaaaaaaa... !ih...                                aaaaaaaaaaaaaaaaaaaa"+ "'",str1.equals("hi... !ih...                                aaaaaaaa... !ih...                                aaaaaaaaaaaaaaaaaaaa"));
  }
  @Test public void test231() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test231#2631");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test231");
    int int2=org.apache.commons.lang.math.NumberUtils.compare((double)(byte)0,0.0d);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 0+ "'",int2 == 0);
  }
  @Test public void test232() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test232#2639");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test232");
    short short3=org.apache.commons.lang.math.NumberUtils.max((short)0,(short)(byte)0,(short)(byte)-1);
    org.junit.Assert.assertTrue("'" + short3 + "' != '"+ (short)0+ "'",short3 == (short)0);
  }
  @Test public void test233() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test233#2647");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test233");
    int int3=org.apache.commons.lang.StringUtils.indexOf("aaaaaaaaaaaaaaaaaaaa##Aaaaaaaaaaaaaaaaaaaaa##Aa","#########",117);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test234() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test234#2655");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test234");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAlphanumericSpace("                          #A");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test235() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test235#2663");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test235");
    java.lang.String str1=org.apache.commons.lang.StringUtils.capitalize("         A");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "         A"+ "'",str1.equals("         A"));
  }
  @Test public void test236() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test236#2671");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test236");
    boolean boolean1=org.apache.commons.lang.math.NumberUtils.isDigits("                                                ...                          ......                                                                 ...                          ......                                                                 ...                          ......                                                                 ...                          ......                                                                 ...                          ......                                                                 ...                          ......                                                                 ...                          ......                                                                 ...                          ......                                                                 ...                          ......                                                                 ...                          ......                                                                 ...                          ......                                                                 ...                          ......                                                                 ...                          ......                                                                 ...                          ......                                                                 ...                          ......                                                                 ...                          ......                                                                 ...                          ......                                                                 ...                          ......                                                                 ...                          ......                                                                 ...                          ......                                                                 ...                          ......                                                                 ...                          ......                                                                 ...                          ......                                                                 ...                          ......                                                                 ...                          ......                                                                 ...                          ......                                                                 ...                          ......                                                                 ...                          ......                                                                 ...                          ......                                                                 ...                          ......                                                                 ...                          ......                                                                 ...                          ......                                                                 ...                          ......                                                                 ...                          ......                                                                 ...                          ......                                                                 ...                          ......                                                                 ...                          ......                                                                 ...                          ......                                                                 ...                          ......                                                                 ...                          ......                                                                 ...                          ......                                                                 ...                          ......                                                                 ...                          ......                 ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test237() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test237#2679");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test237");
    boolean boolean1=org.apache.commons.lang.math.NumberUtils.isDigits("...                                                                           ##A");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test238() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test238#2687");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test238");
    int int3=org.apache.commons.lang.StringUtils.lastIndexOf("##########################A        A        A        A        ",'#',(int)' ');
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ 25+ "'",int3 == 25);
  }
  @Test public void test239() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test239#2695");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test239");
    java.lang.String str2=org.apache.commons.lang.StringUtils.getPrechomp("aaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaaaaaaaaaaaaaaa","                          AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa                          ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test240() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test240#2703");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test240");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substring("44444444444444444444444444444                                                HI!",54);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                       HI!"+ "'",str2.equals("                       HI!"));
  }
  @Test public void test241() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test241#2711");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test241");
    int int2=org.apache.commons.lang.StringUtils.countMatches("aA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA","");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 0+ "'",int2 == 0);
  }
  @Test public void test242() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test242#2719");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test242");
    java.lang.String str2=org.apache.commons.lang.StringUtils.stripStart("... !ih...aaaaaaaaaaaaaaaaaaaa                                ","aaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "... !ih...aaaaaaaaaaaaaaaaaaaa                                "+ "'",str2.equals("... !ih...aaaaaaaaaaaaaaaaaaaa                                "));
  }
  @Test public void test243() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test243#2727");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test243");
    java.lang.String[] strArray3=org.apache.commons.lang.StringUtils.splitByWholeSeparator("...                    ","4444444hi!aaaaaaaa..!ih..",(int)(short)1);
    org.junit.Assert.assertNotNull(strArray3);
  }
  @Test public void test244() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test244#2735");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test244");
    float float3=org.apache.commons.lang.math.NumberUtils.min((float)90,(float)24L,(float)895L);
    org.junit.Assert.assertTrue("'" + float3 + "' != '"+ 24.0f+ "'",float3 == 24.0f);
  }
  @Test public void test245() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test245#2743");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test245");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substring("AAAAAAAAAAi!",90);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test246() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test246#2751");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test246");
    long long3=org.apache.commons.lang.math.NumberUtils.min((long)24,42L,(long)26);
    org.junit.Assert.assertTrue("'" + long3 + "' != '"+ 24L+ "'",long3 == 24L);
  }
  @Test public void test247() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test247#2759");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test247");
    long long2=org.apache.commons.lang.math.NumberUtils.toLong("          Aaaaaaaaa ",(long)9);
    org.junit.Assert.assertTrue("'" + long2 + "' != '"+ 9L+ "'",long2 == 9L);
  }
  @Test public void test248() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test248#2767");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test248");
    java.lang.String str1=org.apache.commons.lang.StringUtils.deleteSpaces("...aa i!                                            ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "...aai!"+ "'",str1.equals("...aai!"));
  }
  @Test public void test249() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test249#2775");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test249");
    java.lang.Object[] objArray0=null;
    java.lang.String str4=org.apache.commons.lang.StringUtils.join(objArray0,"aaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!                                aaaaaaaaaaaaaaaaaaaaaaaaaaaaa",(int)(byte)-1,87);
    org.junit.Assert.assertNull(str4);
  }
  @Test public void test250() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test250#2784");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test250");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.splitPreserveAllTokens("hi!");
    int int3=org.apache.commons.lang.StringUtils.lastIndexOfAny("",strArray2);
    long[] longArray5=new long[]{'#'};
    long[] longArray9=new long[]{97,(-1),' '};
    boolean boolean10=org.apache.commons.lang.math.NumberUtils.equals(longArray5,longArray9);
    long long11=org.apache.commons.lang.math.NumberUtils.min(longArray9);
    short[] shortArray16=new short[]{(short)-1,(short)1,(short)0};
    short short17=org.apache.commons.lang.math.NumberUtils.max(shortArray16);
    java.lang.String[] strArray21=org.apache.commons.lang.StringUtils.split("","hi!",(int)(byte)100);
    java.lang.String str22=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray21);
    java.lang.String[] strArray24=org.apache.commons.lang.StringUtils.stripAll(strArray21,"                                   ");
    java.lang.String[] strArray25=org.apache.commons.lang.StringUtils.stripAll(strArray21);
    java.lang.Object[] objArray26=new java.lang.Object[]{strArray2,longArray9,"#######################################################################################",shortArray16,strArray25};
    java.lang.String str27=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray2);
    java.lang.String str29=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray2,' ');
    java.lang.String str31=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray2,"            hi!            ");
    org.junit.Assert.assertNotNull(strArray2);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
    org.junit.Assert.assertNotNull(longArray5);
    org.junit.Assert.assertNotNull(longArray9);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '"+ false+ "'",boolean10 == false);
    org.junit.Assert.assertTrue("'" + long11 + "' != '"+ (-1L)+ "'",long11 == (-1L));
    org.junit.Assert.assertNotNull(shortArray16);
    org.junit.Assert.assertTrue("'" + short17 + "' != '"+ (short)1+ "'",short17 == (short)1);
    org.junit.Assert.assertNotNull(strArray21);
    org.junit.Assert.assertTrue("'" + str22 + "' != '"+ ""+ "'",str22.equals(""));
    org.junit.Assert.assertNotNull(strArray24);
    org.junit.Assert.assertNotNull(strArray25);
    org.junit.Assert.assertNotNull(objArray26);
    org.junit.Assert.assertTrue("'" + str27 + "' != '"+ "hi!"+ "'",str27.equals("hi!"));
    org.junit.Assert.assertTrue("'" + str29 + "' != '"+ "hi!"+ "'",str29.equals("hi!"));
    org.junit.Assert.assertTrue("'" + str31 + "' != '"+ "hi!"+ "'",str31.equals("hi!"));
  }
  @Test public void test251() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test251#2822");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test251");
    java.lang.String str2=org.apache.commons.lang.StringUtils.defaultString("A444 A44444444 A44444444 A44444444 A44444444 A44444444 A44444444","                                                            ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "A444 A44444444 A44444444 A44444444 A44444444 A44444444 A44444444"+ "'",str2.equals("A444 A44444444 A44444444 A44444444 A44444444 A44444444 A44444444"));
  }
  @Test public void test252() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test252#2830");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test252");
    byte[] byteArray3=new byte[]{(byte)100,(byte)0,(byte)100};
    byte[] byteArray6=new byte[]{(byte)-1,(byte)-1};
    boolean boolean7=org.apache.commons.lang.math.NumberUtils.equals(byteArray3,byteArray6);
    byte byte8=org.apache.commons.lang.math.NumberUtils.min(byteArray3);
    byte[] byteArray9=null;
    byte[] byteArray13=new byte[]{(byte)100,(byte)0,(byte)100};
    byte[] byteArray16=new byte[]{(byte)-1,(byte)-1};
    boolean boolean17=org.apache.commons.lang.math.NumberUtils.equals(byteArray13,byteArray16);
    boolean boolean18=org.apache.commons.lang.math.NumberUtils.equals(byteArray9,byteArray16);
    byte[] byteArray22=new byte[]{(byte)100,(byte)0,(byte)100};
    byte[] byteArray25=new byte[]{(byte)-1,(byte)-1};
    boolean boolean26=org.apache.commons.lang.math.NumberUtils.equals(byteArray22,byteArray25);
    byte byte27=org.apache.commons.lang.math.NumberUtils.min(byteArray25);
    boolean boolean28=org.apache.commons.lang.math.NumberUtils.equals(byteArray16,byteArray25);
    byte[] byteArray29=null;
    byte[] byteArray33=new byte[]{(byte)100,(byte)0,(byte)100};
    byte[] byteArray36=new byte[]{(byte)-1,(byte)-1};
    boolean boolean37=org.apache.commons.lang.math.NumberUtils.equals(byteArray33,byteArray36);
    boolean boolean38=org.apache.commons.lang.math.NumberUtils.equals(byteArray29,byteArray36);
    byte[] byteArray42=new byte[]{(byte)100,(byte)0,(byte)100};
    byte[] byteArray45=new byte[]{(byte)-1,(byte)-1};
    boolean boolean46=org.apache.commons.lang.math.NumberUtils.equals(byteArray42,byteArray45);
    byte byte47=org.apache.commons.lang.math.NumberUtils.min(byteArray45);
    boolean boolean48=org.apache.commons.lang.math.NumberUtils.equals(byteArray36,byteArray45);
    boolean boolean49=org.apache.commons.lang.math.NumberUtils.equals(byteArray16,byteArray36);
    byte byte50=org.apache.commons.lang.math.NumberUtils.max(byteArray16);
    byte byte51=org.apache.commons.lang.math.NumberUtils.max(byteArray16);
    byte byte52=org.apache.commons.lang.math.NumberUtils.min(byteArray16);
    byte byte53=org.apache.commons.lang.math.NumberUtils.min(byteArray16);
    boolean boolean54=org.apache.commons.lang.math.NumberUtils.equals(byteArray3,byteArray16);
    byte[] byteArray55=null;
    byte[] byteArray59=new byte[]{(byte)100,(byte)0,(byte)100};
    byte[] byteArray62=new byte[]{(byte)-1,(byte)-1};
    boolean boolean63=org.apache.commons.lang.math.NumberUtils.equals(byteArray59,byteArray62);
    boolean boolean64=org.apache.commons.lang.math.NumberUtils.equals(byteArray55,byteArray62);
    byte[] byteArray68=new byte[]{(byte)100,(byte)0,(byte)100};
    byte[] byteArray71=new byte[]{(byte)-1,(byte)-1};
    boolean boolean72=org.apache.commons.lang.math.NumberUtils.equals(byteArray68,byteArray71);
    byte byte73=org.apache.commons.lang.math.NumberUtils.min(byteArray71);
    boolean boolean74=org.apache.commons.lang.math.NumberUtils.equals(byteArray62,byteArray71);
    byte byte75=org.apache.commons.lang.math.NumberUtils.max(byteArray71);
    boolean boolean76=org.apache.commons.lang.math.NumberUtils.equals(byteArray16,byteArray71);
    org.junit.Assert.assertNotNull(byteArray3);
    org.junit.Assert.assertNotNull(byteArray6);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '"+ false+ "'",boolean7 == false);
    org.junit.Assert.assertTrue("'" + byte8 + "' != '"+ (byte)0+ "'",byte8 == (byte)0);
    org.junit.Assert.assertNotNull(byteArray13);
    org.junit.Assert.assertNotNull(byteArray16);
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '"+ false+ "'",boolean17 == false);
    org.junit.Assert.assertTrue("'" + boolean18 + "' != '"+ false+ "'",boolean18 == false);
    org.junit.Assert.assertNotNull(byteArray22);
    org.junit.Assert.assertNotNull(byteArray25);
    org.junit.Assert.assertTrue("'" + boolean26 + "' != '"+ false+ "'",boolean26 == false);
    org.junit.Assert.assertTrue("'" + byte27 + "' != '"+ (byte)-1+ "'",byte27 == (byte)-1);
    org.junit.Assert.assertTrue("'" + boolean28 + "' != '"+ true+ "'",boolean28 == true);
    org.junit.Assert.assertNotNull(byteArray33);
    org.junit.Assert.assertNotNull(byteArray36);
    org.junit.Assert.assertTrue("'" + boolean37 + "' != '"+ false+ "'",boolean37 == false);
    org.junit.Assert.assertTrue("'" + boolean38 + "' != '"+ false+ "'",boolean38 == false);
    org.junit.Assert.assertNotNull(byteArray42);
    org.junit.Assert.assertNotNull(byteArray45);
    org.junit.Assert.assertTrue("'" + boolean46 + "' != '"+ false+ "'",boolean46 == false);
    org.junit.Assert.assertTrue("'" + byte47 + "' != '"+ (byte)-1+ "'",byte47 == (byte)-1);
    org.junit.Assert.assertTrue("'" + boolean48 + "' != '"+ true+ "'",boolean48 == true);
    org.junit.Assert.assertTrue("'" + boolean49 + "' != '"+ true+ "'",boolean49 == true);
    org.junit.Assert.assertTrue("'" + byte50 + "' != '"+ (byte)-1+ "'",byte50 == (byte)-1);
    org.junit.Assert.assertTrue("'" + byte51 + "' != '"+ (byte)-1+ "'",byte51 == (byte)-1);
    org.junit.Assert.assertTrue("'" + byte52 + "' != '"+ (byte)-1+ "'",byte52 == (byte)-1);
    org.junit.Assert.assertTrue("'" + byte53 + "' != '"+ (byte)-1+ "'",byte53 == (byte)-1);
    org.junit.Assert.assertTrue("'" + boolean54 + "' != '"+ false+ "'",boolean54 == false);
    org.junit.Assert.assertNotNull(byteArray59);
    org.junit.Assert.assertNotNull(byteArray62);
    org.junit.Assert.assertTrue("'" + boolean63 + "' != '"+ false+ "'",boolean63 == false);
    org.junit.Assert.assertTrue("'" + boolean64 + "' != '"+ false+ "'",boolean64 == false);
    org.junit.Assert.assertNotNull(byteArray68);
    org.junit.Assert.assertNotNull(byteArray71);
    org.junit.Assert.assertTrue("'" + boolean72 + "' != '"+ false+ "'",boolean72 == false);
    org.junit.Assert.assertTrue("'" + byte73 + "' != '"+ (byte)-1+ "'",byte73 == (byte)-1);
    org.junit.Assert.assertTrue("'" + boolean74 + "' != '"+ true+ "'",boolean74 == true);
    org.junit.Assert.assertTrue("'" + byte75 + "' != '"+ (byte)-1+ "'",byte75 == (byte)-1);
    org.junit.Assert.assertTrue("'" + boolean76 + "' != '"+ true+ "'",boolean76 == true);
  }
  @Test public void test253() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test253#2917");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test253");
    boolean boolean2=org.apache.commons.lang.StringUtils.contains("    !i       a         a         a         a         a         a         a         a         a         a"," AAAAAAAAA");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test254() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test254#2925");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test254");
    double double2=org.apache.commons.lang.math.NumberUtils.toDouble("Hi!                                ",(double)108);
    org.junit.Assert.assertTrue("'" + double2 + "' != '"+ 108.0d+ "'",double2 == 108.0d);
  }
  @Test public void test255() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test255#2933");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test255");
    short short3=org.apache.commons.lang.math.NumberUtils.max((short)1,(short)(byte)100,(short)100);
    org.junit.Assert.assertTrue("'" + short3 + "' != '"+ (short)100+ "'",short3 == (short)100);
  }
  @Test public void test256() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test256#2941");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test256");
    java.lang.String str1=org.apache.commons.lang.StringUtils.deleteWhitespace("...                                                                           ##A");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "...##A"+ "'",str1.equals("...##A"));
  }
  @Test public void test257() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test257#2949");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test257");
    boolean boolean1=org.apache.commons.lang.StringUtils.isNotBlank("aaaaaaaaaaaaaaaaaaaa##Aaaaaaaaaaaaaaaaaaaaa##Aa");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test258() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test258#2957");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test258");
    java.lang.String str3=org.apache.commons.lang.StringUtils.replace("A         A         A         A         A         A         A         A         A         A       i!                                                        ","hi!                                   A","aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "A         A         A         A         A         A         A         A         A         A       i!                                                        "+ "'",str3.equals("A         A         A         A         A         A         A         A         A         A       i!                                                        "));
  }
  @Test public void test259() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test259#2965");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test259");
    int int3=org.apache.commons.lang.StringUtils.lastIndexOf("!i Aaaaaaaaa                                                                                                                                               ","                                           ... !ih",134);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test260() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test260#2973");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test260");
    java.lang.String str2=org.apache.commons.lang.StringUtils.getPrechomp("   ","           ...hi! ...           ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test261() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test261#2981");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test261");
    java.lang.String str3=org.apache.commons.lang.StringUtils.mid("44444444444444444444444444444444444444444          444444444444444444444444444444444444",65,0);
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ ""+ "'",str3.equals(""));
  }
  @Test public void test262() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test262#2989");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test262");
    try {
      java.lang.String str3=org.apache.commons.lang.StringUtils.abbreviate("                                                                                                            ",14,0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
    }
 catch (    java.lang.IllegalArgumentException e) {
    }
  }
  @Test public void test263() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test263#3000");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test263");
    java.lang.String str2=org.apache.commons.lang.StringUtils.rightPad("a                                                hi!                                                 ",31);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "a                                                hi!                                                 "+ "'",str2.equals("a                                                hi!                                                 "));
  }
  @Test public void test264() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test264#3008");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test264");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.split("                                                hi!                                                 ");
    int int3=org.apache.commons.lang.StringUtils.lastIndexOfAny("... !ih...... !ih....##A##A#!ih",strArray2);
    java.lang.String str4=org.apache.commons.lang.StringUtils.concatenate((java.lang.Object[])strArray2);
    org.junit.Assert.assertNotNull(strArray2);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
    org.junit.Assert.assertTrue("'" + str4 + "' != '"+ "hi!"+ "'",str4.equals("hi!"));
  }
  @Test public void test265() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test265#3020");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test265");
    java.lang.String str3=org.apache.commons.lang.StringUtils.replaceOnce("hi!   #################################################################################","444444444444444444444444444444444444444444444...","Aa hi!Aa hi!Aa hi!Aa ...");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "hi!   #################################################################################"+ "'",str3.equals("hi!   #################################################################################"));
  }
  @Test public void test266() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test266#3028");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test266");
    java.lang.String str1=org.apache.commons.lang.StringUtils.strip("a a a a a a");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "a a a a a a"+ "'",str1.equals("a a a a a a"));
  }
  @Test public void test267() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test267#3036");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test267");
    java.lang.String str1=org.apache.commons.lang.StringUtils.upperCase("444444444444444444444444444444444444444444444          444444444444444444444444444444444444");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "444444444444444444444444444444444444444444444          444444444444444444444444444444444444"+ "'",str1.equals("444444444444444444444444444444444444444444444          444444444444444444444444444444444444"));
  }
  @Test public void test268() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test268#3044");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test268");
    int[] intArray3=new int[]{'4',0,(byte)0};
    int[] intArray6=new int[]{100,1};
    int[] intArray13=new int[]{(byte)-1,100,(short)0,100,'#',100};
    boolean boolean14=org.apache.commons.lang.math.NumberUtils.equals(intArray6,intArray13);
    int[] intArray21=new int[]{'4',(short)100,(short)100,52,(byte)1,(short)100};
    boolean boolean22=org.apache.commons.lang.math.NumberUtils.equals(intArray13,intArray21);
    int int23=org.apache.commons.lang.math.NumberUtils.max(intArray21);
    boolean boolean24=org.apache.commons.lang.math.NumberUtils.equals(intArray3,intArray21);
    int[] intArray27=new int[]{100,1};
    int[] intArray34=new int[]{(byte)-1,100,(short)0,100,'#',100};
    boolean boolean35=org.apache.commons.lang.math.NumberUtils.equals(intArray27,intArray34);
    int[] intArray42=new int[]{'4',(short)100,(short)100,52,(byte)1,(short)100};
    boolean boolean43=org.apache.commons.lang.math.NumberUtils.equals(intArray34,intArray42);
    int[] intArray46=new int[]{100,1};
    int[] intArray53=new int[]{(byte)-1,100,(short)0,100,'#',100};
    boolean boolean54=org.apache.commons.lang.math.NumberUtils.equals(intArray46,intArray53);
    boolean boolean55=org.apache.commons.lang.math.NumberUtils.equals(intArray34,intArray53);
    int[] intArray58=new int[]{100,1};
    int[] intArray65=new int[]{(byte)-1,100,(short)0,100,'#',100};
    boolean boolean66=org.apache.commons.lang.math.NumberUtils.equals(intArray58,intArray65);
    int int67=org.apache.commons.lang.math.NumberUtils.max(intArray65);
    int int68=org.apache.commons.lang.math.NumberUtils.max(intArray65);
    boolean boolean69=org.apache.commons.lang.math.NumberUtils.equals(intArray53,intArray65);
    int int70=org.apache.commons.lang.math.NumberUtils.max(intArray53);
    boolean boolean71=org.apache.commons.lang.math.NumberUtils.equals(intArray3,intArray53);
    org.junit.Assert.assertNotNull(intArray3);
    org.junit.Assert.assertNotNull(intArray6);
    org.junit.Assert.assertNotNull(intArray13);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '"+ false+ "'",boolean14 == false);
    org.junit.Assert.assertNotNull(intArray21);
    org.junit.Assert.assertTrue("'" + boolean22 + "' != '"+ false+ "'",boolean22 == false);
    org.junit.Assert.assertTrue("'" + int23 + "' != '"+ 100+ "'",int23 == 100);
    org.junit.Assert.assertTrue("'" + boolean24 + "' != '"+ false+ "'",boolean24 == false);
    org.junit.Assert.assertNotNull(intArray27);
    org.junit.Assert.assertNotNull(intArray34);
    org.junit.Assert.assertTrue("'" + boolean35 + "' != '"+ false+ "'",boolean35 == false);
    org.junit.Assert.assertNotNull(intArray42);
    org.junit.Assert.assertTrue("'" + boolean43 + "' != '"+ false+ "'",boolean43 == false);
    org.junit.Assert.assertNotNull(intArray46);
    org.junit.Assert.assertNotNull(intArray53);
    org.junit.Assert.assertTrue("'" + boolean54 + "' != '"+ false+ "'",boolean54 == false);
    org.junit.Assert.assertTrue("'" + boolean55 + "' != '"+ true+ "'",boolean55 == true);
    org.junit.Assert.assertNotNull(intArray58);
    org.junit.Assert.assertNotNull(intArray65);
    org.junit.Assert.assertTrue("'" + boolean66 + "' != '"+ false+ "'",boolean66 == false);
    org.junit.Assert.assertTrue("'" + int67 + "' != '"+ 100+ "'",int67 == 100);
    org.junit.Assert.assertTrue("'" + int68 + "' != '"+ 100+ "'",int68 == 100);
    org.junit.Assert.assertTrue("'" + boolean69 + "' != '"+ true+ "'",boolean69 == true);
    org.junit.Assert.assertTrue("'" + int70 + "' != '"+ 100+ "'",int70 == 100);
    org.junit.Assert.assertTrue("'" + boolean71 + "' != '"+ false+ "'",boolean71 == false);
  }
  @Test public void test269() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test269#3100");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test269");
    java.lang.String str2=org.apache.commons.lang.StringUtils.repeat("          ",98);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    "+ "'",str2.equals("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    "));
  }
  @Test public void test270() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test270#3108");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test270");
    byte byte3=org.apache.commons.lang.math.NumberUtils.max((byte)0,(byte)10,(byte)-1);
    org.junit.Assert.assertTrue("'" + byte3 + "' != '"+ (byte)10+ "'",byte3 == (byte)10);
  }
  @Test public void test271() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test271#3116");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test271");
    java.lang.String str1=org.apache.commons.lang.StringUtils.chopNewline("HHHHHHHHHHHHHHHHHHHHH");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "HHHHHHHHHHHHHHHHHHHHH"+ "'",str1.equals("HHHHHHHHHHHHHHHHHHHHH"));
  }
  @Test public void test272() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test272#3124");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test272");
    long long3=org.apache.commons.lang.math.NumberUtils.max((long)24,35L,(long)'a');
    org.junit.Assert.assertTrue("'" + long3 + "' != '"+ 97L+ "'",long3 == 97L);
  }
  @Test public void test273() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test273#3132");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test273");
    int int2=org.apache.commons.lang.StringUtils.lastIndexOf("AAAAAAAAAAAAAAAAAAAA  aAAAAAAAA                                       HI!",'4');
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test274() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test274#3140");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test274");
    boolean boolean2=org.apache.commons.lang.StringUtils.containsIgnoreCase("                                                                                aaaaaaaaaa","##########################################                         i!");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test275() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test275#3148");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test275");
    try {
      java.math.BigInteger bigInteger1=org.apache.commons.lang.math.NumberUtils.createBigInteger("        aa        aa        aa        aA!ih");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"       \"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test276() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test276#3159");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test276");
    long long3=org.apache.commons.lang.math.NumberUtils.max((long)' ',(long)36,(long)117);
    org.junit.Assert.assertTrue("'" + long3 + "' != '"+ 117L+ "'",long3 == 117L);
  }
  @Test public void test277() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test277#3167");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test277");
    boolean boolean1=org.apache.commons.lang.StringUtils.isNotEmpty("aaaaaaaaa i!aaaaaaaaa i!aaaaaaaaa i!aaaaaaaaa i!aaaaaaaaa i!aaaaaaaaa i!aaaaaaaaa i!");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test278() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test278#3175");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test278");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substring("iaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaAiaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaAiaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaAiaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaAiaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaAiaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaAiaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaAiaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaAiaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaAiaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA",13);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "aaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaAiaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaAiaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaAiaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaAiaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaAiaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaAiaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaAiaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaAiaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaAiaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA"+ "'",str2.equals("aaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaAiaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaAiaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaAiaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaAiaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaAiaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaAiaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaAiaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaAiaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaAiaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA"));
  }
  @Test public void test279() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test279#3183");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test279");
    boolean boolean1=org.apache.commons.lang.StringUtils.isNotBlank("                         ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test280() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test280#3191");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test280");
    int int2=org.apache.commons.lang.math.NumberUtils.compare((double)88.0f,(double)104);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test281() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test281#3199");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test281");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.split("                                               aAA                                              ",'a');
    org.junit.Assert.assertNotNull(strArray2);
  }
  @Test public void test282() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test282#3207");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test282");
    java.lang.String[] strArray3=org.apache.commons.lang.StringUtils.splitByWholeSeparator("                                              hi!","a                                                HI!",0);
    java.lang.String[] strArray5=org.apache.commons.lang.StringUtils.stripAll(strArray3,"...                                          HI!                                                 ");
    org.junit.Assert.assertNotNull(strArray3);
    org.junit.Assert.assertNotNull(strArray5);
  }
  @Test public void test283() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test283#3217");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test283");
    java.lang.String str1=org.apache.commons.lang.StringUtils.stripToNull("a        aa        aa        aA!ih");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "a        aa        aa        aA!ih"+ "'",str1.equals("a        aa        aa        aA!ih"));
  }
  @Test public void test284() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test284#3225");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test284");
    byte[] byteArray3=new byte[]{(byte)100,(byte)0,(byte)100};
    byte[] byteArray6=new byte[]{(byte)-1,(byte)-1};
    boolean boolean7=org.apache.commons.lang.math.NumberUtils.equals(byteArray3,byteArray6);
    byte byte8=org.apache.commons.lang.math.NumberUtils.max(byteArray6);
    byte byte9=org.apache.commons.lang.math.NumberUtils.min(byteArray6);
    byte[] byteArray13=new byte[]{(byte)100,(byte)0,(byte)100};
    byte[] byteArray16=new byte[]{(byte)-1,(byte)-1};
    boolean boolean17=org.apache.commons.lang.math.NumberUtils.equals(byteArray13,byteArray16);
    byte byte18=org.apache.commons.lang.math.NumberUtils.min(byteArray16);
    boolean boolean19=org.apache.commons.lang.math.NumberUtils.equals(byteArray6,byteArray16);
    byte byte20=org.apache.commons.lang.math.NumberUtils.max(byteArray16);
    org.junit.Assert.assertNotNull(byteArray3);
    org.junit.Assert.assertNotNull(byteArray6);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '"+ false+ "'",boolean7 == false);
    org.junit.Assert.assertTrue("'" + byte8 + "' != '"+ (byte)-1+ "'",byte8 == (byte)-1);
    org.junit.Assert.assertTrue("'" + byte9 + "' != '"+ (byte)-1+ "'",byte9 == (byte)-1);
    org.junit.Assert.assertNotNull(byteArray13);
    org.junit.Assert.assertNotNull(byteArray16);
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '"+ false+ "'",boolean17 == false);
    org.junit.Assert.assertTrue("'" + byte18 + "' != '"+ (byte)-1+ "'",byte18 == (byte)-1);
    org.junit.Assert.assertTrue("'" + boolean19 + "' != '"+ true+ "'",boolean19 == true);
    org.junit.Assert.assertTrue("'" + byte20 + "' != '"+ (byte)-1+ "'",byte20 == (byte)-1);
  }
  @Test public void test285() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test285#3253");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test285");
    float float3=org.apache.commons.lang.math.NumberUtils.max((float)104,(float)94L,(float)90);
    org.junit.Assert.assertTrue("'" + float3 + "' != '"+ 104.0f+ "'",float3 == 104.0f);
  }
  @Test public void test286() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test286#3261");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test286");
    java.lang.String str1=org.apache.commons.lang.StringUtils.trim("...##A");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "...##A"+ "'",str1.equals("...##A"));
  }
  @Test public void test287() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test287#3269");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test287");
    java.lang.String str1=org.apache.commons.lang.StringUtils.chomp("44444444444444444444444444444444444444444444444444444444444444444444444444444");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "44444444444444444444444444444444444444444444444444444444444444444444444444444"+ "'",str1.equals("44444444444444444444444444444444444444444444444444444444444444444444444444444"));
  }
  @Test public void test288() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test288#3277");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test288");
    int int3=org.apache.commons.lang.math.NumberUtils.max(80,(int)' ',0);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ 80+ "'",int3 == 80);
  }
  @Test public void test289() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test289#3285");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test289");
    java.lang.String str1=org.apache.commons.lang.StringUtils.defaultString("!IAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "!IAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA"+ "'",str1.equals("!IAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA"));
  }
  @Test public void test290() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test290#3293");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test290");
    java.lang.String str2=org.apache.commons.lang.StringUtils.prechomp("aaaaaaaaa i!","A... !ih...aaaaaaaaaaaaaaaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!    ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "aaaaaaaaa i!"+ "'",str2.equals("aaaaaaaaa i!"));
  }
  @Test public void test291() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test291#3301");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test291");
    java.lang.String str3=org.apache.commons.lang.StringUtils.substring("                                                                                                 ##a",0,42);
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "                                          "+ "'",str3.equals("                                          "));
  }
  @Test public void test292() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test292#3309");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test292");
    short[] shortArray2=new short[]{(byte)10,(byte)-1};
    short short3=org.apache.commons.lang.math.NumberUtils.max(shortArray2);
    short[] shortArray6=new short[]{(byte)1,(byte)1};
    boolean boolean7=org.apache.commons.lang.math.NumberUtils.equals(shortArray2,shortArray6);
    short short8=org.apache.commons.lang.math.NumberUtils.min(shortArray2);
    short[] shortArray11=new short[]{(byte)10,(byte)-1};
    short short12=org.apache.commons.lang.math.NumberUtils.max(shortArray11);
    short[] shortArray15=new short[]{(byte)1,(byte)1};
    boolean boolean16=org.apache.commons.lang.math.NumberUtils.equals(shortArray11,shortArray15);
    short short17=org.apache.commons.lang.math.NumberUtils.max(shortArray11);
    boolean boolean18=org.apache.commons.lang.math.NumberUtils.equals(shortArray2,shortArray11);
    short[] shortArray21=new short[]{(byte)10,(byte)-1};
    short short22=org.apache.commons.lang.math.NumberUtils.max(shortArray21);
    short[] shortArray25=new short[]{(byte)1,(byte)1};
    boolean boolean26=org.apache.commons.lang.math.NumberUtils.equals(shortArray21,shortArray25);
    short short27=org.apache.commons.lang.math.NumberUtils.min(shortArray21);
    short short28=org.apache.commons.lang.math.NumberUtils.max(shortArray21);
    boolean boolean29=org.apache.commons.lang.math.NumberUtils.equals(shortArray2,shortArray21);
    short[] shortArray30=null;
    short[] shortArray33=new short[]{(byte)10,(byte)-1};
    short short34=org.apache.commons.lang.math.NumberUtils.max(shortArray33);
    short[] shortArray37=new short[]{(byte)1,(byte)1};
    boolean boolean38=org.apache.commons.lang.math.NumberUtils.equals(shortArray33,shortArray37);
    short[] shortArray41=new short[]{(byte)10,(byte)-1};
    short short42=org.apache.commons.lang.math.NumberUtils.max(shortArray41);
    short[] shortArray45=new short[]{(byte)1,(byte)1};
    boolean boolean46=org.apache.commons.lang.math.NumberUtils.equals(shortArray41,shortArray45);
    short short47=org.apache.commons.lang.math.NumberUtils.min(shortArray41);
    short[] shortArray50=new short[]{(byte)10,(byte)-1};
    short short51=org.apache.commons.lang.math.NumberUtils.max(shortArray50);
    short[] shortArray54=new short[]{(byte)1,(byte)1};
    boolean boolean55=org.apache.commons.lang.math.NumberUtils.equals(shortArray50,shortArray54);
    short short56=org.apache.commons.lang.math.NumberUtils.max(shortArray50);
    boolean boolean57=org.apache.commons.lang.math.NumberUtils.equals(shortArray41,shortArray50);
    boolean boolean58=org.apache.commons.lang.math.NumberUtils.equals(shortArray37,shortArray50);
    short short59=org.apache.commons.lang.math.NumberUtils.max(shortArray50);
    boolean boolean60=org.apache.commons.lang.math.NumberUtils.equals(shortArray30,shortArray50);
    boolean boolean61=org.apache.commons.lang.math.NumberUtils.equals(shortArray21,shortArray50);
    short short62=org.apache.commons.lang.math.NumberUtils.min(shortArray50);
    org.junit.Assert.assertNotNull(shortArray2);
    org.junit.Assert.assertTrue("'" + short3 + "' != '"+ (short)10+ "'",short3 == (short)10);
    org.junit.Assert.assertNotNull(shortArray6);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '"+ false+ "'",boolean7 == false);
    org.junit.Assert.assertTrue("'" + short8 + "' != '"+ (short)-1+ "'",short8 == (short)-1);
    org.junit.Assert.assertNotNull(shortArray11);
    org.junit.Assert.assertTrue("'" + short12 + "' != '"+ (short)10+ "'",short12 == (short)10);
    org.junit.Assert.assertNotNull(shortArray15);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '"+ false+ "'",boolean16 == false);
    org.junit.Assert.assertTrue("'" + short17 + "' != '"+ (short)10+ "'",short17 == (short)10);
    org.junit.Assert.assertTrue("'" + boolean18 + "' != '"+ true+ "'",boolean18 == true);
    org.junit.Assert.assertNotNull(shortArray21);
    org.junit.Assert.assertTrue("'" + short22 + "' != '"+ (short)10+ "'",short22 == (short)10);
    org.junit.Assert.assertNotNull(shortArray25);
    org.junit.Assert.assertTrue("'" + boolean26 + "' != '"+ false+ "'",boolean26 == false);
    org.junit.Assert.assertTrue("'" + short27 + "' != '"+ (short)-1+ "'",short27 == (short)-1);
    org.junit.Assert.assertTrue("'" + short28 + "' != '"+ (short)10+ "'",short28 == (short)10);
    org.junit.Assert.assertTrue("'" + boolean29 + "' != '"+ true+ "'",boolean29 == true);
    org.junit.Assert.assertNotNull(shortArray33);
    org.junit.Assert.assertTrue("'" + short34 + "' != '"+ (short)10+ "'",short34 == (short)10);
    org.junit.Assert.assertNotNull(shortArray37);
    org.junit.Assert.assertTrue("'" + boolean38 + "' != '"+ false+ "'",boolean38 == false);
    org.junit.Assert.assertNotNull(shortArray41);
    org.junit.Assert.assertTrue("'" + short42 + "' != '"+ (short)10+ "'",short42 == (short)10);
    org.junit.Assert.assertNotNull(shortArray45);
    org.junit.Assert.assertTrue("'" + boolean46 + "' != '"+ false+ "'",boolean46 == false);
    org.junit.Assert.assertTrue("'" + short47 + "' != '"+ (short)-1+ "'",short47 == (short)-1);
    org.junit.Assert.assertNotNull(shortArray50);
    org.junit.Assert.assertTrue("'" + short51 + "' != '"+ (short)10+ "'",short51 == (short)10);
    org.junit.Assert.assertNotNull(shortArray54);
    org.junit.Assert.assertTrue("'" + boolean55 + "' != '"+ false+ "'",boolean55 == false);
    org.junit.Assert.assertTrue("'" + short56 + "' != '"+ (short)10+ "'",short56 == (short)10);
    org.junit.Assert.assertTrue("'" + boolean57 + "' != '"+ true+ "'",boolean57 == true);
    org.junit.Assert.assertTrue("'" + boolean58 + "' != '"+ false+ "'",boolean58 == false);
    org.junit.Assert.assertTrue("'" + short59 + "' != '"+ (short)10+ "'",short59 == (short)10);
    org.junit.Assert.assertTrue("'" + boolean60 + "' != '"+ false+ "'",boolean60 == false);
    org.junit.Assert.assertTrue("'" + boolean61 + "' != '"+ true+ "'",boolean61 == true);
    org.junit.Assert.assertTrue("'" + short62 + "' != '"+ (short)-1+ "'",short62 == (short)-1);
  }
  @Test public void test293() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test293#3392");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test293");
    java.lang.String str3=org.apache.commons.lang.StringUtils.replace("","AAAAAAAAAAAAAAAAAAAA##aAAAAAAAAAAAAAAAAAAAA##aA","aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ ""+ "'",str3.equals(""));
  }
  @Test public void test294() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test294#3400");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test294");
    java.lang.String str1=org.apache.commons.lang.StringUtils.capitaliseAllWords("AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaa");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaa"+ "'",str1.equals("AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaa"));
  }
  @Test public void test295() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test295#3408");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test295");
    double double2=org.apache.commons.lang.math.NumberUtils.toDouble("                                                                                                   ",(double)24);
    org.junit.Assert.assertTrue("'" + double2 + "' != '"+ 24.0d+ "'",double2 == 24.0d);
  }
  @Test public void test296() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test296#3416");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test296");
    java.lang.String str2=org.apache.commons.lang.StringUtils.removeStart("H","a                                                hi!                                                ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "H"+ "'",str2.equals("H"));
  }
  @Test public void test297() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test297#3424");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test297");
    java.lang.String[] strArray5=org.apache.commons.lang.StringUtils.split("","hi!",(int)(byte)100);
    java.lang.String[] strArray6=org.apache.commons.lang.StringUtils.stripAll(strArray5);
    int int7=org.apache.commons.lang.StringUtils.lastIndexOfAny("Aaaaaaaaa",strArray5);
    java.lang.String[] strArray8=org.apache.commons.lang.StringUtils.stripAll(strArray5);
    int int9=org.apache.commons.lang.StringUtils.lastIndexOfAny("",strArray5);
    java.lang.String str11=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray5,"Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!    ");
    java.lang.String str13=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray5,'#');
    org.junit.Assert.assertNotNull(strArray5);
    org.junit.Assert.assertNotNull(strArray6);
    org.junit.Assert.assertTrue("'" + int7 + "' != '"+ (-1)+ "'",int7 == (-1));
    org.junit.Assert.assertNotNull(strArray8);
    org.junit.Assert.assertTrue("'" + int9 + "' != '"+ (-1)+ "'",int9 == (-1));
    org.junit.Assert.assertTrue("'" + str11 + "' != '"+ ""+ "'",str11.equals(""));
    org.junit.Assert.assertTrue("'" + str13 + "' != '"+ ""+ "'",str13.equals(""));
  }
  @Test public void test298() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test298#3444");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test298");
    java.lang.String[] strArray3=org.apache.commons.lang.StringUtils.splitPreserveAllTokens("","a ",87);
    java.lang.String str4=org.apache.commons.lang.StringUtils.concatenate((java.lang.Object[])strArray3);
    org.junit.Assert.assertNotNull(strArray3);
    org.junit.Assert.assertTrue("'" + str4 + "' != '"+ ""+ "'",str4.equals(""));
  }
  @Test public void test299() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test299#3454");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test299");
    java.lang.String str2=org.apache.commons.lang.StringUtils.defaultString("aaaaaaaa","                        AAAAAAAAAAAAAAAAAAAA                                                        ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "aaaaaaaa"+ "'",str2.equals("aaaaaaaa"));
  }
  @Test public void test300() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test300#3462");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test300");
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
    float float24=org.apache.commons.lang.math.NumberUtils.min(floatArray20);
    float[] floatArray31=new float[]{(-1.0f),0,96,94,(byte)-1,(-1)};
    float[] floatArray36=new float[]{10,(byte)1,1L,(byte)-1};
    float float37=org.apache.commons.lang.math.NumberUtils.max(floatArray36);
    boolean boolean38=org.apache.commons.lang.math.NumberUtils.equals(floatArray31,floatArray36);
    boolean boolean39=org.apache.commons.lang.math.NumberUtils.equals(floatArray20,floatArray31);
    float[] floatArray46=new float[]{10L,(short)10,0.0f,' ',(-1),'4'};
    float float47=org.apache.commons.lang.math.NumberUtils.min(floatArray46);
    float[] floatArray54=new float[]{(-1.0f),0,96,94,(byte)-1,(-1)};
    float[] floatArray59=new float[]{10,(byte)1,1L,(byte)-1};
    float float60=org.apache.commons.lang.math.NumberUtils.max(floatArray59);
    boolean boolean61=org.apache.commons.lang.math.NumberUtils.equals(floatArray54,floatArray59);
    float[] floatArray65=new float[]{(byte)-1,(-1.0f),(byte)100};
    float float66=org.apache.commons.lang.math.NumberUtils.max(floatArray65);
    float[] floatArray68=new float[]{(byte)1};
    float float69=org.apache.commons.lang.math.NumberUtils.max(floatArray68);
    boolean boolean70=org.apache.commons.lang.math.NumberUtils.equals(floatArray65,floatArray68);
    boolean boolean71=org.apache.commons.lang.math.NumberUtils.equals(floatArray59,floatArray68);
    boolean boolean72=org.apache.commons.lang.math.NumberUtils.equals(floatArray46,floatArray68);
    float float73=org.apache.commons.lang.math.NumberUtils.min(floatArray46);
    float float74=org.apache.commons.lang.math.NumberUtils.min(floatArray46);
    float float75=org.apache.commons.lang.math.NumberUtils.min(floatArray46);
    boolean boolean76=org.apache.commons.lang.math.NumberUtils.equals(floatArray20,floatArray46);
    float float77=org.apache.commons.lang.math.NumberUtils.min(floatArray20);
    float float78=org.apache.commons.lang.math.NumberUtils.max(floatArray20);
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
    org.junit.Assert.assertTrue("'" + float24 + "' != '"+ 1.0f+ "'",float24 == 1.0f);
    org.junit.Assert.assertNotNull(floatArray31);
    org.junit.Assert.assertNotNull(floatArray36);
    org.junit.Assert.assertTrue("'" + float37 + "' != '"+ 10.0f+ "'",float37 == 10.0f);
    org.junit.Assert.assertTrue("'" + boolean38 + "' != '"+ false+ "'",boolean38 == false);
    org.junit.Assert.assertTrue("'" + boolean39 + "' != '"+ false+ "'",boolean39 == false);
    org.junit.Assert.assertNotNull(floatArray46);
    org.junit.Assert.assertTrue("'" + float47 + "' != '"+ (-1.0f)+ "'",float47 == (-1.0f));
    org.junit.Assert.assertNotNull(floatArray54);
    org.junit.Assert.assertNotNull(floatArray59);
    org.junit.Assert.assertTrue("'" + float60 + "' != '"+ 10.0f+ "'",float60 == 10.0f);
    org.junit.Assert.assertTrue("'" + boolean61 + "' != '"+ false+ "'",boolean61 == false);
    org.junit.Assert.assertNotNull(floatArray65);
    org.junit.Assert.assertTrue("'" + float66 + "' != '"+ 100.0f+ "'",float66 == 100.0f);
    org.junit.Assert.assertNotNull(floatArray68);
    org.junit.Assert.assertTrue("'" + float69 + "' != '"+ 1.0f+ "'",float69 == 1.0f);
    org.junit.Assert.assertTrue("'" + boolean70 + "' != '"+ false+ "'",boolean70 == false);
    org.junit.Assert.assertTrue("'" + boolean71 + "' != '"+ false+ "'",boolean71 == false);
    org.junit.Assert.assertTrue("'" + boolean72 + "' != '"+ false+ "'",boolean72 == false);
    org.junit.Assert.assertTrue("'" + float73 + "' != '"+ (-1.0f)+ "'",float73 == (-1.0f));
    org.junit.Assert.assertTrue("'" + float74 + "' != '"+ (-1.0f)+ "'",float74 == (-1.0f));
    org.junit.Assert.assertTrue("'" + float75 + "' != '"+ (-1.0f)+ "'",float75 == (-1.0f));
    org.junit.Assert.assertTrue("'" + boolean76 + "' != '"+ false+ "'",boolean76 == false);
    org.junit.Assert.assertTrue("'" + float77 + "' != '"+ 1.0f+ "'",float77 == 1.0f);
    org.junit.Assert.assertTrue("'" + float78 + "' != '"+ 1.0f+ "'",float78 == 1.0f);
  }
  @Test public void test301() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test301#3538");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test301");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.splitPreserveAllTokens("                                                                                aaaaaaaaaa",' ');
    org.junit.Assert.assertNotNull(strArray2);
  }
  @Test public void test302() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test302#3546");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test302");
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
    float float38=org.apache.commons.lang.math.NumberUtils.min(floatArray27);
    java.lang.Class<?> wildcardClass39=floatArray27.getClass();
    float[] floatArray46=new float[]{(-1.0f),0,96,94,(byte)-1,(-1)};
    float[] floatArray51=new float[]{10,(byte)1,1L,(byte)-1};
    float float52=org.apache.commons.lang.math.NumberUtils.max(floatArray51);
    boolean boolean53=org.apache.commons.lang.math.NumberUtils.equals(floatArray46,floatArray51);
    float[] floatArray57=new float[]{(byte)-1,(-1.0f),(byte)100};
    float float58=org.apache.commons.lang.math.NumberUtils.max(floatArray57);
    float[] floatArray60=new float[]{(byte)1};
    float float61=org.apache.commons.lang.math.NumberUtils.max(floatArray60);
    boolean boolean62=org.apache.commons.lang.math.NumberUtils.equals(floatArray57,floatArray60);
    boolean boolean63=org.apache.commons.lang.math.NumberUtils.equals(floatArray51,floatArray60);
    float float64=org.apache.commons.lang.math.NumberUtils.min(floatArray60);
    float[] floatArray71=new float[]{(-1.0f),0,96,94,(byte)-1,(-1)};
    float[] floatArray76=new float[]{10,(byte)1,1L,(byte)-1};
    float float77=org.apache.commons.lang.math.NumberUtils.max(floatArray76);
    boolean boolean78=org.apache.commons.lang.math.NumberUtils.equals(floatArray71,floatArray76);
    boolean boolean79=org.apache.commons.lang.math.NumberUtils.equals(floatArray60,floatArray71);
    boolean boolean80=org.apache.commons.lang.math.NumberUtils.equals(floatArray27,floatArray71);
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
    org.junit.Assert.assertTrue("'" + float38 + "' != '"+ (-1.0f)+ "'",float38 == (-1.0f));
    org.junit.Assert.assertNotNull(wildcardClass39);
    org.junit.Assert.assertNotNull(floatArray46);
    org.junit.Assert.assertNotNull(floatArray51);
    org.junit.Assert.assertTrue("'" + float52 + "' != '"+ 10.0f+ "'",float52 == 10.0f);
    org.junit.Assert.assertTrue("'" + boolean53 + "' != '"+ false+ "'",boolean53 == false);
    org.junit.Assert.assertNotNull(floatArray57);
    org.junit.Assert.assertTrue("'" + float58 + "' != '"+ 100.0f+ "'",float58 == 100.0f);
    org.junit.Assert.assertNotNull(floatArray60);
    org.junit.Assert.assertTrue("'" + float61 + "' != '"+ 1.0f+ "'",float61 == 1.0f);
    org.junit.Assert.assertTrue("'" + boolean62 + "' != '"+ false+ "'",boolean62 == false);
    org.junit.Assert.assertTrue("'" + boolean63 + "' != '"+ false+ "'",boolean63 == false);
    org.junit.Assert.assertTrue("'" + float64 + "' != '"+ 1.0f+ "'",float64 == 1.0f);
    org.junit.Assert.assertNotNull(floatArray71);
    org.junit.Assert.assertNotNull(floatArray76);
    org.junit.Assert.assertTrue("'" + float77 + "' != '"+ 10.0f+ "'",float77 == 10.0f);
    org.junit.Assert.assertTrue("'" + boolean78 + "' != '"+ false+ "'",boolean78 == false);
    org.junit.Assert.assertTrue("'" + boolean79 + "' != '"+ false+ "'",boolean79 == false);
    org.junit.Assert.assertTrue("'" + boolean80 + "' != '"+ false+ "'",boolean80 == false);
  }
  @Test public void test303() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test303#3629");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test303");
    java.lang.String str2=org.apache.commons.lang.StringUtils.removeStart("...                                    !i aaaaaaaaa                                            ","aaaaaaaa");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "...                                    !i aaaaaaaaa                                            "+ "'",str2.equals("...                                    !i aaaaaaaaa                                            "));
  }
  @Test public void test304() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test304#3637");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test304");
    int int2=org.apache.commons.lang.math.NumberUtils.toInt("                                            !i aaaaaaaaa                                            ",0);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 0+ "'",int2 == 0);
  }
  @Test public void test305() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test305#3645");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test305");
    int int3=org.apache.commons.lang.StringUtils.lastIndexOf("4                                                ","",54);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ 49+ "'",int3 == 49);
  }
  @Test public void test306() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test306#3653");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test306");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringAfter("                                                                                               ","...                                          ...");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test307() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test307#3661");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test307");
    java.lang.String str1=org.apache.commons.lang.StringUtils.trim("                                                                                                ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ ""+ "'",str1.equals(""));
  }
  @Test public void test308() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test308#3669");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test308");
    char[] charArray11=new char[]{'#','4','#','#',' '};
    int int12=org.apache.commons.lang.StringUtils.indexOfAnyBut("Aaaaaaaaa ",charArray11);
    boolean boolean13=org.apache.commons.lang.StringUtils.containsNone("",charArray11);
    boolean boolean14=org.apache.commons.lang.StringUtils.containsOnly("aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa ",charArray11);
    boolean boolean15=org.apache.commons.lang.StringUtils.containsOnly("...                    A",charArray11);
    int int16=org.apache.commons.lang.StringUtils.indexOfAny("",charArray11);
    int int17=org.apache.commons.lang.StringUtils.indexOfAnyBut("a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a ",charArray11);
    org.junit.Assert.assertNotNull(charArray11);
    org.junit.Assert.assertTrue("'" + int12 + "' != '"+ 0+ "'",int12 == 0);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '"+ true+ "'",boolean13 == true);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '"+ false+ "'",boolean14 == false);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '"+ false+ "'",boolean15 == false);
    org.junit.Assert.assertTrue("'" + int16 + "' != '"+ (-1)+ "'",int16 == (-1));
    org.junit.Assert.assertTrue("'" + int17 + "' != '"+ 0+ "'",int17 == 0);
  }
  @Test public void test309() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test309#3689");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test309");
    java.lang.String str1=org.apache.commons.lang.StringUtils.lowerCase("                                                ...                          ......                 ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "                                                ...                          ......                 "+ "'",str1.equals("                                                ...                          ......                 "));
  }
  @Test public void test310() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test310#3697");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test310");
    java.lang.String[] strArray5=org.apache.commons.lang.StringUtils.split("","hi!",(int)(byte)100);
    java.lang.String[] strArray6=org.apache.commons.lang.StringUtils.stripAll(strArray5);
    int int7=org.apache.commons.lang.StringUtils.lastIndexOfAny("Aaaaaaaaa",strArray5);
    int int8=org.apache.commons.lang.StringUtils.indexOfAny("                                ",strArray5);
    java.lang.String str12=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray5,"4",0,(int)(short)0);
    java.lang.String[] strArray14=org.apache.commons.lang.StringUtils.stripAll(strArray5,"  ################################");
    org.junit.Assert.assertNotNull(strArray5);
    org.junit.Assert.assertNotNull(strArray6);
    org.junit.Assert.assertTrue("'" + int7 + "' != '"+ (-1)+ "'",int7 == (-1));
    org.junit.Assert.assertTrue("'" + int8 + "' != '"+ (-1)+ "'",int8 == (-1));
    org.junit.Assert.assertTrue("'" + str12 + "' != '"+ ""+ "'",str12.equals(""));
    org.junit.Assert.assertNotNull(strArray14);
  }
  @Test public void test311() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test311#3715");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test311");
    try {
      java.math.BigDecimal bigDecimal1=org.apache.commons.lang.math.NumberUtils.createBigDecimal("                       HI!");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test312() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test312#3726");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test312");
    java.lang.String str2=org.apache.commons.lang.StringUtils.stripEnd("","                                                                                              !Ih");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test313() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test313#3734");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test313");
    java.lang.String[] strArray1=org.apache.commons.lang.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    org.junit.Assert.assertNotNull(strArray1);
  }
  @Test public void test314() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test314#3742");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test314");
    byte[] byteArray3=new byte[]{(byte)100,(byte)0,(byte)100};
    byte[] byteArray6=new byte[]{(byte)-1,(byte)-1};
    boolean boolean7=org.apache.commons.lang.math.NumberUtils.equals(byteArray3,byteArray6);
    byte byte8=org.apache.commons.lang.math.NumberUtils.min(byteArray3);
    byte byte9=org.apache.commons.lang.math.NumberUtils.max(byteArray3);
    byte byte10=org.apache.commons.lang.math.NumberUtils.min(byteArray3);
    byte[] byteArray14=new byte[]{(byte)100,(byte)0,(byte)100};
    byte[] byteArray17=new byte[]{(byte)-1,(byte)-1};
    boolean boolean18=org.apache.commons.lang.math.NumberUtils.equals(byteArray14,byteArray17);
    byte byte19=org.apache.commons.lang.math.NumberUtils.max(byteArray17);
    boolean boolean20=org.apache.commons.lang.math.NumberUtils.equals(byteArray3,byteArray17);
    byte byte21=org.apache.commons.lang.math.NumberUtils.max(byteArray3);
    byte[] byteArray22=null;
    byte[] byteArray26=new byte[]{(byte)100,(byte)0,(byte)100};
    byte[] byteArray29=new byte[]{(byte)-1,(byte)-1};
    boolean boolean30=org.apache.commons.lang.math.NumberUtils.equals(byteArray26,byteArray29);
    boolean boolean31=org.apache.commons.lang.math.NumberUtils.equals(byteArray22,byteArray29);
    byte[] byteArray35=new byte[]{(byte)100,(byte)0,(byte)100};
    byte[] byteArray38=new byte[]{(byte)-1,(byte)-1};
    boolean boolean39=org.apache.commons.lang.math.NumberUtils.equals(byteArray35,byteArray38);
    byte byte40=org.apache.commons.lang.math.NumberUtils.min(byteArray38);
    boolean boolean41=org.apache.commons.lang.math.NumberUtils.equals(byteArray29,byteArray38);
    byte[] byteArray42=null;
    byte[] byteArray46=new byte[]{(byte)100,(byte)0,(byte)100};
    byte[] byteArray49=new byte[]{(byte)-1,(byte)-1};
    boolean boolean50=org.apache.commons.lang.math.NumberUtils.equals(byteArray46,byteArray49);
    boolean boolean51=org.apache.commons.lang.math.NumberUtils.equals(byteArray42,byteArray49);
    byte[] byteArray55=new byte[]{(byte)100,(byte)0,(byte)100};
    byte[] byteArray58=new byte[]{(byte)-1,(byte)-1};
    boolean boolean59=org.apache.commons.lang.math.NumberUtils.equals(byteArray55,byteArray58);
    byte byte60=org.apache.commons.lang.math.NumberUtils.min(byteArray58);
    boolean boolean61=org.apache.commons.lang.math.NumberUtils.equals(byteArray49,byteArray58);
    byte[] byteArray62=null;
    byte[] byteArray66=new byte[]{(byte)100,(byte)0,(byte)100};
    byte[] byteArray69=new byte[]{(byte)-1,(byte)-1};
    boolean boolean70=org.apache.commons.lang.math.NumberUtils.equals(byteArray66,byteArray69);
    boolean boolean71=org.apache.commons.lang.math.NumberUtils.equals(byteArray62,byteArray69);
    byte[] byteArray75=new byte[]{(byte)100,(byte)0,(byte)100};
    byte[] byteArray78=new byte[]{(byte)-1,(byte)-1};
    boolean boolean79=org.apache.commons.lang.math.NumberUtils.equals(byteArray75,byteArray78);
    byte byte80=org.apache.commons.lang.math.NumberUtils.min(byteArray78);
    boolean boolean81=org.apache.commons.lang.math.NumberUtils.equals(byteArray69,byteArray78);
    boolean boolean82=org.apache.commons.lang.math.NumberUtils.equals(byteArray49,byteArray69);
    byte byte83=org.apache.commons.lang.math.NumberUtils.max(byteArray49);
    boolean boolean84=org.apache.commons.lang.math.NumberUtils.equals(byteArray29,byteArray49);
    byte byte85=org.apache.commons.lang.math.NumberUtils.max(byteArray29);
    boolean boolean86=org.apache.commons.lang.math.NumberUtils.equals(byteArray3,byteArray29);
    org.junit.Assert.assertNotNull(byteArray3);
    org.junit.Assert.assertNotNull(byteArray6);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '"+ false+ "'",boolean7 == false);
    org.junit.Assert.assertTrue("'" + byte8 + "' != '"+ (byte)0+ "'",byte8 == (byte)0);
    org.junit.Assert.assertTrue("'" + byte9 + "' != '"+ (byte)100+ "'",byte9 == (byte)100);
    org.junit.Assert.assertTrue("'" + byte10 + "' != '"+ (byte)0+ "'",byte10 == (byte)0);
    org.junit.Assert.assertNotNull(byteArray14);
    org.junit.Assert.assertNotNull(byteArray17);
    org.junit.Assert.assertTrue("'" + boolean18 + "' != '"+ false+ "'",boolean18 == false);
    org.junit.Assert.assertTrue("'" + byte19 + "' != '"+ (byte)-1+ "'",byte19 == (byte)-1);
    org.junit.Assert.assertTrue("'" + boolean20 + "' != '"+ false+ "'",boolean20 == false);
    org.junit.Assert.assertTrue("'" + byte21 + "' != '"+ (byte)100+ "'",byte21 == (byte)100);
    org.junit.Assert.assertNotNull(byteArray26);
    org.junit.Assert.assertNotNull(byteArray29);
    org.junit.Assert.assertTrue("'" + boolean30 + "' != '"+ false+ "'",boolean30 == false);
    org.junit.Assert.assertTrue("'" + boolean31 + "' != '"+ false+ "'",boolean31 == false);
    org.junit.Assert.assertNotNull(byteArray35);
    org.junit.Assert.assertNotNull(byteArray38);
    org.junit.Assert.assertTrue("'" + boolean39 + "' != '"+ false+ "'",boolean39 == false);
    org.junit.Assert.assertTrue("'" + byte40 + "' != '"+ (byte)-1+ "'",byte40 == (byte)-1);
    org.junit.Assert.assertTrue("'" + boolean41 + "' != '"+ true+ "'",boolean41 == true);
    org.junit.Assert.assertNotNull(byteArray46);
    org.junit.Assert.assertNotNull(byteArray49);
    org.junit.Assert.assertTrue("'" + boolean50 + "' != '"+ false+ "'",boolean50 == false);
    org.junit.Assert.assertTrue("'" + boolean51 + "' != '"+ false+ "'",boolean51 == false);
    org.junit.Assert.assertNotNull(byteArray55);
    org.junit.Assert.assertNotNull(byteArray58);
    org.junit.Assert.assertTrue("'" + boolean59 + "' != '"+ false+ "'",boolean59 == false);
    org.junit.Assert.assertTrue("'" + byte60 + "' != '"+ (byte)-1+ "'",byte60 == (byte)-1);
    org.junit.Assert.assertTrue("'" + boolean61 + "' != '"+ true+ "'",boolean61 == true);
    org.junit.Assert.assertNotNull(byteArray66);
    org.junit.Assert.assertNotNull(byteArray69);
    org.junit.Assert.assertTrue("'" + boolean70 + "' != '"+ false+ "'",boolean70 == false);
    org.junit.Assert.assertTrue("'" + boolean71 + "' != '"+ false+ "'",boolean71 == false);
    org.junit.Assert.assertNotNull(byteArray75);
    org.junit.Assert.assertNotNull(byteArray78);
    org.junit.Assert.assertTrue("'" + boolean79 + "' != '"+ false+ "'",boolean79 == false);
    org.junit.Assert.assertTrue("'" + byte80 + "' != '"+ (byte)-1+ "'",byte80 == (byte)-1);
    org.junit.Assert.assertTrue("'" + boolean81 + "' != '"+ true+ "'",boolean81 == true);
    org.junit.Assert.assertTrue("'" + boolean82 + "' != '"+ true+ "'",boolean82 == true);
    org.junit.Assert.assertTrue("'" + byte83 + "' != '"+ (byte)-1+ "'",byte83 == (byte)-1);
    org.junit.Assert.assertTrue("'" + boolean84 + "' != '"+ true+ "'",boolean84 == true);
    org.junit.Assert.assertTrue("'" + byte85 + "' != '"+ (byte)-1+ "'",byte85 == (byte)-1);
    org.junit.Assert.assertTrue("'" + boolean86 + "' != '"+ false+ "'",boolean86 == false);
  }
  @Test public void test315() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test315#3839");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test315");
    double[] doubleArray5=new double[]{(-1.0d),41,24.0d,36,48L};
    double double6=org.apache.commons.lang.math.NumberUtils.min(doubleArray5);
    double double7=org.apache.commons.lang.math.NumberUtils.max(doubleArray5);
    double double8=org.apache.commons.lang.math.NumberUtils.max(doubleArray5);
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertTrue("'" + double6 + "' != '"+ (-1.0d)+ "'",double6 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double7 + "' != '"+ 48.0d+ "'",double7 == 48.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '"+ 48.0d+ "'",double8 == 48.0d);
  }
  @Test public void test316() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test316#3853");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test316");
    int int2=org.apache.commons.lang.StringUtils.indexOf("aaaaaaaaa ","Aaaaaaaaa                          ");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test317() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test317#3861");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test317");
    java.lang.String[] strArray3=org.apache.commons.lang.StringUtils.split("Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai"," a hia a hia a hia a hia a hia a hia           ",0);
    org.junit.Assert.assertNotNull(strArray3);
  }
  @Test public void test318() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test318#3869");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test318");
    java.lang.String str3=org.apache.commons.lang.StringUtils.substringBetween("####################","AAAAAAAAAAAAAAAAAAAA","AAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAA a");
    org.junit.Assert.assertNull(str3);
  }
  @Test public void test319() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test319#3877");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test319");
    java.lang.String str1=org.apache.commons.lang.StringUtils.stripToNull("4444444444444          444444444444444444444444444444444444");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "4444444444444          444444444444444444444444444444444444"+ "'",str1.equals("4444444444444          444444444444444444444444444444444444"));
  }
  @Test public void test320() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test320#3885");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test320");
    boolean boolean2=org.apache.commons.lang.StringUtils.containsNone("aAHI!","");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ true+ "'",boolean2 == true);
  }
  @Test public void test321() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test321#3893");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test321");
    double double3=org.apache.commons.lang.math.NumberUtils.max((double)4,(double)98,(double)'#');
    org.junit.Assert.assertTrue("'" + double3 + "' != '"+ 98.0d+ "'",double3 == 98.0d);
  }
  @Test public void test322() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test322#3901");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test322");
    float[] floatArray6=new float[]{10L,(short)10,0.0f,' ',(-1),'4'};
    float float7=org.apache.commons.lang.math.NumberUtils.min(floatArray6);
    float[] floatArray14=new float[]{(-1.0f),0,96,94,(byte)-1,(-1)};
    float[] floatArray19=new float[]{10,(byte)1,1L,(byte)-1};
    float float20=org.apache.commons.lang.math.NumberUtils.max(floatArray19);
    boolean boolean21=org.apache.commons.lang.math.NumberUtils.equals(floatArray14,floatArray19);
    float[] floatArray25=new float[]{(byte)-1,(-1.0f),(byte)100};
    float float26=org.apache.commons.lang.math.NumberUtils.max(floatArray25);
    float[] floatArray28=new float[]{(byte)1};
    float float29=org.apache.commons.lang.math.NumberUtils.max(floatArray28);
    boolean boolean30=org.apache.commons.lang.math.NumberUtils.equals(floatArray25,floatArray28);
    boolean boolean31=org.apache.commons.lang.math.NumberUtils.equals(floatArray19,floatArray28);
    boolean boolean32=org.apache.commons.lang.math.NumberUtils.equals(floatArray6,floatArray28);
    float float33=org.apache.commons.lang.math.NumberUtils.max(floatArray28);
    float float34=org.apache.commons.lang.math.NumberUtils.max(floatArray28);
    org.junit.Assert.assertNotNull(floatArray6);
    org.junit.Assert.assertTrue("'" + float7 + "' != '"+ (-1.0f)+ "'",float7 == (-1.0f));
    org.junit.Assert.assertNotNull(floatArray14);
    org.junit.Assert.assertNotNull(floatArray19);
    org.junit.Assert.assertTrue("'" + float20 + "' != '"+ 10.0f+ "'",float20 == 10.0f);
    org.junit.Assert.assertTrue("'" + boolean21 + "' != '"+ false+ "'",boolean21 == false);
    org.junit.Assert.assertNotNull(floatArray25);
    org.junit.Assert.assertTrue("'" + float26 + "' != '"+ 100.0f+ "'",float26 == 100.0f);
    org.junit.Assert.assertNotNull(floatArray28);
    org.junit.Assert.assertTrue("'" + float29 + "' != '"+ 1.0f+ "'",float29 == 1.0f);
    org.junit.Assert.assertTrue("'" + boolean30 + "' != '"+ false+ "'",boolean30 == false);
    org.junit.Assert.assertTrue("'" + boolean31 + "' != '"+ false+ "'",boolean31 == false);
    org.junit.Assert.assertTrue("'" + boolean32 + "' != '"+ false+ "'",boolean32 == false);
    org.junit.Assert.assertTrue("'" + float33 + "' != '"+ 1.0f+ "'",float33 == 1.0f);
    org.junit.Assert.assertTrue("'" + float34 + "' != '"+ 1.0f+ "'",float34 == 1.0f);
  }
  @Test public void test323() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test323#3937");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test323");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.split("                                                                                                    ",'4');
    java.lang.String str4=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray2,"                                ");
    org.junit.Assert.assertNotNull(strArray2);
    org.junit.Assert.assertTrue("'" + str4 + "' != '"+ "                                                                                                    "+ "'",str4.equals("                                                                                                    "));
  }
  @Test public void test324() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test324#3947");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test324");
    java.lang.Object[] objArray0=null;
    java.lang.String str4=org.apache.commons.lang.StringUtils.join(objArray0,"AAAAAAAAAAAAAAAAAAAA   AAAAAAAA                                       HI!",19,0);
    org.junit.Assert.assertNull(str4);
  }
  @Test public void test325() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test325#3956");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test325");
    java.lang.String[] strArray3=org.apache.commons.lang.StringUtils.splitPreserveAllTokens("!i aaaaaaaaa!i aaaaaaaaa!i aaaaaaaaa!i aaaaaaaaa!i aaaaaaaaaaaaaaaaaa                          !i aaaaaaaaa!i aaaaaaaaa!i aaaaaaaaa!i aaaaaaaaa!i aaaaaaaaa!","4444444444444444444444444444444444444444444444444444444444Hi!###################################A4444444444444444444444444444444444444444444444444444444444",63);
    org.junit.Assert.assertNotNull(strArray3);
  }
  @Test public void test326() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test326#3964");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test326");
    java.lang.String str2=org.apache.commons.lang.StringUtils.left("",47);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test327() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test327#3972");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test327");
    try {
      java.lang.Double double1=org.apache.commons.lang.math.NumberUtils.createDouble("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test328() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test328#3983");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test328");
    java.lang.String str1=org.apache.commons.lang.StringUtils.capitaliseAllWords("4444444hI AAAAAAAAA");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "4444444hI AAAAAAAAA"+ "'",str1.equals("4444444hI AAAAAAAAA"));
  }
  @Test public void test329() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test329#3991");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test329");
    boolean boolean1=org.apache.commons.lang.StringUtils.isNumericSpace("44444444444444444444444         AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaa");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test330() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test330#3999");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test330");
    boolean boolean2=org.apache.commons.lang.StringUtils.contains(" AAAAAAa a a a a a a a a a a a a a a a a  a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a ","                                            !I AAAAAAAAA                                            ");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test331() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test331#4007");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test331");
    java.lang.String[] strArray3=org.apache.commons.lang.StringUtils.splitPreserveAllTokens("aAAAAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAI!"," aaaaaa",54);
    org.junit.Assert.assertNotNull(strArray3);
  }
  @Test public void test332() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test332#4015");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test332");
    java.lang.String str2=org.apache.commons.lang.StringUtils.stripStart("Hi!","A########                          ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "Hi!"+ "'",str2.equals("Hi!"));
  }
  @Test public void test333() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test333#4023");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test333");
    float float1=org.apache.commons.lang.math.NumberUtils.toFloat(" a hia a hia a hia a hia a hia a hia           ");
    org.junit.Assert.assertTrue("'" + float1 + "' != '"+ 0.0f+ "'",float1 == 0.0f);
  }
  @Test public void test334() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test334#4031");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test334");
    java.lang.String str2=org.apache.commons.lang.StringUtils.prechomp("44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..","A########                          ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih.."+ "'",str2.equals("44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih..44444..!ih.."));
  }
  @Test public void test335() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test335#4039");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test335");
    java.lang.String str3=org.apache.commons.lang.StringUtils.mid("                                                                                                ",895,104);
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ ""+ "'",str3.equals(""));
  }
  @Test public void test336() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test336#4047");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test336");
    java.lang.String str2=org.apache.commons.lang.StringUtils.getChomp("aaa ","aaaaaa");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test337() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test337#4055");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test337");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.splitPreserveAllTokens("... !ih...aaaaaaaaaaaaaaaaaaaa                                ",'a');
    org.junit.Assert.assertNotNull(strArray2);
  }
  @Test public void test338() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test338#4063");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test338");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringAfter("A... !ih...aaaaaaaaaaaaaaaaaaaaaa Aaaaaaaaa AaaaaaaAAAAAAAAA A... !ih...aaaaaaaaaaaaaaaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!    ","");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "A... !ih...aaaaaaaaaaaaaaaaaaaaaa Aaaaaaaaa AaaaaaaAAAAAAAAA A... !ih...aaaaaaaaaaaaaaaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!    "+ "'",str2.equals("A... !ih...aaaaaaaaaaaaaaaaaaaaaa Aaaaaaaaa AaaaaaaAAAAAAAAA A... !ih...aaaaaaaaaaaaaaaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!    "));
  }
  @Test public void test339() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test339#4071");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test339");
    int int2=org.apache.commons.lang.StringUtils.indexOfDifference("4444444444444444444444444444444444444444444444444444444444Hi!###################################A4444444444444444444444444444444444444444444444444444444444","Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 0+ "'",int2 == 0);
  }
  @Test public void test340() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test340#4079");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test340");
    int int3=org.apache.commons.lang.math.NumberUtils.max(51,90,88);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ 90+ "'",int3 == 90);
  }
  @Test public void test341() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test341#4087");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test341");
    int int2=org.apache.commons.lang.StringUtils.lastIndexOf("               ...                          ...               ...                          ...               ...                          ...               ...                          ...               ...                          ...               ...                          ...               ...                          ...               ...                          ...               ...                          ...               ...                          ...               ...                          ...               ...                          ...               ...                          ...               ...                          ...               ...                          ...               ...                          ...               ...                          ...               ...                          ...               ...                          ...               ...                          ...               ...                          ...               ...                          ...               ...                          ...               ...                          ...               ...                          ...               ...                          ...               ...                          ...","");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 1269+ "'",int2 == 1269);
  }
  @Test public void test342() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test342#4095");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test342");
    java.lang.String str1=org.apache.commons.lang.StringUtils.swapCase("            hi!            ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "            HI!            "+ "'",str1.equals("            HI!            "));
  }
  @Test public void test343() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test343#4103");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test343");
    double double3=org.apache.commons.lang.math.NumberUtils.max(3.0d,(double)3L,(double)34L);
    org.junit.Assert.assertTrue("'" + double3 + "' != '"+ 34.0d+ "'",double3 == 34.0d);
  }
  @Test public void test344() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test344#4111");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test344");
    short short3=org.apache.commons.lang.math.NumberUtils.max((short)(byte)10,(short)(byte)1,(short)0);
    org.junit.Assert.assertTrue("'" + short3 + "' != '"+ (short)10+ "'",short3 == (short)10);
  }
  @Test public void test345() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test345#4119");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test345");
    java.lang.String str3=org.apache.commons.lang.StringUtils.replaceChars("Aa hi!","","aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaa");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "Aa hi!"+ "'",str3.equals("Aa hi!"));
  }
  @Test public void test346() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test346#4127");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test346");
    boolean boolean2=org.apache.commons.lang.StringUtils.contains("A4 ","");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ true+ "'",boolean2 == true);
  }
  @Test public void test347() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test347#4135");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test347");
    long long1=org.apache.commons.lang.math.NumberUtils.toLong("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!");
    org.junit.Assert.assertTrue("'" + long1 + "' != '"+ 0L+ "'",long1 == 0L);
  }
  @Test public void test348() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test348#4143");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test348");
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
    float float24=org.apache.commons.lang.math.NumberUtils.min(floatArray20);
    float[] floatArray31=new float[]{(-1.0f),0,96,94,(byte)-1,(-1)};
    float[] floatArray36=new float[]{10,(byte)1,1L,(byte)-1};
    float float37=org.apache.commons.lang.math.NumberUtils.max(floatArray36);
    boolean boolean38=org.apache.commons.lang.math.NumberUtils.equals(floatArray31,floatArray36);
    boolean boolean39=org.apache.commons.lang.math.NumberUtils.equals(floatArray20,floatArray31);
    float float40=org.apache.commons.lang.math.NumberUtils.max(floatArray31);
    float[] floatArray47=new float[]{(-1.0f),0,96,94,(byte)-1,(-1)};
    float[] floatArray52=new float[]{10,(byte)1,1L,(byte)-1};
    float float53=org.apache.commons.lang.math.NumberUtils.max(floatArray52);
    boolean boolean54=org.apache.commons.lang.math.NumberUtils.equals(floatArray47,floatArray52);
    boolean boolean55=org.apache.commons.lang.math.NumberUtils.equals(floatArray31,floatArray47);
    float float56=org.apache.commons.lang.math.NumberUtils.max(floatArray47);
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
    org.junit.Assert.assertTrue("'" + float24 + "' != '"+ 1.0f+ "'",float24 == 1.0f);
    org.junit.Assert.assertNotNull(floatArray31);
    org.junit.Assert.assertNotNull(floatArray36);
    org.junit.Assert.assertTrue("'" + float37 + "' != '"+ 10.0f+ "'",float37 == 10.0f);
    org.junit.Assert.assertTrue("'" + boolean38 + "' != '"+ false+ "'",boolean38 == false);
    org.junit.Assert.assertTrue("'" + boolean39 + "' != '"+ false+ "'",boolean39 == false);
    org.junit.Assert.assertTrue("'" + float40 + "' != '"+ 96.0f+ "'",float40 == 96.0f);
    org.junit.Assert.assertNotNull(floatArray47);
    org.junit.Assert.assertNotNull(floatArray52);
    org.junit.Assert.assertTrue("'" + float53 + "' != '"+ 10.0f+ "'",float53 == 10.0f);
    org.junit.Assert.assertTrue("'" + boolean54 + "' != '"+ false+ "'",boolean54 == false);
    org.junit.Assert.assertTrue("'" + boolean55 + "' != '"+ true+ "'",boolean55 == true);
    org.junit.Assert.assertTrue("'" + float56 + "' != '"+ 96.0f+ "'",float56 == 96.0f);
  }
  @Test public void test349() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test349#4195");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test349");
    int int2=org.apache.commons.lang.StringUtils.indexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",' ');
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test350() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test350#4203");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test350");
    java.lang.String str1=org.apache.commons.lang.StringUtils.uncapitalize("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"+ "'",str1.equals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
  }
  @Test public void test351() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test351#4211");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test351");
    int int2=org.apache.commons.lang.StringUtils.indexOfDifference("aaaa...","AAAAAAAAAAAAAAAAAAAAAAAAAA");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 0+ "'",int2 == 0);
  }
  @Test public void test352() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test352#4219");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test352");
    boolean boolean1=org.apache.commons.lang.StringUtils.isWhitespace("AAAAAAAAAAAAAAAAAAAA  aAAAAAAAA                                       HI!");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test353() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test353#4227");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test353");
    java.lang.String str1=org.apache.commons.lang.StringUtils.chop("aA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "aA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaa"+ "'",str1.equals("aA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaa"));
  }
  @Test public void test354() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test354#4235");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test354");
    java.lang.String str3=org.apache.commons.lang.StringUtils.abbreviate("aaa aaa aaa aaa aaa aaa aaa aaa aaa aaa aaa aaa aaa aaa aaa aaa aaa aaaaaaaaaaaaaaaaaaaa",108,156);
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "aaa aaa aaa aaa aaa aaa aaa aaa aaa aaa aaa aaa aaa aaa aaa aaa aaa aaaaaaaaaaaaaaaaaaaa"+ "'",str3.equals("aaa aaa aaa aaa aaa aaa aaa aaa aaa aaa aaa aaa aaa aaa aaa aaa aaa aaaaaaaaaaaaaaaaaaaa"));
  }
  @Test public void test355() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test355#4243");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test355");
    double double2=org.apache.commons.lang.math.NumberUtils.toDouble("          aaaaaaaaaaaaaaaaaaaa                                                        ",(double)(byte)100);
    org.junit.Assert.assertTrue("'" + double2 + "' != '"+ 100.0d+ "'",double2 == 100.0d);
  }
  @Test public void test356() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test356#4251");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test356");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.splitByWholeSeparator("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!"," aa");
    org.junit.Assert.assertNotNull(strArray2);
  }
  @Test public void test357() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test357#4259");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test357");
    try {
      java.lang.Long long1=org.apache.commons.lang.math.NumberUtils.createLong("                       AAAAAAAAA");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                       AAAAAAAAA\"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test358() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test358#4270");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test358");
    java.lang.String str1=org.apache.commons.lang.StringUtils.uncapitalize("44444444444444444444444         AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaa");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "44444444444444444444444         AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaa"+ "'",str1.equals("44444444444444444444444         AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaa"));
  }
  @Test public void test359() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test359#4278");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test359");
    java.lang.String[] strArray3=org.apache.commons.lang.StringUtils.splitPreserveAllTokens("#################...",'#');
    java.lang.String str4=org.apache.commons.lang.StringUtils.concatenate((java.lang.Object[])strArray3);
    java.lang.String str5=org.apache.commons.lang.StringUtils.concatenate((java.lang.Object[])strArray3);
    int int6=org.apache.commons.lang.StringUtils.indexOfAny("hA         A         A        #############################aaaaaaaaaaaaaaaaaaaa##Aaaaaaaa#############################################################aaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaahA         A         A         A         A         A         A         A         A         A       i!##a##a#",strArray3);
    org.junit.Assert.assertNotNull(strArray3);
    org.junit.Assert.assertTrue("'" + str4 + "' != '"+ "..."+ "'",str4.equals("..."));
    org.junit.Assert.assertTrue("'" + str5 + "' != '"+ "..."+ "'",str5.equals("..."));
    org.junit.Assert.assertTrue("'" + int6 + "' != '"+ 0+ "'",int6 == 0);
  }
  @Test public void test360() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test360#4292");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test360");
    java.lang.String str3=org.apache.commons.lang.StringUtils.mid("... !ih...                                ",1269,0);
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ ""+ "'",str3.equals(""));
  }
  @Test public void test361() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test361#4300");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test361");
    int int3=org.apache.commons.lang.StringUtils.lastIndexOf("h#################...#################...#################...#################...#######",'a',20);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test362() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test362#4308");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test362");
    long long2=org.apache.commons.lang.math.NumberUtils.toLong("... !ih...                                ",(long)48);
    org.junit.Assert.assertTrue("'" + long2 + "' != '"+ 48L+ "'",long2 == 48L);
  }
  @Test public void test363() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test363#4316");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test363");
    int int2=org.apache.commons.lang.StringUtils.indexOf("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAI!","Aa hi!Aa hi!Aa hi!Aa ...");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test364() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test364#4324");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test364");
    long[] longArray0=null;
    long[] longArray2=new long[]{'#'};
    long[] longArray6=new long[]{97,(-1),' '};
    boolean boolean7=org.apache.commons.lang.math.NumberUtils.equals(longArray2,longArray6);
    long long8=org.apache.commons.lang.math.NumberUtils.max(longArray2);
    boolean boolean9=org.apache.commons.lang.math.NumberUtils.equals(longArray0,longArray2);
    long[] longArray11=new long[]{'#'};
    long[] longArray15=new long[]{97,(-1),' '};
    boolean boolean16=org.apache.commons.lang.math.NumberUtils.equals(longArray11,longArray15);
    long long17=org.apache.commons.lang.math.NumberUtils.max(longArray11);
    long long18=org.apache.commons.lang.math.NumberUtils.min(longArray11);
    long long19=org.apache.commons.lang.math.NumberUtils.max(longArray11);
    boolean boolean20=org.apache.commons.lang.math.NumberUtils.equals(longArray2,longArray11);
    long[] longArray22=new long[]{'#'};
    long[] longArray26=new long[]{97,(-1),' '};
    boolean boolean27=org.apache.commons.lang.math.NumberUtils.equals(longArray22,longArray26);
    long long28=org.apache.commons.lang.math.NumberUtils.max(longArray26);
    long long29=org.apache.commons.lang.math.NumberUtils.max(longArray26);
    long long30=org.apache.commons.lang.math.NumberUtils.min(longArray26);
    long long31=org.apache.commons.lang.math.NumberUtils.max(longArray26);
    long[] longArray34=new long[]{1,97};
    long long35=org.apache.commons.lang.math.NumberUtils.min(longArray34);
    boolean boolean36=org.apache.commons.lang.math.NumberUtils.equals(longArray26,longArray34);
    boolean boolean37=org.apache.commons.lang.math.NumberUtils.equals(longArray11,longArray34);
    long long38=org.apache.commons.lang.math.NumberUtils.min(longArray34);
    long long39=org.apache.commons.lang.math.NumberUtils.max(longArray34);
    org.junit.Assert.assertNotNull(longArray2);
    org.junit.Assert.assertNotNull(longArray6);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '"+ false+ "'",boolean7 == false);
    org.junit.Assert.assertTrue("'" + long8 + "' != '"+ 35L+ "'",long8 == 35L);
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '"+ false+ "'",boolean9 == false);
    org.junit.Assert.assertNotNull(longArray11);
    org.junit.Assert.assertNotNull(longArray15);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '"+ false+ "'",boolean16 == false);
    org.junit.Assert.assertTrue("'" + long17 + "' != '"+ 35L+ "'",long17 == 35L);
    org.junit.Assert.assertTrue("'" + long18 + "' != '"+ 35L+ "'",long18 == 35L);
    org.junit.Assert.assertTrue("'" + long19 + "' != '"+ 35L+ "'",long19 == 35L);
    org.junit.Assert.assertTrue("'" + boolean20 + "' != '"+ true+ "'",boolean20 == true);
    org.junit.Assert.assertNotNull(longArray22);
    org.junit.Assert.assertNotNull(longArray26);
    org.junit.Assert.assertTrue("'" + boolean27 + "' != '"+ false+ "'",boolean27 == false);
    org.junit.Assert.assertTrue("'" + long28 + "' != '"+ 97L+ "'",long28 == 97L);
    org.junit.Assert.assertTrue("'" + long29 + "' != '"+ 97L+ "'",long29 == 97L);
    org.junit.Assert.assertTrue("'" + long30 + "' != '"+ (-1L)+ "'",long30 == (-1L));
    org.junit.Assert.assertTrue("'" + long31 + "' != '"+ 97L+ "'",long31 == 97L);
    org.junit.Assert.assertNotNull(longArray34);
    org.junit.Assert.assertTrue("'" + long35 + "' != '"+ 1L+ "'",long35 == 1L);
    org.junit.Assert.assertTrue("'" + boolean36 + "' != '"+ false+ "'",boolean36 == false);
    org.junit.Assert.assertTrue("'" + boolean37 + "' != '"+ false+ "'",boolean37 == false);
    org.junit.Assert.assertTrue("'" + long38 + "' != '"+ 1L+ "'",long38 == 1L);
    org.junit.Assert.assertTrue("'" + long39 + "' != '"+ 97L+ "'",long39 == 97L);
  }
  @Test public void test365() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test365#4381");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test365");
    java.lang.String[] strArray3=org.apache.commons.lang.StringUtils.split("                             Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!","aaaaaaaaa i!");
    java.lang.String[] strArray4=org.apache.commons.lang.StringUtils.stripAll(strArray3);
    int int5=org.apache.commons.lang.StringUtils.lastIndexOfAny("aAHI",strArray3);
    org.junit.Assert.assertNotNull(strArray3);
    org.junit.Assert.assertNotNull(strArray4);
    org.junit.Assert.assertTrue("'" + int5 + "' != '"+ 1+ "'",int5 == 1);
  }
  @Test public void test366() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test366#4393");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test366");
    java.lang.String str2=org.apache.commons.lang.StringUtils.remove("aaaaaaai!",'4');
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "aaaaaaai!"+ "'",str2.equals("aaaaaaai!"));
  }
  @Test public void test367() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test367#4401");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test367");
    java.lang.String str2=org.apache.commons.lang.StringUtils.defaultString("AAAAAAAAAAAAAAAAAAAA##aAAAAAAAAAAAAAAAAAAAA##aA","");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "AAAAAAAAAAAAAAAAAAAA##aAAAAAAAAAAAAAAAAAAAA##aA"+ "'",str2.equals("AAAAAAAAAAAAAAAAAAAA##aAAAAAAAAAAAAAAAAAAAA##aA"));
  }
  @Test public void test368() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test368#4409");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test368");
    java.lang.String str3=org.apache.commons.lang.StringUtils.leftPad("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",24,' ');
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"+ "'",str3.equals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
  }
  @Test public void test369() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test369#4417");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test369");
    boolean boolean2=org.apache.commons.lang.StringUtils.equals("4444444444444          444444444444444444444444444444444444"," aa");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test370() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test370#4425");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test370");
    java.lang.String[] strArray1=org.apache.commons.lang.StringUtils.split("                                                                                                 ##A");
    org.junit.Assert.assertNotNull(strArray1);
  }
  @Test public void test371() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test371#4433");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test371");
    java.lang.String str2=org.apache.commons.lang.StringUtils.stripStart("AAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAA aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa","                                                                                   aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "AAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAA aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"+ "'",str2.equals("AAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAA aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
  }
  @Test public void test372() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test372#4441");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test372");
    try {
      java.math.BigInteger bigInteger1=org.apache.commons.lang.math.NumberUtils.createBigInteger("aaaaaaaaaa           4            ");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaaaaa\"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test373() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test373#4452");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test373");
    java.lang.String str3=org.apache.commons.lang.StringUtils.rightPad(" AAAAAAAAA",12,'4');
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ " AAAAAAAAA44"+ "'",str3.equals(" AAAAAAAAA44"));
  }
  @Test public void test374() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test374#4460");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test374");
    java.lang.String str3=org.apache.commons.lang.StringUtils.rightPad("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh",(-1),'#');
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh"+ "'",str3.equals("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh"));
  }
  @Test public void test375() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test375#4468");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test375");
    float[] floatArray6=new float[]{10L,(short)10,0.0f,' ',(-1),'4'};
    float float7=org.apache.commons.lang.math.NumberUtils.min(floatArray6);
    float[] floatArray14=new float[]{(-1.0f),0,96,94,(byte)-1,(-1)};
    float[] floatArray19=new float[]{10,(byte)1,1L,(byte)-1};
    float float20=org.apache.commons.lang.math.NumberUtils.max(floatArray19);
    boolean boolean21=org.apache.commons.lang.math.NumberUtils.equals(floatArray14,floatArray19);
    float[] floatArray25=new float[]{(byte)-1,(-1.0f),(byte)100};
    float float26=org.apache.commons.lang.math.NumberUtils.max(floatArray25);
    float[] floatArray28=new float[]{(byte)1};
    float float29=org.apache.commons.lang.math.NumberUtils.max(floatArray28);
    boolean boolean30=org.apache.commons.lang.math.NumberUtils.equals(floatArray25,floatArray28);
    boolean boolean31=org.apache.commons.lang.math.NumberUtils.equals(floatArray19,floatArray28);
    boolean boolean32=org.apache.commons.lang.math.NumberUtils.equals(floatArray6,floatArray28);
    float float33=org.apache.commons.lang.math.NumberUtils.min(floatArray6);
    float[] floatArray35=new float[]{(byte)1};
    float float36=org.apache.commons.lang.math.NumberUtils.max(floatArray35);
    float[] floatArray40=new float[]{(byte)-1,(-1.0f),(byte)100};
    float float41=org.apache.commons.lang.math.NumberUtils.max(floatArray40);
    boolean boolean42=org.apache.commons.lang.math.NumberUtils.equals(floatArray35,floatArray40);
    float[] floatArray44=new float[]{(byte)1};
    float float45=org.apache.commons.lang.math.NumberUtils.max(floatArray44);
    float[] floatArray49=new float[]{(byte)-1,(-1.0f),(byte)100};
    float float50=org.apache.commons.lang.math.NumberUtils.max(floatArray49);
    boolean boolean51=org.apache.commons.lang.math.NumberUtils.equals(floatArray44,floatArray49);
    boolean boolean52=org.apache.commons.lang.math.NumberUtils.equals(floatArray35,floatArray49);
    float[] floatArray54=new float[]{(byte)1};
    float float55=org.apache.commons.lang.math.NumberUtils.max(floatArray54);
    float[] floatArray59=new float[]{(byte)-1,(-1.0f),(byte)100};
    float float60=org.apache.commons.lang.math.NumberUtils.max(floatArray59);
    boolean boolean61=org.apache.commons.lang.math.NumberUtils.equals(floatArray54,floatArray59);
    float[] floatArray63=new float[]{(byte)1};
    float float64=org.apache.commons.lang.math.NumberUtils.max(floatArray63);
    float[] floatArray68=new float[]{(byte)-1,(-1.0f),(byte)100};
    float float69=org.apache.commons.lang.math.NumberUtils.max(floatArray68);
    boolean boolean70=org.apache.commons.lang.math.NumberUtils.equals(floatArray63,floatArray68);
    boolean boolean71=org.apache.commons.lang.math.NumberUtils.equals(floatArray54,floatArray68);
    boolean boolean72=org.apache.commons.lang.math.NumberUtils.equals(floatArray35,floatArray68);
    float float73=org.apache.commons.lang.math.NumberUtils.max(floatArray35);
    float[] floatArray78=new float[]{10,(byte)1,1L,(byte)-1};
    float float79=org.apache.commons.lang.math.NumberUtils.max(floatArray78);
    float float80=org.apache.commons.lang.math.NumberUtils.max(floatArray78);
    boolean boolean81=org.apache.commons.lang.math.NumberUtils.equals(floatArray35,floatArray78);
    boolean boolean82=org.apache.commons.lang.math.NumberUtils.equals(floatArray6,floatArray35);
    org.junit.Assert.assertNotNull(floatArray6);
    org.junit.Assert.assertTrue("'" + float7 + "' != '"+ (-1.0f)+ "'",float7 == (-1.0f));
    org.junit.Assert.assertNotNull(floatArray14);
    org.junit.Assert.assertNotNull(floatArray19);
    org.junit.Assert.assertTrue("'" + float20 + "' != '"+ 10.0f+ "'",float20 == 10.0f);
    org.junit.Assert.assertTrue("'" + boolean21 + "' != '"+ false+ "'",boolean21 == false);
    org.junit.Assert.assertNotNull(floatArray25);
    org.junit.Assert.assertTrue("'" + float26 + "' != '"+ 100.0f+ "'",float26 == 100.0f);
    org.junit.Assert.assertNotNull(floatArray28);
    org.junit.Assert.assertTrue("'" + float29 + "' != '"+ 1.0f+ "'",float29 == 1.0f);
    org.junit.Assert.assertTrue("'" + boolean30 + "' != '"+ false+ "'",boolean30 == false);
    org.junit.Assert.assertTrue("'" + boolean31 + "' != '"+ false+ "'",boolean31 == false);
    org.junit.Assert.assertTrue("'" + boolean32 + "' != '"+ false+ "'",boolean32 == false);
    org.junit.Assert.assertTrue("'" + float33 + "' != '"+ (-1.0f)+ "'",float33 == (-1.0f));
    org.junit.Assert.assertNotNull(floatArray35);
    org.junit.Assert.assertTrue("'" + float36 + "' != '"+ 1.0f+ "'",float36 == 1.0f);
    org.junit.Assert.assertNotNull(floatArray40);
    org.junit.Assert.assertTrue("'" + float41 + "' != '"+ 100.0f+ "'",float41 == 100.0f);
    org.junit.Assert.assertTrue("'" + boolean42 + "' != '"+ false+ "'",boolean42 == false);
    org.junit.Assert.assertNotNull(floatArray44);
    org.junit.Assert.assertTrue("'" + float45 + "' != '"+ 1.0f+ "'",float45 == 1.0f);
    org.junit.Assert.assertNotNull(floatArray49);
    org.junit.Assert.assertTrue("'" + float50 + "' != '"+ 100.0f+ "'",float50 == 100.0f);
    org.junit.Assert.assertTrue("'" + boolean51 + "' != '"+ false+ "'",boolean51 == false);
    org.junit.Assert.assertTrue("'" + boolean52 + "' != '"+ false+ "'",boolean52 == false);
    org.junit.Assert.assertNotNull(floatArray54);
    org.junit.Assert.assertTrue("'" + float55 + "' != '"+ 1.0f+ "'",float55 == 1.0f);
    org.junit.Assert.assertNotNull(floatArray59);
    org.junit.Assert.assertTrue("'" + float60 + "' != '"+ 100.0f+ "'",float60 == 100.0f);
    org.junit.Assert.assertTrue("'" + boolean61 + "' != '"+ false+ "'",boolean61 == false);
    org.junit.Assert.assertNotNull(floatArray63);
    org.junit.Assert.assertTrue("'" + float64 + "' != '"+ 1.0f+ "'",float64 == 1.0f);
    org.junit.Assert.assertNotNull(floatArray68);
    org.junit.Assert.assertTrue("'" + float69 + "' != '"+ 100.0f+ "'",float69 == 100.0f);
    org.junit.Assert.assertTrue("'" + boolean70 + "' != '"+ false+ "'",boolean70 == false);
    org.junit.Assert.assertTrue("'" + boolean71 + "' != '"+ false+ "'",boolean71 == false);
    org.junit.Assert.assertTrue("'" + boolean72 + "' != '"+ false+ "'",boolean72 == false);
    org.junit.Assert.assertTrue("'" + float73 + "' != '"+ 1.0f+ "'",float73 == 1.0f);
    org.junit.Assert.assertNotNull(floatArray78);
    org.junit.Assert.assertTrue("'" + float79 + "' != '"+ 10.0f+ "'",float79 == 10.0f);
    org.junit.Assert.assertTrue("'" + float80 + "' != '"+ 10.0f+ "'",float80 == 10.0f);
    org.junit.Assert.assertTrue("'" + boolean81 + "' != '"+ false+ "'",boolean81 == false);
    org.junit.Assert.assertTrue("'" + boolean82 + "' != '"+ false+ "'",boolean82 == false);
  }
  @Test public void test376() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test376#4560");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test376");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaa##Aaaaaaaaa",' ');
    java.lang.String str4=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray2,"                          aaaaaaaaA");
    org.junit.Assert.assertNotNull(strArray2);
    org.junit.Assert.assertTrue("'" + str4 + "' != '"+ "aaaaaaaaaaaaaaaaaaaa##Aaaaaaaaa"+ "'",str4.equals("aaaaaaaaaaaaaaaaaaaa##Aaaaaaaaa"));
  }
  @Test public void test377() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test377#4570");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test377");
    java.lang.String[] strArray3=org.apache.commons.lang.StringUtils.split("##A##A#!ih","");
    int int4=org.apache.commons.lang.StringUtils.indexOfAny("...                                          ...",strArray3);
    java.lang.String str5=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray3);
    org.junit.Assert.assertNotNull(strArray3);
    org.junit.Assert.assertTrue("'" + int4 + "' != '"+ (-1)+ "'",int4 == (-1));
    org.junit.Assert.assertTrue("'" + str5 + "' != '"+ "##A##A#!ih"+ "'",str5.equals("##A##A#!ih"));
  }
  @Test public void test378() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test378#4582");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test378");
    java.lang.String str2=org.apache.commons.lang.StringUtils.reverseDelimited("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",'a');
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test379() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test379#4590");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test379");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAlphanumericSpace("Hi!                                                                                              ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test380() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test380#4598");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test380");
    java.lang.String str3=org.apache.commons.lang.StringUtils.substring("!ih...AaaaaaaaaAaaaaaaaaAaaaaaaaaAa...!",28,97);
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "aaaaaAa...!"+ "'",str3.equals("aaaaaAa...!"));
  }
  @Test public void test381() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test381#4606");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test381");
    java.lang.String[] strArray3=org.apache.commons.lang.StringUtils.splitByWholeSeparator("4444444Hi!","Aaaaaaaaa ",(int)(byte)100);
    java.lang.String[] strArray5=org.apache.commons.lang.StringUtils.stripAll(strArray3,"... !ih..                                           ");
    java.lang.String str7=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray3,'#');
    org.junit.Assert.assertNotNull(strArray3);
    org.junit.Assert.assertNotNull(strArray5);
    org.junit.Assert.assertTrue("'" + str7 + "' != '"+ "4444444Hi!"+ "'",str7.equals("4444444Hi!"));
  }
  @Test public void test382() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test382#4618");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test382");
    int int3=org.apache.commons.lang.StringUtils.indexOf("                                 ... !ih...aaaaaaaaaaaaaaaaaaaa                                ",'a',(int)'4');
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ 52+ "'",int3 == 52);
  }
  @Test public void test383() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test383#4626");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test383");
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
    int[] intArray39=null;
    boolean boolean40=org.apache.commons.lang.math.NumberUtils.equals(intArray35,intArray39);
    int[] intArray43=new int[]{100,1};
    int[] intArray50=new int[]{(byte)-1,100,(short)0,100,'#',100};
    boolean boolean51=org.apache.commons.lang.math.NumberUtils.equals(intArray43,intArray50);
    int[] intArray58=new int[]{'4',(short)100,(short)100,52,(byte)1,(short)100};
    boolean boolean59=org.apache.commons.lang.math.NumberUtils.equals(intArray50,intArray58);
    int int60=org.apache.commons.lang.math.NumberUtils.max(intArray58);
    boolean boolean61=org.apache.commons.lang.math.NumberUtils.equals(intArray39,intArray58);
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
    org.junit.Assert.assertTrue("'" + boolean40 + "' != '"+ false+ "'",boolean40 == false);
    org.junit.Assert.assertNotNull(intArray43);
    org.junit.Assert.assertNotNull(intArray50);
    org.junit.Assert.assertTrue("'" + boolean51 + "' != '"+ false+ "'",boolean51 == false);
    org.junit.Assert.assertNotNull(intArray58);
    org.junit.Assert.assertTrue("'" + boolean59 + "' != '"+ false+ "'",boolean59 == false);
    org.junit.Assert.assertTrue("'" + int60 + "' != '"+ 100+ "'",int60 == 100);
    org.junit.Assert.assertTrue("'" + boolean61 + "' != '"+ false+ "'",boolean61 == false);
  }
  @Test public void test384() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test384#4673");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test384");
    java.lang.String str3=org.apache.commons.lang.StringUtils.abbreviate("Hi!####",97,93);
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "Hi!####"+ "'",str3.equals("Hi!####"));
  }
  @Test public void test385() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test385#4681");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test385");
    java.lang.String str1=org.apache.commons.lang.StringUtils.chop("hA         A         A         A         A         A         A         A         A         A       i!##a##a#");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "hA         A         A         A         A         A         A         A         A         A       i!##a##a"+ "'",str1.equals("hA         A         A         A         A         A         A         A         A         A       i!##a##a"));
  }
  @Test public void test386() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test386#4689");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test386");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substring(" aaaaaa...",0);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ " aaaaaa..."+ "'",str2.equals(" aaaaaa..."));
  }
  @Test public void test387() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test387#4697");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test387");
    try {
      java.math.BigInteger bigInteger1=org.apache.commons.lang.math.NumberUtils.createBigInteger("hi!                         ...");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi! \"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test388() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test388#4708");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test388");
    java.lang.String str1=org.apache.commons.lang.StringUtils.upperCase("      aa        aa        aa        aA!ih");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "      AA        AA        AA        AA!IH"+ "'",str1.equals("      AA        AA        AA        AA!IH"));
  }
  @Test public void test389() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test389#4716");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test389");
    boolean boolean1=org.apache.commons.lang.StringUtils.isNotEmpty("                                               hi!                                              ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test390() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test390#4724");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test390");
    java.lang.String str2=org.apache.commons.lang.StringUtils.defaultIfEmpty("Aaaaaaaaa                          ","aaaaaaaaa a                                                                                        aaaaaaaaa a                                                 !ih                                                A a  a                                                                                                 ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "Aaaaaaaaa                          "+ "'",str2.equals("Aaaaaaaaa                          "));
  }
  @Test public void test391() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test391#4732");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test391");
    java.lang.String str2=org.apache.commons.lang.StringUtils.remove("Aa hi!Aa hi!Aa hi!Aa ...","          aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "Aa hi!Aa hi!Aa hi!Aa ..."+ "'",str2.equals("Aa hi!Aa hi!Aa hi!Aa ..."));
  }
  @Test public void test392() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test392#4740");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test392");
    long long1=org.apache.commons.lang.math.NumberUtils.toLong("...                                    !i                                             ");
    org.junit.Assert.assertTrue("'" + long1 + "' != '"+ 0L+ "'",long1 == 0L);
  }
  @Test public void test393() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test393#4748");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test393");
    java.lang.String str1=org.apache.commons.lang.StringUtils.capitaliseAllWords("##Aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "##Aaaaaaaaa"+ "'",str1.equals("##Aaaaaaaaa"));
  }
  @Test public void test394() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test394#4756");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test394");
    java.lang.String[] strArray4=org.apache.commons.lang.StringUtils.split("","hi!",(int)(byte)100);
    java.lang.String str5=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray4);
    java.lang.String[] strArray7=org.apache.commons.lang.StringUtils.stripAll(strArray4,"                                   ");
    java.lang.String str11=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray4,'#',52,0);
    java.lang.String str12=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray4);
    int int13=org.apache.commons.lang.StringUtils.lastIndexOfAny("HHHHHHHHHHHHHHHHHHHHH",strArray4);
    org.junit.Assert.assertNotNull(strArray4);
    org.junit.Assert.assertTrue("'" + str5 + "' != '"+ ""+ "'",str5.equals(""));
    org.junit.Assert.assertNotNull(strArray7);
    org.junit.Assert.assertTrue("'" + str11 + "' != '"+ ""+ "'",str11.equals(""));
    org.junit.Assert.assertTrue("'" + str12 + "' != '"+ ""+ "'",str12.equals(""));
    org.junit.Assert.assertTrue("'" + int13 + "' != '"+ (-1)+ "'",int13 == (-1));
  }
  @Test public void test395() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test395#4774");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test395");
    java.lang.String str2=org.apache.commons.lang.StringUtils.defaultIfEmpty(" AAAAAAAAA44","aAHI");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ " AAAAAAAAA44"+ "'",str2.equals(" AAAAAAAAA44"));
  }
  @Test public void test396() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test396#4782");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test396");
    int int2=org.apache.commons.lang.StringUtils.lastIndexOf("4444444hI!AAAAAAAAA                                                                                        ",'4');
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 6+ "'",int2 == 6);
  }
  @Test public void test397() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test397#4790");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test397");
    java.lang.String str3=org.apache.commons.lang.StringUtils.mid("A4 ",156,(int)(short)1);
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ ""+ "'",str3.equals(""));
  }
  @Test public void test398() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test398#4798");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test398");
    java.util.Iterator iterator0=null;
    java.lang.String str2=org.apache.commons.lang.StringUtils.join(iterator0,"#######################################################################################             ");
    org.junit.Assert.assertNull(str2);
  }
  @Test public void test399() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test399#4807");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test399");
    java.lang.String str2=org.apache.commons.lang.StringUtils.removeStart(""," 4            ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test400() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test400#4815");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test400");
    try {
      java.lang.String str3=org.apache.commons.lang.StringUtils.abbreviate("AAAAAAAAA",0,0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
    }
 catch (    java.lang.IllegalArgumentException e) {
    }
  }
  @Test public void test401() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test401#4826");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test401");
    int int2=org.apache.commons.lang.math.NumberUtils.compare((double)43L,(double)' ');
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 1+ "'",int2 == 1);
  }
  @Test public void test402() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test402#4834");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test402");
    long[] longArray4=new long[]{10L,35L,'#',1L};
    long long5=org.apache.commons.lang.math.NumberUtils.min(longArray4);
    long[] longArray7=new long[]{'#'};
    long[] longArray11=new long[]{97,(-1),' '};
    boolean boolean12=org.apache.commons.lang.math.NumberUtils.equals(longArray7,longArray11);
    long long13=org.apache.commons.lang.math.NumberUtils.max(longArray7);
    boolean boolean14=org.apache.commons.lang.math.NumberUtils.equals(longArray4,longArray7);
    long long15=org.apache.commons.lang.math.NumberUtils.max(longArray7);
    long long16=org.apache.commons.lang.math.NumberUtils.min(longArray7);
    org.junit.Assert.assertNotNull(longArray4);
    org.junit.Assert.assertTrue("'" + long5 + "' != '"+ 1L+ "'",long5 == 1L);
    org.junit.Assert.assertNotNull(longArray7);
    org.junit.Assert.assertNotNull(longArray11);
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '"+ false+ "'",boolean12 == false);
    org.junit.Assert.assertTrue("'" + long13 + "' != '"+ 35L+ "'",long13 == 35L);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '"+ false+ "'",boolean14 == false);
    org.junit.Assert.assertTrue("'" + long15 + "' != '"+ 35L+ "'",long15 == 35L);
    org.junit.Assert.assertTrue("'" + long16 + "' != '"+ 35L+ "'",long16 == 35L);
  }
  @Test public void test403() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test403#4858");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test403");
    java.lang.String str1=org.apache.commons.lang.StringUtils.chopNewline("AaaaaaaaaAaaaaaaaaAaaaaaaaaAa");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "AaaaaaaaaAaaaaaaaaAaaaaaaaaAa"+ "'",str1.equals("AaaaaaaaaAaaaaaaaaAaaaaaaaaAa"));
  }
  @Test public void test404() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test404#4866");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test404");
    float float3=org.apache.commons.lang.math.NumberUtils.min((float)(byte)0,(float)895L,(float)(byte)0);
    org.junit.Assert.assertTrue("'" + float3 + "' != '"+ 0.0f+ "'",float3 == 0.0f);
  }
  @Test public void test405() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test405#4874");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test405");
    try {
      java.lang.Number number1=org.apache.commons.lang.math.NumberUtils.createNumber("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                         HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                         HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa is not a valid number.");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test406() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test406#4885");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test406");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAlphaSpace("                                                HI!");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test407() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test407#4893");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test407");
    java.lang.String[] strArray1=org.apache.commons.lang.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    org.junit.Assert.assertNotNull(strArray1);
  }
  @Test public void test408() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test408#4901");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test408");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.splitPreserveAllTokens("...                                          HI!",'4');
    org.junit.Assert.assertNotNull(strArray2);
  }
  @Test public void test409() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test409#4909");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test409");
    java.lang.String str1=org.apache.commons.lang.StringUtils.deleteWhitespace("                     4444444Hi!                     ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "4444444Hi!"+ "'",str1.equals("4444444Hi!"));
  }
  @Test public void test410() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test410#4917");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test410");
    java.lang.String str1=org.apache.commons.lang.StringUtils.capitaliseAllWords("                         HI!");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "                         HI!"+ "'",str1.equals("                         HI!"));
  }
  @Test public void test411() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test411#4925");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test411");
    java.lang.String str1=org.apache.commons.lang.StringUtils.uncapitalise("                                                                                       aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "                                                                                       aaaaaaaaa "+ "'",str1.equals("                                                                                       aaaaaaaaa "));
  }
  @Test public void test412() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test412#4933");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test412");
    long long3=org.apache.commons.lang.math.NumberUtils.max(0L,(long)51,(long)99);
    org.junit.Assert.assertTrue("'" + long3 + "' != '"+ 99L+ "'",long3 == 99L);
  }
  @Test public void test413() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test413#4941");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test413");
    java.lang.String[] strArray3=org.apache.commons.lang.StringUtils.split("                                                 !ih                                                ","                                              hi",29);
    java.lang.Class<?> wildcardClass4=strArray3.getClass();
    org.junit.Assert.assertNotNull(strArray3);
    org.junit.Assert.assertNotNull(wildcardClass4);
  }
  @Test public void test414() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test414#4951");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test414");
    java.lang.String str2=org.apache.commons.lang.StringUtils.leftPad("aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa",(int)(byte)-1);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa"+ "'",str2.equals("aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa"));
  }
  @Test public void test415() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test415#4959");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test415");
    java.lang.String str2=org.apache.commons.lang.StringUtils.getPrechomp("4444444444444444444444444444444444444444444444444444444444Hi!###################################A4444444444444444444444444444444444444444444444444444444444","AAAAAAAAAAi!");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test416() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test416#4967");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test416");
    int int2=org.apache.commons.lang.math.NumberUtils.compare((double)87,(double)91);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test417() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test417#4975");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test417");
    java.lang.String str2=org.apache.commons.lang.StringUtils.repeat("AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaai",6);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaiAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaiAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaiAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaiAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaiAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaai"+ "'",str2.equals("AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaiAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaiAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaiAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaiAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaiAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaai"));
  }
  @Test public void test418() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test418#4983");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test418");
    int int3=org.apache.commons.lang.StringUtils.lastIndexOf("!i Aaaaaaaaa                                                                                                                                               ",' ',890);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ 154+ "'",int3 == 154);
  }
  @Test public void test419() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test419#4991");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test419");
    java.lang.String str2=org.apache.commons.lang.StringUtils.abbreviate("4444444444444444444444444444444444                                4444444444444444444444444444444444",43);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "4444444444444444444444444444444444      ..."+ "'",str2.equals("4444444444444444444444444444444444      ..."));
  }
  @Test public void test420() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test420#4999");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test420");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringBefore("##########################################                         i!","444444444444444444444444444                                              hi!          ...");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "##########################################                         i!"+ "'",str2.equals("##########################################                         i!"));
  }
  @Test public void test421() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test421#5007");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test421");
    double double3=org.apache.commons.lang.math.NumberUtils.min(156.0d,(double)24L,(double)35.0f);
    org.junit.Assert.assertTrue("'" + double3 + "' != '"+ 24.0d+ "'",double3 == 24.0d);
  }
  @Test public void test422() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test422#5015");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test422");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringBetween("                                    aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa                                       hi!                                                ","aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    org.junit.Assert.assertNull(str2);
  }
  @Test public void test423() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test423#5023");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test423");
    int int2=org.apache.commons.lang.StringUtils.indexOf("###                     Aaaaaaaaa                                                                                        ",'a');
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 25+ "'",int2 == 25);
  }
  @Test public void test424() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test424#5031");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test424");
    float float1=org.apache.commons.lang.math.NumberUtils.toFloat("                                                                 ");
    org.junit.Assert.assertTrue("'" + float1 + "' != '"+ 0.0f+ "'",float1 == 0.0f);
  }
  @Test public void test425() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test425#5039");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test425");
    double double3=org.apache.commons.lang.math.NumberUtils.max((double)4.0f,27.0d,(double)24.0f);
    org.junit.Assert.assertTrue("'" + double3 + "' != '"+ 27.0d+ "'",double3 == 27.0d);
  }
  @Test public void test426() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test426#5047");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test426");
    java.lang.String str2=org.apache.commons.lang.StringUtils.remove("aaaaaaaaa i!            ",'4');
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "aaaaaaaaa i!            "+ "'",str2.equals("aaaaaaaaa i!            "));
  }
  @Test public void test427() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test427#5055");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test427");
    java.lang.String str3=org.apache.commons.lang.StringUtils.rightPad("...              ...",(int)(byte)0,"");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "...              ..."+ "'",str3.equals("...              ..."));
  }
  @Test public void test428() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test428#5063");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test428");
    int int1=org.apache.commons.lang.math.NumberUtils.stringToInt("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    org.junit.Assert.assertTrue("'" + int1 + "' != '"+ 0+ "'",int1 == 0);
  }
  @Test public void test429() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test429#5071");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test429");
    float float2=org.apache.commons.lang.math.NumberUtils.toFloat("   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",(float)35);
    org.junit.Assert.assertTrue("'" + float2 + "' != '"+ 35.0f+ "'",float2 == 35.0f);
  }
  @Test public void test430() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test430#5079");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test430");
    try {
      java.lang.Float float1=org.apache.commons.lang.math.NumberUtils.createFloat("aaaaaaaaaa           4            ");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaaaaaaaa           4\"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test431() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test431#5090");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test431");
    boolean boolean1=org.apache.commons.lang.StringUtils.isNotBlank("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test432() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test432#5098");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test432");
    int int2=org.apache.commons.lang.StringUtils.lastIndexOf("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai","44444444444444444444444        ");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test433() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test433#5106");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test433");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.split("aaaaaaaaa                                                                                        ","aaaaaaaaa");
    java.lang.String[] strArray4=org.apache.commons.lang.StringUtils.stripAll(strArray2,"4444444444444444444444444444444444...");
    try {
      java.lang.String str8=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray2,"                                              hi",(int)(short)0,90);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
    }
 catch (    java.lang.ArrayIndexOutOfBoundsException e) {
    }
    org.junit.Assert.assertNotNull(strArray2);
    org.junit.Assert.assertNotNull(strArray4);
  }
  @Test public void test434() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test434#5121");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test434");
    short short3=org.apache.commons.lang.math.NumberUtils.min((short)0,(short)0,(short)0);
    org.junit.Assert.assertTrue("'" + short3 + "' != '"+ (short)0+ "'",short3 == (short)0);
  }
  @Test public void test435() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test435#5129");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test435");
    byte[] byteArray0=null;
    byte[] byteArray4=new byte[]{(byte)100,(byte)0,(byte)100};
    byte[] byteArray7=new byte[]{(byte)-1,(byte)-1};
    boolean boolean8=org.apache.commons.lang.math.NumberUtils.equals(byteArray4,byteArray7);
    boolean boolean9=org.apache.commons.lang.math.NumberUtils.equals(byteArray0,byteArray7);
    byte[] byteArray13=new byte[]{(byte)100,(byte)0,(byte)100};
    byte[] byteArray16=new byte[]{(byte)-1,(byte)-1};
    boolean boolean17=org.apache.commons.lang.math.NumberUtils.equals(byteArray13,byteArray16);
    byte byte18=org.apache.commons.lang.math.NumberUtils.min(byteArray16);
    boolean boolean19=org.apache.commons.lang.math.NumberUtils.equals(byteArray7,byteArray16);
    byte[] byteArray20=null;
    byte[] byteArray24=new byte[]{(byte)100,(byte)0,(byte)100};
    byte[] byteArray27=new byte[]{(byte)-1,(byte)-1};
    boolean boolean28=org.apache.commons.lang.math.NumberUtils.equals(byteArray24,byteArray27);
    boolean boolean29=org.apache.commons.lang.math.NumberUtils.equals(byteArray20,byteArray27);
    byte[] byteArray33=new byte[]{(byte)100,(byte)0,(byte)100};
    byte[] byteArray36=new byte[]{(byte)-1,(byte)-1};
    boolean boolean37=org.apache.commons.lang.math.NumberUtils.equals(byteArray33,byteArray36);
    byte byte38=org.apache.commons.lang.math.NumberUtils.min(byteArray36);
    boolean boolean39=org.apache.commons.lang.math.NumberUtils.equals(byteArray27,byteArray36);
    boolean boolean40=org.apache.commons.lang.math.NumberUtils.equals(byteArray7,byteArray27);
    byte[] byteArray44=new byte[]{(byte)100,(byte)0,(byte)100};
    byte[] byteArray47=new byte[]{(byte)-1,(byte)-1};
    boolean boolean48=org.apache.commons.lang.math.NumberUtils.equals(byteArray44,byteArray47);
    byte byte49=org.apache.commons.lang.math.NumberUtils.min(byteArray44);
    byte byte50=org.apache.commons.lang.math.NumberUtils.max(byteArray44);
    byte byte51=org.apache.commons.lang.math.NumberUtils.min(byteArray44);
    byte byte52=org.apache.commons.lang.math.NumberUtils.min(byteArray44);
    boolean boolean53=org.apache.commons.lang.math.NumberUtils.equals(byteArray27,byteArray44);
    org.junit.Assert.assertNotNull(byteArray4);
    org.junit.Assert.assertNotNull(byteArray7);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '"+ false+ "'",boolean8 == false);
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '"+ false+ "'",boolean9 == false);
    org.junit.Assert.assertNotNull(byteArray13);
    org.junit.Assert.assertNotNull(byteArray16);
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '"+ false+ "'",boolean17 == false);
    org.junit.Assert.assertTrue("'" + byte18 + "' != '"+ (byte)-1+ "'",byte18 == (byte)-1);
    org.junit.Assert.assertTrue("'" + boolean19 + "' != '"+ true+ "'",boolean19 == true);
    org.junit.Assert.assertNotNull(byteArray24);
    org.junit.Assert.assertNotNull(byteArray27);
    org.junit.Assert.assertTrue("'" + boolean28 + "' != '"+ false+ "'",boolean28 == false);
    org.junit.Assert.assertTrue("'" + boolean29 + "' != '"+ false+ "'",boolean29 == false);
    org.junit.Assert.assertNotNull(byteArray33);
    org.junit.Assert.assertNotNull(byteArray36);
    org.junit.Assert.assertTrue("'" + boolean37 + "' != '"+ false+ "'",boolean37 == false);
    org.junit.Assert.assertTrue("'" + byte38 + "' != '"+ (byte)-1+ "'",byte38 == (byte)-1);
    org.junit.Assert.assertTrue("'" + boolean39 + "' != '"+ true+ "'",boolean39 == true);
    org.junit.Assert.assertTrue("'" + boolean40 + "' != '"+ true+ "'",boolean40 == true);
    org.junit.Assert.assertNotNull(byteArray44);
    org.junit.Assert.assertNotNull(byteArray47);
    org.junit.Assert.assertTrue("'" + boolean48 + "' != '"+ false+ "'",boolean48 == false);
    org.junit.Assert.assertTrue("'" + byte49 + "' != '"+ (byte)0+ "'",byte49 == (byte)0);
    org.junit.Assert.assertTrue("'" + byte50 + "' != '"+ (byte)100+ "'",byte50 == (byte)100);
    org.junit.Assert.assertTrue("'" + byte51 + "' != '"+ (byte)0+ "'",byte51 == (byte)0);
    org.junit.Assert.assertTrue("'" + byte52 + "' != '"+ (byte)0+ "'",byte52 == (byte)0);
    org.junit.Assert.assertTrue("'" + boolean53 + "' != '"+ false+ "'",boolean53 == false);
  }
  @Test public void test436() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test436#5191");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test436");
    java.lang.Double double1=org.apache.commons.lang.math.NumberUtils.createDouble("44444444444444444444444        ");
    org.junit.Assert.assertTrue("'" + double1 + "' != '"+ 4.4444444444444445E22d+ "'",double1.equals(4.4444444444444445E22d));
  }
  @Test public void test437() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test437#5199");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test437");
    java.lang.String str2=org.apache.commons.lang.StringUtils.difference("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!","aaaaaaaaaaaaaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test438() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test438#5207");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test438");
    java.lang.String str1=org.apache.commons.lang.StringUtils.deleteSpaces("            HI!            ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "HI!"+ "'",str1.equals("HI!"));
  }
  @Test public void test439() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test439#5215");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test439");
    java.lang.String str2=org.apache.commons.lang.StringUtils.reverseDelimited("                                               hi!                                              ",'#');
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                                               hi!                                              "+ "'",str2.equals("                                               hi!                                              "));
  }
  @Test public void test440() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test440#5223");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test440");
    boolean boolean2=org.apache.commons.lang.StringUtils.containsIgnoreCase("a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a","               ");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test441() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test441#5231");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test441");
    java.lang.String str2=org.apache.commons.lang.StringUtils.remove("aaaa","");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "aaaa"+ "'",str2.equals("aaaa"));
  }
  @Test public void test442() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test442#5239");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test442");
    java.lang.String str1=org.apache.commons.lang.StringUtils.swapCase("                             aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaa");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "                             AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAA"+ "'",str1.equals("                             AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAA"));
  }
  @Test public void test443() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test443#5247");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test443");
    java.lang.String str4=org.apache.commons.lang.StringUtils.overlay("... !ih..","aaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa",(int)'#',7);
    org.junit.Assert.assertTrue("'" + str4 + "' != '"+ "... !ihaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa"+ "'",str4.equals("... !ihaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa"));
  }
  @Test public void test444() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test444#5255");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test444");
    java.lang.String str3=org.apache.commons.lang.StringUtils.rightPad("          #############################################################################",154,"    ...");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "          #############################################################################    ...    ...    ...    ...    ...    ...    ...    ...    ...    "+ "'",str3.equals("          #############################################################################    ...    ...    ...    ...    ...    ...    ...    ...    ...    "));
  }
  @Test public void test445() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test445#5263");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test445");
    java.lang.String[] strArray1=org.apache.commons.lang.StringUtils.split("aaaaaaa                                                    aaaaaaaaaaaaaaaaaaaa");
    org.junit.Assert.assertNotNull(strArray1);
  }
  @Test public void test446() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test446#5271");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test446");
    boolean boolean2=org.apache.commons.lang.StringUtils.containsIgnoreCase("Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai"," i!a                                          ");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test447() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test447#5279");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test447");
    java.lang.String[] strArray3=org.apache.commons.lang.StringUtils.split("H","4444444...",96);
    org.junit.Assert.assertNotNull(strArray3);
  }
  @Test public void test448() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test448#5287");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test448");
    java.lang.String str2=org.apache.commons.lang.StringUtils.chomp("aaa aaa aaa aaa aaa aaa aaa aaa aaa aaa aaa aaa aaa aaa aaa aaa aaa aaaaaaaaaaaaaaaaaaaa"," aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "aaa aaa aaa aaa aaa aaa aaa aaa aaa aaa aaa aaa aaa aaa aaa aaa aaa aaaaaaaaaaaaaaaaaaaa"+ "'",str2.equals("aaa aaa aaa aaa aaa aaa aaa aaa aaa aaa aaa aaa aaa aaa aaa aaa aaa aaaaaaaaaaaaaaaaaaaa"));
  }
  @Test public void test449() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test449#5295");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test449");
    java.lang.String str1=org.apache.commons.lang.StringUtils.defaultString("Aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "Aaaaaaaaa "+ "'",str1.equals("Aaaaaaaaa "));
  }
  @Test public void test450() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test450#5303");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test450");
    java.lang.String str3=org.apache.commons.lang.StringUtils.rightPad("A                                                HI!",80,"");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "A                                                HI!                            "+ "'",str3.equals("A                                                HI!                            "));
  }
  @Test public void test451() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test451#5311");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test451");
    java.lang.String str1=org.apache.commons.lang.StringUtils.defaultString("4444444hi!aaaaaaaaa                                                                                        ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "4444444hi!aaaaaaaaa                                                                                        "+ "'",str1.equals("4444444hi!aaaaaaaaa                                                                                        "));
  }
  @Test public void test452() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test452#5319");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test452");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAsciiPrintable("aaaaa");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test453() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test453#5327");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test453");
    boolean boolean1=org.apache.commons.lang.StringUtils.isNotBlank("AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test454() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test454#5335");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test454");
    java.lang.String str4=org.apache.commons.lang.StringUtils.replace("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                         HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa","Hi!   #######################################################################################             ######       A","                                                 !ih                                                ",(-1));
    org.junit.Assert.assertTrue("'" + str4 + "' != '"+ "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                         HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"+ "'",str4.equals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                         HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
  }
  @Test public void test455() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test455#5343");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test455");
    java.lang.String str2=org.apache.commons.lang.StringUtils.prechomp("                     4444444Hi!                     ","");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                     4444444Hi!                     "+ "'",str2.equals("                     4444444Hi!                     "));
  }
  @Test public void test456() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test456#5351");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test456");
    java.lang.String[] strArray1=null;
    int int2=org.apache.commons.lang.StringUtils.indexOfAny("                                            aaaaaaaaa i!                                            ",strArray1);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test457() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test457#5360");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test457");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringBefore("aaaaaaaaaaaaaaaaaaaa##Aaaaaaaa","");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test458() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test458#5368");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test458");
    java.lang.String[] strArray4=org.apache.commons.lang.StringUtils.split("","hi!",(int)(byte)100);
    java.lang.String[] strArray5=org.apache.commons.lang.StringUtils.stripAll(strArray4);
    java.lang.String str7=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray4,'#');
    int int8=org.apache.commons.lang.StringUtils.lastIndexOfAny(" aaaaaa",strArray4);
    org.junit.Assert.assertNotNull(strArray4);
    org.junit.Assert.assertNotNull(strArray5);
    org.junit.Assert.assertTrue("'" + str7 + "' != '"+ ""+ "'",str7.equals(""));
    org.junit.Assert.assertTrue("'" + int8 + "' != '"+ (-1)+ "'",int8 == (-1));
  }
  @Test public void test459() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test459#5382");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test459");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringBefore("                                                                           ","#################################### aaaaaa");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                                                                           "+ "'",str2.equals("                                                                           "));
  }
  @Test public void test460() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test460#5390");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test460");
    java.lang.String str2=org.apache.commons.lang.StringUtils.left("                                                                                                     ... !ih",51);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                                                   "+ "'",str2.equals("                                                   "));
  }
  @Test public void test461() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test461#5398");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test461");
    java.lang.String str2=org.apache.commons.lang.StringUtils.getNestedString("         A","aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                         HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    org.junit.Assert.assertNull(str2);
  }
  @Test public void test462() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test462#5406");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test462");
    java.lang.String str2=org.apache.commons.lang.StringUtils.defaultIfEmpty("aaa ","                 ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "aaa "+ "'",str2.equals("aaa "));
  }
  @Test public void test463() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test463#5414");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test463");
    java.lang.String str3=org.apache.commons.lang.StringUtils.replace("4444444hI!AAAAAAAAA","aaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaa","                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "4444444hI!AAAAAAAAA"+ "'",str3.equals("4444444hI!AAAAAAAAA"));
  }
  @Test public void test464() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test464#5422");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test464");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.splitByWholeSeparator("                                                ...                          ......                                                                 ...                          ......                                                                 ...                          ......                                                                 ...                          ......                                                                 ...                          ......                                                                 ...                          ......                                                                 ...                          ......                                                                 ...                          ......                                                                 ...                          ......                                                                 ...                          ......                                                                 ...                          ......                                                                 ...                          ......                                                                 ...                          ......                 ","#a##ahA         A         A         A         A         A         A         A         A         A       i!##");
    org.junit.Assert.assertNotNull(strArray2);
  }
  @Test public void test465() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test465#5430");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test465");
    long long3=org.apache.commons.lang.math.NumberUtils.min((long)100,(long)88,80L);
    org.junit.Assert.assertTrue("'" + long3 + "' != '"+ 80L+ "'",long3 == 80L);
  }
  @Test public void test466() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test466#5438");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test466");
    long[] longArray4=new long[]{48L,0,99,(byte)0};
    long[] longArray5=null;
    long[] longArray7=new long[]{'#'};
    long[] longArray11=new long[]{97,(-1),' '};
    boolean boolean12=org.apache.commons.lang.math.NumberUtils.equals(longArray7,longArray11);
    long long13=org.apache.commons.lang.math.NumberUtils.max(longArray7);
    boolean boolean14=org.apache.commons.lang.math.NumberUtils.equals(longArray5,longArray7);
    long[] longArray16=new long[]{'#'};
    long[] longArray20=new long[]{97,(-1),' '};
    boolean boolean21=org.apache.commons.lang.math.NumberUtils.equals(longArray16,longArray20);
    long long22=org.apache.commons.lang.math.NumberUtils.max(longArray16);
    long long23=org.apache.commons.lang.math.NumberUtils.min(longArray16);
    long long24=org.apache.commons.lang.math.NumberUtils.max(longArray16);
    boolean boolean25=org.apache.commons.lang.math.NumberUtils.equals(longArray7,longArray16);
    long[] longArray28=new long[]{1,97};
    long long29=org.apache.commons.lang.math.NumberUtils.min(longArray28);
    boolean boolean30=org.apache.commons.lang.math.NumberUtils.equals(longArray7,longArray28);
    long[] longArray32=new long[]{'#'};
    long[] longArray36=new long[]{97,(-1),' '};
    boolean boolean37=org.apache.commons.lang.math.NumberUtils.equals(longArray32,longArray36);
    long[] longArray39=new long[]{'#'};
    long[] longArray43=new long[]{97,(-1),' '};
    boolean boolean44=org.apache.commons.lang.math.NumberUtils.equals(longArray39,longArray43);
    long long45=org.apache.commons.lang.math.NumberUtils.max(longArray39);
    boolean boolean46=org.apache.commons.lang.math.NumberUtils.equals(longArray36,longArray39);
    long long47=org.apache.commons.lang.math.NumberUtils.max(longArray39);
    long long48=org.apache.commons.lang.math.NumberUtils.max(longArray39);
    boolean boolean49=org.apache.commons.lang.math.NumberUtils.equals(longArray7,longArray39);
    boolean boolean50=org.apache.commons.lang.math.NumberUtils.equals(longArray4,longArray7);
    long[] longArray52=new long[]{'#'};
    long[] longArray56=new long[]{97,(-1),' '};
    boolean boolean57=org.apache.commons.lang.math.NumberUtils.equals(longArray52,longArray56);
    long long58=org.apache.commons.lang.math.NumberUtils.min(longArray56);
    boolean boolean59=org.apache.commons.lang.math.NumberUtils.equals(longArray7,longArray56);
    org.junit.Assert.assertNotNull(longArray4);
    org.junit.Assert.assertNotNull(longArray7);
    org.junit.Assert.assertNotNull(longArray11);
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '"+ false+ "'",boolean12 == false);
    org.junit.Assert.assertTrue("'" + long13 + "' != '"+ 35L+ "'",long13 == 35L);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '"+ false+ "'",boolean14 == false);
    org.junit.Assert.assertNotNull(longArray16);
    org.junit.Assert.assertNotNull(longArray20);
    org.junit.Assert.assertTrue("'" + boolean21 + "' != '"+ false+ "'",boolean21 == false);
    org.junit.Assert.assertTrue("'" + long22 + "' != '"+ 35L+ "'",long22 == 35L);
    org.junit.Assert.assertTrue("'" + long23 + "' != '"+ 35L+ "'",long23 == 35L);
    org.junit.Assert.assertTrue("'" + long24 + "' != '"+ 35L+ "'",long24 == 35L);
    org.junit.Assert.assertTrue("'" + boolean25 + "' != '"+ true+ "'",boolean25 == true);
    org.junit.Assert.assertNotNull(longArray28);
    org.junit.Assert.assertTrue("'" + long29 + "' != '"+ 1L+ "'",long29 == 1L);
    org.junit.Assert.assertTrue("'" + boolean30 + "' != '"+ false+ "'",boolean30 == false);
    org.junit.Assert.assertNotNull(longArray32);
    org.junit.Assert.assertNotNull(longArray36);
    org.junit.Assert.assertTrue("'" + boolean37 + "' != '"+ false+ "'",boolean37 == false);
    org.junit.Assert.assertNotNull(longArray39);
    org.junit.Assert.assertNotNull(longArray43);
    org.junit.Assert.assertTrue("'" + boolean44 + "' != '"+ false+ "'",boolean44 == false);
    org.junit.Assert.assertTrue("'" + long45 + "' != '"+ 35L+ "'",long45 == 35L);
    org.junit.Assert.assertTrue("'" + boolean46 + "' != '"+ false+ "'",boolean46 == false);
    org.junit.Assert.assertTrue("'" + long47 + "' != '"+ 35L+ "'",long47 == 35L);
    org.junit.Assert.assertTrue("'" + long48 + "' != '"+ 35L+ "'",long48 == 35L);
    org.junit.Assert.assertTrue("'" + boolean49 + "' != '"+ true+ "'",boolean49 == true);
    org.junit.Assert.assertTrue("'" + boolean50 + "' != '"+ false+ "'",boolean50 == false);
    org.junit.Assert.assertNotNull(longArray52);
    org.junit.Assert.assertNotNull(longArray56);
    org.junit.Assert.assertTrue("'" + boolean57 + "' != '"+ false+ "'",boolean57 == false);
    org.junit.Assert.assertTrue("'" + long58 + "' != '"+ (-1L)+ "'",long58 == (-1L));
    org.junit.Assert.assertTrue("'" + boolean59 + "' != '"+ false+ "'",boolean59 == false);
  }
  @Test public void test467() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test467#5511");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test467");
    java.lang.String str1=org.apache.commons.lang.StringUtils.chop("###                                                                                       aaaaaaaaa         ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "###                                                                                       aaaaaaaaa        "+ "'",str1.equals("###                                                                                       aaaaaaaaa        "));
  }
  @Test public void test468() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test468#5519");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test468");
    float[] floatArray6=new float[]{10L,(short)10,0.0f,' ',(-1),'4'};
    float float7=org.apache.commons.lang.math.NumberUtils.min(floatArray6);
    java.lang.Class<?> wildcardClass8=floatArray6.getClass();
    float[] floatArray15=new float[]{10L,(short)10,0.0f,' ',(-1),'4'};
    float float16=org.apache.commons.lang.math.NumberUtils.min(floatArray15);
    java.lang.Class<?> wildcardClass17=floatArray15.getClass();
    boolean boolean18=org.apache.commons.lang.math.NumberUtils.equals(floatArray6,floatArray15);
    float float19=org.apache.commons.lang.math.NumberUtils.max(floatArray15);
    float[] floatArray26=new float[]{(-1.0f),0,96,94,(byte)-1,(-1)};
    float[] floatArray31=new float[]{10,(byte)1,1L,(byte)-1};
    float float32=org.apache.commons.lang.math.NumberUtils.max(floatArray31);
    boolean boolean33=org.apache.commons.lang.math.NumberUtils.equals(floatArray26,floatArray31);
    float[] floatArray37=new float[]{(byte)-1,(-1.0f),(byte)100};
    float float38=org.apache.commons.lang.math.NumberUtils.max(floatArray37);
    float[] floatArray40=new float[]{(byte)1};
    float float41=org.apache.commons.lang.math.NumberUtils.max(floatArray40);
    boolean boolean42=org.apache.commons.lang.math.NumberUtils.equals(floatArray37,floatArray40);
    boolean boolean43=org.apache.commons.lang.math.NumberUtils.equals(floatArray31,floatArray40);
    float[] floatArray47=new float[]{(byte)-1,(-1.0f),(byte)100};
    float float48=org.apache.commons.lang.math.NumberUtils.max(floatArray47);
    float[] floatArray50=new float[]{(byte)1};
    float float51=org.apache.commons.lang.math.NumberUtils.max(floatArray50);
    boolean boolean52=org.apache.commons.lang.math.NumberUtils.equals(floatArray47,floatArray50);
    float float53=org.apache.commons.lang.math.NumberUtils.max(floatArray47);
    float[] floatArray54=null;
    boolean boolean55=org.apache.commons.lang.math.NumberUtils.equals(floatArray47,floatArray54);
    float float56=org.apache.commons.lang.math.NumberUtils.min(floatArray47);
    boolean boolean57=org.apache.commons.lang.math.NumberUtils.equals(floatArray40,floatArray47);
    float[] floatArray60=new float[]{48,4};
    float float61=org.apache.commons.lang.math.NumberUtils.max(floatArray60);
    boolean boolean62=org.apache.commons.lang.math.NumberUtils.equals(floatArray40,floatArray60);
    float[] floatArray67=new float[]{10,(byte)1,1L,(byte)-1};
    float float68=org.apache.commons.lang.math.NumberUtils.max(floatArray67);
    float float69=org.apache.commons.lang.math.NumberUtils.max(floatArray67);
    boolean boolean70=org.apache.commons.lang.math.NumberUtils.equals(floatArray60,floatArray67);
    boolean boolean71=org.apache.commons.lang.math.NumberUtils.equals(floatArray15,floatArray60);
    org.junit.Assert.assertNotNull(floatArray6);
    org.junit.Assert.assertTrue("'" + float7 + "' != '"+ (-1.0f)+ "'",float7 == (-1.0f));
    org.junit.Assert.assertNotNull(wildcardClass8);
    org.junit.Assert.assertNotNull(floatArray15);
    org.junit.Assert.assertTrue("'" + float16 + "' != '"+ (-1.0f)+ "'",float16 == (-1.0f));
    org.junit.Assert.assertNotNull(wildcardClass17);
    org.junit.Assert.assertTrue("'" + boolean18 + "' != '"+ true+ "'",boolean18 == true);
    org.junit.Assert.assertTrue("'" + float19 + "' != '"+ 52.0f+ "'",float19 == 52.0f);
    org.junit.Assert.assertNotNull(floatArray26);
    org.junit.Assert.assertNotNull(floatArray31);
    org.junit.Assert.assertTrue("'" + float32 + "' != '"+ 10.0f+ "'",float32 == 10.0f);
    org.junit.Assert.assertTrue("'" + boolean33 + "' != '"+ false+ "'",boolean33 == false);
    org.junit.Assert.assertNotNull(floatArray37);
    org.junit.Assert.assertTrue("'" + float38 + "' != '"+ 100.0f+ "'",float38 == 100.0f);
    org.junit.Assert.assertNotNull(floatArray40);
    org.junit.Assert.assertTrue("'" + float41 + "' != '"+ 1.0f+ "'",float41 == 1.0f);
    org.junit.Assert.assertTrue("'" + boolean42 + "' != '"+ false+ "'",boolean42 == false);
    org.junit.Assert.assertTrue("'" + boolean43 + "' != '"+ false+ "'",boolean43 == false);
    org.junit.Assert.assertNotNull(floatArray47);
    org.junit.Assert.assertTrue("'" + float48 + "' != '"+ 100.0f+ "'",float48 == 100.0f);
    org.junit.Assert.assertNotNull(floatArray50);
    org.junit.Assert.assertTrue("'" + float51 + "' != '"+ 1.0f+ "'",float51 == 1.0f);
    org.junit.Assert.assertTrue("'" + boolean52 + "' != '"+ false+ "'",boolean52 == false);
    org.junit.Assert.assertTrue("'" + float53 + "' != '"+ 100.0f+ "'",float53 == 100.0f);
    org.junit.Assert.assertTrue("'" + boolean55 + "' != '"+ false+ "'",boolean55 == false);
    org.junit.Assert.assertTrue("'" + float56 + "' != '"+ (-1.0f)+ "'",float56 == (-1.0f));
    org.junit.Assert.assertTrue("'" + boolean57 + "' != '"+ false+ "'",boolean57 == false);
    org.junit.Assert.assertNotNull(floatArray60);
    org.junit.Assert.assertTrue("'" + float61 + "' != '"+ 48.0f+ "'",float61 == 48.0f);
    org.junit.Assert.assertTrue("'" + boolean62 + "' != '"+ false+ "'",boolean62 == false);
    org.junit.Assert.assertNotNull(floatArray67);
    org.junit.Assert.assertTrue("'" + float68 + "' != '"+ 10.0f+ "'",float68 == 10.0f);
    org.junit.Assert.assertTrue("'" + float69 + "' != '"+ 10.0f+ "'",float69 == 10.0f);
    org.junit.Assert.assertTrue("'" + boolean70 + "' != '"+ false+ "'",boolean70 == false);
    org.junit.Assert.assertTrue("'" + boolean71 + "' != '"+ false+ "'",boolean71 == false);
  }
  @Test public void test469() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test469#5596");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test469");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAlpha("!iH                ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test470() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test470#5604");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test470");
    boolean boolean1=org.apache.commons.lang.StringUtils.isNotEmpty("aaaaaaaaaaaaaaaaaaaa##Aaaaaaaaa                                                                  ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test471() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test471#5612");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test471");
    char[] charArray10=new char[]{' ',' '};
    int int11=org.apache.commons.lang.StringUtils.indexOfAny("                                                hi!                                                 ",charArray10);
    boolean boolean12=org.apache.commons.lang.StringUtils.containsNone("aaaaaaaaa ",charArray10);
    int int13=org.apache.commons.lang.StringUtils.indexOfAnyBut("##A",charArray10);
    int int14=org.apache.commons.lang.StringUtils.indexOfAnyBut("Aa hi!",charArray10);
    int int15=org.apache.commons.lang.StringUtils.indexOfAnyBut("4444444444444444444444444444444444                                4444444444444444444444444444444444",charArray10);
    boolean boolean16=org.apache.commons.lang.StringUtils.containsOnly("",charArray10);
    boolean boolean17=org.apache.commons.lang.StringUtils.containsNone("             A               ",charArray10);
    int int18=org.apache.commons.lang.StringUtils.indexOfAnyBut("  ",charArray10);
    org.junit.Assert.assertNotNull(charArray10);
    org.junit.Assert.assertTrue("'" + int11 + "' != '"+ 0+ "'",int11 == 0);
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '"+ false+ "'",boolean12 == false);
    org.junit.Assert.assertTrue("'" + int13 + "' != '"+ 0+ "'",int13 == 0);
    org.junit.Assert.assertTrue("'" + int14 + "' != '"+ 0+ "'",int14 == 0);
    org.junit.Assert.assertTrue("'" + int15 + "' != '"+ 0+ "'",int15 == 0);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '"+ true+ "'",boolean16 == true);
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '"+ false+ "'",boolean17 == false);
    org.junit.Assert.assertTrue("'" + int18 + "' != '"+ (-1)+ "'",int18 == (-1));
  }
  @Test public void test472() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test472#5636");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test472");
    java.lang.String str3=org.apache.commons.lang.StringUtils.rightPad("               ",96,'#');
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "               #################################################################################"+ "'",str3.equals("               #################################################################################"));
  }
  @Test public void test473() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test473#5644");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test473");
    java.lang.String str2=org.apache.commons.lang.StringUtils.removeEnd("   !ih            ","4444444hI AAAAAAAAA                                                                                        ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "   !ih            "+ "'",str2.equals("   !ih            "));
  }
  @Test public void test474() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test474#5652");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test474");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.split("IaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaA","                                                              ");
    org.junit.Assert.assertNotNull(strArray2);
  }
  @Test public void test475() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test475#5660");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test475");
    int int2=org.apache.commons.lang.math.NumberUtils.compare((double)'4',10.0d);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 1+ "'",int2 == 1);
  }
  @Test public void test476() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test476#5668");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test476");
    java.lang.String str2=org.apache.commons.lang.StringUtils.left("Aa ",36);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "Aa "+ "'",str2.equals("Aa "));
  }
  @Test public void test477() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test477#5676");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test477");
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
    int int39=org.apache.commons.lang.math.NumberUtils.min(intArray17);
    int int40=org.apache.commons.lang.math.NumberUtils.max(intArray17);
    int int41=org.apache.commons.lang.math.NumberUtils.max(intArray17);
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
    org.junit.Assert.assertTrue("'" + int39 + "' != '"+ 1+ "'",int39 == 1);
    org.junit.Assert.assertTrue("'" + int40 + "' != '"+ 100+ "'",int40 == 100);
    org.junit.Assert.assertTrue("'" + int41 + "' != '"+ 100+ "'",int41 == 100);
  }
  @Test public void test478() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test478#5712");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test478");
    java.lang.String str2=org.apache.commons.lang.StringUtils.prechomp("... !ih..","aaaaaaaaa                                                                                        ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "... !ih.."+ "'",str2.equals("... !ih.."));
  }
  @Test public void test479() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test479#5720");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test479");
    boolean boolean2=org.apache.commons.lang.StringUtils.containsNone("4ahi!","AAAAAAAAAAAAAAAAAAAA  4AAAAAAAA                                       HI!");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test480() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test480#5728");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test480");
    java.lang.String str1=org.apache.commons.lang.StringUtils.stripToEmpty("aa");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "aa"+ "'",str1.equals("aa"));
  }
  @Test public void test481() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test481#5736");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test481");
    long long3=org.apache.commons.lang.math.NumberUtils.max(24L,(long)81,(long)41);
    org.junit.Assert.assertTrue("'" + long3 + "' != '"+ 81L+ "'",long3 == 81L);
  }
  @Test public void test482() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test482#5744");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test482");
    java.lang.String[] strArray3=org.apache.commons.lang.StringUtils.splitByWholeSeparator("","Hi!",96);
    java.lang.String str4=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray3);
    java.lang.String str8=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray3,"Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa",100,43);
    org.junit.Assert.assertNotNull(strArray3);
    org.junit.Assert.assertTrue("'" + str4 + "' != '"+ ""+ "'",str4.equals(""));
    org.junit.Assert.assertTrue("'" + str8 + "' != '"+ ""+ "'",str8.equals(""));
  }
  @Test public void test483() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test483#5756");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test483");
    boolean boolean1=org.apache.commons.lang.math.NumberUtils.isNumber("a                                                HI!");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test484() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test484#5764");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test484");
    float float2=org.apache.commons.lang.math.NumberUtils.toFloat("4444444Hi!aaaaaaaa.. !ih..",(float)35);
    org.junit.Assert.assertTrue("'" + float2 + "' != '"+ 35.0f+ "'",float2 == 35.0f);
  }
  @Test public void test485() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test485#5772");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test485");
    java.lang.String str2=org.apache.commons.lang.StringUtils.chomp("4444444444444          444444444444444444444444444444444444","                             hi!                                   A                             ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "4444444444444          444444444444444444444444444444444444"+ "'",str2.equals("4444444444444          444444444444444444444444444444444444"));
  }
  @Test public void test486() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test486#5780");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test486");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.splitPreserveAllTokens("aaaaaAa...!",'#');
    org.junit.Assert.assertNotNull(strArray2);
  }
  @Test public void test487() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test487#5788");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test487");
    int int2=org.apache.commons.lang.math.NumberUtils.compare((double)65.0f,(double)3L);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 1+ "'",int2 == 1);
  }
  @Test public void test488() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test488#5796");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test488");
    java.lang.String str2=org.apache.commons.lang.StringUtils.remove("4444444...",".. !ih..                                           ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "4444444..."+ "'",str2.equals("4444444..."));
  }
  @Test public void test489() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test489#5804");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test489");
    java.lang.String str1=org.apache.commons.lang.StringUtils.trimToNull("!i aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "!i aaaaaaaaa"+ "'",str1.equals("!i aaaaaaaaa"));
  }
  @Test public void test490() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test490#5812");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test490");
    java.lang.String str3=org.apache.commons.lang.StringUtils.replaceOnce("aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa","aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#########################HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa","...                                          ...");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa"+ "'",str3.equals("aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa"));
  }
  @Test public void test491() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test491#5820");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test491");
    java.lang.String[] strArray3=org.apache.commons.lang.StringUtils.split("              ","",29);
    org.junit.Assert.assertNotNull(strArray3);
  }
  @Test public void test492() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test492#5828");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test492");
    java.lang.String str1=org.apache.commons.lang.StringUtils.escape("4444444Hi!                     ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "4444444Hi!                     "+ "'",str1.equals("4444444Hi!                     "));
  }
  @Test public void test493() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test493#5836");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test493");
    java.lang.String str2=org.apache.commons.lang.StringUtils.getPrechomp("                                                                                              !iH                                                                                              !iH                                                                                              !iH                                                                                              !iH                                                                                              !iH                                                                                              !iH                                                                                              !iH                                                                                              !iH                                                                                              !iH                 ","             ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "             "+ "'",str2.equals("             "));
  }
  @Test public void test494() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test494#5844");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test494");
    java.lang.String str3=org.apache.commons.lang.StringUtils.rightPad("                                                 !IH                                                ",0,' ');
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "                                                 !IH                                                "+ "'",str3.equals("                                                 !IH                                                "));
  }
  @Test public void test495() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test495#5852");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test495");
    java.lang.String str1=org.apache.commons.lang.StringUtils.capitalize("                                                                                aaaaaaaa");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "                                                                                aaaaaaaa"+ "'",str1.equals("                                                                                aaaaaaaa"));
  }
  @Test public void test496() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test496#5860");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test496");
    java.lang.String str4=org.apache.commons.lang.StringUtils.overlayString("                                                                                              !iH                                                                                              !iH                                                                                              !iH                                                                                              !iH                                                                                              !iH                                                                                              !iH                                                                                              !iH                                                                                              !iH                                                                                              !iH                 ","4444444hi!aaaaaaaaa                        ",82,0);
    org.junit.Assert.assertTrue("'" + str4 + "' != '"+ "                                                                                  4444444hi!aaaaaaaaa                                                                                                                      !iH                                                                                              !iH                                                                                              !iH                                                                                              !iH                                                                                              !iH                                                                                              !iH                                                                                              !iH                                                                                              !iH                                                                                              !iH                 "+ "'",str4.equals("                                                                                  4444444hi!aaaaaaaaa                                                                                                                      !iH                                                                                              !iH                                                                                              !iH                                                                                              !iH                                                                                              !iH                                                                                              !iH                                                                                              !iH                                                                                              !iH                                                                                              !iH                 "));
  }
  @Test public void test497() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test497#5868");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test497");
    java.lang.String str1=org.apache.commons.lang.StringUtils.uncapitalize("                             aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaa");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "                             aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaa"+ "'",str1.equals("                             aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaa"));
  }
  @Test public void test498() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test498#5876");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test498");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringBetween("","aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    org.junit.Assert.assertNull(str2);
  }
  @Test public void test499() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test499#5884");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test499");
    boolean boolean1=org.apache.commons.lang.StringUtils.isNumeric("          #############################           HI!            ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test500() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest12::test500#5892");
    if (debug)     System.out.format("%n%s%n","RegressionTest12.test500");
    java.lang.String str2=org.apache.commons.lang.StringUtils.getNestedString("","Aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaa");
    org.junit.Assert.assertNull(str2);
  }
}
