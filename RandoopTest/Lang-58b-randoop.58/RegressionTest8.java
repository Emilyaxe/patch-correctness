import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
@FixMethodOrder(MethodSorters.NAME_ASCENDING) public class RegressionTest8 {
  public static boolean debug=false;
  @Test public void test001() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test001#10");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test001");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringBefore("                                                                                               ","##a");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                                                                                               "+ "'",str2.equals("                                                                                               "));
  }
  @Test public void test002() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test002#18");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test002");
    java.lang.String str2=org.apache.commons.lang.StringUtils.getNestedString("","    a     ");
    org.junit.Assert.assertNull(str2);
  }
  @Test public void test003() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test003#26");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test003");
    boolean boolean2=org.apache.commons.lang.StringUtils.containsNone("                                                                                              !iH","    a     ");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test004() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test004#34");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test004");
    int int2=org.apache.commons.lang.math.NumberUtils.stringToInt("Aaaaaaaaa                          ",7);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 7+ "'",int2 == 7);
  }
  @Test public void test005() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test005#42");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test005");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAlpha("AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaai!");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test006() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test006#50");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test006");
    int int2=org.apache.commons.lang.math.NumberUtils.compare(100.0f,(float)96L);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 1+ "'",int2 == 1);
  }
  @Test public void test007() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test007#58");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test007");
    boolean boolean2=org.apache.commons.lang.StringUtils.containsOnly("aaaaaaaaa","                aaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa A                ");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ true+ "'",boolean2 == true);
  }
  @Test public void test008() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test008#66");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test008");
    char[] charArray9=new char[]{'#','4','#','#',' '};
    int int10=org.apache.commons.lang.StringUtils.indexOfAnyBut("Aaaaaaaaa ",charArray9);
    boolean boolean11=org.apache.commons.lang.StringUtils.containsNone("",charArray9);
    boolean boolean12=org.apache.commons.lang.StringUtils.containsOnly("aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa ",charArray9);
    int int13=org.apache.commons.lang.StringUtils.indexOfAny("#################################### aaaaaa",charArray9);
    org.junit.Assert.assertNotNull(charArray9);
    org.junit.Assert.assertTrue("'" + int10 + "' != '"+ 0+ "'",int10 == 0);
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '"+ true+ "'",boolean11 == true);
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '"+ false+ "'",boolean12 == false);
    org.junit.Assert.assertTrue("'" + int13 + "' != '"+ 0+ "'",int13 == 0);
  }
  @Test public void test009() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test009#82");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test009");
    try {
      java.lang.String str2=org.apache.commons.lang.StringUtils.chompLast("444444444444444444444444444444444444444444444          444444444444444444444444444444444444","aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                         HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -43");
    }
 catch (    java.lang.StringIndexOutOfBoundsException e) {
    }
  }
  @Test public void test010() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test010#93");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test010");
    int int2=org.apache.commons.lang.StringUtils.getLevenshteinDistance("          4444444444444444444444","...                                          ..");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 37+ "'",int2 == 37);
  }
  @Test public void test011() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test011#101");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test011");
    java.lang.String str3=org.apache.commons.lang.StringUtils.leftPad("aaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaa",88,"Aaaaaaaaaaaaaaaaaaaa##Aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "aaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaa"+ "'",str3.equals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
  }
  @Test public void test012() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test012#109");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test012");
    java.lang.String str4=org.apache.commons.lang.StringUtils.replace("aaaa","Hi!                                                                                              ","aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!",26);
    org.junit.Assert.assertTrue("'" + str4 + "' != '"+ "aaaa"+ "'",str4.equals("aaaa"));
  }
  @Test public void test013() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test013#117");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test013");
    int[] intArray0=null;
    int[] intArray3=new int[]{100,1};
    int[] intArray10=new int[]{(byte)-1,100,(short)0,100,'#',100};
    boolean boolean11=org.apache.commons.lang.math.NumberUtils.equals(intArray3,intArray10);
    int[] intArray13=new int[]{0};
    int int14=org.apache.commons.lang.math.NumberUtils.max(intArray13);
    int[] intArray18=new int[]{'4',0,(byte)0};
    int[] intArray21=new int[]{100,1};
    int[] intArray28=new int[]{(byte)-1,100,(short)0,100,'#',100};
    boolean boolean29=org.apache.commons.lang.math.NumberUtils.equals(intArray21,intArray28);
    int[] intArray36=new int[]{'4',(short)100,(short)100,52,(byte)1,(short)100};
    boolean boolean37=org.apache.commons.lang.math.NumberUtils.equals(intArray28,intArray36);
    int int38=org.apache.commons.lang.math.NumberUtils.max(intArray36);
    boolean boolean39=org.apache.commons.lang.math.NumberUtils.equals(intArray18,intArray36);
    boolean boolean40=org.apache.commons.lang.math.NumberUtils.equals(intArray13,intArray36);
    boolean boolean41=org.apache.commons.lang.math.NumberUtils.equals(intArray3,intArray36);
    boolean boolean42=org.apache.commons.lang.math.NumberUtils.equals(intArray0,intArray36);
    try {
      int int43=org.apache.commons.lang.math.NumberUtils.min(intArray0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
    }
 catch (    java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNotNull(intArray3);
    org.junit.Assert.assertNotNull(intArray10);
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '"+ false+ "'",boolean11 == false);
    org.junit.Assert.assertNotNull(intArray13);
    org.junit.Assert.assertTrue("'" + int14 + "' != '"+ 0+ "'",int14 == 0);
    org.junit.Assert.assertNotNull(intArray18);
    org.junit.Assert.assertNotNull(intArray21);
    org.junit.Assert.assertNotNull(intArray28);
    org.junit.Assert.assertTrue("'" + boolean29 + "' != '"+ false+ "'",boolean29 == false);
    org.junit.Assert.assertNotNull(intArray36);
    org.junit.Assert.assertTrue("'" + boolean37 + "' != '"+ false+ "'",boolean37 == false);
    org.junit.Assert.assertTrue("'" + int38 + "' != '"+ 100+ "'",int38 == 100);
    org.junit.Assert.assertTrue("'" + boolean39 + "' != '"+ false+ "'",boolean39 == false);
    org.junit.Assert.assertTrue("'" + boolean40 + "' != '"+ false+ "'",boolean40 == false);
    org.junit.Assert.assertTrue("'" + boolean41 + "' != '"+ false+ "'",boolean41 == false);
    org.junit.Assert.assertTrue("'" + boolean42 + "' != '"+ false+ "'",boolean42 == false);
  }
  @Test public void test014() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test014#161");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test014");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringBetween("           !ih            ","Hi!");
    org.junit.Assert.assertNull(str2);
  }
  @Test public void test015() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test015#169");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test015");
    java.lang.String str3=org.apache.commons.lang.StringUtils.mid("A########                          ",(int)(short)10,3);
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "   "+ "'",str3.equals("   "));
  }
  @Test public void test016() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test016#177");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test016");
    float float3=org.apache.commons.lang.math.NumberUtils.max(134.0f,0.0f,(float)21);
    org.junit.Assert.assertTrue("'" + float3 + "' != '"+ 134.0f+ "'",float3 == 134.0f);
  }
  @Test public void test017() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test017#185");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test017");
    boolean boolean1=org.apache.commons.lang.StringUtils.isWhitespace("#######################################################################################");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test018() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test018#193");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test018");
    char[] charArray5=new char[]{' ',' '};
    int int6=org.apache.commons.lang.StringUtils.indexOfAny("                                                hi!                                                 ",charArray5);
    int int7=org.apache.commons.lang.StringUtils.indexOfAnyBut("                                                hi!                                                 ",charArray5);
    boolean boolean8=org.apache.commons.lang.StringUtils.containsOnly("aaaaaaaaaaaaaaaaaaaa##Aaaaaaaaaaaaaaaaaaaaa##Aa",charArray5);
    org.junit.Assert.assertNotNull(charArray5);
    org.junit.Assert.assertTrue("'" + int6 + "' != '"+ 0+ "'",int6 == 0);
    org.junit.Assert.assertTrue("'" + int7 + "' != '"+ 48+ "'",int7 == 48);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '"+ false+ "'",boolean8 == false);
  }
  @Test public void test019() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test019#207");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test019");
    java.lang.String[] strArray3=org.apache.commons.lang.StringUtils.split("H","                               ",(int)(byte)1);
    org.junit.Assert.assertNotNull(strArray3);
  }
  @Test public void test020() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test020#215");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test020");
    java.lang.String str1=org.apache.commons.lang.StringUtils.strip("aaaaaaaaaaaaaaaaaaaa                                ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "aaaaaaaaaaaaaaaaaaaa"+ "'",str1.equals("aaaaaaaaaaaaaaaaaaaa"));
  }
  @Test public void test021() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test021#223");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test021");
    int int1=org.apache.commons.lang.math.NumberUtils.stringToInt("        aa        aa        aa        aA!ih");
    org.junit.Assert.assertTrue("'" + int1 + "' != '"+ 0+ "'",int1 == 0);
  }
  @Test public void test022() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test022#231");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test022");
    try {
      java.lang.Float float1=org.apache.commons.lang.math.NumberUtils.createFloat("aAHI!");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aAHI!\"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test023() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test023#242");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test023");
    boolean boolean2=org.apache.commons.lang.StringUtils.equalsIgnoreCase("a                                                hi!","                   ");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test024() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test024#250");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test024");
    int int1=org.apache.commons.lang.math.NumberUtils.stringToInt("aaaaaaaaaaaaaaaaaaaa##Aaaaaaaa");
    org.junit.Assert.assertTrue("'" + int1 + "' != '"+ 0+ "'",int1 == 0);
  }
  @Test public void test025() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test025#258");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test025");
    int int2=org.apache.commons.lang.StringUtils.indexOfAny("                        aaaaaaaaaaaaaaaaaaaa                                                        ","AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAI!");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test026() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test026#266");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test026");
    java.lang.String str4=org.apache.commons.lang.StringUtils.replace("a                                                hi!"," 4            ","aaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa",156);
    org.junit.Assert.assertTrue("'" + str4 + "' != '"+ "a                                                hi!"+ "'",str4.equals("a                                                hi!"));
  }
  @Test public void test027() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test027#274");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test027");
    java.lang.String str2=org.apache.commons.lang.StringUtils.removeEnd("...                                    !i aaaaaaaaa                                            ","4                                                ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "...                                    !i aaaaaaaaa                                            "+ "'",str2.equals("...                                    !i aaaaaaaaa                                            "));
  }
  @Test public void test028() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test028#282");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test028");
    boolean boolean2=org.apache.commons.lang.StringUtils.contains("","aaaaaaaaaaaaaaaaaaaa##Aaaaaaaaa                                                                  ");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test029() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test029#290");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test029");
    double double1=org.apache.commons.lang.math.NumberUtils.toDouble(".. !ih..                                           ");
    org.junit.Assert.assertTrue("'" + double1 + "' != '"+ 0.0d+ "'",double1 == 0.0d);
  }
  @Test public void test030() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test030#298");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test030");
    int int2=org.apache.commons.lang.StringUtils.indexOf("","aaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test031() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test031#306");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test031");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringAfter("Hi!","#######################################################################################             ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test032() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test032#314");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test032");
    int int2=org.apache.commons.lang.StringUtils.indexOf("4444444444444444444444444444444444444444444444444444444444Hi!###################################A4444444444444444444444444444444444444444444444444444444444","                                           ... !ih");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test033() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test033#322");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test033");
    java.lang.String str3=org.apache.commons.lang.StringUtils.abbreviate("             a               ",7,891);
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "             a               "+ "'",str3.equals("             a               "));
  }
  @Test public void test034() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test034#330");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test034");
    int int2=org.apache.commons.lang.StringUtils.getLevenshteinDistance("... !ih...","AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAIAAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAIAAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAIAAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAIAAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAIAAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAIAAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAIAAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAIAAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAI");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 890+ "'",int2 == 890);
  }
  @Test public void test035() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test035#338");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test035");
    try {
      java.lang.Double double1=org.apache.commons.lang.math.NumberUtils.createDouble("Hi!                                   A");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"Hi!                                   A\"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test036() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test036#349");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test036");
    java.lang.String[] strArray1=org.apache.commons.lang.StringUtils.splitPreserveAllTokens("                               ");
    org.junit.Assert.assertNotNull(strArray1);
  }
  @Test public void test037() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test037#357");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test037");
    java.lang.String str3=org.apache.commons.lang.StringUtils.replace("a                                                HI!                                                 ","Aaaaaaaaa444444444444444444444444444444444444444444444          444444444444444444444444444444444444444444444","##a##a#!ih");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "a                                                HI!                                                 "+ "'",str3.equals("a                                                HI!                                                 "));
  }
  @Test public void test038() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test038#365");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test038");
    boolean boolean2=org.apache.commons.lang.StringUtils.containsIgnoreCase("4444444...","aaaaaaaaaa           4            ");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test039() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test039#373");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test039");
    java.lang.String str1=org.apache.commons.lang.StringUtils.trimToEmpty("                                                4                                                ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "4"+ "'",str1.equals("4"));
  }
  @Test public void test040() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test040#381");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test040");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.splitPreserveAllTokens("                             hi!                                   A                             ",'4');
    org.junit.Assert.assertNotNull(strArray2);
  }
  @Test public void test041() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test041#389");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test041");
    java.lang.String str2=org.apache.commons.lang.StringUtils.strip("                                  ","Aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaa");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test042() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test042#397");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test042");
    try {
      java.lang.String str3=org.apache.commons.lang.StringUtils.abbreviate("",(int)(short)0,3);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
    }
 catch (    java.lang.IllegalArgumentException e) {
    }
  }
  @Test public void test043() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test043#408");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test043");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.splitPreserveAllTokens("        aa",'4');
    org.junit.Assert.assertNotNull(strArray2);
  }
  @Test public void test044() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test044#416");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test044");
    java.lang.String str1=org.apache.commons.lang.StringUtils.trimToEmpty("                             Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!"+ "'",str1.equals("Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!"));
  }
  @Test public void test045() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test045#424");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test045");
    java.lang.String str2=org.apache.commons.lang.StringUtils.removeEnd("                                                ","A###################A########");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                                                "+ "'",str2.equals("                                                "));
  }
  @Test public void test046() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test046#432");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test046");
    java.lang.String str2=org.apache.commons.lang.StringUtils.rightPad("                             Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!",(int)(short)-1);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                             Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!"+ "'",str2.equals("                             Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!"));
  }
  @Test public void test047() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test047#440");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test047");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringBetween("AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444","aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!");
    org.junit.Assert.assertNull(str2);
  }
  @Test public void test048() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test048#448");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test048");
    boolean boolean1=org.apache.commons.lang.StringUtils.isNotEmpty("                                                                                       ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test049() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test049#456");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test049");
    java.lang.String str2=org.apache.commons.lang.StringUtils.prechomp("             A               ","AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaa");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "             A               "+ "'",str2.equals("             A               "));
  }
  @Test public void test050() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test050#464");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test050");
    char[] charArray8=new char[]{'#','4','#','#',' '};
    int int9=org.apache.commons.lang.StringUtils.indexOfAnyBut("Aaaaaaaaa ",charArray8);
    boolean boolean10=org.apache.commons.lang.StringUtils.containsNone("",charArray8);
    boolean boolean11=org.apache.commons.lang.StringUtils.containsNone("aaaaaaaaaaaaaaaaaaaa##Aaaaaaaahi!aaaaaaaaaaaaaaaaaaaa##Aaaaaaaa",charArray8);
    org.junit.Assert.assertNotNull(charArray8);
    org.junit.Assert.assertTrue("'" + int9 + "' != '"+ 0+ "'",int9 == 0);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '"+ true+ "'",boolean10 == true);
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '"+ false+ "'",boolean11 == false);
  }
  @Test public void test051() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test051#478");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test051");
    java.lang.String str2=org.apache.commons.lang.StringUtils.center("#################...",26);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "   #################...   "+ "'",str2.equals("   #################...   "));
  }
  @Test public void test052() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test052#486");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test052");
    java.lang.String[] strArray3=org.apache.commons.lang.StringUtils.split("                                                                                                   ","",27);
    org.junit.Assert.assertNotNull(strArray3);
  }
  @Test public void test053() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test053#494");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test053");
    try {
      java.lang.Double double1=org.apache.commons.lang.math.NumberUtils.createDouble("                     4444444Hi!                     ");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4444444Hi!\"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test054() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test054#505");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test054");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringBetween("                                ","...                    ");
    org.junit.Assert.assertNull(str2);
  }
  @Test public void test055() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test055#513");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test055");
    java.lang.String str2=org.apache.commons.lang.StringUtils.stripStart("A ","   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "A "+ "'",str2.equals("A "));
  }
  @Test public void test056() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test056#521");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test056");
    java.lang.String str2=org.apache.commons.lang.StringUtils.right("Aa hi!",99);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "Aa hi!"+ "'",str2.equals("Aa hi!"));
  }
  @Test public void test057() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test057#529");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test057");
    java.lang.String str3=org.apache.commons.lang.StringUtils.leftPad("#######################################################################################          ",21,'a');
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "#######################################################################################          "+ "'",str3.equals("#######################################################################################          "));
  }
  @Test public void test058() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test058#537");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test058");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.splitByWholeSeparator("Aaaaaaaaa4","h#################...#################...#################...#################...#######");
    java.lang.String str3=org.apache.commons.lang.StringUtils.concatenate((java.lang.Object[])strArray2);
    org.junit.Assert.assertNotNull(strArray2);
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "Aaaaaaaaa4"+ "'",str3.equals("Aaaaaaaaa4"));
  }
  @Test public void test059() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test059#547");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test059");
    long long2=org.apache.commons.lang.math.NumberUtils.toLong("aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa ",99L);
    org.junit.Assert.assertTrue("'" + long2 + "' != '"+ 99L+ "'",long2 == 99L);
  }
  @Test public void test060() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test060#555");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test060");
    java.lang.String str2=org.apache.commons.lang.StringUtils.strip("i","Aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "i"+ "'",str2.equals("i"));
  }
  @Test public void test061() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test061#563");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test061");
    java.lang.String str2=org.apache.commons.lang.StringUtils.getPrechomp("A###################A########","                        AAAAAAAAAAAAAAAAAAAA                                                        ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test062() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test062#571");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test062");
    java.lang.String str1=org.apache.commons.lang.StringUtils.lowerCase("AaaaaaaaaaaaaaaaaaaaAaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa"+ "'",str1.equals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
  }
  @Test public void test063() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test063#579");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test063");
    long long2=org.apache.commons.lang.math.NumberUtils.toLong("A         A         A        ",(long)43);
    org.junit.Assert.assertTrue("'" + long2 + "' != '"+ 43L+ "'",long2 == 43L);
  }
  @Test public void test064() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test064#587");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test064");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substring("            hi!            ",24);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "   "+ "'",str2.equals("   "));
  }
  @Test public void test065() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test065#595");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test065");
    try {
      java.lang.Integer int1=org.apache.commons.lang.math.NumberUtils.createInteger(" AAAAAA...");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \" AAAAAA...\"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test066() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test066#606");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test066");
    int int3=org.apache.commons.lang.StringUtils.indexOf("i","...                    A",0);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test067() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test067#614");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test067");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringBefore("...aaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA","aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa                                                hi!aaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "...aaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA"+ "'",str2.equals("...aaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA"));
  }
  @Test public void test068() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test068#622");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test068");
    java.lang.String str2=org.apache.commons.lang.StringUtils.chomp("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa","4444444hI!AAAAAAAAA");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"+ "'",str2.equals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
  }
  @Test public void test069() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test069#630");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test069");
    char[] charArray1=null;
    int int2=org.apache.commons.lang.StringUtils.indexOfAnyBut("a                                                hi!                                                 ",charArray1);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test070() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test070#639");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test070");
    boolean boolean1=org.apache.commons.lang.StringUtils.isNotBlank("HHHHHHHHHH");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test071() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test071#647");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test071");
    java.lang.String str2=org.apache.commons.lang.StringUtils.center("aaaaaaaaa ",43);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                aaaaaaaaa                  "+ "'",str2.equals("                aaaaaaaaa                  "));
  }
  @Test public void test072() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test072#655");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test072");
    java.lang.String str2=org.apache.commons.lang.StringUtils.right("444444444444444444444444444444444444444444444          444444444444444444444444444444444444",87);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "44444444444444444444444444444444444444444          444444444444444444444444444444444444"+ "'",str2.equals("44444444444444444444444444444444444444444          444444444444444444444444444444444444"));
  }
  @Test public void test073() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test073#663");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test073");
    java.lang.String str3=org.apache.commons.lang.StringUtils.replace("","","");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ ""+ "'",str3.equals(""));
  }
  @Test public void test074() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test074#671");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test074");
    java.lang.String str1=org.apache.commons.lang.StringUtils.strip("...                          ...");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "...                          ..."+ "'",str1.equals("...                          ..."));
  }
  @Test public void test075() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test075#679");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test075");
    java.lang.String[] strArray1=org.apache.commons.lang.StringUtils.splitPreserveAllTokens("hi!");
    try {
      java.lang.String str5=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray1,'a',1,80);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
    }
 catch (    java.lang.ArrayIndexOutOfBoundsException e) {
    }
    org.junit.Assert.assertNotNull(strArray1);
  }
  @Test public void test076() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test076#692");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test076");
    boolean boolean2=org.apache.commons.lang.StringUtils.contains("","A                                                HI!                                                 ");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test077() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test077#700");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test077");
    java.lang.String str1=org.apache.commons.lang.StringUtils.upperCase("Aaaaaaaaaaaaaaaaaaaa##Aaaaaaaahi!aaaaaaaaaaaaaaaaaaaa##Aaaaaaaa");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "AAAAAAAAAAAAAAAAAAAA##AAAAAAAAHI!AAAAAAAAAAAAAAAAAAAA##AAAAAAAA"+ "'",str1.equals("AAAAAAAAAAAAAAAAAAAA##AAAAAAAAHI!AAAAAAAAAAAAAAAAAAAA##AAAAAAAA"));
  }
  @Test public void test078() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test078#708");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test078");
    java.lang.String str3=org.apache.commons.lang.StringUtils.abbreviate("A...",(int)(byte)10,80);
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "A..."+ "'",str3.equals("A..."));
  }
  @Test public void test079() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test079#716");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test079");
    java.lang.String str1=org.apache.commons.lang.StringUtils.reverse("                                                 !IH                                                ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "                                                HI!                                                 "+ "'",str1.equals("                                                HI!                                                 "));
  }
  @Test public void test080() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test080#724");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test080");
    java.lang.String str3=org.apache.commons.lang.StringUtils.replace("4444444444444444444444444444444444                            ...","AAAAAAAAAAAAAAAAAAAA##AAAAAAAAHI!AAAAAAAAAAAAAAAAAAAA##AAAAAAAA","...                                    !i aaaaaaaaa                                            ");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "4444444444444444444444444444444444                            ..."+ "'",str3.equals("4444444444444444444444444444444444                            ..."));
  }
  @Test public void test081() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test081#732");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test081");
    boolean boolean1=org.apache.commons.lang.math.NumberUtils.isDigits("...");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test082() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test082#740");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test082");
    boolean boolean1=org.apache.commons.lang.StringUtils.isNotBlank("                                                                                                            ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test083() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test083#748");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test083");
    java.util.Iterator iterator0=null;
    java.lang.String str2=org.apache.commons.lang.StringUtils.join(iterator0,"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    org.junit.Assert.assertNull(str2);
  }
  @Test public void test084() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test084#757");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test084");
    int int2=org.apache.commons.lang.StringUtils.countMatches("aa  Aaaaaaaaa","...                    A");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 0+ "'",int2 == 0);
  }
  @Test public void test085() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test085#765");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test085");
    float float3=org.apache.commons.lang.math.NumberUtils.min((float)63,(float)4,(float)54);
    org.junit.Assert.assertTrue("'" + float3 + "' != '"+ 4.0f+ "'",float3 == 4.0f);
  }
  @Test public void test086() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test086#773");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test086");
    long long2=org.apache.commons.lang.math.NumberUtils.toLong("                                          aaaaaaaaa ",0L);
    org.junit.Assert.assertTrue("'" + long2 + "' != '"+ 0L+ "'",long2 == 0L);
  }
  @Test public void test087() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test087#781");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test087");
    boolean boolean2=org.apache.commons.lang.StringUtils.containsIgnoreCase("A         A         A         A         A         A         A         A         A         A       I!    ","AAAAAAAAA");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test088() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test088#789");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test088");
    byte[] byteArray3=new byte[]{(byte)100,(byte)0,(byte)100};
    byte[] byteArray6=new byte[]{(byte)-1,(byte)-1};
    boolean boolean7=org.apache.commons.lang.math.NumberUtils.equals(byteArray3,byteArray6);
    byte byte8=org.apache.commons.lang.math.NumberUtils.min(byteArray6);
    byte[] byteArray12=new byte[]{(byte)100,(byte)0,(byte)100};
    byte[] byteArray15=new byte[]{(byte)-1,(byte)-1};
    boolean boolean16=org.apache.commons.lang.math.NumberUtils.equals(byteArray12,byteArray15);
    byte byte17=org.apache.commons.lang.math.NumberUtils.min(byteArray15);
    boolean boolean18=org.apache.commons.lang.math.NumberUtils.equals(byteArray6,byteArray15);
    byte byte19=org.apache.commons.lang.math.NumberUtils.max(byteArray6);
    byte byte20=org.apache.commons.lang.math.NumberUtils.min(byteArray6);
    byte byte21=org.apache.commons.lang.math.NumberUtils.max(byteArray6);
    org.junit.Assert.assertNotNull(byteArray3);
    org.junit.Assert.assertNotNull(byteArray6);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '"+ false+ "'",boolean7 == false);
    org.junit.Assert.assertTrue("'" + byte8 + "' != '"+ (byte)-1+ "'",byte8 == (byte)-1);
    org.junit.Assert.assertNotNull(byteArray12);
    org.junit.Assert.assertNotNull(byteArray15);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '"+ false+ "'",boolean16 == false);
    org.junit.Assert.assertTrue("'" + byte17 + "' != '"+ (byte)-1+ "'",byte17 == (byte)-1);
    org.junit.Assert.assertTrue("'" + boolean18 + "' != '"+ true+ "'",boolean18 == true);
    org.junit.Assert.assertTrue("'" + byte19 + "' != '"+ (byte)-1+ "'",byte19 == (byte)-1);
    org.junit.Assert.assertTrue("'" + byte20 + "' != '"+ (byte)-1+ "'",byte20 == (byte)-1);
    org.junit.Assert.assertTrue("'" + byte21 + "' != '"+ (byte)-1+ "'",byte21 == (byte)-1);
  }
  @Test public void test089() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test089#819");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test089");
    char[] charArray4=new char[]{};
    int int5=org.apache.commons.lang.StringUtils.indexOfAnyBut("",charArray4);
    int int6=org.apache.commons.lang.StringUtils.indexOfAnyBut("",charArray4);
    int int7=org.apache.commons.lang.StringUtils.indexOfAnyBut("                                                                                              !Ih",charArray4);
    int int8=org.apache.commons.lang.StringUtils.indexOfAny("......",charArray4);
    org.junit.Assert.assertNotNull(charArray4);
    org.junit.Assert.assertTrue("'" + int5 + "' != '"+ (-1)+ "'",int5 == (-1));
    org.junit.Assert.assertTrue("'" + int6 + "' != '"+ (-1)+ "'",int6 == (-1));
    org.junit.Assert.assertTrue("'" + int7 + "' != '"+ (-1)+ "'",int7 == (-1));
    org.junit.Assert.assertTrue("'" + int8 + "' != '"+ (-1)+ "'",int8 == (-1));
  }
  @Test public void test090() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test090#835");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test090");
    java.lang.String str2=org.apache.commons.lang.StringUtils.defaultIfEmpty("IaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA","AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "IaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA"+ "'",str2.equals("IaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA"));
  }
  @Test public void test091() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test091#843");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test091");
    java.lang.String str1=org.apache.commons.lang.StringUtils.swapCase("Hi!   #######################################################################################       A");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "hI!   #######################################################################################       a"+ "'",str1.equals("hI!   #######################################################################################       a"));
  }
  @Test public void test092() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test092#851");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test092");
    try {
      java.math.BigInteger bigInteger1=org.apache.commons.lang.math.NumberUtils.createBigInteger("        aaaaaaaaaa                  ");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"        a\"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test093() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test093#862");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test093");
    java.lang.String str2=org.apache.commons.lang.StringUtils.reverseDelimited("                             aaaaaaaaa                                                                  ",'4');
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                             aaaaaaaaa                                                                  "+ "'",str2.equals("                             aaaaaaaaa                                                                  "));
  }
  @Test public void test094() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test094#870");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test094");
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
    long long38=org.apache.commons.lang.math.NumberUtils.max(longArray11);
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
    org.junit.Assert.assertTrue("'" + long38 + "' != '"+ 35L+ "'",long38 == 35L);
  }
  @Test public void test095() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test095#925");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test095");
    java.lang.String str1=org.apache.commons.lang.StringUtils.deleteSpaces("!i aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "!iaaaaaaaaa"+ "'",str1.equals("!iaaaaaaaaa"));
  }
  @Test public void test096() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test096#933");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test096");
    long long3=org.apache.commons.lang.math.NumberUtils.max(3L,(long)(short)100,(long)3);
    org.junit.Assert.assertTrue("'" + long3 + "' != '"+ 100L+ "'",long3 == 100L);
  }
  @Test public void test097() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test097#941");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test097");
    java.lang.String[] strArray4=org.apache.commons.lang.StringUtils.split("Aaaaaaaaa ","                                   ");
    java.lang.String[] strArray6=org.apache.commons.lang.StringUtils.stripAll(strArray4,"#######################################################################################");
    java.lang.String str10=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray6,"#########",10,(int)(short)1);
    int int11=org.apache.commons.lang.StringUtils.indexOfAny("                             hi!                                   A                             ",strArray6);
    int int12=org.apache.commons.lang.StringUtils.lastIndexOfAny("                       AAAAAAAAA",strArray6);
    java.lang.String[] strArray14=org.apache.commons.lang.StringUtils.stripAll(strArray6,"");
    java.lang.String str16=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray6,"");
    org.junit.Assert.assertNotNull(strArray4);
    org.junit.Assert.assertNotNull(strArray6);
    org.junit.Assert.assertTrue("'" + str10 + "' != '"+ ""+ "'",str10.equals(""));
    org.junit.Assert.assertTrue("'" + int11 + "' != '"+ (-1)+ "'",int11 == (-1));
    org.junit.Assert.assertTrue("'" + int12 + "' != '"+ (-1)+ "'",int12 == (-1));
    org.junit.Assert.assertNotNull(strArray14);
    org.junit.Assert.assertTrue("'" + str16 + "' != '"+ "Aaaaaaaaa"+ "'",str16.equals("Aaaaaaaaa"));
  }
  @Test public void test098() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test098#961");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test098");
    java.lang.String str1=org.apache.commons.lang.StringUtils.reverse("a                                                hi!");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "!ih                                                a"+ "'",str1.equals("!ih                                                a"));
  }
  @Test public void test099() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test099#969");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test099");
    double double3=org.apache.commons.lang.math.NumberUtils.min((double)10,0.0d,99.0d);
    org.junit.Assert.assertTrue("'" + double3 + "' != '"+ 0.0d+ "'",double3 == 0.0d);
  }
  @Test public void test100() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test100#977");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test100");
    java.lang.String[] strArray3=org.apache.commons.lang.StringUtils.split("#############################################################################          ","Aaaaaaaaa ",(int)'4');
    try {
      java.lang.String str7=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray3,"",(-1),41);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
    }
 catch (    java.lang.ArrayIndexOutOfBoundsException e) {
    }
    org.junit.Assert.assertNotNull(strArray3);
  }
  @Test public void test101() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test101#990");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test101");
    boolean boolean1=org.apache.commons.lang.StringUtils.isWhitespace("aAAAAAAAA                                       HI!");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test102() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test102#998");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test102");
    java.lang.String str3=org.apache.commons.lang.StringUtils.getNestedString("aaaaaaaaaaaaaaaaaaaaaaaaaaaaa","aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!","###                     aaaaaaaaa");
    org.junit.Assert.assertNull(str3);
  }
  @Test public void test103() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test103#1006");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test103");
    java.lang.String str2=org.apache.commons.lang.StringUtils.leftPad("                                                                                                   ",87);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                                                                                                   "+ "'",str2.equals("                                                                                                   "));
  }
  @Test public void test104() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test104#1014");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test104");
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
    double[] doubleArray37=new double[]{24};
    double double38=org.apache.commons.lang.math.NumberUtils.min(doubleArray37);
    double double39=org.apache.commons.lang.math.NumberUtils.min(doubleArray37);
    boolean boolean40=org.apache.commons.lang.math.NumberUtils.equals(doubleArray22,doubleArray37);
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
    org.junit.Assert.assertNotNull(doubleArray37);
    org.junit.Assert.assertTrue("'" + double38 + "' != '"+ 24.0d+ "'",double38 == 24.0d);
    org.junit.Assert.assertTrue("'" + double39 + "' != '"+ 24.0d+ "'",double39 == 24.0d);
    org.junit.Assert.assertTrue("'" + boolean40 + "' != '"+ false+ "'",boolean40 == false);
  }
  @Test public void test105() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test105#1068");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test105");
    boolean boolean2=org.apache.commons.lang.StringUtils.equalsIgnoreCase("Aaaaaaaaaaaaaaaaaaaa##Aaaaaaaaa","4444444...");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test106() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test106#1076");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test106");
    java.lang.String str3=org.apache.commons.lang.StringUtils.replaceChars("aAHI!",'a','4');
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "4AHI!"+ "'",str3.equals("4AHI!"));
  }
  @Test public void test107() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test107#1084");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test107");
    java.lang.String str3=org.apache.commons.lang.StringUtils.leftPad("#############################aaaaaaaaaaaaaaaaaaaa##Aaaaaaaa#############################################################aaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaa",34,'4');
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "#############################aaaaaaaaaaaaaaaaaaaa##Aaaaaaaa#############################################################aaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaa"+ "'",str3.equals("#############################aaaaaaaaaaaaaaaaaaaa##Aaaaaaaa#############################################################aaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaa"));
  }
  @Test public void test108() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test108#1092");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test108");
    java.lang.String[] strArray1=org.apache.commons.lang.StringUtils.split("Hi!###################################A");
    org.junit.Assert.assertNotNull(strArray1);
  }
  @Test public void test109() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test109#1100");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test109");
    try {
      java.lang.Long long1=org.apache.commons.lang.math.NumberUtils.createLong("########################AAAAAAAAAAAAAAAAAAAA########################################################i!");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"########################AAAAAAAAAAAAAAAAAAAA########################################################i!\"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test110() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test110#1111");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test110");
    int int2=org.apache.commons.lang.math.NumberUtils.compare((double)(-1L),0.0d);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test111() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test111#1119");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test111");
    java.lang.String str3=org.apache.commons.lang.StringUtils.abbreviate("A                                                HI!                                                 ",65,(int)'a');
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "...                                          HI!                                                 "+ "'",str3.equals("...                                          HI!                                                 "));
  }
  @Test public void test112() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test112#1127");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test112");
    double[] doubleArray0=null;
    double[] doubleArray5=new double[]{(-1.0f),'#',1.0f,35L};
    double[] doubleArray6=new double[]{};
    boolean boolean7=org.apache.commons.lang.math.NumberUtils.equals(doubleArray5,doubleArray6);
    double[] doubleArray8=new double[]{};
    double[] doubleArray13=new double[]{(-1.0f),'#',1.0f,35L};
    double[] doubleArray14=new double[]{};
    boolean boolean15=org.apache.commons.lang.math.NumberUtils.equals(doubleArray13,doubleArray14);
    boolean boolean16=org.apache.commons.lang.math.NumberUtils.equals(doubleArray8,doubleArray14);
    boolean boolean17=org.apache.commons.lang.math.NumberUtils.equals(doubleArray5,doubleArray8);
    double double18=org.apache.commons.lang.math.NumberUtils.max(doubleArray5);
    double[] doubleArray23=new double[]{(-1.0f),'#',1.0f,35L};
    double[] doubleArray24=new double[]{};
    boolean boolean25=org.apache.commons.lang.math.NumberUtils.equals(doubleArray23,doubleArray24);
    double[] doubleArray26=new double[]{};
    double[] doubleArray31=new double[]{(-1.0f),'#',1.0f,35L};
    double[] doubleArray32=new double[]{};
    boolean boolean33=org.apache.commons.lang.math.NumberUtils.equals(doubleArray31,doubleArray32);
    boolean boolean34=org.apache.commons.lang.math.NumberUtils.equals(doubleArray26,doubleArray32);
    boolean boolean35=org.apache.commons.lang.math.NumberUtils.equals(doubleArray23,doubleArray26);
    boolean boolean36=org.apache.commons.lang.math.NumberUtils.equals(doubleArray5,doubleArray23);
    boolean boolean37=org.apache.commons.lang.math.NumberUtils.equals(doubleArray0,doubleArray23);
    try {
      double double38=org.apache.commons.lang.math.NumberUtils.max(doubleArray0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
    }
 catch (    java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '"+ false+ "'",boolean7 == false);
    org.junit.Assert.assertNotNull(doubleArray8);
    org.junit.Assert.assertNotNull(doubleArray13);
    org.junit.Assert.assertNotNull(doubleArray14);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '"+ false+ "'",boolean15 == false);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '"+ true+ "'",boolean16 == true);
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '"+ false+ "'",boolean17 == false);
    org.junit.Assert.assertTrue("'" + double18 + "' != '"+ 35.0d+ "'",double18 == 35.0d);
    org.junit.Assert.assertNotNull(doubleArray23);
    org.junit.Assert.assertNotNull(doubleArray24);
    org.junit.Assert.assertTrue("'" + boolean25 + "' != '"+ false+ "'",boolean25 == false);
    org.junit.Assert.assertNotNull(doubleArray26);
    org.junit.Assert.assertNotNull(doubleArray31);
    org.junit.Assert.assertNotNull(doubleArray32);
    org.junit.Assert.assertTrue("'" + boolean33 + "' != '"+ false+ "'",boolean33 == false);
    org.junit.Assert.assertTrue("'" + boolean34 + "' != '"+ true+ "'",boolean34 == true);
    org.junit.Assert.assertTrue("'" + boolean35 + "' != '"+ false+ "'",boolean35 == false);
    org.junit.Assert.assertTrue("'" + boolean36 + "' != '"+ true+ "'",boolean36 == true);
    org.junit.Assert.assertTrue("'" + boolean37 + "' != '"+ false+ "'",boolean37 == false);
  }
  @Test public void test113() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test113#1181");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test113");
    char[] charArray7=new char[]{' ',' '};
    int int8=org.apache.commons.lang.StringUtils.indexOfAny("                                                hi!                                                 ",charArray7);
    boolean boolean9=org.apache.commons.lang.StringUtils.containsNone("aaaaaaaaa ",charArray7);
    int int10=org.apache.commons.lang.StringUtils.indexOfAnyBut("##A",charArray7);
    boolean boolean11=org.apache.commons.lang.StringUtils.containsNone("                                                                                              !iH",charArray7);
    boolean boolean12=org.apache.commons.lang.StringUtils.containsOnly("",charArray7);
    org.junit.Assert.assertNotNull(charArray7);
    org.junit.Assert.assertTrue("'" + int8 + "' != '"+ 0+ "'",int8 == 0);
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '"+ false+ "'",boolean9 == false);
    org.junit.Assert.assertTrue("'" + int10 + "' != '"+ 0+ "'",int10 == 0);
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '"+ false+ "'",boolean11 == false);
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '"+ true+ "'",boolean12 == true);
  }
  @Test public void test114() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test114#1199");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test114");
    java.lang.String str2=org.apache.commons.lang.StringUtils.difference("","                                                                                                   ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                                                                                                   "+ "'",str2.equals("                                                                                                   "));
  }
  @Test public void test115() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test115#1207");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test115");
    java.util.Collection collection0=null;
    java.lang.String str2=org.apache.commons.lang.StringUtils.join(collection0,"Aaaaaaaaaaaaaaaaaaaa##Aaaaaaaaa");
    org.junit.Assert.assertNull(str2);
  }
  @Test public void test116() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test116#1216");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test116");
    java.lang.String str1=org.apache.commons.lang.StringUtils.deleteSpaces("   A ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "A"+ "'",str1.equals("A"));
  }
  @Test public void test117() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test117#1224");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test117");
    java.lang.String str1=org.apache.commons.lang.StringUtils.reverse("...aaaa");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "aaaa..."+ "'",str1.equals("aaaa..."));
  }
  @Test public void test118() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test118#1232");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test118");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAlpha("                                                    ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test119() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test119#1240");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test119");
    java.lang.String str2=org.apache.commons.lang.StringUtils.leftPad("Hi!   #######################################################################################             ######       A",9);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "Hi!   #######################################################################################             ######       A"+ "'",str2.equals("Hi!   #######################################################################################             ######       A"));
  }
  @Test public void test120() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test120#1248");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test120");
    int[] intArray2=new int[]{100,1};
    int[] intArray9=new int[]{(byte)-1,100,(short)0,100,'#',100};
    boolean boolean10=org.apache.commons.lang.math.NumberUtils.equals(intArray2,intArray9);
    int[] intArray17=new int[]{'4',(short)100,(short)100,52,(byte)1,(short)100};
    boolean boolean18=org.apache.commons.lang.math.NumberUtils.equals(intArray9,intArray17);
    int[] intArray21=new int[]{100,1};
    int[] intArray28=new int[]{(byte)-1,100,(short)0,100,'#',100};
    boolean boolean29=org.apache.commons.lang.math.NumberUtils.equals(intArray21,intArray28);
    boolean boolean30=org.apache.commons.lang.math.NumberUtils.equals(intArray9,intArray28);
    int[] intArray33=new int[]{100,1};
    int[] intArray40=new int[]{(byte)-1,100,(short)0,100,'#',100};
    boolean boolean41=org.apache.commons.lang.math.NumberUtils.equals(intArray33,intArray40);
    int int42=org.apache.commons.lang.math.NumberUtils.max(intArray40);
    int int43=org.apache.commons.lang.math.NumberUtils.max(intArray40);
    boolean boolean44=org.apache.commons.lang.math.NumberUtils.equals(intArray28,intArray40);
    int int45=org.apache.commons.lang.math.NumberUtils.max(intArray40);
    org.junit.Assert.assertNotNull(intArray2);
    org.junit.Assert.assertNotNull(intArray9);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '"+ false+ "'",boolean10 == false);
    org.junit.Assert.assertNotNull(intArray17);
    org.junit.Assert.assertTrue("'" + boolean18 + "' != '"+ false+ "'",boolean18 == false);
    org.junit.Assert.assertNotNull(intArray21);
    org.junit.Assert.assertNotNull(intArray28);
    org.junit.Assert.assertTrue("'" + boolean29 + "' != '"+ false+ "'",boolean29 == false);
    org.junit.Assert.assertTrue("'" + boolean30 + "' != '"+ true+ "'",boolean30 == true);
    org.junit.Assert.assertNotNull(intArray33);
    org.junit.Assert.assertNotNull(intArray40);
    org.junit.Assert.assertTrue("'" + boolean41 + "' != '"+ false+ "'",boolean41 == false);
    org.junit.Assert.assertTrue("'" + int42 + "' != '"+ 100+ "'",int42 == 100);
    org.junit.Assert.assertTrue("'" + int43 + "' != '"+ 100+ "'",int43 == 100);
    org.junit.Assert.assertTrue("'" + boolean44 + "' != '"+ true+ "'",boolean44 == true);
    org.junit.Assert.assertTrue("'" + int45 + "' != '"+ 100+ "'",int45 == 100);
  }
  @Test public void test121() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test121#1286");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test121");
    java.lang.String str1=org.apache.commons.lang.StringUtils.trimToNull("##Aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "##Aaaaaaaaa"+ "'",str1.equals("##Aaaaaaaaa"));
  }
  @Test public void test122() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test122#1294");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test122");
    java.lang.String str3=org.apache.commons.lang.StringUtils.center("",2,"44444444444444444444444         AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaa");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "44"+ "'",str3.equals("44"));
  }
  @Test public void test123() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test123#1302");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test123");
    java.lang.String[] strArray1=org.apache.commons.lang.StringUtils.splitPreserveAllTokens("                         HI!");
    org.junit.Assert.assertNotNull(strArray1);
  }
  @Test public void test124() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test124#1310");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test124");
    boolean boolean1=org.apache.commons.lang.math.NumberUtils.isNumber("!i aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test125() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test125#1318");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test125");
    int int3=org.apache.commons.lang.StringUtils.lastIndexOf("                                                                                                   ","                 ",108);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ 82+ "'",int3 == 82);
  }
  @Test public void test126() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test126#1326");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test126");
    long long3=org.apache.commons.lang.math.NumberUtils.max((long)(byte)1,0L,(long)35);
    org.junit.Assert.assertTrue("'" + long3 + "' != '"+ 35L+ "'",long3 == 35L);
  }
  @Test public void test127() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test127#1334");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test127");
    java.lang.String str1=org.apache.commons.lang.StringUtils.escape("AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa"+ "'",str1.equals("AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa"));
  }
  @Test public void test128() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test128#1342");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test128");
    double double3=org.apache.commons.lang.math.NumberUtils.min(99.0d,(double)32L,(double)36.0f);
    org.junit.Assert.assertTrue("'" + double3 + "' != '"+ 32.0d+ "'",double3 == 32.0d);
  }
  @Test public void test129() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test129#1350");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test129");
    java.lang.String str1=org.apache.commons.lang.StringUtils.capitalise("");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ ""+ "'",str1.equals(""));
  }
  @Test public void test130() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test130#1358");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test130");
    long long2=org.apache.commons.lang.math.NumberUtils.toLong("AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaai",(long)24);
    org.junit.Assert.assertTrue("'" + long2 + "' != '"+ 24L+ "'",long2 == 24L);
  }
  @Test public void test131() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test131#1366");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test131");
    java.lang.String str2=org.apache.commons.lang.StringUtils.chomp("!iaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA","aaaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "!iaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA"+ "'",str2.equals("!iaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA"));
  }
  @Test public void test132() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test132#1374");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test132");
    int int2=org.apache.commons.lang.StringUtils.indexOfDifference("aaaaaaaaa                                    ","...                    ");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 0+ "'",int2 == 0);
  }
  @Test public void test133() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test133#1382");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test133");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.splitPreserveAllTokens("aa ",' ');
    org.junit.Assert.assertNotNull(strArray2);
  }
  @Test public void test134() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test134#1390");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test134");
    boolean boolean1=org.apache.commons.lang.StringUtils.isNumericSpace("###                     aaaaaaaaai!   ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test135() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test135#1398");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test135");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringBefore("AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa","hi!                                   A");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa"+ "'",str2.equals("AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa"));
  }
  @Test public void test136() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test136#1406");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test136");
    java.lang.String str1=org.apache.commons.lang.StringUtils.chopNewline("AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaai");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaai"+ "'",str1.equals("AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaai"));
  }
  @Test public void test137() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test137#1414");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test137");
    java.lang.String str2=org.apache.commons.lang.StringUtils.getChomp("########################AAAAAAAAAAAAAAAAAAAA########################################################i!","!ih                                                a");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test138() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test138#1422");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test138");
    long long1=org.apache.commons.lang.math.NumberUtils.toLong("aaaaaaaaai!");
    org.junit.Assert.assertTrue("'" + long1 + "' != '"+ 0L+ "'",long1 == 0L);
  }
  @Test public void test139() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test139#1430");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test139");
    boolean boolean2=org.apache.commons.lang.StringUtils.containsNone("aAHI!","iaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaA");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test140() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test140#1438");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test140");
    int int3=org.apache.commons.lang.StringUtils.ordinalIndexOf("aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaa","",(int)(byte)-1);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test141() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test141#1446");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test141");
    float float3=org.apache.commons.lang.math.NumberUtils.min((float)41,(float)(byte)1,(float)31);
    org.junit.Assert.assertTrue("'" + float3 + "' != '"+ 1.0f+ "'",float3 == 1.0f);
  }
  @Test public void test142() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test142#1454");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test142");
    java.lang.String str2=org.apache.commons.lang.StringUtils.right("           4            ",(int)(byte)1);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ " "+ "'",str2.equals(" "));
  }
  @Test public void test143() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test143#1462");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test143");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringBeforeLast("Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!    ","             A               ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!    "+ "'",str2.equals("Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!    "));
  }
  @Test public void test144() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test144#1470");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test144");
    int int2=org.apache.commons.lang.math.NumberUtils.toInt("A         A         A         A         A         A         A         A         A         A",134);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 134+ "'",int2 == 134);
  }
  @Test public void test145() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test145#1478");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test145");
    try {
      java.math.BigDecimal bigDecimal1=org.apache.commons.lang.math.NumberUtils.createBigDecimal("aaaaaaaaaa");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test146() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test146#1489");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test146");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.split("hi!",'a');
    org.junit.Assert.assertNotNull(strArray2);
  }
  @Test public void test147() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test147#1497");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test147");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substring("             ",90);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test148() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test148#1505");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test148");
    boolean boolean1=org.apache.commons.lang.StringUtils.isEmpty("A...");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test149() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test149#1513");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test149");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.splitByWholeSeparator("                                                4                                                ","aaaaaa");
    org.junit.Assert.assertNotNull(strArray2);
  }
  @Test public void test150() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test150#1521");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test150");
    boolean boolean2=org.apache.commons.lang.StringUtils.containsNone("                aaaaaaaaa                  ","");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ true+ "'",boolean2 == true);
  }
  @Test public void test151() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test151#1529");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test151");
    java.lang.String str3=org.apache.commons.lang.StringUtils.replace("    !I       A         A         A         A         A         A         A         A         A         A","aA HI!","4                                                ");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "    !I       A         A         A         A         A         A         A         A         A         A"+ "'",str3.equals("    !I       A         A         A         A         A         A         A         A         A         A"));
  }
  @Test public void test152() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test152#1537");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test152");
    java.lang.String str1=org.apache.commons.lang.StringUtils.defaultString("###                     aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "###                     aaaaaaaaa"+ "'",str1.equals("###                     aaaaaaaaa"));
  }
  @Test public void test153() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test153#1545");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test153");
    int int2=org.apache.commons.lang.StringUtils.indexOf("          ",'4');
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test154() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test154#1553");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test154");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substring("444444444444444444444444444444444444444444444          444444444444444444444444444444444444",32);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "4444444444444          444444444444444444444444444444444444"+ "'",str2.equals("4444444444444          444444444444444444444444444444444444"));
  }
  @Test public void test155() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test155#1561");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test155");
    try {
      java.math.BigDecimal bigDecimal1=org.apache.commons.lang.math.NumberUtils.createBigDecimal("A                                                HI!");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test156() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test156#1572");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test156");
    short short3=org.apache.commons.lang.math.NumberUtils.max((short)(byte)100,(short)(byte)0,(short)(byte)100);
    org.junit.Assert.assertTrue("'" + short3 + "' != '"+ (short)100+ "'",short3 == (short)100);
  }
  @Test public void test157() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test157#1580");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test157");
    boolean boolean2=org.apache.commons.lang.StringUtils.containsOnly("         ","aaaaaaai!");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test158() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test158#1588");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test158");
    int int2=org.apache.commons.lang.math.NumberUtils.stringToInt("###                                                                                       aaaaaaaaa         ",(int)(byte)10);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 10+ "'",int2 == 10);
  }
  @Test public void test159() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test159#1596");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test159");
    boolean boolean2=org.apache.commons.lang.StringUtils.containsIgnoreCase("aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa","                aaaaaaaaa                  ");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test160() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test160#1604");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test160");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAlphanumericSpace("a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test161() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test161#1612");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test161");
    long long2=org.apache.commons.lang.math.NumberUtils.toLong("aaaaaaai!",(long)100);
    org.junit.Assert.assertTrue("'" + long2 + "' != '"+ 100L+ "'",long2 == 100L);
  }
  @Test public void test162() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test162#1620");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test162");
    java.lang.String str1=org.apache.commons.lang.StringUtils.trim("        aaaaaaaaaa                  ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "aaaaaaaaaa"+ "'",str1.equals("aaaaaaaaaa"));
  }
  @Test public void test163() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test163#1628");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test163");
    try {
      java.lang.Long long1=org.apache.commons.lang.math.NumberUtils.createLong("AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa\"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test164() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test164#1639");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test164");
    try {
      java.lang.Float float1=org.apache.commons.lang.math.NumberUtils.createFloat("aaaaaaaaa i!            ");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaaaaaaa i!\"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test165() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test165#1650");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test165");
    java.lang.String str2=org.apache.commons.lang.StringUtils.reverseDelimitedString("aaaaaaaaa                                       hi!","hi!A");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "aaaaaaaaa                                       "+ "'",str2.equals("aaaaaaaaa                                       "));
  }
  @Test public void test166() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test166#1658");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test166");
    try {
      java.lang.Number number1=org.apache.commons.lang.math.NumberUtils.createNumber("aa");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: aa is not a valid number.");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test167() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test167#1669");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test167");
    try {
      java.lang.String str4=org.apache.commons.lang.StringUtils.overlayString("                                                                                              !Ih","aaaaaaaaaa",(int)(byte)100,94);
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
    }
 catch (    java.lang.StringIndexOutOfBoundsException e) {
    }
  }
  @Test public void test168() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test168#1680");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test168");
    java.lang.String str2=org.apache.commons.lang.StringUtils.removeEnd("AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaa","aAHI!");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaa"+ "'",str2.equals("AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaa"));
  }
  @Test public void test169() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test169#1688");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test169");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringBeforeLast("                             hi!                                   A                             ","AAAAAAAAAAAAAAAAAAAA   AAAAAAAA                                       HI!");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                             hi!                                   A                             "+ "'",str2.equals("                             hi!                                   A                             "));
  }
  @Test public void test170() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test170#1696");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test170");
    java.lang.String str1=org.apache.commons.lang.StringUtils.swapCase("... !ih...                      AaaaaaaaaAaaaaaaaaAaaaaaaaaAa... !ih...                       ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "... !IH...                      aAAAAAAAAaAAAAAAAAaAAAAAAAAaA... !IH...                       "+ "'",str1.equals("... !IH...                      aAAAAAAAAaAAAAAAAAaAAAAAAAAaA... !IH...                       "));
  }
  @Test public void test171() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test171#1704");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test171");
    int int3=org.apache.commons.lang.StringUtils.indexOf("##A##A#!ih",'#',(int)(byte)10);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test172() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test172#1712");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test172");
    byte byte3=org.apache.commons.lang.math.NumberUtils.min((byte)-1,(byte)100,(byte)1);
    org.junit.Assert.assertTrue("'" + byte3 + "' != '"+ (byte)-1+ "'",byte3 == (byte)-1);
  }
  @Test public void test173() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test173#1720");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test173");
    int int2=org.apache.commons.lang.StringUtils.countMatches(" a                                                                                       ","4444444Hi!aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 0+ "'",int2 == 0);
  }
  @Test public void test174() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test174#1728");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test174");
    java.lang.String str2=org.apache.commons.lang.StringUtils.prechomp("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa","");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"+ "'",str2.equals("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
  }
  @Test public void test175() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test175#1736");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test175");
    java.lang.String str2=org.apache.commons.lang.StringUtils.getNestedString(" ","           ... !ih...           ");
    org.junit.Assert.assertNull(str2);
  }
  @Test public void test176() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test176#1744");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test176");
    java.lang.String str2=org.apache.commons.lang.StringUtils.chomp("                        AAAAAAAAAAAAAAAAAAAA                                                        i!","##a");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                        AAAAAAAAAAAAAAAAAAAA                                                        i!"+ "'",str2.equals("                        AAAAAAAAAAAAAAAAAAAA                                                        i!"));
  }
  @Test public void test177() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test177#1752");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test177");
    int int3=org.apache.commons.lang.StringUtils.ordinalIndexOf(" ","...                    A",0);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test178() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test178#1760");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test178");
    boolean boolean2=org.apache.commons.lang.StringUtils.containsNone("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!","aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test179() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test179#1768");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test179");
    int int2=org.apache.commons.lang.math.NumberUtils.compare((double)97L,(double)(byte)0);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 1+ "'",int2 == 1);
  }
  @Test public void test180() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test180#1776");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test180");
    int int1=org.apache.commons.lang.math.NumberUtils.toInt("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                         HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    org.junit.Assert.assertTrue("'" + int1 + "' != '"+ 0+ "'",int1 == 0);
  }
  @Test public void test181() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test181#1784");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test181");
    int int2=org.apache.commons.lang.math.NumberUtils.compare((double)43,(double)3L);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 1+ "'",int2 == 1);
  }
  @Test public void test182() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test182#1792");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test182");
    java.lang.String str2=org.apache.commons.lang.StringUtils.remove("aa ","            hi!            ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "aa "+ "'",str2.equals("aa "));
  }
  @Test public void test183() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test183#1800");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test183");
    java.lang.String str3=org.apache.commons.lang.StringUtils.leftPad("aaaaaaaaaa",90,"");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "                                                                                aaaaaaaaaa"+ "'",str3.equals("                                                                                aaaaaaaaaa"));
  }
  @Test public void test184() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test184#1808");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test184");
    java.lang.String str1=org.apache.commons.lang.StringUtils.stripToEmpty("AAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAA a");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "AAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAA a"+ "'",str1.equals("AAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAA a"));
  }
  @Test public void test185() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test185#1816");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test185");
    java.lang.String str1=org.apache.commons.lang.StringUtils.clean("                                                              ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ ""+ "'",str1.equals(""));
  }
  @Test public void test186() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test186#1824");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test186");
    java.lang.String str2=org.apache.commons.lang.StringUtils.remove("                                        ",'#');
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                                        "+ "'",str2.equals("                                        "));
  }
  @Test public void test187() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test187#1832");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test187");
    int int2=org.apache.commons.lang.StringUtils.indexOf("   aaaaaaaaa                                        ",'#');
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test188() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test188#1840");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test188");
    java.lang.String str2=org.apache.commons.lang.StringUtils.defaultIfEmpty("Aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaa","");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "Aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaa"+ "'",str2.equals("Aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaa"));
  }
  @Test public void test189() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test189#1848");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test189");
    java.lang.String str1=org.apache.commons.lang.StringUtils.deleteWhitespace("             a               ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "a"+ "'",str1.equals("a"));
  }
  @Test public void test190() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test190#1856");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test190");
    double double3=org.apache.commons.lang.math.NumberUtils.min((double)24,(double)(byte)0,(double)96);
    org.junit.Assert.assertTrue("'" + double3 + "' != '"+ 0.0d+ "'",double3 == 0.0d);
  }
  @Test public void test191() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test191#1864");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test191");
    long long2=org.apache.commons.lang.math.NumberUtils.toLong("                                            aaaaaaaaa i!                                            ",(long)29);
    org.junit.Assert.assertTrue("'" + long2 + "' != '"+ 29L+ "'",long2 == 29L);
  }
  @Test public void test192() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test192#1872");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test192");
    boolean boolean2=org.apache.commons.lang.StringUtils.contains("......","");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ true+ "'",boolean2 == true);
  }
  @Test public void test193() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test193#1880");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test193");
    float float1=org.apache.commons.lang.math.NumberUtils.toFloat("#############################aaaaaaaaaaaaaaaaaaaa##Aaaaaaaa#############################################################aaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaa");
    org.junit.Assert.assertTrue("'" + float1 + "' != '"+ 0.0f+ "'",float1 == 0.0f);
  }
  @Test public void test194() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test194#1888");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test194");
    java.lang.String str2=org.apache.commons.lang.StringUtils.removeStart("AaaaaaaaaAaaaaaaaaAaaaaaaaaAa","...aaaa");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "AaaaaaaaaAaaaaaaaaAaaaaaaaaAa"+ "'",str2.equals("AaaaaaaaaAaaaaaaaaAaaaaaaaaAa"));
  }
  @Test public void test195() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test195#1896");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test195");
    boolean boolean2=org.apache.commons.lang.StringUtils.equalsIgnoreCase("","   #######################################################################################");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test196() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test196#1904");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test196");
    java.lang.String str2=org.apache.commons.lang.StringUtils.stripEnd("#########","H");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "#########"+ "'",str2.equals("#########"));
  }
  @Test public void test197() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test197#1912");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test197");
    java.lang.String str3=org.apache.commons.lang.StringUtils.leftPad("!ih aA44444444444444444444444         AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaa",37,'a');
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "!ih aA44444444444444444444444         AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaa"+ "'",str3.equals("!ih aA44444444444444444444444         AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaa"));
  }
  @Test public void test198() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test198#1920");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test198");
    java.lang.String str2=org.apache.commons.lang.StringUtils.repeat("  ",1);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "  "+ "'",str2.equals("  "));
  }
  @Test public void test199() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test199#1928");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test199");
    java.lang.String str2=org.apache.commons.lang.StringUtils.remove("#aaaaaaaaa",'4');
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "#aaaaaaaaa"+ "'",str2.equals("#aaaaaaaaa"));
  }
  @Test public void test200() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test200#1936");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test200");
    boolean boolean2=org.apache.commons.lang.StringUtils.equals("#########","             A               ");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test201() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test201#1944");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test201");
    java.lang.String str1=org.apache.commons.lang.StringUtils.escape("                                                                                               ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "                                                                                               "+ "'",str1.equals("                                                                                               "));
  }
  @Test public void test202() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test202#1952");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test202");
    java.lang.String str1=org.apache.commons.lang.StringUtils.deleteWhitespace("aa  Aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "aaAaaaaaaaa"+ "'",str1.equals("aaAaaaaaaaa"));
  }
  @Test public void test203() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test203#1960");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test203");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substring("...                    ",155);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test204() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test204#1968");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test204");
    char[] charArray11=new char[]{'#','4','#','#',' '};
    int int12=org.apache.commons.lang.StringUtils.indexOfAnyBut("Aaaaaaaaa ",charArray11);
    boolean boolean13=org.apache.commons.lang.StringUtils.containsNone("",charArray11);
    boolean boolean14=org.apache.commons.lang.StringUtils.containsOnly("aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa ",charArray11);
    boolean boolean15=org.apache.commons.lang.StringUtils.containsOnly("...                    A",charArray11);
    boolean boolean16=org.apache.commons.lang.StringUtils.containsOnly("   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",charArray11);
    boolean boolean17=org.apache.commons.lang.StringUtils.containsOnly("",charArray11);
    org.junit.Assert.assertNotNull(charArray11);
    org.junit.Assert.assertTrue("'" + int12 + "' != '"+ 0+ "'",int12 == 0);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '"+ true+ "'",boolean13 == true);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '"+ false+ "'",boolean14 == false);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '"+ false+ "'",boolean15 == false);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '"+ false+ "'",boolean16 == false);
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '"+ true+ "'",boolean17 == true);
  }
  @Test public void test205() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test205#1988");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test205");
    java.lang.String str3=org.apache.commons.lang.StringUtils.leftPad("!i aaaaaaaaa                                          ",(int)' ',"");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "!i aaaaaaaaa                                          "+ "'",str3.equals("!i aaaaaaaaa                                          "));
  }
  @Test public void test206() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test206#1996");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test206");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringAfter("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa","");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"+ "'",str2.equals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
  }
  @Test public void test207() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test207#2004");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test207");
    int int2=org.apache.commons.lang.math.NumberUtils.toInt("   #############################aaaaaaaaaaaaaaaaaaaa##Aaaaaaaa#############################################################aaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa",51);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 51+ "'",int2 == 51);
  }
  @Test public void test208() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test208#2012");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test208");
    try {
      java.lang.String str4=org.apache.commons.lang.StringUtils.overlayString("","Aaaaaaaaa4",29,65);
      org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
    }
 catch (    java.lang.NegativeArraySizeException e) {
    }
  }
  @Test public void test209() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test209#2023");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test209");
    double double3=org.apache.commons.lang.math.NumberUtils.min((double)10.0f,(double)0.0f,(double)108);
    org.junit.Assert.assertTrue("'" + double3 + "' != '"+ 0.0d+ "'",double3 == 0.0d);
  }
  @Test public void test210() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test210#2031");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test210");
    java.lang.String str3=org.apache.commons.lang.StringUtils.getNestedString("aAHI!","IaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA","...aaaa...");
    org.junit.Assert.assertNull(str3);
  }
  @Test public void test211() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test211#2039");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test211");
    java.lang.String str2=org.apache.commons.lang.StringUtils.defaultIfEmpty("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa","4444444Hi!aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"+ "'",str2.equals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
  }
  @Test public void test212() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test212#2047");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test212");
    java.lang.String str2=org.apache.commons.lang.StringUtils.stripStart("                        AAAAAAAAAAAAAAAAAAAA                                                        i!","                                               hi!                                              ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "AAAAAAAAAAAAAAAAAAAA                                                        i!"+ "'",str2.equals("AAAAAAAAAAAAAAAAAAAA                                                        i!"));
  }
  @Test public void test213() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test213#2055");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test213");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAsciiPrintable("aaaaaaaaAaaaaaaaaaaaaaaaa");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test214() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test214#2063");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test214");
    java.lang.String str3=org.apache.commons.lang.StringUtils.replaceChars("","                         HI!","                             Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaa");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ ""+ "'",str3.equals(""));
  }
  @Test public void test215() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test215#2071");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test215");
    java.lang.String str3=org.apache.commons.lang.StringUtils.center("#############################aaaaaaaaaaaaaaaaaaaa##Aaaaaaaa#############################################################aaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaa",54,"aaaaaaaaaa                        ");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "#############################aaaaaaaaaaaaaaaaaaaa##Aaaaaaaa#############################################################aaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaa"+ "'",str3.equals("#############################aaaaaaaaaaaaaaaaaaaa##Aaaaaaaa#############################################################aaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaa"));
  }
  @Test public void test216() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test216#2079");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test216");
    java.lang.String str2=org.apache.commons.lang.StringUtils.left("!ih                                                a",3);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "!ih"+ "'",str2.equals("!ih"));
  }
  @Test public void test217() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test217#2087");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test217");
    java.lang.String str3=org.apache.commons.lang.StringUtils.replaceChars("aaaaaaaaa                                                                                        ",'4','#');
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "aaaaaaaaa                                                                                        "+ "'",str3.equals("aaaaaaaaa                                                                                        "));
  }
  @Test public void test218() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test218#2095");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test218");
    try {
      java.lang.Number number1=org.apache.commons.lang.math.NumberUtils.createNumber("aaaaaaaaa ");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: aaaaaaaaa  is not a valid number.");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test219() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test219#2106");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test219");
    int int2=org.apache.commons.lang.StringUtils.indexOfDifference("   #############################aaaaaaaaaaaaaaaaaaaa##Aaaaaaaa#############################################################aaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa","###                     aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 0+ "'",int2 == 0);
  }
  @Test public void test220() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test220#2114");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test220");
    java.lang.String str1=org.apache.commons.lang.StringUtils.chomp("##a##a#!ih");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "##a##a#!ih"+ "'",str1.equals("##a##a#!ih"));
  }
  @Test public void test221() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test221#2122");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test221");
    java.lang.String str2=org.apache.commons.lang.StringUtils.stripEnd("","Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test222() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test222#2130");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test222");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringBetween("iaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaA","aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa ");
    org.junit.Assert.assertNull(str2);
  }
  @Test public void test223() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test223#2138");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test223");
    boolean boolean2=org.apache.commons.lang.StringUtils.equalsIgnoreCase("Aaaaaaaaaaaaaaaaaaaa##Aaaaaaaahi!aaaaaaaaaaaaaaaaaaaa##Aaaaaaaa","");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test224() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test224#2146");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test224");
    byte byte3=org.apache.commons.lang.math.NumberUtils.min((byte)-1,(byte)1,(byte)100);
    org.junit.Assert.assertTrue("'" + byte3 + "' != '"+ (byte)-1+ "'",byte3 == (byte)-1);
  }
  @Test public void test225() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test225#2154");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test225");
    java.lang.String str2=org.apache.commons.lang.StringUtils.right("Aa ",94);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "Aa "+ "'",str2.equals("Aa "));
  }
  @Test public void test226() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test226#2162");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test226");
    java.lang.String str2=org.apache.commons.lang.StringUtils.repeat("aaaaaaaaa i!",2);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "aaaaaaaaa i!aaaaaaaaa i!"+ "'",str2.equals("aaaaaaaaa i!aaaaaaaaa i!"));
  }
  @Test public void test227() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test227#2170");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test227");
    boolean boolean1=org.apache.commons.lang.StringUtils.isWhitespace("a                                                HI!                                                 ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test228() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test228#2178");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test228");
    char[] charArray5=new char[]{' ',' '};
    int int6=org.apache.commons.lang.StringUtils.indexOfAny("                                                hi!                                                 ",charArray5);
    int int7=org.apache.commons.lang.StringUtils.indexOfAnyBut("                                                hi!                                                 ",charArray5);
    int int8=org.apache.commons.lang.StringUtils.indexOfAny("#aaaaaaaaa",charArray5);
    org.junit.Assert.assertNotNull(charArray5);
    org.junit.Assert.assertTrue("'" + int6 + "' != '"+ 0+ "'",int6 == 0);
    org.junit.Assert.assertTrue("'" + int7 + "' != '"+ 48+ "'",int7 == 48);
    org.junit.Assert.assertTrue("'" + int8 + "' != '"+ (-1)+ "'",int8 == (-1));
  }
  @Test public void test229() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test229#2192");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test229");
    java.lang.String str2=org.apache.commons.lang.StringUtils.defaultIfEmpty("a ","                             Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "a "+ "'",str2.equals("a "));
  }
  @Test public void test230() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test230#2200");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test230");
    java.lang.String str1=org.apache.commons.lang.StringUtils.capitalize("                                          aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "                                          aaaaaaaaa "+ "'",str1.equals("                                          aaaaaaaaa "));
  }
  @Test public void test231() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test231#2208");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test231");
    int int2=org.apache.commons.lang.StringUtils.countMatches("","aAHI!");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 0+ "'",int2 == 0);
  }
  @Test public void test232() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test232#2216");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test232");
    java.lang.String str1=org.apache.commons.lang.StringUtils.stripToEmpty("                        AAAAAAAAAAAAAAAAAAAA                                                        ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "AAAAAAAAAAAAAAAAAAAA"+ "'",str1.equals("AAAAAAAAAAAAAAAAAAAA"));
  }
  @Test public void test233() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test233#2224");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test233");
    long[] longArray2=new long[]{1,97};
    long long3=org.apache.commons.lang.math.NumberUtils.min(longArray2);
    long[] longArray5=new long[]{'#'};
    long[] longArray9=new long[]{97,(-1),' '};
    boolean boolean10=org.apache.commons.lang.math.NumberUtils.equals(longArray5,longArray9);
    boolean boolean11=org.apache.commons.lang.math.NumberUtils.equals(longArray2,longArray9);
    long[] longArray13=new long[]{'#'};
    long[] longArray17=new long[]{97,(-1),' '};
    boolean boolean18=org.apache.commons.lang.math.NumberUtils.equals(longArray13,longArray17);
    long long19=org.apache.commons.lang.math.NumberUtils.max(longArray17);
    long long20=org.apache.commons.lang.math.NumberUtils.max(longArray17);
    long long21=org.apache.commons.lang.math.NumberUtils.min(longArray17);
    long long22=org.apache.commons.lang.math.NumberUtils.max(longArray17);
    long long23=org.apache.commons.lang.math.NumberUtils.max(longArray17);
    long long24=org.apache.commons.lang.math.NumberUtils.max(longArray17);
    boolean boolean25=org.apache.commons.lang.math.NumberUtils.equals(longArray2,longArray17);
    org.junit.Assert.assertNotNull(longArray2);
    org.junit.Assert.assertTrue("'" + long3 + "' != '"+ 1L+ "'",long3 == 1L);
    org.junit.Assert.assertNotNull(longArray5);
    org.junit.Assert.assertNotNull(longArray9);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '"+ false+ "'",boolean10 == false);
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '"+ false+ "'",boolean11 == false);
    org.junit.Assert.assertNotNull(longArray13);
    org.junit.Assert.assertNotNull(longArray17);
    org.junit.Assert.assertTrue("'" + boolean18 + "' != '"+ false+ "'",boolean18 == false);
    org.junit.Assert.assertTrue("'" + long19 + "' != '"+ 97L+ "'",long19 == 97L);
    org.junit.Assert.assertTrue("'" + long20 + "' != '"+ 97L+ "'",long20 == 97L);
    org.junit.Assert.assertTrue("'" + long21 + "' != '"+ (-1L)+ "'",long21 == (-1L));
    org.junit.Assert.assertTrue("'" + long22 + "' != '"+ 97L+ "'",long22 == 97L);
    org.junit.Assert.assertTrue("'" + long23 + "' != '"+ 97L+ "'",long23 == 97L);
    org.junit.Assert.assertTrue("'" + long24 + "' != '"+ 97L+ "'",long24 == 97L);
    org.junit.Assert.assertTrue("'" + boolean25 + "' != '"+ false+ "'",boolean25 == false);
  }
  @Test public void test234() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test234#2262");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test234");
    java.lang.String str3=org.apache.commons.lang.StringUtils.leftPad("#           HI!            ",65,"          #############################################################################");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "          #############################           HI!            "+ "'",str3.equals("          #############################           HI!            "));
  }
  @Test public void test235() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test235#2270");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test235");
    java.lang.String str4=org.apache.commons.lang.StringUtils.overlay(" AAAAAA...","a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a ",7,65);
    org.junit.Assert.assertTrue("'" + str4 + "' != '"+ " AAAAAAa a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a "+ "'",str4.equals(" AAAAAAa a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a "));
  }
  @Test public void test236() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test236#2278");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test236");
    java.lang.String str3=org.apache.commons.lang.StringUtils.center("!###################################A",32,"");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "!###################################A"+ "'",str3.equals("!###################################A"));
  }
  @Test public void test237() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test237#2286");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test237");
    try {
      java.math.BigDecimal bigDecimal1=org.apache.commons.lang.math.NumberUtils.createBigDecimal("         A");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test238() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test238#2297");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test238");
    java.lang.String str1=org.apache.commons.lang.StringUtils.upperCase("aaaaaaaaaaaaaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "AAAAAAAAAAAAAAAAAAAA"+ "'",str1.equals("AAAAAAAAAAAAAAAAAAAA"));
  }
  @Test public void test239() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test239#2305");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test239");
    java.lang.String str2=org.apache.commons.lang.StringUtils.getNestedString("aaaaaaaaa                                       hi!","a");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test240() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test240#2313");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test240");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.split("...                                          ..",' ');
    org.junit.Assert.assertNotNull(strArray2);
  }
  @Test public void test241() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test241#2321");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test241");
    int int2=org.apache.commons.lang.StringUtils.lastIndexOf("... !ih...                                ","4444444444444444444444444444444444...");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test242() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test242#2329");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test242");
    int int2=org.apache.commons.lang.StringUtils.lastIndexOf("AAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAA aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa","  4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test243() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test243#2337");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test243");
    java.lang.String str2=org.apache.commons.lang.StringUtils.removeStart("                                    aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa                                       hi!                                                 ","");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                                    aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa                                       hi!                                                 "+ "'",str2.equals("                                    aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa                                       hi!                                                 "));
  }
  @Test public void test244() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test244#2345");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test244");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.split("HHHHHHHHHH",'#');
    org.junit.Assert.assertNotNull(strArray2);
  }
  @Test public void test245() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test245#2353");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test245");
    java.lang.String str2=org.apache.commons.lang.StringUtils.reverseDelimitedString("","AAAAAAAAA ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test246() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test246#2361");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test246");
    java.lang.String str2=org.apache.commons.lang.StringUtils.defaultIfEmpty("aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaa","");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaa"+ "'",str2.equals("aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaa"));
  }
  @Test public void test247() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test247#2369");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test247");
    char[] charArray4=new char[]{' ',' '};
    int int5=org.apache.commons.lang.StringUtils.indexOfAny("                                                hi!                                                 ",charArray4);
    int int6=org.apache.commons.lang.StringUtils.indexOfAnyBut("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                         HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",charArray4);
    org.junit.Assert.assertNotNull(charArray4);
    org.junit.Assert.assertTrue("'" + int5 + "' != '"+ 0+ "'",int5 == 0);
    org.junit.Assert.assertTrue("'" + int6 + "' != '"+ 0+ "'",int6 == 0);
  }
  @Test public void test248() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test248#2381");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test248");
    java.lang.String str1=org.apache.commons.lang.StringUtils.capitalize("##a##a#!ih");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "##a##a#!ih"+ "'",str1.equals("##a##a#!ih"));
  }
  @Test public void test249() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test249#2389");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test249");
    java.lang.String str1=org.apache.commons.lang.StringUtils.capitaliseAllWords("aaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa"+ "'",str1.equals("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
  }
  @Test public void test250() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test250#2397");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test250");
    int int3=org.apache.commons.lang.math.NumberUtils.min(31,(int)'4',80);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ 31+ "'",int3 == 31);
  }
  @Test public void test251() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test251#2405");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test251");
    java.lang.String str1=org.apache.commons.lang.StringUtils.chopNewline("AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444"+ "'",str1.equals("AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444"));
  }
  @Test public void test252() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test252#2413");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test252");
    int int3=org.apache.commons.lang.StringUtils.lastIndexOf("###                     aaaaaaaaai!   ",' ',891);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ 37+ "'",int3 == 37);
  }
  @Test public void test253() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test253#2421");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test253");
    int int2=org.apache.commons.lang.StringUtils.lastIndexOf("aaaaaaaaaaaaaaaaaaaa##Aaaaaaaaaaaaaaaaaaaaa##Aa","                                              !ih                                               ");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test254() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test254#2429");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test254");
    java.lang.String str1=org.apache.commons.lang.StringUtils.strip("          #############################################################################");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "#############################################################################"+ "'",str1.equals("#############################################################################"));
  }
  @Test public void test255() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test255#2437");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test255");
    java.lang.String str2=org.apache.commons.lang.StringUtils.removeStart("aAHI!","4444444Hi!aaaaaaaaa                                                                                        ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "aAHI!"+ "'",str2.equals("aAHI!"));
  }
  @Test public void test256() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test256#2445");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test256");
    java.lang.String str2=org.apache.commons.lang.StringUtils.chomp("                        AAAAAAAAAAAAAAAAAAAA                                                        ","...aaaa");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                        AAAAAAAAAAAAAAAAAAAA                                                        "+ "'",str2.equals("                        AAAAAAAAAAAAAAAAAAAA                                                        "));
  }
  @Test public void test257() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test257#2453");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test257");
    long long1=org.apache.commons.lang.math.NumberUtils.toLong("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai");
    org.junit.Assert.assertTrue("'" + long1 + "' != '"+ 0L+ "'",long1 == 0L);
  }
  @Test public void test258() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test258#2461");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test258");
    try {
      java.lang.String str2=org.apache.commons.lang.StringUtils.chompLast("#################...","Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -15");
    }
 catch (    java.lang.StringIndexOutOfBoundsException e) {
    }
  }
  @Test public void test259() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test259#2472");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test259");
    float float3=org.apache.commons.lang.math.NumberUtils.max(134.0f,(float)'#',(float)10);
    org.junit.Assert.assertTrue("'" + float3 + "' != '"+ 134.0f+ "'",float3 == 134.0f);
  }
  @Test public void test260() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test260#2480");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test260");
    boolean boolean2=org.apache.commons.lang.StringUtils.contains("","AAAAAAAAAAAAAAAAAAAA");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test261() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test261#2488");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test261");
    int[] intArray2=new int[]{1,(short)1};
    int[] intArray5=new int[]{100,1};
    int[] intArray12=new int[]{(byte)-1,100,(short)0,100,'#',100};
    boolean boolean13=org.apache.commons.lang.math.NumberUtils.equals(intArray5,intArray12);
    int[] intArray20=new int[]{'4',(short)100,(short)100,52,(byte)1,(short)100};
    boolean boolean21=org.apache.commons.lang.math.NumberUtils.equals(intArray12,intArray20);
    int int22=org.apache.commons.lang.math.NumberUtils.max(intArray20);
    int int23=org.apache.commons.lang.math.NumberUtils.max(intArray20);
    boolean boolean24=org.apache.commons.lang.math.NumberUtils.equals(intArray2,intArray20);
    int int25=org.apache.commons.lang.math.NumberUtils.min(intArray20);
    org.junit.Assert.assertNotNull(intArray2);
    org.junit.Assert.assertNotNull(intArray5);
    org.junit.Assert.assertNotNull(intArray12);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '"+ false+ "'",boolean13 == false);
    org.junit.Assert.assertNotNull(intArray20);
    org.junit.Assert.assertTrue("'" + boolean21 + "' != '"+ false+ "'",boolean21 == false);
    org.junit.Assert.assertTrue("'" + int22 + "' != '"+ 100+ "'",int22 == 100);
    org.junit.Assert.assertTrue("'" + int23 + "' != '"+ 100+ "'",int23 == 100);
    org.junit.Assert.assertTrue("'" + boolean24 + "' != '"+ false+ "'",boolean24 == false);
    org.junit.Assert.assertTrue("'" + int25 + "' != '"+ 1+ "'",int25 == 1);
  }
  @Test public void test262() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test262#2514");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test262");
    char[] charArray2=new char[]{};
    int int3=org.apache.commons.lang.StringUtils.indexOfAnyBut("",charArray2);
    boolean boolean4=org.apache.commons.lang.StringUtils.containsOnly(" 4            ",charArray2);
    org.junit.Assert.assertNotNull(charArray2);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '"+ false+ "'",boolean4 == false);
  }
  @Test public void test263() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test263#2526");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test263");
    byte[] byteArray3=new byte[]{(byte)100,(byte)0,(byte)100};
    byte[] byteArray6=new byte[]{(byte)-1,(byte)-1};
    boolean boolean7=org.apache.commons.lang.math.NumberUtils.equals(byteArray3,byteArray6);
    byte byte8=org.apache.commons.lang.math.NumberUtils.min(byteArray6);
    byte byte9=org.apache.commons.lang.math.NumberUtils.min(byteArray6);
    org.junit.Assert.assertNotNull(byteArray3);
    org.junit.Assert.assertNotNull(byteArray6);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '"+ false+ "'",boolean7 == false);
    org.junit.Assert.assertTrue("'" + byte8 + "' != '"+ (byte)-1+ "'",byte8 == (byte)-1);
    org.junit.Assert.assertTrue("'" + byte9 + "' != '"+ (byte)-1+ "'",byte9 == (byte)-1);
  }
  @Test public void test264() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test264#2542");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test264");
    int int2=org.apache.commons.lang.math.NumberUtils.toInt("aaa ",134);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 134+ "'",int2 == 134);
  }
  @Test public void test265() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test265#2550");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test265");
    java.lang.String str1=org.apache.commons.lang.StringUtils.escape("                                                                                                                                                                     ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "                                                                                                                                                                     "+ "'",str1.equals("                                                                                                                                                                     "));
  }
  @Test public void test266() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test266#2558");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test266");
    java.lang.String str1=org.apache.commons.lang.StringUtils.uncapitalize("aa");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "aa"+ "'",str1.equals("aa"));
  }
  @Test public void test267() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test267#2566");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test267");
    boolean boolean2=org.apache.commons.lang.StringUtils.contains("a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a",'a');
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ true+ "'",boolean2 == true);
  }
  @Test public void test268() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test268#2574");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test268");
    java.lang.String str4=org.apache.commons.lang.StringUtils.replace("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"," AAAAAAAAA","Aa hi!",(-1));
    org.junit.Assert.assertTrue("'" + str4 + "' != '"+ "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"+ "'",str4.equals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
  }
  @Test public void test269() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test269#2582");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test269");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringAfter("                                                                                        ","             ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                                                                           "+ "'",str2.equals("                                                                           "));
  }
  @Test public void test270() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test270#2590");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test270");
    java.lang.String str2=org.apache.commons.lang.StringUtils.getPrechomp("","                                                                                                                  HI!");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test271() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test271#2598");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test271");
    byte[] byteArray3=new byte[]{(byte)100,(byte)0,(byte)100};
    byte[] byteArray6=new byte[]{(byte)-1,(byte)-1};
    boolean boolean7=org.apache.commons.lang.math.NumberUtils.equals(byteArray3,byteArray6);
    byte[] byteArray11=new byte[]{(byte)100,(byte)0,(byte)100};
    byte[] byteArray14=new byte[]{(byte)-1,(byte)-1};
    boolean boolean15=org.apache.commons.lang.math.NumberUtils.equals(byteArray11,byteArray14);
    byte byte16=org.apache.commons.lang.math.NumberUtils.min(byteArray14);
    byte[] byteArray20=new byte[]{(byte)0,(byte)100,(byte)100};
    byte[] byteArray21=null;
    boolean boolean22=org.apache.commons.lang.math.NumberUtils.equals(byteArray20,byteArray21);
    boolean boolean23=org.apache.commons.lang.math.NumberUtils.equals(byteArray14,byteArray20);
    boolean boolean24=org.apache.commons.lang.math.NumberUtils.equals(byteArray3,byteArray14);
    byte byte25=org.apache.commons.lang.math.NumberUtils.max(byteArray3);
    byte byte26=org.apache.commons.lang.math.NumberUtils.min(byteArray3);
    org.junit.Assert.assertNotNull(byteArray3);
    org.junit.Assert.assertNotNull(byteArray6);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '"+ false+ "'",boolean7 == false);
    org.junit.Assert.assertNotNull(byteArray11);
    org.junit.Assert.assertNotNull(byteArray14);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '"+ false+ "'",boolean15 == false);
    org.junit.Assert.assertTrue("'" + byte16 + "' != '"+ (byte)-1+ "'",byte16 == (byte)-1);
    org.junit.Assert.assertNotNull(byteArray20);
    org.junit.Assert.assertTrue("'" + boolean22 + "' != '"+ false+ "'",boolean22 == false);
    org.junit.Assert.assertTrue("'" + boolean23 + "' != '"+ false+ "'",boolean23 == false);
    org.junit.Assert.assertTrue("'" + boolean24 + "' != '"+ false+ "'",boolean24 == false);
    org.junit.Assert.assertTrue("'" + byte25 + "' != '"+ (byte)100+ "'",byte25 == (byte)100);
    org.junit.Assert.assertTrue("'" + byte26 + "' != '"+ (byte)0+ "'",byte26 == (byte)0);
  }
  @Test public void test272() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test272#2631");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test272");
    java.lang.String str2=org.apache.commons.lang.StringUtils.getNestedString("444444444444444444444444444444444444444444444          444444444444444444444444444444444444","a");
    org.junit.Assert.assertNull(str2);
  }
  @Test public void test273() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test273#2639");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test273");
    java.lang.String str1=org.apache.commons.lang.StringUtils.strip("444444444444444444444444444444444444444444444          444444444444444444444444444444444444444444444");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "444444444444444444444444444444444444444444444          444444444444444444444444444444444444444444444"+ "'",str1.equals("444444444444444444444444444444444444444444444          444444444444444444444444444444444444444444444"));
  }
  @Test public void test274() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test274#2647");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test274");
    java.lang.String[] strArray3=org.apache.commons.lang.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa ","aa  Aaaaaaaaa",4);
    java.lang.String str7=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray3,"...aaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA",54,0);
    org.junit.Assert.assertNotNull(strArray3);
    org.junit.Assert.assertTrue("'" + str7 + "' != '"+ ""+ "'",str7.equals(""));
  }
  @Test public void test275() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test275#2657");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test275");
    boolean boolean2=org.apache.commons.lang.StringUtils.equalsIgnoreCase("aa  Aaaaaaaaa","aaaaaa");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test276() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test276#2665");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test276");
    long long3=org.apache.commons.lang.math.NumberUtils.max(0L,100L,41L);
    org.junit.Assert.assertTrue("'" + long3 + "' != '"+ 100L+ "'",long3 == 100L);
  }
  @Test public void test277() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test277#2673");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test277");
    int int2=org.apache.commons.lang.StringUtils.indexOfAnyBut("aaaa","");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test278() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test278#2681");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test278");
    java.lang.String str1=org.apache.commons.lang.StringUtils.lowerCase("4AHI!");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "4ahi!"+ "'",str1.equals("4ahi!"));
  }
  @Test public void test279() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test279#2689");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test279");
    java.lang.String str3=org.apache.commons.lang.StringUtils.replaceChars("!###################################A","                        AAAAAAAAAAAAAAAAAAAA                                                        ","aAAAAAAAA                                       HI!");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "!################################### "+ "'",str3.equals("!################################### "));
  }
  @Test public void test280() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test280#2697");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test280");
    boolean boolean1=org.apache.commons.lang.StringUtils.isEmpty("!i aaaaaaaaa!i aaaaaaaaa!i aaaaaaaaa!i aaaaaaaaa!i aaaaaaaaaaaaaaaaaa                          !i aaaaaaaaa!i aaaaaaaaa!i aaaaaaaaa!i aaaaaaaaa!i aaaaaaaaa!");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test281() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test281#2705");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test281");
    boolean boolean2=org.apache.commons.lang.StringUtils.containsNone("Aaaaaaaaaaaaaaaaaaaa##Aaaaaaaahi!aaaaaaaaaaaaaaaaaaaa##Aaaaaaaa","###                                                                                       aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test282() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test282#2713");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test282");
    java.lang.String str2=org.apache.commons.lang.StringUtils.chomp("44Aaaaaaaaa","AAAAAAAAA ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "44Aaaaaaaaa"+ "'",str2.equals("44Aaaaaaaaa"));
  }
  @Test public void test283() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test283#2721");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test283");
    java.lang.String str1=org.apache.commons.lang.StringUtils.upperCase("Hi!                                                                                              ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "HI!                                                                                              "+ "'",str1.equals("HI!                                                                                              "));
  }
  @Test public void test284() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test284#2729");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test284");
    java.lang.String str3=org.apache.commons.lang.StringUtils.substringBetween("                                                 !ih                                                ","           ... !ih...           ","                         hi!");
    org.junit.Assert.assertNull(str3);
  }
  @Test public void test285() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test285#2737");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test285");
    long[] longArray1=new long[]{'#'};
    long[] longArray5=new long[]{97,(-1),' '};
    boolean boolean6=org.apache.commons.lang.math.NumberUtils.equals(longArray1,longArray5);
    long long7=org.apache.commons.lang.math.NumberUtils.max(longArray5);
    long long8=org.apache.commons.lang.math.NumberUtils.max(longArray5);
    long long9=org.apache.commons.lang.math.NumberUtils.min(longArray5);
    long long10=org.apache.commons.lang.math.NumberUtils.min(longArray5);
    org.junit.Assert.assertNotNull(longArray1);
    org.junit.Assert.assertNotNull(longArray5);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '"+ false+ "'",boolean6 == false);
    org.junit.Assert.assertTrue("'" + long7 + "' != '"+ 97L+ "'",long7 == 97L);
    org.junit.Assert.assertTrue("'" + long8 + "' != '"+ 97L+ "'",long8 == 97L);
    org.junit.Assert.assertTrue("'" + long9 + "' != '"+ (-1L)+ "'",long9 == (-1L));
    org.junit.Assert.assertTrue("'" + long10 + "' != '"+ (-1L)+ "'",long10 == (-1L));
  }
  @Test public void test286() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test286#2757");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test286");
    int int2=org.apache.commons.lang.StringUtils.lastIndexOf("                                                    ",'a');
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test287() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test287#2765");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test287");
    float float2=org.apache.commons.lang.math.NumberUtils.toFloat("",(float)(-1));
    org.junit.Assert.assertTrue("'" + float2 + "' != '"+ (-1.0f)+ "'",float2 == (-1.0f));
  }
  @Test public void test288() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test288#2773");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test288");
    java.lang.String str3=org.apache.commons.lang.StringUtils.substringBetween("4444444444444444444444444444444444                                4444444444444444444444444444444444","AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA","A444 A44444444 A44444444 A44444444 A44444444 A44444444 A44444444");
    org.junit.Assert.assertNull(str3);
  }
  @Test public void test289() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test289#2781");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test289");
    boolean boolean1=org.apache.commons.lang.StringUtils.isNumericSpace("   a");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test290() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test290#2789");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test290");
    try {
      java.lang.Double double1=org.apache.commons.lang.math.NumberUtils.createDouble("               ...                          ...");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: multiple points");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test291() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test291#2800");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test291");
    long long2=org.apache.commons.lang.math.NumberUtils.toLong("AAAAAAAAAAAAAAAAAAAA                                                        i!",(long)9);
    org.junit.Assert.assertTrue("'" + long2 + "' != '"+ 9L+ "'",long2 == 9L);
  }
  @Test public void test292() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test292#2808");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test292");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAlphanumericSpace("        aaaaaaaaaa         ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test293() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test293#2816");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test293");
    java.lang.String str2=org.apache.commons.lang.StringUtils.reverseDelimitedString("aaaaaaaaaaaaaaaaaaaa##Aaaaaaaaa                                                                  ","                                           ... !ih");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "aaaaaaaaaaaaaaaaaaaa##Aaaaaaaaa"+ "'",str2.equals("aaaaaaaaaaaaaaaaaaaa##Aaaaaaaaa"));
  }
  @Test public void test294() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test294#2824");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test294");
    float float1=org.apache.commons.lang.math.NumberUtils.toFloat("                                              hi!");
    org.junit.Assert.assertTrue("'" + float1 + "' != '"+ 0.0f+ "'",float1 == 0.0f);
  }
  @Test public void test295() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test295#2832");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test295");
    java.lang.String[] strArray3=org.apache.commons.lang.StringUtils.splitByWholeSeparator("Hi!"," ");
    java.lang.String str5=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray3,' ');
    java.lang.Class<?> wildcardClass6=strArray3.getClass();
    int int7=org.apache.commons.lang.StringUtils.lastIndexOfAny("A",strArray3);
    java.lang.String str11=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray3,"           4            ",2,(int)(byte)0);
    java.lang.String str13=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray3,"aaaaaaaaaaaaaaaaaaa   A aaaaaaaaaaaaaaaaaaa");
    org.junit.Assert.assertNotNull(strArray3);
    org.junit.Assert.assertTrue("'" + str5 + "' != '"+ "Hi!"+ "'",str5.equals("Hi!"));
    org.junit.Assert.assertNotNull(wildcardClass6);
    org.junit.Assert.assertTrue("'" + int7 + "' != '"+ (-1)+ "'",int7 == (-1));
    org.junit.Assert.assertTrue("'" + str11 + "' != '"+ ""+ "'",str11.equals(""));
    org.junit.Assert.assertTrue("'" + str13 + "' != '"+ "Hi!"+ "'",str13.equals("Hi!"));
  }
  @Test public void test296() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test296#2850");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test296");
    byte[] byteArray0=null;
    byte[] byteArray4=new byte[]{(byte)100,(byte)0,(byte)100};
    byte[] byteArray7=new byte[]{(byte)-1,(byte)-1};
    boolean boolean8=org.apache.commons.lang.math.NumberUtils.equals(byteArray4,byteArray7);
    byte byte9=org.apache.commons.lang.math.NumberUtils.min(byteArray7);
    byte[] byteArray13=new byte[]{(byte)100,(byte)0,(byte)100};
    byte[] byteArray16=new byte[]{(byte)-1,(byte)-1};
    boolean boolean17=org.apache.commons.lang.math.NumberUtils.equals(byteArray13,byteArray16);
    byte byte18=org.apache.commons.lang.math.NumberUtils.min(byteArray13);
    byte byte19=org.apache.commons.lang.math.NumberUtils.max(byteArray13);
    byte byte20=org.apache.commons.lang.math.NumberUtils.min(byteArray13);
    byte[] byteArray24=new byte[]{(byte)100,(byte)0,(byte)100};
    byte[] byteArray27=new byte[]{(byte)-1,(byte)-1};
    boolean boolean28=org.apache.commons.lang.math.NumberUtils.equals(byteArray24,byteArray27);
    byte byte29=org.apache.commons.lang.math.NumberUtils.max(byteArray27);
    boolean boolean30=org.apache.commons.lang.math.NumberUtils.equals(byteArray13,byteArray27);
    boolean boolean31=org.apache.commons.lang.math.NumberUtils.equals(byteArray7,byteArray13);
    byte[] byteArray35=new byte[]{(byte)100,(byte)0,(byte)100};
    byte[] byteArray38=new byte[]{(byte)-1,(byte)-1};
    boolean boolean39=org.apache.commons.lang.math.NumberUtils.equals(byteArray35,byteArray38);
    byte byte40=org.apache.commons.lang.math.NumberUtils.min(byteArray38);
    byte[] byteArray44=new byte[]{(byte)100,(byte)0,(byte)100};
    byte[] byteArray47=new byte[]{(byte)-1,(byte)-1};
    boolean boolean48=org.apache.commons.lang.math.NumberUtils.equals(byteArray44,byteArray47);
    byte byte49=org.apache.commons.lang.math.NumberUtils.min(byteArray47);
    boolean boolean50=org.apache.commons.lang.math.NumberUtils.equals(byteArray38,byteArray47);
    byte[] byteArray53=new byte[]{(byte)100,(byte)100};
    boolean boolean54=org.apache.commons.lang.math.NumberUtils.equals(byteArray38,byteArray53);
    byte byte55=org.apache.commons.lang.math.NumberUtils.max(byteArray53);
    boolean boolean56=org.apache.commons.lang.math.NumberUtils.equals(byteArray7,byteArray53);
    boolean boolean57=org.apache.commons.lang.math.NumberUtils.equals(byteArray0,byteArray53);
    org.junit.Assert.assertNotNull(byteArray4);
    org.junit.Assert.assertNotNull(byteArray7);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '"+ false+ "'",boolean8 == false);
    org.junit.Assert.assertTrue("'" + byte9 + "' != '"+ (byte)-1+ "'",byte9 == (byte)-1);
    org.junit.Assert.assertNotNull(byteArray13);
    org.junit.Assert.assertNotNull(byteArray16);
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '"+ false+ "'",boolean17 == false);
    org.junit.Assert.assertTrue("'" + byte18 + "' != '"+ (byte)0+ "'",byte18 == (byte)0);
    org.junit.Assert.assertTrue("'" + byte19 + "' != '"+ (byte)100+ "'",byte19 == (byte)100);
    org.junit.Assert.assertTrue("'" + byte20 + "' != '"+ (byte)0+ "'",byte20 == (byte)0);
    org.junit.Assert.assertNotNull(byteArray24);
    org.junit.Assert.assertNotNull(byteArray27);
    org.junit.Assert.assertTrue("'" + boolean28 + "' != '"+ false+ "'",boolean28 == false);
    org.junit.Assert.assertTrue("'" + byte29 + "' != '"+ (byte)-1+ "'",byte29 == (byte)-1);
    org.junit.Assert.assertTrue("'" + boolean30 + "' != '"+ false+ "'",boolean30 == false);
    org.junit.Assert.assertTrue("'" + boolean31 + "' != '"+ false+ "'",boolean31 == false);
    org.junit.Assert.assertNotNull(byteArray35);
    org.junit.Assert.assertNotNull(byteArray38);
    org.junit.Assert.assertTrue("'" + boolean39 + "' != '"+ false+ "'",boolean39 == false);
    org.junit.Assert.assertTrue("'" + byte40 + "' != '"+ (byte)-1+ "'",byte40 == (byte)-1);
    org.junit.Assert.assertNotNull(byteArray44);
    org.junit.Assert.assertNotNull(byteArray47);
    org.junit.Assert.assertTrue("'" + boolean48 + "' != '"+ false+ "'",boolean48 == false);
    org.junit.Assert.assertTrue("'" + byte49 + "' != '"+ (byte)-1+ "'",byte49 == (byte)-1);
    org.junit.Assert.assertTrue("'" + boolean50 + "' != '"+ true+ "'",boolean50 == true);
    org.junit.Assert.assertNotNull(byteArray53);
    org.junit.Assert.assertTrue("'" + boolean54 + "' != '"+ false+ "'",boolean54 == false);
    org.junit.Assert.assertTrue("'" + byte55 + "' != '"+ (byte)100+ "'",byte55 == (byte)100);
    org.junit.Assert.assertTrue("'" + boolean56 + "' != '"+ false+ "'",boolean56 == false);
    org.junit.Assert.assertTrue("'" + boolean57 + "' != '"+ false+ "'",boolean57 == false);
  }
  @Test public void test297() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test297#2917");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test297");
    try {
      java.lang.Float float1=org.apache.commons.lang.math.NumberUtils.createFloat("!iaaaaaaaaa");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"!iaaaaaaaaa\"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test298() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test298#2928");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test298");
    java.lang.String str1=org.apache.commons.lang.StringUtils.defaultString("                                                                           ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "                                                                           "+ "'",str1.equals("                                                                           "));
  }
  @Test public void test299() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test299#2936");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test299");
    java.lang.String[] strArray1=org.apache.commons.lang.StringUtils.split("aaaaaaaaa ");
    java.lang.String str2=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray1);
    org.junit.Assert.assertNotNull(strArray1);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "aaaaaaaaa"+ "'",str2.equals("aaaaaaaaa"));
  }
  @Test public void test300() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test300#2946");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test300");
    java.lang.String str2=org.apache.commons.lang.StringUtils.strip("   a","#############################aaaaaaaaaaaaaaaaaaaa##Aaaaaaaa#############################################################aaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaa");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "   "+ "'",str2.equals("   "));
  }
  @Test public void test301() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test301#2954");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test301");
    java.lang.String str2=org.apache.commons.lang.StringUtils.getPrechomp("AaaaaaaaaaaaaaaaaaaaAaaaaaaaa","                                                                                       aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test302() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test302#2962");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test302");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.split(" AAAAAA...",'4');
    java.lang.String str6=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray2,"...                                          HI!                                                 ",93,54);
    org.junit.Assert.assertNotNull(strArray2);
    org.junit.Assert.assertTrue("'" + str6 + "' != '"+ ""+ "'",str6.equals(""));
  }
  @Test public void test303() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test303#2972");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test303");
    java.lang.String str3=org.apache.commons.lang.StringUtils.replaceChars("                                                                                                         HI!","","");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "                                                                                                         HI!"+ "'",str3.equals("                                                                                                         HI!"));
  }
  @Test public void test304() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test304#2980");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test304");
    try {
      java.lang.Double double1=org.apache.commons.lang.math.NumberUtils.createDouble("Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!    ");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!\"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test305() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test305#2991");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test305");
    java.lang.String str3=org.apache.commons.lang.StringUtils.center("##########################################                         i!                         ",0,"...aaaa...");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "##########################################                         i!                         "+ "'",str3.equals("##########################################                         i!                         "));
  }
  @Test public void test306() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test306#2999");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test306");
    java.lang.String str3=org.apache.commons.lang.StringUtils.mid("... !ih...                      AaaaaaaaaAaaaaaaaaAaaaaaaaaAa... !ih...                       ",3,63);
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ " !ih...                      AaaaaaaaaAaaaaaaaaAaaaaaaaaAa... !"+ "'",str3.equals(" !ih...                      AaaaaaaaaAaaaaaaaaAaaaaaaaaAa... !"));
  }
  @Test public void test307() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test307#3007");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test307");
    java.lang.String str1=org.apache.commons.lang.StringUtils.capitaliseAllWords("!i aaaaaaaaa                                          ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "!i Aaaaaaaaa                                          "+ "'",str1.equals("!i Aaaaaaaaa                                          "));
  }
  @Test public void test308() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test308#3015");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test308");
    boolean boolean1=org.apache.commons.lang.StringUtils.isEmpty("                                                                                       aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test309() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test309#3023");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test309");
    java.lang.String str1=org.apache.commons.lang.StringUtils.uncapitalise("                                                                                                HI!");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "                                                                                                HI!"+ "'",str1.equals("                                                                                                HI!"));
  }
  @Test public void test310() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test310#3031");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test310");
    int int1=org.apache.commons.lang.math.NumberUtils.toInt("aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaa");
    org.junit.Assert.assertTrue("'" + int1 + "' != '"+ 0+ "'",int1 == 0);
  }
  @Test public void test311() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test311#3039");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test311");
    short[] shortArray2=new short[]{(byte)10,(byte)-1};
    short short3=org.apache.commons.lang.math.NumberUtils.max(shortArray2);
    short[] shortArray6=new short[]{(byte)1,(byte)1};
    boolean boolean7=org.apache.commons.lang.math.NumberUtils.equals(shortArray2,shortArray6);
    short short8=org.apache.commons.lang.math.NumberUtils.min(shortArray2);
    short short9=org.apache.commons.lang.math.NumberUtils.max(shortArray2);
    short short10=org.apache.commons.lang.math.NumberUtils.min(shortArray2);
    short short11=org.apache.commons.lang.math.NumberUtils.max(shortArray2);
    short[] shortArray14=new short[]{(byte)10,(byte)-1};
    short short15=org.apache.commons.lang.math.NumberUtils.max(shortArray14);
    short[] shortArray18=new short[]{(byte)1,(byte)1};
    boolean boolean19=org.apache.commons.lang.math.NumberUtils.equals(shortArray14,shortArray18);
    short short20=org.apache.commons.lang.math.NumberUtils.min(shortArray14);
    short[] shortArray23=new short[]{(byte)10,(byte)-1};
    short short24=org.apache.commons.lang.math.NumberUtils.max(shortArray23);
    short[] shortArray27=new short[]{(byte)1,(byte)1};
    boolean boolean28=org.apache.commons.lang.math.NumberUtils.equals(shortArray23,shortArray27);
    short short29=org.apache.commons.lang.math.NumberUtils.max(shortArray23);
    boolean boolean30=org.apache.commons.lang.math.NumberUtils.equals(shortArray14,shortArray23);
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
    short[] shortArray52=new short[]{(byte)10,(byte)-1};
    short short53=org.apache.commons.lang.math.NumberUtils.max(shortArray52);
    short[] shortArray56=new short[]{(byte)1,(byte)1};
    boolean boolean57=org.apache.commons.lang.math.NumberUtils.equals(shortArray52,shortArray56);
    short short58=org.apache.commons.lang.math.NumberUtils.min(shortArray52);
    short short59=org.apache.commons.lang.math.NumberUtils.max(shortArray52);
    boolean boolean60=org.apache.commons.lang.math.NumberUtils.equals(shortArray33,shortArray52);
    short[] shortArray61=null;
    short[] shortArray64=new short[]{(byte)10,(byte)-1};
    short short65=org.apache.commons.lang.math.NumberUtils.max(shortArray64);
    short[] shortArray68=new short[]{(byte)1,(byte)1};
    boolean boolean69=org.apache.commons.lang.math.NumberUtils.equals(shortArray64,shortArray68);
    short[] shortArray72=new short[]{(byte)10,(byte)-1};
    short short73=org.apache.commons.lang.math.NumberUtils.max(shortArray72);
    short[] shortArray76=new short[]{(byte)1,(byte)1};
    boolean boolean77=org.apache.commons.lang.math.NumberUtils.equals(shortArray72,shortArray76);
    short short78=org.apache.commons.lang.math.NumberUtils.min(shortArray72);
    short[] shortArray81=new short[]{(byte)10,(byte)-1};
    short short82=org.apache.commons.lang.math.NumberUtils.max(shortArray81);
    short[] shortArray85=new short[]{(byte)1,(byte)1};
    boolean boolean86=org.apache.commons.lang.math.NumberUtils.equals(shortArray81,shortArray85);
    short short87=org.apache.commons.lang.math.NumberUtils.max(shortArray81);
    boolean boolean88=org.apache.commons.lang.math.NumberUtils.equals(shortArray72,shortArray81);
    boolean boolean89=org.apache.commons.lang.math.NumberUtils.equals(shortArray68,shortArray81);
    short short90=org.apache.commons.lang.math.NumberUtils.max(shortArray81);
    boolean boolean91=org.apache.commons.lang.math.NumberUtils.equals(shortArray61,shortArray81);
    boolean boolean92=org.apache.commons.lang.math.NumberUtils.equals(shortArray52,shortArray81);
    boolean boolean93=org.apache.commons.lang.math.NumberUtils.equals(shortArray14,shortArray52);
    short short94=org.apache.commons.lang.math.NumberUtils.max(shortArray14);
    boolean boolean95=org.apache.commons.lang.math.NumberUtils.equals(shortArray2,shortArray14);
    short short96=org.apache.commons.lang.math.NumberUtils.min(shortArray14);
    org.junit.Assert.assertNotNull(shortArray2);
    org.junit.Assert.assertTrue("'" + short3 + "' != '"+ (short)10+ "'",short3 == (short)10);
    org.junit.Assert.assertNotNull(shortArray6);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '"+ false+ "'",boolean7 == false);
    org.junit.Assert.assertTrue("'" + short8 + "' != '"+ (short)-1+ "'",short8 == (short)-1);
    org.junit.Assert.assertTrue("'" + short9 + "' != '"+ (short)10+ "'",short9 == (short)10);
    org.junit.Assert.assertTrue("'" + short10 + "' != '"+ (short)-1+ "'",short10 == (short)-1);
    org.junit.Assert.assertTrue("'" + short11 + "' != '"+ (short)10+ "'",short11 == (short)10);
    org.junit.Assert.assertNotNull(shortArray14);
    org.junit.Assert.assertTrue("'" + short15 + "' != '"+ (short)10+ "'",short15 == (short)10);
    org.junit.Assert.assertNotNull(shortArray18);
    org.junit.Assert.assertTrue("'" + boolean19 + "' != '"+ false+ "'",boolean19 == false);
    org.junit.Assert.assertTrue("'" + short20 + "' != '"+ (short)-1+ "'",short20 == (short)-1);
    org.junit.Assert.assertNotNull(shortArray23);
    org.junit.Assert.assertTrue("'" + short24 + "' != '"+ (short)10+ "'",short24 == (short)10);
    org.junit.Assert.assertNotNull(shortArray27);
    org.junit.Assert.assertTrue("'" + boolean28 + "' != '"+ false+ "'",boolean28 == false);
    org.junit.Assert.assertTrue("'" + short29 + "' != '"+ (short)10+ "'",short29 == (short)10);
    org.junit.Assert.assertTrue("'" + boolean30 + "' != '"+ true+ "'",boolean30 == true);
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
    org.junit.Assert.assertNotNull(shortArray52);
    org.junit.Assert.assertTrue("'" + short53 + "' != '"+ (short)10+ "'",short53 == (short)10);
    org.junit.Assert.assertNotNull(shortArray56);
    org.junit.Assert.assertTrue("'" + boolean57 + "' != '"+ false+ "'",boolean57 == false);
    org.junit.Assert.assertTrue("'" + short58 + "' != '"+ (short)-1+ "'",short58 == (short)-1);
    org.junit.Assert.assertTrue("'" + short59 + "' != '"+ (short)10+ "'",short59 == (short)10);
    org.junit.Assert.assertTrue("'" + boolean60 + "' != '"+ true+ "'",boolean60 == true);
    org.junit.Assert.assertNotNull(shortArray64);
    org.junit.Assert.assertTrue("'" + short65 + "' != '"+ (short)10+ "'",short65 == (short)10);
    org.junit.Assert.assertNotNull(shortArray68);
    org.junit.Assert.assertTrue("'" + boolean69 + "' != '"+ false+ "'",boolean69 == false);
    org.junit.Assert.assertNotNull(shortArray72);
    org.junit.Assert.assertTrue("'" + short73 + "' != '"+ (short)10+ "'",short73 == (short)10);
    org.junit.Assert.assertNotNull(shortArray76);
    org.junit.Assert.assertTrue("'" + boolean77 + "' != '"+ false+ "'",boolean77 == false);
    org.junit.Assert.assertTrue("'" + short78 + "' != '"+ (short)-1+ "'",short78 == (short)-1);
    org.junit.Assert.assertNotNull(shortArray81);
    org.junit.Assert.assertTrue("'" + short82 + "' != '"+ (short)10+ "'",short82 == (short)10);
    org.junit.Assert.assertNotNull(shortArray85);
    org.junit.Assert.assertTrue("'" + boolean86 + "' != '"+ false+ "'",boolean86 == false);
    org.junit.Assert.assertTrue("'" + short87 + "' != '"+ (short)10+ "'",short87 == (short)10);
    org.junit.Assert.assertTrue("'" + boolean88 + "' != '"+ true+ "'",boolean88 == true);
    org.junit.Assert.assertTrue("'" + boolean89 + "' != '"+ false+ "'",boolean89 == false);
    org.junit.Assert.assertTrue("'" + short90 + "' != '"+ (short)10+ "'",short90 == (short)10);
    org.junit.Assert.assertTrue("'" + boolean91 + "' != '"+ false+ "'",boolean91 == false);
    org.junit.Assert.assertTrue("'" + boolean92 + "' != '"+ true+ "'",boolean92 == true);
    org.junit.Assert.assertTrue("'" + boolean93 + "' != '"+ true+ "'",boolean93 == true);
    org.junit.Assert.assertTrue("'" + short94 + "' != '"+ (short)10+ "'",short94 == (short)10);
    org.junit.Assert.assertTrue("'" + boolean95 + "' != '"+ true+ "'",boolean95 == true);
    org.junit.Assert.assertTrue("'" + short96 + "' != '"+ (short)-1+ "'",short96 == (short)-1);
  }
  @Test public void test312() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test312#3166");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test312");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substring("Aa ",134);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test313() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test313#3174");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test313");
    java.lang.String str2=org.apache.commons.lang.StringUtils.remove("aaaaaaaaaaaaaaaaaaaaa",'a');
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test314() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test314#3182");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test314");
    java.lang.String str2=org.apache.commons.lang.StringUtils.left("A ",80);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "A "+ "'",str2.equals("A "));
  }
  @Test public void test315() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test315#3190");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test315");
    java.lang.String str3=org.apache.commons.lang.StringUtils.leftPad("                                                HI!",80,'4');
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "44444444444444444444444444444                                                HI!"+ "'",str3.equals("44444444444444444444444444444                                                HI!"));
  }
  @Test public void test316() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test316#3198");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test316");
    float float3=org.apache.commons.lang.math.NumberUtils.max((float)(-1),(float)(byte)1,(float)0);
    org.junit.Assert.assertTrue("'" + float3 + "' != '"+ 1.0f+ "'",float3 == 1.0f);
  }
  @Test public void test317() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test317#3206");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test317");
    java.lang.String str2=org.apache.commons.lang.StringUtils.prechomp("        aa        aa        aa        aA!ih","   a");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "a        aa        aa        aA!ih"+ "'",str2.equals("a        aa        aa        aA!ih"));
  }
  @Test public void test318() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test318#3214");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test318");
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
    short[] shortArray64=new short[]{(byte)10,(byte)-1};
    short short65=org.apache.commons.lang.math.NumberUtils.max(shortArray64);
    short[] shortArray68=new short[]{(byte)1,(byte)1};
    boolean boolean69=org.apache.commons.lang.math.NumberUtils.equals(shortArray64,shortArray68);
    short[] shortArray72=new short[]{(byte)10,(byte)-1};
    short short73=org.apache.commons.lang.math.NumberUtils.max(shortArray72);
    short[] shortArray76=new short[]{(byte)1,(byte)1};
    boolean boolean77=org.apache.commons.lang.math.NumberUtils.equals(shortArray72,shortArray76);
    short short78=org.apache.commons.lang.math.NumberUtils.min(shortArray72);
    short short79=org.apache.commons.lang.math.NumberUtils.max(shortArray72);
    boolean boolean80=org.apache.commons.lang.math.NumberUtils.equals(shortArray64,shortArray72);
    boolean boolean81=org.apache.commons.lang.math.NumberUtils.equals(shortArray21,shortArray72);
    short short82=org.apache.commons.lang.math.NumberUtils.max(shortArray72);
    short[] shortArray88=new short[]{(byte)1,(short)1,(short)10,(byte)100,(short)-1};
    short short89=org.apache.commons.lang.math.NumberUtils.max(shortArray88);
    short short90=org.apache.commons.lang.math.NumberUtils.min(shortArray88);
    boolean boolean91=org.apache.commons.lang.math.NumberUtils.equals(shortArray72,shortArray88);
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
    org.junit.Assert.assertNotNull(shortArray64);
    org.junit.Assert.assertTrue("'" + short65 + "' != '"+ (short)10+ "'",short65 == (short)10);
    org.junit.Assert.assertNotNull(shortArray68);
    org.junit.Assert.assertTrue("'" + boolean69 + "' != '"+ false+ "'",boolean69 == false);
    org.junit.Assert.assertNotNull(shortArray72);
    org.junit.Assert.assertTrue("'" + short73 + "' != '"+ (short)10+ "'",short73 == (short)10);
    org.junit.Assert.assertNotNull(shortArray76);
    org.junit.Assert.assertTrue("'" + boolean77 + "' != '"+ false+ "'",boolean77 == false);
    org.junit.Assert.assertTrue("'" + short78 + "' != '"+ (short)-1+ "'",short78 == (short)-1);
    org.junit.Assert.assertTrue("'" + short79 + "' != '"+ (short)10+ "'",short79 == (short)10);
    org.junit.Assert.assertTrue("'" + boolean80 + "' != '"+ true+ "'",boolean80 == true);
    org.junit.Assert.assertTrue("'" + boolean81 + "' != '"+ true+ "'",boolean81 == true);
    org.junit.Assert.assertTrue("'" + short82 + "' != '"+ (short)10+ "'",short82 == (short)10);
    org.junit.Assert.assertNotNull(shortArray88);
    org.junit.Assert.assertTrue("'" + short89 + "' != '"+ (short)100+ "'",short89 == (short)100);
    org.junit.Assert.assertTrue("'" + short90 + "' != '"+ (short)-1+ "'",short90 == (short)-1);
    org.junit.Assert.assertTrue("'" + boolean91 + "' != '"+ false+ "'",boolean91 == false);
  }
  @Test public void test319() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test319#3329");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test319");
    java.lang.String str3=org.apache.commons.lang.StringUtils.replaceChars("Aa ",'a','4');
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "A4 "+ "'",str3.equals("A4 "));
  }
  @Test public void test320() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test320#3337");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test320");
    java.lang.String str3=org.apache.commons.lang.StringUtils.center("",(int)(byte)1,"                                            !i aaaaaaaaa                                            ");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ " "+ "'",str3.equals(" "));
  }
  @Test public void test321() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test321#3345");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test321");
    int int2=org.apache.commons.lang.StringUtils.lastIndexOf("Aaaaaaaaaaaaaaaaaaaa##Aaaaaaaahi!aaaaaaaaaaaaaaaaaaaa##Aaaaaaaa",'4');
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test322() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test322#3353");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test322");
    boolean boolean1=org.apache.commons.lang.StringUtils.isWhitespace("                                                                                                                  HI!");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test323() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test323#3361");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test323");
    int int3=org.apache.commons.lang.StringUtils.indexOf("                                                                                                 ##a",'4',100);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test324() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test324#3369");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test324");
    java.lang.String str3=org.apache.commons.lang.StringUtils.replaceChars("                     ","a                                                hi!                                                 ","HHHHHHHHHH");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "HHHHHHHHHHHHHHHHHHHHH"+ "'",str3.equals("HHHHHHHHHHHHHHHHHHHHH"));
  }
  @Test public void test325() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test325#3377");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test325");
    boolean boolean2=org.apache.commons.lang.StringUtils.containsNone("                                                                                   aaaaaaaaa ","!i aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test326() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test326#3385");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test326");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringAfter("#############################aaaaaaaaaaaaaaaaaaaa##Aaaaaaaa#############################################################aaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa"," 4            ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test327() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test327#3393");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test327");
    java.lang.String str1=org.apache.commons.lang.StringUtils.deleteWhitespace("A         A         A         A         A         A         A         A         A         A       i!    ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "AAAAAAAAAAi!"+ "'",str1.equals("AAAAAAAAAAi!"));
  }
  @Test public void test328() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test328#3401");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test328");
    float float3=org.apache.commons.lang.math.NumberUtils.min((float)9L,31.0f,(float)87);
    org.junit.Assert.assertTrue("'" + float3 + "' != '"+ 9.0f+ "'",float3 == 9.0f);
  }
  @Test public void test329() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test329#3409");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test329");
    byte[] byteArray3=new byte[]{(byte)100,(byte)0,(byte)100};
    byte[] byteArray6=new byte[]{(byte)-1,(byte)-1};
    boolean boolean7=org.apache.commons.lang.math.NumberUtils.equals(byteArray3,byteArray6);
    byte byte8=org.apache.commons.lang.math.NumberUtils.max(byteArray3);
    byte byte9=org.apache.commons.lang.math.NumberUtils.max(byteArray3);
    org.junit.Assert.assertNotNull(byteArray3);
    org.junit.Assert.assertNotNull(byteArray6);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '"+ false+ "'",boolean7 == false);
    org.junit.Assert.assertTrue("'" + byte8 + "' != '"+ (byte)100+ "'",byte8 == (byte)100);
    org.junit.Assert.assertTrue("'" + byte9 + "' != '"+ (byte)100+ "'",byte9 == (byte)100);
  }
  @Test public void test330() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test330#3425");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test330");
    java.lang.String str2=org.apache.commons.lang.StringUtils.removeEnd("###                     aaaaaaaaai!   ","                                                                                       Aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "###                     aaaaaaaaai!   "+ "'",str2.equals("###                     aaaaaaaaai!   "));
  }
  @Test public void test331() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test331#3433");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test331");
    java.lang.String str3=org.apache.commons.lang.StringUtils.rightPad("aaaaaaaaai!",14,"");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "aaaaaaaaai!   "+ "'",str3.equals("aaaaaaaaai!   "));
  }
  @Test public void test332() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test332#3441");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test332");
    boolean boolean2=org.apache.commons.lang.StringUtils.contains("AAAAAAAAAAAAAAAAAAAA  aAAAAAAAA                                       HI!",'#');
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test333() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test333#3449");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test333");
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
    byte byte41=org.apache.commons.lang.math.NumberUtils.max(byteArray7);
    byte byte42=org.apache.commons.lang.math.NumberUtils.max(byteArray7);
    byte byte43=org.apache.commons.lang.math.NumberUtils.max(byteArray7);
    byte[] byteArray44=null;
    byte[] byteArray48=new byte[]{(byte)100,(byte)0,(byte)100};
    byte[] byteArray51=new byte[]{(byte)-1,(byte)-1};
    boolean boolean52=org.apache.commons.lang.math.NumberUtils.equals(byteArray48,byteArray51);
    boolean boolean53=org.apache.commons.lang.math.NumberUtils.equals(byteArray44,byteArray51);
    byte[] byteArray57=new byte[]{(byte)100,(byte)0,(byte)100};
    byte[] byteArray60=new byte[]{(byte)-1,(byte)-1};
    boolean boolean61=org.apache.commons.lang.math.NumberUtils.equals(byteArray57,byteArray60);
    byte byte62=org.apache.commons.lang.math.NumberUtils.min(byteArray60);
    boolean boolean63=org.apache.commons.lang.math.NumberUtils.equals(byteArray51,byteArray60);
    byte[] byteArray64=null;
    byte[] byteArray68=new byte[]{(byte)100,(byte)0,(byte)100};
    byte[] byteArray71=new byte[]{(byte)-1,(byte)-1};
    boolean boolean72=org.apache.commons.lang.math.NumberUtils.equals(byteArray68,byteArray71);
    boolean boolean73=org.apache.commons.lang.math.NumberUtils.equals(byteArray64,byteArray71);
    byte[] byteArray77=new byte[]{(byte)100,(byte)0,(byte)100};
    byte[] byteArray80=new byte[]{(byte)-1,(byte)-1};
    boolean boolean81=org.apache.commons.lang.math.NumberUtils.equals(byteArray77,byteArray80);
    byte byte82=org.apache.commons.lang.math.NumberUtils.min(byteArray80);
    boolean boolean83=org.apache.commons.lang.math.NumberUtils.equals(byteArray71,byteArray80);
    boolean boolean84=org.apache.commons.lang.math.NumberUtils.equals(byteArray51,byteArray71);
    byte byte85=org.apache.commons.lang.math.NumberUtils.max(byteArray51);
    byte byte86=org.apache.commons.lang.math.NumberUtils.max(byteArray51);
    byte byte87=org.apache.commons.lang.math.NumberUtils.min(byteArray51);
    byte byte88=org.apache.commons.lang.math.NumberUtils.min(byteArray51);
    boolean boolean89=org.apache.commons.lang.math.NumberUtils.equals(byteArray7,byteArray51);
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
    org.junit.Assert.assertTrue("'" + byte41 + "' != '"+ (byte)-1+ "'",byte41 == (byte)-1);
    org.junit.Assert.assertTrue("'" + byte42 + "' != '"+ (byte)-1+ "'",byte42 == (byte)-1);
    org.junit.Assert.assertTrue("'" + byte43 + "' != '"+ (byte)-1+ "'",byte43 == (byte)-1);
    org.junit.Assert.assertNotNull(byteArray48);
    org.junit.Assert.assertNotNull(byteArray51);
    org.junit.Assert.assertTrue("'" + boolean52 + "' != '"+ false+ "'",boolean52 == false);
    org.junit.Assert.assertTrue("'" + boolean53 + "' != '"+ false+ "'",boolean53 == false);
    org.junit.Assert.assertNotNull(byteArray57);
    org.junit.Assert.assertNotNull(byteArray60);
    org.junit.Assert.assertTrue("'" + boolean61 + "' != '"+ false+ "'",boolean61 == false);
    org.junit.Assert.assertTrue("'" + byte62 + "' != '"+ (byte)-1+ "'",byte62 == (byte)-1);
    org.junit.Assert.assertTrue("'" + boolean63 + "' != '"+ true+ "'",boolean63 == true);
    org.junit.Assert.assertNotNull(byteArray68);
    org.junit.Assert.assertNotNull(byteArray71);
    org.junit.Assert.assertTrue("'" + boolean72 + "' != '"+ false+ "'",boolean72 == false);
    org.junit.Assert.assertTrue("'" + boolean73 + "' != '"+ false+ "'",boolean73 == false);
    org.junit.Assert.assertNotNull(byteArray77);
    org.junit.Assert.assertNotNull(byteArray80);
    org.junit.Assert.assertTrue("'" + boolean81 + "' != '"+ false+ "'",boolean81 == false);
    org.junit.Assert.assertTrue("'" + byte82 + "' != '"+ (byte)-1+ "'",byte82 == (byte)-1);
    org.junit.Assert.assertTrue("'" + boolean83 + "' != '"+ true+ "'",boolean83 == true);
    org.junit.Assert.assertTrue("'" + boolean84 + "' != '"+ true+ "'",boolean84 == true);
    org.junit.Assert.assertTrue("'" + byte85 + "' != '"+ (byte)-1+ "'",byte85 == (byte)-1);
    org.junit.Assert.assertTrue("'" + byte86 + "' != '"+ (byte)-1+ "'",byte86 == (byte)-1);
    org.junit.Assert.assertTrue("'" + byte87 + "' != '"+ (byte)-1+ "'",byte87 == (byte)-1);
    org.junit.Assert.assertTrue("'" + byte88 + "' != '"+ (byte)-1+ "'",byte88 == (byte)-1);
    org.junit.Assert.assertTrue("'" + boolean89 + "' != '"+ true+ "'",boolean89 == true);
  }
  @Test public void test334() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test334#3551");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test334");
    int int3=org.apache.commons.lang.math.NumberUtils.min((int)(byte)-1,82,4);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test335() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test335#3559");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test335");
    java.lang.String str3=org.apache.commons.lang.StringUtils.center("##A##A#!ih",0,"        aa        aa        aa        aA!ih");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "##A##A#!ih"+ "'",str3.equals("##A##A#!ih"));
  }
  @Test public void test336() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test336#3567");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test336");
    java.lang.String str2=org.apache.commons.lang.StringUtils.getChomp("a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a","Aa hi!Aa hi!Aa hi!Aa hi!Aa hi!Aa hi!AAAAAAAAAA ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test337() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test337#3575");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test337");
    boolean boolean2=org.apache.commons.lang.StringUtils.contains("                                                                                       Aaaaaaaaa ","                                                                                   aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test338() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test338#3583");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test338");
    java.lang.String str3=org.apache.commons.lang.StringUtils.mid("aaaaaaaaa ",0,(int)(byte)-1);
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ ""+ "'",str3.equals(""));
  }
  @Test public void test339() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test339#3591");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test339");
    java.lang.String str3=org.apache.commons.lang.StringUtils.mid("                                                 !ih                                                ",24,(int)(byte)1);
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ " "+ "'",str3.equals(" "));
  }
  @Test public void test340() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test340#3599");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test340");
    try {
      java.lang.Number number1=org.apache.commons.lang.math.NumberUtils.createNumber("             ");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: A blank string is not a valid number");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test341() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test341#3610");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test341");
    int[] intArray2=new int[]{100,1};
    int[] intArray9=new int[]{(byte)-1,100,(short)0,100,'#',100};
    boolean boolean10=org.apache.commons.lang.math.NumberUtils.equals(intArray2,intArray9);
    int[] intArray17=new int[]{'4',(short)100,(short)100,52,(byte)1,(short)100};
    boolean boolean18=org.apache.commons.lang.math.NumberUtils.equals(intArray9,intArray17);
    int int19=org.apache.commons.lang.math.NumberUtils.min(intArray9);
    org.junit.Assert.assertNotNull(intArray2);
    org.junit.Assert.assertNotNull(intArray9);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '"+ false+ "'",boolean10 == false);
    org.junit.Assert.assertNotNull(intArray17);
    org.junit.Assert.assertTrue("'" + boolean18 + "' != '"+ false+ "'",boolean18 == false);
    org.junit.Assert.assertTrue("'" + int19 + "' != '"+ (-1)+ "'",int19 == (-1));
  }
  @Test public void test342() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test342#3628");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test342");
    java.lang.String str1=org.apache.commons.lang.StringUtils.strip("44444444444444444444444         ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "44444444444444444444444"+ "'",str1.equals("44444444444444444444444"));
  }
  @Test public void test343() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test343#3636");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test343");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringBeforeLast("","                                                                                                 ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test344() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test344#3644");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test344");
    java.lang.String str2=org.apache.commons.lang.StringUtils.center("",65);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                                                                 "+ "'",str2.equals("                                                                 "));
  }
  @Test public void test345() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test345#3652");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test345");
    char[] charArray4=new char[]{'4','a'};
    int int5=org.apache.commons.lang.StringUtils.indexOfAnyBut("A",charArray4);
    int int6=org.apache.commons.lang.StringUtils.indexOfAny("4444444hI AAAAAAAAA                                                                                        ",charArray4);
    org.junit.Assert.assertNotNull(charArray4);
    org.junit.Assert.assertTrue("'" + int5 + "' != '"+ 0+ "'",int5 == 0);
    org.junit.Assert.assertTrue("'" + int6 + "' != '"+ 0+ "'",int6 == 0);
  }
  @Test public void test346() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test346#3664");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test346");
    java.lang.String str2=org.apache.commons.lang.StringUtils.getPrechomp("","i");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test347() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test347#3672");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test347");
    boolean boolean1=org.apache.commons.lang.math.NumberUtils.isNumber("                         HI!");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test348() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test348#3680");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test348");
    java.lang.String str2=org.apache.commons.lang.StringUtils.chompLast("44444444444444444444444444444                                                HI!","Hi!                                   A");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "44444444444444444444444444444                                                HI!"+ "'",str2.equals("44444444444444444444444444444                                                HI!"));
  }
  @Test public void test349() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test349#3688");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test349");
    java.lang.String str2=org.apache.commons.lang.StringUtils.left("##########################################                         i!                         ",24);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "########################"+ "'",str2.equals("########################"));
  }
  @Test public void test350() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test350#3696");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test350");
    java.lang.String str1=org.apache.commons.lang.StringUtils.capitaliseAllWords("44444444444444444444444         AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaa");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "44444444444444444444444         AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaa"+ "'",str1.equals("44444444444444444444444         AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaa"));
  }
  @Test public void test351() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test351#3704");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test351");
    int int3=org.apache.commons.lang.math.NumberUtils.min(47,31,52);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ 31+ "'",int3 == 31);
  }
  @Test public void test352() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test352#3712");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test352");
    float[] floatArray0=null;
    try {
      float float1=org.apache.commons.lang.math.NumberUtils.max(floatArray0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
    }
 catch (    java.lang.IllegalArgumentException e) {
    }
  }
  @Test public void test353() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test353#3724");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test353");
    int int3=org.apache.commons.lang.StringUtils.lastIndexOf("             A               ",'a',0);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test354() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test354#3732");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test354");
    boolean boolean2=org.apache.commons.lang.StringUtils.containsNone("... !IH...                      aAAAAAAAAaAAAAAAAAaAAAAAAAAaA... !IH...                       ","AaaaaaaaaaaaaaaaaaaaAaaaaaaaa");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test355() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test355#3740");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test355");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAlpha("aa");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test356() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test356#3748");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test356");
    boolean boolean2=org.apache.commons.lang.StringUtils.containsNone("44444444444444444444444444444                                                HI!","               ...                          ...");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test357() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test357#3756");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test357");
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
    double double18=org.apache.commons.lang.math.NumberUtils.min(doubleArray4);
    double[] doubleArray20=new double[]{24};
    double double21=org.apache.commons.lang.math.NumberUtils.min(doubleArray20);
    boolean boolean22=org.apache.commons.lang.math.NumberUtils.equals(doubleArray4,doubleArray20);
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
    org.junit.Assert.assertTrue("'" + double18 + "' != '"+ (-1.0d)+ "'",double18 == (-1.0d));
    org.junit.Assert.assertNotNull(doubleArray20);
    org.junit.Assert.assertTrue("'" + double21 + "' != '"+ 24.0d+ "'",double21 == 24.0d);
    org.junit.Assert.assertTrue("'" + boolean22 + "' != '"+ false+ "'",boolean22 == false);
  }
  @Test public void test358() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test358#3790");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test358");
    java.util.Collection collection0=null;
    java.lang.String str2=org.apache.commons.lang.StringUtils.join(collection0,"                             Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!");
    org.junit.Assert.assertNull(str2);
  }
  @Test public void test359() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test359#3799");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test359");
    int int2=org.apache.commons.lang.math.NumberUtils.compare(7.0f,0.0f);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 1+ "'",int2 == 1);
  }
  @Test public void test360() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test360#3807");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test360");
    boolean boolean1=org.apache.commons.lang.StringUtils.isNumeric("44444444444444444444444         AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaa");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test361() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test361#3815");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test361");
    int[] intArray2=new int[]{100,1};
    int[] intArray9=new int[]{(byte)-1,100,(short)0,100,'#',100};
    boolean boolean10=org.apache.commons.lang.math.NumberUtils.equals(intArray2,intArray9);
    int int11=org.apache.commons.lang.math.NumberUtils.max(intArray9);
    int[] intArray14=new int[]{100,1};
    int[] intArray21=new int[]{(byte)-1,100,(short)0,100,'#',100};
    boolean boolean22=org.apache.commons.lang.math.NumberUtils.equals(intArray14,intArray21);
    int[] intArray29=new int[]{'4',(short)100,(short)100,52,(byte)1,(short)100};
    boolean boolean30=org.apache.commons.lang.math.NumberUtils.equals(intArray21,intArray29);
    int[] intArray36=new int[]{0,10,(short)-1,(byte)-1,94};
    boolean boolean37=org.apache.commons.lang.math.NumberUtils.equals(intArray29,intArray36);
    int int38=org.apache.commons.lang.math.NumberUtils.min(intArray29);
    int int39=org.apache.commons.lang.math.NumberUtils.max(intArray29);
    boolean boolean40=org.apache.commons.lang.math.NumberUtils.equals(intArray9,intArray29);
    int int41=org.apache.commons.lang.math.NumberUtils.max(intArray9);
    org.junit.Assert.assertNotNull(intArray2);
    org.junit.Assert.assertNotNull(intArray9);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '"+ false+ "'",boolean10 == false);
    org.junit.Assert.assertTrue("'" + int11 + "' != '"+ 100+ "'",int11 == 100);
    org.junit.Assert.assertNotNull(intArray14);
    org.junit.Assert.assertNotNull(intArray21);
    org.junit.Assert.assertTrue("'" + boolean22 + "' != '"+ false+ "'",boolean22 == false);
    org.junit.Assert.assertNotNull(intArray29);
    org.junit.Assert.assertTrue("'" + boolean30 + "' != '"+ false+ "'",boolean30 == false);
    org.junit.Assert.assertNotNull(intArray36);
    org.junit.Assert.assertTrue("'" + boolean37 + "' != '"+ false+ "'",boolean37 == false);
    org.junit.Assert.assertTrue("'" + int38 + "' != '"+ 1+ "'",int38 == 1);
    org.junit.Assert.assertTrue("'" + int39 + "' != '"+ 100+ "'",int39 == 100);
    org.junit.Assert.assertTrue("'" + boolean40 + "' != '"+ false+ "'",boolean40 == false);
    org.junit.Assert.assertTrue("'" + int41 + "' != '"+ 100+ "'",int41 == 100);
  }
  @Test public void test362() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test362#3851");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test362");
    java.lang.String str2=org.apache.commons.lang.StringUtils.difference("#############################################################################","...                    ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "...                    "+ "'",str2.equals("...                    "));
  }
  @Test public void test363() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test363#3859");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test363");
    long long3=org.apache.commons.lang.math.NumberUtils.min((long)4,(long)4,0L);
    org.junit.Assert.assertTrue("'" + long3 + "' != '"+ 0L+ "'",long3 == 0L);
  }
  @Test public void test364() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test364#3867");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test364");
    java.lang.String str1=org.apache.commons.lang.StringUtils.uncapitalise("                        AAAAAAAAAAAAAAAAAAAA                                                        i!");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "                        AAAAAAAAAAAAAAAAAAAA                                                        i!"+ "'",str1.equals("                        AAAAAAAAAAAAAAAAAAAA                                                        i!"));
  }
  @Test public void test365() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test365#3875");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test365");
    java.lang.String str3=org.apache.commons.lang.StringUtils.center("!iaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA",2,"AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAI!");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "!iaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA"+ "'",str3.equals("!iaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA"));
  }
  @Test public void test366() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test366#3883");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test366");
    int int3=org.apache.commons.lang.StringUtils.indexOf("aaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa A",' ',100);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test367() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test367#3891");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test367");
    boolean boolean1=org.apache.commons.lang.StringUtils.isBlank("                                                    ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test368() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test368#3899");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test368");
    java.lang.String str1=org.apache.commons.lang.StringUtils.trim("##Aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "##Aaaaaaaaa"+ "'",str1.equals("##Aaaaaaaaa"));
  }
  @Test public void test369() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test369#3907");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test369");
    java.lang.String str1=org.apache.commons.lang.StringUtils.stripToEmpty("44444444444444444444444444444444444444444444444444444444444444444444");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "44444444444444444444444444444444444444444444444444444444444444444444"+ "'",str1.equals("44444444444444444444444444444444444444444444444444444444444444444444"));
  }
  @Test public void test370() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test370#3915");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test370");
    java.lang.String str1=org.apache.commons.lang.StringUtils.trim("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"+ "'",str1.equals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
  }
  @Test public void test371() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test371#3923");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test371");
    int int3=org.apache.commons.lang.StringUtils.indexOf("aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa",' ',891);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ 895+ "'",int3 == 895);
  }
  @Test public void test372() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test372#3931");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test372");
    java.lang.String str3=org.apache.commons.lang.StringUtils.rightPad("!iaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA",(int)(short)10,"AAAAAAAAA");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "!iaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA"+ "'",str3.equals("!iaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA"));
  }
  @Test public void test373() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test373#3939");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test373");
    boolean boolean1=org.apache.commons.lang.StringUtils.isNotBlank("44444444444444444444444444444                                                HI!");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test374() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test374#3947");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test374");
    java.lang.String str2=org.apache.commons.lang.StringUtils.reverseDelimitedString("4444444444444444444444444444444444                            ...","                                                                                aaaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "...                                                                                aaaaaaaaaa4444444444444444444444444444444444"+ "'",str2.equals("...                                                                                aaaaaaaaaa4444444444444444444444444444444444"));
  }
  @Test public void test375() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test375#3955");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test375");
    try {
      java.math.BigInteger bigInteger1=org.apache.commons.lang.math.NumberUtils.createBigInteger("...aaaa");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"...aaaa\"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test376() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test376#3966");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test376");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAsciiPrintable("aaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test377() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test377#3974");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test377");
    try {
      java.lang.String str2=org.apache.commons.lang.StringUtils.chompLast("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh","AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaai");
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -59");
    }
 catch (    java.lang.StringIndexOutOfBoundsException e) {
    }
  }
  @Test public void test378() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test378#3985");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test378");
    int int2=org.apache.commons.lang.StringUtils.lastIndexOf("Aaaaaaaaa                          ",'a');
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 8+ "'",int2 == 8);
  }
  @Test public void test379() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test379#3993");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test379");
    java.lang.String str3=org.apache.commons.lang.StringUtils.center("... !IH...                      aAAAAAAAAaAAAAAAAAaAAAAAAAAaA... !IH...                       ",(int)(short)-1,"");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "... !IH...                      aAAAAAAAAaAAAAAAAAaAAAAAAAAaA... !IH...                       "+ "'",str3.equals("... !IH...                      aAAAAAAAAaAAAAAAAAaAAAAAAAAaA... !IH...                       "));
  }
  @Test public void test380() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test380#4001");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test380");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.splitPreserveAllTokens("..!ih..",'4');
    org.junit.Assert.assertNotNull(strArray2);
  }
  @Test public void test381() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test381#4009");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test381");
    java.lang.String str2=org.apache.commons.lang.StringUtils.getNestedString("AAAAAAAAAAi!","                                                                                                ");
    org.junit.Assert.assertNull(str2);
  }
  @Test public void test382() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test382#4017");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test382");
    int int2=org.apache.commons.lang.StringUtils.indexOf("",'4');
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test383() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test383#4025");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test383");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAlphaSpace("");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test384() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test384#4033");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test384");
    java.lang.String str1=org.apache.commons.lang.StringUtils.deleteWhitespace("aaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "aaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaa"+ "'",str1.equals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
  }
  @Test public void test385() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test385#4041");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test385");
    java.lang.String[] strArray1=null;
    int int2=org.apache.commons.lang.StringUtils.indexOfAny("                     4444444Hi!                     ",strArray1);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test386() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test386#4050");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test386");
    java.lang.String str2=org.apache.commons.lang.StringUtils.chompLast("AAAAAAAAAAAAAAAAAAAA##AAAAAAAAHI!AAAAAAAAAAAAAAAAAAAA##AAAAAAAA","aaaaaaai!");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "AAAAAAAAAAAAAAAAAAAA##AAAAAAAAHI!AAAAAAAAAAAAAAAAAAAA##AAAAAAAA"+ "'",str2.equals("AAAAAAAAAAAAAAAAAAAA##AAAAAAAAHI!AAAAAAAAAAAAAAAAAAAA##AAAAAAAA"));
  }
  @Test public void test387() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test387#4058");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test387");
    java.lang.String str2=org.apache.commons.lang.StringUtils.getChomp("aaaaaaaaaaaaaaaaaaaa##Aaaaaaaaa","4444444444444444444444444444444444444444444444444444444444Hi!###################################A4444444444444444444444444444444444444444444444444444444444");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test388() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test388#4066");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test388");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringAfter("...                          ...","");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "...                          ..."+ "'",str2.equals("...                          ..."));
  }
  @Test public void test389() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test389#4074");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test389");
    boolean boolean2=org.apache.commons.lang.StringUtils.contains("aaaaaaaaa ","... !ih...                      AaaaaaaaaAaaaaaaaaAaaaaaaaaAa... !ih...                       ");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test390() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test390#4082");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test390");
    boolean boolean1=org.apache.commons.lang.StringUtils.isNumeric("aaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test391() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test391#4090");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test391");
    int int2=org.apache.commons.lang.StringUtils.lastIndexOf("a                                                HI!                                                 ",'a');
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 0+ "'",int2 == 0);
  }
  @Test public void test392() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test392#4098");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test392");
    java.lang.String str2=org.apache.commons.lang.StringUtils.getPrechomp("###                                                                                       aaaaaaaaa         ","a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test393() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test393#4106");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test393");
    int[] intArray2=new int[]{100,1};
    int[] intArray9=new int[]{(byte)-1,100,(short)0,100,'#',100};
    boolean boolean10=org.apache.commons.lang.math.NumberUtils.equals(intArray2,intArray9);
    int[] intArray17=new int[]{'4',(short)100,(short)100,52,(byte)1,(short)100};
    boolean boolean18=org.apache.commons.lang.math.NumberUtils.equals(intArray9,intArray17);
    int int19=org.apache.commons.lang.math.NumberUtils.max(intArray17);
    int int20=org.apache.commons.lang.math.NumberUtils.max(intArray17);
    int int21=org.apache.commons.lang.math.NumberUtils.min(intArray17);
    int int22=org.apache.commons.lang.math.NumberUtils.max(intArray17);
    org.junit.Assert.assertNotNull(intArray2);
    org.junit.Assert.assertNotNull(intArray9);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '"+ false+ "'",boolean10 == false);
    org.junit.Assert.assertNotNull(intArray17);
    org.junit.Assert.assertTrue("'" + boolean18 + "' != '"+ false+ "'",boolean18 == false);
    org.junit.Assert.assertTrue("'" + int19 + "' != '"+ 100+ "'",int19 == 100);
    org.junit.Assert.assertTrue("'" + int20 + "' != '"+ 100+ "'",int20 == 100);
    org.junit.Assert.assertTrue("'" + int21 + "' != '"+ 1+ "'",int21 == 1);
    org.junit.Assert.assertTrue("'" + int22 + "' != '"+ 100+ "'",int22 == 100);
  }
  @Test public void test394() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test394#4130");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test394");
    java.lang.String str2=org.apache.commons.lang.StringUtils.repeat(" a hia a hia a hia a hia a hia a hia           ",100);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ " a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia           "+ "'",str2.equals(" a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia           "));
  }
  @Test public void test395() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test395#4138");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test395");
    java.lang.String str1=org.apache.commons.lang.StringUtils.deleteWhitespace("4444444Hi!");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "4444444Hi!"+ "'",str1.equals("4444444Hi!"));
  }
  @Test public void test396() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test396#4146");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test396");
    int int2=org.apache.commons.lang.StringUtils.indexOfAnyBut("44444444444444444444444444444                                                HI!","###                                                                                       aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 0+ "'",int2 == 0);
  }
  @Test public void test397() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test397#4154");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test397");
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
    float float25=org.apache.commons.lang.math.NumberUtils.max(floatArray20);
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
    org.junit.Assert.assertTrue("'" + float25 + "' != '"+ 1.0f+ "'",float25 == 1.0f);
  }
  @Test public void test398() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test398#4184");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test398");
    java.lang.String[] strArray3=org.apache.commons.lang.StringUtils.split("","hi!",(int)(byte)100);
    java.lang.String[] strArray4=org.apache.commons.lang.StringUtils.stripAll(strArray3);
    java.lang.String[] strArray5=org.apache.commons.lang.StringUtils.stripAll(strArray3);
    java.lang.String str9=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray3,"                             aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaa",4,2);
    org.junit.Assert.assertNotNull(strArray3);
    org.junit.Assert.assertNotNull(strArray4);
    org.junit.Assert.assertNotNull(strArray5);
    org.junit.Assert.assertTrue("'" + str9 + "' != '"+ ""+ "'",str9.equals(""));
  }
  @Test public void test399() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test399#4198");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test399");
    java.lang.String str2=org.apache.commons.lang.StringUtils.chompLast("                                              hi","aA HI!");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                                              hi"+ "'",str2.equals("                                              hi"));
  }
  @Test public void test400() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test400#4206");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test400");
    java.lang.String str3=org.apache.commons.lang.StringUtils.leftPad("AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaa",94,'#');
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "#####AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaa"+ "'",str3.equals("#####AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaa"));
  }
  @Test public void test401() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test401#4214");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test401");
    boolean boolean2=org.apache.commons.lang.StringUtils.containsNone("#######################################################################################","AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ true+ "'",boolean2 == true);
  }
  @Test public void test402() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test402#4222");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test402");
    int int2=org.apache.commons.lang.StringUtils.countMatches("aaaaaaaaa","#################################### aaaaa");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 0+ "'",int2 == 0);
  }
  @Test public void test403() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test403#4230");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test403");
    boolean boolean1=org.apache.commons.lang.StringUtils.isNotEmpty("AAAAAAAAAAAAAAAAAAAA                                                        i!");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test404() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test404#4238");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test404");
    java.lang.String str2=org.apache.commons.lang.StringUtils.center("                                           ",54);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                                                      "+ "'",str2.equals("                                                      "));
  }
  @Test public void test405() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test405#4246");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test405");
    short short3=org.apache.commons.lang.math.NumberUtils.max((short)(byte)0,(short)(byte)-1,(short)0);
    org.junit.Assert.assertTrue("'" + short3 + "' != '"+ (short)0+ "'",short3 == (short)0);
  }
  @Test public void test406() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test406#4254");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test406");
    boolean boolean1=org.apache.commons.lang.StringUtils.isBlank("                        AAAAAAAAAAAAAAAAAAAA                                                        ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test407() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test407#4262");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test407");
    java.lang.String str2=org.apache.commons.lang.StringUtils.repeat("                                                                                                ",7);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                "+ "'",str2.equals("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                "));
  }
  @Test public void test408() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test408#4270");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test408");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringAfter("aaaaaaaaa                                        ","                                                                                              !iH");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test409() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test409#4278");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test409");
    java.util.Iterator iterator0=null;
    java.lang.String str2=org.apache.commons.lang.StringUtils.join(iterator0,"Aaaaaaaaaaaaaaaaaaaa##Aaaaaaaaa");
    org.junit.Assert.assertNull(str2);
  }
  @Test public void test410() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test410#4287");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test410");
    java.lang.String str2=org.apache.commons.lang.StringUtils.remove("   #######################################################################################aaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa","");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "   #######################################################################################aaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa"+ "'",str2.equals("   #######################################################################################aaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa"));
  }
  @Test public void test411() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test411#4295");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test411");
    char[] charArray4=new char[]{};
    int int5=org.apache.commons.lang.StringUtils.indexOfAnyBut("",charArray4);
    int int6=org.apache.commons.lang.StringUtils.indexOfAnyBut("",charArray4);
    int int7=org.apache.commons.lang.StringUtils.indexOfAny("                                                                                       aaaaaaaaa ",charArray4);
    boolean boolean8=org.apache.commons.lang.StringUtils.containsOnly("!iaaaaaaaaa",charArray4);
    org.junit.Assert.assertNotNull(charArray4);
    org.junit.Assert.assertTrue("'" + int5 + "' != '"+ (-1)+ "'",int5 == (-1));
    org.junit.Assert.assertTrue("'" + int6 + "' != '"+ (-1)+ "'",int6 == (-1));
    org.junit.Assert.assertTrue("'" + int7 + "' != '"+ (-1)+ "'",int7 == (-1));
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '"+ false+ "'",boolean8 == false);
  }
  @Test public void test412() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test412#4311");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test412");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAlphanumericSpace("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test413() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test413#4319");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test413");
    java.lang.String[] strArray1=org.apache.commons.lang.StringUtils.split("          ");
    java.lang.String[] strArray3=org.apache.commons.lang.StringUtils.stripAll(strArray1,"#################...");
    java.lang.String str4=org.apache.commons.lang.StringUtils.concatenate((java.lang.Object[])strArray3);
    java.lang.Class<?> wildcardClass5=strArray3.getClass();
    org.junit.Assert.assertNotNull(strArray1);
    org.junit.Assert.assertNotNull(strArray3);
    org.junit.Assert.assertTrue("'" + str4 + "' != '"+ ""+ "'",str4.equals(""));
    org.junit.Assert.assertNotNull(wildcardClass5);
  }
  @Test public void test414() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test414#4333");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test414");
    java.lang.String str3=org.apache.commons.lang.StringUtils.substringBetween("                                        ","AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaai!","aaAaaaaaaaa");
    org.junit.Assert.assertNull(str3);
  }
  @Test public void test415() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test415#4341");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test415");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.splitPreserveAllTokens("... !ih...aaaaaaaaaaaaaaaaaaaa                                ",'4');
    org.junit.Assert.assertNotNull(strArray2);
  }
  @Test public void test416() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test416#4349");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test416");
    java.lang.String str2=org.apache.commons.lang.StringUtils.strip("#           HI!            ","AAAAAAAAAAi!");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "#           HI!            "+ "'",str2.equals("#           HI!            "));
  }
  @Test public void test417() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test417#4357");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test417");
    java.lang.String str2=org.apache.commons.lang.StringUtils.strip("   A ","                         i!                         ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "A"+ "'",str2.equals("A"));
  }
  @Test public void test418() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test418#4365");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test418");
    java.lang.String str2=org.apache.commons.lang.StringUtils.leftPad("aaaaaaaaaaaaaaaaaaaa                                ",80);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                            aaaaaaaaaaaaaaaaaaaa                                "+ "'",str2.equals("                            aaaaaaaaaaaaaaaaaaaa                                "));
  }
  @Test public void test419() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test419#4373");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test419");
    java.lang.String str2=org.apache.commons.lang.StringUtils.stripStart("                                                                                                                  HI!","  4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "HI!"+ "'",str2.equals("HI!"));
  }
  @Test public void test420() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test420#4381");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test420");
    int int2=org.apache.commons.lang.StringUtils.indexOf("AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa",'a');
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 1+ "'",int2 == 1);
  }
  @Test public void test421() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test421#4389");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test421");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringBetween("                         hi!","A###################A########");
    org.junit.Assert.assertNull(str2);
  }
  @Test public void test422() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test422#4397");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test422");
    java.lang.String[] strArray3=org.apache.commons.lang.StringUtils.split("                                          a!i ","Aaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa",7);
    java.lang.String[] strArray4=org.apache.commons.lang.StringUtils.stripAll(strArray3);
    org.junit.Assert.assertNotNull(strArray3);
    org.junit.Assert.assertNotNull(strArray4);
  }
  @Test public void test423() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test423#4407");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test423");
    float[] floatArray3=new float[]{(byte)-1,(-1.0f),(byte)100};
    float float4=org.apache.commons.lang.math.NumberUtils.max(floatArray3);
    float float5=org.apache.commons.lang.math.NumberUtils.min(floatArray3);
    float float6=org.apache.commons.lang.math.NumberUtils.max(floatArray3);
    float float7=org.apache.commons.lang.math.NumberUtils.max(floatArray3);
    org.junit.Assert.assertNotNull(floatArray3);
    org.junit.Assert.assertTrue("'" + float4 + "' != '"+ 100.0f+ "'",float4 == 100.0f);
    org.junit.Assert.assertTrue("'" + float5 + "' != '"+ (-1.0f)+ "'",float5 == (-1.0f));
    org.junit.Assert.assertTrue("'" + float6 + "' != '"+ 100.0f+ "'",float6 == 100.0f);
    org.junit.Assert.assertTrue("'" + float7 + "' != '"+ 100.0f+ "'",float7 == 100.0f);
  }
  @Test public void test424() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test424#4423");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test424");
    boolean boolean2=org.apache.commons.lang.StringUtils.equals("###                     aaaaaaaaai!   ","                                                                                              !Ih");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test425() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test425#4431");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test425");
    int int2=org.apache.commons.lang.StringUtils.lastIndexOf("","HHHHHHHHHH");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test426() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test426#4439");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test426");
    float float3=org.apache.commons.lang.math.NumberUtils.max((-1.0f),0.0f,(float)100);
    org.junit.Assert.assertTrue("'" + float3 + "' != '"+ 100.0f+ "'",float3 == 100.0f);
  }
  @Test public void test427() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test427#4447");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test427");
    java.lang.String str2=org.apache.commons.lang.StringUtils.stripEnd("                                                 !ih                                                ","a                                                hi!");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test428() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test428#4455");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test428");
    float float2=org.apache.commons.lang.math.NumberUtils.toFloat("               ...                          ...",0.0f);
    org.junit.Assert.assertTrue("'" + float2 + "' != '"+ 0.0f+ "'",float2 == 0.0f);
  }
  @Test public void test429() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test429#4463");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test429");
    java.lang.String str3=org.apache.commons.lang.StringUtils.replaceChars("aaaaaaaaaaaaaaaaaaaa##Aaaaaaaahi!aaaaaaaaaaaaaaaaaaaa##Aaaaaaaa",'a',' ');
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "                    ##A       hi!                    ##A       "+ "'",str3.equals("                    ##A       hi!                    ##A       "));
  }
  @Test public void test430() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test430#4471");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test430");
    int int2=org.apache.commons.lang.math.NumberUtils.compare(99.0f,(float)41L);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 1+ "'",int2 == 1);
  }
  @Test public void test431() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test431#4479");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test431");
    java.lang.String str2=org.apache.commons.lang.StringUtils.abbreviate("                    ##A       hi!                    ##A       ",(int)(byte)100);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                    ##A       hi!                    ##A       "+ "'",str2.equals("                    ##A       hi!                    ##A       "));
  }
  @Test public void test432() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test432#4487");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test432");
    java.lang.String str4=org.apache.commons.lang.StringUtils.overlayString(" AAAAAAa a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a ","",41,104);
    org.junit.Assert.assertTrue("'" + str4 + "' != '"+ " AAAAAAa a a a a a a a a a a a a a a a a  a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a "+ "'",str4.equals(" AAAAAAa a a a a a a a a a a a a a a a a  a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a "));
  }
  @Test public void test433() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test433#4495");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test433");
    int int3=org.apache.commons.lang.StringUtils.indexOf("aaaaaaaaaa                        ","",895);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ 34+ "'",int3 == 34);
  }
  @Test public void test434() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test434#4503");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test434");
    java.lang.String str1=org.apache.commons.lang.StringUtils.upperCase("H");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "H"+ "'",str1.equals("H"));
  }
  @Test public void test435() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test435#4511");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test435");
    java.lang.String str2=org.apache.commons.lang.StringUtils.stripEnd("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa","AAAAAAAAA ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"+ "'",str2.equals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
  }
  @Test public void test436() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test436#4519");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test436");
    long long2=org.apache.commons.lang.math.NumberUtils.toLong("",(long)34);
    org.junit.Assert.assertTrue("'" + long2 + "' != '"+ 34L+ "'",long2 == 34L);
  }
  @Test public void test437() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test437#4527");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test437");
    java.lang.String[] strArray3=org.apache.commons.lang.StringUtils.splitByWholeSeparator("Hi!"," ");
    java.lang.Class<?> wildcardClass4=strArray3.getClass();
    java.lang.String str5=org.apache.commons.lang.StringUtils.concatenate((java.lang.Object[])strArray3);
    int int6=org.apache.commons.lang.StringUtils.lastIndexOfAny("",strArray3);
    org.junit.Assert.assertNotNull(strArray3);
    org.junit.Assert.assertNotNull(wildcardClass4);
    org.junit.Assert.assertTrue("'" + str5 + "' != '"+ "Hi!"+ "'",str5.equals("Hi!"));
    org.junit.Assert.assertTrue("'" + int6 + "' != '"+ (-1)+ "'",int6 == (-1));
  }
  @Test public void test438() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test438#4541");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test438");
    java.lang.String str1=org.apache.commons.lang.StringUtils.capitaliseAllWords("         A");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "         A"+ "'",str1.equals("         A"));
  }
  @Test public void test439() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test439#4549");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test439");
    java.lang.String str2=org.apache.commons.lang.StringUtils.defaultIfEmpty("... !ih...... !ih....##A##A#!ih","                aaaaaaaaa                  ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "... !ih...... !ih....##A##A#!ih"+ "'",str2.equals("... !ih...... !ih....##A##A#!ih"));
  }
  @Test public void test440() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test440#4557");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test440");
    java.lang.String str2=org.apache.commons.lang.StringUtils.defaultString("                                                ...                          ......                 ","aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                                                ...                          ......                 "+ "'",str2.equals("                                                ...                          ......                 "));
  }
  @Test public void test441() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test441#4565");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test441");
    java.lang.String str2=org.apache.commons.lang.StringUtils.defaultIfEmpty("        aaaaaaaaaaaaaaaaaaaa        ","aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaa");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "        aaaaaaaaaaaaaaaaaaaa        "+ "'",str2.equals("        aaaaaaaaaaaaaaaaaaaa        "));
  }
  @Test public void test442() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test442#4573");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test442");
    int int3=org.apache.commons.lang.math.NumberUtils.min(48,31,890);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ 31+ "'",int3 == 31);
  }
  @Test public void test443() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test443#4581");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test443");
    int int2=org.apache.commons.lang.math.NumberUtils.toInt("... !ih...... !ih....##A##A#!ih",10);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 10+ "'",int2 == 10);
  }
  @Test public void test444() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test444#4589");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test444");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringBeforeLast("444444444444444444444444444                                              hi!          ...","");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "444444444444444444444444444                                              hi!          ..."+ "'",str2.equals("444444444444444444444444444                                              hi!          ..."));
  }
  @Test public void test445() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test445#4597");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test445");
    boolean boolean2=org.apache.commons.lang.StringUtils.containsOnly("Hi!   #######################################################################################             ######       A","                                                                                              !Ih");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test446() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test446#4605");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test446");
    char[] charArray8=new char[]{'4','4','#'};
    boolean boolean9=org.apache.commons.lang.StringUtils.containsNone("aaaaaaaaa",charArray8);
    int int10=org.apache.commons.lang.StringUtils.indexOfAny("aaaaaaaaaaaaaaaaaaaaAaaaaaaaa",charArray8);
    boolean boolean11=org.apache.commons.lang.StringUtils.containsOnly("                                                    ",charArray8);
    boolean boolean12=org.apache.commons.lang.StringUtils.containsOnly("                       AAAAAAAAA",charArray8);
    int int13=org.apache.commons.lang.StringUtils.indexOfAny("Aaaaaaaaa4",charArray8);
    org.junit.Assert.assertNotNull(charArray8);
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '"+ true+ "'",boolean9 == true);
    org.junit.Assert.assertTrue("'" + int10 + "' != '"+ (-1)+ "'",int10 == (-1));
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '"+ false+ "'",boolean11 == false);
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '"+ false+ "'",boolean12 == false);
    org.junit.Assert.assertTrue("'" + int13 + "' != '"+ 9+ "'",int13 == 9);
  }
  @Test public void test447() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test447#4623");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test447");
    try {
      java.lang.Integer int1=org.apache.commons.lang.math.NumberUtils.createInteger("AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaai");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaai\"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test448() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test448#4634");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test448");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substring("        aaaaaaaaaaaaaaaaaaaa        ",20);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "aaaaaaaa        "+ "'",str2.equals("aaaaaaaa        "));
  }
  @Test public void test449() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test449#4642");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test449");
    try {
      java.lang.Double double1=org.apache.commons.lang.math.NumberUtils.createDouble("Aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaa");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"Aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaa\"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test450() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test450#4653");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test450");
    java.lang.String[] strArray3=org.apache.commons.lang.StringUtils.splitByWholeSeparator("                aaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa A                ",".. !ih..                                           ",0);
    org.junit.Assert.assertNotNull(strArray3);
  }
  @Test public void test451() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test451#4661");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test451");
    java.lang.String str3=org.apache.commons.lang.StringUtils.getNestedString("...aaaaaaa","   ","##Aaaaaaaaaaaaaaaaaa");
    org.junit.Assert.assertNull(str3);
  }
  @Test public void test452() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test452#4669");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test452");
    boolean boolean2=org.apache.commons.lang.StringUtils.contains("        aaaaaaaaaa         ",'#');
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test453() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test453#4677");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test453");
    java.lang.String str3=org.apache.commons.lang.StringUtils.rightPad("",37,"                                                                                              !iH");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "                                     "+ "'",str3.equals("                                     "));
  }
  @Test public void test454() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test454#4685");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test454");
    java.lang.String str2=org.apache.commons.lang.StringUtils.stripStart("Aa hi!Aa hi!Aa hi!Aa hi!Aa hi!Aa hi!AAAAAAAAAA ","");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "Aa hi!Aa hi!Aa hi!Aa hi!Aa hi!Aa hi!AAAAAAAAAA "+ "'",str2.equals("Aa hi!Aa hi!Aa hi!Aa hi!Aa hi!Aa hi!AAAAAAAAAA "));
  }
  @Test public void test455() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test455#4693");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test455");
    short[] shortArray0=null;
    short[] shortArray3=new short[]{(byte)10,(byte)-1};
    short short4=org.apache.commons.lang.math.NumberUtils.max(shortArray3);
    short[] shortArray7=new short[]{(byte)1,(byte)1};
    boolean boolean8=org.apache.commons.lang.math.NumberUtils.equals(shortArray3,shortArray7);
    short short9=org.apache.commons.lang.math.NumberUtils.max(shortArray3);
    short short10=org.apache.commons.lang.math.NumberUtils.min(shortArray3);
    short[] shortArray13=new short[]{(byte)10,(byte)-1};
    short short14=org.apache.commons.lang.math.NumberUtils.max(shortArray13);
    short[] shortArray17=new short[]{(byte)1,(byte)1};
    boolean boolean18=org.apache.commons.lang.math.NumberUtils.equals(shortArray13,shortArray17);
    short short19=org.apache.commons.lang.math.NumberUtils.min(shortArray13);
    short[] shortArray22=new short[]{(byte)10,(byte)-1};
    short short23=org.apache.commons.lang.math.NumberUtils.max(shortArray22);
    short[] shortArray26=new short[]{(byte)1,(byte)1};
    boolean boolean27=org.apache.commons.lang.math.NumberUtils.equals(shortArray22,shortArray26);
    short short28=org.apache.commons.lang.math.NumberUtils.max(shortArray22);
    boolean boolean29=org.apache.commons.lang.math.NumberUtils.equals(shortArray13,shortArray22);
    short[] shortArray32=new short[]{(byte)10,(byte)-1};
    short short33=org.apache.commons.lang.math.NumberUtils.max(shortArray32);
    short[] shortArray36=new short[]{(byte)1,(byte)1};
    boolean boolean37=org.apache.commons.lang.math.NumberUtils.equals(shortArray32,shortArray36);
    short short38=org.apache.commons.lang.math.NumberUtils.min(shortArray32);
    boolean boolean39=org.apache.commons.lang.math.NumberUtils.equals(shortArray22,shortArray32);
    short[] shortArray42=new short[]{(byte)10,(byte)-1};
    short short43=org.apache.commons.lang.math.NumberUtils.max(shortArray42);
    short[] shortArray46=new short[]{(byte)1,(byte)1};
    boolean boolean47=org.apache.commons.lang.math.NumberUtils.equals(shortArray42,shortArray46);
    short short48=org.apache.commons.lang.math.NumberUtils.min(shortArray42);
    short short49=org.apache.commons.lang.math.NumberUtils.max(shortArray42);
    short short50=org.apache.commons.lang.math.NumberUtils.min(shortArray42);
    boolean boolean51=org.apache.commons.lang.math.NumberUtils.equals(shortArray22,shortArray42);
    boolean boolean52=org.apache.commons.lang.math.NumberUtils.equals(shortArray3,shortArray42);
    short short53=org.apache.commons.lang.math.NumberUtils.min(shortArray42);
    boolean boolean54=org.apache.commons.lang.math.NumberUtils.equals(shortArray0,shortArray42);
    org.junit.Assert.assertNotNull(shortArray3);
    org.junit.Assert.assertTrue("'" + short4 + "' != '"+ (short)10+ "'",short4 == (short)10);
    org.junit.Assert.assertNotNull(shortArray7);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '"+ false+ "'",boolean8 == false);
    org.junit.Assert.assertTrue("'" + short9 + "' != '"+ (short)10+ "'",short9 == (short)10);
    org.junit.Assert.assertTrue("'" + short10 + "' != '"+ (short)-1+ "'",short10 == (short)-1);
    org.junit.Assert.assertNotNull(shortArray13);
    org.junit.Assert.assertTrue("'" + short14 + "' != '"+ (short)10+ "'",short14 == (short)10);
    org.junit.Assert.assertNotNull(shortArray17);
    org.junit.Assert.assertTrue("'" + boolean18 + "' != '"+ false+ "'",boolean18 == false);
    org.junit.Assert.assertTrue("'" + short19 + "' != '"+ (short)-1+ "'",short19 == (short)-1);
    org.junit.Assert.assertNotNull(shortArray22);
    org.junit.Assert.assertTrue("'" + short23 + "' != '"+ (short)10+ "'",short23 == (short)10);
    org.junit.Assert.assertNotNull(shortArray26);
    org.junit.Assert.assertTrue("'" + boolean27 + "' != '"+ false+ "'",boolean27 == false);
    org.junit.Assert.assertTrue("'" + short28 + "' != '"+ (short)10+ "'",short28 == (short)10);
    org.junit.Assert.assertTrue("'" + boolean29 + "' != '"+ true+ "'",boolean29 == true);
    org.junit.Assert.assertNotNull(shortArray32);
    org.junit.Assert.assertTrue("'" + short33 + "' != '"+ (short)10+ "'",short33 == (short)10);
    org.junit.Assert.assertNotNull(shortArray36);
    org.junit.Assert.assertTrue("'" + boolean37 + "' != '"+ false+ "'",boolean37 == false);
    org.junit.Assert.assertTrue("'" + short38 + "' != '"+ (short)-1+ "'",short38 == (short)-1);
    org.junit.Assert.assertTrue("'" + boolean39 + "' != '"+ true+ "'",boolean39 == true);
    org.junit.Assert.assertNotNull(shortArray42);
    org.junit.Assert.assertTrue("'" + short43 + "' != '"+ (short)10+ "'",short43 == (short)10);
    org.junit.Assert.assertNotNull(shortArray46);
    org.junit.Assert.assertTrue("'" + boolean47 + "' != '"+ false+ "'",boolean47 == false);
    org.junit.Assert.assertTrue("'" + short48 + "' != '"+ (short)-1+ "'",short48 == (short)-1);
    org.junit.Assert.assertTrue("'" + short49 + "' != '"+ (short)10+ "'",short49 == (short)10);
    org.junit.Assert.assertTrue("'" + short50 + "' != '"+ (short)-1+ "'",short50 == (short)-1);
    org.junit.Assert.assertTrue("'" + boolean51 + "' != '"+ true+ "'",boolean51 == true);
    org.junit.Assert.assertTrue("'" + boolean52 + "' != '"+ true+ "'",boolean52 == true);
    org.junit.Assert.assertTrue("'" + short53 + "' != '"+ (short)-1+ "'",short53 == (short)-1);
    org.junit.Assert.assertTrue("'" + boolean54 + "' != '"+ false+ "'",boolean54 == false);
  }
  @Test public void test456() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test456#4768");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test456");
    long long1=org.apache.commons.lang.math.NumberUtils.toLong("Aa hi!Aa hi!Aa hi!Aa hi!Aa hi!Aa hi!AAAAAAAAAA ");
    org.junit.Assert.assertTrue("'" + long1 + "' != '"+ 0L+ "'",long1 == 0L);
  }
  @Test public void test457() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test457#4776");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test457");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.split("                                                              ");
    int int3=org.apache.commons.lang.StringUtils.indexOfAny("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ",strArray2);
    org.junit.Assert.assertNotNull(strArray2);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test458() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test458#4786");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test458");
    java.lang.String str2=org.apache.commons.lang.StringUtils.reverseDelimited(" aaaaaaaaaaaaaaaaaaaa  aaaaaaaaa ",'#');
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ " aaaaaaaaaaaaaaaaaaaa  aaaaaaaaa "+ "'",str2.equals(" aaaaaaaaaaaaaaaaaaaa  aaaaaaaaa "));
  }
  @Test public void test459() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test459#4794");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test459");
    java.lang.String[] strArray3=org.apache.commons.lang.StringUtils.splitByWholeSeparator("aaaaaaaaai!   ","",24);
    org.junit.Assert.assertNotNull(strArray3);
  }
  @Test public void test460() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test460#4802");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test460");
    java.lang.String str3=org.apache.commons.lang.StringUtils.rightPad("AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaa",96,"AAAAAAAAAAAAAAAAAAAA");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"+ "'",str3.equals("AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"));
  }
  @Test public void test461() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test461#4810");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test461");
    java.lang.String[] strArray3=org.apache.commons.lang.StringUtils.splitByWholeSeparator("AAAAAAAAAAAAAAAAAAAA                                                        i!","",(int)(byte)10);
    org.junit.Assert.assertNotNull(strArray3);
  }
  @Test public void test462() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test462#4818");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test462");
    java.lang.String str2=org.apache.commons.lang.StringUtils.stripEnd("########################AAAAAAAAAAAAAAAAAAAA########################################################i!","!ih aA44444444444444444444444         AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaa");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "########################AAAAAAAAAAAAAAAAAAAA########################################################"+ "'",str2.equals("########################AAAAAAAAAAAAAAAAAAAA########################################################"));
  }
  @Test public void test463() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test463#4826");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test463");
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
    short[] shortArray64=new short[]{(byte)10,(byte)-1};
    short short65=org.apache.commons.lang.math.NumberUtils.max(shortArray64);
    short[] shortArray68=new short[]{(byte)1,(byte)1};
    boolean boolean69=org.apache.commons.lang.math.NumberUtils.equals(shortArray64,shortArray68);
    short[] shortArray72=new short[]{(byte)10,(byte)-1};
    short short73=org.apache.commons.lang.math.NumberUtils.max(shortArray72);
    short[] shortArray76=new short[]{(byte)1,(byte)1};
    boolean boolean77=org.apache.commons.lang.math.NumberUtils.equals(shortArray72,shortArray76);
    short short78=org.apache.commons.lang.math.NumberUtils.min(shortArray72);
    short short79=org.apache.commons.lang.math.NumberUtils.max(shortArray72);
    boolean boolean80=org.apache.commons.lang.math.NumberUtils.equals(shortArray64,shortArray72);
    boolean boolean81=org.apache.commons.lang.math.NumberUtils.equals(shortArray21,shortArray72);
    short short82=org.apache.commons.lang.math.NumberUtils.min(shortArray21);
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
    org.junit.Assert.assertNotNull(shortArray64);
    org.junit.Assert.assertTrue("'" + short65 + "' != '"+ (short)10+ "'",short65 == (short)10);
    org.junit.Assert.assertNotNull(shortArray68);
    org.junit.Assert.assertTrue("'" + boolean69 + "' != '"+ false+ "'",boolean69 == false);
    org.junit.Assert.assertNotNull(shortArray72);
    org.junit.Assert.assertTrue("'" + short73 + "' != '"+ (short)10+ "'",short73 == (short)10);
    org.junit.Assert.assertNotNull(shortArray76);
    org.junit.Assert.assertTrue("'" + boolean77 + "' != '"+ false+ "'",boolean77 == false);
    org.junit.Assert.assertTrue("'" + short78 + "' != '"+ (short)-1+ "'",short78 == (short)-1);
    org.junit.Assert.assertTrue("'" + short79 + "' != '"+ (short)10+ "'",short79 == (short)10);
    org.junit.Assert.assertTrue("'" + boolean80 + "' != '"+ true+ "'",boolean80 == true);
    org.junit.Assert.assertTrue("'" + boolean81 + "' != '"+ true+ "'",boolean81 == true);
    org.junit.Assert.assertTrue("'" + short82 + "' != '"+ (short)-1+ "'",short82 == (short)-1);
  }
  @Test public void test464() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test464#4933");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test464");
    double double2=org.apache.commons.lang.math.NumberUtils.toDouble("###                     Aaaaaaaaa                                                                                        ",(double)41.0f);
    org.junit.Assert.assertTrue("'" + double2 + "' != '"+ 41.0d+ "'",double2 == 41.0d);
  }
  @Test public void test465() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test465#4941");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test465");
    java.lang.String[] strArray3=org.apache.commons.lang.StringUtils.splitByWholeSeparator("A                                                hi!                                                 ","A                                                hi!                                                 ",(int)'#');
    java.lang.String[] strArray5=org.apache.commons.lang.StringUtils.stripAll(strArray3,"aaaaaaaaa");
    java.lang.String str6=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray5);
    org.junit.Assert.assertNotNull(strArray3);
    org.junit.Assert.assertNotNull(strArray5);
    org.junit.Assert.assertTrue("'" + str6 + "' != '"+ ""+ "'",str6.equals(""));
  }
  @Test public void test466() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test466#4953");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test466");
    java.lang.String[] strArray4=org.apache.commons.lang.StringUtils.split("","hi!",(int)(byte)100);
    java.lang.String[] strArray5=org.apache.commons.lang.StringUtils.stripAll(strArray4);
    int int6=org.apache.commons.lang.StringUtils.lastIndexOfAny("Aaaaaaaaa",strArray4);
    java.lang.String[] strArray7=org.apache.commons.lang.StringUtils.stripAll(strArray4);
    try {
      java.lang.String str11=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray4,'#',0,24);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
    }
 catch (    java.lang.ArrayIndexOutOfBoundsException e) {
    }
    org.junit.Assert.assertNotNull(strArray4);
    org.junit.Assert.assertNotNull(strArray5);
    org.junit.Assert.assertTrue("'" + int6 + "' != '"+ (-1)+ "'",int6 == (-1));
    org.junit.Assert.assertNotNull(strArray7);
  }
  @Test public void test467() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test467#4972");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test467");
    java.lang.String str1=org.apache.commons.lang.StringUtils.upperCase("   ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "   "+ "'",str1.equals("   "));
  }
  @Test public void test468() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test468#4980");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test468");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringBefore("AA                                  ","a                                                HI!");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "AA                                  "+ "'",str2.equals("AA                                  "));
  }
  @Test public void test469() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test469#4988");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test469");
    java.util.Collection collection0=null;
    java.lang.String str2=org.apache.commons.lang.StringUtils.join(collection0,"aA HI!");
    org.junit.Assert.assertNull(str2);
  }
  @Test public void test470() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test470#4997");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test470");
    java.lang.String str2=org.apache.commons.lang.StringUtils.chompLast("                                                                                                ","");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                                                                                                "+ "'",str2.equals("                                                                                                "));
  }
  @Test public void test471() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test471#5005");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test471");
    java.lang.String str4=org.apache.commons.lang.StringUtils.replace("4444444hI!AAAAAAAAA                                                                                        ","Aaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa","##Aaaaaaaaa",27);
    org.junit.Assert.assertTrue("'" + str4 + "' != '"+ "4444444hI!AAAAAAAAA                                                                                        "+ "'",str4.equals("4444444hI!AAAAAAAAA                                                                                        "));
  }
  @Test public void test472() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test472#5013");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test472");
    java.lang.String str1=org.apache.commons.lang.StringUtils.chompLast("iaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "iaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA"+ "'",str1.equals("iaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA"));
  }
  @Test public void test473() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test473#5021");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test473");
    java.lang.String str2=org.apache.commons.lang.StringUtils.reverseDelimitedString("aaaaaaaaa i!aaaaaaaaa i!aaaaaaaaa i!aaaaaaaaa i!aaaaaaaaa i!aaaaaaaaa i!aaaaaaaaa i!","!ih aA");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test474() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test474#5029");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test474");
    try {
      java.math.BigDecimal bigDecimal1=org.apache.commons.lang.math.NumberUtils.createBigDecimal("44Aaaaaaaaa");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test475() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test475#5040");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test475");
    byte[] byteArray3=new byte[]{(byte)100,(byte)0,(byte)100};
    byte[] byteArray6=new byte[]{(byte)-1,(byte)-1};
    boolean boolean7=org.apache.commons.lang.math.NumberUtils.equals(byteArray3,byteArray6);
    byte byte8=org.apache.commons.lang.math.NumberUtils.min(byteArray6);
    byte[] byteArray12=new byte[]{(byte)100,(byte)0,(byte)100};
    byte[] byteArray15=new byte[]{(byte)-1,(byte)-1};
    boolean boolean16=org.apache.commons.lang.math.NumberUtils.equals(byteArray12,byteArray15);
    byte byte17=org.apache.commons.lang.math.NumberUtils.min(byteArray15);
    boolean boolean18=org.apache.commons.lang.math.NumberUtils.equals(byteArray6,byteArray15);
    byte byte19=org.apache.commons.lang.math.NumberUtils.max(byteArray6);
    byte byte20=org.apache.commons.lang.math.NumberUtils.max(byteArray6);
    byte byte21=org.apache.commons.lang.math.NumberUtils.max(byteArray6);
    org.junit.Assert.assertNotNull(byteArray3);
    org.junit.Assert.assertNotNull(byteArray6);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '"+ false+ "'",boolean7 == false);
    org.junit.Assert.assertTrue("'" + byte8 + "' != '"+ (byte)-1+ "'",byte8 == (byte)-1);
    org.junit.Assert.assertNotNull(byteArray12);
    org.junit.Assert.assertNotNull(byteArray15);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '"+ false+ "'",boolean16 == false);
    org.junit.Assert.assertTrue("'" + byte17 + "' != '"+ (byte)-1+ "'",byte17 == (byte)-1);
    org.junit.Assert.assertTrue("'" + boolean18 + "' != '"+ true+ "'",boolean18 == true);
    org.junit.Assert.assertTrue("'" + byte19 + "' != '"+ (byte)-1+ "'",byte19 == (byte)-1);
    org.junit.Assert.assertTrue("'" + byte20 + "' != '"+ (byte)-1+ "'",byte20 == (byte)-1);
    org.junit.Assert.assertTrue("'" + byte21 + "' != '"+ (byte)-1+ "'",byte21 == (byte)-1);
  }
  @Test public void test476() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test476#5070");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test476");
    java.lang.String str3=org.apache.commons.lang.StringUtils.mid("aa ",(int)(byte)0,51);
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "aa "+ "'",str3.equals("aa "));
  }
  @Test public void test477() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test477#5078");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test477");
    int[] intArray2=new int[]{100,1};
    int[] intArray9=new int[]{(byte)-1,100,(short)0,100,'#',100};
    boolean boolean10=org.apache.commons.lang.math.NumberUtils.equals(intArray2,intArray9);
    int[] intArray14=new int[]{'4',0,(byte)0};
    int[] intArray17=new int[]{100,1};
    int[] intArray24=new int[]{(byte)-1,100,(short)0,100,'#',100};
    boolean boolean25=org.apache.commons.lang.math.NumberUtils.equals(intArray17,intArray24);
    int[] intArray32=new int[]{'4',(short)100,(short)100,52,(byte)1,(short)100};
    boolean boolean33=org.apache.commons.lang.math.NumberUtils.equals(intArray24,intArray32);
    int int34=org.apache.commons.lang.math.NumberUtils.max(intArray32);
    boolean boolean35=org.apache.commons.lang.math.NumberUtils.equals(intArray14,intArray32);
    boolean boolean36=org.apache.commons.lang.math.NumberUtils.equals(intArray9,intArray32);
    int[] intArray37=null;
    int[] intArray41=new int[]{'4',0,(byte)0};
    int[] intArray44=new int[]{100,1};
    int[] intArray51=new int[]{(byte)-1,100,(short)0,100,'#',100};
    boolean boolean52=org.apache.commons.lang.math.NumberUtils.equals(intArray44,intArray51);
    int[] intArray59=new int[]{'4',(short)100,(short)100,52,(byte)1,(short)100};
    boolean boolean60=org.apache.commons.lang.math.NumberUtils.equals(intArray51,intArray59);
    int int61=org.apache.commons.lang.math.NumberUtils.max(intArray59);
    boolean boolean62=org.apache.commons.lang.math.NumberUtils.equals(intArray41,intArray59);
    int int63=org.apache.commons.lang.math.NumberUtils.min(intArray59);
    boolean boolean64=org.apache.commons.lang.math.NumberUtils.equals(intArray37,intArray59);
    boolean boolean65=org.apache.commons.lang.math.NumberUtils.equals(intArray9,intArray59);
    int int66=org.apache.commons.lang.math.NumberUtils.min(intArray59);
    int int67=org.apache.commons.lang.math.NumberUtils.min(intArray59);
    org.junit.Assert.assertNotNull(intArray2);
    org.junit.Assert.assertNotNull(intArray9);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '"+ false+ "'",boolean10 == false);
    org.junit.Assert.assertNotNull(intArray14);
    org.junit.Assert.assertNotNull(intArray17);
    org.junit.Assert.assertNotNull(intArray24);
    org.junit.Assert.assertTrue("'" + boolean25 + "' != '"+ false+ "'",boolean25 == false);
    org.junit.Assert.assertNotNull(intArray32);
    org.junit.Assert.assertTrue("'" + boolean33 + "' != '"+ false+ "'",boolean33 == false);
    org.junit.Assert.assertTrue("'" + int34 + "' != '"+ 100+ "'",int34 == 100);
    org.junit.Assert.assertTrue("'" + boolean35 + "' != '"+ false+ "'",boolean35 == false);
    org.junit.Assert.assertTrue("'" + boolean36 + "' != '"+ false+ "'",boolean36 == false);
    org.junit.Assert.assertNotNull(intArray41);
    org.junit.Assert.assertNotNull(intArray44);
    org.junit.Assert.assertNotNull(intArray51);
    org.junit.Assert.assertTrue("'" + boolean52 + "' != '"+ false+ "'",boolean52 == false);
    org.junit.Assert.assertNotNull(intArray59);
    org.junit.Assert.assertTrue("'" + boolean60 + "' != '"+ false+ "'",boolean60 == false);
    org.junit.Assert.assertTrue("'" + int61 + "' != '"+ 100+ "'",int61 == 100);
    org.junit.Assert.assertTrue("'" + boolean62 + "' != '"+ false+ "'",boolean62 == false);
    org.junit.Assert.assertTrue("'" + int63 + "' != '"+ 1+ "'",int63 == 1);
    org.junit.Assert.assertTrue("'" + boolean64 + "' != '"+ false+ "'",boolean64 == false);
    org.junit.Assert.assertTrue("'" + boolean65 + "' != '"+ false+ "'",boolean65 == false);
    org.junit.Assert.assertTrue("'" + int66 + "' != '"+ 1+ "'",int66 == 1);
    org.junit.Assert.assertTrue("'" + int67 + "' != '"+ 1+ "'",int67 == 1);
  }
  @Test public void test478() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test478#5135");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test478");
    boolean boolean2=org.apache.commons.lang.StringUtils.containsIgnoreCase("","a                                                hi!                                                 ");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test479() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test479#5143");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test479");
    int int2=org.apache.commons.lang.StringUtils.indexOfAnyBut("                                            !i aaaaaaaaa                                            ","aaaaaaaaa i!aaaaaaaaa i!aaaaaaaaa i!aaaaaaaaa i!aaaaaaaaa i!aaaaaaaaa i!aaaaaaaaa i!");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test480() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test480#5151");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test480");
    java.lang.String str1=org.apache.commons.lang.StringUtils.deleteWhitespace("                                       AAAAAAAAA                 ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "AAAAAAAAA"+ "'",str1.equals("AAAAAAAAA"));
  }
  @Test public void test481() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test481#5159");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test481");
    char[] charArray1=null;
    int int2=org.apache.commons.lang.StringUtils.indexOfAny("                         HI!",charArray1);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test482() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test482#5168");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test482");
    java.lang.String str1=org.apache.commons.lang.StringUtils.chompLast("aaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "aaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa"+ "'",str1.equals("aaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa"));
  }
  @Test public void test483() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test483#5176");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test483");
    int int3=org.apache.commons.lang.StringUtils.indexOf("   #############################aaaaaaaaaaaaaaaaaaaa##Aaaaaaaa#############################################################aaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa","aaaaaaaaaa                        ",32);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test484() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test484#5184");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test484");
    java.lang.String str2=org.apache.commons.lang.StringUtils.defaultString("AAAAAAAAAAAAAAAAAAAA  aAAAAAAAA                                       HI!","                                                                                ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "AAAAAAAAAAAAAAAAAAAA  aAAAAAAAA                                       HI!"+ "'",str2.equals("AAAAAAAAAAAAAAAAAAAA  aAAAAAAAA                                       HI!"));
  }
  @Test public void test485() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test485#5192");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test485");
    java.lang.String str1=org.apache.commons.lang.StringUtils.deleteSpaces("aAAAAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAI!");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "aAAAAAAAAaAAAAAAAAaAAAAAAAAaAAAAAAAAaAAAAAAAAaAAAAAAAAaAAAAAAAAaAAAAAAAAaAAAAAAAAaAAAAAAAI!"+ "'",str1.equals("aAAAAAAAAaAAAAAAAAaAAAAAAAAaAAAAAAAAaAAAAAAAAaAAAAAAAAaAAAAAAAAaAAAAAAAAaAAAAAAAAaAAAAAAAI!"));
  }
  @Test public void test486() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test486#5200");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test486");
    float[] floatArray3=new float[]{(byte)-1,(-1.0f),(byte)100};
    float float4=org.apache.commons.lang.math.NumberUtils.max(floatArray3);
    float float5=org.apache.commons.lang.math.NumberUtils.min(floatArray3);
    float[] floatArray6=null;
    boolean boolean7=org.apache.commons.lang.math.NumberUtils.equals(floatArray3,floatArray6);
    org.junit.Assert.assertNotNull(floatArray3);
    org.junit.Assert.assertTrue("'" + float4 + "' != '"+ 100.0f+ "'",float4 == 100.0f);
    org.junit.Assert.assertTrue("'" + float5 + "' != '"+ (-1.0f)+ "'",float5 == (-1.0f));
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '"+ false+ "'",boolean7 == false);
  }
  @Test public void test487() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test487#5215");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test487");
    java.lang.String str4=org.apache.commons.lang.StringUtils.replace("Aaaaaaaaa                          ","a        aa        aa        aA!ih","A444 A44444444 A44444444 A44444444 A44444444 A44444444 A44444444",3);
    org.junit.Assert.assertTrue("'" + str4 + "' != '"+ "Aaaaaaaaa                          "+ "'",str4.equals("Aaaaaaaaa                          "));
  }
  @Test public void test488() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test488#5223");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test488");
    boolean boolean2=org.apache.commons.lang.StringUtils.containsNone("aaaaaaaaa                                                                                        ","Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test489() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test489#5231");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test489");
    java.util.Collection collection0=null;
    java.lang.String str2=org.apache.commons.lang.StringUtils.join(collection0,"...                                          ..");
    org.junit.Assert.assertNull(str2);
  }
  @Test public void test490() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test490#5240");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test490");
    int int3=org.apache.commons.lang.StringUtils.lastIndexOf("...                                          ..","           ... !ih...           ",88);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test491() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test491#5248");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test491");
    java.lang.String str3=org.apache.commons.lang.StringUtils.substring(" AAAAAAa a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a ",31,(int)'4');
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "a a a a a a a a a a a"+ "'",str3.equals("a a a a a a a a a a a"));
  }
  @Test public void test492() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test492#5256");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test492");
    java.lang.String[] strArray3=org.apache.commons.lang.StringUtils.splitByWholeSeparator("   aaaaaaaaa                                        ","                                            !i aaaaaaaaa                                            ",3);
    java.lang.String str4=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray3);
    org.junit.Assert.assertNotNull(strArray3);
    org.junit.Assert.assertTrue("'" + str4 + "' != '"+ "   aaaaaaaaa                                        "+ "'",str4.equals("   aaaaaaaaa                                        "));
  }
  @Test public void test493() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test493#5266");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test493");
    int int2=org.apache.commons.lang.StringUtils.indexOf("4                                                ",'a');
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test494() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test494#5274");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test494");
    boolean boolean1=org.apache.commons.lang.math.NumberUtils.isDigits("A         A         A        ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test495() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test495#5282");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test495");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.splitPreserveAllTokens("aaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa A",'a');
    org.junit.Assert.assertNotNull(strArray2);
  }
  @Test public void test496() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test496#5290");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test496");
    boolean boolean1=org.apache.commons.lang.StringUtils.isNotEmpty("                                       AAAAAAAAA                 ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test497() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test497#5298");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test497");
    double double3=org.apache.commons.lang.math.NumberUtils.max(0.0d,(double)52.0f,(double)48L);
    org.junit.Assert.assertTrue("'" + double3 + "' != '"+ 52.0d+ "'",double3 == 52.0d);
  }
  @Test public void test498() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test498#5306");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test498");
    java.lang.String str2=org.apache.commons.lang.StringUtils.leftPad("!################################### ",(int)(short)0);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "!################################### "+ "'",str2.equals("!################################### "));
  }
  @Test public void test499() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test499#5314");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test499");
    java.lang.String str3=org.apache.commons.lang.StringUtils.abbreviate("                                            aaaaaaaaa i!                                            ",155,(int)'4');
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "...aa i!                                            "+ "'",str3.equals("...aa i!                                            "));
  }
  @Test public void test500() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest8::test500#5322");
    if (debug)     System.out.format("%n%s%n","RegressionTest8.test500");
    int int2=org.apache.commons.lang.math.NumberUtils.compare(99.0d,(double)90L);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 1+ "'",int2 == 1);
  }
}
