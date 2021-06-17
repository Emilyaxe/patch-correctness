import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
@FixMethodOrder(MethodSorters.NAME_ASCENDING) public class RegressionTest2 {
  public static boolean debug=false;
  @Test public void test001() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test001#10");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test001");
    short short3=org.apache.commons.lang.math.NumberUtils.min((short)100,(short)0,(short)(byte)1);
    org.junit.Assert.assertTrue("'" + short3 + "' != '"+ (short)0+ "'",short3 == (short)0);
  }
  @Test public void test002() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test002#18");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test002");
    java.lang.String str1=org.apache.commons.lang.StringUtils.lowerCase("");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ ""+ "'",str1.equals(""));
  }
  @Test public void test003() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test003#26");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test003");
    java.lang.String str1=org.apache.commons.lang.StringUtils.defaultString("                             hi!                                   A                             ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "                             hi!                                   A                             "+ "'",str1.equals("                             hi!                                   A                             "));
  }
  @Test public void test004() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test004#34");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test004");
    java.lang.String str2=org.apache.commons.lang.StringUtils.reverseDelimitedString("                                ","#############################################################################");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                                "+ "'",str2.equals("                                "));
  }
  @Test public void test005() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test005#42");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test005");
    java.lang.String str1=org.apache.commons.lang.StringUtils.trimToNull("aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "aaaaaaaaa"+ "'",str1.equals("aaaaaaaaa"));
  }
  @Test public void test006() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test006#50");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test006");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.split("                                                ",'a');
    org.junit.Assert.assertNotNull(strArray2);
  }
  @Test public void test007() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test007#58");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test007");
    java.lang.String str2=org.apache.commons.lang.StringUtils.getChomp("                                   ","#######################################################################################          ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test008() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test008#66");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test008");
    long long2=org.apache.commons.lang.math.NumberUtils.toLong("aaaaaaaaa                                    ",(long)96);
    org.junit.Assert.assertTrue("'" + long2 + "' != '"+ 96L+ "'",long2 == 96L);
  }
  @Test public void test009() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test009#74");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test009");
    long long3=org.apache.commons.lang.math.NumberUtils.max((long)(short)-1,(long)43,100L);
    org.junit.Assert.assertTrue("'" + long3 + "' != '"+ 100L+ "'",long3 == 100L);
  }
  @Test public void test010() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test010#82");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test010");
    java.lang.String str3=org.apache.commons.lang.StringUtils.mid("A                                                hi!",3,97);
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "                                              hi!"+ "'",str3.equals("                                              hi!"));
  }
  @Test public void test011() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test011#90");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test011");
    java.lang.String str2=org.apache.commons.lang.StringUtils.remove("!ih","");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "!ih"+ "'",str2.equals("!ih"));
  }
  @Test public void test012() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test012#98");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test012");
    int int2=org.apache.commons.lang.StringUtils.countMatches("...                          ...","                                                                                       Aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 0+ "'",int2 == 0);
  }
  @Test public void test013() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test013#106");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test013");
    java.lang.String str4=org.apache.commons.lang.StringUtils.replace("   ","                                                                                                    ","...                          ...",10);
    org.junit.Assert.assertTrue("'" + str4 + "' != '"+ "   "+ "'",str4.equals("   "));
  }
  @Test public void test014() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test014#114");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test014");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringAfterLast("Aaaaaaaaa ","");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test015() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test015#122");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test015");
    java.lang.String str1=org.apache.commons.lang.StringUtils.trim("4");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "4"+ "'",str1.equals("4"));
  }
  @Test public void test016() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test016#130");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test016");
    float float3=org.apache.commons.lang.math.NumberUtils.max((float)20,(float)100,(float)20);
    org.junit.Assert.assertTrue("'" + float3 + "' != '"+ 100.0f+ "'",float3 == 100.0f);
  }
  @Test public void test017() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test017#138");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test017");
    java.lang.String str2=org.apache.commons.lang.StringUtils.removeStart("","Hi!                                   A");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test018() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test018#146");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test018");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAlphanumericSpace("                                                ...                          ......                 ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test019() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test019#154");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test019");
    boolean boolean1=org.apache.commons.lang.StringUtils.isEmpty("   #######################################################################################");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test020() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test020#162");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test020");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAlpha("aaaaaaaaaaaaaaaaaaaa##Aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test021() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test021#170");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test021");
    java.lang.String str2=org.apache.commons.lang.StringUtils.reverseDelimitedString("aaaaaaaaa ","...                          ...");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "aaaaaaaaa"+ "'",str2.equals("aaaaaaaaa"));
  }
  @Test public void test022() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test022#178");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test022");
    java.lang.String str2=org.apache.commons.lang.StringUtils.getChomp("                                                                                                ","aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test023() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test023#186");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test023");
    java.lang.String str3=org.apache.commons.lang.StringUtils.mid("",(int)(short)1,48);
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ ""+ "'",str3.equals(""));
  }
  @Test public void test024() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test024#194");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test024");
    boolean boolean1=org.apache.commons.lang.StringUtils.isNumericSpace("... !ih..");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test025() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test025#202");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test025");
    double double2=org.apache.commons.lang.math.NumberUtils.toDouble("i!",(double)(-1L));
    org.junit.Assert.assertTrue("'" + double2 + "' != '"+ (-1.0d)+ "'",double2 == (-1.0d));
  }
  @Test public void test026() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test026#210");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test026");
    java.lang.String str4=org.apache.commons.lang.StringUtils.overlay("","          ",10,48);
    org.junit.Assert.assertTrue("'" + str4 + "' != '"+ "          "+ "'",str4.equals("          "));
  }
  @Test public void test027() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test027#218");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test027");
    int int2=org.apache.commons.lang.math.NumberUtils.stringToInt("          ",(int)'#');
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 35+ "'",int2 == 35);
  }
  @Test public void test028() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test028#226");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test028");
    java.lang.String[] strArray1=org.apache.commons.lang.StringUtils.split("Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!");
    org.junit.Assert.assertNotNull(strArray1);
  }
  @Test public void test029() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test029#234");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test029");
    java.lang.String str1=org.apache.commons.lang.StringUtils.reverse("                                   ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "                                   "+ "'",str1.equals("                                   "));
  }
  @Test public void test030() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test030#242");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test030");
    int int2=org.apache.commons.lang.math.NumberUtils.compare((float)10L,96.0f);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test031() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test031#250");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test031");
    java.lang.String str1=org.apache.commons.lang.StringUtils.escape("!ih");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "!ih"+ "'",str1.equals("!ih"));
  }
  @Test public void test032() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test032#258");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test032");
    long[] longArray1=new long[]{'#'};
    long[] longArray5=new long[]{97,(-1),' '};
    boolean boolean6=org.apache.commons.lang.math.NumberUtils.equals(longArray1,longArray5);
    long long7=org.apache.commons.lang.math.NumberUtils.max(longArray1);
    long long8=org.apache.commons.lang.math.NumberUtils.min(longArray1);
    long[] longArray9=null;
    boolean boolean10=org.apache.commons.lang.math.NumberUtils.equals(longArray1,longArray9);
    try {
      long long11=org.apache.commons.lang.math.NumberUtils.max(longArray9);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
    }
 catch (    java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNotNull(longArray1);
    org.junit.Assert.assertNotNull(longArray5);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '"+ false+ "'",boolean6 == false);
    org.junit.Assert.assertTrue("'" + long7 + "' != '"+ 35L+ "'",long7 == 35L);
    org.junit.Assert.assertTrue("'" + long8 + "' != '"+ 35L+ "'",long8 == 35L);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '"+ false+ "'",boolean10 == false);
  }
  @Test public void test033() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test033#282");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test033");
    java.lang.String str1=org.apache.commons.lang.StringUtils.swapCase("                                                ...                          ......                 ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "                                                ...                          ......                 "+ "'",str1.equals("                                                ...                          ......                 "));
  }
  @Test public void test034() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test034#290");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test034");
    try {
      java.lang.String str2=org.apache.commons.lang.StringUtils.abbreviate("aaaaaaaaaaaaaaaaaaaa                                ",0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
    }
 catch (    java.lang.IllegalArgumentException e) {
    }
  }
  @Test public void test035() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test035#301");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test035");
    double double1=org.apache.commons.lang.math.NumberUtils.toDouble("                 ");
    org.junit.Assert.assertTrue("'" + double1 + "' != '"+ 0.0d+ "'",double1 == 0.0d);
  }
  @Test public void test036() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test036#309");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test036");
    java.lang.String str2=org.apache.commons.lang.StringUtils.stripStart("","                                   ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test037() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test037#317");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test037");
    boolean boolean1=org.apache.commons.lang.StringUtils.isWhitespace("                                   ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test038() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test038#325");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test038");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAlphaSpace("a                                                HI!");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test039() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test039#333");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test039");
    try {
      java.math.BigDecimal bigDecimal1=org.apache.commons.lang.math.NumberUtils.createBigDecimal("                                                                                       aaaaaaaaa ");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test040() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test040#344");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test040");
    java.lang.String str2=org.apache.commons.lang.StringUtils.remove("Hi!                                   A",'a');
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "Hi!                                   A"+ "'",str2.equals("Hi!                                   A"));
  }
  @Test public void test041() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test041#352");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test041");
    boolean boolean1=org.apache.commons.lang.StringUtils.isBlank(" aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test042() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test042#360");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test042");
    java.lang.String str2=org.apache.commons.lang.StringUtils.rightPad("Hi!",97);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "Hi!                                                                                              "+ "'",str2.equals("Hi!                                                                                              "));
  }
  @Test public void test043() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test043#368");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test043");
    float float3=org.apache.commons.lang.math.NumberUtils.min(100.0f,97.0f,52.0f);
    org.junit.Assert.assertTrue("'" + float3 + "' != '"+ 52.0f+ "'",float3 == 52.0f);
  }
  @Test public void test044() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test044#376");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test044");
    int int2=org.apache.commons.lang.StringUtils.getLevenshteinDistance("","Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 100+ "'",int2 == 100);
  }
  @Test public void test045() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test045#384");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test045");
    java.lang.String str2=org.apache.commons.lang.StringUtils.remove("aa ","444444444444444444444444444444444444444444444          444444444444444444444444444444444444444444444");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "aa "+ "'",str2.equals("aa "));
  }
  @Test public void test046() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test046#392");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test046");
    java.lang.String str1=org.apache.commons.lang.StringUtils.capitalise("                             hi!                                   A                             ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "                             hi!                                   A                             "+ "'",str1.equals("                             hi!                                   A                             "));
  }
  @Test public void test047() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test047#400");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test047");
    java.lang.String str2=org.apache.commons.lang.StringUtils.remove("","                                                ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test048() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test048#408");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test048");
    double double3=org.apache.commons.lang.math.NumberUtils.min((double)97,(double)100L,(double)'#');
    org.junit.Assert.assertTrue("'" + double3 + "' != '"+ 35.0d+ "'",double3 == 35.0d);
  }
  @Test public void test049() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test049#416");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test049");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringBefore("                                                ","!ih");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                                                "+ "'",str2.equals("                                                "));
  }
  @Test public void test050() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test050#424");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test050");
    java.lang.String str1=org.apache.commons.lang.StringUtils.uncapitalize("                                                                                                                  HI!");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "                                                                                                                  HI!"+ "'",str1.equals("                                                                                                                  HI!"));
  }
  @Test public void test051() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test051#432");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test051");
    java.lang.String str2=org.apache.commons.lang.StringUtils.repeat("                                                ...                          ......                 ",(int)(short)-1);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test052() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test052#440");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test052");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringBeforeLast("a                                                HI!                                                 ","4");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "a                                                HI!                                                 "+ "'",str2.equals("a                                                HI!                                                 "));
  }
  @Test public void test053() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test053#448");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test053");
    try {
      java.math.BigDecimal bigDecimal1=org.apache.commons.lang.math.NumberUtils.createBigDecimal("Aaaaaaaaa");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test054() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test054#459");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test054");
    boolean boolean2=org.apache.commons.lang.StringUtils.equalsIgnoreCase("AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa","                                                                                                 ");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test055() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test055#467");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test055");
    int int2=org.apache.commons.lang.StringUtils.indexOf("                                                hi!                                                 ","...                          ...");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test056() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test056#475");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test056");
    float float3=org.apache.commons.lang.math.NumberUtils.min((float)97,(float)(-1L),(float)29);
    org.junit.Assert.assertTrue("'" + float3 + "' != '"+ (-1.0f)+ "'",float3 == (-1.0f));
  }
  @Test public void test057() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test057#483");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test057");
    int int3=org.apache.commons.lang.math.NumberUtils.min(31,(int)(byte)10,32);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ 10+ "'",int3 == 10);
  }
  @Test public void test058() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test058#491");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test058");
    java.lang.String str3=org.apache.commons.lang.StringUtils.rightPad("                             Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!",0,' ');
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "                             Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!"+ "'",str3.equals("                             Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!"));
  }
  @Test public void test059() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test059#499");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test059");
    java.lang.String str1=org.apache.commons.lang.StringUtils.reverse("Hi!                                                                                              ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "                                                                                              !iH"+ "'",str1.equals("                                                                                              !iH"));
  }
  @Test public void test060() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test060#507");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test060");
    byte byte3=org.apache.commons.lang.math.NumberUtils.max((byte)1,(byte)1,(byte)0);
    org.junit.Assert.assertTrue("'" + byte3 + "' != '"+ (byte)1+ "'",byte3 == (byte)1);
  }
  @Test public void test061() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test061#515");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test061");
    int int3=org.apache.commons.lang.StringUtils.indexOf("   #######################################################################################","aaaaaaaaa                                    ",97);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test062() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test062#523");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test062");
    java.lang.String[] strArray3=org.apache.commons.lang.StringUtils.split("","hi!",(int)(byte)100);
    java.lang.String str4=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray3);
    java.lang.String[] strArray6=org.apache.commons.lang.StringUtils.stripAll(strArray3,"                                   ");
    java.lang.String str10=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray6,' ',88,(int)(byte)-1);
    org.junit.Assert.assertNotNull(strArray3);
    org.junit.Assert.assertTrue("'" + str4 + "' != '"+ ""+ "'",str4.equals(""));
    org.junit.Assert.assertNotNull(strArray6);
    org.junit.Assert.assertTrue("'" + str10 + "' != '"+ ""+ "'",str10.equals(""));
  }
  @Test public void test063() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test063#537");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test063");
    java.lang.String str3=org.apache.commons.lang.StringUtils.substring("                                          aaaaaaaaa i!",(int)(byte)100,3);
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ ""+ "'",str3.equals(""));
  }
  @Test public void test064() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test064#545");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test064");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringBetween("                 ","aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa ");
    org.junit.Assert.assertNull(str2);
  }
  @Test public void test065() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test065#553");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test065");
    int int3=org.apache.commons.lang.StringUtils.lastIndexOf("A                                                hi!                                                 ","",(int)(short)100);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ 100+ "'",int3 == 100);
  }
  @Test public void test066() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test066#561");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test066");
    java.lang.String str3=org.apache.commons.lang.StringUtils.center("                                ",10,'a');
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "                                "+ "'",str3.equals("                                "));
  }
  @Test public void test067() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test067#569");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test067");
    java.lang.String str1=org.apache.commons.lang.StringUtils.defaultString(" aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ " aaaaaaaaa"+ "'",str1.equals(" aaaaaaaaa"));
  }
  @Test public void test068() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test068#577");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test068");
    boolean boolean1=org.apache.commons.lang.StringUtils.isBlank("...                          ...");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test069() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test069#585");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test069");
    java.lang.String str2=org.apache.commons.lang.StringUtils.chompLast("aaaaaaaaa                                                                                        ","                             hi!                                   A                             ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "aaaaaaaaa                                                                                        "+ "'",str2.equals("aaaaaaaaa                                                                                        "));
  }
  @Test public void test070() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test070#593");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test070");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAlphaSpace("aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test071() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test071#601");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test071");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAlphanumericSpace("4444444444444444444444444444444444                                4444444444444444444444444444444444");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test072() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test072#609");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test072");
    java.lang.String str3=org.apache.commons.lang.StringUtils.center("",9,'#');
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "#########"+ "'",str3.equals("#########"));
  }
  @Test public void test073() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test073#617");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test073");
    int int2=org.apache.commons.lang.StringUtils.indexOf("Aaaaaaaaa ","#################...");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test074() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test074#625");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test074");
    boolean boolean2=org.apache.commons.lang.StringUtils.equals("aaaaaaaaa                                    ","4444444Hi!aaaaaaaaa                                                                                        ");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test075() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test075#633");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test075");
    double[] doubleArray0=new double[]{};
    double[] doubleArray5=new double[]{(-1.0f),'#',1.0f,35L};
    double[] doubleArray6=new double[]{};
    boolean boolean7=org.apache.commons.lang.math.NumberUtils.equals(doubleArray5,doubleArray6);
    boolean boolean8=org.apache.commons.lang.math.NumberUtils.equals(doubleArray0,doubleArray6);
    double[] doubleArray13=new double[]{(-1.0f),'#',1.0f,35L};
    double[] doubleArray14=new double[]{};
    boolean boolean15=org.apache.commons.lang.math.NumberUtils.equals(doubleArray13,doubleArray14);
    double[] doubleArray16=new double[]{};
    double[] doubleArray21=new double[]{(-1.0f),'#',1.0f,35L};
    double[] doubleArray22=new double[]{};
    boolean boolean23=org.apache.commons.lang.math.NumberUtils.equals(doubleArray21,doubleArray22);
    boolean boolean24=org.apache.commons.lang.math.NumberUtils.equals(doubleArray16,doubleArray22);
    boolean boolean25=org.apache.commons.lang.math.NumberUtils.equals(doubleArray13,doubleArray16);
    boolean boolean26=org.apache.commons.lang.math.NumberUtils.equals(doubleArray0,doubleArray16);
    try {
      double double27=org.apache.commons.lang.math.NumberUtils.max(doubleArray16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array cannot be empty.");
    }
 catch (    java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNotNull(doubleArray0);
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '"+ false+ "'",boolean7 == false);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '"+ true+ "'",boolean8 == true);
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
  @Test public void test076() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test076#674");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test076");
    double double3=org.apache.commons.lang.math.NumberUtils.min((double)(short)100,(double)29,(double)10.0f);
    org.junit.Assert.assertTrue("'" + double3 + "' != '"+ 10.0d+ "'",double3 == 10.0d);
  }
  @Test public void test077() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test077#682");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test077");
    try {
      java.lang.Number number1=org.apache.commons.lang.math.NumberUtils.createNumber("i!");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: i! is not a valid number.");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test078() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test078#693");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test078");
    java.lang.String str2=org.apache.commons.lang.StringUtils.reverseDelimited("Aaaaaaaaa",'#');
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "Aaaaaaaaa"+ "'",str2.equals("Aaaaaaaaa"));
  }
  @Test public void test079() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test079#701");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test079");
    try {
      java.lang.Double double1=org.apache.commons.lang.math.NumberUtils.createDouble("                                                ");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test080() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test080#712");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test080");
    int int3=org.apache.commons.lang.math.NumberUtils.max(3,(int)(byte)0,29);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ 29+ "'",int3 == 29);
  }
  @Test public void test081() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test081#720");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test081");
    int int3=org.apache.commons.lang.StringUtils.indexOf("","                        aaaaaaaaaaaaaaaaaaaa                                                        ",(int)(byte)10);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test082() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test082#728");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test082");
    double double3=org.apache.commons.lang.math.NumberUtils.max(9.0d,(double)(short)1,1.0d);
    org.junit.Assert.assertTrue("'" + double3 + "' != '"+ 9.0d+ "'",double3 == 9.0d);
  }
  @Test public void test083() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test083#736");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test083");
    int int3=org.apache.commons.lang.StringUtils.ordinalIndexOf("aaaaaaaaaaaaaaaaaaaa","           4            ",1);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test084() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test084#744");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test084");
    long long3=org.apache.commons.lang.math.NumberUtils.min((long)'a',(long)(short)10,(long)0);
    org.junit.Assert.assertTrue("'" + long3 + "' != '"+ 0L+ "'",long3 == 0L);
  }
  @Test public void test085() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test085#752");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test085");
    int int3=org.apache.commons.lang.StringUtils.lastIndexOf("",'a',(int)'a');
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test086() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test086#760");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test086");
    java.lang.String str2=org.apache.commons.lang.StringUtils.remove("aaaaaaaaa                                    ","hi!                                   A");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "aaaaaaaaa                                    "+ "'",str2.equals("aaaaaaaaa                                    "));
  }
  @Test public void test087() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test087#768");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test087");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringBetween("","a                                                HI!");
    org.junit.Assert.assertNull(str2);
  }
  @Test public void test088() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test088#776");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test088");
    java.lang.String str2=org.apache.commons.lang.StringUtils.removeEnd("","                                                                                                    ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test089() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test089#784");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test089");
    java.lang.String str1=org.apache.commons.lang.StringUtils.chop("               ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "              "+ "'",str1.equals("              "));
  }
  @Test public void test090() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test090#792");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test090");
    java.lang.String str3=org.apache.commons.lang.StringUtils.leftPad("4444444444444444444444444444444444                                4444444444444444444444444444444444",(int)(short)1,"AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "4444444444444444444444444444444444                                4444444444444444444444444444444444"+ "'",str3.equals("4444444444444444444444444444444444                                4444444444444444444444444444444444"));
  }
  @Test public void test091() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test091#800");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test091");
    int int3=org.apache.commons.lang.StringUtils.indexOf("aaaaaaaaa                                    ",'#',(int)(short)10);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test092() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test092#808");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test092");
    try {
      java.math.BigInteger bigInteger1=org.apache.commons.lang.math.NumberUtils.createBigInteger("                                                                                                         HI!");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"         \"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test093() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test093#819");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test093");
    long long1=org.apache.commons.lang.math.NumberUtils.toLong("aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + long1 + "' != '"+ 0L+ "'",long1 == 0L);
  }
  @Test public void test094() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test094#827");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test094");
    java.lang.String str1=org.apache.commons.lang.StringUtils.upperCase("Aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "AAAAAAAAA "+ "'",str1.equals("AAAAAAAAA "));
  }
  @Test public void test095() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test095#835");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test095");
    boolean boolean1=org.apache.commons.lang.StringUtils.isBlank("#################...");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test096() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test096#843");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test096");
    java.lang.String str1=org.apache.commons.lang.StringUtils.uncapitalise("aaaaaaaaa i!");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "aaaaaaaaa i!"+ "'",str1.equals("aaaaaaaaa i!"));
  }
  @Test public void test097() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test097#851");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test097");
    java.lang.String str1=org.apache.commons.lang.StringUtils.reverse("Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "!iaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA"+ "'",str1.equals("!iaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA"));
  }
  @Test public void test098() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test098#859");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test098");
    java.lang.String str2=org.apache.commons.lang.StringUtils.chomp("","                                                ...                          ......                 ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test099() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test099#867");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test099");
    short short3=org.apache.commons.lang.math.NumberUtils.min((short)(byte)100,(short)0,(short)(byte)0);
    org.junit.Assert.assertTrue("'" + short3 + "' != '"+ (short)0+ "'",short3 == (short)0);
  }
  @Test public void test100() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test100#875");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test100");
    java.lang.String str1=org.apache.commons.lang.StringUtils.capitalise("                                                                                                ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "                                                                                                "+ "'",str1.equals("                                                                                                "));
  }
  @Test public void test101() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test101#883");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test101");
    java.lang.String str3=org.apache.commons.lang.StringUtils.replace("                                                 !ih                                                ","4444444444444444444444444444444444                                4444444444444444444444444444444444","                                                                                                                  HI!");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "                                                 !ih                                                "+ "'",str3.equals("                                                 !ih                                                "));
  }
  @Test public void test102() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test102#891");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test102");
    java.lang.String str3=org.apache.commons.lang.StringUtils.getNestedString("a                                                HI!                                                 ","                        AAAAAAAAAAAAAAAAAAAA                                                        ","                                              hi!");
    org.junit.Assert.assertNull(str3);
  }
  @Test public void test103() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test103#899");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test103");
    long long1=org.apache.commons.lang.math.NumberUtils.toLong("aaaaaaaaaaaaaaaaaaaa##Aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + long1 + "' != '"+ 0L+ "'",long1 == 0L);
  }
  @Test public void test104() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test104#907");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test104");
    java.lang.String str3=org.apache.commons.lang.StringUtils.substring("aaaaaaaaa                                    ",(int)(byte)0,0);
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ ""+ "'",str3.equals(""));
  }
  @Test public void test105() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test105#915");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test105");
    int int2=org.apache.commons.lang.StringUtils.lastIndexOf("Hi!                                   A","                                   ");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 3+ "'",int2 == 3);
  }
  @Test public void test106() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test106#923");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test106");
    long long1=org.apache.commons.lang.math.NumberUtils.toLong("... !ih..");
    org.junit.Assert.assertTrue("'" + long1 + "' != '"+ 0L+ "'",long1 == 0L);
  }
  @Test public void test107() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test107#931");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test107");
    java.lang.String str3=org.apache.commons.lang.StringUtils.replaceChars("... !ih..",'a',' ');
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "... !ih.."+ "'",str3.equals("... !ih.."));
  }
  @Test public void test108() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test108#939");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test108");
    java.lang.String str1=org.apache.commons.lang.StringUtils.escape("Hi!                                   A");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "Hi!                                   A"+ "'",str1.equals("Hi!                                   A"));
  }
  @Test public void test109() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test109#947");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test109");
    java.lang.String str1=org.apache.commons.lang.StringUtils.stripToNull("");
    org.junit.Assert.assertNull(str1);
  }
  @Test public void test110() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test110#955");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test110");
    boolean boolean1=org.apache.commons.lang.StringUtils.isBlank(" ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test111() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test111#963");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test111");
    boolean boolean2=org.apache.commons.lang.StringUtils.containsIgnoreCase("                             hi!                                   A                             ","aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test112() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test112#971");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test112");
    int int3=org.apache.commons.lang.StringUtils.indexOf("aaaaaaaaaaaaaaaaaaaa","aaaaaaaaaaaaaaaaaaaa##Aaaaaaaaa",(int)'4');
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test113() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test113#979");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test113");
    boolean boolean2=org.apache.commons.lang.StringUtils.containsIgnoreCase("AAAAAAAAA ","");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ true+ "'",boolean2 == true);
  }
  @Test public void test114() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test114#987");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test114");
    boolean boolean1=org.apache.commons.lang.StringUtils.isWhitespace("                                                ...                          ......                 ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test115() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test115#995");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test115");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAlphanumeric("   ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test116() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test116#1003");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test116");
    int int3=org.apache.commons.lang.StringUtils.lastIndexOf("A",' ',4);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test117() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test117#1011");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test117");
    java.lang.String str3=org.apache.commons.lang.StringUtils.center("",(int)'4',"                                                ...                          ......                 ");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "                                                    "+ "'",str3.equals("                                                    "));
  }
  @Test public void test118() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test118#1019");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test118");
    int int2=org.apache.commons.lang.StringUtils.countMatches("444444444444444444444444444444444444444444444          444444444444444444444444444444444444444444444","");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 0+ "'",int2 == 0);
  }
  @Test public void test119() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test119#1027");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test119");
    java.lang.String str2=org.apache.commons.lang.StringUtils.difference("                                   ","hi!");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "hi!"+ "'",str2.equals("hi!"));
  }
  @Test public void test120() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test120#1035");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test120");
    int int2=org.apache.commons.lang.StringUtils.indexOf("a                                                HI!","hi!");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test121() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test121#1043");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test121");
    java.util.Iterator iterator0=null;
    java.lang.String str2=org.apache.commons.lang.StringUtils.join(iterator0,'4');
    org.junit.Assert.assertNull(str2);
  }
  @Test public void test122() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test122#1052");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test122");
    boolean boolean1=org.apache.commons.lang.StringUtils.isNotBlank("              ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test123() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test123#1060");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test123");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substring("                                                                                       aaaaaaaaa ",4);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                                                                                   aaaaaaaaa "+ "'",str2.equals("                                                                                   aaaaaaaaa "));
  }
  @Test public void test124() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test124#1068");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test124");
    int int2=org.apache.commons.lang.StringUtils.indexOfDifference("#########"," aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 0+ "'",int2 == 0);
  }
  @Test public void test125() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test125#1076");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test125");
    java.lang.String str1=org.apache.commons.lang.StringUtils.chomp("                             Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "                             Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!"+ "'",str1.equals("                             Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!"));
  }
  @Test public void test126() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test126#1084");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test126");
    java.lang.String str1=org.apache.commons.lang.StringUtils.chopNewline("aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa"+ "'",str1.equals("aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa"));
  }
  @Test public void test127() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test127#1092");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test127");
    double double2=org.apache.commons.lang.math.NumberUtils.toDouble("... !ih...",(double)'4');
    org.junit.Assert.assertTrue("'" + double2 + "' != '"+ 52.0d+ "'",double2 == 52.0d);
  }
  @Test public void test128() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test128#1100");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test128");
    java.lang.String str2=org.apache.commons.lang.StringUtils.removeStart("                                          aaaaaaaaa i!","Hi!                                                                                              ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                                          aaaaaaaaa i!"+ "'",str2.equals("                                          aaaaaaaaa i!"));
  }
  @Test public void test129() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test129#1108");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test129");
    double double3=org.apache.commons.lang.math.NumberUtils.min((double)29,(double)32,(double)9L);
    org.junit.Assert.assertTrue("'" + double3 + "' != '"+ 9.0d+ "'",double3 == 9.0d);
  }
  @Test public void test130() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test130#1116");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test130");
    java.lang.String str2=org.apache.commons.lang.StringUtils.difference("aaaaaaaaa                                    ","");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test131() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test131#1124");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test131");
    double[] doubleArray4=new double[]{(-1.0f),'#',1.0f,35L};
    double[] doubleArray5=new double[]{};
    boolean boolean6=org.apache.commons.lang.math.NumberUtils.equals(doubleArray4,doubleArray5);
    double[] doubleArray7=null;
    boolean boolean8=org.apache.commons.lang.math.NumberUtils.equals(doubleArray5,doubleArray7);
    try {
      double double9=org.apache.commons.lang.math.NumberUtils.min(doubleArray7);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
    }
 catch (    java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNotNull(doubleArray4);
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '"+ false+ "'",boolean6 == false);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '"+ false+ "'",boolean8 == false);
  }
  @Test public void test132() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test132#1144");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test132");
    int int1=org.apache.commons.lang.math.NumberUtils.toInt("!iaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA");
    org.junit.Assert.assertTrue("'" + int1 + "' != '"+ 0+ "'",int1 == 0);
  }
  @Test public void test133() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test133#1152");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test133");
    int int2=org.apache.commons.lang.StringUtils.indexOfAnyBut("h","a                                                HI!");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 0+ "'",int2 == 0);
  }
  @Test public void test134() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test134#1160");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test134");
    boolean boolean2=org.apache.commons.lang.StringUtils.containsIgnoreCase("Hi!","                                                ");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test135() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test135#1168");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test135");
    java.lang.String str2=org.apache.commons.lang.StringUtils.difference("   #######################################################################################","hi!                                   A");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "hi!                                   A"+ "'",str2.equals("hi!                                   A"));
  }
  @Test public void test136() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test136#1176");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test136");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.splitByWholeSeparator("Hi!"," ");
    java.lang.String str4=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray2,' ');
    java.lang.String str6=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray2,"                                                ");
    org.junit.Assert.assertNotNull(strArray2);
    org.junit.Assert.assertTrue("'" + str4 + "' != '"+ "Hi!"+ "'",str4.equals("Hi!"));
    org.junit.Assert.assertTrue("'" + str6 + "' != '"+ "Hi!"+ "'",str6.equals("Hi!"));
  }
  @Test public void test137() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test137#1188");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test137");
    java.util.Iterator iterator0=null;
    java.lang.String str2=org.apache.commons.lang.StringUtils.join(iterator0,"AAAAAAAAA ");
    org.junit.Assert.assertNull(str2);
  }
  @Test public void test138() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test138#1197");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test138");
    java.lang.String[] strArray3=org.apache.commons.lang.StringUtils.splitPreserveAllTokens("aaaaaaaaa                                                                                        ","i!",(int)' ');
    java.lang.String str7=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray3,"",(int)'4',3);
    org.junit.Assert.assertNotNull(strArray3);
    org.junit.Assert.assertTrue("'" + str7 + "' != '"+ ""+ "'",str7.equals(""));
  }
  @Test public void test139() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test139#1207");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test139");
    boolean boolean1=org.apache.commons.lang.StringUtils.isNumericSpace("              ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test140() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test140#1215");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test140");
    try {
      java.lang.Integer int1=org.apache.commons.lang.math.NumberUtils.createInteger("Aaaaaaaaa");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"Aaaaaaaaa\"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test141() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test141#1226");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test141");
    int int3=org.apache.commons.lang.StringUtils.ordinalIndexOf(" aaaaaaaaa","HHHHHHHHHH",(int)(byte)0);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test142() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test142#1234");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test142");
    java.lang.String str2=org.apache.commons.lang.StringUtils.removeEnd("Aaaaaaaaa ","hi!");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "Aaaaaaaaa "+ "'",str2.equals("Aaaaaaaaa "));
  }
  @Test public void test143() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test143#1242");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test143");
    java.lang.String str2=org.apache.commons.lang.StringUtils.reverseDelimited("hi!",' ');
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "hi!"+ "'",str2.equals("hi!"));
  }
  @Test public void test144() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test144#1250");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test144");
    int int2=org.apache.commons.lang.math.NumberUtils.stringToInt("HHHHHHHHHH",32);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 32+ "'",int2 == 32);
  }
  @Test public void test145() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test145#1258");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test145");
    int int1=org.apache.commons.lang.math.NumberUtils.stringToInt("A                                                hi!");
    org.junit.Assert.assertTrue("'" + int1 + "' != '"+ 0+ "'",int1 == 0);
  }
  @Test public void test146() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test146#1266");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test146");
    java.util.Iterator iterator0=null;
    java.lang.String str2=org.apache.commons.lang.StringUtils.join(iterator0,' ');
    org.junit.Assert.assertNull(str2);
  }
  @Test public void test147() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test147#1275");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test147");
    java.lang.String str3=org.apache.commons.lang.StringUtils.replaceOnce("","           4            ","Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ ""+ "'",str3.equals(""));
  }
  @Test public void test148() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test148#1283");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test148");
    java.lang.String str3=org.apache.commons.lang.StringUtils.replace("A                                                hi!                                                 ","hi!A","#########");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "A                                                hi!                                                 "+ "'",str3.equals("A                                                hi!                                                 "));
  }
  @Test public void test149() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test149#1291");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test149");
    java.lang.String str1=org.apache.commons.lang.StringUtils.chompLast("a                                                HI!                                                 ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "a                                                HI!                                                 "+ "'",str1.equals("a                                                HI!                                                 "));
  }
  @Test public void test150() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test150#1299");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test150");
    java.lang.String str2=org.apache.commons.lang.StringUtils.left("                                                                                                                  HI!",(int)(short)1);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ " "+ "'",str2.equals(" "));
  }
  @Test public void test151() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test151#1307");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test151");
    java.lang.String str3=org.apache.commons.lang.StringUtils.rightPad("",(int)(short)100,"");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "                                                                                                    "+ "'",str3.equals("                                                                                                    "));
  }
  @Test public void test152() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test152#1315");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test152");
    int int2=org.apache.commons.lang.StringUtils.lastIndexOf("H",'a');
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test153() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test153#1323");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test153");
    int int3=org.apache.commons.lang.math.NumberUtils.min(1,4,(int)'4');
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ 1+ "'",int3 == 1);
  }
  @Test public void test154() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test154#1331");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test154");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringBefore("A","... !ih..");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "A"+ "'",str2.equals("A"));
  }
  @Test public void test155() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test155#1339");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test155");
    int int2=org.apache.commons.lang.math.NumberUtils.toInt("4444444Hi!",10);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 10+ "'",int2 == 10);
  }
  @Test public void test156() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test156#1347");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test156");
    double double1=org.apache.commons.lang.math.NumberUtils.toDouble("                                          aaaaaaaaa i!");
    org.junit.Assert.assertTrue("'" + double1 + "' != '"+ 0.0d+ "'",double1 == 0.0d);
  }
  @Test public void test157() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test157#1355");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test157");
    java.lang.String str2=org.apache.commons.lang.StringUtils.getPrechomp("i!","aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test158() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test158#1363");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test158");
    java.lang.String str2=org.apache.commons.lang.StringUtils.center("aaaaaaaaa i!",100);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                                            aaaaaaaaa i!                                            "+ "'",str2.equals("                                            aaaaaaaaa i!                                            "));
  }
  @Test public void test159() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test159#1371");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test159");
    try {
      java.lang.Float float1=org.apache.commons.lang.math.NumberUtils.createFloat("a                                                HI!");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a                                                HI!\"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test160() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test160#1382");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test160");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substring("Hi!",(int)(short)100);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test161() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test161#1390");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test161");
    java.lang.String str2=org.apache.commons.lang.StringUtils.center("aaaaaaaaa                                    ",(int)'4');
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "   aaaaaaaaa                                        "+ "'",str2.equals("   aaaaaaaaa                                        "));
  }
  @Test public void test162() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test162#1398");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test162");
    java.lang.String str2=org.apache.commons.lang.StringUtils.leftPad("",(int)(short)10);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "          "+ "'",str2.equals("          "));
  }
  @Test public void test163() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test163#1406");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test163");
    java.lang.String str4=org.apache.commons.lang.StringUtils.replace("                                                                                                 ","#######################################################################################","              ",(int)(short)1);
    org.junit.Assert.assertTrue("'" + str4 + "' != '"+ "                                                                                                 "+ "'",str4.equals("                                                                                                 "));
  }
  @Test public void test164() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test164#1414");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test164");
    java.util.Collection collection0=null;
    java.lang.String str2=org.apache.commons.lang.StringUtils.join(collection0,"                                                                                                ");
    org.junit.Assert.assertNull(str2);
  }
  @Test public void test165() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test165#1423");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test165");
    long long3=org.apache.commons.lang.math.NumberUtils.min((long)(byte)100,(long)20,(long)(byte)0);
    org.junit.Assert.assertTrue("'" + long3 + "' != '"+ 0L+ "'",long3 == 0L);
  }
  @Test public void test166() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test166#1431");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test166");
    java.lang.String str3=org.apache.commons.lang.StringUtils.center("Hi!                                                                                              ",(int)(byte)1,"                        aaaaaaaaaaaaaaaaaaaa                                                        ");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "Hi!                                                                                              "+ "'",str3.equals("Hi!                                                                                              "));
  }
  @Test public void test167() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test167#1439");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test167");
    java.lang.Integer int1=org.apache.commons.lang.math.NumberUtils.createInteger("4");
    org.junit.Assert.assertTrue("'" + int1 + "' != '"+ 4+ "'",int1.equals(4));
  }
  @Test public void test168() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test168#1447");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test168");
    byte byte3=org.apache.commons.lang.math.NumberUtils.max((byte)0,(byte)10,(byte)1);
    org.junit.Assert.assertTrue("'" + byte3 + "' != '"+ (byte)10+ "'",byte3 == (byte)10);
  }
  @Test public void test169() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test169#1455");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test169");
    java.lang.String str3=org.apache.commons.lang.StringUtils.center("aaaaaaaaa ",9,'a');
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "aaaaaaaaa "+ "'",str3.equals("aaaaaaaaa "));
  }
  @Test public void test170() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test170#1463");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test170");
    int int2=org.apache.commons.lang.StringUtils.indexOfDifference("","aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 0+ "'",int2 == 0);
  }
  @Test public void test171() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test171#1471");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test171");
    int int2=org.apache.commons.lang.StringUtils.lastIndexOf("Hi!","                        AAAAAAAAAAAAAAAAAAAA                                                        ");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test172() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test172#1479");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test172");
    int int2=org.apache.commons.lang.StringUtils.countMatches("","#################...");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 0+ "'",int2 == 0);
  }
  @Test public void test173() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test173#1487");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test173");
    int int3=org.apache.commons.lang.math.NumberUtils.max(31,9,(int)(byte)-1);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ 31+ "'",int3 == 31);
  }
  @Test public void test174() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test174#1495");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test174");
    java.lang.String str3=org.apache.commons.lang.StringUtils.center("          ",(int)'#',"                                ");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "                                   "+ "'",str3.equals("                                   "));
  }
  @Test public void test175() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test175#1503");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test175");
    int int3=org.apache.commons.lang.math.NumberUtils.min((int)(short)-1,0,20);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test176() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test176#1511");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test176");
    float float3=org.apache.commons.lang.math.NumberUtils.max(96.0f,(float)32,(float)'#');
    org.junit.Assert.assertTrue("'" + float3 + "' != '"+ 96.0f+ "'",float3 == 96.0f);
  }
  @Test public void test177() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test177#1519");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test177");
    java.lang.String str2=org.apache.commons.lang.StringUtils.getChomp("                                                                                       aaaaaaaaa ","          ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "          aaaaaaaaa "+ "'",str2.equals("          aaaaaaaaa "));
  }
  @Test public void test178() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test178#1527");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test178");
    int int2=org.apache.commons.lang.math.NumberUtils.toInt("                         i!                         ",35);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 35+ "'",int2 == 35);
  }
  @Test public void test179() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test179#1535");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test179");
    java.lang.String str1=org.apache.commons.lang.StringUtils.trimToEmpty("#######################################################################################          ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "#######################################################################################"+ "'",str1.equals("#######################################################################################"));
  }
  @Test public void test180() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test180#1543");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test180");
    java.lang.String str2=org.apache.commons.lang.StringUtils.reverseDelimited("                 ",'4');
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                 "+ "'",str2.equals("                 "));
  }
  @Test public void test181() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test181#1551");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test181");
    java.lang.String str4=org.apache.commons.lang.StringUtils.overlay("   aaaaaaaaa                                        ","Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!",48,(int)(short)0);
    org.junit.Assert.assertTrue("'" + str4 + "' != '"+ "Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!    "+ "'",str4.equals("Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!    "));
  }
  @Test public void test182() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test182#1559");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test182");
    java.lang.String str2=org.apache.commons.lang.StringUtils.chompLast("               ","hi!A");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "               "+ "'",str2.equals("               "));
  }
  @Test public void test183() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test183#1567");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test183");
    int int2=org.apache.commons.lang.StringUtils.getLevenshteinDistance("#########","hi!");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 9+ "'",int2 == 9);
  }
  @Test public void test184() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test184#1575");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test184");
    int int3=org.apache.commons.lang.StringUtils.lastIndexOf("aaaaaaaaaaaaaaaaaaaaAaaaaaaaa","                                                                                              !iH",(int)(byte)1);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test185() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test185#1583");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test185");
    java.lang.String str3=org.apache.commons.lang.StringUtils.replaceChars("                                                                                              !iH","                                                                                                ","                                                ");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "                                                                                              !iH"+ "'",str3.equals("                                                                                              !iH"));
  }
  @Test public void test186() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test186#1591");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test186");
    int int3=org.apache.commons.lang.StringUtils.ordinalIndexOf("","#########",29);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test187() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test187#1599");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test187");
    boolean boolean2=org.apache.commons.lang.StringUtils.contains("                                                                                       Aaaaaaaaa ",'a');
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ true+ "'",boolean2 == true);
  }
  @Test public void test188() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test188#1607");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test188");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAlphaSpace("Aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test189() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test189#1615");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test189");
    boolean boolean1=org.apache.commons.lang.StringUtils.isBlank("4");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test190() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test190#1623");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test190");
    java.lang.String str1=org.apache.commons.lang.StringUtils.escape("Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai"+ "'",str1.equals("Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai"));
  }
  @Test public void test191() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test191#1631");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test191");
    java.lang.String[] strArray3=org.apache.commons.lang.StringUtils.splitByWholeSeparator("                 ","                                                                                                 ",88);
    org.junit.Assert.assertNotNull(strArray3);
  }
  @Test public void test192() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test192#1639");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test192");
    java.lang.String str2=org.apache.commons.lang.StringUtils.stripStart("   aaaaaaaaa                                        ","                         i!                         ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "aaaaaaaaa                                        "+ "'",str2.equals("aaaaaaaaa                                        "));
  }
  @Test public void test193() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test193#1647");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test193");
    java.lang.String str2=org.apache.commons.lang.StringUtils.getChomp("Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai","aaaaaaaaa                                        ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test194() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test194#1655");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test194");
    try {
      java.lang.Float float1=org.apache.commons.lang.math.NumberUtils.createFloat("");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test195() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test195#1666");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test195");
    java.lang.String str2=org.apache.commons.lang.StringUtils.right("                                                                                                                  HI!",0);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test196() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test196#1674");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test196");
    boolean boolean2=org.apache.commons.lang.StringUtils.containsNone("#########","A                                                hi!                                                 ");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ true+ "'",boolean2 == true);
  }
  @Test public void test197() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test197#1682");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test197");
    int int3=org.apache.commons.lang.math.NumberUtils.min((int)(short)1,(int)(short)-1,(int)(byte)10);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test198() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test198#1690");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test198");
    java.lang.String str1=org.apache.commons.lang.StringUtils.chop("                                              hi!");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "                                              hi"+ "'",str1.equals("                                              hi"));
  }
  @Test public void test199() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test199#1698");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test199");
    int int3=org.apache.commons.lang.math.NumberUtils.min(94,29,32);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ 29+ "'",int3 == 29);
  }
  @Test public void test200() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test200#1706");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test200");
    java.lang.String str2=org.apache.commons.lang.StringUtils.center("AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa",88);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                          AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa                          "+ "'",str2.equals("                          AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa                          "));
  }
  @Test public void test201() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test201#1714");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test201");
    boolean boolean2=org.apache.commons.lang.StringUtils.equalsIgnoreCase("Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!","                                          aaaaaaaaa i!");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test202() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test202#1722");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test202");
    java.lang.String str2=org.apache.commons.lang.StringUtils.reverseDelimitedString("          ","Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!    ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test203() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test203#1730");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test203");
    boolean boolean1=org.apache.commons.lang.StringUtils.isNotEmpty("aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test204() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test204#1738");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test204");
    int int3=org.apache.commons.lang.math.NumberUtils.max(0,(int)(short)10,29);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ 29+ "'",int3 == 29);
  }
  @Test public void test205() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test205#1746");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test205");
    byte[] byteArray0=null;
    try {
      byte byte1=org.apache.commons.lang.math.NumberUtils.max(byteArray0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
    }
 catch (    java.lang.IllegalArgumentException e) {
    }
  }
  @Test public void test206() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test206#1758");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test206");
    java.lang.String str1=org.apache.commons.lang.StringUtils.chomp("aaaaaaaaa                                    ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "aaaaaaaaa                                    "+ "'",str1.equals("aaaaaaaaa                                    "));
  }
  @Test public void test207() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test207#1766");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test207");
    java.lang.String str3=org.apache.commons.lang.StringUtils.substringBetween("                        aaaaaaaaaaaaaaaaaaaa                                                        ","   aaaaaaaaa                                        ","hi!");
    org.junit.Assert.assertNull(str3);
  }
  @Test public void test208() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test208#1774");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test208");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAlphaSpace("aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test209() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test209#1782");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test209");
    java.lang.String str3=org.apache.commons.lang.StringUtils.getNestedString("                             hi!                                   A                             ","                                                ","A                                                hi!");
    org.junit.Assert.assertNull(str3);
  }
  @Test public void test210() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test210#1790");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test210");
    java.lang.String str2=org.apache.commons.lang.StringUtils.leftPad("                                                ...                          ......                 ",(int)(short)0);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                                                ...                          ......                 "+ "'",str2.equals("                                                ...                          ......                 "));
  }
  @Test public void test211() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test211#1798");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test211");
    char[] charArray8=new char[]{'a','4',' ','4','#'};
    int int9=org.apache.commons.lang.StringUtils.indexOfAnyBut("hi!",charArray8);
    int int10=org.apache.commons.lang.StringUtils.indexOfAnyBut("                                ",charArray8);
    boolean boolean11=org.apache.commons.lang.StringUtils.containsOnly("                                                    ",charArray8);
    org.junit.Assert.assertNotNull(charArray8);
    org.junit.Assert.assertTrue("'" + int9 + "' != '"+ 0+ "'",int9 == 0);
    org.junit.Assert.assertTrue("'" + int10 + "' != '"+ (-1)+ "'",int10 == (-1));
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '"+ true+ "'",boolean11 == true);
  }
  @Test public void test212() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test212#1812");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test212");
    java.lang.String str1=org.apache.commons.lang.StringUtils.strip("                                                                                                    ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ ""+ "'",str1.equals(""));
  }
  @Test public void test213() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test213#1820");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test213");
    short short3=org.apache.commons.lang.math.NumberUtils.max((short)1,(short)1,(short)(byte)100);
    org.junit.Assert.assertTrue("'" + short3 + "' != '"+ (short)100+ "'",short3 == (short)100);
  }
  @Test public void test214() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test214#1828");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test214");
    java.lang.String str3=org.apache.commons.lang.StringUtils.rightPad("",(int)'#','a');
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"+ "'",str3.equals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
  }
  @Test public void test215() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test215#1836");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test215");
    long long3=org.apache.commons.lang.math.NumberUtils.min(1L,(long)(short)1,96L);
    org.junit.Assert.assertTrue("'" + long3 + "' != '"+ 1L+ "'",long3 == 1L);
  }
  @Test public void test216() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test216#1844");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test216");
    java.lang.String str2=org.apache.commons.lang.StringUtils.stripStart("aaaaaaaaaaaaaaaaaaaa##Aaaaaaaaa","Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!    ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "##Aaaaaaaaa"+ "'",str2.equals("##Aaaaaaaaa"));
  }
  @Test public void test217() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test217#1852");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test217");
    try {
      java.lang.Number number1=org.apache.commons.lang.math.NumberUtils.createNumber("");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: A blank string is not a valid number");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test218() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test218#1863");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test218");
    int int2=org.apache.commons.lang.StringUtils.getLevenshteinDistance("hi!","h");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 2+ "'",int2 == 2);
  }
  @Test public void test219() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test219#1871");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test219");
    int int2=org.apache.commons.lang.StringUtils.indexOfAnyBut("                                                                                                    ","                                   ");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test220() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test220#1879");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test220");
    java.lang.String str3=org.apache.commons.lang.StringUtils.leftPad("                                                                                       aaaaaaaaa ",100,'#');
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "###                                                                                       aaaaaaaaa "+ "'",str3.equals("###                                                                                       aaaaaaaaa "));
  }
  @Test public void test221() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test221#1887");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test221");
    java.lang.String str1=org.apache.commons.lang.StringUtils.stripToEmpty("aaaaaaaaa                                    ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "aaaaaaaaa"+ "'",str1.equals("aaaaaaaaa"));
  }
  @Test public void test222() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test222#1895");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test222");
    int int3=org.apache.commons.lang.math.NumberUtils.min((-1),(int)'#',4);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test223() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test223#1903");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test223");
    int int2=org.apache.commons.lang.math.NumberUtils.compare((double)96L,(double)(byte)1);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 1+ "'",int2 == 1);
  }
  @Test public void test224() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test224#1911");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test224");
    java.lang.String str2=org.apache.commons.lang.StringUtils.stripStart("#######################################################################################","aaaaaaaaaaaaaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "#######################################################################################"+ "'",str2.equals("#######################################################################################"));
  }
  @Test public void test225() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test225#1919");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test225");
    int int2=org.apache.commons.lang.math.NumberUtils.compare(100.0f,(float)2);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 1+ "'",int2 == 1);
  }
  @Test public void test226() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test226#1927");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test226");
    java.lang.String str1=org.apache.commons.lang.StringUtils.trim("aaaaaaaaa i!");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "aaaaaaaaa i!"+ "'",str1.equals("aaaaaaaaa i!"));
  }
  @Test public void test227() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test227#1935");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test227");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.splitPreserveAllTokens("                                                                                                 ","           4            ");
    org.junit.Assert.assertNotNull(strArray2);
  }
  @Test public void test228() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test228#1943");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test228");
    float float3=org.apache.commons.lang.math.NumberUtils.max((float)(short)10,0.0f,(float)48);
    org.junit.Assert.assertTrue("'" + float3 + "' != '"+ 48.0f+ "'",float3 == 48.0f);
  }
  @Test public void test229() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test229#1951");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test229");
    boolean boolean1=org.apache.commons.lang.math.NumberUtils.isDigits("aaaaaaaaaaaaaaaaaaaa                                ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test230() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test230#1959");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test230");
    float float3=org.apache.commons.lang.math.NumberUtils.min((float)32,97.0f,97.0f);
    org.junit.Assert.assertTrue("'" + float3 + "' != '"+ 32.0f+ "'",float3 == 32.0f);
  }
  @Test public void test231() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test231#1967");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test231");
    java.lang.String str1=org.apache.commons.lang.StringUtils.chop("aaaaaaaaaaaaaaaaaaaa##Aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "aaaaaaaaaaaaaaaaaaaa##Aaaaaaaa"+ "'",str1.equals("aaaaaaaaaaaaaaaaaaaa##Aaaaaaaa"));
  }
  @Test public void test232() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test232#1975");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test232");
    long long2=org.apache.commons.lang.math.NumberUtils.toLong("aaaaaaaaa i!",(long)0);
    org.junit.Assert.assertTrue("'" + long2 + "' != '"+ 0L+ "'",long2 == 0L);
  }
  @Test public void test233() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test233#1983");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test233");
    java.lang.String str2=org.apache.commons.lang.StringUtils.reverseDelimitedString("aaaaaaaaaaaaaaaaaaaa##Aaaaaaaa","aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "##A"+ "'",str2.equals("##A"));
  }
  @Test public void test234() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test234#1991");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test234");
    java.util.Collection collection0=null;
    java.lang.String str2=org.apache.commons.lang.StringUtils.join(collection0,"");
    org.junit.Assert.assertNull(str2);
  }
  @Test public void test235() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test235#2000");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test235");
    short[] shortArray0=null;
    try {
      short short1=org.apache.commons.lang.math.NumberUtils.max(shortArray0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
    }
 catch (    java.lang.IllegalArgumentException e) {
    }
  }
  @Test public void test236() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test236#2012");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test236");
    int int2=org.apache.commons.lang.StringUtils.indexOfAny("              ","aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 0+ "'",int2 == 0);
  }
  @Test public void test237() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test237#2020");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test237");
    java.lang.String str1=org.apache.commons.lang.StringUtils.stripToEmpty("           4            ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "4"+ "'",str1.equals("4"));
  }
  @Test public void test238() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test238#2028");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test238");
    byte[] byteArray3=new byte[]{(byte)100,(byte)0,(byte)100};
    byte[] byteArray6=new byte[]{(byte)-1,(byte)-1};
    boolean boolean7=org.apache.commons.lang.math.NumberUtils.equals(byteArray3,byteArray6);
    byte byte8=org.apache.commons.lang.math.NumberUtils.max(byteArray6);
    byte[] byteArray12=new byte[]{(byte)100,(byte)0,(byte)100};
    byte[] byteArray15=new byte[]{(byte)-1,(byte)-1};
    boolean boolean16=org.apache.commons.lang.math.NumberUtils.equals(byteArray12,byteArray15);
    byte byte17=org.apache.commons.lang.math.NumberUtils.min(byteArray15);
    byte[] byteArray21=new byte[]{(byte)100,(byte)0,(byte)100};
    byte[] byteArray24=new byte[]{(byte)-1,(byte)-1};
    boolean boolean25=org.apache.commons.lang.math.NumberUtils.equals(byteArray21,byteArray24);
    byte byte26=org.apache.commons.lang.math.NumberUtils.min(byteArray24);
    boolean boolean27=org.apache.commons.lang.math.NumberUtils.equals(byteArray15,byteArray24);
    byte[] byteArray28=null;
    boolean boolean29=org.apache.commons.lang.math.NumberUtils.equals(byteArray24,byteArray28);
    boolean boolean30=org.apache.commons.lang.math.NumberUtils.equals(byteArray6,byteArray28);
    try {
      byte byte31=org.apache.commons.lang.math.NumberUtils.min(byteArray28);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
    }
 catch (    java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNotNull(byteArray3);
    org.junit.Assert.assertNotNull(byteArray6);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '"+ false+ "'",boolean7 == false);
    org.junit.Assert.assertTrue("'" + byte8 + "' != '"+ (byte)-1+ "'",byte8 == (byte)-1);
    org.junit.Assert.assertNotNull(byteArray12);
    org.junit.Assert.assertNotNull(byteArray15);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '"+ false+ "'",boolean16 == false);
    org.junit.Assert.assertTrue("'" + byte17 + "' != '"+ (byte)-1+ "'",byte17 == (byte)-1);
    org.junit.Assert.assertNotNull(byteArray21);
    org.junit.Assert.assertNotNull(byteArray24);
    org.junit.Assert.assertTrue("'" + boolean25 + "' != '"+ false+ "'",boolean25 == false);
    org.junit.Assert.assertTrue("'" + byte26 + "' != '"+ (byte)-1+ "'",byte26 == (byte)-1);
    org.junit.Assert.assertTrue("'" + boolean27 + "' != '"+ true+ "'",boolean27 == true);
    org.junit.Assert.assertTrue("'" + boolean29 + "' != '"+ false+ "'",boolean29 == false);
    org.junit.Assert.assertTrue("'" + boolean30 + "' != '"+ false+ "'",boolean30 == false);
  }
  @Test public void test239() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test239#2070");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test239");
    boolean boolean1=org.apache.commons.lang.StringUtils.isNumericSpace("444444444444444444444444444444444444444444444          44444444444444444444444444444444444444444444");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test240() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test240#2078");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test240");
    java.lang.String str2=org.apache.commons.lang.StringUtils.removeEnd("                 ","444444444444444444444444444444444444444444444          44444444444444444444444444444444444444444444");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                 "+ "'",str2.equals("                 "));
  }
  @Test public void test241() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test241#2086");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test241");
    double double3=org.apache.commons.lang.math.NumberUtils.min((double)100,(double)100L,(double)(-1));
    org.junit.Assert.assertTrue("'" + double3 + "' != '"+ (-1.0d)+ "'",double3 == (-1.0d));
  }
  @Test public void test242() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test242#2094");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test242");
    boolean boolean1=org.apache.commons.lang.StringUtils.isNotEmpty("              ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test243() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test243#2102");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test243");
    int int2=org.apache.commons.lang.StringUtils.getLevenshteinDistance("Hi!","4444444Hi!aaaaaaaaa                                                                                        ");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 104+ "'",int2 == 104);
  }
  @Test public void test244() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test244#2110");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test244");
    float float3=org.apache.commons.lang.math.NumberUtils.max((float)9L,(float)'#',0.0f);
    org.junit.Assert.assertTrue("'" + float3 + "' != '"+ 35.0f+ "'",float3 == 35.0f);
  }
  @Test public void test245() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test245#2118");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test245");
    java.lang.String str3=org.apache.commons.lang.StringUtils.abbreviate("          aaaaaaaaa ",0,43);
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "          aaaaaaaaa "+ "'",str3.equals("          aaaaaaaaa "));
  }
  @Test public void test246() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test246#2126");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test246");
    byte byte3=org.apache.commons.lang.math.NumberUtils.min((byte)0,(byte)1,(byte)0);
    org.junit.Assert.assertTrue("'" + byte3 + "' != '"+ (byte)0+ "'",byte3 == (byte)0);
  }
  @Test public void test247() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test247#2134");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test247");
    double double3=org.apache.commons.lang.math.NumberUtils.min(0.0d,(double)' ',(double)'4');
    org.junit.Assert.assertTrue("'" + double3 + "' != '"+ 0.0d+ "'",double3 == 0.0d);
  }
  @Test public void test248() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test248#2142");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test248");
    java.lang.String str2=org.apache.commons.lang.StringUtils.removeStart("a                                                HI!","#################...");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "a                                                HI!"+ "'",str2.equals("a                                                HI!"));
  }
  @Test public void test249() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test249#2150");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test249");
    try {
      java.lang.Number number1=org.apache.commons.lang.math.NumberUtils.createNumber("hi!                                   A");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hi!                                   A is not a valid number.");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test250() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test250#2161");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test250");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAlpha("                         i!                         ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test251() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test251#2169");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test251");
    boolean boolean2=org.apache.commons.lang.StringUtils.equals("                         i!                         ","                                              hi");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test252() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test252#2177");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test252");
    java.lang.String str2=org.apache.commons.lang.StringUtils.getPrechomp("                                                ...                          ......                 ","                                                ...                          ......                 ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                                                ...                          ......                 "+ "'",str2.equals("                                                ...                          ......                 "));
  }
  @Test public void test253() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test253#2185");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test253");
    boolean boolean1=org.apache.commons.lang.StringUtils.isBlank("                                              hi");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test254() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test254#2193");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test254");
    double double3=org.apache.commons.lang.math.NumberUtils.max((double)35.0f,(double)100,0.0d);
    org.junit.Assert.assertTrue("'" + double3 + "' != '"+ 100.0d+ "'",double3 == 100.0d);
  }
  @Test public void test255() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test255#2201");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test255");
    double double2=org.apache.commons.lang.math.NumberUtils.toDouble("",(double)97.0f);
    org.junit.Assert.assertTrue("'" + double2 + "' != '"+ 97.0d+ "'",double2 == 97.0d);
  }
  @Test public void test256() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test256#2209");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test256");
    java.lang.String str1=org.apache.commons.lang.StringUtils.trimToNull("aaaaaaaaa                                        ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "aaaaaaaaa"+ "'",str1.equals("aaaaaaaaa"));
  }
  @Test public void test257() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test257#2217");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test257");
    java.lang.String str3=org.apache.commons.lang.StringUtils.abbreviate("hi!                                   A",(int)(byte)0,31);
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "hi!                         ..."+ "'",str3.equals("hi!                         ..."));
  }
  @Test public void test258() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test258#2225");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test258");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.split("aaaaaaaaaaaaaaaaaaaa","");
    java.lang.String[] strArray3=org.apache.commons.lang.StringUtils.stripAll(strArray2);
    java.lang.String str4=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray3);
    org.junit.Assert.assertNotNull(strArray2);
    org.junit.Assert.assertNotNull(strArray3);
    org.junit.Assert.assertTrue("'" + str4 + "' != '"+ "aaaaaaaaaaaaaaaaaaaa"+ "'",str4.equals("aaaaaaaaaaaaaaaaaaaa"));
  }
  @Test public void test259() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test259#2237");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test259");
    java.lang.Object[] objArray0=null;
    java.lang.String str2=org.apache.commons.lang.StringUtils.join(objArray0,"##A");
    org.junit.Assert.assertNull(str2);
  }
  @Test public void test260() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test260#2246");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test260");
    boolean boolean2=org.apache.commons.lang.StringUtils.equalsIgnoreCase("          #############################################################################","4");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test261() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test261#2254");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test261");
    java.lang.String str3=org.apache.commons.lang.StringUtils.replaceOnce("","4","hi!                         ...");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ ""+ "'",str3.equals(""));
  }
  @Test public void test262() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test262#2262");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test262");
    int int2=org.apache.commons.lang.StringUtils.indexOf("                                                ...                          ......                 ","");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 0+ "'",int2 == 0);
  }
  @Test public void test263() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test263#2270");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test263");
    try {
      java.math.BigInteger bigInteger1=org.apache.commons.lang.math.NumberUtils.createBigInteger("A                                                hi!                                                 ");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"A \"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test264() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test264#2281");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test264");
    java.lang.String str2=org.apache.commons.lang.StringUtils.center("                                              hi!",3);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                                              hi!"+ "'",str2.equals("                                              hi!"));
  }
  @Test public void test265() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test265#2289");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test265");
    int int2=org.apache.commons.lang.StringUtils.indexOfDifference("","#######################################################################################          ");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 0+ "'",int2 == 0);
  }
  @Test public void test266() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test266#2297");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test266");
    java.lang.String str2=org.apache.commons.lang.StringUtils.rightPad("... !ih..",(int)'4');
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "... !ih..                                           "+ "'",str2.equals("... !ih..                                           "));
  }
  @Test public void test267() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test267#2305");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test267");
    java.lang.String str2=org.apache.commons.lang.StringUtils.remove("A                                                hi!                                                 ","...                          ...");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "A                                                hi!                                                 "+ "'",str2.equals("A                                                hi!                                                 "));
  }
  @Test public void test268() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test268#2313");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test268");
    int int2=org.apache.commons.lang.StringUtils.lastIndexOf("                                                 !ih                                                ",' ');
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 99+ "'",int2 == 99);
  }
  @Test public void test269() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test269#2321");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test269");
    java.lang.String str3=org.apache.commons.lang.StringUtils.substringBetween("... !ih...","Aaaaaaaaa","");
    org.junit.Assert.assertNull(str3);
  }
  @Test public void test270() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test270#2329");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test270");
    int int1=org.apache.commons.lang.math.NumberUtils.toInt("H");
    org.junit.Assert.assertTrue("'" + int1 + "' != '"+ 0+ "'",int1 == 0);
  }
  @Test public void test271() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test271#2337");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test271");
    try {
      java.lang.Integer int1=org.apache.commons.lang.math.NumberUtils.createInteger("          aaaaaaaaa ");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"          aaaaaaaaa \"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test272() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test272#2348");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test272");
    java.lang.String str2=org.apache.commons.lang.StringUtils.getChomp("                                                hi!                                                 ","###                                                                                       aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test273() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test273#2356");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test273");
    java.lang.String[] strArray3=org.apache.commons.lang.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaa","",100);
    org.junit.Assert.assertNotNull(strArray3);
  }
  @Test public void test274() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test274#2364");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test274");
    float float1=org.apache.commons.lang.math.NumberUtils.toFloat("4");
    org.junit.Assert.assertTrue("'" + float1 + "' != '"+ 4.0f+ "'",float1 == 4.0f);
  }
  @Test public void test275() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test275#2372");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test275");
    try {
      java.lang.Number number1=org.apache.commons.lang.math.NumberUtils.createNumber("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hi! is not a valid number.");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test276() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test276#2383");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test276");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringAfterLast("","                          AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa                          ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test277() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test277#2391");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test277");
    boolean boolean2=org.apache.commons.lang.StringUtils.containsOnly("                                                                                                    ","hi!                         ...");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ true+ "'",boolean2 == true);
  }
  @Test public void test278() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test278#2399");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test278");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringBefore("Hi!                                                                                              ","aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "Hi!                                                                                              "+ "'",str2.equals("Hi!                                                                                              "));
  }
  @Test public void test279() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test279#2407");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test279");
    int int2=org.apache.commons.lang.StringUtils.getLevenshteinDistance("                                                                                       aaaaaaaaa ","#########");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 97+ "'",int2 == 97);
  }
  @Test public void test280() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test280#2415");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test280");
    java.lang.String str1=org.apache.commons.lang.StringUtils.stripToNull("Aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "Aaaaaaaaa"+ "'",str1.equals("Aaaaaaaaa"));
  }
  @Test public void test281() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test281#2423");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test281");
    double double3=org.apache.commons.lang.math.NumberUtils.min((-1.0d),(double)43,(double)9L);
    org.junit.Assert.assertTrue("'" + double3 + "' != '"+ (-1.0d)+ "'",double3 == (-1.0d));
  }
  @Test public void test282() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test282#2431");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test282");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringBefore("          "," aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "          "+ "'",str2.equals("          "));
  }
  @Test public void test283() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test283#2439");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test283");
    try {
      java.lang.Integer int1=org.apache.commons.lang.math.NumberUtils.createInteger("");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length string");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test284() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test284#2450");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test284");
    java.lang.String[] strArray6=new java.lang.String[]{"                                                                                                 "," ","A                                                hi!                                                 ","aaaaaaaaa                                                                                        ","aaaaaaaaa"};
    java.lang.String[] strArray8=org.apache.commons.lang.StringUtils.stripAll(strArray6,"");
    int int9=org.apache.commons.lang.StringUtils.indexOfAny("hi!                         ...",strArray8);
    org.junit.Assert.assertNotNull(strArray6);
    org.junit.Assert.assertNotNull(strArray8);
    org.junit.Assert.assertTrue("'" + int9 + "' != '"+ 3+ "'",int9 == 3);
  }
  @Test public void test285() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test285#2462");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test285");
    boolean boolean1=org.apache.commons.lang.StringUtils.isEmpty("AAAAAAAAA ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test286() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test286#2470");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test286");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.splitPreserveAllTokens("          ",'a');
    java.lang.String str4=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray2,"                                                    ");
    org.junit.Assert.assertNotNull(strArray2);
    org.junit.Assert.assertTrue("'" + str4 + "' != '"+ "          "+ "'",str4.equals("          "));
  }
  @Test public void test287() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test287#2480");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test287");
    boolean boolean2=org.apache.commons.lang.StringUtils.containsNone(" aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa ","aaaaaaaaaaaaaaaaaaaaAaaaaaaaa");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test288() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test288#2488");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test288");
    java.util.Collection collection0=null;
    java.lang.String str2=org.apache.commons.lang.StringUtils.join(collection0,"##A");
    org.junit.Assert.assertNull(str2);
  }
  @Test public void test289() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test289#2497");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test289");
    java.lang.String str2=org.apache.commons.lang.StringUtils.strip("!iaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA","                                                                                                                  HI!");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "iaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA"+ "'",str2.equals("iaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA"));
  }
  @Test public void test290() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test290#2505");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test290");
    int int2=org.apache.commons.lang.StringUtils.countMatches("          aaaaaaaaa ","Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!    ");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 0+ "'",int2 == 0);
  }
  @Test public void test291() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test291#2513");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test291");
    java.lang.String str2=org.apache.commons.lang.StringUtils.leftPad("##A",(int)(short)100);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                                                                                                 ##A"+ "'",str2.equals("                                                                                                 ##A"));
  }
  @Test public void test292() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test292#2521");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test292");
    int int1=org.apache.commons.lang.math.NumberUtils.stringToInt("                                ");
    org.junit.Assert.assertTrue("'" + int1 + "' != '"+ 0+ "'",int1 == 0);
  }
  @Test public void test293() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test293#2529");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test293");
    boolean boolean1=org.apache.commons.lang.StringUtils.isEmpty(" ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test294() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test294#2537");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test294");
    int int3=org.apache.commons.lang.StringUtils.lastIndexOf(" aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa ",'a',0);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test295() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test295#2545");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test295");
    int int2=org.apache.commons.lang.StringUtils.getLevenshteinDistance("                                                ","AAAAAAAAA ");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 47+ "'",int2 == 47);
  }
  @Test public void test296() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test296#2553");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test296");
    boolean boolean2=org.apache.commons.lang.StringUtils.equals("... !ih..","444444444444444444444444444444444444444444444          44444444444444444444444444444444444444444444");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test297() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test297#2561");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test297");
    byte byte3=org.apache.commons.lang.math.NumberUtils.max((byte)100,(byte)100,(byte)0);
    org.junit.Assert.assertTrue("'" + byte3 + "' != '"+ (byte)100+ "'",byte3 == (byte)100);
  }
  @Test public void test298() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test298#2569");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test298");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringBetween("                                                                                   aaaaaaaaa ","                                                    ");
    org.junit.Assert.assertNull(str2);
  }
  @Test public void test299() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test299#2577");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test299");
    java.lang.String str2=org.apache.commons.lang.StringUtils.reverseDelimitedString("aaaaaaaaa i!","aaaaaaaaa                                                                                        ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "i!"+ "'",str2.equals("i!"));
  }
  @Test public void test300() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test300#2585");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test300");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.split("... !ih...",'#');
    org.junit.Assert.assertNotNull(strArray2);
  }
  @Test public void test301() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test301#2593");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test301");
    java.lang.String str2=org.apache.commons.lang.StringUtils.center("",52);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                                                    "+ "'",str2.equals("                                                    "));
  }
  @Test public void test302() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test302#2601");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test302");
    java.lang.String str1=org.apache.commons.lang.StringUtils.uncapitalize("                                          aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "                                          aaaaaaaaa "+ "'",str1.equals("                                          aaaaaaaaa "));
  }
  @Test public void test303() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test303#2609");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test303");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringAfter("...                          ...","aa ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test304() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test304#2617");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test304");
    try {
      java.lang.Float float1=org.apache.commons.lang.math.NumberUtils.createFloat("                                                hi!                                                 ");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test305() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test305#2628");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test305");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.splitPreserveAllTokens("   ","");
    org.junit.Assert.assertNotNull(strArray2);
  }
  @Test public void test306() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test306#2636");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test306");
    java.lang.String str2=org.apache.commons.lang.StringUtils.strip("                                              hi","... !ih...");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test307() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test307#2644");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test307");
    java.lang.String str2=org.apache.commons.lang.StringUtils.defaultString("","");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test308() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test308#2652");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test308");
    int int2=org.apache.commons.lang.math.NumberUtils.compare(0.0f,(float)0);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 0+ "'",int2 == 0);
  }
  @Test public void test309() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test309#2660");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test309");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.split("","aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa");
    org.junit.Assert.assertNotNull(strArray2);
  }
  @Test public void test310() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test310#2668");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test310");
    java.lang.String str1=org.apache.commons.lang.StringUtils.capitalize("                                                hi!                                                 ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "                                                hi!                                                 "+ "'",str1.equals("                                                hi!                                                 "));
  }
  @Test public void test311() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test311#2676");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test311");
    java.lang.String str1=org.apache.commons.lang.StringUtils.trimToEmpty("A");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "A"+ "'",str1.equals("A"));
  }
  @Test public void test312() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test312#2684");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test312");
    java.lang.String str2=org.apache.commons.lang.StringUtils.reverseDelimitedString("A                                                hi!                                                 ","");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "A                                                hi!                                                 "+ "'",str2.equals("A                                                hi!                                                 "));
  }
  @Test public void test313() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test313#2692");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test313");
    int int2=org.apache.commons.lang.StringUtils.indexOf("!iaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA",'#');
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test314() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test314#2700");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test314");
    java.lang.String str1=org.apache.commons.lang.StringUtils.capitaliseAllWords("iaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "IaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA"+ "'",str1.equals("IaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA"));
  }
  @Test public void test315() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test315#2708");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test315");
    float float2=org.apache.commons.lang.math.NumberUtils.toFloat("Aaaaaaaaa ",(float)'4');
    org.junit.Assert.assertTrue("'" + float2 + "' != '"+ 52.0f+ "'",float2 == 52.0f);
  }
  @Test public void test316() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test316#2716");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test316");
    java.lang.String str1=org.apache.commons.lang.StringUtils.chop("AAAAAAAAA ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "AAAAAAAAA"+ "'",str1.equals("AAAAAAAAA"));
  }
  @Test public void test317() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test317#2724");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test317");
    java.lang.String str3=org.apache.commons.lang.StringUtils.replaceOnce("","                        aaaaaaaaaaaaaaaaaaaa                                                        ","Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!    ");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ ""+ "'",str3.equals(""));
  }
  @Test public void test318() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test318#2732");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test318");
    java.lang.String str3=org.apache.commons.lang.StringUtils.substringBetween("Hi!                                                                                              ","aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa ","hi!                         ...");
    org.junit.Assert.assertNull(str3);
  }
  @Test public void test319() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test319#2740");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test319");
    java.lang.String str1=org.apache.commons.lang.StringUtils.chopNewline("aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "aaaaaaaaa"+ "'",str1.equals("aaaaaaaaa"));
  }
  @Test public void test320() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test320#2748");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test320");
    int int3=org.apache.commons.lang.StringUtils.indexOf(" aaaaaaaaa",'a',(int)(byte)0);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ 1+ "'",int3 == 1);
  }
  @Test public void test321() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test321#2756");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test321");
    java.lang.String str1=org.apache.commons.lang.StringUtils.uncapitalise(" ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ " "+ "'",str1.equals(" "));
  }
  @Test public void test322() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test322#2764");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test322");
    boolean boolean1=org.apache.commons.lang.StringUtils.isNumericSpace("                                                                                                                  HI!");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test323() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test323#2772");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test323");
    java.lang.String str2=org.apache.commons.lang.StringUtils.stripStart("aaaaaaaaa ","#########");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "aaaaaaaaa "+ "'",str2.equals("aaaaaaaaa "));
  }
  @Test public void test324() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test324#2780");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test324");
    int int2=org.apache.commons.lang.StringUtils.lastIndexOf("                        AAAAAAAAAAAAAAAAAAAA                                                        ","");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 100+ "'",int2 == 100);
  }
  @Test public void test325() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test325#2788");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test325");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.splitPreserveAllTokens(" aaaaaaaaa",' ');
    java.lang.String str3=org.apache.commons.lang.StringUtils.concatenate((java.lang.Object[])strArray2);
    org.junit.Assert.assertNotNull(strArray2);
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "aaaaaaaaa"+ "'",str3.equals("aaaaaaaaa"));
  }
  @Test public void test326() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test326#2798");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test326");
    java.lang.String str2=org.apache.commons.lang.StringUtils.reverseDelimitedString("","aaaaaaaaaaaaaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test327() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test327#2806");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test327");
    java.lang.String str1=org.apache.commons.lang.StringUtils.chopNewline("   #######################################################################################");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "   #######################################################################################"+ "'",str1.equals("   #######################################################################################"));
  }
  @Test public void test328() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test328#2814");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test328");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringBefore("#######################################################################################","i!");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "#######################################################################################"+ "'",str2.equals("#######################################################################################"));
  }
  @Test public void test329() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test329#2822");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test329");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringBetween("","hi!                                   A");
    org.junit.Assert.assertNull(str2);
  }
  @Test public void test330() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test330#2830");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test330");
    try {
      java.lang.Long long1=org.apache.commons.lang.math.NumberUtils.createLong("                                                                                   aaaaaaaaa ");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                                                                                   aaaaaaaaa \"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test331() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test331#2841");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test331");
    short short3=org.apache.commons.lang.math.NumberUtils.min((short)0,(short)-1,(short)-1);
    org.junit.Assert.assertTrue("'" + short3 + "' != '"+ (short)-1+ "'",short3 == (short)-1);
  }
  @Test public void test332() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test332#2849");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test332");
    java.lang.String str1=org.apache.commons.lang.StringUtils.uncapitalise("                                                                                                    ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "                                                                                                    "+ "'",str1.equals("                                                                                                    "));
  }
  @Test public void test333() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test333#2857");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test333");
    java.lang.String str1=org.apache.commons.lang.StringUtils.deleteSpaces("                                            aaaaaaaaa i!                                            ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "aaaaaaaaai!"+ "'",str1.equals("aaaaaaaaai!"));
  }
  @Test public void test334() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test334#2865");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test334");
    int int3=org.apache.commons.lang.StringUtils.ordinalIndexOf("                                                                                   aaaaaaaaa ","           4            ",1);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test335() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test335#2873");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test335");
    byte byte3=org.apache.commons.lang.math.NumberUtils.max((byte)0,(byte)1,(byte)-1);
    org.junit.Assert.assertTrue("'" + byte3 + "' != '"+ (byte)1+ "'",byte3 == (byte)1);
  }
  @Test public void test336() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test336#2881");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test336");
    java.lang.String str1=org.apache.commons.lang.StringUtils.capitalize("aa ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "Aa "+ "'",str1.equals("Aa "));
  }
  @Test public void test337() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test337#2889");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test337");
    int int3=org.apache.commons.lang.StringUtils.lastIndexOf("A                                                hi!                                                 ",'#',4);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test338() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test338#2897");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test338");
    java.lang.String str4=org.apache.commons.lang.StringUtils.replace("4444444Hi!aaaaaaaaa                                                                                        ","                             hi!                                   A                             ","                                            aaaaaaaaa i!                                            ",0);
    org.junit.Assert.assertTrue("'" + str4 + "' != '"+ "4444444Hi!aaaaaaaaa                                                                                        "+ "'",str4.equals("4444444Hi!aaaaaaaaa                                                                                        "));
  }
  @Test public void test339() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test339#2905");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test339");
    boolean boolean2=org.apache.commons.lang.StringUtils.contains("                                                ","                                                                                       Aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test340() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test340#2913");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test340");
    java.lang.String[] strArray1=org.apache.commons.lang.StringUtils.splitPreserveAllTokens("");
    org.junit.Assert.assertNotNull(strArray1);
  }
  @Test public void test341() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test341#2921");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test341");
    boolean boolean2=org.apache.commons.lang.StringUtils.containsNone("           4            ","                                                                                       Aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test342() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test342#2929");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test342");
    java.lang.String str3=org.apache.commons.lang.StringUtils.replace("                                                                                                 ##A"," aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa ","                                                ");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "                                                                                                 ##A"+ "'",str3.equals("                                                                                                 ##A"));
  }
  @Test public void test343() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test343#2937");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test343");
    long long3=org.apache.commons.lang.math.NumberUtils.min((long)0,(long)10,(long)20);
    org.junit.Assert.assertTrue("'" + long3 + "' != '"+ 0L+ "'",long3 == 0L);
  }
  @Test public void test344() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test344#2945");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test344");
    java.lang.String str1=org.apache.commons.lang.StringUtils.stripToNull("AAAAAAAAA ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "AAAAAAAAA"+ "'",str1.equals("AAAAAAAAA"));
  }
  @Test public void test345() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test345#2953");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test345");
    try {
      java.lang.Integer int1=org.apache.commons.lang.math.NumberUtils.createInteger("Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai\"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test346() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test346#2964");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test346");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringAfterLast("a                                                HI!","                                            aaaaaaaaa i!                                            ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test347() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test347#2972");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test347");
    java.util.Iterator iterator0=null;
    java.lang.String str2=org.apache.commons.lang.StringUtils.join(iterator0,"                         i!                         ");
    org.junit.Assert.assertNull(str2);
  }
  @Test public void test348() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test348#2981");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test348");
    try {
      java.lang.String str3=org.apache.commons.lang.StringUtils.abbreviate("hi!                                   A",(int)'4',2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
    }
 catch (    java.lang.IllegalArgumentException e) {
    }
  }
  @Test public void test349() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test349#2992");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test349");
    int int3=org.apache.commons.lang.StringUtils.lastIndexOf("                                   ",' ',(int)(byte)10);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ 10+ "'",int3 == 10);
  }
  @Test public void test350() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test350#3000");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test350");
    java.lang.String str2=org.apache.commons.lang.StringUtils.reverseDelimited("                                                 !ih                                                ",'a');
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                                                 !ih                                                "+ "'",str2.equals("                                                 !ih                                                "));
  }
  @Test public void test351() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test351#3008");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test351");
    java.lang.String[] strArray3=org.apache.commons.lang.StringUtils.split("","                          AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa                          ",(int)(byte)10);
    org.junit.Assert.assertNotNull(strArray3);
  }
  @Test public void test352() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test352#3016");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test352");
    java.lang.String str2=org.apache.commons.lang.StringUtils.getPrechomp("aaaaaaaaa","IaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test353() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test353#3024");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test353");
    int int2=org.apache.commons.lang.StringUtils.countMatches("IaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA","                                                                                              !iH");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 0+ "'",int2 == 0);
  }
  @Test public void test354() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test354#3032");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test354");
    int[] intArray4=new int[]{100,1};
    int[] intArray11=new int[]{(byte)-1,100,(short)0,100,'#',100};
    boolean boolean12=org.apache.commons.lang.math.NumberUtils.equals(intArray4,intArray11);
    java.lang.String[] strArray16=org.apache.commons.lang.StringUtils.splitByWholeSeparator("","                                                                                                 ");
    java.lang.Object[] objArray17=new java.lang.Object[]{(byte)10,"aaaaaaaaa                                                                                        ",boolean12,"aaaaaaaaa ",strArray16};
    java.lang.String str19=org.apache.commons.lang.StringUtils.join(objArray17,"hi!");
    java.lang.String str23=org.apache.commons.lang.StringUtils.join(objArray17," aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa ",(int)(short)100,52);
    java.lang.String str25=org.apache.commons.lang.StringUtils.join(objArray17,"...                          ...");
    java.lang.String str29=org.apache.commons.lang.StringUtils.join(objArray17,"h",97,(-1));
    org.junit.Assert.assertNotNull(intArray4);
    org.junit.Assert.assertNotNull(intArray11);
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '"+ false+ "'",boolean12 == false);
    org.junit.Assert.assertNotNull(strArray16);
    org.junit.Assert.assertNotNull(objArray17);
    org.junit.Assert.assertTrue("'" + str23 + "' != '"+ ""+ "'",str23.equals(""));
    org.junit.Assert.assertTrue("'" + str29 + "' != '"+ ""+ "'",str29.equals(""));
  }
  @Test public void test355() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test355#3054");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test355");
    java.lang.String str2=org.apache.commons.lang.StringUtils.getNestedString("                          AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa                          ","aaaaaaaaa                                    ");
    org.junit.Assert.assertNull(str2);
  }
  @Test public void test356() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test356#3062");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test356");
    java.lang.String str1=org.apache.commons.lang.StringUtils.escape("AAAAAAAAA ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "AAAAAAAAA "+ "'",str1.equals("AAAAAAAAA "));
  }
  @Test public void test357() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test357#3070");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test357");
    boolean boolean2=org.apache.commons.lang.StringUtils.containsOnly("aaaaaaaaa                                    ","aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test358() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test358#3078");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test358");
    try {
      java.lang.Double double1=org.apache.commons.lang.math.NumberUtils.createDouble("##Aaaaaaaaa");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"##Aaaaaaaaa\"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test359() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test359#3089");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test359");
    double double2=org.apache.commons.lang.math.NumberUtils.toDouble("                             Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!",(double)48);
    org.junit.Assert.assertTrue("'" + double2 + "' != '"+ 48.0d+ "'",double2 == 48.0d);
  }
  @Test public void test360() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test360#3097");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test360");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substring("Hi!                                                                                              ",(int)'a');
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test361() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test361#3105");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test361");
    boolean boolean1=org.apache.commons.lang.StringUtils.isNumericSpace("               ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test362() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test362#3113");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test362");
    java.lang.String str1=org.apache.commons.lang.StringUtils.swapCase("4444444Hi!aaaaaaaaa                                                                                        ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "4444444hI!AAAAAAAAA                                                                                        "+ "'",str1.equals("4444444hI!AAAAAAAAA                                                                                        "));
  }
  @Test public void test363() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test363#3121");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test363");
    java.lang.String str1=org.apache.commons.lang.StringUtils.chopNewline("aaaaaaaaa i!");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "aaaaaaaaa i!"+ "'",str1.equals("aaaaaaaaa i!"));
  }
  @Test public void test364() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test364#3129");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test364");
    java.lang.String str4=org.apache.commons.lang.StringUtils.overlay("Hi!                                   A","   #######################################################################################",31,3);
    org.junit.Assert.assertTrue("'" + str4 + "' != '"+ "Hi!   #######################################################################################       A"+ "'",str4.equals("Hi!   #######################################################################################       A"));
  }
  @Test public void test365() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test365#3137");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test365");
    int int2=org.apache.commons.lang.StringUtils.countMatches("                                          aaaaaaaaa i!","Hi!                                                                                              ");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 0+ "'",int2 == 0);
  }
  @Test public void test366() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test366#3145");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test366");
    java.lang.String str1=org.apache.commons.lang.StringUtils.capitalize("                                                    ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "                                                    "+ "'",str1.equals("                                                    "));
  }
  @Test public void test367() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test367#3153");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test367");
    java.lang.String str1=org.apache.commons.lang.StringUtils.trimToNull("IaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "IaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA"+ "'",str1.equals("IaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA"));
  }
  @Test public void test368() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test368#3161");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test368");
    long long1=org.apache.commons.lang.math.NumberUtils.toLong("                                ");
    org.junit.Assert.assertTrue("'" + long1 + "' != '"+ 0L+ "'",long1 == 0L);
  }
  @Test public void test369() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test369#3169");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test369");
    java.util.Collection collection0=null;
    java.lang.String str2=org.apache.commons.lang.StringUtils.join(collection0,"a                                                HI!                                                 ");
    org.junit.Assert.assertNull(str2);
  }
  @Test public void test370() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test370#3178");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test370");
    boolean boolean2=org.apache.commons.lang.StringUtils.containsOnly("##Aaaaaaaaa","IaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test371() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test371#3186");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test371");
    long long3=org.apache.commons.lang.math.NumberUtils.max((long)99,(long)47,(long)32);
    org.junit.Assert.assertTrue("'" + long3 + "' != '"+ 99L+ "'",long3 == 99L);
  }
  @Test public void test372() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test372#3194");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test372");
    char[] charArray7=new char[]{'4','4','#'};
    boolean boolean8=org.apache.commons.lang.StringUtils.containsNone("aaaaaaaaa",charArray7);
    int int9=org.apache.commons.lang.StringUtils.indexOfAny("Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!",charArray7);
    boolean boolean10=org.apache.commons.lang.StringUtils.containsNone("4444444Hi!aaaaaaaaa                                                                                        ",charArray7);
    boolean boolean11=org.apache.commons.lang.StringUtils.containsNone("   ",charArray7);
    org.junit.Assert.assertNotNull(charArray7);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '"+ true+ "'",boolean8 == true);
    org.junit.Assert.assertTrue("'" + int9 + "' != '"+ (-1)+ "'",int9 == (-1));
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '"+ false+ "'",boolean10 == false);
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '"+ true+ "'",boolean11 == true);
  }
  @Test public void test373() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test373#3210");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test373");
    boolean boolean2=org.apache.commons.lang.StringUtils.containsOnly("A                                                hi!","                                                ...                          ......                 ");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test374() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test374#3218");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test374");
    int int1=org.apache.commons.lang.math.NumberUtils.toInt("                                                hi!                                                 ");
    org.junit.Assert.assertTrue("'" + int1 + "' != '"+ 0+ "'",int1 == 0);
  }
  @Test public void test375() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test375#3226");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test375");
    java.lang.String str1=org.apache.commons.lang.StringUtils.capitaliseAllWords("444444444444444444444444444444444444444444444          44444444444444444444444444444444444444444444");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "444444444444444444444444444444444444444444444          44444444444444444444444444444444444444444444"+ "'",str1.equals("444444444444444444444444444444444444444444444          44444444444444444444444444444444444444444444"));
  }
  @Test public void test376() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test376#3234");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test376");
    java.lang.String str1=org.apache.commons.lang.StringUtils.strip("#######################################################################################");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "#######################################################################################"+ "'",str1.equals("#######################################################################################"));
  }
  @Test public void test377() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test377#3242");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test377");
    java.lang.String str4=org.apache.commons.lang.StringUtils.overlayString("                                                hi!                                                 "," aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa ",(int)'#',10);
    org.junit.Assert.assertTrue("'" + str4 + "' != '"+ "                                    aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa                                       hi!                                                 "+ "'",str4.equals("                                    aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa                                       hi!                                                 "));
  }
  @Test public void test378() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test378#3250");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test378");
    boolean boolean2=org.apache.commons.lang.StringUtils.containsOnly("4444444hI!AAAAAAAAA                                                                                        ","                   ");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test379() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test379#3258");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test379");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringBeforeLast("Aa ","4444444Hi!");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "Aa "+ "'",str2.equals("Aa "));
  }
  @Test public void test380() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test380#3266");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test380");
    int int2=org.apache.commons.lang.math.NumberUtils.toInt("4",(int)(short)-1);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 4+ "'",int2 == 4);
  }
  @Test public void test381() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test381#3274");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test381");
    java.lang.String str1=org.apache.commons.lang.StringUtils.strip(" ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ ""+ "'",str1.equals(""));
  }
  @Test public void test382() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test382#3282");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test382");
    boolean boolean2=org.apache.commons.lang.StringUtils.equals("H","                                              hi!");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test383() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test383#3290");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test383");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringAfter("#############################################################################","                                   ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test384() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test384#3298");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test384");
    java.lang.String[] strArray5=new java.lang.String[]{"                                                                                                 "," ","A                                                hi!                                                 ","aaaaaaaaa                                                                                        ","aaaaaaaaa"};
    java.lang.String[] strArray7=org.apache.commons.lang.StringUtils.stripAll(strArray5,"");
    try {
      java.lang.String str11=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray5,"!ih",48,96);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 48");
    }
 catch (    java.lang.ArrayIndexOutOfBoundsException e) {
    }
    org.junit.Assert.assertNotNull(strArray5);
    org.junit.Assert.assertNotNull(strArray7);
  }
  @Test public void test385() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test385#3313");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test385");
    int int3=org.apache.commons.lang.StringUtils.lastIndexOf("iaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA","a                                                HI!                                                 ",(int)(short)1);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test386() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test386#3321");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test386");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringAfter("#######################################################################################","H");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test387() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test387#3329");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test387");
    int int3=org.apache.commons.lang.StringUtils.indexOf("A",'a',0);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test388() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test388#3337");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test388");
    java.lang.String str1=org.apache.commons.lang.StringUtils.strip("");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ ""+ "'",str1.equals(""));
  }
  @Test public void test389() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test389#3345");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test389");
    java.lang.String str1=org.apache.commons.lang.StringUtils.chomp("                                                                                   aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "                                                                                   aaaaaaaaa "+ "'",str1.equals("                                                                                   aaaaaaaaa "));
  }
  @Test public void test390() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test390#3353");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test390");
    java.lang.String str2=org.apache.commons.lang.StringUtils.chomp("a                                                HI!","                                                                                                 ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "a                                                HI!"+ "'",str2.equals("a                                                HI!"));
  }
  @Test public void test391() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test391#3361");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test391");
    boolean boolean2=org.apache.commons.lang.StringUtils.containsIgnoreCase("hi!","#################...");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test392() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test392#3369");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test392");
    short short3=org.apache.commons.lang.math.NumberUtils.min((short)(byte)1,(short)(byte)100,(short)(byte)-1);
    org.junit.Assert.assertTrue("'" + short3 + "' != '"+ (short)-1+ "'",short3 == (short)-1);
  }
  @Test public void test393() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test393#3377");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test393");
    short short3=org.apache.commons.lang.math.NumberUtils.max((short)(byte)10,(short)(byte)0,(short)0);
    org.junit.Assert.assertTrue("'" + short3 + "' != '"+ (short)10+ "'",short3 == (short)10);
  }
  @Test public void test394() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test394#3385");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test394");
    java.lang.String str2=org.apache.commons.lang.StringUtils.repeat("",97);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test395() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test395#3393");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test395");
    java.lang.String str1=org.apache.commons.lang.StringUtils.reverse("                                ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "                                "+ "'",str1.equals("                                "));
  }
  @Test public void test396() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test396#3401");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test396");
    try {
      java.lang.String str4=org.apache.commons.lang.StringUtils.overlayString("4444444Hi!","hi!",52,(int)(short)1);
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 52");
    }
 catch (    java.lang.StringIndexOutOfBoundsException e) {
    }
  }
  @Test public void test397() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test397#3412");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test397");
    float float3=org.apache.commons.lang.math.NumberUtils.max(0.0f,(float)(byte)100,(float)(byte)-1);
    org.junit.Assert.assertTrue("'" + float3 + "' != '"+ 100.0f+ "'",float3 == 100.0f);
  }
  @Test public void test398() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test398#3420");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test398");
    java.lang.String str2=org.apache.commons.lang.StringUtils.getChomp("                                                    ","");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test399() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test399#3428");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test399");
    java.lang.String str1=org.apache.commons.lang.StringUtils.deleteWhitespace("aaaaaaaaai!");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "aaaaaaaaai!"+ "'",str1.equals("aaaaaaaaai!"));
  }
  @Test public void test400() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test400#3436");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test400");
    try {
      java.math.BigDecimal bigDecimal1=org.apache.commons.lang.math.NumberUtils.createBigDecimal("!ih");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test401() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test401#3447");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test401");
    boolean boolean2=org.apache.commons.lang.StringUtils.contains("444444444444444444444444444444444444444444444          444444444444444444444444444444444444444444444","#############################################################################          ");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test402() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test402#3455");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test402");
    try {
      java.lang.Double double1=org.apache.commons.lang.math.NumberUtils.createDouble("                                                                                                         HI!");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"HI!\"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test403() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test403#3466");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test403");
    char[] charArray1=null;
    int int2=org.apache.commons.lang.StringUtils.indexOfAnyBut("444444444444444444444444444444444444444444444          444444444444444444444444444444444444444444444",charArray1);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test404() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test404#3475");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test404");
    boolean boolean2=org.apache.commons.lang.StringUtils.equals("###                                                                                       aaaaaaaaa ","                        aaaaaaaaaaaaaaaaaaaa                                                        ");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test405() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test405#3483");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test405");
    short short3=org.apache.commons.lang.math.NumberUtils.max((short)10,(short)10,(short)1);
    org.junit.Assert.assertTrue("'" + short3 + "' != '"+ (short)10+ "'",short3 == (short)10);
  }
  @Test public void test406() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test406#3491");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test406");
    boolean boolean2=org.apache.commons.lang.StringUtils.containsNone("Hi!                                   A","4444444444444444444444444444444444                                4444444444444444444444444444444444");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test407() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test407#3499");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test407");
    float float2=org.apache.commons.lang.math.NumberUtils.toFloat("",0.0f);
    org.junit.Assert.assertTrue("'" + float2 + "' != '"+ 0.0f+ "'",float2 == 0.0f);
  }
  @Test public void test408() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test408#3507");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test408");
    int int2=org.apache.commons.lang.StringUtils.lastIndexOf("","h");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test409() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test409#3515");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test409");
    float float3=org.apache.commons.lang.math.NumberUtils.min((float)0L,(float)0,(float)48);
    org.junit.Assert.assertTrue("'" + float3 + "' != '"+ 0.0f+ "'",float3 == 0.0f);
  }
  @Test public void test410() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test410#3523");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test410");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAlphanumeric(" ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test411() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test411#3531");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test411");
    int int2=org.apache.commons.lang.math.NumberUtils.compare((float)(byte)0,(float)10);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test412() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test412#3539");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test412");
    boolean boolean2=org.apache.commons.lang.StringUtils.contains("",'#');
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test413() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test413#3547");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test413");
    boolean boolean1=org.apache.commons.lang.StringUtils.isEmpty("                         i!                         ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test414() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test414#3555");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test414");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.split("   aaaaaaaaa                                        ","                        aaaaaaaaaaaaaaaaaaaa                                                        ");
    org.junit.Assert.assertNotNull(strArray2);
  }
  @Test public void test415() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test415#3563");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test415");
    java.util.Iterator iterator0=null;
    java.lang.String str2=org.apache.commons.lang.StringUtils.join(iterator0,"");
    org.junit.Assert.assertNull(str2);
  }
  @Test public void test416() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test416#3572");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test416");
    char[] charArray1=null;
    int int2=org.apache.commons.lang.StringUtils.indexOfAny("###                                                                                       aaaaaaaaa ",charArray1);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test417() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test417#3581");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test417");
    java.lang.String str1=org.apache.commons.lang.StringUtils.lowerCase("              ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "              "+ "'",str1.equals("              "));
  }
  @Test public void test418() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test418#3589");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test418");
    try {
      java.lang.Integer int1=org.apache.commons.lang.math.NumberUtils.createInteger("... !ih..");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"... !ih..\"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test419() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test419#3600");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test419");
    int int3=org.apache.commons.lang.math.NumberUtils.min(47,0,99);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ 0+ "'",int3 == 0);
  }
  @Test public void test420() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test420#3608");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test420");
    try {
      java.math.BigInteger bigInteger1=org.apache.commons.lang.math.NumberUtils.createBigInteger("                   ");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \" \"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test421() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test421#3619");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test421");
    java.lang.String str1=org.apache.commons.lang.StringUtils.capitalize("...                          ...");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "...                          ..."+ "'",str1.equals("...                          ..."));
  }
  @Test public void test422() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test422#3627");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test422");
    int int3=org.apache.commons.lang.StringUtils.indexOf("",'a',24);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test423() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test423#3635");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test423");
    java.lang.String str2=org.apache.commons.lang.StringUtils.left("aaaaaaaaaaaaaaaaaaaa##Aaaaaaaaa",0);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test424() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test424#3643");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test424");
    double double3=org.apache.commons.lang.math.NumberUtils.max((double)97L,(double)88,(double)10);
    org.junit.Assert.assertTrue("'" + double3 + "' != '"+ 97.0d+ "'",double3 == 97.0d);
  }
  @Test public void test425() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test425#3651");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test425");
    try {
      java.lang.Double double1=org.apache.commons.lang.math.NumberUtils.createDouble("4444444hI!AAAAAAAAA                                                                                        ");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4444444hI!AAAAAAAAA\"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test426() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test426#3662");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test426");
    java.lang.String str2=org.apache.commons.lang.StringUtils.difference("                                    aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa                                       hi!                                                 ","4");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "4"+ "'",str2.equals("4"));
  }
  @Test public void test427() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test427#3670");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test427");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringAfterLast("                                                                                                         HI!","Hi!                                                                                              ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test428() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test428#3678");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test428");
    int int2=org.apache.commons.lang.math.NumberUtils.compare(1.0f,(float)10L);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test429() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test429#3686");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test429");
    java.lang.String str2=org.apache.commons.lang.StringUtils.defaultString("           4            ","   aaaaaaaaa                                        ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "           4            "+ "'",str2.equals("           4            "));
  }
  @Test public void test430() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test430#3694");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test430");
    try {
      java.math.BigDecimal bigDecimal1=org.apache.commons.lang.math.NumberUtils.createBigDecimal("AAAAAAAAA ");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test431() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test431#3705");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test431");
    java.lang.String str2=org.apache.commons.lang.StringUtils.right("          #############################################################################",(int)(byte)0);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test432() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test432#3713");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test432");
    java.lang.String str2=org.apache.commons.lang.StringUtils.chompLast("!ih","");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "!ih"+ "'",str2.equals("!ih"));
  }
  @Test public void test433() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test433#3721");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test433");
    long long3=org.apache.commons.lang.math.NumberUtils.min((long)99,(long)94,97L);
    org.junit.Assert.assertTrue("'" + long3 + "' != '"+ 94L+ "'",long3 == 94L);
  }
  @Test public void test434() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test434#3729");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test434");
    double double2=org.apache.commons.lang.math.NumberUtils.toDouble("444444444444444444444444444444444444444444444          44444444444444444444444444444444444444444444",0.0d);
    org.junit.Assert.assertTrue("'" + double2 + "' != '"+ 0.0d+ "'",double2 == 0.0d);
  }
  @Test public void test435() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test435#3737");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test435");
    java.lang.String str2=org.apache.commons.lang.StringUtils.left("                                              hi",31);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                               "+ "'",str2.equals("                               "));
  }
  @Test public void test436() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test436#3745");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test436");
    boolean boolean1=org.apache.commons.lang.StringUtils.isWhitespace("                             hi!                                   A                             ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test437() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test437#3753");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test437");
    java.lang.String[] strArray1=org.apache.commons.lang.StringUtils.splitPreserveAllTokens("          ");
    java.lang.Class<?> wildcardClass2=strArray1.getClass();
    org.junit.Assert.assertNotNull(strArray1);
    org.junit.Assert.assertNotNull(wildcardClass2);
  }
  @Test public void test438() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test438#3763");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test438");
    java.lang.String str2=org.apache.commons.lang.StringUtils.removeEnd("4444444Hi!aaaaaaaaa                                                                                        ","aaaaaaaaa i!");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "4444444Hi!aaaaaaaaa                                                                                        "+ "'",str2.equals("4444444Hi!aaaaaaaaa                                                                                        "));
  }
  @Test public void test439() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test439#3771");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test439");
    java.lang.String str1=org.apache.commons.lang.StringUtils.reverse("hi!A");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "A!ih"+ "'",str1.equals("A!ih"));
  }
  @Test public void test440() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test440#3779");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test440");
    java.lang.String str3=org.apache.commons.lang.StringUtils.abbreviate("hi!A",(int)'a',4);
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "hi!A"+ "'",str3.equals("hi!A"));
  }
  @Test public void test441() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test441#3787");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test441");
    try {
      java.lang.Double double1=org.apache.commons.lang.math.NumberUtils.createDouble("   aaaaaaaaa                                        ");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaaaaaaa\"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test442() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test442#3798");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test442");
    int[] intArray0=null;
    try {
      int int1=org.apache.commons.lang.math.NumberUtils.min(intArray0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
    }
 catch (    java.lang.IllegalArgumentException e) {
    }
  }
  @Test public void test443() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test443#3810");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test443");
    int int2=org.apache.commons.lang.StringUtils.lastIndexOf("",'4');
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test444() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test444#3818");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test444");
    java.lang.String[] strArray3=org.apache.commons.lang.StringUtils.splitPreserveAllTokens("                        aaaaaaaaaaaaaaaaaaaa                                                        ","4",(int)(short)-1);
    java.lang.String[] strArray4=org.apache.commons.lang.StringUtils.stripAll(strArray3);
    org.junit.Assert.assertNotNull(strArray3);
    org.junit.Assert.assertNotNull(strArray4);
  }
  @Test public void test445() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test445#3828");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test445");
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
      double double27=org.apache.commons.lang.math.NumberUtils.min(doubleArray16);
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
  @Test public void test446() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test446#3868");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test446");
    java.util.Collection collection0=null;
    java.lang.String str2=org.apache.commons.lang.StringUtils.join(collection0,"###                                                                                       aaaaaaaaa ");
    org.junit.Assert.assertNull(str2);
  }
  @Test public void test447() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test447#3877");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test447");
    int int2=org.apache.commons.lang.math.NumberUtils.stringToInt("#######################################################################################",9);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 9+ "'",int2 == 9);
  }
  @Test public void test448() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test448#3885");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test448");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAlpha("!ih");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test449() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test449#3893");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test449");
    java.lang.String str2=org.apache.commons.lang.StringUtils.right("",104);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test450() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test450#3901");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test450");
    java.lang.String str3=org.apache.commons.lang.StringUtils.getNestedString("","                             hi!                                   A                             ","IaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA");
    org.junit.Assert.assertNull(str3);
  }
  @Test public void test451() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test451#3909");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test451");
    java.lang.String str1=org.apache.commons.lang.StringUtils.capitalise("                                    aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa                                       hi!                                                 ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "                                    aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa                                       hi!                                                 "+ "'",str1.equals("                                    aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa                                       hi!                                                 "));
  }
  @Test public void test452() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test452#3917");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test452");
    java.lang.String str4=org.apache.commons.lang.StringUtils.replace("                   ","                                                                                                ","                                                ...                          ......                 ",(int)(byte)100);
    org.junit.Assert.assertTrue("'" + str4 + "' != '"+ "                   "+ "'",str4.equals("                   "));
  }
  @Test public void test453() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test453#3925");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test453");
    long long3=org.apache.commons.lang.math.NumberUtils.min((long)88,(long)47,(long)10);
    org.junit.Assert.assertTrue("'" + long3 + "' != '"+ 10L+ "'",long3 == 10L);
  }
  @Test public void test454() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test454#3933");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test454");
    float[] floatArray0=null;
    float[] floatArray2=new float[]{(byte)1};
    float float3=org.apache.commons.lang.math.NumberUtils.max(floatArray2);
    float float4=org.apache.commons.lang.math.NumberUtils.min(floatArray2);
    boolean boolean5=org.apache.commons.lang.math.NumberUtils.equals(floatArray0,floatArray2);
    org.junit.Assert.assertNotNull(floatArray2);
    org.junit.Assert.assertTrue("'" + float3 + "' != '"+ 1.0f+ "'",float3 == 1.0f);
    org.junit.Assert.assertTrue("'" + float4 + "' != '"+ 1.0f+ "'",float4 == 1.0f);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '"+ false+ "'",boolean5 == false);
  }
  @Test public void test455() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test455#3948");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test455");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringBetween("aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa","Hi!                                                                                              ");
    org.junit.Assert.assertNull(str2);
  }
  @Test public void test456() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test456#3956");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test456");
    java.lang.String str3=org.apache.commons.lang.StringUtils.rightPad("",7," aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ " aaaaaa"+ "'",str3.equals(" aaaaaa"));
  }
  @Test public void test457() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test457#3964");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test457");
    int int3=org.apache.commons.lang.StringUtils.lastIndexOf("... !ih...","A",(-1));
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test458() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test458#3972");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test458");
    java.lang.String str4=org.apache.commons.lang.StringUtils.overlay("... !ih...","aaaaaaaaaaaaaaaaaaaa                                ",(int)'4',(int)'a');
    org.junit.Assert.assertTrue("'" + str4 + "' != '"+ "... !ih...aaaaaaaaaaaaaaaaaaaa                                "+ "'",str4.equals("... !ih...aaaaaaaaaaaaaaaaaaaa                                "));
  }
  @Test public void test459() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test459#3980");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test459");
    java.lang.String str2=org.apache.commons.lang.StringUtils.repeat("H",(int)(short)0);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test460() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test460#3988");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test460");
    java.lang.String str3=org.apache.commons.lang.StringUtils.replace("aaaaaaaaaaaaaaaaaaaa                                ","","aaaaaaaaa                                    ");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "aaaaaaaaaaaaaaaaaaaa                                "+ "'",str3.equals("aaaaaaaaaaaaaaaaaaaa                                "));
  }
  @Test public void test461() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test461#3996");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test461");
    float float2=org.apache.commons.lang.math.NumberUtils.toFloat("4444444hI!AAAAAAAAA                                                                                        ",(float)35);
    org.junit.Assert.assertTrue("'" + float2 + "' != '"+ 35.0f+ "'",float2 == 35.0f);
  }
  @Test public void test462() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test462#4004");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test462");
    java.lang.Object[] objArray0=null;
    java.lang.String str2=org.apache.commons.lang.StringUtils.join(objArray0,"                                                                                   aaaaaaaaa ");
    org.junit.Assert.assertNull(str2);
  }
  @Test public void test463() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test463#4013");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test463");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAlpha("##Aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test464() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test464#4021");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test464");
    java.lang.String str1=org.apache.commons.lang.StringUtils.deleteSpaces("Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaai!"+ "'",str1.equals("AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaai!"));
  }
  @Test public void test465() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test465#4029");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test465");
    boolean boolean2=org.apache.commons.lang.StringUtils.containsIgnoreCase("                                          aaaaaaaaa i!","          aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ true+ "'",boolean2 == true);
  }
  @Test public void test466() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test466#4037");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test466");
    int int2=org.apache.commons.lang.StringUtils.indexOf("                                                                                       Aaaaaaaaa ",'a');
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 88+ "'",int2 == 88);
  }
  @Test public void test467() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test467#4045");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test467");
    int int2=org.apache.commons.lang.StringUtils.indexOfAny("#########","... !ih..");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test468() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test468#4053");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test468");
    int int2=org.apache.commons.lang.StringUtils.indexOfAnyBut("          ","!ih");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 0+ "'",int2 == 0);
  }
  @Test public void test469() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test469#4061");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test469");
    double double3=org.apache.commons.lang.math.NumberUtils.max(52.0d,(double)52.0f,0.0d);
    org.junit.Assert.assertTrue("'" + double3 + "' != '"+ 52.0d+ "'",double3 == 52.0d);
  }
  @Test public void test470() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test470#4069");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test470");
    int int2=org.apache.commons.lang.math.NumberUtils.compare((float)94L,(float)24);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 1+ "'",int2 == 1);
  }
  @Test public void test471() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test471#4077");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test471");
    java.lang.String str2=org.apache.commons.lang.StringUtils.reverseDelimited("aaaaaaaaa                                    ",'4');
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "aaaaaaaaa                                    "+ "'",str2.equals("aaaaaaaaa                                    "));
  }
  @Test public void test472() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test472#4085");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test472");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAlphanumericSpace("hi!");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test473() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test473#4093");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test473");
    int int1=org.apache.commons.lang.math.NumberUtils.toInt("aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + int1 + "' != '"+ 0+ "'",int1 == 0);
  }
  @Test public void test474() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test474#4101");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test474");
    java.lang.String str3=org.apache.commons.lang.StringUtils.mid("444444444444444444444444444444444444444444444          44444444444444444444444444444444444444444444",2,(int)(short)0);
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ ""+ "'",str3.equals(""));
  }
  @Test public void test475() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test475#4109");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test475");
    boolean boolean1=org.apache.commons.lang.StringUtils.isNotBlank("!ih");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test476() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test476#4117");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test476");
    int int2=org.apache.commons.lang.StringUtils.indexOfAny("               ","   #######################################################################################");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 0+ "'",int2 == 0);
  }
  @Test public void test477() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test477#4125");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test477");
    int int2=org.apache.commons.lang.StringUtils.countMatches("Aaaaaaaaa","                                                                                       Aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 0+ "'",int2 == 0);
  }
  @Test public void test478() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test478#4133");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test478");
    short short3=org.apache.commons.lang.math.NumberUtils.max((short)-1,(short)10,(short)(byte)-1);
    org.junit.Assert.assertTrue("'" + short3 + "' != '"+ (short)10+ "'",short3 == (short)10);
  }
  @Test public void test479() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test479#4141");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test479");
    java.lang.String[] strArray0=null;
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.stripAll(strArray0,"aaaaaaaaaaaaaaaaaaaaAaaaaaaaa");
    org.junit.Assert.assertNull(strArray2);
  }
  @Test public void test480() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test480#4150");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test480");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.split("###                                                                                       aaaaaaaaa ",'4');
    org.junit.Assert.assertNotNull(strArray2);
  }
  @Test public void test481() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test481#4158");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test481");
    java.lang.String str2=org.apache.commons.lang.StringUtils.defaultIfEmpty("","hi!                         ...");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "hi!                         ..."+ "'",str2.equals("hi!                         ..."));
  }
  @Test public void test482() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test482#4166");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test482");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringAfter("","                                                    ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test483() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test483#4174");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test483");
    try {
      java.lang.Number number1=org.apache.commons.lang.math.NumberUtils.createNumber("aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa ");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa  is not a valid number.");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test484() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test484#4185");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test484");
    try {
      java.math.BigInteger bigInteger1=org.apache.commons.lang.math.NumberUtils.createBigInteger("iaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"iaaaaaaaA\"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test485() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test485#4196");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test485");
    boolean boolean1=org.apache.commons.lang.math.NumberUtils.isDigits("... !ih..                                           ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test486() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test486#4204");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test486");
    byte byte3=org.apache.commons.lang.math.NumberUtils.max((byte)0,(byte)-1,(byte)0);
    org.junit.Assert.assertTrue("'" + byte3 + "' != '"+ (byte)0+ "'",byte3 == (byte)0);
  }
  @Test public void test487() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test487#4212");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test487");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAlpha("                                                 !ih                                                ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test488() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test488#4220");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test488");
    try {
      java.lang.Integer int1=org.apache.commons.lang.math.NumberUtils.createInteger("H");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"H\"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test489() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test489#4231");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test489");
    java.lang.Float float1=org.apache.commons.lang.math.NumberUtils.createFloat("4");
    org.junit.Assert.assertTrue("'" + float1 + "' != '"+ 4.0f+ "'",float1.equals(4.0f));
  }
  @Test public void test490() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test490#4239");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test490");
    java.lang.String[] strArray3=org.apache.commons.lang.StringUtils.splitPreserveAllTokens("                                                                                                    ","                 ",(int)(short)1);
    org.junit.Assert.assertNotNull(strArray3);
  }
  @Test public void test491() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test491#4247");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test491");
    float[] floatArray4=new float[]{10,(byte)1,1L,(byte)-1};
    float float5=org.apache.commons.lang.math.NumberUtils.max(floatArray4);
    float[] floatArray6=null;
    boolean boolean7=org.apache.commons.lang.math.NumberUtils.equals(floatArray4,floatArray6);
    try {
      float float8=org.apache.commons.lang.math.NumberUtils.min(floatArray6);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
    }
 catch (    java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNotNull(floatArray4);
    org.junit.Assert.assertTrue("'" + float5 + "' != '"+ 10.0f+ "'",float5 == 10.0f);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '"+ false+ "'",boolean7 == false);
  }
  @Test public void test492() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test492#4265");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test492");
    int[] intArray2=new int[]{100,1};
    int[] intArray9=new int[]{(byte)-1,100,(short)0,100,'#',100};
    boolean boolean10=org.apache.commons.lang.math.NumberUtils.equals(intArray2,intArray9);
    int[] intArray17=new int[]{'4',(short)100,(short)100,52,(byte)1,(short)100};
    boolean boolean18=org.apache.commons.lang.math.NumberUtils.equals(intArray9,intArray17);
    int int19=org.apache.commons.lang.math.NumberUtils.max(intArray9);
    org.junit.Assert.assertNotNull(intArray2);
    org.junit.Assert.assertNotNull(intArray9);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '"+ false+ "'",boolean10 == false);
    org.junit.Assert.assertNotNull(intArray17);
    org.junit.Assert.assertTrue("'" + boolean18 + "' != '"+ false+ "'",boolean18 == false);
    org.junit.Assert.assertTrue("'" + int19 + "' != '"+ 100+ "'",int19 == 100);
  }
  @Test public void test493() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test493#4283");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test493");
    float float3=org.apache.commons.lang.math.NumberUtils.min((float)88,0.0f,(float)9);
    org.junit.Assert.assertTrue("'" + float3 + "' != '"+ 0.0f+ "'",float3 == 0.0f);
  }
  @Test public void test494() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test494#4291");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test494");
    float float3=org.apache.commons.lang.math.NumberUtils.max((float)32,0.0f,(float)35L);
    org.junit.Assert.assertTrue("'" + float3 + "' != '"+ 35.0f+ "'",float3 == 35.0f);
  }
  @Test public void test495() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test495#4299");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test495");
    boolean boolean2=org.apache.commons.lang.StringUtils.containsNone("aaaaaaaaaaaaaaaaaaaa##Aaaaaaaa","Hi!                                   A");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test496() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test496#4307");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test496");
    java.lang.String str2=org.apache.commons.lang.StringUtils.center("              ",0);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "              "+ "'",str2.equals("              "));
  }
  @Test public void test497() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test497#4315");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test497");
    boolean boolean2=org.apache.commons.lang.StringUtils.containsIgnoreCase("               ","hi!");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test498() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test498#4323");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test498");
    java.lang.String str2=org.apache.commons.lang.StringUtils.prechomp("aaaaaaaaaaaaaaaaaaaa                                ","aaaaaaaaai!");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "aaaaaaaaaaaaaaaaaaaa                                "+ "'",str2.equals("aaaaaaaaaaaaaaaaaaaa                                "));
  }
  @Test public void test499() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test499#4331");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test499");
    java.lang.String str3=org.apache.commons.lang.StringUtils.replaceChars(" aaaaaaaaa","","                                                                                                                  HI!");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ " aaaaaaaaa"+ "'",str3.equals(" aaaaaaaaa"));
  }
  @Test public void test500() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest2::test500#4339");
    if (debug)     System.out.format("%n%s%n","RegressionTest2.test500");
    java.util.Iterator iterator0=null;
    java.lang.String str2=org.apache.commons.lang.StringUtils.join(iterator0,"... !ih..                                           ");
    org.junit.Assert.assertNull(str2);
  }
}
