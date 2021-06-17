import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
@FixMethodOrder(MethodSorters.NAME_ASCENDING) public class RegressionTest1 {
  public static boolean debug=false;
  @Test public void test001() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test001#10");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test001");
    java.lang.String str2=org.apache.commons.lang.StringUtils.getPrechomp("","aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test002() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test002#18");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test002");
    int int3=org.apache.commons.lang.StringUtils.ordinalIndexOf(" ","                                                                                       aaaaaaaaa ",96);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test003() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test003#26");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test003");
    java.lang.String str2=org.apache.commons.lang.StringUtils.right(" ",(int)'#');
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ " "+ "'",str2.equals(" "));
  }
  @Test public void test004() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test004#34");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test004");
    java.lang.String str2=org.apache.commons.lang.StringUtils.stripEnd("aaaaaaaaa                                                                                        ","                                   ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "aaaaaaaaa"+ "'",str2.equals("aaaaaaaaa"));
  }
  @Test public void test005() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test005#42");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test005");
    boolean boolean2=org.apache.commons.lang.StringUtils.containsNone(" ","Aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test006() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test006#50");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test006");
    java.lang.String str2=org.apache.commons.lang.StringUtils.abbreviate("aaaaaaaaa",52);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "aaaaaaaaa"+ "'",str2.equals("aaaaaaaaa"));
  }
  @Test public void test007() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test007#58");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test007");
    int int2=org.apache.commons.lang.StringUtils.countMatches("Aaaaaaaaa ","                                                                                                                  HI!");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 0+ "'",int2 == 0);
  }
  @Test public void test008() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test008#66");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test008");
    java.lang.String str1=org.apache.commons.lang.StringUtils.trim("aaaaaaaaaaaaaaaaaaaa                                ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "aaaaaaaaaaaaaaaaaaaa"+ "'",str1.equals("aaaaaaaaaaaaaaaaaaaa"));
  }
  @Test public void test009() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test009#74");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test009");
    boolean boolean1=org.apache.commons.lang.math.NumberUtils.isNumber("4444444Hi!");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test010() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test010#82");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test010");
    java.lang.String str4=org.apache.commons.lang.StringUtils.overlay("   ","aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa ",(int)(byte)1,10);
    org.junit.Assert.assertTrue("'" + str4 + "' != '"+ " aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa "+ "'",str4.equals(" aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa "));
  }
  @Test public void test011() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test011#90");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test011");
    java.lang.String str3=org.apache.commons.lang.StringUtils.rightPad("                                ",96,"                 ");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "                                                                                                "+ "'",str3.equals("                                                                                                "));
  }
  @Test public void test012() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test012#98");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test012");
    java.lang.String str2=org.apache.commons.lang.StringUtils.remove("","i!");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test013() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test013#106");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test013");
    java.lang.String str2=org.apache.commons.lang.StringUtils.chompLast("a                                                HI!","                                                ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "a                                                HI!"+ "'",str2.equals("a                                                HI!"));
  }
  @Test public void test014() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test014#114");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test014");
    long long3=org.apache.commons.lang.math.NumberUtils.max((-1L),0L,(long)9);
    org.junit.Assert.assertTrue("'" + long3 + "' != '"+ 9L+ "'",long3 == 9L);
  }
  @Test public void test015() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test015#122");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test015");
    boolean boolean1=org.apache.commons.lang.StringUtils.isEmpty("");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test016() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test016#130");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test016");
    float float2=org.apache.commons.lang.math.NumberUtils.toFloat("aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa ",(float)(byte)-1);
    org.junit.Assert.assertTrue("'" + float2 + "' != '"+ (-1.0f)+ "'",float2 == (-1.0f));
  }
  @Test public void test017() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test017#138");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test017");
    java.lang.String str1=org.apache.commons.lang.StringUtils.stripToNull("aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa"+ "'",str1.equals("aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa"));
  }
  @Test public void test018() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test018#146");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test018");
    java.lang.String str2=org.apache.commons.lang.StringUtils.right("                        AAAAAAAAAAAAAAAAAAAA                                                        ",(int)(byte)0);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test019() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test019#154");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test019");
    int int2=org.apache.commons.lang.math.NumberUtils.toInt("                                ",(int)(short)-1);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test020() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test020#162");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test020");
    try {
      java.lang.String str2=org.apache.commons.lang.StringUtils.chompLast("                                ","                                                hi!                                                 ");
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -68");
    }
 catch (    java.lang.StringIndexOutOfBoundsException e) {
    }
  }
  @Test public void test021() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test021#173");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test021");
    short short3=org.apache.commons.lang.math.NumberUtils.min((short)0,(short)(byte)100,(short)1);
    org.junit.Assert.assertTrue("'" + short3 + "' != '"+ (short)0+ "'",short3 == (short)0);
  }
  @Test public void test022() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test022#181");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test022");
    java.lang.String str3=org.apache.commons.lang.StringUtils.replace("","aaaaaaaaaaaaaaaaaaaa","                                ");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ ""+ "'",str3.equals(""));
  }
  @Test public void test023() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test023#189");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test023");
    java.lang.String str3=org.apache.commons.lang.StringUtils.replaceChars("","A                                                hi!","4444444Hi!");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ ""+ "'",str3.equals(""));
  }
  @Test public void test024() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test024#197");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test024");
    java.lang.String str3=org.apache.commons.lang.StringUtils.leftPad("                                                                                                                  HI!",1,'a');
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "                                                                                                                  HI!"+ "'",str3.equals("                                                                                                                  HI!"));
  }
  @Test public void test025() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test025#205");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test025");
    java.lang.String str2=org.apache.commons.lang.StringUtils.getPrechomp("","Aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test026() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test026#213");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test026");
    java.lang.String str1=org.apache.commons.lang.StringUtils.reverse("#############################################################################          ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "          #############################################################################"+ "'",str1.equals("          #############################################################################"));
  }
  @Test public void test027() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test027#221");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test027");
    int int2=org.apache.commons.lang.StringUtils.indexOf("",'a');
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test028() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test028#229");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test028");
    java.lang.String str3=org.apache.commons.lang.StringUtils.replaceChars("   ","Hi!","aaaaaaaaaaaaaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "   "+ "'",str3.equals("   "));
  }
  @Test public void test029() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test029#237");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test029");
    java.util.Iterator iterator0=null;
    java.lang.String str2=org.apache.commons.lang.StringUtils.join(iterator0,"#############################################################################          ");
    org.junit.Assert.assertNull(str2);
  }
  @Test public void test030() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test030#246");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test030");
    java.lang.String str4=org.apache.commons.lang.StringUtils.replace("                                                                                                ","Aaaaaaaaa","aaaaaaaaaaaaaaaaaaaa",(int)(short)1);
    org.junit.Assert.assertTrue("'" + str4 + "' != '"+ "                                                                                                "+ "'",str4.equals("                                                                                                "));
  }
  @Test public void test031() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test031#254");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test031");
    try {
      java.lang.String str4=org.apache.commons.lang.StringUtils.overlayString("aaaaaaaaaaaaaaaaaaaa","                                                    ",100,(int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
    }
 catch (    java.lang.StringIndexOutOfBoundsException e) {
    }
  }
  @Test public void test032() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test032#265");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test032");
    short[] shortArray2=new short[]{(byte)10,(byte)-1};
    short short3=org.apache.commons.lang.math.NumberUtils.max(shortArray2);
    short[] shortArray6=new short[]{(byte)1,(byte)1};
    boolean boolean7=org.apache.commons.lang.math.NumberUtils.equals(shortArray2,shortArray6);
    short short8=org.apache.commons.lang.math.NumberUtils.min(shortArray2);
    short short9=org.apache.commons.lang.math.NumberUtils.min(shortArray2);
    short short10=org.apache.commons.lang.math.NumberUtils.max(shortArray2);
    org.junit.Assert.assertNotNull(shortArray2);
    org.junit.Assert.assertTrue("'" + short3 + "' != '"+ (short)10+ "'",short3 == (short)10);
    org.junit.Assert.assertNotNull(shortArray6);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '"+ false+ "'",boolean7 == false);
    org.junit.Assert.assertTrue("'" + short8 + "' != '"+ (short)-1+ "'",short8 == (short)-1);
    org.junit.Assert.assertTrue("'" + short9 + "' != '"+ (short)-1+ "'",short9 == (short)-1);
    org.junit.Assert.assertTrue("'" + short10 + "' != '"+ (short)10+ "'",short10 == (short)10);
  }
  @Test public void test033() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test033#285");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test033");
    int int3=org.apache.commons.lang.StringUtils.lastIndexOf("A","#######################################################################################          ",97);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test034() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test034#293");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test034");
    double double1=org.apache.commons.lang.math.NumberUtils.toDouble("a                                                HI!");
    org.junit.Assert.assertTrue("'" + double1 + "' != '"+ 0.0d+ "'",double1 == 0.0d);
  }
  @Test public void test035() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test035#301");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test035");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringBetween("a                                                HI!                                                 ","A");
    org.junit.Assert.assertNull(str2);
  }
  @Test public void test036() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test036#309");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test036");
    java.lang.String str2=org.apache.commons.lang.StringUtils.reverseDelimitedString("hi!                                   A","");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "hi!                                   A"+ "'",str2.equals("hi!                                   A"));
  }
  @Test public void test037() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test037#317");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test037");
    java.lang.String str1=org.apache.commons.lang.StringUtils.trimToEmpty("");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ ""+ "'",str1.equals(""));
  }
  @Test public void test038() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test038#325");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test038");
    int int2=org.apache.commons.lang.StringUtils.getLevenshteinDistance("aaaaaaaaa","aaaaaaaaaaaaaaaaaaaa                                ");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 43+ "'",int2 == 43);
  }
  @Test public void test039() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test039#333");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test039");
    boolean boolean2=org.apache.commons.lang.StringUtils.equals("aaaaaaaaa                                                                                        ","");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test040() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test040#341");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test040");
    java.lang.String str1=org.apache.commons.lang.StringUtils.deleteSpaces("aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "aaaaaaaaaaaaaaaaaaaaAaaaaaaaa"+ "'",str1.equals("aaaaaaaaaaaaaaaaaaaaAaaaaaaaa"));
  }
  @Test public void test041() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test041#349");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test041");
    int int3=org.apache.commons.lang.StringUtils.lastIndexOf("                                                 !ih                                                ","                                   ",(int)(short)0);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ 0+ "'",int3 == 0);
  }
  @Test public void test042() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test042#357");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test042");
    int int2=org.apache.commons.lang.math.NumberUtils.toInt("                        AAAAAAAAAAAAAAAAAAAA                                                        ",96);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 96+ "'",int2 == 96);
  }
  @Test public void test043() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test043#365");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test043");
    int int2=org.apache.commons.lang.math.NumberUtils.toInt("                                                                                       aaaaaaaaa ",(int)(byte)0);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 0+ "'",int2 == 0);
  }
  @Test public void test044() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test044#373");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test044");
    java.util.Iterator iterator0=null;
    java.lang.String str2=org.apache.commons.lang.StringUtils.join(iterator0,'a');
    org.junit.Assert.assertNull(str2);
  }
  @Test public void test045() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test045#382");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test045");
    int int2=org.apache.commons.lang.math.NumberUtils.compare(10.0d,(double)100.0f);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test046() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test046#390");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test046");
    long long1=org.apache.commons.lang.math.NumberUtils.toLong(" ");
    org.junit.Assert.assertTrue("'" + long1 + "' != '"+ 0L+ "'",long1 == 0L);
  }
  @Test public void test047() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test047#398");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test047");
    int int2=org.apache.commons.lang.StringUtils.countMatches("                                                                                                ","");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 0+ "'",int2 == 0);
  }
  @Test public void test048() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test048#406");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test048");
    try {
      java.lang.Number number1=org.apache.commons.lang.math.NumberUtils.createNumber("                                                hi!                                                 ");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message:                                                 hi!                                                  is not a valid number.");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test049() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test049#417");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test049");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.splitPreserveAllTokens("          "," ");
    org.junit.Assert.assertNotNull(strArray2);
  }
  @Test public void test050() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test050#425");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test050");
    try {
      java.math.BigDecimal bigDecimal1=org.apache.commons.lang.math.NumberUtils.createBigDecimal("                                                                                                 ");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: A blank string is not a valid number");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test051() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test051#436");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test051");
    long long2=org.apache.commons.lang.math.NumberUtils.toLong("           4            ",(long)(short)100);
    org.junit.Assert.assertTrue("'" + long2 + "' != '"+ 100L+ "'",long2 == 100L);
  }
  @Test public void test052() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test052#444");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test052");
    java.lang.String str2=org.apache.commons.lang.StringUtils.center("i!",(int)'4');
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                         i!                         "+ "'",str2.equals("                         i!                         "));
  }
  @Test public void test053() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test053#452");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test053");
    java.lang.String str3=org.apache.commons.lang.StringUtils.getNestedString("          ","","                                                                                       aaaaaaaaa ");
    org.junit.Assert.assertNull(str3);
  }
  @Test public void test054() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test054#460");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test054");
    boolean boolean1=org.apache.commons.lang.StringUtils.isNotEmpty("i!");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test055() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test055#468");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test055");
    java.lang.String str1=org.apache.commons.lang.StringUtils.stripToEmpty(" aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "aaaaaaaaa"+ "'",str1.equals("aaaaaaaaa"));
  }
  @Test public void test056() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test056#476");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test056");
    float float1=org.apache.commons.lang.math.NumberUtils.toFloat("...                          ...");
    org.junit.Assert.assertTrue("'" + float1 + "' != '"+ 0.0f+ "'",float1 == 0.0f);
  }
  @Test public void test057() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test057#484");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test057");
    double double3=org.apache.commons.lang.math.NumberUtils.min((double)'4',(double)(byte)10,(double)9L);
    org.junit.Assert.assertTrue("'" + double3 + "' != '"+ 9.0d+ "'",double3 == 9.0d);
  }
  @Test public void test058() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test058#492");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test058");
    int int1=org.apache.commons.lang.math.NumberUtils.stringToInt("A                                                hi!                                                 ");
    org.junit.Assert.assertTrue("'" + int1 + "' != '"+ 0+ "'",int1 == 0);
  }
  @Test public void test059() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test059#500");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test059");
    java.lang.String str2=org.apache.commons.lang.StringUtils.repeat("hi!",(int)(byte)1);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "hi!"+ "'",str2.equals("hi!"));
  }
  @Test public void test060() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test060#508");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test060");
    long long3=org.apache.commons.lang.math.NumberUtils.min((long)43,(long)(byte)0,0L);
    org.junit.Assert.assertTrue("'" + long3 + "' != '"+ 0L+ "'",long3 == 0L);
  }
  @Test public void test061() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test061#516");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test061");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substring("                                                                                                                  HI!",9);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                                                                                                         HI!"+ "'",str2.equals("                                                                                                         HI!"));
  }
  @Test public void test062() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test062#524");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test062");
    java.lang.String str2=org.apache.commons.lang.StringUtils.stripStart(" aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa "," aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test063() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test063#532");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test063");
    java.lang.String str2=org.apache.commons.lang.StringUtils.remove("                 "," aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                 "+ "'",str2.equals("                 "));
  }
  @Test public void test064() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test064#540");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test064");
    try {
      java.lang.Number number1=org.apache.commons.lang.math.NumberUtils.createNumber(" aaaaaaaaa");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message:  aaaaaaaaa is not a valid number.");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test065() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test065#551");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test065");
    java.lang.String[] strArray3=org.apache.commons.lang.StringUtils.splitByWholeSeparator("A                                                hi!                                                 ","4444444Hi!",52);
    java.lang.String str4=org.apache.commons.lang.StringUtils.concatenate((java.lang.Object[])strArray3);
    org.junit.Assert.assertNotNull(strArray3);
    org.junit.Assert.assertTrue("'" + str4 + "' != '"+ "A                                                hi!                                                 "+ "'",str4.equals("A                                                hi!                                                 "));
  }
  @Test public void test066() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test066#561");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test066");
    java.lang.String str1=org.apache.commons.lang.StringUtils.trimToEmpty("                 ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ ""+ "'",str1.equals(""));
  }
  @Test public void test067() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test067#569");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test067");
    java.lang.String str1=org.apache.commons.lang.StringUtils.clean("");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ ""+ "'",str1.equals(""));
  }
  @Test public void test068() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test068#577");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test068");
    double double3=org.apache.commons.lang.math.NumberUtils.max((double)' ',(double)29,0.0d);
    org.junit.Assert.assertTrue("'" + double3 + "' != '"+ 32.0d+ "'",double3 == 32.0d);
  }
  @Test public void test069() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test069#585");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test069");
    int int2=org.apache.commons.lang.StringUtils.indexOfAnyBut("                         i!                         ","hi!                                   A");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test070() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test070#593");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test070");
    java.lang.String str1=org.apache.commons.lang.StringUtils.swapCase("444444444444444444444444444444444444444444444          444444444444444444444444444444444444444444444");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "444444444444444444444444444444444444444444444          444444444444444444444444444444444444444444444"+ "'",str1.equals("444444444444444444444444444444444444444444444          444444444444444444444444444444444444444444444"));
  }
  @Test public void test071() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test071#601");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test071");
    java.lang.String str1=org.apache.commons.lang.StringUtils.escape("                                                 !ih                                                ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "                                                 !ih                                                "+ "'",str1.equals("                                                 !ih                                                "));
  }
  @Test public void test072() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test072#609");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test072");
    try {
      java.lang.String str2=org.apache.commons.lang.StringUtils.chompLast("                 ","                                                hi!                                                 ");
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -83");
    }
 catch (    java.lang.StringIndexOutOfBoundsException e) {
    }
  }
  @Test public void test073() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test073#620");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test073");
    boolean boolean2=org.apache.commons.lang.StringUtils.containsIgnoreCase("                                                                                                         HI!","#######################################################################################          ");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test074() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test074#628");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test074");
    int int2=org.apache.commons.lang.StringUtils.indexOfAny("                                "," ");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 0+ "'",int2 == 0);
  }
  @Test public void test075() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test075#636");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test075");
    java.lang.String str2=org.apache.commons.lang.StringUtils.removeEnd("i!","                        AAAAAAAAAAAAAAAAAAAA                                                        ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "i!"+ "'",str2.equals("i!"));
  }
  @Test public void test076() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test076#644");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test076");
    java.lang.String str1=org.apache.commons.lang.StringUtils.trim("");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ ""+ "'",str1.equals(""));
  }
  @Test public void test077() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test077#652");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test077");
    java.lang.String str1=org.apache.commons.lang.StringUtils.deleteWhitespace("                                                 !ih                                                ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "!ih"+ "'",str1.equals("!ih"));
  }
  @Test public void test078() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test078#660");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test078");
    java.lang.String str2=org.apache.commons.lang.StringUtils.chomp("aaaaaaaaaaaaaaaaaaaa","aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "aaaaaaaaaaaaaaaaaaaa"+ "'",str2.equals("aaaaaaaaaaaaaaaaaaaa"));
  }
  @Test public void test079() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test079#668");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test079");
    double double2=org.apache.commons.lang.math.NumberUtils.toDouble("",(double)1.0f);
    org.junit.Assert.assertTrue("'" + double2 + "' != '"+ 1.0d+ "'",double2 == 1.0d);
  }
  @Test public void test080() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test080#676");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test080");
    java.lang.String str1=org.apache.commons.lang.StringUtils.defaultString("aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa"+ "'",str1.equals("aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa"));
  }
  @Test public void test081() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test081#684");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test081");
    java.lang.String str3=org.apache.commons.lang.StringUtils.abbreviate("                                                 !ih                                                ",48,(int)(short)10);
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "... !ih..."+ "'",str3.equals("... !ih..."));
  }
  @Test public void test082() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test082#692");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test082");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringAfter("           4            ","hi!");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test083() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test083#700");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test083");
    java.lang.String str1=org.apache.commons.lang.StringUtils.trim("aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa"+ "'",str1.equals("aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa"));
  }
  @Test public void test084() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test084#708");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test084");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.splitPreserveAllTokens("a                                                HI!                                                 ","Aaaaaaaaa");
    org.junit.Assert.assertNotNull(strArray2);
  }
  @Test public void test085() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test085#716");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test085");
    java.lang.String str2=org.apache.commons.lang.StringUtils.getNestedString("aaaaaaaaaaaaaaaaaaaa","aaaaaaaaa ");
    org.junit.Assert.assertNull(str2);
  }
  @Test public void test086() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test086#724");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test086");
    int int2=org.apache.commons.lang.StringUtils.getLevenshteinDistance("aaaaaaaaaaaaaaaaaaaa","");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 20+ "'",int2 == 20);
  }
  @Test public void test087() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test087#732");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test087");
    java.lang.String str3=org.apache.commons.lang.StringUtils.substring("#######################################################################################          ",20,(int)(byte)0);
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ ""+ "'",str3.equals(""));
  }
  @Test public void test088() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test088#740");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test088");
    int int3=org.apache.commons.lang.math.NumberUtils.min((int)(byte)0,52,(int)(short)100);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ 0+ "'",int3 == 0);
  }
  @Test public void test089() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test089#748");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test089");
    try {
      java.lang.String str2=org.apache.commons.lang.StringUtils.abbreviate("                                                                                                         HI!",(int)(byte)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
    }
 catch (    java.lang.IllegalArgumentException e) {
    }
  }
  @Test public void test090() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test090#759");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test090");
    java.lang.String[] strArray3=org.apache.commons.lang.StringUtils.split("           4            ","                        aaaaaaaaaaaaaaaaaaaa                                                        ",(int)' ');
    org.junit.Assert.assertNotNull(strArray3);
  }
  @Test public void test091() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test091#767");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test091");
    java.lang.String str2=org.apache.commons.lang.StringUtils.leftPad("4",(-1));
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "4"+ "'",str2.equals("4"));
  }
  @Test public void test092() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test092#775");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test092");
    java.lang.String str2=org.apache.commons.lang.StringUtils.prechomp("aaaaaaaaaaaaaaaaaaaa                                ","aaaaaaaaaaaaaaaaaaaaAaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "aaaaaaaaaaaaaaaaaaaa                                "+ "'",str2.equals("aaaaaaaaaaaaaaaaaaaa                                "));
  }
  @Test public void test093() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test093#783");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test093");
    try {
      java.lang.Integer int1=org.apache.commons.lang.math.NumberUtils.createInteger("                                                                                                ");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                                                                                                \"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test094() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test094#794");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test094");
    int int2=org.apache.commons.lang.StringUtils.indexOfDifference("Aaaaaaaaa ","aaaaaaaaaaaaaaaaaaaa");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 0+ "'",int2 == 0);
  }
  @Test public void test095() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test095#802");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test095");
    int int2=org.apache.commons.lang.StringUtils.indexOfAnyBut("                                                ","#############################################################################          ");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test096() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test096#810");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test096");
    java.lang.String str3=org.apache.commons.lang.StringUtils.substringBetween("... !ih...","                                                                                                                  HI!","#######################################################################################          ");
    org.junit.Assert.assertNull(str3);
  }
  @Test public void test097() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test097#818");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test097");
    long long3=org.apache.commons.lang.math.NumberUtils.min((long)(short)0,0L,(long)(byte)1);
    org.junit.Assert.assertTrue("'" + long3 + "' != '"+ 0L+ "'",long3 == 0L);
  }
  @Test public void test098() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test098#826");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test098");
    java.lang.String str3=org.apache.commons.lang.StringUtils.center("                        aaaaaaaaaaaaaaaaaaaa                                                        ",3," aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "                        aaaaaaaaaaaaaaaaaaaa                                                        "+ "'",str3.equals("                        aaaaaaaaaaaaaaaaaaaa                                                        "));
  }
  @Test public void test099() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test099#834");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test099");
    byte byte3=org.apache.commons.lang.math.NumberUtils.max((byte)10,(byte)10,(byte)0);
    org.junit.Assert.assertTrue("'" + byte3 + "' != '"+ (byte)10+ "'",byte3 == (byte)10);
  }
  @Test public void test100() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test100#842");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test100");
    java.lang.Short short0=org.apache.commons.lang.math.NumberUtils.SHORT_MINUS_ONE;
    org.junit.Assert.assertTrue("'" + short0 + "' != '"+ (short)-1+ "'",short0.equals((short)-1));
  }
  @Test public void test101() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test101#850");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test101");
    float float2=org.apache.commons.lang.math.NumberUtils.toFloat("4444444Hi!",(float)'4');
    org.junit.Assert.assertTrue("'" + float2 + "' != '"+ 52.0f+ "'",float2 == 52.0f);
  }
  @Test public void test102() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test102#858");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test102");
    java.lang.String str3=org.apache.commons.lang.StringUtils.replaceOnce("A                                                hi!                                                 ","...                          ...","          #############################################################################");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "A                                                hi!                                                 "+ "'",str3.equals("A                                                hi!                                                 "));
  }
  @Test public void test103() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test103#866");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test103");
    long long2=org.apache.commons.lang.math.NumberUtils.toLong("aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa",(long)100);
    org.junit.Assert.assertTrue("'" + long2 + "' != '"+ 100L+ "'",long2 == 100L);
  }
  @Test public void test104() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test104#874");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test104");
    int int2=org.apache.commons.lang.StringUtils.countMatches("A                                                hi!"," ");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 48+ "'",int2 == 48);
  }
  @Test public void test105() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test105#882");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test105");
    java.lang.String str3=org.apache.commons.lang.StringUtils.abbreviate("#######################################################################################          ",0,20);
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "#################..."+ "'",str3.equals("#################..."));
  }
  @Test public void test106() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test106#890");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test106");
    int int2=org.apache.commons.lang.math.NumberUtils.stringToInt("                                   ",43);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 43+ "'",int2 == 43);
  }
  @Test public void test107() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test107#898");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test107");
    java.lang.String str3=org.apache.commons.lang.StringUtils.rightPad("                                                hi!                                                 ",(int)(byte)-1,'#');
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "                                                hi!                                                 "+ "'",str3.equals("                                                hi!                                                 "));
  }
  @Test public void test108() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test108#906");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test108");
    int int2=org.apache.commons.lang.StringUtils.indexOfAny("H","a                                                HI!                                                 ");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 0+ "'",int2 == 0);
  }
  @Test public void test109() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test109#914");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test109");
    java.lang.String str1=org.apache.commons.lang.StringUtils.clean("Aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "Aaaaaaaaa"+ "'",str1.equals("Aaaaaaaaa"));
  }
  @Test public void test110() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test110#922");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test110");
    java.lang.String str2=org.apache.commons.lang.StringUtils.left("                                                                                                         HI!",100);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                                                                                                    "+ "'",str2.equals("                                                                                                    "));
  }
  @Test public void test111() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test111#930");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test111");
    java.lang.String str3=org.apache.commons.lang.StringUtils.rightPad("          ",10,'a');
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "          "+ "'",str3.equals("          "));
  }
  @Test public void test112() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test112#938");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test112");
    java.lang.String str2=org.apache.commons.lang.StringUtils.removeEnd("hi!                                   A","                        aaaaaaaaaaaaaaaaaaaa                                                        ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "hi!                                   A"+ "'",str2.equals("hi!                                   A"));
  }
  @Test public void test113() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test113#946");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test113");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringAfterLast("                             hi!                                   A                             ","... !ih...");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test114() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test114#954");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test114");
    java.lang.String str3=org.apache.commons.lang.StringUtils.substring("Hi!",52,97);
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ ""+ "'",str3.equals(""));
  }
  @Test public void test115() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test115#962");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test115");
    int int2=org.apache.commons.lang.StringUtils.lastIndexOf("h","                                                                                                    ");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test116() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test116#970");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test116");
    boolean boolean1=org.apache.commons.lang.StringUtils.isNumericSpace("#############################################################################          ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test117() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test117#978");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test117");
    java.lang.String str2=org.apache.commons.lang.StringUtils.removeEnd("   ","   ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test118() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test118#986");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test118");
    int int2=org.apache.commons.lang.StringUtils.countMatches("","H");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 0+ "'",int2 == 0);
  }
  @Test public void test119() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test119#994");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test119");
    java.lang.String str3=org.apache.commons.lang.StringUtils.replaceChars("!ih","hi!                                   A"," aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "aa "+ "'",str3.equals("aa "));
  }
  @Test public void test120() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test120#1002");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test120");
    java.lang.String str2=org.apache.commons.lang.StringUtils.prechomp("","                                                                                                ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test121() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test121#1010");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test121");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringBefore("                        AAAAAAAAAAAAAAAAAAAA                                                        ","                                                 !ih                                                ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                        AAAAAAAAAAAAAAAAAAAA                                                        "+ "'",str2.equals("                        AAAAAAAAAAAAAAAAAAAA                                                        "));
  }
  @Test public void test122() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test122#1018");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test122");
    java.lang.String str2=org.apache.commons.lang.StringUtils.repeat("",0);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test123() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test123#1026");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test123");
    int int2=org.apache.commons.lang.StringUtils.getLevenshteinDistance("aaaaaaaaa                                                                                        ","aa ");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 94+ "'",int2 == 94);
  }
  @Test public void test124() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test124#1034");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test124");
    java.lang.String str3=org.apache.commons.lang.StringUtils.center("          #############################################################################",1,"                                                                                       aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "          #############################################################################"+ "'",str3.equals("          #############################################################################"));
  }
  @Test public void test125() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test125#1042");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test125");
    int int2=org.apache.commons.lang.math.NumberUtils.toInt("aaaaaaaaa ",(int)(short)0);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 0+ "'",int2 == 0);
  }
  @Test public void test126() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test126#1050");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test126");
    boolean boolean2=org.apache.commons.lang.StringUtils.containsNone("                                ","Aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ true+ "'",boolean2 == true);
  }
  @Test public void test127() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test127#1058");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test127");
    byte byte3=org.apache.commons.lang.math.NumberUtils.min((byte)0,(byte)100,(byte)100);
    org.junit.Assert.assertTrue("'" + byte3 + "' != '"+ (byte)0+ "'",byte3 == (byte)0);
  }
  @Test public void test128() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test128#1066");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test128");
    int int3=org.apache.commons.lang.StringUtils.lastIndexOf("#############################################################################          ",' ',32);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test129() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test129#1074");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test129");
    java.lang.String str3=org.apache.commons.lang.StringUtils.leftPad("i!",(int)(short)100,"Aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!"+ "'",str3.equals("Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!"));
  }
  @Test public void test130() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test130#1082");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test130");
    long long2=org.apache.commons.lang.math.NumberUtils.toLong("4444444Hi!",(long)(short)10);
    org.junit.Assert.assertTrue("'" + long2 + "' != '"+ 10L+ "'",long2 == 10L);
  }
  @Test public void test131() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test131#1090");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test131");
    java.lang.String str3=org.apache.commons.lang.StringUtils.substring("                                                                                                                  HI!",29,48);
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "                   "+ "'",str3.equals("                   "));
  }
  @Test public void test132() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test132#1098");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test132");
    java.lang.String str3=org.apache.commons.lang.StringUtils.rightPad("A                                                hi!",43,"");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "A                                                hi!"+ "'",str3.equals("A                                                hi!"));
  }
  @Test public void test133() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test133#1106");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test133");
    java.lang.String str2=org.apache.commons.lang.StringUtils.removeEnd("A                                                hi!","Aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "A                                                hi!"+ "'",str2.equals("A                                                hi!"));
  }
  @Test public void test134() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test134#1114");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test134");
    int int2=org.apache.commons.lang.math.NumberUtils.stringToInt(" aaaaaaaaa",(int)'4');
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 52+ "'",int2 == 52);
  }
  @Test public void test135() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test135#1122");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test135");
    int int1=org.apache.commons.lang.math.NumberUtils.toInt("aaaaaaaaaaaaaaaaaaaaAaaaaaaaa");
    org.junit.Assert.assertTrue("'" + int1 + "' != '"+ 0+ "'",int1 == 0);
  }
  @Test public void test136() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test136#1130");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test136");
    long long1=org.apache.commons.lang.math.NumberUtils.toLong("                                                hi!                                                 ");
    org.junit.Assert.assertTrue("'" + long1 + "' != '"+ 0L+ "'",long1 == 0L);
  }
  @Test public void test137() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test137#1138");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test137");
    int int3=org.apache.commons.lang.StringUtils.lastIndexOf("A                                                hi!                                                 ",' ',10);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ 10+ "'",int3 == 10);
  }
  @Test public void test138() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test138#1146");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test138");
    int int2=org.apache.commons.lang.StringUtils.indexOf("                                                ",'a');
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test139() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test139#1154");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test139");
    java.lang.String str1=org.apache.commons.lang.StringUtils.capitalize("hi!                                   A");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "Hi!                                   A"+ "'",str1.equals("Hi!                                   A"));
  }
  @Test public void test140() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test140#1162");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test140");
    int int2=org.apache.commons.lang.math.NumberUtils.compare((float)9,(float)(short)100);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test141() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test141#1170");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test141");
    java.lang.String str3=org.apache.commons.lang.StringUtils.leftPad("aaaaaaaaa ",52,' ');
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "                                          aaaaaaaaa "+ "'",str3.equals("                                          aaaaaaaaa "));
  }
  @Test public void test142() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test142#1178");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test142");
    int int2=org.apache.commons.lang.StringUtils.indexOf("                                          aaaaaaaaa ","aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test143() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test143#1186");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test143");
    int int2=org.apache.commons.lang.StringUtils.indexOfAnyBut("          #############################################################################","A");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 0+ "'",int2 == 0);
  }
  @Test public void test144() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test144#1194");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test144");
    int int1=org.apache.commons.lang.math.NumberUtils.toInt("                                                 !ih                                                ");
    org.junit.Assert.assertTrue("'" + int1 + "' != '"+ 0+ "'",int1 == 0);
  }
  @Test public void test145() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test145#1202");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test145");
    java.lang.String str2=org.apache.commons.lang.StringUtils.left("a                                                HI!                                                 ",(-1));
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test146() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test146#1210");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test146");
    java.lang.String str2=org.apache.commons.lang.StringUtils.remove("",'4');
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test147() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test147#1218");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test147");
    boolean boolean1=org.apache.commons.lang.StringUtils.isNotEmpty("                                                                                                ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test148() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test148#1226");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test148");
    java.lang.String str1=org.apache.commons.lang.StringUtils.chomp("Hi!                                   A");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "Hi!                                   A"+ "'",str1.equals("Hi!                                   A"));
  }
  @Test public void test149() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test149#1234");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test149");
    boolean boolean2=org.apache.commons.lang.StringUtils.containsOnly("                                                                                                         HI!","                                                                                                         HI!");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ true+ "'",boolean2 == true);
  }
  @Test public void test150() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test150#1242");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test150");
    java.lang.String str1=org.apache.commons.lang.StringUtils.trimToNull("#################...");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "#################..."+ "'",str1.equals("#################..."));
  }
  @Test public void test151() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test151#1250");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test151");
    java.lang.String str1=org.apache.commons.lang.StringUtils.capitaliseAllWords("                                   ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "                                   "+ "'",str1.equals("                                   "));
  }
  @Test public void test152() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test152#1258");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test152");
    java.lang.String str3=org.apache.commons.lang.StringUtils.replaceChars("#############################################################################          ",'4','a');
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "#############################################################################          "+ "'",str3.equals("#############################################################################          "));
  }
  @Test public void test153() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test153#1266");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test153");
    int int3=org.apache.commons.lang.StringUtils.lastIndexOf("                                                                                       aaaaaaaaa ",'4',24);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test154() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test154#1274");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test154");
    try {
      java.math.BigInteger bigInteger1=org.apache.commons.lang.math.NumberUtils.createBigInteger("aaaaaaaaaaaaaaaaaaaaAaaaaaaaa");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aa\"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test155() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test155#1285");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test155");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAlphanumeric("                                   ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test156() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test156#1293");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test156");
    int int2=org.apache.commons.lang.math.NumberUtils.compare((double)94,(double)48);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 1+ "'",int2 == 1);
  }
  @Test public void test157() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test157#1301");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test157");
    java.lang.String str2=org.apache.commons.lang.StringUtils.remove("...                          ...","aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "...                          ..."+ "'",str2.equals("...                          ..."));
  }
  @Test public void test158() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test158#1309");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test158");
    int int3=org.apache.commons.lang.StringUtils.lastIndexOf("",' ',43);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test159() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test159#1317");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test159");
    float float2=org.apache.commons.lang.math.NumberUtils.toFloat("A                                                hi!",(float)(short)-1);
    org.junit.Assert.assertTrue("'" + float2 + "' != '"+ (-1.0f)+ "'",float2 == (-1.0f));
  }
  @Test public void test160() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test160#1325");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test160");
    java.lang.String[] strArray1=org.apache.commons.lang.StringUtils.split("#######################################################################################          ");
    java.lang.String str2=org.apache.commons.lang.StringUtils.concatenate((java.lang.Object[])strArray1);
    org.junit.Assert.assertNotNull(strArray1);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "#######################################################################################"+ "'",str2.equals("#######################################################################################"));
  }
  @Test public void test161() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test161#1335");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test161");
    float float2=org.apache.commons.lang.math.NumberUtils.toFloat("a                                                HI!                                                 ",(float)96);
    org.junit.Assert.assertTrue("'" + float2 + "' != '"+ 96.0f+ "'",float2 == 96.0f);
  }
  @Test public void test162() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test162#1343");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test162");
    boolean boolean2=org.apache.commons.lang.StringUtils.contains("                                ",'a');
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test163() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test163#1351");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test163");
    double double3=org.apache.commons.lang.math.NumberUtils.min((double)35L,(double)9,(double)0.0f);
    org.junit.Assert.assertTrue("'" + double3 + "' != '"+ 0.0d+ "'",double3 == 0.0d);
  }
  @Test public void test164() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test164#1359");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test164");
    int int2=org.apache.commons.lang.math.NumberUtils.stringToInt("",3);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 3+ "'",int2 == 3);
  }
  @Test public void test165() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test165#1367");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test165");
    int int1=org.apache.commons.lang.math.NumberUtils.toInt("a                                                HI!");
    org.junit.Assert.assertTrue("'" + int1 + "' != '"+ 0+ "'",int1 == 0);
  }
  @Test public void test166() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test166#1375");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test166");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringBefore("aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa","a                                                HI!                                                 ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa"+ "'",str2.equals("aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa"));
  }
  @Test public void test167() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test167#1383");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test167");
    java.lang.String str2=org.apache.commons.lang.StringUtils.repeat("                                                                                                ",97);
  }
  @Test public void test168() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test168#1390");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test168");
    java.lang.String str2=org.apache.commons.lang.StringUtils.removeStart("                                                                                                ","                        aaaaaaaaaaaaaaaaaaaa                                                        ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                                                                                                "+ "'",str2.equals("                                                                                                "));
  }
  @Test public void test169() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test169#1398");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test169");
    java.lang.String str2=org.apache.commons.lang.StringUtils.getChomp("                        AAAAAAAAAAAAAAAAAAAA                                                        ","#######################################################################################");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test170() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test170#1406");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test170");
    double double1=org.apache.commons.lang.math.NumberUtils.toDouble("                                                                                                ");
    org.junit.Assert.assertTrue("'" + double1 + "' != '"+ 0.0d+ "'",double1 == 0.0d);
  }
  @Test public void test171() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test171#1414");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test171");
    java.lang.String str3=org.apache.commons.lang.StringUtils.replaceChars("aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa",' ','#');
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "aaaaaaaaaaaaaaaaaaaa##Aaaaaaaaa"+ "'",str3.equals("aaaaaaaaaaaaaaaaaaaa##Aaaaaaaaa"));
  }
  @Test public void test172() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test172#1422");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test172");
    try {
      java.math.BigDecimal bigDecimal1=org.apache.commons.lang.math.NumberUtils.createBigDecimal("aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test173() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test173#1433");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test173");
    int int2=org.apache.commons.lang.math.NumberUtils.stringToInt("                             hi!                                   A                             ",0);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 0+ "'",int2 == 0);
  }
  @Test public void test174() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test174#1441");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test174");
    double double3=org.apache.commons.lang.math.NumberUtils.min((double)10,(double)(byte)100,0.0d);
    org.junit.Assert.assertTrue("'" + double3 + "' != '"+ 0.0d+ "'",double3 == 0.0d);
  }
  @Test public void test175() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test175#1449");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test175");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringBeforeLast("aaaaaaaaa                                                                                        ","                                                    ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "aaaaaaaaa                                    "+ "'",str2.equals("aaaaaaaaa                                    "));
  }
  @Test public void test176() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test176#1457");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test176");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringBeforeLast("aaaaaaaaaaaaaaaaaaaa","aaaaaaaaaaaaaaaaaaaaAaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "aaaaaaaaaaaaaaaaaaaa"+ "'",str2.equals("aaaaaaaaaaaaaaaaaaaa"));
  }
  @Test public void test177() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test177#1465");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test177");
    java.lang.String str2=org.apache.commons.lang.StringUtils.getChomp("                                                 !ih                                                ","aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test178() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test178#1473");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test178");
    java.lang.String str2=org.apache.commons.lang.StringUtils.getNestedString("                                                                                                                  HI!"," aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa ");
    org.junit.Assert.assertNull(str2);
  }
  @Test public void test179() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test179#1481");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test179");
    java.lang.String str4=org.apache.commons.lang.StringUtils.overlay("                                   ","Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!",35,29);
    org.junit.Assert.assertTrue("'" + str4 + "' != '"+ "                             Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!"+ "'",str4.equals("                             Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!"));
  }
  @Test public void test180() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test180#1489");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test180");
    java.lang.String str2=org.apache.commons.lang.StringUtils.removeEnd("Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!","a                                                HI!                                                 ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!"+ "'",str2.equals("Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!"));
  }
  @Test public void test181() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test181#1497");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test181");
    int int3=org.apache.commons.lang.StringUtils.ordinalIndexOf(" aaaaaaaaa","a                                                HI!",(int)(short)10);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test182() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test182#1505");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test182");
    int[] intArray0=null;
    try {
      int int1=org.apache.commons.lang.math.NumberUtils.max(intArray0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
    }
 catch (    java.lang.IllegalArgumentException e) {
    }
  }
  @Test public void test183() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test183#1517");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test183");
    boolean boolean2=org.apache.commons.lang.StringUtils.containsOnly("                         i!                         ","                        aaaaaaaaaaaaaaaaaaaa                                                        ");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test184() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test184#1525");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test184");
    int int2=org.apache.commons.lang.StringUtils.indexOfAnyBut("aaaaaaaaaaaaaaaaaaaa","                                                                                       aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test185() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test185#1533");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test185");
    int int2=org.apache.commons.lang.math.NumberUtils.stringToInt("",100);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 100+ "'",int2 == 100);
  }
  @Test public void test186() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test186#1541");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test186");
    java.lang.String str2=org.apache.commons.lang.StringUtils.removeStart("                                                    ","                        aaaaaaaaaaaaaaaaaaaa                                                        ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                                                    "+ "'",str2.equals("                                                    "));
  }
  @Test public void test187() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test187#1549");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test187");
    short short3=org.apache.commons.lang.math.NumberUtils.max((short)(byte)1,(short)-1,(short)(byte)-1);
    org.junit.Assert.assertTrue("'" + short3 + "' != '"+ (short)1+ "'",short3 == (short)1);
  }
  @Test public void test188() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test188#1557");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test188");
    java.lang.String str2=org.apache.commons.lang.StringUtils.removeEnd("          ","hi!");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "          "+ "'",str2.equals("          "));
  }
  @Test public void test189() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test189#1565");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test189");
    int int3=org.apache.commons.lang.StringUtils.lastIndexOf("",'4',0);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test190() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test190#1573");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test190");
    boolean boolean2=org.apache.commons.lang.StringUtils.contains("          ",'a');
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test191() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test191#1581");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test191");
    java.lang.String str3=org.apache.commons.lang.StringUtils.getNestedString("                   ","A","aaaaaaaaa                                                                                        ");
    org.junit.Assert.assertNull(str3);
  }
  @Test public void test192() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test192#1589");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test192");
    java.lang.String str2=org.apache.commons.lang.StringUtils.strip("          ","   ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test193() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test193#1597");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test193");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAsciiPrintable("!ih");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test194() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test194#1605");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test194");
    java.lang.String str1=org.apache.commons.lang.StringUtils.strip("hi!                                   A");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "hi!                                   A"+ "'",str1.equals("hi!                                   A"));
  }
  @Test public void test195() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test195#1613");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test195");
    int int3=org.apache.commons.lang.StringUtils.indexOf("           4            "," ",24);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test196() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test196#1621");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test196");
    double double1=org.apache.commons.lang.math.NumberUtils.toDouble("          ");
    org.junit.Assert.assertTrue("'" + double1 + "' != '"+ 0.0d+ "'",double1 == 0.0d);
  }
  @Test public void test197() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test197#1629");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test197");
    java.lang.String str2=org.apache.commons.lang.StringUtils.removeEnd("                                ","                         i!                         ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                                "+ "'",str2.equals("                                "));
  }
  @Test public void test198() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test198#1637");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test198");
    java.lang.String[] strArray3=org.apache.commons.lang.StringUtils.splitPreserveAllTokens("","4",20);
    org.junit.Assert.assertNotNull(strArray3);
  }
  @Test public void test199() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test199#1645");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test199");
    java.lang.String[] strArray1=org.apache.commons.lang.StringUtils.split("                        AAAAAAAAAAAAAAAAAAAA                                                        ");
    org.junit.Assert.assertNotNull(strArray1);
  }
  @Test public void test200() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test200#1653");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test200");
    java.lang.String str1=org.apache.commons.lang.StringUtils.uncapitalise("H");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "h"+ "'",str1.equals("h"));
  }
  @Test public void test201() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test201#1661");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test201");
    java.lang.String str1=org.apache.commons.lang.StringUtils.chompLast("                   ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "                   "+ "'",str1.equals("                   "));
  }
  @Test public void test202() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test202#1669");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test202");
    java.lang.String[] strArray1=org.apache.commons.lang.StringUtils.splitPreserveAllTokens("H");
    java.lang.String str2=org.apache.commons.lang.StringUtils.concatenate((java.lang.Object[])strArray1);
    org.junit.Assert.assertNotNull(strArray1);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "H"+ "'",str2.equals("H"));
  }
  @Test public void test203() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test203#1679");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test203");
    long long3=org.apache.commons.lang.math.NumberUtils.min((long)(short)1,(long)29,(long)43);
    org.junit.Assert.assertTrue("'" + long3 + "' != '"+ 1L+ "'",long3 == 1L);
  }
  @Test public void test204() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test204#1687");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test204");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringAfter("hi!","4");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test205() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test205#1695");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test205");
    int int2=org.apache.commons.lang.StringUtils.indexOfAny("","hi!");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test206() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test206#1703");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test206");
    java.lang.String str1=org.apache.commons.lang.StringUtils.strip("hi!");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "hi!"+ "'",str1.equals("hi!"));
  }
  @Test public void test207() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test207#1711");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test207");
    int int2=org.apache.commons.lang.StringUtils.lastIndexOf("aa ","... !ih...");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test208() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test208#1719");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test208");
    java.lang.String str2=org.apache.commons.lang.StringUtils.getChomp("i!","                                                ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test209() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test209#1727");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test209");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAlphanumeric("                                                                                       aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test210() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test210#1735");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test210");
    int int2=org.apache.commons.lang.StringUtils.indexOfAnyBut(" ","          ");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test211() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test211#1743");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test211");
    java.lang.String str2=org.apache.commons.lang.StringUtils.rightPad("",(int)' ');
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                                "+ "'",str2.equals("                                "));
  }
  @Test public void test212() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test212#1751");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test212");
    int int2=org.apache.commons.lang.math.NumberUtils.compare((double)20,(double)' ');
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test213() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test213#1759");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test213");
    float float2=org.apache.commons.lang.math.NumberUtils.toFloat("   ",0.0f);
    org.junit.Assert.assertTrue("'" + float2 + "' != '"+ 0.0f+ "'",float2 == 0.0f);
  }
  @Test public void test214() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test214#1767");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test214");
    java.lang.String str1=org.apache.commons.lang.StringUtils.chop("... !ih...");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "... !ih.."+ "'",str1.equals("... !ih.."));
  }
  @Test public void test215() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test215#1775");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test215");
    boolean boolean2=org.apache.commons.lang.StringUtils.equalsIgnoreCase("aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa","a                                                HI!                                                 ");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test216() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test216#1783");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test216");
    java.lang.String str3=org.apache.commons.lang.StringUtils.replace("","... !ih..","                                                 !ih                                                ");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ ""+ "'",str3.equals(""));
  }
  @Test public void test217() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test217#1791");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test217");
    int[] intArray2=new int[]{100,1};
    int[] intArray9=new int[]{(byte)-1,100,(short)0,100,'#',100};
    boolean boolean10=org.apache.commons.lang.math.NumberUtils.equals(intArray2,intArray9);
    int[] intArray17=new int[]{'4',(short)100,(short)100,52,(byte)1,(short)100};
    boolean boolean18=org.apache.commons.lang.math.NumberUtils.equals(intArray9,intArray17);
    int int19=org.apache.commons.lang.math.NumberUtils.max(intArray17);
    int int20=org.apache.commons.lang.math.NumberUtils.min(intArray17);
    org.junit.Assert.assertNotNull(intArray2);
    org.junit.Assert.assertNotNull(intArray9);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '"+ false+ "'",boolean10 == false);
    org.junit.Assert.assertNotNull(intArray17);
    org.junit.Assert.assertTrue("'" + boolean18 + "' != '"+ false+ "'",boolean18 == false);
    org.junit.Assert.assertTrue("'" + int19 + "' != '"+ 100+ "'",int19 == 100);
    org.junit.Assert.assertTrue("'" + int20 + "' != '"+ 1+ "'",int20 == 1);
  }
  @Test public void test218() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test218#1811");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test218");
    java.lang.String str2=org.apache.commons.lang.StringUtils.getNestedString(" aaaaaaaaa","#######################################################################################");
    org.junit.Assert.assertNull(str2);
  }
  @Test public void test219() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test219#1819");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test219");
    boolean boolean2=org.apache.commons.lang.StringUtils.containsOnly("                                                ","");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test220() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test220#1827");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test220");
    java.lang.String str1=org.apache.commons.lang.StringUtils.lowerCase("   ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "   "+ "'",str1.equals("   "));
  }
  @Test public void test221() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test221#1835");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test221");
    short short3=org.apache.commons.lang.math.NumberUtils.max((short)0,(short)0,(short)100);
    org.junit.Assert.assertTrue("'" + short3 + "' != '"+ (short)100+ "'",short3 == (short)100);
  }
  @Test public void test222() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test222#1843");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test222");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringBeforeLast("                 ","           4            ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                 "+ "'",str2.equals("                 "));
  }
  @Test public void test223() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test223#1851");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test223");
    java.lang.String str1=org.apache.commons.lang.StringUtils.strip("A                                                hi!");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "A                                                hi!"+ "'",str1.equals("A                                                hi!"));
  }
  @Test public void test224() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test224#1859");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test224");
    java.lang.String str3=org.apache.commons.lang.StringUtils.replaceOnce("aaaaaaaaaaaaaaaaaaaaAaaaaaaaa","           4            ","aaaaaaaaa                                                                                        ");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "aaaaaaaaaaaaaaaaaaaaAaaaaaaaa"+ "'",str3.equals("aaaaaaaaaaaaaaaaaaaaAaaaaaaaa"));
  }
  @Test public void test225() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test225#1867");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test225");
    java.lang.String str1=org.apache.commons.lang.StringUtils.deleteWhitespace("aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "aaaaaaaaaaaaaaaaaaaaAaaaaaaaa"+ "'",str1.equals("aaaaaaaaaaaaaaaaaaaaAaaaaaaaa"));
  }
  @Test public void test226() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test226#1875");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test226");
    java.lang.String[] strArray1=org.apache.commons.lang.StringUtils.split("          ");
    java.lang.String[] strArray3=org.apache.commons.lang.StringUtils.stripAll(strArray1,"#################...");
    java.lang.Class<?> wildcardClass4=strArray1.getClass();
    org.junit.Assert.assertNotNull(strArray1);
    org.junit.Assert.assertNotNull(strArray3);
    org.junit.Assert.assertNotNull(wildcardClass4);
  }
  @Test public void test227() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test227#1887");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test227");
    java.lang.String str2=org.apache.commons.lang.StringUtils.stripStart("4444444Hi!","");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "4444444Hi!"+ "'",str2.equals("4444444Hi!"));
  }
  @Test public void test228() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test228#1895");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test228");
    java.lang.String str2=org.apache.commons.lang.StringUtils.getPrechomp("                        AAAAAAAAAAAAAAAAAAAA                                                        ","          ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "          "+ "'",str2.equals("          "));
  }
  @Test public void test229() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test229#1903");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test229");
    boolean boolean1=org.apache.commons.lang.StringUtils.isEmpty("4");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test230() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test230#1911");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test230");
    boolean boolean2=org.apache.commons.lang.StringUtils.equals("                             Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!","                                                ");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test231() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test231#1919");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test231");
    java.lang.String str1=org.apache.commons.lang.StringUtils.trimToEmpty("           4            ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "4"+ "'",str1.equals("4"));
  }
  @Test public void test232() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test232#1927");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test232");
    char[] charArray1=null;
    int int2=org.apache.commons.lang.StringUtils.indexOfAnyBut("                         i!                         ",charArray1);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test233() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test233#1936");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test233");
    java.lang.String str2=org.apache.commons.lang.StringUtils.stripEnd("                   ","aaaaaaaaa                                                                                        ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test234() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test234#1944");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test234");
    boolean boolean1=org.apache.commons.lang.StringUtils.isNotBlank("aaaaaaaaa                                                                                        ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test235() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test235#1952");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test235");
    double double2=org.apache.commons.lang.math.NumberUtils.toDouble("Hi!",(double)32);
    org.junit.Assert.assertTrue("'" + double2 + "' != '"+ 32.0d+ "'",double2 == 32.0d);
  }
  @Test public void test236() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test236#1960");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test236");
    java.lang.String str2=org.apache.commons.lang.StringUtils.reverseDelimited("",'#');
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test237() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test237#1968");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test237");
    java.lang.String str2=org.apache.commons.lang.StringUtils.chomp("A                                                hi!","aa ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "A                                                hi!"+ "'",str2.equals("A                                                hi!"));
  }
  @Test public void test238() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test238#1976");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test238");
    int int2=org.apache.commons.lang.StringUtils.indexOfAnyBut("4","                        AAAAAAAAAAAAAAAAAAAA                                                        ");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 0+ "'",int2 == 0);
  }
  @Test public void test239() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test239#1984");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test239");
    boolean boolean2=org.apache.commons.lang.StringUtils.contains("... !ih..",'a');
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test240() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test240#1992");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test240");
    java.util.Collection collection0=null;
    java.lang.String str2=org.apache.commons.lang.StringUtils.join(collection0,"                                                                                                         HI!");
    org.junit.Assert.assertNull(str2);
  }
  @Test public void test241() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test241#2001");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test241");
    java.lang.String str1=org.apache.commons.lang.StringUtils.trimToNull("   ");
    org.junit.Assert.assertNull(str1);
  }
  @Test public void test242() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test242#2009");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test242");
    long long3=org.apache.commons.lang.math.NumberUtils.min((long)94,10L,1L);
    org.junit.Assert.assertTrue("'" + long3 + "' != '"+ 1L+ "'",long3 == 1L);
  }
  @Test public void test243() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test243#2017");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test243");
    java.lang.String str1=org.apache.commons.lang.StringUtils.strip("i!");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "i!"+ "'",str1.equals("i!"));
  }
  @Test public void test244() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test244#2025");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test244");
    java.lang.String str1=org.apache.commons.lang.StringUtils.escape("4");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "4"+ "'",str1.equals("4"));
  }
  @Test public void test245() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test245#2033");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test245");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAlpha("                        aaaaaaaaaaaaaaaaaaaa                                                        ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test246() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test246#2041");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test246");
    java.lang.String str2=org.apache.commons.lang.StringUtils.chomp("h","");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "h"+ "'",str2.equals("h"));
  }
  @Test public void test247() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test247#2049");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test247");
    short short3=org.apache.commons.lang.math.NumberUtils.max((short)(byte)-1,(short)1,(short)100);
    org.junit.Assert.assertTrue("'" + short3 + "' != '"+ (short)100+ "'",short3 == (short)100);
  }
  @Test public void test248() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test248#2057");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test248");
    long long1=org.apache.commons.lang.math.NumberUtils.toLong("a                                                HI!                                                 ");
    org.junit.Assert.assertTrue("'" + long1 + "' != '"+ 0L+ "'",long1 == 0L);
  }
  @Test public void test249() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test249#2065");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test249");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substring("#######################################################################################          ",(int)(byte)100);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test250() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test250#2073");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test250");
    int int2=org.apache.commons.lang.math.NumberUtils.compare((float)(byte)100,0.0f);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 1+ "'",int2 == 1);
  }
  @Test public void test251() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test251#2081");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test251");
    try {
      java.lang.Number number1=org.apache.commons.lang.math.NumberUtils.createNumber("aaaaaaaaaaaaaaaaaaaaAaaaaaaaa");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: aaaaaaaaaaaaaaaaaaaaAaaaaaaaa is not a valid number.");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test252() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test252#2092");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test252");
    java.lang.String str1=org.apache.commons.lang.StringUtils.deleteWhitespace("aaaaaaaaaaaaaaaaaaaaAaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "aaaaaaaaaaaaaaaaaaaaAaaaaaaaa"+ "'",str1.equals("aaaaaaaaaaaaaaaaaaaaAaaaaaaaa"));
  }
  @Test public void test253() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test253#2100");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test253");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.splitByWholeSeparator("aa ","A                                                hi!");
    org.junit.Assert.assertNotNull(strArray2);
  }
  @Test public void test254() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test254#2108");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test254");
    short[] shortArray0=null;
    try {
      short short1=org.apache.commons.lang.math.NumberUtils.min(shortArray0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
    }
 catch (    java.lang.IllegalArgumentException e) {
    }
  }
  @Test public void test255() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test255#2120");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test255");
    try {
      java.lang.Integer int1=org.apache.commons.lang.math.NumberUtils.createInteger("A                                                hi!                                                 ");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"A                                                hi!                                                 \"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test256() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test256#2131");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test256");
    java.util.Iterator iterator0=null;
    java.lang.String str2=org.apache.commons.lang.StringUtils.join(iterator0,"aaaaaaaaaaaaaaaaaaaa##Aaaaaaaaa");
    org.junit.Assert.assertNull(str2);
  }
  @Test public void test257() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test257#2140");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test257");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.split("                                                hi!                                                 ",'4');
    org.junit.Assert.assertNotNull(strArray2);
  }
  @Test public void test258() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test258#2148");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test258");
    long long3=org.apache.commons.lang.math.NumberUtils.max((long)96,(long)(short)0,(long)(short)-1);
    org.junit.Assert.assertTrue("'" + long3 + "' != '"+ 96L+ "'",long3 == 96L);
  }
  @Test public void test259() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test259#2156");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test259");
    java.lang.String str1=org.apache.commons.lang.StringUtils.uncapitalise("aaaaaaaaaaaaaaaaaaaa                                ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "aaaaaaaaaaaaaaaaaaaa                                "+ "'",str1.equals("aaaaaaaaaaaaaaaaaaaa                                "));
  }
  @Test public void test260() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test260#2164");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test260");
    int int2=org.apache.commons.lang.StringUtils.indexOfAnyBut("                             hi!                                   A                             ","");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test261() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test261#2172");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test261");
    java.lang.String str1=org.apache.commons.lang.StringUtils.trimToEmpty("                                                                                                    ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ ""+ "'",str1.equals(""));
  }
  @Test public void test262() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test262#2180");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test262");
    int int2=org.apache.commons.lang.StringUtils.indexOfDifference("                             hi!                                   A                             ","aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 0+ "'",int2 == 0);
  }
  @Test public void test263() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test263#2188");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test263");
    short short3=org.apache.commons.lang.math.NumberUtils.max((short)1,(short)(byte)-1,(short)(byte)-1);
    org.junit.Assert.assertTrue("'" + short3 + "' != '"+ (short)1+ "'",short3 == (short)1);
  }
  @Test public void test264() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test264#2196");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test264");
    boolean boolean2=org.apache.commons.lang.StringUtils.equals("aa ","a                                                HI!");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test265() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test265#2204");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test265");
    int int2=org.apache.commons.lang.math.NumberUtils.compare((float)3,(float)96);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test266() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test266#2212");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test266");
    try {
      java.lang.Number number1=org.apache.commons.lang.math.NumberUtils.createNumber("!ih");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: !ih is not a valid number.");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test267() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test267#2223");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test267");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringBetween("aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa ","Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!");
    org.junit.Assert.assertNull(str2);
  }
  @Test public void test268() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test268#2231");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test268");
    float float1=org.apache.commons.lang.math.NumberUtils.toFloat("a                                                HI!");
    org.junit.Assert.assertTrue("'" + float1 + "' != '"+ 0.0f+ "'",float1 == 0.0f);
  }
  @Test public void test269() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test269#2239");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test269");
    java.lang.String str3=org.apache.commons.lang.StringUtils.center("                                ",(int)(byte)100,'4');
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "4444444444444444444444444444444444                                4444444444444444444444444444444444"+ "'",str3.equals("4444444444444444444444444444444444                                4444444444444444444444444444444444"));
  }
  @Test public void test270() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test270#2247");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test270");
    boolean boolean2=org.apache.commons.lang.StringUtils.equals("   ","   ");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ true+ "'",boolean2 == true);
  }
  @Test public void test271() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test271#2255");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test271");
    try {
      java.lang.Long long1=org.apache.commons.lang.math.NumberUtils.createLong("                 ");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                 \"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test272() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test272#2266");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test272");
    java.lang.String str2=org.apache.commons.lang.StringUtils.right("#######################################################################################",(int)(short)0);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test273() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test273#2274");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test273");
    try {
      java.math.BigDecimal bigDecimal1=org.apache.commons.lang.math.NumberUtils.createBigDecimal("aaaaaaaaaaaaaaaaaaaa");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test274() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test274#2285");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test274");
    boolean boolean1=org.apache.commons.lang.StringUtils.isNotEmpty("                         i!                         ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test275() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test275#2293");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test275");
    int int2=org.apache.commons.lang.math.NumberUtils.toInt("                 ",(int)(byte)0);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 0+ "'",int2 == 0);
  }
  @Test public void test276() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test276#2301");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test276");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringBefore("          #############################################################################","!ih");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "          #############################################################################"+ "'",str2.equals("          #############################################################################"));
  }
  @Test public void test277() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test277#2309");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test277");
    java.lang.Object[] objArray0=null;
    java.lang.String str2=org.apache.commons.lang.StringUtils.join(objArray0,'#');
    org.junit.Assert.assertNull(str2);
  }
  @Test public void test278() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test278#2318");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test278");
    java.lang.String str4=org.apache.commons.lang.StringUtils.overlay("                                          aaaaaaaaa ","i!",(int)'4',(int)(short)100);
    org.junit.Assert.assertTrue("'" + str4 + "' != '"+ "                                          aaaaaaaaa i!"+ "'",str4.equals("                                          aaaaaaaaa i!"));
  }
  @Test public void test279() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test279#2326");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test279");
    double double1=org.apache.commons.lang.math.NumberUtils.toDouble("                                                    ");
    org.junit.Assert.assertTrue("'" + double1 + "' != '"+ 0.0d+ "'",double1 == 0.0d);
  }
  @Test public void test280() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test280#2334");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test280");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAlpha(" aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test281() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test281#2342");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test281");
    int int3=org.apache.commons.lang.math.NumberUtils.max(52,10,24);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ 52+ "'",int3 == 52);
  }
  @Test public void test282() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test282#2350");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test282");
    java.lang.String[] strArray1=org.apache.commons.lang.StringUtils.split("aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa ");
    org.junit.Assert.assertNotNull(strArray1);
  }
  @Test public void test283() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test283#2358");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test283");
    java.lang.String str3=org.apache.commons.lang.StringUtils.substringBetween("                                                                                       aaaaaaaaa ","                                                 !ih                                                ","                        AAAAAAAAAAAAAAAAAAAA                                                        ");
    org.junit.Assert.assertNull(str3);
  }
  @Test public void test284() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test284#2366");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test284");
    boolean boolean2=org.apache.commons.lang.StringUtils.containsIgnoreCase("","");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ true+ "'",boolean2 == true);
  }
  @Test public void test285() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test285#2374");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test285");
    float float3=org.apache.commons.lang.math.NumberUtils.max((float)(byte)10,(float)'a',(float)94);
    org.junit.Assert.assertTrue("'" + float3 + "' != '"+ 97.0f+ "'",float3 == 97.0f);
  }
  @Test public void test286() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test286#2382");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test286");
    byte byte3=org.apache.commons.lang.math.NumberUtils.min((byte)0,(byte)-1,(byte)100);
    org.junit.Assert.assertTrue("'" + byte3 + "' != '"+ (byte)-1+ "'",byte3 == (byte)-1);
  }
  @Test public void test287() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test287#2390");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test287");
    java.lang.String str2=org.apache.commons.lang.StringUtils.rightPad("A",(int)(short)1);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "A"+ "'",str2.equals("A"));
  }
  @Test public void test288() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test288#2398");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test288");
    java.lang.String str2=org.apache.commons.lang.StringUtils.stripStart("                        AAAAAAAAAAAAAAAAAAAA                                                        ","aaaaaaaaaaaaaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                        AAAAAAAAAAAAAAAAAAAA                                                        "+ "'",str2.equals("                        AAAAAAAAAAAAAAAAAAAA                                                        "));
  }
  @Test public void test289() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test289#2406");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test289");
    int int1=org.apache.commons.lang.math.NumberUtils.toInt("#################...");
    org.junit.Assert.assertTrue("'" + int1 + "' != '"+ 0+ "'",int1 == 0);
  }
  @Test public void test290() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test290#2414");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test290");
    boolean boolean1=org.apache.commons.lang.StringUtils.isEmpty("                                                ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test291() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test291#2422");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test291");
    java.lang.String str3=org.apache.commons.lang.StringUtils.substring(" aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa ",43,24);
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ ""+ "'",str3.equals(""));
  }
  @Test public void test292() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test292#2430");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test292");
    int int3=org.apache.commons.lang.StringUtils.lastIndexOf("                         i!                         ","aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa",0);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test293() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test293#2438");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test293");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAlphaSpace("                                                                                                                  HI!");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test294() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test294#2446");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test294");
    java.lang.String str2=org.apache.commons.lang.StringUtils.remove("...                          ..."," aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "...                          ..."+ "'",str2.equals("...                          ..."));
  }
  @Test public void test295() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test295#2454");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test295");
    int int3=org.apache.commons.lang.StringUtils.ordinalIndexOf("... !ih..","aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa ",48);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test296() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test296#2462");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test296");
    int int2=org.apache.commons.lang.StringUtils.indexOfDifference("                                                                                       aaaaaaaaa ","#######################################################################################          ");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 0+ "'",int2 == 0);
  }
  @Test public void test297() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test297#2470");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test297");
    java.lang.String str2=org.apache.commons.lang.StringUtils.prechomp("   ","                                                                                                                  HI!");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "   "+ "'",str2.equals("   "));
  }
  @Test public void test298() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test298#2478");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test298");
    java.lang.String str2=org.apache.commons.lang.StringUtils.removeEnd("                   ","                             hi!                                   A                             ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                   "+ "'",str2.equals("                   "));
  }
  @Test public void test299() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test299#2486");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test299");
    java.lang.String str4=org.apache.commons.lang.StringUtils.replace("Aaaaaaaaa","                   ","                                   ",(int)(byte)100);
    org.junit.Assert.assertTrue("'" + str4 + "' != '"+ "Aaaaaaaaa"+ "'",str4.equals("Aaaaaaaaa"));
  }
  @Test public void test300() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test300#2494");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test300");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAlpha("i!");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test301() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test301#2502");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test301");
    byte byte3=org.apache.commons.lang.math.NumberUtils.min((byte)0,(byte)10,(byte)0);
    org.junit.Assert.assertTrue("'" + byte3 + "' != '"+ (byte)0+ "'",byte3 == (byte)0);
  }
  @Test public void test302() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test302#2510");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test302");
    java.lang.String str1=org.apache.commons.lang.StringUtils.stripToEmpty("");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ ""+ "'",str1.equals(""));
  }
  @Test public void test303() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test303#2518");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test303");
    boolean boolean2=org.apache.commons.lang.StringUtils.equals("                             hi!                                   A                             ","#######################################################################################");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test304() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test304#2526");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test304");
    int int3=org.apache.commons.lang.StringUtils.ordinalIndexOf("                                                ","... !ih..",(int)(short)10);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test305() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test305#2534");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test305");
    java.lang.String str3=org.apache.commons.lang.StringUtils.abbreviate("",0,(int)'a');
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ ""+ "'",str3.equals(""));
  }
  @Test public void test306() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test306#2542");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test306");
    java.lang.String str1=org.apache.commons.lang.StringUtils.stripToNull("4");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "4"+ "'",str1.equals("4"));
  }
  @Test public void test307() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test307#2550");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test307");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringAfterLast("","#################...");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test308() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test308#2558");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test308");
    java.lang.String str4=org.apache.commons.lang.StringUtils.replace("aaaaaaaaa                                    ","hi!                                   A","                        AAAAAAAAAAAAAAAAAAAA                                                        ",(int)(byte)10);
    org.junit.Assert.assertTrue("'" + str4 + "' != '"+ "aaaaaaaaa                                    "+ "'",str4.equals("aaaaaaaaa                                    "));
  }
  @Test public void test309() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test309#2566");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test309");
    java.lang.String str4=org.apache.commons.lang.StringUtils.overlay("   ","#######################################################################################",10,(int)'#');
    org.junit.Assert.assertTrue("'" + str4 + "' != '"+ "   #######################################################################################"+ "'",str4.equals("   #######################################################################################"));
  }
  @Test public void test310() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test310#2574");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test310");
    java.lang.String str2=org.apache.commons.lang.StringUtils.stripStart(" aaaaaaaaa","                             hi!                                   A                             ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "aaaaaaaaa"+ "'",str2.equals("aaaaaaaaa"));
  }
  @Test public void test311() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test311#2582");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test311");
    boolean boolean2=org.apache.commons.lang.StringUtils.containsIgnoreCase("Hi!","                                                hi!                                                 ");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test312() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test312#2590");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test312");
    java.lang.String str2=org.apache.commons.lang.StringUtils.remove("                                ",' ');
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test313() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test313#2598");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test313");
    java.lang.String str2=org.apache.commons.lang.StringUtils.stripStart("                 ","hi!");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                 "+ "'",str2.equals("                 "));
  }
  @Test public void test314() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test314#2606");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test314");
    java.lang.String str1=org.apache.commons.lang.StringUtils.reverse("444444444444444444444444444444444444444444444          444444444444444444444444444444444444444444444");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "444444444444444444444444444444444444444444444          444444444444444444444444444444444444444444444"+ "'",str1.equals("444444444444444444444444444444444444444444444          444444444444444444444444444444444444444444444"));
  }
  @Test public void test315() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test315#2614");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test315");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAlphanumericSpace("   #######################################################################################");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test316() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test316#2622");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test316");
    java.lang.String str2=org.apache.commons.lang.StringUtils.remove(" ",'#');
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ " "+ "'",str2.equals(" "));
  }
  @Test public void test317() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test317#2630");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test317");
    java.lang.String str2=org.apache.commons.lang.StringUtils.remove("          #############################################################################","                        AAAAAAAAAAAAAAAAAAAA                                                        ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "          #############################################################################"+ "'",str2.equals("          #############################################################################"));
  }
  @Test public void test318() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test318#2638");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test318");
    java.lang.String str1=org.apache.commons.lang.StringUtils.capitalize("                                                                                       aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "                                                                                       aaaaaaaaa "+ "'",str1.equals("                                                                                       aaaaaaaaa "));
  }
  @Test public void test319() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test319#2646");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test319");
    java.lang.String str4=org.apache.commons.lang.StringUtils.overlay("4444444Hi!","aaaaaaaaa                                                                                        ",32,32);
    org.junit.Assert.assertTrue("'" + str4 + "' != '"+ "4444444Hi!aaaaaaaaa                                                                                        "+ "'",str4.equals("4444444Hi!aaaaaaaaa                                                                                        "));
  }
  @Test public void test320() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test320#2654");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test320");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAsciiPrintable("aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test321() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test321#2662");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test321");
    int int3=org.apache.commons.lang.StringUtils.lastIndexOf("aaaaaaaaa","!ih",3);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test322() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test322#2670");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test322");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAlphaSpace("aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test323() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test323#2678");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test323");
    java.lang.String str2=org.apache.commons.lang.StringUtils.center("...                          ...",(int)(short)1);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "...                          ..."+ "'",str2.equals("...                          ..."));
  }
  @Test public void test324() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test324#2686");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test324");
    java.lang.String str2=org.apache.commons.lang.StringUtils.remove("   #######################################################################################",'a');
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "   #######################################################################################"+ "'",str2.equals("   #######################################################################################"));
  }
  @Test public void test325() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test325#2694");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test325");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAlphanumericSpace(" aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test326() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test326#2702");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test326");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringBefore("Aaaaaaaaa","aaaaaaaaaaaaaaaaaaaa                                ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "Aaaaaaaaa"+ "'",str2.equals("Aaaaaaaaa"));
  }
  @Test public void test327() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test327#2710");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test327");
    java.lang.String str1=org.apache.commons.lang.StringUtils.deleteSpaces("                   ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ ""+ "'",str1.equals(""));
  }
  @Test public void test328() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test328#2718");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test328");
    boolean boolean1=org.apache.commons.lang.StringUtils.isNotBlank("                                                                                                 ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test329() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test329#2726");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test329");
    java.lang.String str3=org.apache.commons.lang.StringUtils.center("a                                                HI!",35,'4');
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "a                                                HI!"+ "'",str3.equals("a                                                HI!"));
  }
  @Test public void test330() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test330#2734");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test330");
    java.lang.String str2=org.apache.commons.lang.StringUtils.getNestedString("aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa ","Hi!");
    org.junit.Assert.assertNull(str2);
  }
  @Test public void test331() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test331#2742");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test331");
    boolean boolean1=org.apache.commons.lang.math.NumberUtils.isNumber(" aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test332() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test332#2750");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test332");
    java.lang.String[] strArray1=org.apache.commons.lang.StringUtils.split("4444444Hi!");
    org.junit.Assert.assertNotNull(strArray1);
  }
  @Test public void test333() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test333#2758");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test333");
    int int2=org.apache.commons.lang.StringUtils.getLevenshteinDistance("aaaaaaaaa                                                                                        ","Aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 88+ "'",int2 == 88);
  }
  @Test public void test334() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test334#2766");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test334");
    java.lang.String str1=org.apache.commons.lang.StringUtils.chop("444444444444444444444444444444444444444444444          444444444444444444444444444444444444444444444");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "444444444444444444444444444444444444444444444          44444444444444444444444444444444444444444444"+ "'",str1.equals("444444444444444444444444444444444444444444444          44444444444444444444444444444444444444444444"));
  }
  @Test public void test335() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test335#2774");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test335");
    java.lang.String str2=org.apache.commons.lang.StringUtils.prechomp("aaaaaaaaaaaaaaaaaaaa##Aaaaaaaaa","                                                                                                 ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "aaaaaaaaaaaaaaaaaaaa##Aaaaaaaaa"+ "'",str2.equals("aaaaaaaaaaaaaaaaaaaa##Aaaaaaaaa"));
  }
  @Test public void test336() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test336#2782");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test336");
    java.lang.String str3=org.apache.commons.lang.StringUtils.leftPad("          ",(int)(short)0,"4444444Hi!aaaaaaaaa                                                                                        ");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "          "+ "'",str3.equals("          "));
  }
  @Test public void test337() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test337#2790");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test337");
    boolean boolean2=org.apache.commons.lang.StringUtils.containsOnly("aaaaaaaaa ","... !ih...");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test338() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test338#2798");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test338");
    try {
      java.lang.String str2=org.apache.commons.lang.StringUtils.chompLast("aaaaaaaaaaaaaaaaaaaa","aaaaaaaaa                                                                                        ");
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -77");
    }
 catch (    java.lang.StringIndexOutOfBoundsException e) {
    }
  }
  @Test public void test339() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test339#2809");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test339");
    java.lang.String str3=org.apache.commons.lang.StringUtils.leftPad("",(int)'#','a');
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"+ "'",str3.equals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
  }
  @Test public void test340() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test340#2817");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test340");
    java.lang.String str1=org.apache.commons.lang.StringUtils.deleteSpaces("!ih");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "!ih"+ "'",str1.equals("!ih"));
  }
  @Test public void test341() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test341#2825");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test341");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAlphanumericSpace("           4            ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test342() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test342#2833");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test342");
    int int3=org.apache.commons.lang.StringUtils.lastIndexOf("Hi!                                   A","Hi!",88);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ 0+ "'",int3 == 0);
  }
  @Test public void test343() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test343#2841");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test343");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringBeforeLast("aa ","aa ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test344() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test344#2849");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test344");
    boolean boolean2=org.apache.commons.lang.StringUtils.containsNone("   ","                         i!                         ");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test345() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test345#2857");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test345");
    java.lang.String str2=org.apache.commons.lang.StringUtils.chomp("aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa ","");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa "+ "'",str2.equals("aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa "));
  }
  @Test public void test346() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test346#2865");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test346");
    java.lang.String str3=org.apache.commons.lang.StringUtils.rightPad("A                                                hi!",(int)(byte)1,'#');
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "A                                                hi!"+ "'",str3.equals("A                                                hi!"));
  }
  @Test public void test347() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test347#2873");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test347");
    int int3=org.apache.commons.lang.math.NumberUtils.max((-1),(int)(byte)100,32);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ 100+ "'",int3 == 100);
  }
  @Test public void test348() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test348#2881");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test348");
    java.lang.String str3=org.apache.commons.lang.StringUtils.leftPad("   #######################################################################################",(int)(short)1,"");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "   #######################################################################################"+ "'",str3.equals("   #######################################################################################"));
  }
  @Test public void test349() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test349#2889");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test349");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substring("                   ",52);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test350() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test350#2897");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test350");
    java.lang.String str1=org.apache.commons.lang.StringUtils.uncapitalise("                                                                                                                  HI!");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "                                                                                                                  HI!"+ "'",str1.equals("                                                                                                                  HI!"));
  }
  @Test public void test351() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test351#2905");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test351");
    long long3=org.apache.commons.lang.math.NumberUtils.min((long)3,9L,(long)(byte)1);
    org.junit.Assert.assertTrue("'" + long3 + "' != '"+ 1L+ "'",long3 == 1L);
  }
  @Test public void test352() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test352#2913");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test352");
    java.lang.String str2=org.apache.commons.lang.StringUtils.getNestedString("aa ","a                                                HI!");
    org.junit.Assert.assertNull(str2);
  }
  @Test public void test353() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test353#2921");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test353");
    java.lang.String str2=org.apache.commons.lang.StringUtils.removeEnd("                         i!                         ","aaaaaaaaa                                                                                        ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                         i!                         "+ "'",str2.equals("                         i!                         "));
  }
  @Test public void test354() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test354#2929");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test354");
    int int2=org.apache.commons.lang.StringUtils.indexOfDifference("   #######################################################################################","           4            ");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 3+ "'",int2 == 3);
  }
  @Test public void test355() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test355#2937");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test355");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAsciiPrintable("");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test356() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test356#2945");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test356");
    boolean boolean1=org.apache.commons.lang.StringUtils.isNumericSpace("4444444Hi!");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test357() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test357#2953");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test357");
    int int2=org.apache.commons.lang.math.NumberUtils.stringToInt("4",(int)(byte)-1);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 4+ "'",int2 == 4);
  }
  @Test public void test358() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test358#2961");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test358");
    java.lang.String str2=org.apache.commons.lang.StringUtils.repeat("Aaaaaaaaa",4);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa"+ "'",str2.equals("AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa"));
  }
  @Test public void test359() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test359#2969");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test359");
    boolean boolean2=org.apache.commons.lang.StringUtils.contains("aaaaaaaaaaaaaaaaaaaa                                ",'4');
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test360() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test360#2977");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test360");
    java.lang.String str2=org.apache.commons.lang.StringUtils.abbreviate("aaaaaaaaa",100);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "aaaaaaaaa"+ "'",str2.equals("aaaaaaaaa"));
  }
  @Test public void test361() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test361#2985");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test361");
    int int3=org.apache.commons.lang.math.NumberUtils.min(9,(int)(byte)0,(int)'#');
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ 0+ "'",int3 == 0);
  }
  @Test public void test362() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test362#2993");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test362");
    int int2=org.apache.commons.lang.StringUtils.lastIndexOf("",'a');
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test363() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test363#3001");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test363");
    java.lang.String str2=org.apache.commons.lang.StringUtils.difference("","aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "aaaaaaaaa "+ "'",str2.equals("aaaaaaaaa "));
  }
  @Test public void test364() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test364#3009");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test364");
    boolean boolean2=org.apache.commons.lang.StringUtils.equalsIgnoreCase("aaaaaaaaaaaaaaaaaaaa"," aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test365() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test365#3017");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test365");
    java.lang.String str1=org.apache.commons.lang.StringUtils.strip("   ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ ""+ "'",str1.equals(""));
  }
  @Test public void test366() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test366#3025");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test366");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.splitPreserveAllTokens("                        AAAAAAAAAAAAAAAAAAAA                                                        ",'4');
    org.junit.Assert.assertNotNull(strArray2);
  }
  @Test public void test367() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test367#3033");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test367");
    int int3=org.apache.commons.lang.StringUtils.lastIndexOf("Aaaaaaaaa ",'4',4);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test368() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test368#3041");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test368");
    boolean boolean1=org.apache.commons.lang.StringUtils.isNumericSpace("                                          aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test369() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test369#3049");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test369");
    java.lang.String str1=org.apache.commons.lang.StringUtils.upperCase("#############################################################################          ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "#############################################################################          "+ "'",str1.equals("#############################################################################          "));
  }
  @Test public void test370() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test370#3057");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test370");
    boolean boolean2=org.apache.commons.lang.StringUtils.equals("aaaaaaaaa                                    ","aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test371() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test371#3065");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test371");
    double double3=org.apache.commons.lang.math.NumberUtils.max(0.0d,(double)29,0.0d);
    org.junit.Assert.assertTrue("'" + double3 + "' != '"+ 29.0d+ "'",double3 == 29.0d);
  }
  @Test public void test372() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test372#3073");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test372");
    java.lang.String str2=org.apache.commons.lang.StringUtils.getNestedString("a                                                HI!","                                                ");
    org.junit.Assert.assertNull(str2);
  }
  @Test public void test373() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test373#3081");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test373");
    java.lang.String str2=org.apache.commons.lang.StringUtils.getPrechomp("aaaaaaaaaaaaaaaaaaaa","aaaaaaaaaaaaaaaaaaaa                                ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test374() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test374#3089");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test374");
    java.lang.String str1=org.apache.commons.lang.StringUtils.capitaliseAllWords("                                                                                       aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "                                                                                       Aaaaaaaaa "+ "'",str1.equals("                                                                                       Aaaaaaaaa "));
  }
  @Test public void test375() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test375#3097");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test375");
    double double3=org.apache.commons.lang.math.NumberUtils.min((double)9L,9.0d,0.0d);
    org.junit.Assert.assertTrue("'" + double3 + "' != '"+ 0.0d+ "'",double3 == 0.0d);
  }
  @Test public void test376() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test376#3105");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test376");
    try {
      java.lang.Float float1=org.apache.commons.lang.math.NumberUtils.createFloat("AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa\"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test377() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test377#3116");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test377");
    int int1=org.apache.commons.lang.math.NumberUtils.toInt("Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!");
    org.junit.Assert.assertTrue("'" + int1 + "' != '"+ 0+ "'",int1 == 0);
  }
  @Test public void test378() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test378#3124");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test378");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringBeforeLast("                                ","                 ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "               "+ "'",str2.equals("               "));
  }
  @Test public void test379() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test379#3132");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test379");
    java.lang.String str2=org.apache.commons.lang.StringUtils.getNestedString("                                                                                                ","");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test380() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test380#3140");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test380");
    java.lang.String str1=org.apache.commons.lang.StringUtils.trimToEmpty("                                                hi!                                                 ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "hi!"+ "'",str1.equals("hi!"));
  }
  @Test public void test381() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test381#3148");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test381");
    try {
      java.lang.Number number1=org.apache.commons.lang.math.NumberUtils.createNumber("4444444Hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 4444444Hi! is not a valid number.");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test382() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test382#3159");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test382");
    java.lang.String str2=org.apache.commons.lang.StringUtils.prechomp("aaaaaaaaa ","                                                                                                 ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "aaaaaaaaa "+ "'",str2.equals("aaaaaaaaa "));
  }
  @Test public void test383() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test383#3167");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test383");
    float float1=org.apache.commons.lang.math.NumberUtils.toFloat("                                                                                                 ");
    org.junit.Assert.assertTrue("'" + float1 + "' != '"+ 0.0f+ "'",float1 == 0.0f);
  }
  @Test public void test384() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test384#3175");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test384");
    java.lang.String[] strArray3=org.apache.commons.lang.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"," aaaaaaaaa",29);
    org.junit.Assert.assertNotNull(strArray3);
  }
  @Test public void test385() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test385#3183");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test385");
    java.lang.String str3=org.apache.commons.lang.StringUtils.replace("aaaaaaaaaaaaaaaaaaaaAaaaaaaaa","                                                                                                                  HI!","#######################################################################################");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "aaaaaaaaaaaaaaaaaaaaAaaaaaaaa"+ "'",str3.equals("aaaaaaaaaaaaaaaaaaaaAaaaaaaaa"));
  }
  @Test public void test386() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test386#3191");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test386");
    boolean boolean2=org.apache.commons.lang.StringUtils.containsIgnoreCase("aaaaaaaaa                                    ","                   ");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ true+ "'",boolean2 == true);
  }
  @Test public void test387() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test387#3199");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test387");
    java.lang.String str1=org.apache.commons.lang.StringUtils.deleteSpaces(" aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "aaaaaaaaaaaaaaaaaaaaAaaaaaaaa"+ "'",str1.equals("aaaaaaaaaaaaaaaaaaaaAaaaaaaaa"));
  }
  @Test public void test388() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test388#3207");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test388");
    boolean boolean1=org.apache.commons.lang.StringUtils.isWhitespace("... !ih..");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test389() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test389#3215");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test389");
    boolean boolean2=org.apache.commons.lang.StringUtils.containsNone("a                                                HI!                                                 ","#######################################################################################          ");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test390() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test390#3223");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test390");
    java.lang.String str1=org.apache.commons.lang.StringUtils.stripToEmpty("#############################################################################          ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "#############################################################################"+ "'",str1.equals("#############################################################################"));
  }
  @Test public void test391() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test391#3231");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test391");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.split("                                   ","");
    java.lang.String str4=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray2,"                                                ");
    try {
      java.lang.String str8=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray2,"...                          ...",(int)(byte)1,32);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
    }
 catch (    java.lang.ArrayIndexOutOfBoundsException e) {
    }
    org.junit.Assert.assertNotNull(strArray2);
    org.junit.Assert.assertTrue("'" + str4 + "' != '"+ "                                   "+ "'",str4.equals("                                   "));
  }
  @Test public void test392() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test392#3246");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test392");
    try {
      java.math.BigInteger bigInteger1=org.apache.commons.lang.math.NumberUtils.createBigInteger("                                                                                       aaaaaaaaa ");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"       \"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test393() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test393#3257");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test393");
    try {
      java.lang.String str4=org.apache.commons.lang.StringUtils.overlayString("i!","aaaaaaaaa ",(int)'#',(int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 35");
    }
 catch (    java.lang.StringIndexOutOfBoundsException e) {
    }
  }
  @Test public void test394() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test394#3268");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test394");
    char[] charArray9=new char[]{'#','4','#','#',' '};
    int int10=org.apache.commons.lang.StringUtils.indexOfAnyBut("Aaaaaaaaa ",charArray9);
    boolean boolean11=org.apache.commons.lang.StringUtils.containsNone("",charArray9);
    boolean boolean12=org.apache.commons.lang.StringUtils.containsOnly("aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa ",charArray9);
    int int13=org.apache.commons.lang.StringUtils.indexOfAnyBut("",charArray9);
    org.junit.Assert.assertNotNull(charArray9);
    org.junit.Assert.assertTrue("'" + int10 + "' != '"+ 0+ "'",int10 == 0);
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '"+ true+ "'",boolean11 == true);
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '"+ false+ "'",boolean12 == false);
    org.junit.Assert.assertTrue("'" + int13 + "' != '"+ (-1)+ "'",int13 == (-1));
  }
  @Test public void test395() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test395#3284");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test395");
    java.lang.String str3=org.apache.commons.lang.StringUtils.substringBetween("                                                ","...                          ...","... !ih..");
    org.junit.Assert.assertNull(str3);
  }
  @Test public void test396() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test396#3292");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test396");
    long long1=org.apache.commons.lang.math.NumberUtils.toLong("aaaaaaaaa                                                                                        ");
    org.junit.Assert.assertTrue("'" + long1 + "' != '"+ 0L+ "'",long1 == 0L);
  }
  @Test public void test397() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test397#3300");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test397");
    boolean boolean2=org.apache.commons.lang.StringUtils.containsIgnoreCase(" aaaaaaaaa","Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test398() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test398#3308");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test398");
    int int1=org.apache.commons.lang.math.NumberUtils.stringToInt("                                          aaaaaaaaa i!");
    org.junit.Assert.assertTrue("'" + int1 + "' != '"+ 0+ "'",int1 == 0);
  }
  @Test public void test399() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test399#3316");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test399");
    boolean boolean2=org.apache.commons.lang.StringUtils.containsNone("","aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ true+ "'",boolean2 == true);
  }
  @Test public void test400() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test400#3324");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test400");
    java.lang.String str3=org.apache.commons.lang.StringUtils.replaceChars("","   #######################################################################################","Aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ ""+ "'",str3.equals(""));
  }
  @Test public void test401() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test401#3332");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test401");
    float float2=org.apache.commons.lang.math.NumberUtils.toFloat("... !ih..",(float)(short)10);
    org.junit.Assert.assertTrue("'" + float2 + "' != '"+ 10.0f+ "'",float2 == 10.0f);
  }
  @Test public void test402() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test402#3340");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test402");
    java.lang.String str2=org.apache.commons.lang.StringUtils.chomp("4444444444444444444444444444444444                                4444444444444444444444444444444444"," aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "4444444444444444444444444444444444                                4444444444444444444444444444444444"+ "'",str2.equals("4444444444444444444444444444444444                                4444444444444444444444444444444444"));
  }
  @Test public void test403() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test403#3348");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test403");
    java.lang.String str2=org.apache.commons.lang.StringUtils.removeStart("aaaaaaaaa","                             Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "aaaaaaaaa"+ "'",str2.equals("aaaaaaaaa"));
  }
  @Test public void test404() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test404#3356");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test404");
    java.lang.String str3=org.apache.commons.lang.StringUtils.rightPad("                                                ",(int)(short)100,"...                          ...");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "                                                ...                          ......                 "+ "'",str3.equals("                                                ...                          ......                 "));
  }
  @Test public void test405() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test405#3364");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test405");
    java.lang.String str3=org.apache.commons.lang.StringUtils.getNestedString("                                                ","aaaaaaaaaaaaaaaaaaaa##Aaaaaaaaa","4");
    org.junit.Assert.assertNull(str3);
  }
  @Test public void test406() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test406#3372");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test406");
    java.lang.String str3=org.apache.commons.lang.StringUtils.rightPad("hi!                                   A",9,"... !ih...");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "hi!                                   A"+ "'",str3.equals("hi!                                   A"));
  }
  @Test public void test407() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test407#3380");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test407");
    java.lang.String str3=org.apache.commons.lang.StringUtils.mid("H",100,100);
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ ""+ "'",str3.equals(""));
  }
  @Test public void test408() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test408#3388");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test408");
    java.lang.String str3=org.apache.commons.lang.StringUtils.replaceOnce("                                                hi!                                                 ","                         i!                         ","");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "                                                hi!                                                 "+ "'",str3.equals("                                                hi!                                                 "));
  }
  @Test public void test409() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test409#3396");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test409");
    short short3=org.apache.commons.lang.math.NumberUtils.min((short)0,(short)1,(short)(byte)0);
    org.junit.Assert.assertTrue("'" + short3 + "' != '"+ (short)0+ "'",short3 == (short)0);
  }
  @Test public void test410() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test410#3404");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test410");
    java.lang.String str1=org.apache.commons.lang.StringUtils.chop("Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai"+ "'",str1.equals("Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai"));
  }
  @Test public void test411() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test411#3412");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test411");
    char[] charArray1=null;
    boolean boolean2=org.apache.commons.lang.StringUtils.containsNone("444444444444444444444444444444444444444444444          44444444444444444444444444444444444444444444",charArray1);
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ true+ "'",boolean2 == true);
  }
  @Test public void test412() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test412#3421");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test412");
    java.lang.String str2=org.apache.commons.lang.StringUtils.chomp("                             Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!","aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                             Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!"+ "'",str2.equals("                             Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!"));
  }
  @Test public void test413() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test413#3429");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test413");
    java.lang.String str2=org.apache.commons.lang.StringUtils.getNestedString("                                                                                                         HI!","                                          aaaaaaaaa i!");
    org.junit.Assert.assertNull(str2);
  }
  @Test public void test414() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test414#3437");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test414");
    java.lang.String str1=org.apache.commons.lang.StringUtils.chomp("...                          ...");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "...                          ..."+ "'",str1.equals("...                          ..."));
  }
  @Test public void test415() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test415#3445");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test415");
    int int3=org.apache.commons.lang.math.NumberUtils.min((int)(short)10,10,97);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ 10+ "'",int3 == 10);
  }
  @Test public void test416() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test416#3453");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test416");
    java.lang.String str2=org.apache.commons.lang.StringUtils.getPrechomp("A","   #######################################################################################");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test417() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test417#3461");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test417");
    long long2=org.apache.commons.lang.math.NumberUtils.toLong("aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa",(long)(byte)100);
    org.junit.Assert.assertTrue("'" + long2 + "' != '"+ 100L+ "'",long2 == 100L);
  }
  @Test public void test418() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test418#3469");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test418");
    java.lang.String str2=org.apache.commons.lang.StringUtils.strip("...                          ...","                                                                                       Aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "...                          ..."+ "'",str2.equals("...                          ..."));
  }
  @Test public void test419() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test419#3477");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test419");
    boolean boolean1=org.apache.commons.lang.StringUtils.isNotEmpty("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test420() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test420#3485");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test420");
    java.lang.String str2=org.apache.commons.lang.StringUtils.difference("                                          aaaaaaaaa i!","                                   ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test421() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test421#3493");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test421");
    double double1=org.apache.commons.lang.math.NumberUtils.toDouble("...                          ...");
    org.junit.Assert.assertTrue("'" + double1 + "' != '"+ 0.0d+ "'",double1 == 0.0d);
  }
  @Test public void test422() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test422#3501");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test422");
    int int2=org.apache.commons.lang.math.NumberUtils.stringToInt("",20);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 20+ "'",int2 == 20);
  }
  @Test public void test423() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test423#3509");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test423");
    java.lang.String str1=org.apache.commons.lang.StringUtils.chompLast("   ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "   "+ "'",str1.equals("   "));
  }
  @Test public void test424() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test424#3517");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test424");
    java.lang.String str3=org.apache.commons.lang.StringUtils.leftPad("Hi!                                   A",(int)(short)1,'4');
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "Hi!                                   A"+ "'",str3.equals("Hi!                                   A"));
  }
  @Test public void test425() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test425#3525");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test425");
    int int2=org.apache.commons.lang.math.NumberUtils.compare((float)(short)0,(float)(-1L));
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 1+ "'",int2 == 1);
  }
  @Test public void test426() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test426#3533");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test426");
    java.lang.String str1=org.apache.commons.lang.StringUtils.uncapitalise("4444444Hi!");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "4444444Hi!"+ "'",str1.equals("4444444Hi!"));
  }
  @Test public void test427() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test427#3541");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test427");
    int int2=org.apache.commons.lang.StringUtils.lastIndexOf("... !ih...","aaaaaaaaaaaaaaaaaaaa##Aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test428() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test428#3549");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test428");
    java.lang.String str2=org.apache.commons.lang.StringUtils.removeStart("                   ","444444444444444444444444444444444444444444444          44444444444444444444444444444444444444444444");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                   "+ "'",str2.equals("                   "));
  }
  @Test public void test429() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test429#3557");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test429");
    java.lang.String str1=org.apache.commons.lang.StringUtils.chopNewline("aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa "+ "'",str1.equals("aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa "));
  }
  @Test public void test430() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test430#3565");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test430");
    java.lang.String str1=org.apache.commons.lang.StringUtils.upperCase("                                ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "                                "+ "'",str1.equals("                                "));
  }
  @Test public void test431() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test431#3573");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test431");
    java.lang.String str3=org.apache.commons.lang.StringUtils.getNestedString("i!","#############################################################################          ","aaaaaaaaa                                    ");
    org.junit.Assert.assertNull(str3);
  }
  @Test public void test432() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test432#3581");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test432");
    int int3=org.apache.commons.lang.StringUtils.lastIndexOf("aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa ",' ',94);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ 31+ "'",int3 == 31);
  }
  @Test public void test433() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test433#3589");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test433");
    float float2=org.apache.commons.lang.math.NumberUtils.toFloat("",1.0f);
    org.junit.Assert.assertTrue("'" + float2 + "' != '"+ 1.0f+ "'",float2 == 1.0f);
  }
  @Test public void test434() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test434#3597");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test434");
    int int2=org.apache.commons.lang.math.NumberUtils.compare((float)97L,(float)(short)0);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 1+ "'",int2 == 1);
  }
  @Test public void test435() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test435#3605");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test435");
    java.lang.String str4=org.apache.commons.lang.StringUtils.replace("aaaaaaaaaaaaaaaaaaaa                                ","           4            ","Aaaaaaaaa ",0);
    org.junit.Assert.assertTrue("'" + str4 + "' != '"+ "aaaaaaaaaaaaaaaaaaaa                                "+ "'",str4.equals("aaaaaaaaaaaaaaaaaaaa                                "));
  }
  @Test public void test436() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test436#3613");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test436");
    float float3=org.apache.commons.lang.math.NumberUtils.min((float)100,(float)1L,(float)100L);
    org.junit.Assert.assertTrue("'" + float3 + "' != '"+ 1.0f+ "'",float3 == 1.0f);
  }
  @Test public void test437() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test437#3621");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test437");
    int int1=org.apache.commons.lang.math.NumberUtils.stringToInt("aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + int1 + "' != '"+ 0+ "'",int1 == 0);
  }
  @Test public void test438() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test438#3629");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test438");
    int int3=org.apache.commons.lang.math.NumberUtils.min(24,(int)(byte)1,(int)(short)0);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ 0+ "'",int3 == 0);
  }
  @Test public void test439() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test439#3637");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test439");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substring("                                                hi!                                                 ",(int)(short)-1);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ " "+ "'",str2.equals(" "));
  }
  @Test public void test440() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test440#3645");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test440");
    int int2=org.apache.commons.lang.StringUtils.indexOfAnyBut("#############################################################################          ","          ");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 0+ "'",int2 == 0);
  }
  @Test public void test441() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test441#3653");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test441");
    java.lang.String str1=org.apache.commons.lang.StringUtils.trim("aaaaaaaaaaaaaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "aaaaaaaaaaaaaaaaaaaa"+ "'",str1.equals("aaaaaaaaaaaaaaaaaaaa"));
  }
  @Test public void test442() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test442#3661");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test442");
    java.lang.String str2=org.apache.commons.lang.StringUtils.prechomp("i!","aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "i!"+ "'",str2.equals("i!"));
  }
  @Test public void test443() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test443#3669");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test443");
    int int2=org.apache.commons.lang.StringUtils.indexOfDifference("","aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 0+ "'",int2 == 0);
  }
  @Test public void test444() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test444#3677");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test444");
    boolean boolean1=org.apache.commons.lang.StringUtils.isNumericSpace("   #######################################################################################");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test445() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test445#3685");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test445");
    java.lang.String str2=org.apache.commons.lang.StringUtils.chomp("h","aaaaaaaaaaaaaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "h"+ "'",str2.equals("h"));
  }
  @Test public void test446() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test446#3693");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test446");
    java.lang.String str3=org.apache.commons.lang.StringUtils.replaceChars("Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!",' ',' ');
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!"+ "'",str3.equals("Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!"));
  }
  @Test public void test447() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test447#3701");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test447");
    java.lang.Object[] objArray0=null;
    java.lang.String str4=org.apache.commons.lang.StringUtils.join(objArray0,"                                                ...                          ......                 ",(int)(byte)1,(int)(byte)100);
    org.junit.Assert.assertNull(str4);
  }
  @Test public void test448() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test448#3710");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test448");
    java.lang.String str2=org.apache.commons.lang.StringUtils.chomp("... !ih..","                                ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "... !ih.."+ "'",str2.equals("... !ih.."));
  }
  @Test public void test449() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test449#3718");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test449");
    java.lang.String str1=org.apache.commons.lang.StringUtils.defaultString("                                                                                                         HI!");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "                                                                                                         HI!"+ "'",str1.equals("                                                                                                         HI!"));
  }
  @Test public void test450() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test450#3726");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test450");
    int int3=org.apache.commons.lang.math.NumberUtils.max(97,100,(int)(byte)10);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ 100+ "'",int3 == 100);
  }
  @Test public void test451() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test451#3734");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test451");
    java.lang.String str1=org.apache.commons.lang.StringUtils.deleteSpaces("                             hi!                                   A                             ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "hi!A"+ "'",str1.equals("hi!A"));
  }
  @Test public void test452() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test452#3742");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test452");
    java.lang.String str1=org.apache.commons.lang.StringUtils.lowerCase("4444444444444444444444444444444444                                4444444444444444444444444444444444");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "4444444444444444444444444444444444                                4444444444444444444444444444444444"+ "'",str1.equals("4444444444444444444444444444444444                                4444444444444444444444444444444444"));
  }
  @Test public void test453() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test453#3750");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test453");
    int int2=org.apache.commons.lang.StringUtils.indexOfAnyBut("...                          ...","");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test454() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test454#3758");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test454");
    java.lang.String str2=org.apache.commons.lang.StringUtils.strip("                        aaaaaaaaaaaaaaaaaaaa                                                        ","... !ih..");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "aaaaaaaaaaaaaaaaaaaa"+ "'",str2.equals("aaaaaaaaaaaaaaaaaaaa"));
  }
  @Test public void test455() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test455#3766");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test455");
    try {
      java.lang.Float float1=org.apache.commons.lang.math.NumberUtils.createFloat("               ");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test456() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test456#3777");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test456");
    java.lang.String str2=org.apache.commons.lang.StringUtils.abbreviate("",96);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test457() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test457#3785");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test457");
    boolean boolean1=org.apache.commons.lang.StringUtils.isNotBlank("                             hi!                                   A                             ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test458() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test458#3793");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test458");
    int int2=org.apache.commons.lang.StringUtils.countMatches("#############################################################################"," aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 0+ "'",int2 == 0);
  }
  @Test public void test459() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test459#3801");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test459");
    java.lang.String str2=org.apache.commons.lang.StringUtils.right("",48);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test460() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test460#3809");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test460");
    try {
      java.lang.Long long1=org.apache.commons.lang.math.NumberUtils.createLong(" aaaaaaaaa");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \" aaaaaaaaa\"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test461() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test461#3820");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test461");
    boolean boolean2=org.apache.commons.lang.StringUtils.containsOnly(" aaaaaaaaa","4444444Hi!");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test462() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test462#3828");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test462");
    boolean boolean2=org.apache.commons.lang.StringUtils.contains("                        AAAAAAAAAAAAAAAAAAAA                                                        ",'4');
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test463() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test463#3836");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test463");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringBeforeLast("hi!                                   A","                                                 !ih                                                ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "hi!                                   A"+ "'",str2.equals("hi!                                   A"));
  }
  @Test public void test464() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test464#3844");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test464");
    short short3=org.apache.commons.lang.math.NumberUtils.max((short)10,(short)10,(short)(byte)-1);
    org.junit.Assert.assertTrue("'" + short3 + "' != '"+ (short)10+ "'",short3 == (short)10);
  }
  @Test public void test465() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test465#3852");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test465");
    java.lang.String str1=org.apache.commons.lang.StringUtils.capitalise("444444444444444444444444444444444444444444444          444444444444444444444444444444444444444444444");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "444444444444444444444444444444444444444444444          444444444444444444444444444444444444444444444"+ "'",str1.equals("444444444444444444444444444444444444444444444          444444444444444444444444444444444444444444444"));
  }
  @Test public void test466() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test466#3860");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test466");
    try {
      java.lang.String str2=org.apache.commons.lang.StringUtils.abbreviate(" ",(int)(byte)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
    }
 catch (    java.lang.IllegalArgumentException e) {
    }
  }
  @Test public void test467() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test467#3871");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test467");
    int int3=org.apache.commons.lang.StringUtils.indexOf("...                          ...","                                                ...                          ......                 ",24);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test468() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test468#3879");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test468");
    java.lang.String str2=org.apache.commons.lang.StringUtils.reverseDelimitedString("                                                                                       Aaaaaaaaa ","");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                                                                                       Aaaaaaaaa "+ "'",str2.equals("                                                                                       Aaaaaaaaa "));
  }
  @Test public void test469() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test469#3887");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test469");
    java.lang.String str1=org.apache.commons.lang.StringUtils.clean("                                          aaaaaaaaa i!");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "aaaaaaaaa i!"+ "'",str1.equals("aaaaaaaaa i!"));
  }
  @Test public void test470() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test470#3895");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test470");
    java.lang.String str2=org.apache.commons.lang.StringUtils.getChomp("Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!","444444444444444444444444444444444444444444444          444444444444444444444444444444444444444444444");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test471() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test471#3903");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test471");
    boolean boolean1=org.apache.commons.lang.StringUtils.isWhitespace("A                                                hi!");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test472() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test472#3911");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test472");
    float float3=org.apache.commons.lang.math.NumberUtils.max((float)(byte)100,0.0f,(float)29);
    org.junit.Assert.assertTrue("'" + float3 + "' != '"+ 100.0f+ "'",float3 == 100.0f);
  }
  @Test public void test473() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test473#3919");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test473");
    try {
      java.lang.Float float1=org.apache.commons.lang.math.NumberUtils.createFloat("                                                ");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test474() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test474#3930");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test474");
    java.lang.String[] strArray3=org.apache.commons.lang.StringUtils.split("Hi!","",(int)(byte)0);
    org.junit.Assert.assertNotNull(strArray3);
  }
  @Test public void test475() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test475#3938");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test475");
    java.lang.String str2=org.apache.commons.lang.StringUtils.getPrechomp("Aaaaaaaaa ","aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test476() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test476#3946");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test476");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAlphanumericSpace("#############################################################################          ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test477() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test477#3954");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test477");
    java.lang.String str1=org.apache.commons.lang.StringUtils.reverse("                                                                                                    ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "                                                                                                    "+ "'",str1.equals("                                                                                                    "));
  }
  @Test public void test478() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test478#3962");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test478");
    int int3=org.apache.commons.lang.StringUtils.indexOf("","                                                ...                          ......                 ",(int)(byte)1);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test479() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test479#3970");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test479");
    java.lang.String str3=org.apache.commons.lang.StringUtils.mid("... !ih..",88,0);
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ ""+ "'",str3.equals(""));
  }
  @Test public void test480() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test480#3978");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test480");
    boolean boolean2=org.apache.commons.lang.StringUtils.equalsIgnoreCase("                             Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!","                                                                                       aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test481() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test481#3986");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test481");
    float float2=org.apache.commons.lang.math.NumberUtils.toFloat("   #######################################################################################",(float)1L);
    org.junit.Assert.assertTrue("'" + float2 + "' != '"+ 1.0f+ "'",float2 == 1.0f);
  }
  @Test public void test482() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test482#3994");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test482");
    java.lang.String str2=org.apache.commons.lang.StringUtils.chomp("   #######################################################################################","           4            ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "   #######################################################################################"+ "'",str2.equals("   #######################################################################################"));
  }
  @Test public void test483() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test483#4002");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test483");
    java.lang.String str3=org.apache.commons.lang.StringUtils.rightPad("Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!",(int)'4','4');
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!"+ "'",str3.equals("Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!"));
  }
  @Test public void test484() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test484#4010");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test484");
    int int2=org.apache.commons.lang.math.NumberUtils.compare((double)1L,(double)88);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test485() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test485#4018");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test485");
    java.lang.String str1=org.apache.commons.lang.StringUtils.trimToNull("#############################################################################");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "#############################################################################"+ "'",str1.equals("#############################################################################"));
  }
  @Test public void test486() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test486#4026");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test486");
    boolean boolean1=org.apache.commons.lang.StringUtils.isNotBlank("          ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test487() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test487#4034");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test487");
    boolean boolean1=org.apache.commons.lang.StringUtils.isBlank("#############################################################################          ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test488() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test488#4042");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test488");
    boolean boolean2=org.apache.commons.lang.StringUtils.containsNone("aaaaaaaaa                                    ","4444444444444444444444444444444444                                4444444444444444444444444444444444");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test489() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test489#4050");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test489");
    java.lang.String str1=org.apache.commons.lang.StringUtils.chomp("i!");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "i!"+ "'",str1.equals("i!"));
  }
  @Test public void test490() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test490#4058");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test490");
    java.lang.String str3=org.apache.commons.lang.StringUtils.center("                                                    ",4,'a');
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "                                                    "+ "'",str3.equals("                                                    "));
  }
  @Test public void test491() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test491#4066");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test491");
    java.lang.String str2=org.apache.commons.lang.StringUtils.stripEnd("aaaaaaaaa i!","444444444444444444444444444444444444444444444          44444444444444444444444444444444444444444444");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "aaaaaaaaa i!"+ "'",str2.equals("aaaaaaaaa i!"));
  }
  @Test public void test492() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test492#4074");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test492");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substring("aaaaaaaaaaaaaaaaaaaa",96);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test493() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test493#4082");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test493");
    java.lang.String str2=org.apache.commons.lang.StringUtils.stripEnd("","!ih");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test494() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test494#4090");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test494");
    short short3=org.apache.commons.lang.math.NumberUtils.min((short)0,(short)(byte)100,(short)(byte)0);
    org.junit.Assert.assertTrue("'" + short3 + "' != '"+ (short)0+ "'",short3 == (short)0);
  }
  @Test public void test495() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test495#4098");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test495");
    java.lang.String str2=org.apache.commons.lang.StringUtils.repeat("H",(int)(byte)10);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "HHHHHHHHHH"+ "'",str2.equals("HHHHHHHHHH"));
  }
  @Test public void test496() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test496#4106");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test496");
    java.lang.String str2=org.apache.commons.lang.StringUtils.strip("a                                                HI!","   ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "a                                                HI!"+ "'",str2.equals("a                                                HI!"));
  }
  @Test public void test497() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test497#4114");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test497");
    java.lang.String str1=org.apache.commons.lang.StringUtils.upperCase("");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ ""+ "'",str1.equals(""));
  }
  @Test public void test498() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test498#4122");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test498");
    java.lang.String str2=org.apache.commons.lang.StringUtils.difference("","Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!"+ "'",str2.equals("Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!"));
  }
  @Test public void test499() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test499#4130");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test499");
    java.lang.String str1=org.apache.commons.lang.StringUtils.chomp("                                                                                                                  HI!");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "                                                                                                                  HI!"+ "'",str1.equals("                                                                                                                  HI!"));
  }
  @Test public void test500() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/buggy",this,"\n.RegressionTest1::test500#4138");
    if (debug)     System.out.format("%n%s%n","RegressionTest1.test500");
    boolean boolean2=org.apache.commons.lang.StringUtils.equals("                                          aaaaaaaaa ","                                                                                       aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
}
