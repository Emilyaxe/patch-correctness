import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
@FixMethodOrder(MethodSorters.NAME_ASCENDING) public class RegressionTest5 {
  public static boolean debug=false;
  @Test public void test001() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test001#10");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test001");
    java.lang.String str2=org.apache.commons.lang.StringUtils.removeEnd("                                                                                              !iH","                                                                                                ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                                                                                              !iH"+ "'",str2.equals("                                                                                              !iH"));
  }
  @Test public void test002() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test002#18");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test002");
    java.lang.String str2=org.apache.commons.lang.StringUtils.reverseDelimited("                             Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaa",' ');
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "Aaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa"+ "'",str2.equals("Aaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa"));
  }
  @Test public void test003() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test003#26");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test003");
    java.lang.String str2=org.apache.commons.lang.StringUtils.leftPad("A                                                hi!                                                 ",88);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "A                                                hi!                                                 "+ "'",str2.equals("A                                                hi!                                                 "));
  }
  @Test public void test004() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test004#34");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test004");
    java.lang.String str2=org.apache.commons.lang.StringUtils.defaultString("","                               ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test005() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test005#42");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test005");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAsciiPrintable("aaaaaaaaaaaaaaaaaaaa");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test006() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test006#50");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test006");
    java.lang.String str1=org.apache.commons.lang.StringUtils.chopNewline("iaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "iaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA"+ "'",str1.equals("iaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA"));
  }
  @Test public void test007() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test007#58");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test007");
    java.lang.String[] strArray1=org.apache.commons.lang.StringUtils.splitPreserveAllTokens("Aaaaaaaaa ");
    java.lang.String str3=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray1,'4');
    org.junit.Assert.assertNotNull(strArray1);
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "Aaaaaaaaa4"+ "'",str3.equals("Aaaaaaaaa4"));
  }
  @Test public void test008() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test008#68");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test008");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringAfterLast("Hi!                                                                                              ","                                                              ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test009() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test009#76");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test009");
    java.lang.String str2=org.apache.commons.lang.StringUtils.difference("4                                                ","                   ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                   "+ "'",str2.equals("                   "));
  }
  @Test public void test010() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test010#84");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test010");
    int int3=org.apache.commons.lang.math.NumberUtils.max(63,104,35);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ 104+ "'",int3 == 104);
  }
  @Test public void test011() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test011#92");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test011");
    java.lang.String str2=org.apache.commons.lang.StringUtils.reverseDelimited("A########                          ",'#');
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                          #A"+ "'",str2.equals("                          #A"));
  }
  @Test public void test012() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test012#100");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test012");
    java.lang.String str1=org.apache.commons.lang.StringUtils.capitalize("... !ih..");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "... !ih.."+ "'",str1.equals("... !ih.."));
  }
  @Test public void test013() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test013#108");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test013");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAlphaSpace("                                ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test014() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test014#116");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test014");
    java.lang.String str2=org.apache.commons.lang.StringUtils.reverseDelimited("a                                                HI!",'a');
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                                                HI!"+ "'",str2.equals("                                                HI!"));
  }
  @Test public void test015() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test015#124");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test015");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substring("                                              hi",100);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test016() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test016#132");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test016");
    int int2=org.apache.commons.lang.math.NumberUtils.compare((double)36.0f,97.0d);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test017() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test017#140");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test017");
    java.lang.String str2=org.apache.commons.lang.StringUtils.difference("                         I!                         ","... !ih..");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "... !ih.."+ "'",str2.equals("... !ih.."));
  }
  @Test public void test018() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test018#148");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test018");
    short short3=org.apache.commons.lang.math.NumberUtils.min((short)100,(short)(byte)100,(short)0);
    org.junit.Assert.assertTrue("'" + short3 + "' != '"+ (short)0+ "'",short3 == (short)0);
  }
  @Test public void test019() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test019#156");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test019");
    java.lang.String[] strArray3=org.apache.commons.lang.StringUtils.splitPreserveAllTokens("aaaaaaaaa ","",65);
    java.lang.String str4=org.apache.commons.lang.StringUtils.concatenate((java.lang.Object[])strArray3);
    org.junit.Assert.assertNotNull(strArray3);
    org.junit.Assert.assertTrue("'" + str4 + "' != '"+ "aaaaaaaaa "+ "'",str4.equals("aaaaaaaaa "));
  }
  @Test public void test020() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test020#166");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test020");
    java.lang.String str2=org.apache.commons.lang.StringUtils.left("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",47);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"+ "'",str2.equals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
  }
  @Test public void test021() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test021#174");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test021");
    try {
      java.lang.Double double1=org.apache.commons.lang.math.NumberUtils.createDouble("AAAAAAAAA ");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"AAAAAAAAA\"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test022() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test022#185");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test022");
    java.lang.String str1=org.apache.commons.lang.StringUtils.clean("i!");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "i!"+ "'",str1.equals("i!"));
  }
  @Test public void test023() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test023#193");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test023");
    java.lang.String str1=org.apache.commons.lang.StringUtils.stripToEmpty("          aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "aaaaaaaaa"+ "'",str1.equals("aaaaaaaaa"));
  }
  @Test public void test024() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test024#201");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test024");
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
      double double45=org.apache.commons.lang.math.NumberUtils.min(doubleArray7);
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
  @Test public void test025() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test025#261");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test025");
    java.lang.String[] strArray1=null;
    int int2=org.apache.commons.lang.StringUtils.lastIndexOfAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa             ",strArray1);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test026() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test026#270");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test026");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringAfter("aaaaaaaaaaaaaaaaaaaaAaaaaaaaa","AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test027() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test027#278");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test027");
    boolean boolean2=org.apache.commons.lang.StringUtils.containsIgnoreCase(" AAAAAA...","                                                                                       aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test028() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test028#286");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test028");
    java.lang.String str2=org.apache.commons.lang.StringUtils.center("... !ih...",32);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "           ... !ih...           "+ "'",str2.equals("           ... !ih...           "));
  }
  @Test public void test029() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test029#294");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test029");
    int int3=org.apache.commons.lang.StringUtils.indexOf("... !ih...                                ","",(int)(short)-1);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ 0+ "'",int3 == 0);
  }
  @Test public void test030() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test030#302");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test030");
    short short3=org.apache.commons.lang.math.NumberUtils.max((short)10,(short)100,(short)0);
    org.junit.Assert.assertTrue("'" + short3 + "' != '"+ (short)100+ "'",short3 == (short)100);
  }
  @Test public void test031() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test031#310");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test031");
    int int2=org.apache.commons.lang.math.NumberUtils.compare((double)7.0f,(double)100);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test032() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test032#318");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test032");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.split("#aaaaaaaaa","                                    aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa                                       hi!                                                 ");
    java.lang.String[] strArray4=org.apache.commons.lang.StringUtils.stripAll(strArray2,"AAAAAAAAA");
    org.junit.Assert.assertNotNull(strArray2);
    org.junit.Assert.assertNotNull(strArray4);
  }
  @Test public void test033() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test033#328");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test033");
    float float3=org.apache.commons.lang.math.NumberUtils.min((float)31,(float)32,(float)31L);
    org.junit.Assert.assertTrue("'" + float3 + "' != '"+ 31.0f+ "'",float3 == 31.0f);
  }
  @Test public void test034() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test034#336");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test034");
    int int2=org.apache.commons.lang.StringUtils.indexOfAnyBut("Hi!                                                                                             ","#aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 0+ "'",int2 == 0);
  }
  @Test public void test035() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test035#344");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test035");
    byte byte3=org.apache.commons.lang.math.NumberUtils.max((byte)1,(byte)100,(byte)-1);
    org.junit.Assert.assertTrue("'" + byte3 + "' != '"+ (byte)100+ "'",byte3 == (byte)100);
  }
  @Test public void test036() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test036#352");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test036");
    boolean boolean2=org.apache.commons.lang.StringUtils.containsNone("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa","                                                HI!");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ true+ "'",boolean2 == true);
  }
  @Test public void test037() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test037#360");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test037");
    float float3=org.apache.commons.lang.math.NumberUtils.min((float)97,(float)108,(float)0L);
    org.junit.Assert.assertTrue("'" + float3 + "' != '"+ 0.0f+ "'",float3 == 0.0f);
  }
  @Test public void test038() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test038#368");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test038");
    float float3=org.apache.commons.lang.math.NumberUtils.max((float)0,(float)'a',(float)31);
    org.junit.Assert.assertTrue("'" + float3 + "' != '"+ 97.0f+ "'",float3 == 97.0f);
  }
  @Test public void test039() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test039#376");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test039");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substring("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAI!",(int)(byte)1);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAI!"+ "'",str2.equals("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAI!"));
  }
  @Test public void test040() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test040#384");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test040");
    java.lang.String[] strArray4=org.apache.commons.lang.StringUtils.split("aaaaaaaaaaaaaaaaaaaa","");
    java.lang.String[] strArray5=org.apache.commons.lang.StringUtils.stripAll(strArray4);
    int int6=org.apache.commons.lang.StringUtils.lastIndexOfAny("h#################...#################...#################...#################...#######",strArray5);
    int int7=org.apache.commons.lang.StringUtils.lastIndexOfAny("Hi!   #######################################################################################             ######       A",strArray5);
    org.junit.Assert.assertNotNull(strArray4);
    org.junit.Assert.assertNotNull(strArray5);
    org.junit.Assert.assertTrue("'" + int6 + "' != '"+ (-1)+ "'",int6 == (-1));
    org.junit.Assert.assertTrue("'" + int7 + "' != '"+ (-1)+ "'",int7 == (-1));
  }
  @Test public void test041() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test041#398");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test041");
    java.lang.String str2=org.apache.commons.lang.StringUtils.reverseDelimitedString("aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa ","");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa "+ "'",str2.equals("aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa "));
  }
  @Test public void test042() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test042#406");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test042");
    java.lang.String str2=org.apache.commons.lang.StringUtils.stripStart("aaaaaaaaaaaaaaaaaaaa##Aaaaaaaa","4444444444444444444444444444444444                                4444444444444444444444444444444444");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "aaaaaaaaaaaaaaaaaaaa##Aaaaaaaa"+ "'",str2.equals("aaaaaaaaaaaaaaaaaaaa##Aaaaaaaa"));
  }
  @Test public void test043() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test043#414");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test043");
    java.lang.String str1=org.apache.commons.lang.StringUtils.clean("                                                                                                         HI!");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "HI!"+ "'",str1.equals("HI!"));
  }
  @Test public void test044() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test044#422");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test044");
    java.lang.String str1=org.apache.commons.lang.StringUtils.reverse("A         A         A         A         A         A         A         A         A         A       I!    ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "    !I       A         A         A         A         A         A         A         A         A         A"+ "'",str1.equals("    !I       A         A         A         A         A         A         A         A         A         A"));
  }
  @Test public void test045() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test045#430");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test045");
    boolean boolean1=org.apache.commons.lang.StringUtils.isNumericSpace("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test046() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test046#438");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test046");
    boolean boolean1=org.apache.commons.lang.StringUtils.isWhitespace("");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test047() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test047#446");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test047");
    try {
      java.lang.String str2=org.apache.commons.lang.StringUtils.abbreviate("aaaaaaaaa                          ",1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
    }
 catch (    java.lang.IllegalArgumentException e) {
    }
  }
  @Test public void test048() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test048#457");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test048");
    try {
      java.lang.Float float1=org.apache.commons.lang.math.NumberUtils.createFloat("4444444Hi!aaaaaaaaa");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4444444Hi!aaaaaaaaa\"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test049() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test049#468");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test049");
    java.lang.String str3=org.apache.commons.lang.StringUtils.leftPad(" aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa ",(int)(byte)1,'a');
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ " aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa "+ "'",str3.equals(" aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa "));
  }
  @Test public void test050() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test050#476");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test050");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringBefore("                                                                                                 ##A","aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                                                                                                 ##A"+ "'",str2.equals("                                                                                                 ##A"));
  }
  @Test public void test051() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test051#484");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test051");
    char[] charArray8=new char[]{'a','4',' ','4','#'};
    int int9=org.apache.commons.lang.StringUtils.indexOfAnyBut("hi!",charArray8);
    int int10=org.apache.commons.lang.StringUtils.indexOfAnyBut("                                ",charArray8);
    boolean boolean11=org.apache.commons.lang.StringUtils.containsOnly("   #######################################################################################aaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa",charArray8);
    org.junit.Assert.assertNotNull(charArray8);
    org.junit.Assert.assertTrue("'" + int9 + "' != '"+ 0+ "'",int9 == 0);
    org.junit.Assert.assertTrue("'" + int10 + "' != '"+ (-1)+ "'",int10 == (-1));
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '"+ false+ "'",boolean11 == false);
  }
  @Test public void test052() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test052#498");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test052");
    byte byte3=org.apache.commons.lang.math.NumberUtils.max((byte)10,(byte)0,(byte)100);
    org.junit.Assert.assertTrue("'" + byte3 + "' != '"+ (byte)100+ "'",byte3 == (byte)100);
  }
  @Test public void test053() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test053#506");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test053");
    boolean boolean2=org.apache.commons.lang.StringUtils.equals("","4");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test054() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test054#514");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test054");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAsciiPrintable("   #######################################################################################aaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test055() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test055#522");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test055");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringBeforeLast("                                                                                                HI!","                                                                                                 ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                                                                                                HI!"+ "'",str2.equals("                                                                                                HI!"));
  }
  @Test public void test056() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test056#530");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test056");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringBetween(" aaaaaaaaa","Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai");
    org.junit.Assert.assertNull(str2);
  }
  @Test public void test057() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test057#538");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test057");
    java.lang.String[] strArray4=org.apache.commons.lang.StringUtils.splitByWholeSeparator("                             Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!","                             Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!",(int)(byte)1);
    int int5=org.apache.commons.lang.StringUtils.lastIndexOfAny("a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a ",strArray4);
    org.junit.Assert.assertNotNull(strArray4);
    org.junit.Assert.assertTrue("'" + int5 + "' != '"+ 104+ "'",int5 == 104);
  }
  @Test public void test058() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test058#548");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test058");
    java.lang.String str2=org.apache.commons.lang.StringUtils.defaultString("                                              hi!","  4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                                              hi!"+ "'",str2.equals("                                              hi!"));
  }
  @Test public void test059() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test059#556");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test059");
    java.lang.String str1=org.apache.commons.lang.StringUtils.clean("4444444444444444444444444444444444                                4444444444444444444444444444444444");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "4444444444444444444444444444444444                                4444444444444444444444444444444444"+ "'",str1.equals("4444444444444444444444444444444444                                4444444444444444444444444444444444"));
  }
  @Test public void test060() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test060#564");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test060");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringBetween("                                                                                   aaaaaaaaa ","4444444Hi!aaaaaaaaa");
    org.junit.Assert.assertNull(str2);
  }
  @Test public void test061() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test061#572");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test061");
    char[] charArray1=null;
    boolean boolean2=org.apache.commons.lang.StringUtils.containsOnly("   ",charArray1);
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test062() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test062#581");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test062");
    byte byte3=org.apache.commons.lang.math.NumberUtils.min((byte)-1,(byte)-1,(byte)1);
    org.junit.Assert.assertTrue("'" + byte3 + "' != '"+ (byte)-1+ "'",byte3 == (byte)-1);
  }
  @Test public void test063() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test063#589");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test063");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.split("#############################################################################          ","                 ");
    java.lang.String[] strArray4=org.apache.commons.lang.StringUtils.stripAll(strArray2,"aaaaaaaaaaaaaaaaaaaa                                ");
    java.lang.String str6=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray2,'#');
    org.junit.Assert.assertNotNull(strArray2);
    org.junit.Assert.assertNotNull(strArray4);
    org.junit.Assert.assertTrue("'" + str6 + "' != '"+ "#############################################################################"+ "'",str6.equals("#############################################################################"));
  }
  @Test public void test064() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test064#601");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test064");
    double double3=org.apache.commons.lang.math.NumberUtils.max((double)(short)100,(double)(short)0,(double)24);
    org.junit.Assert.assertTrue("'" + double3 + "' != '"+ 100.0d+ "'",double3 == 100.0d);
  }
  @Test public void test065() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test065#609");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test065");
    boolean boolean1=org.apache.commons.lang.StringUtils.isNumericSpace("H");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test066() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test066#617");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test066");
    int int3=org.apache.commons.lang.math.NumberUtils.max(65,41,156);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ 156+ "'",int3 == 156);
  }
  @Test public void test067() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test067#625");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test067");
    double double3=org.apache.commons.lang.math.NumberUtils.max((double)9L,0.0d,(double)0.0f);
    org.junit.Assert.assertTrue("'" + double3 + "' != '"+ 9.0d+ "'",double3 == 9.0d);
  }
  @Test public void test068() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test068#633");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test068");
    int int3=org.apache.commons.lang.StringUtils.indexOf("!ih",'a',32);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test069() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test069#641");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test069");
    int int3=org.apache.commons.lang.StringUtils.ordinalIndexOf("aaaaaaaaaaaaaaaaaaaa##Aaaaaaaaa","",(int)'#');
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ 0+ "'",int3 == 0);
  }
  @Test public void test070() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test070#649");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test070");
    boolean boolean1=org.apache.commons.lang.StringUtils.isNumeric("a ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test071() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test071#657");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test071");
    java.lang.String str1=org.apache.commons.lang.StringUtils.defaultString("hi!");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "hi!"+ "'",str1.equals("hi!"));
  }
  @Test public void test072() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test072#665");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test072");
    boolean boolean1=org.apache.commons.lang.StringUtils.isNotEmpty("                          AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa                          ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test073() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test073#673");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test073");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringBetween("                                                                                       aaaaaaaaa ","                         I!                         ");
    org.junit.Assert.assertNull(str2);
  }
  @Test public void test074() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test074#681");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test074");
    java.lang.String str2=org.apache.commons.lang.StringUtils.center("4444444Hi!aaaaaaaaa",(-1));
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "4444444Hi!aaaaaaaaa"+ "'",str2.equals("4444444Hi!aaaaaaaaa"));
  }
  @Test public void test075() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test075#689");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test075");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAlpha("          4444444444444444444444");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test076() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test076#697");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test076");
    java.lang.String str1=org.apache.commons.lang.StringUtils.defaultString(" 4            ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ " 4            "+ "'",str1.equals(" 4            "));
  }
  @Test public void test077() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test077#705");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test077");
    boolean boolean1=org.apache.commons.lang.StringUtils.isNumericSpace("a                                                HI!");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test078() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test078#713");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test078");
    boolean boolean2=org.apache.commons.lang.StringUtils.containsIgnoreCase("                                                                                   aaaaaaaaa ","");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ true+ "'",boolean2 == true);
  }
  @Test public void test079() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test079#721");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test079");
    java.lang.String str2=org.apache.commons.lang.StringUtils.removeEnd("                       AAAAAAAAA","Aaaaaaaaaaaaaaaaaaaa##Aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                       AAAAAAAAA"+ "'",str2.equals("                       AAAAAAAAA"));
  }
  @Test public void test080() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test080#729");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test080");
    boolean boolean2=org.apache.commons.lang.StringUtils.containsIgnoreCase("AAAAAAAAA ","                                    AAAAAAAAAAAAAAAAAAAA  aAAAAAAAA                                       HI!                                                 ");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test081() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test081#737");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test081");
    int int2=org.apache.commons.lang.StringUtils.indexOf("AAAAAAAAA ",'#');
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test082() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test082#745");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test082");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAlphaSpace("h#################...#################...#################...#################...#######");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test083() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test083#753");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test083");
    int int2=org.apache.commons.lang.StringUtils.lastIndexOf("                                          aaaaaaaaa i!","aaaaaaaaa                          ");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test084() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test084#761");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test084");
    java.lang.String str2=org.apache.commons.lang.StringUtils.removeEnd("aaaaaaaaa i!","                                                                                                                  HI!");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "aaaaaaaaa i!"+ "'",str2.equals("aaaaaaaaa i!"));
  }
  @Test public void test085() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test085#769");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test085");
    java.lang.String[] strArray1=org.apache.commons.lang.StringUtils.split("aaaaaaaaa ");
    try {
      java.lang.String str5=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray1,'a',0,41);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
    }
 catch (    java.lang.ArrayIndexOutOfBoundsException e) {
    }
    org.junit.Assert.assertNotNull(strArray1);
  }
  @Test public void test086() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test086#782");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test086");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.splitByWholeSeparator("             ","                             Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!");
    org.junit.Assert.assertNotNull(strArray2);
  }
  @Test public void test087() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test087#790");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test087");
    int int3=org.apache.commons.lang.StringUtils.indexOf("4","#############################################################################          ",94);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test088() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test088#798");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test088");
    int int3=org.apache.commons.lang.StringUtils.indexOf("iaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA"," a                                                                                       ",(int)(short)10);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test089() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test089#806");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test089");
    java.lang.String str2=org.apache.commons.lang.StringUtils.stripEnd("","                                    aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa                                       hi!                                                 ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test090() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test090#814");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test090");
    java.lang.String str3=org.apache.commons.lang.StringUtils.replaceOnce("4444444Hi!aaaaaaaaa                                                                                        ","a ",".. !ih..                                           ");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "4444444Hi!aaaaaaaa.. !ih..                                                                                                                                  "+ "'",str3.equals("4444444Hi!aaaaaaaa.. !ih..                                                                                                                                  "));
  }
  @Test public void test091() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test091#822");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test091");
    int int3=org.apache.commons.lang.math.NumberUtils.max((int)'a',4,(int)(byte)1);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ 97+ "'",int3 == 97);
  }
  @Test public void test092() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test092#830");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test092");
    java.lang.String str3=org.apache.commons.lang.StringUtils.rightPad("AaaaaaaaaaaaaaaaaaaaAaaaaaaaa",47,'a');
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaa"+ "'",str3.equals("AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaa"));
  }
  @Test public void test093() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test093#838");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test093");
    java.lang.String str3=org.apache.commons.lang.StringUtils.leftPad("   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",(int)(short)100,'a');
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"+ "'",str3.equals("   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
  }
  @Test public void test094() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test094#846");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test094");
    java.lang.String str1=org.apache.commons.lang.StringUtils.trimToNull("AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaa"+ "'",str1.equals("AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaa"));
  }
  @Test public void test095() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test095#854");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test095");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.split("                                   ","");
    java.lang.String str4=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray2,"                                                ");
    java.lang.String[] strArray5=org.apache.commons.lang.StringUtils.stripAll(strArray2);
    org.junit.Assert.assertNotNull(strArray2);
    org.junit.Assert.assertTrue("'" + str4 + "' != '"+ "                                   "+ "'",str4.equals("                                   "));
    org.junit.Assert.assertNotNull(strArray5);
  }
  @Test public void test096() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test096#866");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test096");
    java.lang.String[] strArray3=org.apache.commons.lang.StringUtils.split("                                ",".. !ih..                                           ",1);
    org.junit.Assert.assertNotNull(strArray3);
  }
  @Test public void test097() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test097#874");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test097");
    java.lang.String str1=org.apache.commons.lang.StringUtils.deleteWhitespace("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"+ "'",str1.equals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
  }
  @Test public void test098() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test098#882");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test098");
    int int2=org.apache.commons.lang.StringUtils.indexOf("A ",'4');
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test099() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test099#890");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test099");
    int int2=org.apache.commons.lang.math.NumberUtils.toInt("aaaaaaaaa                          ",(int)'4');
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 52+ "'",int2 == 52);
  }
  @Test public void test100() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test100#898");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test100");
    try {
      java.lang.Integer int1=org.apache.commons.lang.math.NumberUtils.createInteger("A!ih");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"A!ih\"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test101() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test101#909");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test101");
    java.lang.String str1=org.apache.commons.lang.StringUtils.stripToNull("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAI!");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAI!"+ "'",str1.equals("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAI!"));
  }
  @Test public void test102() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test102#917");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test102");
    java.lang.String str1=org.apache.commons.lang.StringUtils.trimToEmpty("...                          ...");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "...                          ..."+ "'",str1.equals("...                          ..."));
  }
  @Test public void test103() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test103#925");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test103");
    try {
      java.lang.String str4=org.apache.commons.lang.StringUtils.overlayString("","                             Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!",(int)(short)-1,2);
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
    }
 catch (    java.lang.StringIndexOutOfBoundsException e) {
    }
  }
  @Test public void test104() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test104#936");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test104");
    java.lang.String str1=org.apache.commons.lang.StringUtils.defaultString("                                                                                       aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "                                                                                       aaaaaaaaa "+ "'",str1.equals("                                                                                       aaaaaaaaa "));
  }
  @Test public void test105() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test105#944");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test105");
    java.lang.Object[] objArray0=null;
    java.lang.String str4=org.apache.commons.lang.StringUtils.join(objArray0,'a',0,1);
    org.junit.Assert.assertNull(str4);
  }
  @Test public void test106() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test106#953");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test106");
    boolean boolean2=org.apache.commons.lang.StringUtils.containsNone("aaaaaaaaa ","A                                                hi!");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test107() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test107#961");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test107");
    java.util.Collection collection0=null;
    java.lang.String str2=org.apache.commons.lang.StringUtils.join(collection0,"... !ih...");
    org.junit.Assert.assertNull(str2);
  }
  @Test public void test108() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test108#970");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test108");
    int int2=org.apache.commons.lang.StringUtils.lastIndexOf("                             Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!",'#');
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test109() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test109#978");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test109");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringBefore("                          #A","Aaaaaaaaaaaaaaaaaaaa##Aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                          #A"+ "'",str2.equals("                          #A"));
  }
  @Test public void test110() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test110#986");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test110");
    java.lang.String str1=org.apache.commons.lang.StringUtils.stripToNull("a");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "a"+ "'",str1.equals("a"));
  }
  @Test public void test111() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test111#994");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test111");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.splitPreserveAllTokens("          ");
    int int3=org.apache.commons.lang.StringUtils.lastIndexOfAny("AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa",strArray2);
    java.lang.String str5=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray2,"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!");
    org.junit.Assert.assertNotNull(strArray2);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ 36+ "'",int3 == 36);
    org.junit.Assert.assertTrue("'" + str5 + "' != '"+ "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!"+ "'",str5.equals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!"));
  }
  @Test public void test112() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test112#1006");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test112");
    java.util.Iterator iterator0=null;
    java.lang.String str2=org.apache.commons.lang.StringUtils.join(iterator0,"             ");
    org.junit.Assert.assertNull(str2);
  }
  @Test public void test113() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test113#1015");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test113");
    java.lang.String str1=org.apache.commons.lang.StringUtils.trimToNull("hi!                         ...");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "hi!                         ..."+ "'",str1.equals("hi!                         ..."));
  }
  @Test public void test114() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test114#1023");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test114");
    java.lang.String str3=org.apache.commons.lang.StringUtils.substring("",(int)(byte)-1,100);
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ ""+ "'",str3.equals(""));
  }
  @Test public void test115() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test115#1031");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test115");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.splitPreserveAllTokens("#######################################################################################          ",'a');
    org.junit.Assert.assertNotNull(strArray2);
  }
  @Test public void test116() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test116#1039");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test116");
    java.lang.String str2=org.apache.commons.lang.StringUtils.stripStart("!iaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA","                                ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "!iaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA"+ "'",str2.equals("!iaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA"));
  }
  @Test public void test117() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test117#1047");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test117");
    try {
      java.lang.Number number1=org.apache.commons.lang.math.NumberUtils.createNumber("                                                                                       Aaaaaaaaa ");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message:                                                                                        Aaaaaaaaa  is not a valid number.");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test118() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test118#1058");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test118");
    java.lang.String[] strArray3=org.apache.commons.lang.StringUtils.splitByWholeSeparator("444444444444444444444444444444444444444444444          444444444444444444444444444444444444444444444","... !ih...                                ",156);
    org.junit.Assert.assertNotNull(strArray3);
  }
  @Test public void test119() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test119#1066");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test119");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringAfter("           4            ","                                                                                                HI!");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test120() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test120#1074");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test120");
    int int2=org.apache.commons.lang.StringUtils.countMatches("                                                                                              !iH","aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa             ");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 0+ "'",int2 == 0);
  }
  @Test public void test121() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test121#1082");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test121");
    boolean boolean2=org.apache.commons.lang.StringUtils.contains("Hi!   #######################################################################################             ######       A",'4');
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test122() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test122#1090");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test122");
    try {
      java.math.BigInteger bigInteger1=org.apache.commons.lang.math.NumberUtils.createBigInteger("                       AAAAAAAAA");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"     \"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test123() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test123#1101");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test123");
    java.lang.String str3=org.apache.commons.lang.StringUtils.mid("                                                hi!                                                 ",36,27);
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "            hi!            "+ "'",str3.equals("            hi!            "));
  }
  @Test public void test124() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test124#1109");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test124");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringBeforeLast("Aa ","  ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "Aa "+ "'",str2.equals("Aa "));
  }
  @Test public void test125() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test125#1117");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test125");
    java.lang.String str1=org.apache.commons.lang.StringUtils.strip("           ... !ih...           ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "... !ih..."+ "'",str1.equals("... !ih..."));
  }
  @Test public void test126() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test126#1125");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test126");
    java.lang.String str1=org.apache.commons.lang.StringUtils.chomp("... !ih...");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "... !ih..."+ "'",str1.equals("... !ih..."));
  }
  @Test public void test127() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test127#1133");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test127");
    java.lang.String str2=org.apache.commons.lang.StringUtils.repeat("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",99);
  }
  @Test public void test128() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test128#1140");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test128");
    int int2=org.apache.commons.lang.StringUtils.indexOf("                                                                                                                  HI!",' ');
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 0+ "'",int2 == 0);
  }
  @Test public void test129() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test129#1148");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test129");
    java.lang.String str2=org.apache.commons.lang.StringUtils.getChomp("A                                                hi!","");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test130() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test130#1156");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test130");
    boolean boolean2=org.apache.commons.lang.StringUtils.equals("#######################################################################################","AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaa");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test131() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test131#1164");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test131");
    java.lang.String str2=org.apache.commons.lang.StringUtils.remove("                                          aaaaaaaaa ","aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                                          aaaaaaaaa "+ "'",str2.equals("                                          aaaaaaaaa "));
  }
  @Test public void test132() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test132#1172");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test132");
    java.lang.String str2=org.apache.commons.lang.StringUtils.difference("                             Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaa","");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test133() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test133#1180");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test133");
    byte byte3=org.apache.commons.lang.math.NumberUtils.max((byte)-1,(byte)1,(byte)1);
    org.junit.Assert.assertTrue("'" + byte3 + "' != '"+ (byte)1+ "'",byte3 == (byte)1);
  }
  @Test public void test134() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test134#1188");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test134");
    java.lang.String str2=org.apache.commons.lang.StringUtils.remove("#########","4444444Hi!aaaaaaaa.. !ih..                                                                                                                                  ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "#########"+ "'",str2.equals("#########"));
  }
  @Test public void test135() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test135#1196");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test135");
    boolean boolean1=org.apache.commons.lang.math.NumberUtils.isDigits("AAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAA a");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test136() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test136#1204");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test136");
    try {
      java.lang.String str3=org.apache.commons.lang.StringUtils.abbreviate("aaaaaaaaa i!            ",(int)' ',0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
    }
 catch (    java.lang.IllegalArgumentException e) {
    }
  }
  @Test public void test137() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test137#1215");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test137");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!",'a');
    org.junit.Assert.assertNotNull(strArray2);
  }
  @Test public void test138() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test138#1223");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test138");
    java.lang.String str2=org.apache.commons.lang.StringUtils.reverseDelimited("Hi!   #######################################################################################       A",'a');
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "Hi!   #######################################################################################       A"+ "'",str2.equals("Hi!   #######################################################################################       A"));
  }
  @Test public void test139() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test139#1231");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test139");
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
    short short82=org.apache.commons.lang.math.NumberUtils.max(shortArray21);
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
  }
  @Test public void test140() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test140#1338");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test140");
    try {
      java.lang.Float float1=org.apache.commons.lang.math.NumberUtils.createFloat("aaaaaaaaa i!");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaaaaaaa i!\"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test141() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test141#1349");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test141");
    java.lang.String str1=org.apache.commons.lang.StringUtils.deleteSpaces("aa ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "aa"+ "'",str1.equals("aa"));
  }
  @Test public void test142() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test142#1357");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test142");
    int int3=org.apache.commons.lang.StringUtils.lastIndexOf("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAI!","AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai",21);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test143() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test143#1365");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test143");
    int int3=org.apache.commons.lang.StringUtils.lastIndexOf("",'a',0);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test144() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test144#1373");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test144");
    try {
      java.lang.Number number1=org.apache.commons.lang.math.NumberUtils.createNumber("aaaaaaaaaaaaaaaaaaaa##Aaaaaaaa");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: aaaaaaaaaaaaaaaaaaaa##Aaaaaaaa is not a valid number.");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test145() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test145#1384");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test145");
    double double2=org.apache.commons.lang.math.NumberUtils.toDouble("... !ih...",(double)' ');
    org.junit.Assert.assertTrue("'" + double2 + "' != '"+ 32.0d+ "'",double2 == 32.0d);
  }
  @Test public void test146() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test146#1392");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test146");
    boolean boolean2=org.apache.commons.lang.StringUtils.equalsIgnoreCase("AAAAAAAAA","IaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test147() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test147#1400");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test147");
    java.lang.String str2=org.apache.commons.lang.StringUtils.defaultIfEmpty("#############################################################################","444444444444444444444444444444444444444444444          44444444444444444444444444444444444444444444");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "#############################################################################"+ "'",str2.equals("#############################################################################"));
  }
  @Test public void test148() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test148#1408");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test148");
    try {
      java.lang.Float float1=org.apache.commons.lang.math.NumberUtils.createFloat("HI!");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"HI!\"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test149() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test149#1419");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test149");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringAfter("4444444444444444444444444444444444                                4444444444444444444444444444444444","   #######################################################################################aaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test150() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test150#1427");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test150");
    boolean boolean1=org.apache.commons.lang.StringUtils.isNumeric("                                                hi!                                                 ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test151() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test151#1435");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test151");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.split(" aaaaaaaaaaaaaaaaaaaa  aaaaaaaaa ","                                                                                                HI!");
    org.junit.Assert.assertNotNull(strArray2);
  }
  @Test public void test152() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test152#1443");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test152");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.splitPreserveAllTokens("                          aaaaaaaaA","###                     Aaaaaaaaa                                                                                        ");
    org.junit.Assert.assertNotNull(strArray2);
  }
  @Test public void test153() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test153#1451");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test153");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.split("!iaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA","aaaaaaaaaaaaaaaaaaaa##Aaaaaaaaa");
    java.lang.String str6=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray2,'4',(int)(byte)10,(int)(byte)10);
    org.junit.Assert.assertNotNull(strArray2);
    org.junit.Assert.assertTrue("'" + str6 + "' != '"+ ""+ "'",str6.equals(""));
  }
  @Test public void test154() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test154#1461");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test154");
    java.lang.String str1=org.apache.commons.lang.StringUtils.lowerCase("                   ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "                   "+ "'",str1.equals("                   "));
  }
  @Test public void test155() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test155#1469");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test155");
    java.lang.String str2=org.apache.commons.lang.StringUtils.difference("AAAAAAAAA","                                              hi");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                                              hi"+ "'",str2.equals("                                              hi"));
  }
  @Test public void test156() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test156#1477");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test156");
    java.lang.String[] strArray3=org.apache.commons.lang.StringUtils.split(" aaaaaa","   aaaaaaaaa                                        ",(int)(byte)100);
    org.junit.Assert.assertNotNull(strArray3);
  }
  @Test public void test157() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test157#1485");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test157");
    java.lang.String str1=org.apache.commons.lang.StringUtils.chompLast("AaaaaaaaaAaaaaaaaaAaaaaaaaaAa");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "AaaaaaaaaAaaaaaaaaAaaaaaaaaAa"+ "'",str1.equals("AaaaaaaaaAaaaaaaaaAaaaaaaaaAa"));
  }
  @Test public void test158() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test158#1493");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test158");
    int[] intArray2=new int[]{100,1};
    int[] intArray9=new int[]{(byte)-1,100,(short)0,100,'#',100};
    boolean boolean10=org.apache.commons.lang.math.NumberUtils.equals(intArray2,intArray9);
    int int11=org.apache.commons.lang.math.NumberUtils.max(intArray9);
    java.lang.Class<?> wildcardClass12=intArray9.getClass();
    int int13=org.apache.commons.lang.math.NumberUtils.min(intArray9);
    org.junit.Assert.assertNotNull(intArray2);
    org.junit.Assert.assertNotNull(intArray9);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '"+ false+ "'",boolean10 == false);
    org.junit.Assert.assertTrue("'" + int11 + "' != '"+ 100+ "'",int11 == 100);
    org.junit.Assert.assertNotNull(wildcardClass12);
    org.junit.Assert.assertTrue("'" + int13 + "' != '"+ (-1)+ "'",int13 == (-1));
  }
  @Test public void test159() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test159#1511");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test159");
    java.lang.String str3=org.apache.commons.lang.StringUtils.replaceChars("                       AAAAAAAAA","Aaaaaaaaa                                                    aaaaaaaaaaaaaaaaaaaa","  4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "44444444444444444444444         "+ "'",str3.equals("44444444444444444444444         "));
  }
  @Test public void test160() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test160#1519");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test160");
    java.lang.String str1=org.apache.commons.lang.StringUtils.defaultString("          ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "          "+ "'",str1.equals("          "));
  }
  @Test public void test161() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test161#1527");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test161");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringBefore("                                            aaaaaaaaa i!                                            ","A ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                                            aaaaaaaaa i!                                            "+ "'",str2.equals("                                            aaaaaaaaa i!                                            "));
  }
  @Test public void test162() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test162#1535");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test162");
    java.lang.String str2=org.apache.commons.lang.StringUtils.getChomp("Aaaaaaaaa                                                    aaaaaaaaaaaaaaaaaaaa","4444444hI!AAAAAAAAA                                                                                        ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test163() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test163#1543");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test163");
    boolean boolean1=org.apache.commons.lang.StringUtils.isNotBlank("##Aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test164() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test164#1551");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test164");
    java.lang.String str3=org.apache.commons.lang.StringUtils.mid("             ",31,(int)(short)1);
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ ""+ "'",str3.equals(""));
  }
  @Test public void test165() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test165#1559");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test165");
    boolean boolean1=org.apache.commons.lang.StringUtils.isBlank(" aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test166() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test166#1567");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test166");
    try {
      java.lang.Long long1=org.apache.commons.lang.math.NumberUtils.createLong("                                            !i aaaaaaaaa                                            ");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                                            !i aaaaaaaaa                                            \"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test167() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test167#1578");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test167");
    double double2=org.apache.commons.lang.math.NumberUtils.toDouble("Hi!###################################A",(double)' ');
    org.junit.Assert.assertTrue("'" + double2 + "' != '"+ 32.0d+ "'",double2 == 32.0d);
  }
  @Test public void test168() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test168#1586");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test168");
    float float3=org.apache.commons.lang.math.NumberUtils.max((float)99,(float)(-1),(float)52);
    org.junit.Assert.assertTrue("'" + float3 + "' != '"+ 99.0f+ "'",float3 == 99.0f);
  }
  @Test public void test169() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test169#1594");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test169");
    boolean boolean2=org.apache.commons.lang.StringUtils.equalsIgnoreCase("                                                                                                HI!","a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a ");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test170() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test170#1602");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test170");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.splitByWholeSeparator("...                    A","                         i!                         ");
    try {
      java.lang.String str6=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray2,'a',52,(int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
    }
 catch (    java.lang.ArrayIndexOutOfBoundsException e) {
    }
    org.junit.Assert.assertNotNull(strArray2);
  }
  @Test public void test171() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test171#1615");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test171");
    boolean boolean2=org.apache.commons.lang.StringUtils.containsOnly("AaaaaaaaaAaaaaaaaaAaaaaaaaaAa","... !ih...                                ");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test172() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test172#1623");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test172");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAlphanumeric("4444444Hi!aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test173() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test173#1631");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test173");
    int int2=org.apache.commons.lang.StringUtils.indexOf("H","aaaaaaaaa                                    ");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test174() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test174#1639");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test174");
    java.lang.String str3=org.apache.commons.lang.StringUtils.rightPad("aaaaaaaaaaaaaaaaaaaa",21,'a');
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "aaaaaaaaaaaaaaaaaaaaa"+ "'",str3.equals("aaaaaaaaaaaaaaaaaaaaa"));
  }
  @Test public void test175() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test175#1647");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test175");
    java.lang.String str3=org.apache.commons.lang.StringUtils.leftPad("",(int)(short)-1,'4');
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ ""+ "'",str3.equals(""));
  }
  @Test public void test176() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test176#1655");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test176");
    try {
      java.lang.String str3=org.apache.commons.lang.StringUtils.abbreviate("",3,(int)(byte)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
    }
 catch (    java.lang.IllegalArgumentException e) {
    }
  }
  @Test public void test177() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test177#1666");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test177");
    try {
      java.lang.String str3=org.apache.commons.lang.StringUtils.abbreviate("A!ih",3,(int)(byte)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
    }
 catch (    java.lang.IllegalArgumentException e) {
    }
  }
  @Test public void test178() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test178#1677");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test178");
    try {
      java.lang.Number number1=org.apache.commons.lang.math.NumberUtils.createNumber("                                   ");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: A blank string is not a valid number");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test179() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test179#1688");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test179");
    java.lang.String[] strArray3=org.apache.commons.lang.StringUtils.splitPreserveAllTokens("aaaaaaaaa ","",65);
    java.lang.Class<?> wildcardClass4=strArray3.getClass();
    org.junit.Assert.assertNotNull(strArray3);
    org.junit.Assert.assertNotNull(wildcardClass4);
  }
  @Test public void test180() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test180#1698");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test180");
    long long2=org.apache.commons.lang.math.NumberUtils.toLong("",(long)7);
    org.junit.Assert.assertTrue("'" + long2 + "' != '"+ 7L+ "'",long2 == 7L);
  }
  @Test public void test181() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test181#1706");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test181");
    java.lang.String str2=org.apache.commons.lang.StringUtils.remove("                                                    ",'a');
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                                                    "+ "'",str2.equals("                                                    "));
  }
  @Test public void test182() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test182#1714");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test182");
    java.lang.String str2=org.apache.commons.lang.StringUtils.abbreviate("aaaaaaaaa i!            ",36);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "aaaaaaaaa i!            "+ "'",str2.equals("aaaaaaaaa i!            "));
  }
  @Test public void test183() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test183#1722");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test183");
    try {
      java.lang.Float float1=org.apache.commons.lang.math.NumberUtils.createFloat("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test184() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test184#1733");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test184");
    boolean boolean1=org.apache.commons.lang.StringUtils.isNumericSpace("          4444444444444444444444");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test185() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test185#1741");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test185");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringAfterLast("                                                                                                                  HI!","                                                ...                          ......                 ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test186() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test186#1749");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test186");
    double double3=org.apache.commons.lang.math.NumberUtils.min(0.0d,(double)88,100.0d);
    org.junit.Assert.assertTrue("'" + double3 + "' != '"+ 0.0d+ "'",double3 == 0.0d);
  }
  @Test public void test187() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test187#1757");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test187");
    java.lang.String str1=org.apache.commons.lang.StringUtils.escape("aa  Aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "aa  Aaaaaaaaa"+ "'",str1.equals("aa  Aaaaaaaaa"));
  }
  @Test public void test188() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test188#1765");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test188");
    java.lang.String str2=org.apache.commons.lang.StringUtils.difference("              ","###                     Aaaaaaaaa                                                                                        ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "###                     Aaaaaaaaa                                                                                        "+ "'",str2.equals("###                     Aaaaaaaaa                                                                                        "));
  }
  @Test public void test189() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test189#1773");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test189");
    java.lang.String str1=org.apache.commons.lang.StringUtils.trimToNull(" aaaaaa");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "aaaaaa"+ "'",str1.equals("aaaaaa"));
  }
  @Test public void test190() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test190#1781");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test190");
    java.lang.String str1=org.apache.commons.lang.StringUtils.defaultString("AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaa"+ "'",str1.equals("AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaa"));
  }
  @Test public void test191() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test191#1789");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test191");
    java.lang.String str1=org.apache.commons.lang.StringUtils.clean("Aaaaaaaaa4");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "Aaaaaaaaa4"+ "'",str1.equals("Aaaaaaaaa4"));
  }
  @Test public void test192() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test192#1797");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test192");
    boolean boolean1=org.apache.commons.lang.math.NumberUtils.isDigits("                        AAAAAAAAAAAAAAAAAAAA                                                        ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test193() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test193#1805");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test193");
    float float3=org.apache.commons.lang.math.NumberUtils.max(0.0f,(float)31L,(float)97L);
    org.junit.Assert.assertTrue("'" + float3 + "' != '"+ 97.0f+ "'",float3 == 97.0f);
  }
  @Test public void test194() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test194#1813");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test194");
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
    byte[] byteArray25=null;
    boolean boolean26=org.apache.commons.lang.math.NumberUtils.equals(byteArray3,byteArray25);
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
    org.junit.Assert.assertTrue("'" + boolean26 + "' != '"+ false+ "'",boolean26 == false);
  }
  @Test public void test195() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test195#1845");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test195");
    long long2=org.apache.commons.lang.math.NumberUtils.toLong("             ",(long)96);
    org.junit.Assert.assertTrue("'" + long2 + "' != '"+ 96L+ "'",long2 == 96L);
  }
  @Test public void test196() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test196#1853");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test196");
    boolean boolean2=org.apache.commons.lang.StringUtils.contains("                                              hi",'4');
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test197() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test197#1861");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test197");
    boolean boolean1=org.apache.commons.lang.StringUtils.isWhitespace("AaaaaaaaaaaaaaaaaaaaAaaaaaaaa");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test198() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test198#1869");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test198");
    try {
      java.math.BigInteger bigInteger1=org.apache.commons.lang.math.NumberUtils.createBigInteger("###                     aaaaaaaaa");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"###   \"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test199() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test199#1880");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test199");
    int int2=org.apache.commons.lang.StringUtils.countMatches("a                                                HI!                                                 ","HI!");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 1+ "'",int2 == 1);
  }
  @Test public void test200() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test200#1888");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test200");
    java.lang.String[] strArray3=org.apache.commons.lang.StringUtils.split("                                                                                                                  HI!","!i aaaaaaaaa                                          ",(int)'4');
    org.junit.Assert.assertNotNull(strArray3);
  }
  @Test public void test201() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test201#1896");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test201");
    java.lang.String str2=org.apache.commons.lang.StringUtils.reverseDelimited("",' ');
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test202() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test202#1904");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test202");
    java.lang.String str1=org.apache.commons.lang.StringUtils.trim("aaaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "aaaaaaaaaa"+ "'",str1.equals("aaaaaaaaaa"));
  }
  @Test public void test203() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test203#1912");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test203");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringAfterLast("                                                              ","H");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test204() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test204#1920");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test204");
    boolean boolean2=org.apache.commons.lang.StringUtils.equals("###                                                                                       aaaaaaaaa ","Aaaaaaaaa4");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test205() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test205#1928");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test205");
    java.lang.String str2=org.apache.commons.lang.StringUtils.chomp("##Aaaaaaaaaaaaaaaaaa","");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "##Aaaaaaaaaaaaaaaaaa"+ "'",str2.equals("##Aaaaaaaaaaaaaaaaaa"));
  }
  @Test public void test206() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test206#1936");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test206");
    java.lang.String str1=org.apache.commons.lang.StringUtils.defaultString("Hi!                                   A");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "Hi!                                   A"+ "'",str1.equals("Hi!                                   A"));
  }
  @Test public void test207() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test207#1944");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test207");
    int int2=org.apache.commons.lang.StringUtils.indexOf("a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a ",' ');
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 1+ "'",int2 == 1);
  }
  @Test public void test208() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test208#1952");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test208");
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
    byte byte50=org.apache.commons.lang.math.NumberUtils.min(byteArray44);
    boolean boolean51=org.apache.commons.lang.math.NumberUtils.equals(byteArray27,byteArray44);
    byte byte52=org.apache.commons.lang.math.NumberUtils.max(byteArray44);
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
    org.junit.Assert.assertTrue("'" + byte50 + "' != '"+ (byte)0+ "'",byte50 == (byte)0);
    org.junit.Assert.assertTrue("'" + boolean51 + "' != '"+ false+ "'",boolean51 == false);
    org.junit.Assert.assertTrue("'" + byte52 + "' != '"+ (byte)100+ "'",byte52 == (byte)100);
  }
  @Test public void test209() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test209#2012");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test209");
    try {
      java.math.BigInteger bigInteger1=org.apache.commons.lang.math.NumberUtils.createBigInteger("...                    A");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"...   \"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test210() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test210#2023");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test210");
    boolean boolean1=org.apache.commons.lang.StringUtils.isEmpty("###                     aaaaaaaaa                                                                                        ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test211() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test211#2031");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test211");
    double double2=org.apache.commons.lang.math.NumberUtils.toDouble("A...",(double)94L);
    org.junit.Assert.assertTrue("'" + double2 + "' != '"+ 94.0d+ "'",double2 == 94.0d);
  }
  @Test public void test212() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test212#2039");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test212");
    try {
      java.math.BigInteger bigInteger1=org.apache.commons.lang.math.NumberUtils.createBigInteger("                             aaaaaaaaa                                                                  ");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"     \"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test213() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test213#2050");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test213");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringBeforeLast("h#################...#################...#################...#################...#######","!ih");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "h#################...#################...#################...#################...#######"+ "'",str2.equals("h#################...#################...#################...#################...#######"));
  }
  @Test public void test214() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test214#2058");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test214");
    int int3=org.apache.commons.lang.StringUtils.indexOf("   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa","Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai",(int)(byte)1);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test215() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test215#2066");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test215");
    long long3=org.apache.commons.lang.math.NumberUtils.max((long)7,(long)(short)0,31L);
    org.junit.Assert.assertTrue("'" + long3 + "' != '"+ 31L+ "'",long3 == 31L);
  }
  @Test public void test216() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test216#2074");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test216");
    java.lang.String str2=org.apache.commons.lang.StringUtils.center("444444444444444444444444444444444444444444444          44444444444444444444444444444444444444444444",0);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "444444444444444444444444444444444444444444444          44444444444444444444444444444444444444444444"+ "'",str2.equals("444444444444444444444444444444444444444444444          44444444444444444444444444444444444444444444"));
  }
  @Test public void test217() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test217#2082");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test217");
    try {
      java.lang.Integer int1=org.apache.commons.lang.math.NumberUtils.createInteger("                                                ...                          ......                 ");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                                                ...                          ......                 \"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test218() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test218#2093");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test218");
    try {
      java.lang.Number number1=org.apache.commons.lang.math.NumberUtils.createNumber("#aaaaaaaaa");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: #aaaaaaaaa is not a valid number.");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test219() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test219#2104");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test219");
    double double1=org.apache.commons.lang.math.NumberUtils.toDouble("aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + double1 + "' != '"+ 0.0d+ "'",double1 == 0.0d);
  }
  @Test public void test220() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test220#2112");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test220");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAlphaSpace("   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test221() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test221#2120");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test221");
    java.lang.String str2=org.apache.commons.lang.StringUtils.getPrechomp("                             hi!                                   A                             ","                                                                                   aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test222() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test222#2128");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test222");
    int int3=org.apache.commons.lang.StringUtils.lastIndexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!","#################...",29);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test223() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test223#2136");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test223");
    int int2=org.apache.commons.lang.math.NumberUtils.toInt("AaaaaaaaaAaaaaaaaaAaaaaaaaaAa",100);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 100+ "'",int2 == 100);
  }
  @Test public void test224() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test224#2144");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test224");
    int int3=org.apache.commons.lang.math.NumberUtils.max(96,(int)(short)-1,0);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ 96+ "'",int3 == 96);
  }
  @Test public void test225() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test225#2152");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test225");
    int int2=org.apache.commons.lang.StringUtils.indexOfDifference("a                                                HI!","HI!");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 0+ "'",int2 == 0);
  }
  @Test public void test226() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test226#2160");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test226");
    java.lang.String str3=org.apache.commons.lang.StringUtils.replaceChars("         ",'4','#');
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "         "+ "'",str3.equals("         "));
  }
  @Test public void test227() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test227#2168");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test227");
    float[] floatArray3=new float[]{(byte)-1,(-1.0f),(byte)100};
    float float4=org.apache.commons.lang.math.NumberUtils.max(floatArray3);
    float[] floatArray6=new float[]{(byte)1};
    float float7=org.apache.commons.lang.math.NumberUtils.max(floatArray6);
    boolean boolean8=org.apache.commons.lang.math.NumberUtils.equals(floatArray3,floatArray6);
    float float9=org.apache.commons.lang.math.NumberUtils.max(floatArray3);
    float float10=org.apache.commons.lang.math.NumberUtils.max(floatArray3);
    float[] floatArray14=new float[]{(byte)-1,(-1.0f),(byte)100};
    float float15=org.apache.commons.lang.math.NumberUtils.max(floatArray14);
    float[] floatArray17=new float[]{(byte)1};
    float float18=org.apache.commons.lang.math.NumberUtils.max(floatArray17);
    boolean boolean19=org.apache.commons.lang.math.NumberUtils.equals(floatArray14,floatArray17);
    float float20=org.apache.commons.lang.math.NumberUtils.max(floatArray14);
    float[] floatArray21=null;
    boolean boolean22=org.apache.commons.lang.math.NumberUtils.equals(floatArray14,floatArray21);
    float float23=org.apache.commons.lang.math.NumberUtils.max(floatArray14);
    boolean boolean24=org.apache.commons.lang.math.NumberUtils.equals(floatArray3,floatArray14);
    org.junit.Assert.assertNotNull(floatArray3);
    org.junit.Assert.assertTrue("'" + float4 + "' != '"+ 100.0f+ "'",float4 == 100.0f);
    org.junit.Assert.assertNotNull(floatArray6);
    org.junit.Assert.assertTrue("'" + float7 + "' != '"+ 1.0f+ "'",float7 == 1.0f);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '"+ false+ "'",boolean8 == false);
    org.junit.Assert.assertTrue("'" + float9 + "' != '"+ 100.0f+ "'",float9 == 100.0f);
    org.junit.Assert.assertTrue("'" + float10 + "' != '"+ 100.0f+ "'",float10 == 100.0f);
    org.junit.Assert.assertNotNull(floatArray14);
    org.junit.Assert.assertTrue("'" + float15 + "' != '"+ 100.0f+ "'",float15 == 100.0f);
    org.junit.Assert.assertNotNull(floatArray17);
    org.junit.Assert.assertTrue("'" + float18 + "' != '"+ 1.0f+ "'",float18 == 1.0f);
    org.junit.Assert.assertTrue("'" + boolean19 + "' != '"+ false+ "'",boolean19 == false);
    org.junit.Assert.assertTrue("'" + float20 + "' != '"+ 100.0f+ "'",float20 == 100.0f);
    org.junit.Assert.assertTrue("'" + boolean22 + "' != '"+ false+ "'",boolean22 == false);
    org.junit.Assert.assertTrue("'" + float23 + "' != '"+ 100.0f+ "'",float23 == 100.0f);
    org.junit.Assert.assertTrue("'" + boolean24 + "' != '"+ true+ "'",boolean24 == true);
  }
  @Test public void test228() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test228#2207");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test228");
    java.lang.String str2=org.apache.commons.lang.StringUtils.defaultString("                                                              ","##A##A#!ih");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                                                              "+ "'",str2.equals("                                                              "));
  }
  @Test public void test229() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test229#2215");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test229");
    boolean boolean2=org.apache.commons.lang.StringUtils.equals("...                    A","Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test230() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test230#2223");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test230");
    java.lang.String[] strArray0=null;
    java.lang.String[] strArray1=org.apache.commons.lang.StringUtils.stripAll(strArray0);
    org.junit.Assert.assertNull(strArray1);
  }
  @Test public void test231() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test231#2232");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test231");
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
    boolean boolean18=org.apache.commons.lang.math.NumberUtils.equals(doubleArray0,doubleArray8);
    try {
      double double19=org.apache.commons.lang.math.NumberUtils.min(doubleArray8);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array cannot be empty.");
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
    org.junit.Assert.assertTrue("'" + boolean18 + "' != '"+ false+ "'",boolean18 == false);
  }
  @Test public void test232() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test232#2264");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test232");
    java.lang.String[] strArray1=org.apache.commons.lang.StringUtils.split("aaaaaaaaaa");
    org.junit.Assert.assertNotNull(strArray1);
  }
  @Test public void test233() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test233#2272");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test233");
    java.lang.String str3=org.apache.commons.lang.StringUtils.substring("",(int)(short)0,108);
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ ""+ "'",str3.equals(""));
  }
  @Test public void test234() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test234#2280");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test234");
    int int2=org.apache.commons.lang.StringUtils.lastIndexOf("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh",' ');
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test235() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test235#2288");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test235");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringAfterLast("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa","                                                                                                 ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test236() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test236#2296");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test236");
    java.lang.String str2=org.apache.commons.lang.StringUtils.reverseDelimited("AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaa",'4');
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaa"+ "'",str2.equals("AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaa"));
  }
  @Test public void test237() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test237#2304");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test237");
    try {
      java.math.BigDecimal bigDecimal1=org.apache.commons.lang.math.NumberUtils.createBigDecimal("aaaaaaaaaaaaaaaaaaaa##Aaaaaaaaa");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test238() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test238#2315");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test238");
    char[] charArray9=new char[]{'#','4','#','#',' '};
    int int10=org.apache.commons.lang.StringUtils.indexOfAnyBut("Aaaaaaaaa ",charArray9);
    boolean boolean11=org.apache.commons.lang.StringUtils.containsNone("",charArray9);
    int int12=org.apache.commons.lang.StringUtils.indexOfAnyBut("4444444Hi!aaaaaaaaa                                                                                        ",charArray9);
    boolean boolean13=org.apache.commons.lang.StringUtils.containsOnly("aaaaaaaaa                                        ",charArray9);
    org.junit.Assert.assertNotNull(charArray9);
    org.junit.Assert.assertTrue("'" + int10 + "' != '"+ 0+ "'",int10 == 0);
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '"+ true+ "'",boolean11 == true);
    org.junit.Assert.assertTrue("'" + int12 + "' != '"+ 7+ "'",int12 == 7);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '"+ false+ "'",boolean13 == false);
  }
  @Test public void test239() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test239#2331");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test239");
    java.lang.String str2=org.apache.commons.lang.StringUtils.remove("                     ","                                          aaaaaaaaa i!");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                     "+ "'",str2.equals("                     "));
  }
  @Test public void test240() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test240#2339");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test240");
    int int2=org.apache.commons.lang.math.NumberUtils.toInt("aaaaaaaaaaaaaaaaaaaa##Aaaaaaaahi!aaaaaaaaaaaaaaaaaaaa##Aaaaaaaa",0);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 0+ "'",int2 == 0);
  }
  @Test public void test241() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test241#2347");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test241");
    java.lang.String[] strArray3=org.apache.commons.lang.StringUtils.splitByWholeSeparator("A                                                hi!                                                 ","A                                                hi!                                                 ",(int)'#');
    java.lang.String str4=org.apache.commons.lang.StringUtils.concatenate((java.lang.Object[])strArray3);
    org.junit.Assert.assertNotNull(strArray3);
    org.junit.Assert.assertTrue("'" + str4 + "' != '"+ ""+ "'",str4.equals(""));
  }
  @Test public void test242() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test242#2357");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test242");
    float float3=org.apache.commons.lang.math.NumberUtils.min(0.0f,(float)87,(float)35);
    org.junit.Assert.assertTrue("'" + float3 + "' != '"+ 0.0f+ "'",float3 == 0.0f);
  }
  @Test public void test243() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test243#2365");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test243");
    boolean boolean1=org.apache.commons.lang.math.NumberUtils.isNumber(" a                                                                                       ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test244() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test244#2373");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test244");
    java.lang.String str3=org.apache.commons.lang.StringUtils.substringBetween("                                                                                              !Ih","aa","iaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaA");
    org.junit.Assert.assertNull(str3);
  }
  @Test public void test245() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test245#2381");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test245");
    java.lang.String str4=org.apache.commons.lang.StringUtils.replace("  ","###                     aaaaaaaaa","i!",0);
    org.junit.Assert.assertTrue("'" + str4 + "' != '"+ "  "+ "'",str4.equals("  "));
  }
  @Test public void test246() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test246#2389");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test246");
    float[] floatArray3=new float[]{(byte)-1,(-1.0f),(byte)100};
    float float4=org.apache.commons.lang.math.NumberUtils.max(floatArray3);
    float[] floatArray6=new float[]{(byte)1};
    float float7=org.apache.commons.lang.math.NumberUtils.max(floatArray6);
    boolean boolean8=org.apache.commons.lang.math.NumberUtils.equals(floatArray3,floatArray6);
    java.lang.Class<?> wildcardClass9=floatArray6.getClass();
    float float10=org.apache.commons.lang.math.NumberUtils.min(floatArray6);
    org.junit.Assert.assertNotNull(floatArray3);
    org.junit.Assert.assertTrue("'" + float4 + "' != '"+ 100.0f+ "'",float4 == 100.0f);
    org.junit.Assert.assertNotNull(floatArray6);
    org.junit.Assert.assertTrue("'" + float7 + "' != '"+ 1.0f+ "'",float7 == 1.0f);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '"+ false+ "'",boolean8 == false);
    org.junit.Assert.assertNotNull(wildcardClass9);
    org.junit.Assert.assertTrue("'" + float10 + "' != '"+ 1.0f+ "'",float10 == 1.0f);
  }
  @Test public void test247() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test247#2409");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test247");
    long[] longArray1=new long[]{'#'};
    long[] longArray5=new long[]{97,(-1),' '};
    boolean boolean6=org.apache.commons.lang.math.NumberUtils.equals(longArray1,longArray5);
    long[] longArray8=new long[]{'#'};
    long[] longArray12=new long[]{97,(-1),' '};
    boolean boolean13=org.apache.commons.lang.math.NumberUtils.equals(longArray8,longArray12);
    long long14=org.apache.commons.lang.math.NumberUtils.max(longArray12);
    long long15=org.apache.commons.lang.math.NumberUtils.max(longArray12);
    long long16=org.apache.commons.lang.math.NumberUtils.min(longArray12);
    long long17=org.apache.commons.lang.math.NumberUtils.max(longArray12);
    long long18=org.apache.commons.lang.math.NumberUtils.min(longArray12);
    boolean boolean19=org.apache.commons.lang.math.NumberUtils.equals(longArray1,longArray12);
    org.junit.Assert.assertNotNull(longArray1);
    org.junit.Assert.assertNotNull(longArray5);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '"+ false+ "'",boolean6 == false);
    org.junit.Assert.assertNotNull(longArray8);
    org.junit.Assert.assertNotNull(longArray12);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '"+ false+ "'",boolean13 == false);
    org.junit.Assert.assertTrue("'" + long14 + "' != '"+ 97L+ "'",long14 == 97L);
    org.junit.Assert.assertTrue("'" + long15 + "' != '"+ 97L+ "'",long15 == 97L);
    org.junit.Assert.assertTrue("'" + long16 + "' != '"+ (-1L)+ "'",long16 == (-1L));
    org.junit.Assert.assertTrue("'" + long17 + "' != '"+ 97L+ "'",long17 == 97L);
    org.junit.Assert.assertTrue("'" + long18 + "' != '"+ (-1L)+ "'",long18 == (-1L));
    org.junit.Assert.assertTrue("'" + boolean19 + "' != '"+ false+ "'",boolean19 == false);
  }
  @Test public void test248() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test248#2439");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test248");
    java.lang.String str2=org.apache.commons.lang.StringUtils.difference("##Aaaaaaaaaaaaaaaaaa","");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test249() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test249#2447");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test249");
    java.lang.String str2=org.apache.commons.lang.StringUtils.right("                                ",32);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                                "+ "'",str2.equals("                                "));
  }
  @Test public void test250() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test250#2455");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test250");
    java.lang.String str2=org.apache.commons.lang.StringUtils.removeEnd("","AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test251() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test251#2463");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test251");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substring("HI!",(int)(byte)10);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test252() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test252#2471");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test252");
    java.lang.String str2=org.apache.commons.lang.StringUtils.leftPad("iaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA",2);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "iaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA"+ "'",str2.equals("iaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA"));
  }
  @Test public void test253() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test253#2479");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test253");
    java.util.Iterator iterator0=null;
    java.lang.String str2=org.apache.commons.lang.StringUtils.join(iterator0,"###                                                                                       aaaaaaaaa         ");
    org.junit.Assert.assertNull(str2);
  }
  @Test public void test254() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test254#2488");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test254");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.splitPreserveAllTokens(" ",' ');
    try {
      java.lang.String str6=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray2,'#',(int)(short)-1,(int)(short)0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
    }
 catch (    java.lang.ArrayIndexOutOfBoundsException e) {
    }
    org.junit.Assert.assertNotNull(strArray2);
  }
  @Test public void test255() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test255#2501");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test255");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringBefore("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai"," aaaaaaaaaaaaaaaaaaaa  aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai"+ "'",str2.equals("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai"));
  }
  @Test public void test256() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test256#2509");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test256");
    int[] intArray6=new int[]{24,63,(short)-1,26,' ',(byte)0};
    int int7=org.apache.commons.lang.math.NumberUtils.min(intArray6);
    int int8=org.apache.commons.lang.math.NumberUtils.max(intArray6);
    org.junit.Assert.assertNotNull(intArray6);
    org.junit.Assert.assertTrue("'" + int7 + "' != '"+ (-1)+ "'",int7 == (-1));
    org.junit.Assert.assertTrue("'" + int8 + "' != '"+ 63+ "'",int8 == 63);
  }
  @Test public void test257() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test257#2521");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test257");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAlphaSpace("                 ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test258() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test258#2529");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test258");
    float[] floatArray0=null;
    float[] floatArray7=new float[]{(-1.0f),0,96,94,(byte)-1,(-1)};
    float[] floatArray12=new float[]{10,(byte)1,1L,(byte)-1};
    float float13=org.apache.commons.lang.math.NumberUtils.max(floatArray12);
    boolean boolean14=org.apache.commons.lang.math.NumberUtils.equals(floatArray7,floatArray12);
    float[] floatArray18=new float[]{(byte)-1,(-1.0f),(byte)100};
    float float19=org.apache.commons.lang.math.NumberUtils.max(floatArray18);
    float[] floatArray21=new float[]{(byte)1};
    float float22=org.apache.commons.lang.math.NumberUtils.max(floatArray21);
    boolean boolean23=org.apache.commons.lang.math.NumberUtils.equals(floatArray18,floatArray21);
    boolean boolean24=org.apache.commons.lang.math.NumberUtils.equals(floatArray12,floatArray21);
    float float25=org.apache.commons.lang.math.NumberUtils.min(floatArray21);
    float[] floatArray32=new float[]{(-1.0f),0,96,94,(byte)-1,(-1)};
    float[] floatArray37=new float[]{10,(byte)1,1L,(byte)-1};
    float float38=org.apache.commons.lang.math.NumberUtils.max(floatArray37);
    boolean boolean39=org.apache.commons.lang.math.NumberUtils.equals(floatArray32,floatArray37);
    boolean boolean40=org.apache.commons.lang.math.NumberUtils.equals(floatArray21,floatArray32);
    boolean boolean41=org.apache.commons.lang.math.NumberUtils.equals(floatArray0,floatArray21);
    org.junit.Assert.assertNotNull(floatArray7);
    org.junit.Assert.assertNotNull(floatArray12);
    org.junit.Assert.assertTrue("'" + float13 + "' != '"+ 10.0f+ "'",float13 == 10.0f);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '"+ false+ "'",boolean14 == false);
    org.junit.Assert.assertNotNull(floatArray18);
    org.junit.Assert.assertTrue("'" + float19 + "' != '"+ 100.0f+ "'",float19 == 100.0f);
    org.junit.Assert.assertNotNull(floatArray21);
    org.junit.Assert.assertTrue("'" + float22 + "' != '"+ 1.0f+ "'",float22 == 1.0f);
    org.junit.Assert.assertTrue("'" + boolean23 + "' != '"+ false+ "'",boolean23 == false);
    org.junit.Assert.assertTrue("'" + boolean24 + "' != '"+ false+ "'",boolean24 == false);
    org.junit.Assert.assertTrue("'" + float25 + "' != '"+ 1.0f+ "'",float25 == 1.0f);
    org.junit.Assert.assertNotNull(floatArray32);
    org.junit.Assert.assertNotNull(floatArray37);
    org.junit.Assert.assertTrue("'" + float38 + "' != '"+ 10.0f+ "'",float38 == 10.0f);
    org.junit.Assert.assertTrue("'" + boolean39 + "' != '"+ false+ "'",boolean39 == false);
    org.junit.Assert.assertTrue("'" + boolean40 + "' != '"+ false+ "'",boolean40 == false);
    org.junit.Assert.assertTrue("'" + boolean41 + "' != '"+ false+ "'",boolean41 == false);
  }
  @Test public void test259() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test259#2570");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test259");
    java.lang.String[] strArray3=org.apache.commons.lang.StringUtils.splitPreserveAllTokens("                                                                                                                  HI!","aaaaaaaaaa",31);
    org.junit.Assert.assertNotNull(strArray3);
  }
  @Test public void test260() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test260#2578");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test260");
    java.lang.String str1=org.apache.commons.lang.StringUtils.stripToEmpty("HI!");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "HI!"+ "'",str1.equals("HI!"));
  }
  @Test public void test261() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test261#2586");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test261");
    java.lang.String str1=org.apache.commons.lang.StringUtils.stripToEmpty("          #############################################################################");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "#############################################################################"+ "'",str1.equals("#############################################################################"));
  }
  @Test public void test262() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test262#2594");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test262");
    java.lang.String str1=org.apache.commons.lang.StringUtils.capitaliseAllWords("hi!");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "Hi!"+ "'",str1.equals("Hi!"));
  }
  @Test public void test263() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test263#2602");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test263");
    java.lang.String[] strArray1=org.apache.commons.lang.StringUtils.split("          ");
    java.lang.String str3=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray1,"                                                                                                 ");
    java.lang.String str7=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray1,' ',(int)(short)100,(int)(byte)0);
    org.junit.Assert.assertNotNull(strArray1);
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ ""+ "'",str3.equals(""));
    org.junit.Assert.assertTrue("'" + str7 + "' != '"+ ""+ "'",str7.equals(""));
  }
  @Test public void test264() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test264#2614");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test264");
    boolean boolean1=org.apache.commons.lang.StringUtils.isNotBlank("aaaaaaaaaaaaaaaaaaaa##Aaaaaaaaa                                                                  ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test265() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test265#2622");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test265");
    boolean boolean2=org.apache.commons.lang.StringUtils.containsOnly("             ","...                          ...");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ true+ "'",boolean2 == true);
  }
  @Test public void test266() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test266#2630");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test266");
    java.lang.String str2=org.apache.commons.lang.StringUtils.remove("hi!                         ...",'a');
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "hi!                         ..."+ "'",str2.equals("hi!                         ..."));
  }
  @Test public void test267() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test267#2638");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test267");
    java.lang.String str3=org.apache.commons.lang.StringUtils.leftPad(" aaaaaa",43,'#');
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "#################################### aaaaaa"+ "'",str3.equals("#################################### aaaaaa"));
  }
  @Test public void test268() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test268#2646");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test268");
    try {
      java.math.BigInteger bigInteger1=org.apache.commons.lang.math.NumberUtils.createBigInteger("");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test269() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test269#2657");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test269");
    java.lang.String str3=org.apache.commons.lang.StringUtils.leftPad("AAAAAAAAA ",47,"Aa hi!");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "Aa hi!Aa hi!Aa hi!Aa hi!Aa hi!Aa hi!AAAAAAAAAA "+ "'",str3.equals("Aa hi!Aa hi!Aa hi!Aa hi!Aa hi!Aa hi!AAAAAAAAAA "));
  }
  @Test public void test270() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test270#2665");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test270");
    java.lang.String str2=org.apache.commons.lang.StringUtils.removeStart("hi!                         ...","                                              hi!");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "hi!                         ..."+ "'",str2.equals("hi!                         ..."));
  }
  @Test public void test271() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test271#2673");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test271");
    byte byte3=org.apache.commons.lang.math.NumberUtils.max((byte)10,(byte)100,(byte)10);
    org.junit.Assert.assertTrue("'" + byte3 + "' != '"+ (byte)100+ "'",byte3 == (byte)100);
  }
  @Test public void test272() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test272#2681");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test272");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.splitPreserveAllTokens("hi!","#######################################################################################          ");
    java.lang.String str6=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray2,"444444444444444444444444444444444444444444444          444444444444444444444444444444444444444444444",27,(-1));
    org.junit.Assert.assertNotNull(strArray2);
    org.junit.Assert.assertTrue("'" + str6 + "' != '"+ ""+ "'",str6.equals(""));
  }
  @Test public void test273() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test273#2691");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test273");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAsciiPrintable("##Aaaaaaaaaaaaaaaaaa");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test274() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test274#2699");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test274");
    java.lang.String str1=org.apache.commons.lang.StringUtils.lowerCase("A");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "a"+ "'",str1.equals("a"));
  }
  @Test public void test275() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test275#2707");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test275");
    int int2=org.apache.commons.lang.StringUtils.indexOfAny("a                                                HI!                                                 ","");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test276() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test276#2715");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test276");
    short short3=org.apache.commons.lang.math.NumberUtils.min((short)0,(short)0,(short)(byte)1);
    org.junit.Assert.assertTrue("'" + short3 + "' != '"+ (short)0+ "'",short3 == (short)0);
  }
  @Test public void test277() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test277#2723");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test277");
    boolean boolean2=org.apache.commons.lang.StringUtils.containsIgnoreCase("","aaaaaaaaa                                    ");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test278() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test278#2731");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test278");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringAfterLast(" 4            ","#################################### aaaaaa");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test279() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test279#2739");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test279");
    try {
      java.lang.Long long1=org.apache.commons.lang.math.NumberUtils.createLong("    a     ");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"    a     \"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test280() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test280#2750");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test280");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringBetween("...                    A","");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test281() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test281#2758");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test281");
    java.lang.String str1=org.apache.commons.lang.StringUtils.capitalise("                                                ...                          ......                 ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "                                                ...                          ......                 "+ "'",str1.equals("                                                ...                          ......                 "));
  }
  @Test public void test282() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test282#2766");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test282");
    int int2=org.apache.commons.lang.StringUtils.countMatches("                          #A","4444444hi!aaaaaaaaa                                                                                        ");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 0+ "'",int2 == 0);
  }
  @Test public void test283() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test283#2774");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test283");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.splitPreserveAllTokens("#######################################################################################          ","aaaaaaaaa");
    java.lang.String str4=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray2,"                                          aaaaaaaaa ");
    java.lang.Class<?> wildcardClass5=strArray2.getClass();
    org.junit.Assert.assertNotNull(strArray2);
    org.junit.Assert.assertTrue("'" + str4 + "' != '"+ "#######################################################################################          "+ "'",str4.equals("#######################################################################################          "));
    org.junit.Assert.assertNotNull(wildcardClass5);
  }
  @Test public void test284() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test284#2786");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test284");
    java.lang.String str1=org.apache.commons.lang.StringUtils.lowerCase("i!");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "i!"+ "'",str1.equals("i!"));
  }
  @Test public void test285() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test285#2794");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test285");
    java.lang.String str1=org.apache.commons.lang.StringUtils.clean("...                          ...");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "...                          ..."+ "'",str1.equals("...                          ..."));
  }
  @Test public void test286() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test286#2802");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test286");
    java.lang.String str1=org.apache.commons.lang.StringUtils.deleteSpaces(" aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "aaaaaaaaa"+ "'",str1.equals("aaaaaaaaa"));
  }
  @Test public void test287() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test287#2810");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test287");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.split("  ",'#');
    org.junit.Assert.assertNotNull(strArray2);
  }
  @Test public void test288() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test288#2818");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test288");
    int int2=org.apache.commons.lang.StringUtils.lastIndexOf("A########                          ",' ');
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 34+ "'",int2 == 34);
  }
  @Test public void test289() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test289#2826");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test289");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.split("                             Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!","aaaaaaaaa i!");
    try {
      java.lang.String str6=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray2,'#',7,27);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
    }
 catch (    java.lang.ArrayIndexOutOfBoundsException e) {
    }
    org.junit.Assert.assertNotNull(strArray2);
  }
  @Test public void test290() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test290#2839");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test290");
    boolean boolean1=org.apache.commons.lang.math.NumberUtils.isDigits("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test291() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test291#2847");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test291");
    java.lang.String str3=org.apache.commons.lang.StringUtils.replaceChars("",' ','a');
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ ""+ "'",str3.equals(""));
  }
  @Test public void test292() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test292#2855");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test292");
    int int3=org.apache.commons.lang.math.NumberUtils.min(7,99,(int)(short)-1);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test293() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test293#2863");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test293");
    java.lang.String str3=org.apache.commons.lang.StringUtils.getNestedString("aAAAAAAAA                                       HI!","Hi!   #######################################################################################       A","aaaaaaaaaaaaaaaaaaaaa");
    org.junit.Assert.assertNull(str3);
  }
  @Test public void test294() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test294#2871");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test294");
    long long2=org.apache.commons.lang.math.NumberUtils.toLong("Hi!",(long)3);
    org.junit.Assert.assertTrue("'" + long2 + "' != '"+ 3L+ "'",long2 == 3L);
  }
  @Test public void test295() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test295#2879");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test295");
    java.lang.String str2=org.apache.commons.lang.StringUtils.defaultIfEmpty("4                                                ","");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "4                                                "+ "'",str2.equals("4                                                "));
  }
  @Test public void test296() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test296#2887");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test296");
    java.lang.String str2=org.apache.commons.lang.StringUtils.defaultIfEmpty("","4444444Hi!aaaaaaaaa                                                                                        ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "4444444Hi!aaaaaaaaa                                                                                        "+ "'",str2.equals("4444444Hi!aaaaaaaaa                                                                                        "));
  }
  @Test public void test297() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test297#2895");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test297");
    java.lang.String str2=org.apache.commons.lang.StringUtils.defaultIfEmpty("                                   "," 4            ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                                   "+ "'",str2.equals("                                   "));
  }
  @Test public void test298() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test298#2903");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test298");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringBefore("iaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaA","          aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "iaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaA"+ "'",str2.equals("iaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaA"));
  }
  @Test public void test299() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test299#2911");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test299");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringBefore("...","Aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "..."+ "'",str2.equals("..."));
  }
  @Test public void test300() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test300#2919");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test300");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAlphaSpace("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test301() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test301#2927");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test301");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAlpha("Aa");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test302() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test302#2935");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test302");
    java.lang.String str1=org.apache.commons.lang.StringUtils.capitalise("                   ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "                   "+ "'",str1.equals("                   "));
  }
  @Test public void test303() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test303#2943");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test303");
    long long3=org.apache.commons.lang.math.NumberUtils.min((long)104,(long)41,(long)(byte)0);
    org.junit.Assert.assertTrue("'" + long3 + "' != '"+ 0L+ "'",long3 == 0L);
  }
  @Test public void test304() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test304#2951");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test304");
    java.lang.String str2=org.apache.commons.lang.StringUtils.chompLast("","Aaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test305() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test305#2959");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test305");
    java.lang.String[] strArray1=org.apache.commons.lang.StringUtils.split("aaaaaaaaa ");
    java.lang.String str3=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray1,' ');
    org.junit.Assert.assertNotNull(strArray1);
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "aaaaaaaaa"+ "'",str3.equals("aaaaaaaaa"));
  }
  @Test public void test306() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test306#2969");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test306");
    java.lang.String str2=org.apache.commons.lang.StringUtils.stripEnd("                          AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa                          ","Hi!                                                                                              ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                          AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa"+ "'",str2.equals("                          AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa"));
  }
  @Test public void test307() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test307#2977");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test307");
    java.lang.String str1=org.apache.commons.lang.StringUtils.uncapitalise("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!"+ "'",str1.equals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!"));
  }
  @Test public void test308() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test308#2985");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test308");
    boolean boolean2=org.apache.commons.lang.StringUtils.equalsIgnoreCase(" aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa ",".. !ih..                                           ");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test309() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test309#2993");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test309");
    try {
      java.math.BigInteger bigInteger1=org.apache.commons.lang.math.NumberUtils.createBigInteger("Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!    ");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"Aaaaa\"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test310() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test310#3004");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test310");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.splitByWholeSeparator("                                                hi!                                                 ","HHHHHHHHHH");
    org.junit.Assert.assertNotNull(strArray2);
  }
  @Test public void test311() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test311#3012");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test311");
    java.lang.String str2=org.apache.commons.lang.StringUtils.getPrechomp("H","hi!A");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test312() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test312#3020");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test312");
    int int3=org.apache.commons.lang.StringUtils.ordinalIndexOf("aa ","                       AAAAAAAAA",36);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test313() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test313#3028");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test313");
    java.lang.String str1=org.apache.commons.lang.StringUtils.capitalize("    a     ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "    a     "+ "'",str1.equals("    a     "));
  }
  @Test public void test314() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test314#3036");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test314");
    java.lang.String str1=org.apache.commons.lang.StringUtils.upperCase("      ...");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "      ..."+ "'",str1.equals("      ..."));
  }
  @Test public void test315() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test315#3044");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test315");
    float float3=org.apache.commons.lang.math.NumberUtils.min((float)'a',(float)20,(float)156);
    org.junit.Assert.assertTrue("'" + float3 + "' != '"+ 20.0f+ "'",float3 == 20.0f);
  }
  @Test public void test316() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test316#3052");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test316");
    java.lang.String str1=org.apache.commons.lang.StringUtils.uncapitalise("AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "aaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa"+ "'",str1.equals("aaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa"));
  }
  @Test public void test317() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test317#3060");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test317");
    try {
      java.lang.Double double1=org.apache.commons.lang.math.NumberUtils.createDouble("aaaaaaaaai!");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaaaaaaai!\"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test318() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test318#3071");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test318");
    try {
      java.math.BigInteger bigInteger1=org.apache.commons.lang.math.NumberUtils.createBigInteger("AAAAAAAAAAAAAAAAAAAA  aAAAAAAAA                                       HI!");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"A\"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test319() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test319#3082");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test319");
    java.lang.String str1=org.apache.commons.lang.StringUtils.chopNewline("...                          ...");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "...                          ..."+ "'",str1.equals("...                          ..."));
  }
  @Test public void test320() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test320#3090");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test320");
    java.lang.String str1=org.apache.commons.lang.StringUtils.trim("                                                HI!");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "HI!"+ "'",str1.equals("HI!"));
  }
  @Test public void test321() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test321#3098");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test321");
    java.lang.String str3=org.apache.commons.lang.StringUtils.leftPad("                                                ...                          ......                 ",(int)(byte)0,"aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "                                                ...                          ......                 "+ "'",str3.equals("                                                ...                          ......                 "));
  }
  @Test public void test322() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test322#3106");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test322");
    java.lang.String str3=org.apache.commons.lang.StringUtils.center("#######################################################################################",26,"AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAI!");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "#######################################################################################"+ "'",str3.equals("#######################################################################################"));
  }
  @Test public void test323() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test323#3114");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test323");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAlphanumeric("aaaaaa");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test324() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test324#3122");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test324");
    java.lang.String str3=org.apache.commons.lang.StringUtils.leftPad("                                                                                        ",63,' ');
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "                                                                                        "+ "'",str3.equals("                                                                                        "));
  }
  @Test public void test325() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test325#3130");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test325");
    java.lang.String str1=org.apache.commons.lang.StringUtils.swapCase(" AAAAAA...");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ " aaaaaa..."+ "'",str1.equals(" aaaaaa..."));
  }
  @Test public void test326() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test326#3138");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test326");
    int int2=org.apache.commons.lang.StringUtils.lastIndexOf("#################################### aaaaaa","4444444hi!aaaaaaaaa                                                                                        ");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test327() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test327#3146");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test327");
    java.lang.String str3=org.apache.commons.lang.StringUtils.replace("AAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAA a","##a","#aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "AAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAA a"+ "'",str3.equals("AAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAA a"));
  }
  @Test public void test328() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test328#3154");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test328");
    int int2=org.apache.commons.lang.StringUtils.lastIndexOf("","");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 0+ "'",int2 == 0);
  }
  @Test public void test329() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test329#3162");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test329");
    java.lang.String str1=org.apache.commons.lang.StringUtils.chop("#################################### aaaaaa");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "#################################### aaaaa"+ "'",str1.equals("#################################### aaaaa"));
  }
  @Test public void test330() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test330#3170");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test330");
    boolean boolean1=org.apache.commons.lang.math.NumberUtils.isNumber("   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test331() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test331#3178");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test331");
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
    byte[] byteArray23=new byte[]{(byte)100,(byte)0,(byte)100};
    byte[] byteArray26=new byte[]{(byte)-1,(byte)-1};
    boolean boolean27=org.apache.commons.lang.math.NumberUtils.equals(byteArray23,byteArray26);
    byte byte28=org.apache.commons.lang.math.NumberUtils.min(byteArray23);
    byte byte29=org.apache.commons.lang.math.NumberUtils.max(byteArray23);
    boolean boolean30=org.apache.commons.lang.math.NumberUtils.equals(byteArray7,byteArray23);
    byte byte31=org.apache.commons.lang.math.NumberUtils.max(byteArray23);
    byte byte32=org.apache.commons.lang.math.NumberUtils.max(byteArray23);
    org.junit.Assert.assertNotNull(byteArray4);
    org.junit.Assert.assertNotNull(byteArray7);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '"+ false+ "'",boolean8 == false);
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '"+ false+ "'",boolean9 == false);
    org.junit.Assert.assertNotNull(byteArray13);
    org.junit.Assert.assertNotNull(byteArray16);
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '"+ false+ "'",boolean17 == false);
    org.junit.Assert.assertTrue("'" + byte18 + "' != '"+ (byte)-1+ "'",byte18 == (byte)-1);
    org.junit.Assert.assertTrue("'" + boolean19 + "' != '"+ true+ "'",boolean19 == true);
    org.junit.Assert.assertNotNull(byteArray23);
    org.junit.Assert.assertNotNull(byteArray26);
    org.junit.Assert.assertTrue("'" + boolean27 + "' != '"+ false+ "'",boolean27 == false);
    org.junit.Assert.assertTrue("'" + byte28 + "' != '"+ (byte)0+ "'",byte28 == (byte)0);
    org.junit.Assert.assertTrue("'" + byte29 + "' != '"+ (byte)100+ "'",byte29 == (byte)100);
    org.junit.Assert.assertTrue("'" + boolean30 + "' != '"+ false+ "'",boolean30 == false);
    org.junit.Assert.assertTrue("'" + byte31 + "' != '"+ (byte)100+ "'",byte31 == (byte)100);
    org.junit.Assert.assertTrue("'" + byte32 + "' != '"+ (byte)100+ "'",byte32 == (byte)100);
  }
  @Test public void test332() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test332#3219");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test332");
    java.lang.String str3=org.apache.commons.lang.StringUtils.replaceOnce("########################AAAAAAAAAAAAAAAAAAAA########################################################i!","Hi!   #######################################################################################             ######       A","H");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "########################AAAAAAAAAAAAAAAAAAAA########################################################i!"+ "'",str3.equals("########################AAAAAAAAAAAAAAAAAAAA########################################################i!"));
  }
  @Test public void test333() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test333#3227");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test333");
    long[] longArray0=null;
    long[] longArray2=new long[]{'#'};
    long[] longArray6=new long[]{97,(-1),' '};
    boolean boolean7=org.apache.commons.lang.math.NumberUtils.equals(longArray2,longArray6);
    long long8=org.apache.commons.lang.math.NumberUtils.max(longArray2);
    boolean boolean9=org.apache.commons.lang.math.NumberUtils.equals(longArray0,longArray2);
    long[] longArray10=null;
    long[] longArray12=new long[]{'#'};
    long[] longArray16=new long[]{97,(-1),' '};
    boolean boolean17=org.apache.commons.lang.math.NumberUtils.equals(longArray12,longArray16);
    long long18=org.apache.commons.lang.math.NumberUtils.max(longArray12);
    boolean boolean19=org.apache.commons.lang.math.NumberUtils.equals(longArray10,longArray12);
    long[] longArray21=new long[]{'#'};
    long[] longArray25=new long[]{97,(-1),' '};
    boolean boolean26=org.apache.commons.lang.math.NumberUtils.equals(longArray21,longArray25);
    long long27=org.apache.commons.lang.math.NumberUtils.max(longArray21);
    long long28=org.apache.commons.lang.math.NumberUtils.min(longArray21);
    long long29=org.apache.commons.lang.math.NumberUtils.max(longArray21);
    boolean boolean30=org.apache.commons.lang.math.NumberUtils.equals(longArray12,longArray21);
    long long31=org.apache.commons.lang.math.NumberUtils.min(longArray21);
    boolean boolean32=org.apache.commons.lang.math.NumberUtils.equals(longArray0,longArray21);
    org.junit.Assert.assertNotNull(longArray2);
    org.junit.Assert.assertNotNull(longArray6);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '"+ false+ "'",boolean7 == false);
    org.junit.Assert.assertTrue("'" + long8 + "' != '"+ 35L+ "'",long8 == 35L);
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '"+ false+ "'",boolean9 == false);
    org.junit.Assert.assertNotNull(longArray12);
    org.junit.Assert.assertNotNull(longArray16);
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '"+ false+ "'",boolean17 == false);
    org.junit.Assert.assertTrue("'" + long18 + "' != '"+ 35L+ "'",long18 == 35L);
    org.junit.Assert.assertTrue("'" + boolean19 + "' != '"+ false+ "'",boolean19 == false);
    org.junit.Assert.assertNotNull(longArray21);
    org.junit.Assert.assertNotNull(longArray25);
    org.junit.Assert.assertTrue("'" + boolean26 + "' != '"+ false+ "'",boolean26 == false);
    org.junit.Assert.assertTrue("'" + long27 + "' != '"+ 35L+ "'",long27 == 35L);
    org.junit.Assert.assertTrue("'" + long28 + "' != '"+ 35L+ "'",long28 == 35L);
    org.junit.Assert.assertTrue("'" + long29 + "' != '"+ 35L+ "'",long29 == 35L);
    org.junit.Assert.assertTrue("'" + boolean30 + "' != '"+ true+ "'",boolean30 == true);
    org.junit.Assert.assertTrue("'" + long31 + "' != '"+ 35L+ "'",long31 == 35L);
    org.junit.Assert.assertTrue("'" + boolean32 + "' != '"+ false+ "'",boolean32 == false);
  }
  @Test public void test334() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test334#3273");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test334");
    int int2=org.apache.commons.lang.math.NumberUtils.compare((double)27,(double)96L);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test335() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test335#3281");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test335");
    java.lang.String str2=org.apache.commons.lang.StringUtils.center("##a",2);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "##a"+ "'",str2.equals("##a"));
  }
  @Test public void test336() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test336#3289");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test336");
    java.lang.String str3=org.apache.commons.lang.StringUtils.getNestedString("4444444Hi!aaaaaaaa.. !ih..                                                                                                                                  ","A","Aaaaaaaaaaaaaaaaaaaa##Aaaaaaaaa");
    org.junit.Assert.assertNull(str3);
  }
  @Test public void test337() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test337#3297");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test337");
    java.lang.String str3=org.apache.commons.lang.StringUtils.leftPad("                         i!                         ",94,'#');
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "##########################################                         i!                         "+ "'",str3.equals("##########################################                         i!                         "));
  }
  @Test public void test338() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test338#3305");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test338");
    java.lang.String str1=org.apache.commons.lang.StringUtils.chomp("##########################################                         i!                         ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "##########################################                         i!                         "+ "'",str1.equals("##########################################                         i!                         "));
  }
  @Test public void test339() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test339#3313");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test339");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringBeforeLast("Hi!                                                                                              ","");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "Hi!                                                                                              "+ "'",str2.equals("Hi!                                                                                              "));
  }
  @Test public void test340() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test340#3321");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test340");
    java.lang.String str1=org.apache.commons.lang.StringUtils.capitaliseAllWords("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"+ "'",str1.equals("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
  }
  @Test public void test341() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test341#3329");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test341");
    java.lang.String str3=org.apache.commons.lang.StringUtils.getNestedString("                                                HI!","                                                                                                                  HI!","");
    org.junit.Assert.assertNull(str3);
  }
  @Test public void test342() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test342#3337");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test342");
    java.lang.String[] strArray3=org.apache.commons.lang.StringUtils.splitPreserveAllTokens("#aaaaaaaaa","",(int)(byte)10);
    java.lang.String str5=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray3,'a');
    org.junit.Assert.assertNotNull(strArray3);
    org.junit.Assert.assertTrue("'" + str5 + "' != '"+ "#aaaaaaaaa"+ "'",str5.equals("#aaaaaaaaa"));
  }
  @Test public void test343() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test343#3347");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test343");
    java.lang.String str2=org.apache.commons.lang.StringUtils.defaultString("#################################### aaaaa","      ...");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "#################################### aaaaa"+ "'",str2.equals("#################################### aaaaa"));
  }
  @Test public void test344() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test344#3355");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test344");
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
      double double45=org.apache.commons.lang.math.NumberUtils.min(doubleArray16);
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
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test345#3415");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test345");
    java.lang.String str2=org.apache.commons.lang.StringUtils.right("                         I!                         ",(int)(byte)10);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "          "+ "'",str2.equals("          "));
  }
  @Test public void test346() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test346#3423");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test346");
    boolean boolean1=org.apache.commons.lang.StringUtils.isNotBlank("             A               ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test347() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test347#3431");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test347");
    java.lang.String str2=org.apache.commons.lang.StringUtils.remove("                        aaaaaaaaaaaaaaaaaaaa                                                        ",'a');
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                                                                                "+ "'",str2.equals("                                                                                "));
  }
  @Test public void test348() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test348#3439");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test348");
    java.lang.String str1=org.apache.commons.lang.StringUtils.trimToNull("aaaaaaaaaaaaaaaaaaaa##Aaaaaaaa");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "aaaaaaaaaaaaaaaaaaaa##Aaaaaaaa"+ "'",str1.equals("aaaaaaaaaaaaaaaaaaaa##Aaaaaaaa"));
  }
  @Test public void test349() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test349#3447");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test349");
    java.lang.String str3=org.apache.commons.lang.StringUtils.abbreviate("  ",36,26);
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "  "+ "'",str3.equals("  "));
  }
  @Test public void test350() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test350#3455");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test350");
    java.lang.String str2=org.apache.commons.lang.StringUtils.remove(" aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa ",'a');
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "   A "+ "'",str2.equals("   A "));
  }
  @Test public void test351() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test351#3463");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test351");
    java.lang.String str1=org.apache.commons.lang.StringUtils.capitalize("                                                                                                ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "                                                                                                "+ "'",str1.equals("                                                                                                "));
  }
  @Test public void test352() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test352#3471");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test352");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringBefore("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa","i!");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"+ "'",str2.equals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
  }
  @Test public void test353() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test353#3479");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test353");
    java.lang.String str1=org.apache.commons.lang.StringUtils.upperCase("Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAIAAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAIAAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAIAAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAIAAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAIAAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAIAAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAIAAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAIAAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAI"+ "'",str1.equals("AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAIAAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAIAAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAIAAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAIAAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAIAAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAIAAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAIAAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAIAAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAI"));
  }
  @Test public void test354() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test354#3487");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test354");
    try {
      java.lang.Long long1=org.apache.commons.lang.math.NumberUtils.createLong("                                                                                                 ##a");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                                                                                                 ##a\"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test355() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test355#3498");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test355");
    java.lang.String str1=org.apache.commons.lang.StringUtils.uncapitalize("...                    A");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "...                    A"+ "'",str1.equals("...                    A"));
  }
  @Test public void test356() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test356#3506");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test356");
    java.lang.String str2=org.apache.commons.lang.StringUtils.right("                                          aaaaaaaaa i!",96);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                                          aaaaaaaaa i!"+ "'",str2.equals("                                          aaaaaaaaa i!"));
  }
  @Test public void test357() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test357#3514");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test357");
    byte byte3=org.apache.commons.lang.math.NumberUtils.min((byte)-1,(byte)0,(byte)1);
    org.junit.Assert.assertTrue("'" + byte3 + "' != '"+ (byte)-1+ "'",byte3 == (byte)-1);
  }
  @Test public void test358() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test358#3522");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test358");
    java.lang.String str3=org.apache.commons.lang.StringUtils.substringBetween("hi!","                                                ","aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa ");
    org.junit.Assert.assertNull(str3);
  }
  @Test public void test359() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test359#3530");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test359");
    java.lang.String[] strArray5=org.apache.commons.lang.StringUtils.split("","hi!",(int)(byte)100);
    java.lang.String[] strArray6=org.apache.commons.lang.StringUtils.stripAll(strArray5);
    int int7=org.apache.commons.lang.StringUtils.lastIndexOfAny("Aaaaaaaaa",strArray5);
    int int8=org.apache.commons.lang.StringUtils.indexOfAny("                                ",strArray5);
    java.lang.String str12=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray5,"4",0,(int)(short)0);
    java.lang.String str13=org.apache.commons.lang.StringUtils.concatenate((java.lang.Object[])strArray5);
    org.junit.Assert.assertNotNull(strArray5);
    org.junit.Assert.assertNotNull(strArray6);
    org.junit.Assert.assertTrue("'" + int7 + "' != '"+ (-1)+ "'",int7 == (-1));
    org.junit.Assert.assertTrue("'" + int8 + "' != '"+ (-1)+ "'",int8 == (-1));
    org.junit.Assert.assertTrue("'" + str12 + "' != '"+ ""+ "'",str12.equals(""));
    org.junit.Assert.assertTrue("'" + str13 + "' != '"+ ""+ "'",str13.equals(""));
  }
  @Test public void test360() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test360#3548");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test360");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringBetween("AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa","a                                                HI!");
    org.junit.Assert.assertNull(str2);
  }
  @Test public void test361() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test361#3556");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test361");
    try {
      java.lang.Double double1=org.apache.commons.lang.math.NumberUtils.createDouble("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai\"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test362() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test362#3567");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test362");
    int int3=org.apache.commons.lang.StringUtils.lastIndexOf("aaaaaaaaaaaaaaaaaaaa",' ',(-1));
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test363() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test363#3575");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test363");
    boolean boolean2=org.apache.commons.lang.StringUtils.containsOnly("###                     Aaaaaaaaa                                                                                        "," aaaaaa...");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test364() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test364#3583");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test364");
    int int1=org.apache.commons.lang.math.NumberUtils.stringToInt("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!");
    org.junit.Assert.assertTrue("'" + int1 + "' != '"+ 0+ "'",int1 == 0);
  }
  @Test public void test365() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test365#3591");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test365");
    double double2=org.apache.commons.lang.math.NumberUtils.toDouble("                                ",(double)47);
    org.junit.Assert.assertTrue("'" + double2 + "' != '"+ 47.0d+ "'",double2 == 47.0d);
  }
  @Test public void test366() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test366#3599");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test366");
    boolean boolean2=org.apache.commons.lang.StringUtils.equalsIgnoreCase("                                              hi","A         A         A         A         A         A         A         A         A         A       i!    ");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test367() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test367#3607");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test367");
    java.lang.String[] strArray3=org.apache.commons.lang.StringUtils.splitPreserveAllTokens("                                              hi","                                                                                                 ##a",(int)'#');
    org.junit.Assert.assertNotNull(strArray3);
  }
  @Test public void test368() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test368#3615");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test368");
    byte byte3=org.apache.commons.lang.math.NumberUtils.min((byte)1,(byte)0,(byte)0);
    org.junit.Assert.assertTrue("'" + byte3 + "' != '"+ (byte)0+ "'",byte3 == (byte)0);
  }
  @Test public void test369() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test369#3623");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test369");
    java.lang.String str2=org.apache.commons.lang.StringUtils.right("           4            ",(int)(short)0);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test370() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test370#3631");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test370");
    float[] floatArray6=new float[]{10L,(short)10,0.0f,' ',(-1),'4'};
    float float7=org.apache.commons.lang.math.NumberUtils.min(floatArray6);
    float float8=org.apache.commons.lang.math.NumberUtils.max(floatArray6);
    org.junit.Assert.assertNotNull(floatArray6);
    org.junit.Assert.assertTrue("'" + float7 + "' != '"+ (-1.0f)+ "'",float7 == (-1.0f));
    org.junit.Assert.assertTrue("'" + float8 + "' != '"+ 52.0f+ "'",float8 == 52.0f);
  }
  @Test public void test371() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test371#3643");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test371");
    java.lang.String[] strArray1=org.apache.commons.lang.StringUtils.split("...                          ...");
    java.lang.String str2=org.apache.commons.lang.StringUtils.concatenate((java.lang.Object[])strArray1);
    org.junit.Assert.assertNotNull(strArray1);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "......"+ "'",str2.equals("......"));
  }
  @Test public void test372() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test372#3653");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test372");
    java.lang.String str1=org.apache.commons.lang.StringUtils.stripToNull("Hi!                                                                                              ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "Hi!"+ "'",str1.equals("Hi!"));
  }
  @Test public void test373() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test373#3661");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test373");
    java.lang.String str1=org.apache.commons.lang.StringUtils.capitalise("Hi!                                                                                             ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "Hi!                                                                                             "+ "'",str1.equals("Hi!                                                                                             "));
  }
  @Test public void test374() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test374#3669");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test374");
    char[] charArray5=new char[]{};
    int int6=org.apache.commons.lang.StringUtils.indexOfAnyBut("",charArray5);
    int int7=org.apache.commons.lang.StringUtils.indexOfAny("hi!                                   A",charArray5);
    int int8=org.apache.commons.lang.StringUtils.indexOfAnyBut("a                                                HI!                                                 ",charArray5);
    int int9=org.apache.commons.lang.StringUtils.indexOfAnyBut("...                    A",charArray5);
    int int10=org.apache.commons.lang.StringUtils.indexOfAny("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAI!",charArray5);
    org.junit.Assert.assertNotNull(charArray5);
    org.junit.Assert.assertTrue("'" + int6 + "' != '"+ (-1)+ "'",int6 == (-1));
    org.junit.Assert.assertTrue("'" + int7 + "' != '"+ (-1)+ "'",int7 == (-1));
    org.junit.Assert.assertTrue("'" + int8 + "' != '"+ (-1)+ "'",int8 == (-1));
    org.junit.Assert.assertTrue("'" + int9 + "' != '"+ (-1)+ "'",int9 == (-1));
    org.junit.Assert.assertTrue("'" + int10 + "' != '"+ (-1)+ "'",int10 == (-1));
  }
  @Test public void test375() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test375#3687");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test375");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringBetween("Aaaaaaaaa ","Aaaaaaaaa                          ");
    org.junit.Assert.assertNull(str2);
  }
  @Test public void test376() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test376#3695");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test376");
    try {
      java.lang.Double double1=org.apache.commons.lang.math.NumberUtils.createDouble("         ");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test377() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test377#3706");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test377");
    try {
      java.lang.String str2=org.apache.commons.lang.StringUtils.abbreviate("###                                                                                       aaaaaaaaa ",(int)(byte)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
    }
 catch (    java.lang.IllegalArgumentException e) {
    }
  }
  @Test public void test378() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test378#3717");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test378");
    java.lang.String str2=org.apache.commons.lang.StringUtils.center("!ih",96);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                                              !ih                                               "+ "'",str2.equals("                                              !ih                                               "));
  }
  @Test public void test379() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test379#3725");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test379");
    java.lang.String str1=org.apache.commons.lang.StringUtils.strip("4444444Hi!aaaaaaaaa                                                                                        ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "4444444Hi!aaaaaaaaa"+ "'",str1.equals("4444444Hi!aaaaaaaaa"));
  }
  @Test public void test380() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test380#3733");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test380");
    java.lang.String str2=org.apache.commons.lang.StringUtils.getNestedString("                                              hi","aAAAAAAAA                                       HI!");
    org.junit.Assert.assertNull(str2);
  }
  @Test public void test381() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test381#3741");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test381");
    int int3=org.apache.commons.lang.StringUtils.indexOf("                          aaaaaaaaA","Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!",97);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test382() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test382#3749");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test382");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAlphaSpace("#######################################################################################");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test383() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test383#3757");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test383");
    float float1=org.apache.commons.lang.math.NumberUtils.toFloat("                                                                                                    ");
    org.junit.Assert.assertTrue("'" + float1 + "' != '"+ 0.0f+ "'",float1 == 0.0f);
  }
  @Test public void test384() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test384#3765");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test384");
    boolean boolean2=org.apache.commons.lang.StringUtils.contains("","           4            ");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test385() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test385#3773");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test385");
    java.lang.String str2=org.apache.commons.lang.StringUtils.defaultIfEmpty("aaaaaaaaa ","   A ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "aaaaaaaaa "+ "'",str2.equals("aaaaaaaaa "));
  }
  @Test public void test386() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test386#3781");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test386");
    int int2=org.apache.commons.lang.StringUtils.indexOfAnyBut("                               ","");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test387() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test387#3789");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test387");
    int int2=org.apache.commons.lang.math.NumberUtils.compare((float)(byte)1,(float)9);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test388() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test388#3797");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test388");
    java.lang.String[] strArray4=org.apache.commons.lang.StringUtils.splitByWholeSeparator("Hi!"," ");
    java.lang.String str6=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray4,' ');
    java.lang.Class<?> wildcardClass7=strArray4.getClass();
    int int8=org.apache.commons.lang.StringUtils.lastIndexOfAny("A",strArray4);
    int int9=org.apache.commons.lang.StringUtils.indexOfAny("",strArray4);
    org.junit.Assert.assertNotNull(strArray4);
    org.junit.Assert.assertTrue("'" + str6 + "' != '"+ "Hi!"+ "'",str6.equals("Hi!"));
    org.junit.Assert.assertNotNull(wildcardClass7);
    org.junit.Assert.assertTrue("'" + int8 + "' != '"+ (-1)+ "'",int8 == (-1));
    org.junit.Assert.assertTrue("'" + int9 + "' != '"+ (-1)+ "'",int9 == (-1));
  }
  @Test public void test389() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test389#3813");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test389");
    java.lang.String str2=org.apache.commons.lang.StringUtils.getNestedString("A########                          ","Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai");
    org.junit.Assert.assertNull(str2);
  }
  @Test public void test390() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test390#3821");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test390");
    java.lang.String[] strArray3=org.apache.commons.lang.StringUtils.split("","hi!",(int)(byte)100);
    java.lang.String str4=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray3);
    java.lang.String[] strArray6=org.apache.commons.lang.StringUtils.stripAll(strArray3,"                                   ");
    java.lang.String str7=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray6);
    java.lang.String str8=org.apache.commons.lang.StringUtils.concatenate((java.lang.Object[])strArray6);
    java.lang.String str9=org.apache.commons.lang.StringUtils.concatenate((java.lang.Object[])strArray6);
    org.junit.Assert.assertNotNull(strArray3);
    org.junit.Assert.assertTrue("'" + str4 + "' != '"+ ""+ "'",str4.equals(""));
    org.junit.Assert.assertNotNull(strArray6);
    org.junit.Assert.assertTrue("'" + str7 + "' != '"+ ""+ "'",str7.equals(""));
    org.junit.Assert.assertTrue("'" + str8 + "' != '"+ ""+ "'",str8.equals(""));
    org.junit.Assert.assertTrue("'" + str9 + "' != '"+ ""+ "'",str9.equals(""));
  }
  @Test public void test391() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test391#3839");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test391");
    java.lang.String str1=org.apache.commons.lang.StringUtils.clean("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa             ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"+ "'",str1.equals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
  }
  @Test public void test392() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test392#3847");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test392");
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
    boolean boolean18=org.apache.commons.lang.math.NumberUtils.equals(doubleArray0,doubleArray8);
    double[] doubleArray23=new double[]{(-1.0f),'#',1.0f,35L};
    double[] doubleArray24=new double[]{};
    boolean boolean25=org.apache.commons.lang.math.NumberUtils.equals(doubleArray23,doubleArray24);
    double[] doubleArray30=new double[]{(-1.0f),'#',1.0f,35L};
    double[] doubleArray31=new double[]{};
    boolean boolean32=org.apache.commons.lang.math.NumberUtils.equals(doubleArray30,doubleArray31);
    double[] doubleArray33=null;
    boolean boolean34=org.apache.commons.lang.math.NumberUtils.equals(doubleArray31,doubleArray33);
    boolean boolean35=org.apache.commons.lang.math.NumberUtils.equals(doubleArray24,doubleArray33);
    double[] doubleArray40=new double[]{(-1.0f),'#',1.0f,35L};
    double[] doubleArray41=new double[]{};
    boolean boolean42=org.apache.commons.lang.math.NumberUtils.equals(doubleArray40,doubleArray41);
    boolean boolean43=org.apache.commons.lang.math.NumberUtils.equals(doubleArray24,doubleArray40);
    boolean boolean44=org.apache.commons.lang.math.NumberUtils.equals(doubleArray0,doubleArray24);
    java.lang.Class<?> wildcardClass45=doubleArray24.getClass();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '"+ false+ "'",boolean7 == false);
    org.junit.Assert.assertNotNull(doubleArray8);
    org.junit.Assert.assertNotNull(doubleArray13);
    org.junit.Assert.assertNotNull(doubleArray14);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '"+ false+ "'",boolean15 == false);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '"+ true+ "'",boolean16 == true);
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '"+ false+ "'",boolean17 == false);
    org.junit.Assert.assertTrue("'" + boolean18 + "' != '"+ false+ "'",boolean18 == false);
    org.junit.Assert.assertNotNull(doubleArray23);
    org.junit.Assert.assertNotNull(doubleArray24);
    org.junit.Assert.assertTrue("'" + boolean25 + "' != '"+ false+ "'",boolean25 == false);
    org.junit.Assert.assertNotNull(doubleArray30);
    org.junit.Assert.assertNotNull(doubleArray31);
    org.junit.Assert.assertTrue("'" + boolean32 + "' != '"+ false+ "'",boolean32 == false);
    org.junit.Assert.assertTrue("'" + boolean34 + "' != '"+ false+ "'",boolean34 == false);
    org.junit.Assert.assertTrue("'" + boolean35 + "' != '"+ false+ "'",boolean35 == false);
    org.junit.Assert.assertNotNull(doubleArray40);
    org.junit.Assert.assertNotNull(doubleArray41);
    org.junit.Assert.assertTrue("'" + boolean42 + "' != '"+ false+ "'",boolean42 == false);
    org.junit.Assert.assertTrue("'" + boolean43 + "' != '"+ false+ "'",boolean43 == false);
    org.junit.Assert.assertTrue("'" + boolean44 + "' != '"+ false+ "'",boolean44 == false);
    org.junit.Assert.assertNotNull(wildcardClass45);
  }
  @Test public void test393() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test393#3903");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test393");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.splitPreserveAllTokens("                   "," aaaaaaaaaaaaaaaaaaaa  aaaaaaaaa ");
    org.junit.Assert.assertNotNull(strArray2);
  }
  @Test public void test394() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test394#3911");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test394");
    boolean boolean1=org.apache.commons.lang.StringUtils.isNumeric("                                            aaaaaaaaa i!                                            ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test395() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test395#3919");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test395");
    char[] charArray6=new char[]{'4','4','#'};
    boolean boolean7=org.apache.commons.lang.StringUtils.containsNone("aaaaaaaaa",charArray6);
    int int8=org.apache.commons.lang.StringUtils.indexOfAny("Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!",charArray6);
    boolean boolean9=org.apache.commons.lang.StringUtils.containsNone("4444444Hi!aaaaaaaaa                                                                                        ",charArray6);
    java.lang.Class<?> wildcardClass10=charArray6.getClass();
    org.junit.Assert.assertNotNull(charArray6);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '"+ true+ "'",boolean7 == true);
    org.junit.Assert.assertTrue("'" + int8 + "' != '"+ (-1)+ "'",int8 == (-1));
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '"+ false+ "'",boolean9 == false);
    org.junit.Assert.assertNotNull(wildcardClass10);
  }
  @Test public void test396() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test396#3935");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test396");
    java.lang.String str2=org.apache.commons.lang.StringUtils.defaultIfEmpty("                                                                                        ","                                                                                     ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                                                                                        "+ "'",str2.equals("                                                                                        "));
  }
  @Test public void test397() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test397#3943");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test397");
    int int1=org.apache.commons.lang.math.NumberUtils.toInt("Hi!");
    org.junit.Assert.assertTrue("'" + int1 + "' != '"+ 0+ "'",int1 == 0);
  }
  @Test public void test398() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test398#3951");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test398");
    long long3=org.apache.commons.lang.math.NumberUtils.max((long)2,(long)(byte)100,(long)9);
    org.junit.Assert.assertTrue("'" + long3 + "' != '"+ 100L+ "'",long3 == 100L);
  }
  @Test public void test399() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test399#3959");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test399");
    java.lang.String str1=org.apache.commons.lang.StringUtils.chomp("                                              hi!");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "                                              hi!"+ "'",str1.equals("                                              hi!"));
  }
  @Test public void test400() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test400#3967");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test400");
    java.lang.String str2=org.apache.commons.lang.StringUtils.getChomp("","                                            !i aaaaaaaaa                                            ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test401() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test401#3975");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test401");
    java.lang.String[] strArray3=org.apache.commons.lang.StringUtils.split("#############################################################################","                                                                                                 ##A",(int)(short)10);
    org.junit.Assert.assertNotNull(strArray3);
  }
  @Test public void test402() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test402#3983");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test402");
    try {
      java.math.BigInteger bigInteger1=org.apache.commons.lang.math.NumberUtils.createBigInteger("                             Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"   \"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test403() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test403#3994");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test403");
    short[] shortArray3=new short[]{(byte)10,(byte)10,(short)1};
    short short4=org.apache.commons.lang.math.NumberUtils.min(shortArray3);
    org.junit.Assert.assertNotNull(shortArray3);
    org.junit.Assert.assertTrue("'" + short4 + "' != '"+ (short)1+ "'",short4 == (short)1);
  }
  @Test public void test404() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test404#4004");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test404");
    java.lang.String str3=org.apache.commons.lang.StringUtils.substring("            hi!            ",0,87);
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "            hi!            "+ "'",str3.equals("            hi!            "));
  }
  @Test public void test405() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test405#4012");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test405");
    int int2=org.apache.commons.lang.math.NumberUtils.stringToInt(" aaaaaa...",24);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 24+ "'",int2 == 24);
  }
  @Test public void test406() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test406#4020");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test406");
    boolean boolean1=org.apache.commons.lang.StringUtils.isNotBlank("......");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test407() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test407#4028");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test407");
    int int1=org.apache.commons.lang.math.NumberUtils.stringToInt("AAAAAAAAA ");
    org.junit.Assert.assertTrue("'" + int1 + "' != '"+ 0+ "'",int1 == 0);
  }
  @Test public void test408() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test408#4036");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test408");
    double double2=org.apache.commons.lang.math.NumberUtils.toDouble("             A               ",(double)31L);
    org.junit.Assert.assertTrue("'" + double2 + "' != '"+ 31.0d+ "'",double2 == 31.0d);
  }
  @Test public void test409() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test409#4044");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test409");
    boolean boolean2=org.apache.commons.lang.StringUtils.contains("","##A");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test410() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test410#4052");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test410");
    java.lang.String str4=org.apache.commons.lang.StringUtils.overlayString("   #######################################################################################aaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa","aaaaaaaaaaaaaaaaaaaa##Aaaaaaaa",(int)' ',29);
    org.junit.Assert.assertTrue("'" + str4 + "' != '"+ "   #############################aaaaaaaaaaaaaaaaaaaa##Aaaaaaaa#############################################################aaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa"+ "'",str4.equals("   #############################aaaaaaaaaaaaaaaaaaaa##Aaaaaaaa#############################################################aaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa"));
  }
  @Test public void test411() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test411#4060");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test411");
    int int3=org.apache.commons.lang.math.NumberUtils.max(0,87,87);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ 87+ "'",int3 == 87);
  }
  @Test public void test412() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test412#4068");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test412");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substring("            hi!            ",1);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "           hi!            "+ "'",str2.equals("           hi!            "));
  }
  @Test public void test413() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test413#4076");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test413");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.splitPreserveAllTokens("AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaai!",'a');
    org.junit.Assert.assertNotNull(strArray2);
  }
  @Test public void test414() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test414#4084");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test414");
    java.lang.String str2=org.apache.commons.lang.StringUtils.defaultIfEmpty("Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!","                                              hi!");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!"+ "'",str2.equals("Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!"));
  }
  @Test public void test415() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test415#4092");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test415");
    java.lang.String str1=org.apache.commons.lang.StringUtils.deleteWhitespace("##Aaaaaaaaaaaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "##Aaaaaaaaaaaaaaaaaa"+ "'",str1.equals("##Aaaaaaaaaaaaaaaaaa"));
  }
  @Test public void test416() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test416#4100");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test416");
    float float3=org.apache.commons.lang.math.NumberUtils.min(108.0f,(float)'4',(float)(short)10);
    org.junit.Assert.assertTrue("'" + float3 + "' != '"+ 10.0f+ "'",float3 == 10.0f);
  }
  @Test public void test417() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test417#4108");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test417");
    try {
      java.lang.Float float1=org.apache.commons.lang.math.NumberUtils.createFloat("                         I!                         ");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"I!\"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test418() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test418#4119");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test418");
    int int2=org.apache.commons.lang.StringUtils.countMatches("          ","                                              hi");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 0+ "'",int2 == 0);
  }
  @Test public void test419() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test419#4127");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test419");
    int int2=org.apache.commons.lang.StringUtils.countMatches("AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaa","aaaaaaaaaaaaaaaaaaaa##Aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 0+ "'",int2 == 0);
  }
  @Test public void test420() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test420#4135");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test420");
    java.lang.String str2=org.apache.commons.lang.StringUtils.strip("    a     ","aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "    a     "+ "'",str2.equals("    a     "));
  }
  @Test public void test421() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test421#4143");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test421");
    java.lang.String str2=org.apache.commons.lang.StringUtils.left("                                                                                   aaaaaaaaa ",(int)(short)10);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "          "+ "'",str2.equals("          "));
  }
  @Test public void test422() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test422#4151");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test422");
    java.lang.String str1=org.apache.commons.lang.StringUtils.capitalise("   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"+ "'",str1.equals("   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
  }
  @Test public void test423() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test423#4159");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test423");
    short[] shortArray3=new short[]{(short)-1,(short)1,(short)0};
    short short4=org.apache.commons.lang.math.NumberUtils.max(shortArray3);
    short short5=org.apache.commons.lang.math.NumberUtils.min(shortArray3);
    org.junit.Assert.assertNotNull(shortArray3);
    org.junit.Assert.assertTrue("'" + short4 + "' != '"+ (short)1+ "'",short4 == (short)1);
    org.junit.Assert.assertTrue("'" + short5 + "' != '"+ (short)-1+ "'",short5 == (short)-1);
  }
  @Test public void test424() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test424#4171");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test424");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substring("##A##A#!ih",26);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test425() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test425#4179");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test425");
    java.lang.String[] strArray1=org.apache.commons.lang.StringUtils.split("AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa");
    java.lang.String str2=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray1);
    java.lang.String str4=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray1,"iaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaA");
    org.junit.Assert.assertNotNull(strArray1);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa"+ "'",str2.equals("AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa"));
    org.junit.Assert.assertTrue("'" + str4 + "' != '"+ "AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa"+ "'",str4.equals("AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa"));
  }
  @Test public void test426() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test426#4191");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test426");
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
    double[] doubleArray26=null;
    boolean boolean27=org.apache.commons.lang.math.NumberUtils.equals(doubleArray24,doubleArray26);
    double[] doubleArray32=new double[]{(-1.0f),'#',1.0f,35L};
    double[] doubleArray33=new double[]{};
    boolean boolean34=org.apache.commons.lang.math.NumberUtils.equals(doubleArray32,doubleArray33);
    double[] doubleArray35=new double[]{};
    double[] doubleArray40=new double[]{(-1.0f),'#',1.0f,35L};
    double[] doubleArray41=new double[]{};
    boolean boolean42=org.apache.commons.lang.math.NumberUtils.equals(doubleArray40,doubleArray41);
    boolean boolean43=org.apache.commons.lang.math.NumberUtils.equals(doubleArray35,doubleArray41);
    boolean boolean44=org.apache.commons.lang.math.NumberUtils.equals(doubleArray32,doubleArray35);
    boolean boolean45=org.apache.commons.lang.math.NumberUtils.equals(doubleArray24,doubleArray35);
    boolean boolean46=org.apache.commons.lang.math.NumberUtils.equals(doubleArray5,doubleArray24);
    boolean boolean47=org.apache.commons.lang.math.NumberUtils.equals(doubleArray0,doubleArray24);
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
    org.junit.Assert.assertTrue("'" + boolean27 + "' != '"+ false+ "'",boolean27 == false);
    org.junit.Assert.assertNotNull(doubleArray32);
    org.junit.Assert.assertNotNull(doubleArray33);
    org.junit.Assert.assertTrue("'" + boolean34 + "' != '"+ false+ "'",boolean34 == false);
    org.junit.Assert.assertNotNull(doubleArray35);
    org.junit.Assert.assertNotNull(doubleArray40);
    org.junit.Assert.assertNotNull(doubleArray41);
    org.junit.Assert.assertTrue("'" + boolean42 + "' != '"+ false+ "'",boolean42 == false);
    org.junit.Assert.assertTrue("'" + boolean43 + "' != '"+ true+ "'",boolean43 == true);
    org.junit.Assert.assertTrue("'" + boolean44 + "' != '"+ false+ "'",boolean44 == false);
    org.junit.Assert.assertTrue("'" + boolean45 + "' != '"+ true+ "'",boolean45 == true);
    org.junit.Assert.assertTrue("'" + boolean46 + "' != '"+ false+ "'",boolean46 == false);
    org.junit.Assert.assertTrue("'" + boolean47 + "' != '"+ false+ "'",boolean47 == false);
  }
  @Test public void test427() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test427#4251");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test427");
    java.lang.String str1=org.apache.commons.lang.StringUtils.deleteSpaces("aaaaaaaaa i!");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "aaaaaaaaai!"+ "'",str1.equals("aaaaaaaaai!"));
  }
  @Test public void test428() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test428#4259");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test428");
    java.lang.String str4=org.apache.commons.lang.StringUtils.overlay("AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaa","4444444444444444444444444444444444                                4444444444444444444444444444444444",34,97);
    org.junit.Assert.assertTrue("'" + str4 + "' != '"+ "AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444"+ "'",str4.equals("AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444"));
  }
  @Test public void test429() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test429#4267");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test429");
    java.lang.String str1=org.apache.commons.lang.StringUtils.swapCase("Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "aAAAAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAI!"+ "'",str1.equals("aAAAAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAI!"));
  }
  @Test public void test430() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test430#4275");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test430");
    java.lang.String str3=org.apache.commons.lang.StringUtils.replace("###                     aaaaaaaaa                                                                                        ","                                                                                     ","i!");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "###                     aaaaaaaaai!   "+ "'",str3.equals("###                     aaaaaaaaai!   "));
  }
  @Test public void test431() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test431#4283");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test431");
    java.lang.Object[] objArray0=null;
    java.lang.String str1=org.apache.commons.lang.StringUtils.join(objArray0);
    org.junit.Assert.assertNull(str1);
  }
  @Test public void test432() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test432#4292");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test432");
    java.lang.String str3=org.apache.commons.lang.StringUtils.getNestedString("","                                            aaaaaaaaa i!                                            ","                          #A");
    org.junit.Assert.assertNull(str3);
  }
  @Test public void test433() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test433#4300");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test433");
    java.lang.String str2=org.apache.commons.lang.StringUtils.removeStart("","AaaaaaaaaAaaaaaaaaAaaaaaaaaAa");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test434() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test434#4308");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test434");
    boolean boolean1=org.apache.commons.lang.StringUtils.isNumeric("AAAAAAAAAAAAAAAAAAAA  aAAAAAAAA                                       HI!");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test435() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test435#4316");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test435");
    java.lang.String str2=org.apache.commons.lang.StringUtils.getPrechomp("AaaaaaaaaaaaaaaaaaaaAaaaaaaaa","Hi!                                                                                              ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test436() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test436#4324");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test436");
    java.lang.String str2=org.apache.commons.lang.StringUtils.rightPad("4444444Hi!aaaaaaaaa                                                                                        ",0);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "4444444Hi!aaaaaaaaa                                                                                        "+ "'",str2.equals("4444444Hi!aaaaaaaaa                                                                                        "));
  }
  @Test public void test437() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test437#4332");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test437");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringAfterLast("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa","Hi!   #######################################################################################       A");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test438() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test438#4340");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test438");
    int int3=org.apache.commons.lang.StringUtils.ordinalIndexOf("aaaaaaaaai!","aaaaaaaaa                                                                                        ",(int)(short)-1);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test439() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test439#4348");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test439");
    double double3=org.apache.commons.lang.math.NumberUtils.min((double)97L,(double)88L,0.0d);
    org.junit.Assert.assertTrue("'" + double3 + "' != '"+ 0.0d+ "'",double3 == 0.0d);
  }
  @Test public void test440() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test440#4356");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test440");
    java.lang.String str1=org.apache.commons.lang.StringUtils.strip("HI!");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "HI!"+ "'",str1.equals("HI!"));
  }
  @Test public void test441() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test441#4364");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test441");
    java.lang.String str1=org.apache.commons.lang.StringUtils.stripToNull("aaaaaaaaaaaaaaaaaaaaAaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "aaaaaaaaaaaaaaaaaaaaAaaaaaaaa"+ "'",str1.equals("aaaaaaaaaaaaaaaaaaaaAaaaaaaaa"));
  }
  @Test public void test442() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test442#4372");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test442");
    boolean boolean1=org.apache.commons.lang.StringUtils.isNumericSpace("Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!    ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test443() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test443#4380");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test443");
    java.lang.String str3=org.apache.commons.lang.StringUtils.center("                       AAAAAAAAA",65,"");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "                                       AAAAAAAAA                 "+ "'",str3.equals("                                       AAAAAAAAA                 "));
  }
  @Test public void test444() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test444#4388");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test444");
    java.lang.String str2=org.apache.commons.lang.StringUtils.left("aAAAAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAI!",(int)(byte)0);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test445() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test445#4396");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test445");
    int int3=org.apache.commons.lang.StringUtils.lastIndexOf(""," aaaaaa...",96);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test446() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test446#4404");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test446");
    int int2=org.apache.commons.lang.StringUtils.indexOfAny("   #######################################################################################","    !I       A         A         A         A         A         A         A         A         A         A");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 0+ "'",int2 == 0);
  }
  @Test public void test447() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test447#4412");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test447");
    int int3=org.apache.commons.lang.StringUtils.lastIndexOf("Aaaaaaaaa4","aaaaaaaaa i!            ",(int)(short)-1);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test448() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test448#4420");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test448");
    java.lang.String str2=org.apache.commons.lang.StringUtils.leftPad("",0);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test449() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test449#4428");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test449");
    java.lang.String str2=org.apache.commons.lang.StringUtils.center("4",97);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                                                4                                                "+ "'",str2.equals("                                                4                                                "));
  }
  @Test public void test450() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test450#4436");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test450");
    java.lang.String str1=org.apache.commons.lang.StringUtils.capitalise("AAAAAAAAAAAAAAAAAAAA  aAAAAAAAA                                       HI!");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "AAAAAAAAAAAAAAAAAAAA  aAAAAAAAA                                       HI!"+ "'",str1.equals("AAAAAAAAAAAAAAAAAAAA  aAAAAAAAA                                       HI!"));
  }
  @Test public void test451() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test451#4444");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test451");
    java.lang.String str2=org.apache.commons.lang.StringUtils.rightPad("                             Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaa",4);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                             Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaa"+ "'",str2.equals("                             Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaa"));
  }
  @Test public void test452() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test452#4452");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test452");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringBeforeLast("##Aaaaaaaaaaaaaaaaaa","");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "##Aaaaaaaaaaaaaaaaaa"+ "'",str2.equals("##Aaaaaaaaaaaaaaaaaa"));
  }
  @Test public void test453() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test453#4460");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test453");
    java.lang.String str2=org.apache.commons.lang.StringUtils.reverseDelimitedString("                       AAAAAAAAA","                         I!                         ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "AAAAAAAAA"+ "'",str2.equals("AAAAAAAAA"));
  }
  @Test public void test454() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test454#4468");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test454");
    java.lang.String str2=org.apache.commons.lang.StringUtils.remove("","                       AAAAAAAAA");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test455() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test455#4476");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test455");
    java.lang.String[] strArray4=org.apache.commons.lang.StringUtils.splitPreserveAllTokens("                                                                                                         HI!","Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!",(int)(short)10);
    int int5=org.apache.commons.lang.StringUtils.lastIndexOfAny("AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444",strArray4);
    org.junit.Assert.assertNotNull(strArray4);
    org.junit.Assert.assertTrue("'" + int5 + "' != '"+ 134+ "'",int5 == 134);
  }
  @Test public void test456() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test456#4486");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test456");
    java.lang.String str1=org.apache.commons.lang.StringUtils.stripToEmpty("   #############################aaaaaaaaaaaaaaaaaaaa##Aaaaaaaa#############################################################aaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "#############################aaaaaaaaaaaaaaaaaaaa##Aaaaaaaa#############################################################aaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa"+ "'",str1.equals("#############################aaaaaaaaaaaaaaaaaaaa##Aaaaaaaa#############################################################aaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa"));
  }
  @Test public void test457() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test457#4494");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test457");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.splitPreserveAllTokens("iaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaA","aaaaaaaaa                                    ");
    org.junit.Assert.assertNotNull(strArray2);
  }
  @Test public void test458() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test458#4502");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test458");
    java.lang.String str1=org.apache.commons.lang.StringUtils.lowerCase("aAAAAAAAA                                       HI!");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "aaaaaaaaa                                       hi!"+ "'",str1.equals("aaaaaaaaa                                       hi!"));
  }
  @Test public void test459() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test459#4510");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test459");
    java.lang.String str2=org.apache.commons.lang.StringUtils.getPrechomp("H","");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test460() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test460#4518");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test460");
    java.lang.String str3=org.apache.commons.lang.StringUtils.replaceChars("    a     ","hi!                                   A","Aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "aaaaaaaaaa"+ "'",str3.equals("aaaaaaaaaa"));
  }
  @Test public void test461() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test461#4526");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test461");
    int int2=org.apache.commons.lang.math.NumberUtils.compare((double)27,(double)(-1L));
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 1+ "'",int2 == 1);
  }
  @Test public void test462() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test462#4534");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test462");
    double double3=org.apache.commons.lang.math.NumberUtils.max((double)20,(double)9L,0.0d);
    org.junit.Assert.assertTrue("'" + double3 + "' != '"+ 20.0d+ "'",double3 == 20.0d);
  }
  @Test public void test463() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test463#4542");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test463");
    long long1=org.apache.commons.lang.math.NumberUtils.toLong("");
    org.junit.Assert.assertTrue("'" + long1 + "' != '"+ 0L+ "'",long1 == 0L);
  }
  @Test public void test464() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test464#4550");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test464");
    java.lang.String str2=org.apache.commons.lang.StringUtils.strip("IaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA","                                            aaaaaaaaa i!                                            ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "IaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA"+ "'",str2.equals("IaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA"));
  }
  @Test public void test465() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test465#4558");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test465");
    java.lang.String str2=org.apache.commons.lang.StringUtils.remove("aaaaaaaaa                                        ",'a');
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                                        "+ "'",str2.equals("                                        "));
  }
  @Test public void test466() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test466#4566");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test466");
    int int2=org.apache.commons.lang.math.NumberUtils.toInt("                                          a!i ",97);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 97+ "'",int2 == 97);
  }
  @Test public void test467() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test467#4574");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test467");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.splitPreserveAllTokens("",'#');
    org.junit.Assert.assertNotNull(strArray2);
  }
  @Test public void test468() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test468#4582");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test468");
    boolean boolean2=org.apache.commons.lang.StringUtils.containsIgnoreCase("!iaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA","");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ true+ "'",boolean2 == true);
  }
  @Test public void test469() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test469#4590");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test469");
    java.lang.String str1=org.apache.commons.lang.StringUtils.strip("                 ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ ""+ "'",str1.equals(""));
  }
  @Test public void test470() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test470#4598");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test470");
    java.lang.String str1=org.apache.commons.lang.StringUtils.upperCase("!iaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "!IAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA"+ "'",str1.equals("!IAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA AAAAAAAAA"));
  }
  @Test public void test471() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test471#4606");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test471");
    java.lang.String str1=org.apache.commons.lang.StringUtils.capitalize("a                                                HI!");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "A                                                HI!"+ "'",str1.equals("A                                                HI!"));
  }
  @Test public void test472() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test472#4614");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test472");
    int int3=org.apache.commons.lang.math.NumberUtils.max((int)(short)1,156,65);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ 156+ "'",int3 == 156);
  }
  @Test public void test473() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test473#4622");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test473");
    java.util.Collection collection0=null;
    java.lang.String str2=org.apache.commons.lang.StringUtils.join(collection0,"... !ih...                                ");
    org.junit.Assert.assertNull(str2);
  }
  @Test public void test474() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test474#4631");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test474");
    java.lang.String str3=org.apache.commons.lang.StringUtils.center("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",24,'a');
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"+ "'",str3.equals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
  }
  @Test public void test475() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test475#4639");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test475");
    boolean boolean1=org.apache.commons.lang.StringUtils.isNumeric("                                                              ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test476() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test476#4647");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test476");
    java.lang.String str3=org.apache.commons.lang.StringUtils.rightPad("44444444444444444444444         ",(int)(short)100,"AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "44444444444444444444444         AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaa"+ "'",str3.equals("44444444444444444444444         AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaa"));
  }
  @Test public void test477() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test477#4655");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test477");
    java.lang.String str1=org.apache.commons.lang.StringUtils.capitalise("  ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "  "+ "'",str1.equals("  "));
  }
  @Test public void test478() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test478#4663");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test478");
    float float3=org.apache.commons.lang.math.NumberUtils.min((float)88L,52.0f,(float)96);
    org.junit.Assert.assertTrue("'" + float3 + "' != '"+ 52.0f+ "'",float3 == 52.0f);
  }
  @Test public void test479() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test479#4671");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test479");
    java.lang.String str3=org.apache.commons.lang.StringUtils.rightPad("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!",(int)(short)10,"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!"+ "'",str3.equals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!"));
  }
  @Test public void test480() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test480#4679");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test480");
    java.lang.String str3=org.apache.commons.lang.StringUtils.center("!i aaaaaaaaa",97,'#');
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "##########################################!i aaaaaaaaa###########################################"+ "'",str3.equals("##########################################!i aaaaaaaaa###########################################"));
  }
  @Test public void test481() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test481#4687");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test481");
    int int2=org.apache.commons.lang.StringUtils.indexOfAnyBut("#############################aaaaaaaaaaaaaaaaaaaa##Aaaaaaaa#############################################################aaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa","##########################################                         i!                         ");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 29+ "'",int2 == 29);
  }
  @Test public void test482() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test482#4695");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test482");
    float float2=org.apache.commons.lang.math.NumberUtils.toFloat("                        AAAAAAAAAAAAAAAAAAAA                                                        i!",(float)88);
    org.junit.Assert.assertTrue("'" + float2 + "' != '"+ 88.0f+ "'",float2 == 88.0f);
  }
  @Test public void test483() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test483#4703");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test483");
    java.lang.String str1=org.apache.commons.lang.StringUtils.trim("                                                                                        ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ ""+ "'",str1.equals(""));
  }
  @Test public void test484() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test484#4711");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test484");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAlphanumericSpace("aaaaaaaaaaaaaaaaaaaaAaaaaaaaa");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test485() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test485#4719");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test485");
    java.lang.String str1=org.apache.commons.lang.StringUtils.clean("##########################################                         i!                         ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "##########################################                         i!"+ "'",str1.equals("##########################################                         i!"));
  }
  @Test public void test486() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test486#4727");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test486");
    try {
      java.lang.Integer int1=org.apache.commons.lang.math.NumberUtils.createInteger("AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444\"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test487() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test487#4738");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test487");
    java.lang.String str3=org.apache.commons.lang.StringUtils.abbreviate("AAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAA a",65,99);
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "AAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAA a"+ "'",str3.equals("AAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAA a"));
  }
  @Test public void test488() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test488#4746");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test488");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.split("4444444444444444444444444444444444                                4444444444444444444444444444444444",'a');
    org.junit.Assert.assertNotNull(strArray2);
  }
  @Test public void test489() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test489#4754");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test489");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.split("4444444Hi!",'#');
    java.lang.Class<?> wildcardClass3=strArray2.getClass();
    org.junit.Assert.assertNotNull(strArray2);
    org.junit.Assert.assertNotNull(wildcardClass3);
  }
  @Test public void test490() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test490#4764");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test490");
    java.lang.String str2=org.apache.commons.lang.StringUtils.center("4444444Hi!",(int)'4');
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                     4444444Hi!                     "+ "'",str2.equals("                     4444444Hi!                     "));
  }
  @Test public void test491() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test491#4772");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test491");
    boolean boolean1=org.apache.commons.lang.math.NumberUtils.isDigits("aa  Aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test492() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test492#4780");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test492");
    java.lang.String str3=org.apache.commons.lang.StringUtils.leftPad("##A##A#!ih",31,"... !ih...");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "... !ih...... !ih....##A##A#!ih"+ "'",str3.equals("... !ih...... !ih....##A##A#!ih"));
  }
  @Test public void test493() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test493#4788");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test493");
    char[] charArray1=null;
    boolean boolean2=org.apache.commons.lang.StringUtils.containsOnly("",charArray1);
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test494() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test494#4797");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test494");
    int int2=org.apache.commons.lang.StringUtils.getLevenshteinDistance("                                    AAAAAAAAAAAAAAAAAAAA  aAAAAAAAA                                       HI!                                                 ","Aa ");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 155+ "'",int2 == 155);
  }
  @Test public void test495() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test495#4805");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test495");
    int int2=org.apache.commons.lang.StringUtils.countMatches(" aaaaaa...","              ");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 0+ "'",int2 == 0);
  }
  @Test public void test496() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test496#4813");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test496");
    java.lang.String[] strArray3=org.apache.commons.lang.StringUtils.splitByWholeSeparator("                             Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!","                             Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!",(int)(byte)1);
    java.lang.String str5=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray3,'#');
    org.junit.Assert.assertNotNull(strArray3);
    org.junit.Assert.assertTrue("'" + str5 + "' != '"+ ""+ "'",str5.equals(""));
  }
  @Test public void test497() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test497#4823");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test497");
    short short3=org.apache.commons.lang.math.NumberUtils.max((short)0,(short)(byte)1,(short)-1);
    org.junit.Assert.assertTrue("'" + short3 + "' != '"+ (short)1+ "'",short3 == (short)1);
  }
  @Test public void test498() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test498#4831");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test498");
    boolean boolean1=org.apache.commons.lang.StringUtils.isNotBlank("a                                                HI!");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test499() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test499#4839");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test499");
    int int2=org.apache.commons.lang.StringUtils.indexOfAnyBut("                                                                                   AAAAAAAAA ","AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaai!");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 0+ "'",int2 == 0);
  }
  @Test public void test500() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest5::test500#4847");
    if (debug)     System.out.format("%n%s%n","RegressionTest5.test500");
    int int2=org.apache.commons.lang.math.NumberUtils.compare((float)27,(float)88);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
}
