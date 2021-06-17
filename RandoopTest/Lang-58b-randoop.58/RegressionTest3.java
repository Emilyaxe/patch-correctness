import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
@FixMethodOrder(MethodSorters.NAME_ASCENDING) public class RegressionTest3 {
  public static boolean debug=false;
  @Test public void test001() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test001#10");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test001");
    java.lang.String[] strArray1=org.apache.commons.lang.StringUtils.split("444444444444444444444444444444444444444444444          444444444444444444444444444444444444444444444");
    org.junit.Assert.assertNotNull(strArray1);
  }
  @Test public void test002() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test002#18");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test002");
    java.lang.String str2=org.apache.commons.lang.StringUtils.removeEnd("","HHHHHHHHHH");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test003() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test003#26");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test003");
    boolean boolean2=org.apache.commons.lang.StringUtils.contains("","IaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test004() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test004#34");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test004");
    java.lang.String str2=org.apache.commons.lang.StringUtils.reverseDelimited("                                                                                       aaaaaaaaa ",'a');
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ " a                                                                                       "+ "'",str2.equals(" a                                                                                       "));
  }
  @Test public void test005() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test005#42");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test005");
    java.lang.String str2=org.apache.commons.lang.StringUtils.repeat("Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai",9);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai"+ "'",str2.equals("Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai"));
  }
  @Test public void test006() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test006#50");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test006");
    java.lang.String[] strArray1=org.apache.commons.lang.StringUtils.splitPreserveAllTokens("... !ih..                                           ");
    org.junit.Assert.assertNotNull(strArray1);
  }
  @Test public void test007() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test007#58");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test007");
    java.lang.String str2=org.apache.commons.lang.StringUtils.removeStart("#######################################################################################","");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "#######################################################################################"+ "'",str2.equals("#######################################################################################"));
  }
  @Test public void test008() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test008#66");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test008");
    java.lang.String str2=org.apache.commons.lang.StringUtils.reverseDelimitedString("Hi!","i!");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "H"+ "'",str2.equals("H"));
  }
  @Test public void test009() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test009#74");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test009");
    java.lang.String str2=org.apache.commons.lang.StringUtils.remove("#############################################################################          ","                                                                                       aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "#############################################################################          "+ "'",str2.equals("#############################################################################          "));
  }
  @Test public void test010() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test010#82");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test010");
    float float3=org.apache.commons.lang.math.NumberUtils.max((float)96,(float)100,(float)(byte)100);
    org.junit.Assert.assertTrue("'" + float3 + "' != '"+ 100.0f+ "'",float3 == 100.0f);
  }
  @Test public void test011() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test011#90");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test011");
    boolean boolean2=org.apache.commons.lang.StringUtils.equalsIgnoreCase("aaaaaaaaa                                                                                        ","IaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test012() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test012#98");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test012");
    int int2=org.apache.commons.lang.math.NumberUtils.compare((float)94L,(float)47);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 1+ "'",int2 == 1);
  }
  @Test public void test013() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test013#106");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test013");
    int int3=org.apache.commons.lang.StringUtils.ordinalIndexOf("                                          aaaaaaaaa ","H",104);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test014() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test014#114");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test014");
    int int3=org.apache.commons.lang.StringUtils.lastIndexOf("                        AAAAAAAAAAAAAAAAAAAA                                                        ","##Aaaaaaaaa",4);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test015() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test015#122");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test015");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringAfter("#############################################################################","Hi!   #######################################################################################       A");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test016() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test016#130");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test016");
    java.lang.String str1=org.apache.commons.lang.StringUtils.uncapitalize("                                                                                              !iH");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "                                                                                              !iH"+ "'",str1.equals("                                                                                              !iH"));
  }
  @Test public void test017() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test017#138");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test017");
    java.lang.String str1=org.apache.commons.lang.StringUtils.uncapitalise("444444444444444444444444444444444444444444444          444444444444444444444444444444444444444444444");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "444444444444444444444444444444444444444444444          444444444444444444444444444444444444444444444"+ "'",str1.equals("444444444444444444444444444444444444444444444          444444444444444444444444444444444444444444444"));
  }
  @Test public void test018() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test018#146");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test018");
    java.lang.String str3=org.apache.commons.lang.StringUtils.replaceOnce("                                    aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa                                       hi!                                                 ","aaaaaaaaa                                        ","#######################################################################################          ");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "                                    aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa                                       hi!                                                 "+ "'",str3.equals("                                    aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa                                       hi!                                                 "));
  }
  @Test public void test019() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test019#154");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test019");
    java.lang.String str4=org.apache.commons.lang.StringUtils.overlayString("AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa","   #######################################################################################",0,3);
    org.junit.Assert.assertTrue("'" + str4 + "' != '"+ "   #######################################################################################aaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa"+ "'",str4.equals("   #######################################################################################aaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa"));
  }
  @Test public void test020() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test020#162");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test020");
    java.lang.String str2=org.apache.commons.lang.StringUtils.reverseDelimitedString("                                   ","hi!A");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                                   "+ "'",str2.equals("                                   "));
  }
  @Test public void test021() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test021#170");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test021");
    java.lang.String str2=org.apache.commons.lang.StringUtils.stripEnd("AAAAAAAAA"," aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "AAAAAAAAA"+ "'",str2.equals("AAAAAAAAA"));
  }
  @Test public void test022() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test022#178");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test022");
    java.lang.String str2=org.apache.commons.lang.StringUtils.getNestedString("#######################################################################################          ","");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test023() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test023#186");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test023");
    java.lang.String str4=org.apache.commons.lang.StringUtils.overlayString("###                                                                                       aaaaaaaaa ","aaaaaaaaa                                                                                        ",24,100);
    org.junit.Assert.assertTrue("'" + str4 + "' != '"+ "###                     aaaaaaaaa                                                                                        "+ "'",str4.equals("###                     aaaaaaaaa                                                                                        "));
  }
  @Test public void test024() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test024#194");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test024");
    java.lang.String str1=org.apache.commons.lang.StringUtils.strip("###                     aaaaaaaaa                                                                                        ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "###                     aaaaaaaaa"+ "'",str1.equals("###                     aaaaaaaaa"));
  }
  @Test public void test025() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test025#202");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test025");
    java.lang.String str3=org.apache.commons.lang.StringUtils.leftPad("",(int)(byte)10,'a');
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "aaaaaaaaaa"+ "'",str3.equals("aaaaaaaaaa"));
  }
  @Test public void test026() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test026#210");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test026");
    java.lang.String str2=org.apache.commons.lang.StringUtils.strip("   aaaaaaaaa                                        ","aaaaaaaaaaaaaaaaaaaa##Aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "   aaaaaaaaa                                        "+ "'",str2.equals("   aaaaaaaaa                                        "));
  }
  @Test public void test027() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test027#218");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test027");
    java.lang.String str3=org.apache.commons.lang.StringUtils.leftPad("!iaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA",52,'#');
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "!iaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA"+ "'",str3.equals("!iaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA"));
  }
  @Test public void test028() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test028#226");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test028");
    int int2=org.apache.commons.lang.StringUtils.indexOfAnyBut("!ih","aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 0+ "'",int2 == 0);
  }
  @Test public void test029() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test029#234");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test029");
    int[] intArray4=new int[]{100,1};
    int[] intArray11=new int[]{(byte)-1,100,(short)0,100,'#',100};
    boolean boolean12=org.apache.commons.lang.math.NumberUtils.equals(intArray4,intArray11);
    java.lang.String[] strArray16=org.apache.commons.lang.StringUtils.splitByWholeSeparator("","                                                                                                 ");
    java.lang.Object[] objArray17=new java.lang.Object[]{(byte)10,"aaaaaaaaa                                                                                        ",boolean12,"aaaaaaaaa ",strArray16};
    java.lang.String str19=org.apache.commons.lang.StringUtils.join(objArray17,"hi!");
    java.lang.String str20=org.apache.commons.lang.StringUtils.join(objArray17);
    java.lang.String str22=org.apache.commons.lang.StringUtils.join(objArray17,'4');
    org.junit.Assert.assertNotNull(intArray4);
    org.junit.Assert.assertNotNull(intArray11);
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '"+ false+ "'",boolean12 == false);
    org.junit.Assert.assertNotNull(strArray16);
    org.junit.Assert.assertNotNull(objArray17);
  }
  @Test public void test030() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test030#253");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test030");
    java.lang.Object[] objArray0=null;
    java.lang.String str4=org.apache.commons.lang.StringUtils.join(objArray0,'4',52,(int)(short)-1);
    org.junit.Assert.assertNull(str4);
  }
  @Test public void test031() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test031#262");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test031");
    java.lang.String str2=org.apache.commons.lang.StringUtils.getNestedString("... !ih...aaaaaaaaaaaaaaaaaaaa                                ","4444444hI!AAAAAAAAA                                                                                        ");
    org.junit.Assert.assertNull(str2);
  }
  @Test public void test032() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test032#270");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test032");
    java.lang.String[] strArray1=org.apache.commons.lang.StringUtils.splitPreserveAllTokens("#######################################################################################          ");
    org.junit.Assert.assertNotNull(strArray1);
  }
  @Test public void test033() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test033#278");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test033");
    int int2=org.apache.commons.lang.StringUtils.lastIndexOf("                                                                                                         HI!",' ');
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 104+ "'",int2 == 104);
  }
  @Test public void test034() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test034#286");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test034");
    java.lang.String str3=org.apache.commons.lang.StringUtils.mid("                                                ",32,(int)(byte)0);
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ ""+ "'",str3.equals(""));
  }
  @Test public void test035() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test035#294");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test035");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringBefore("                                                                                                ","A                                                hi!                                                 ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                                                                                                "+ "'",str2.equals("                                                                                                "));
  }
  @Test public void test036() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test036#302");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test036");
    java.lang.String str3=org.apache.commons.lang.StringUtils.center("                                    aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa                                       hi!                                                 ",(int)(short)100,'a');
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "                                    aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa                                       hi!                                                 "+ "'",str3.equals("                                    aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa                                       hi!                                                 "));
  }
  @Test public void test037() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test037#310");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test037");
    java.lang.String str1=org.apache.commons.lang.StringUtils.trimToEmpty("4444444Hi!aaaaaaaaa                                                                                        ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "4444444Hi!aaaaaaaaa"+ "'",str1.equals("4444444Hi!aaaaaaaaa"));
  }
  @Test public void test038() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test038#318");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test038");
    int int3=org.apache.commons.lang.math.NumberUtils.max((int)'#',94,104);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ 104+ "'",int3 == 104);
  }
  @Test public void test039() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test039#326");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test039");
    java.lang.String str1=org.apache.commons.lang.StringUtils.lowerCase("                                                                                                 ##A");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "                                                                                                 ##a"+ "'",str1.equals("                                                                                                 ##a"));
  }
  @Test public void test040() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test040#334");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test040");
    boolean boolean2=org.apache.commons.lang.StringUtils.equals(" a                                                                                       ","   ");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test041() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test041#342");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test041");
    int int2=org.apache.commons.lang.math.NumberUtils.stringToInt("4",(int)'a');
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 4+ "'",int2 == 4);
  }
  @Test public void test042() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test042#350");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test042");
    float float1=org.apache.commons.lang.math.NumberUtils.toFloat("h");
    org.junit.Assert.assertTrue("'" + float1 + "' != '"+ 0.0f+ "'",float1 == 0.0f);
  }
  @Test public void test043() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test043#358");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test043");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAlphanumericSpace("                                    aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa                                       hi!                                                 ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test044() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test044#366");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test044");
    boolean boolean1=org.apache.commons.lang.StringUtils.isBlank("444444444444444444444444444444444444444444444          44444444444444444444444444444444444444444444");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test045() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test045#374");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test045");
    boolean boolean1=org.apache.commons.lang.StringUtils.isEmpty("AAAAAAAAA");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test046() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test046#382");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test046");
    long long2=org.apache.commons.lang.math.NumberUtils.toLong("aaaaaaaaa                                    ",(long)7);
    org.junit.Assert.assertTrue("'" + long2 + "' != '"+ 7L+ "'",long2 == 7L);
  }
  @Test public void test047() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test047#390");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test047");
    java.lang.String str2=org.apache.commons.lang.StringUtils.right("                          AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa                          ",0);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test048() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test048#398");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test048");
    java.lang.String str2=org.apache.commons.lang.StringUtils.repeat("aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa ",36);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa "+ "'",str2.equals("aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa "));
  }
  @Test public void test049() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test049#406");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test049");
    java.lang.String str3=org.apache.commons.lang.StringUtils.substring("                             Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!",(int)'4',100);
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "aaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa A"+ "'",str3.equals("aaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa A"));
  }
  @Test public void test050() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test050#414");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test050");
    try {
      java.math.BigInteger bigInteger1=org.apache.commons.lang.math.NumberUtils.createBigInteger("a                                                HI!");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a      \"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test051() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test051#425");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test051");
    byte[] byteArray0=null;
    byte[] byteArray4=new byte[]{(byte)100,(byte)0,(byte)100};
    byte[] byteArray7=new byte[]{(byte)-1,(byte)-1};
    boolean boolean8=org.apache.commons.lang.math.NumberUtils.equals(byteArray4,byteArray7);
    boolean boolean9=org.apache.commons.lang.math.NumberUtils.equals(byteArray0,byteArray7);
    try {
      byte byte10=org.apache.commons.lang.math.NumberUtils.max(byteArray0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
    }
 catch (    java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNotNull(byteArray4);
    org.junit.Assert.assertNotNull(byteArray7);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '"+ false+ "'",boolean8 == false);
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '"+ false+ "'",boolean9 == false);
  }
  @Test public void test052() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test052#445");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test052");
    java.lang.String[] strArray4=org.apache.commons.lang.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaa                                ","a                                                HI!",96);
    int int5=org.apache.commons.lang.StringUtils.indexOfAny("          ",strArray4);
    org.junit.Assert.assertNotNull(strArray4);
    org.junit.Assert.assertTrue("'" + int5 + "' != '"+ 0+ "'",int5 == 0);
  }
  @Test public void test053() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test053#455");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test053");
    java.lang.String str2=org.apache.commons.lang.StringUtils.leftPad("   #######################################################################################aaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa",31);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "   #######################################################################################aaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa"+ "'",str2.equals("   #######################################################################################aaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa"));
  }
  @Test public void test054() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test054#463");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test054");
    java.lang.String str1=org.apache.commons.lang.StringUtils.strip("#########");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "#########"+ "'",str1.equals("#########"));
  }
  @Test public void test055() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test055#471");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test055");
    java.lang.String str1=org.apache.commons.lang.StringUtils.chomp("a                                                HI!                                                 ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "a                                                HI!                                                 "+ "'",str1.equals("a                                                HI!                                                 "));
  }
  @Test public void test056() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test056#479");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test056");
    java.lang.String str2=org.apache.commons.lang.StringUtils.getNestedString("                             Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!","aaaaaaaaaaaaaaaaaaaa##Aaaaaaaaa");
    org.junit.Assert.assertNull(str2);
  }
  @Test public void test057() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test057#487");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test057");
    char[] charArray8=new char[]{'a','4',' ','4','#'};
    int int9=org.apache.commons.lang.StringUtils.indexOfAnyBut("hi!",charArray8);
    int int10=org.apache.commons.lang.StringUtils.indexOfAnyBut("                                ",charArray8);
    boolean boolean11=org.apache.commons.lang.StringUtils.containsNone("                                                                                                 ",charArray8);
    org.junit.Assert.assertNotNull(charArray8);
    org.junit.Assert.assertTrue("'" + int9 + "' != '"+ 0+ "'",int9 == 0);
    org.junit.Assert.assertTrue("'" + int10 + "' != '"+ (-1)+ "'",int10 == (-1));
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '"+ false+ "'",boolean11 == false);
  }
  @Test public void test058() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test058#501");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test058");
    java.lang.String str3=org.apache.commons.lang.StringUtils.rightPad("   ",(int)(short)100,'a');
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"+ "'",str3.equals("   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
  }
  @Test public void test059() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test059#509");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test059");
    boolean boolean1=org.apache.commons.lang.math.NumberUtils.isNumber("          #############################################################################");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test060() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test060#517");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test060");
    java.lang.String str3=org.apache.commons.lang.StringUtils.rightPad(" aaaaaaaaa",(int)(short)1,'a');
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ " aaaaaaaaa"+ "'",str3.equals(" aaaaaaaaa"));
  }
  @Test public void test061() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test061#525");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test061");
    java.lang.String str1=org.apache.commons.lang.StringUtils.lowerCase(" aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ " aaaaaaaaaaaaaaaaaaaa  aaaaaaaaa "+ "'",str1.equals(" aaaaaaaaaaaaaaaaaaaa  aaaaaaaaa "));
  }
  @Test public void test062() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test062#533");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test062");
    java.lang.String str2=org.apache.commons.lang.StringUtils.difference("AAAAAAAAA ","aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa "+ "'",str2.equals("aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa "));
  }
  @Test public void test063() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test063#541");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test063");
    try {
      java.lang.String str2=org.apache.commons.lang.StringUtils.abbreviate("",(int)(short)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
    }
 catch (    java.lang.IllegalArgumentException e) {
    }
  }
  @Test public void test064() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test064#552");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test064");
    int int2=org.apache.commons.lang.StringUtils.lastIndexOf("A",'4');
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test065() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test065#560");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test065");
    int int2=org.apache.commons.lang.StringUtils.indexOf("                                                                                                    ",'a');
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test066() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test066#568");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test066");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.split("                                   ","");
    java.lang.String str4=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray2,"                                                ");
    java.lang.String str6=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray2,"                                                                                                         HI!");
    org.junit.Assert.assertNotNull(strArray2);
    org.junit.Assert.assertTrue("'" + str4 + "' != '"+ "                                   "+ "'",str4.equals("                                   "));
    org.junit.Assert.assertTrue("'" + str6 + "' != '"+ "                                   "+ "'",str6.equals("                                   "));
  }
  @Test public void test067() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test067#580");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test067");
    boolean boolean1=org.apache.commons.lang.StringUtils.isNotEmpty("                                    aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa                                       hi!                                                 ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test068() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test068#588");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test068");
    int int2=org.apache.commons.lang.StringUtils.indexOfAnyBut("444444444444444444444444444444444444444444444          444444444444444444444444444444444444444444444","                                              hi");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 0+ "'",int2 == 0);
  }
  @Test public void test069() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test069#596");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test069");
    java.lang.String str1=org.apache.commons.lang.StringUtils.clean("                          AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa                          ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa"+ "'",str1.equals("AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa"));
  }
  @Test public void test070() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test070#604");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test070");
    java.lang.String str1=org.apache.commons.lang.StringUtils.capitaliseAllWords("###                     aaaaaaaaa                                                                                        ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "###                     Aaaaaaaaa                                                                                        "+ "'",str1.equals("###                     Aaaaaaaaa                                                                                        "));
  }
  @Test public void test071() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test071#612");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test071");
    int int2=org.apache.commons.lang.StringUtils.indexOfAnyBut("                                   ","aaaaaaaaaaaaaaaaaaaa##Aaaaaaaa");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 0+ "'",int2 == 0);
  }
  @Test public void test072() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test072#620");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test072");
    java.lang.String str3=org.apache.commons.lang.StringUtils.leftPad("                   ",4,"aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "                   "+ "'",str3.equals("                   "));
  }
  @Test public void test073() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test073#628");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test073");
    try {
      java.lang.String str3=org.apache.commons.lang.StringUtils.abbreviate(" aaaaaaaaa",0,(int)(short)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
    }
 catch (    java.lang.IllegalArgumentException e) {
    }
  }
  @Test public void test074() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test074#639");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test074");
    java.lang.String str3=org.apache.commons.lang.StringUtils.mid("                                            aaaaaaaaa i!                                            ",43,(int)(byte)10);
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ " aaaaaaaaa"+ "'",str3.equals(" aaaaaaaaa"));
  }
  @Test public void test075() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test075#647");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test075");
    java.lang.String str1=org.apache.commons.lang.StringUtils.reverse("A!ih");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "hi!A"+ "'",str1.equals("hi!A"));
  }
  @Test public void test076() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test076#655");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test076");
    short short3=org.apache.commons.lang.math.NumberUtils.max((short)100,(short)(byte)1,(short)(byte)0);
    org.junit.Assert.assertTrue("'" + short3 + "' != '"+ (short)100+ "'",short3 == (short)100);
  }
  @Test public void test077() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test077#663");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test077");
    short short3=org.apache.commons.lang.math.NumberUtils.min((short)0,(short)(byte)100,(short)(byte)1);
    org.junit.Assert.assertTrue("'" + short3 + "' != '"+ (short)0+ "'",short3 == (short)0);
  }
  @Test public void test078() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test078#671");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test078");
    boolean boolean2=org.apache.commons.lang.StringUtils.equals("aaaaaaaaa","###                     Aaaaaaaaa                                                                                        ");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test079() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test079#679");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test079");
    java.lang.String str2=org.apache.commons.lang.StringUtils.strip("                        aaaaaaaaaaaaaaaaaaaa                                                        ","#################...");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                        aaaaaaaaaaaaaaaaaaaa                                                        "+ "'",str2.equals("                        aaaaaaaaaaaaaaaaaaaa                                                        "));
  }
  @Test public void test080() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test080#687");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test080");
    java.util.Iterator iterator0=null;
    java.lang.String str2=org.apache.commons.lang.StringUtils.join(iterator0,"#############################################################################");
    org.junit.Assert.assertNull(str2);
  }
  @Test public void test081() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test081#696");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test081");
    java.lang.String str1=org.apache.commons.lang.StringUtils.strip("aaaaaaaaai!");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "aaaaaaaaai!"+ "'",str1.equals("aaaaaaaaai!"));
  }
  @Test public void test082() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test082#704");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test082");
    java.lang.String str2=org.apache.commons.lang.StringUtils.removeEnd("aa ","   aaaaaaaaa                                        ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "aa "+ "'",str2.equals("aa "));
  }
  @Test public void test083() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test083#712");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test083");
    int int2=org.apache.commons.lang.StringUtils.getLevenshteinDistance("AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa","IaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 63+ "'",int2 == 63);
  }
  @Test public void test084() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test084#720");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test084");
    boolean boolean1=org.apache.commons.lang.StringUtils.isNumeric("                                                ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test085() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test085#728");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test085");
    boolean boolean2=org.apache.commons.lang.StringUtils.containsNone("","                          AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa                          ");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ true+ "'",boolean2 == true);
  }
  @Test public void test086() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test086#736");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test086");
    boolean boolean2=org.apache.commons.lang.StringUtils.contains("hi!                         ...","!iaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test087() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test087#744");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test087");
    float float3=org.apache.commons.lang.math.NumberUtils.min((float)10L,0.0f,(-1.0f));
    org.junit.Assert.assertTrue("'" + float3 + "' != '"+ (-1.0f)+ "'",float3 == (-1.0f));
  }
  @Test public void test088() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test088#752");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test088");
    java.lang.String str3=org.apache.commons.lang.StringUtils.center("                                                hi!                                                 ",(int)'a',"Aa ");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "                                                hi!                                                 "+ "'",str3.equals("                                                hi!                                                 "));
  }
  @Test public void test089() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test089#760");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test089");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAlpha("Aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test090() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test090#768");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test090");
    java.lang.String str3=org.apache.commons.lang.StringUtils.abbreviate("iaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA",96,88);
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "...aaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA"+ "'",str3.equals("...aaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA"));
  }
  @Test public void test091() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test091#776");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test091");
    java.lang.String str3=org.apache.commons.lang.StringUtils.center("##Aaaaaaaaa",10,'a');
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "##Aaaaaaaaa"+ "'",str3.equals("##Aaaaaaaaa"));
  }
  @Test public void test092() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test092#784");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test092");
    int int2=org.apache.commons.lang.StringUtils.indexOfDifference("aaaaaaaaa","                                                                                       Aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 0+ "'",int2 == 0);
  }
  @Test public void test093() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test093#792");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test093");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.splitByWholeSeparator("Hi!"," ");
    java.lang.Class<?> wildcardClass3=strArray2.getClass();
    java.lang.String str4=org.apache.commons.lang.StringUtils.concatenate((java.lang.Object[])strArray2);
    try {
      java.lang.String str8=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray2,'#',29,99);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 29");
    }
 catch (    java.lang.ArrayIndexOutOfBoundsException e) {
    }
    org.junit.Assert.assertNotNull(strArray2);
    org.junit.Assert.assertNotNull(wildcardClass3);
    org.junit.Assert.assertTrue("'" + str4 + "' != '"+ "Hi!"+ "'",str4.equals("Hi!"));
  }
  @Test public void test094() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test094#809");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test094");
    int int2=org.apache.commons.lang.StringUtils.indexOf("aaaaaaaaaaaaaaaaaaaa##Aaaaaaaa",'a');
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 0+ "'",int2 == 0);
  }
  @Test public void test095() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test095#817");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test095");
    java.lang.String str3=org.apache.commons.lang.StringUtils.replaceOnce("                          AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa                          ","hi!                                   A","AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "                          AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa                          "+ "'",str3.equals("                          AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa                          "));
  }
  @Test public void test096() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test096#825");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test096");
    java.lang.String str2=org.apache.commons.lang.StringUtils.reverseDelimited("Aaaaaaaaa ",' ');
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "Aaaaaaaaa"+ "'",str2.equals("Aaaaaaaaa"));
  }
  @Test public void test097() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test097#833");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test097");
    int int2=org.apache.commons.lang.math.NumberUtils.compare((float)(-1),(float)10L);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test098() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test098#841");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test098");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringAfter("!ih","");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "!ih"+ "'",str2.equals("!ih"));
  }
  @Test public void test099() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test099#849");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test099");
    double double1=org.apache.commons.lang.math.NumberUtils.toDouble("Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!");
    org.junit.Assert.assertTrue("'" + double1 + "' != '"+ 0.0d+ "'",double1 == 0.0d);
  }
  @Test public void test100() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test100#857");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test100");
    java.lang.String str2=org.apache.commons.lang.StringUtils.prechomp("aaaaaaaaa                                    ","           4            ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "aaaaaaaaa                                    "+ "'",str2.equals("aaaaaaaaa                                    "));
  }
  @Test public void test101() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test101#865");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test101");
    java.lang.String str3=org.apache.commons.lang.StringUtils.replace("                                          aaaaaaaaa i!","A                                                hi!                                                 ","          ");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "                                          aaaaaaaaa i!"+ "'",str3.equals("                                          aaaaaaaaa i!"));
  }
  @Test public void test102() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test102#873");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test102");
    try {
      java.lang.String str2=org.apache.commons.lang.StringUtils.chompLast("HHHHHHHHHH","###                     aaaaaaaaa");
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -23");
    }
 catch (    java.lang.StringIndexOutOfBoundsException e) {
    }
  }
  @Test public void test103() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test103#884");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test103");
    int int2=org.apache.commons.lang.StringUtils.lastIndexOf("                                                                                                         HI!","");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 108+ "'",int2 == 108);
  }
  @Test public void test104() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test104#892");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test104");
    java.lang.String str3=org.apache.commons.lang.StringUtils.replaceChars("                                                                                                         HI!",'a','a');
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "                                                                                                         HI!"+ "'",str3.equals("                                                                                                         HI!"));
  }
  @Test public void test105() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test105#900");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test105");
    boolean boolean2=org.apache.commons.lang.StringUtils.containsOnly("                 ","                        aaaaaaaaaaaaaaaaaaaa                                                        ");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ true+ "'",boolean2 == true);
  }
  @Test public void test106() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test106#908");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test106");
    try {
      java.math.BigInteger bigInteger1=org.apache.commons.lang.math.NumberUtils.createBigInteger("           4            ");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"      \"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test107() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test107#919");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test107");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringBetween("           4            ","                                          aaaaaaaaa ");
    org.junit.Assert.assertNull(str2);
  }
  @Test public void test108() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test108#927");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test108");
    boolean boolean2=org.apache.commons.lang.StringUtils.containsOnly("aaaaaaaaa i!","                                                                                                         HI!");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test109() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test109#935");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test109");
    float[] floatArray1=new float[]{(byte)1};
    float float2=org.apache.commons.lang.math.NumberUtils.max(floatArray1);
    float[] floatArray6=new float[]{(byte)-1,(-1.0f),(byte)100};
    float float7=org.apache.commons.lang.math.NumberUtils.max(floatArray6);
    boolean boolean8=org.apache.commons.lang.math.NumberUtils.equals(floatArray1,floatArray6);
    float[] floatArray15=new float[]{10L,(short)10,0.0f,' ',(-1),'4'};
    float float16=org.apache.commons.lang.math.NumberUtils.min(floatArray15);
    boolean boolean17=org.apache.commons.lang.math.NumberUtils.equals(floatArray6,floatArray15);
    float float18=org.apache.commons.lang.math.NumberUtils.max(floatArray6);
    org.junit.Assert.assertNotNull(floatArray1);
    org.junit.Assert.assertTrue("'" + float2 + "' != '"+ 1.0f+ "'",float2 == 1.0f);
    org.junit.Assert.assertNotNull(floatArray6);
    org.junit.Assert.assertTrue("'" + float7 + "' != '"+ 100.0f+ "'",float7 == 100.0f);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '"+ false+ "'",boolean8 == false);
    org.junit.Assert.assertNotNull(floatArray15);
    org.junit.Assert.assertTrue("'" + float16 + "' != '"+ (-1.0f)+ "'",float16 == (-1.0f));
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '"+ false+ "'",boolean17 == false);
    org.junit.Assert.assertTrue("'" + float18 + "' != '"+ 100.0f+ "'",float18 == 100.0f);
  }
  @Test public void test110() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test110#959");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test110");
    boolean boolean1=org.apache.commons.lang.math.NumberUtils.isDigits("444444444444444444444444444444444444444444444          44444444444444444444444444444444444444444444");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test111() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test111#967");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test111");
    java.lang.String str1=org.apache.commons.lang.StringUtils.strip("H");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "H"+ "'",str1.equals("H"));
  }
  @Test public void test112() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test112#975");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test112");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAsciiPrintable("aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test113() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test113#983");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test113");
    int int3=org.apache.commons.lang.StringUtils.ordinalIndexOf("aaaaaaaaai!","Hi!   #######################################################################################       A",48);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test114() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test114#991");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test114");
    java.lang.String[] strArray3=org.apache.commons.lang.StringUtils.split("A","aaaaaaaaa                                    ",4);
    java.lang.String str5=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray3,"!iaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA");
    org.junit.Assert.assertNotNull(strArray3);
    org.junit.Assert.assertTrue("'" + str5 + "' != '"+ "A"+ "'",str5.equals("A"));
  }
  @Test public void test115() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test115#1001");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test115");
    java.lang.String str2=org.apache.commons.lang.StringUtils.leftPad("AAAAAAAAA",32);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                       AAAAAAAAA"+ "'",str2.equals("                       AAAAAAAAA"));
  }
  @Test public void test116() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test116#1009");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test116");
    int int2=org.apache.commons.lang.StringUtils.countMatches("AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa","Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!    ");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 0+ "'",int2 == 0);
  }
  @Test public void test117() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test117#1017");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test117");
    boolean boolean2=org.apache.commons.lang.StringUtils.contains("                                                                                                 ",'a');
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test118() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test118#1025");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test118");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.splitPreserveAllTokens("          ",'a');
    java.lang.String str3=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray2);
    java.lang.String str7=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray2,'4',(int)'#',0);
    org.junit.Assert.assertNotNull(strArray2);
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "          "+ "'",str3.equals("          "));
    org.junit.Assert.assertTrue("'" + str7 + "' != '"+ ""+ "'",str7.equals(""));
  }
  @Test public void test119() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test119#1037");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test119");
    java.lang.String str2=org.apache.commons.lang.StringUtils.reverseDelimited("Aa ",'#');
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "Aa "+ "'",str2.equals("Aa "));
  }
  @Test public void test120() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test120#1045");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test120");
    java.lang.String str3=org.apache.commons.lang.StringUtils.substring("   aaaaaaaaa                                        ",0,2);
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "  "+ "'",str3.equals("  "));
  }
  @Test public void test121() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test121#1053");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test121");
    java.lang.String str1=org.apache.commons.lang.StringUtils.chompLast("          #############################################################################");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "          #############################################################################"+ "'",str1.equals("          #############################################################################"));
  }
  @Test public void test122() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test122#1061");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test122");
    java.lang.String str2=org.apache.commons.lang.StringUtils.getPrechomp("aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa ","...                          ...");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test123() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test123#1069");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test123");
    java.lang.String str1=org.apache.commons.lang.StringUtils.capitalize("#######################################################################################          ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "#######################################################################################          "+ "'",str1.equals("#######################################################################################          "));
  }
  @Test public void test124() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test124#1077");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test124");
    java.lang.String str2=org.apache.commons.lang.StringUtils.removeStart("a                                                HI!","          aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "a                                                HI!"+ "'",str2.equals("a                                                HI!"));
  }
  @Test public void test125() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test125#1085");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test125");
    int int2=org.apache.commons.lang.StringUtils.indexOf("A!ih",'#');
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test126() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test126#1093");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test126");
    int int3=org.apache.commons.lang.StringUtils.ordinalIndexOf("                                                                                   aaaaaaaaa ","                                                                                                    ",31);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test127() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test127#1101");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test127");
    int int2=org.apache.commons.lang.math.NumberUtils.compare((float)99L,(float)(-1));
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 1+ "'",int2 == 1);
  }
  @Test public void test128() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test128#1109");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test128");
    boolean boolean2=org.apache.commons.lang.StringUtils.equalsIgnoreCase("Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai","#############################################################################          ");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test129() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test129#1117");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test129");
    java.lang.String[] strArray3=org.apache.commons.lang.StringUtils.splitPreserveAllTokens("#######################################################################################          ","aaaaaaaaa");
    int int4=org.apache.commons.lang.StringUtils.indexOfAny("aaaaaaaaa ",strArray3);
    org.junit.Assert.assertNotNull(strArray3);
    org.junit.Assert.assertTrue("'" + int4 + "' != '"+ (-1)+ "'",int4 == (-1));
  }
  @Test public void test130() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test130#1127");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test130");
    java.lang.String str1=org.apache.commons.lang.StringUtils.stripToNull("!ih");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "!ih"+ "'",str1.equals("!ih"));
  }
  @Test public void test131() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test131#1135");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test131");
    int int3=org.apache.commons.lang.StringUtils.lastIndexOf("... !ih...aaaaaaaaaaaaaaaaaaaa                                ",'4',108);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test132() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test132#1143");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test132");
    double double2=org.apache.commons.lang.math.NumberUtils.toDouble("                   ",52.0d);
    org.junit.Assert.assertTrue("'" + double2 + "' != '"+ 52.0d+ "'",double2 == 52.0d);
  }
  @Test public void test133() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test133#1151");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test133");
    java.lang.String str2=org.apache.commons.lang.StringUtils.getPrechomp("           4            ","");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test134() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test134#1159");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test134");
    int int3=org.apache.commons.lang.math.NumberUtils.min(63,0,(int)' ');
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ 0+ "'",int3 == 0);
  }
  @Test public void test135() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test135#1167");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test135");
    short short3=org.apache.commons.lang.math.NumberUtils.max((short)-1,(short)(byte)-1,(short)(byte)100);
    org.junit.Assert.assertTrue("'" + short3 + "' != '"+ (short)100+ "'",short3 == (short)100);
  }
  @Test public void test136() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test136#1175");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test136");
    java.lang.String str3=org.apache.commons.lang.StringUtils.replaceChars("                                              hi!",'#',' ');
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "                                              hi!"+ "'",str3.equals("                                              hi!"));
  }
  @Test public void test137() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test137#1183");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test137");
    java.util.Collection collection0=null;
    java.lang.String str2=org.apache.commons.lang.StringUtils.join(collection0,"   #######################################################################################");
    org.junit.Assert.assertNull(str2);
  }
  @Test public void test138() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test138#1192");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test138");
    java.lang.String str2=org.apache.commons.lang.StringUtils.chomp("                                                    ","                                                                                                                  HI!");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                                                    "+ "'",str2.equals("                                                    "));
  }
  @Test public void test139() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test139#1200");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test139");
    int int2=org.apache.commons.lang.StringUtils.indexOfAny(" aaaaaaaaaaaaaaaaaaaa  aaaaaaaaa ","                                                                                                                  HI!");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 0+ "'",int2 == 0);
  }
  @Test public void test140() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test140#1208");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test140");
    java.lang.String str3=org.apache.commons.lang.StringUtils.rightPad("                                                                                                                  HI!",(-1),' ');
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "                                                                                                                  HI!"+ "'",str3.equals("                                                                                                                  HI!"));
  }
  @Test public void test141() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test141#1216");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test141");
    boolean boolean1=org.apache.commons.lang.StringUtils.isNotEmpty("444444444444444444444444444444444444444444444          44444444444444444444444444444444444444444444");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test142() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test142#1224");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test142");
    java.lang.String str3=org.apache.commons.lang.StringUtils.replaceOnce(" aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa ","                 ","...aaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ " aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa "+ "'",str3.equals(" aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa "));
  }
  @Test public void test143() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test143#1232");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test143");
    int int3=org.apache.commons.lang.StringUtils.lastIndexOf("   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",'4',(int)'4');
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test144() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test144#1240");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test144");
    java.util.Collection collection0=null;
    java.lang.String str2=org.apache.commons.lang.StringUtils.join(collection0," aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa ");
    org.junit.Assert.assertNull(str2);
  }
  @Test public void test145() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test145#1249");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test145");
    java.lang.String str1=org.apache.commons.lang.StringUtils.deleteWhitespace("Aa ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "Aa"+ "'",str1.equals("Aa"));
  }
  @Test public void test146() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test146#1257");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test146");
    java.lang.String[] strArray3=org.apache.commons.lang.StringUtils.split("                                                hi!                                                 ","#######################################################################################",(int)(short)100);
    org.junit.Assert.assertNotNull(strArray3);
  }
  @Test public void test147() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test147#1265");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test147");
    float float1=org.apache.commons.lang.math.NumberUtils.toFloat("                                   ");
    org.junit.Assert.assertTrue("'" + float1 + "' != '"+ 0.0f+ "'",float1 == 0.0f);
  }
  @Test public void test148() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test148#1273");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test148");
    long long1=org.apache.commons.lang.math.NumberUtils.toLong("                                                                                       aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + long1 + "' != '"+ 0L+ "'",long1 == 0L);
  }
  @Test public void test149() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test149#1281");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test149");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substring("           4            ",(int)(byte)10);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ " 4            "+ "'",str2.equals(" 4            "));
  }
  @Test public void test150() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test150#1289");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test150");
    java.lang.String str3=org.apache.commons.lang.StringUtils.rightPad("#######################################################################################          ",(int)(short)100,' ');
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "#######################################################################################             "+ "'",str3.equals("#######################################################################################             "));
  }
  @Test public void test151() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test151#1297");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test151");
    java.lang.String str3=org.apache.commons.lang.StringUtils.replace("h","                                                                                                         HI!","          ");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "h"+ "'",str3.equals("h"));
  }
  @Test public void test152() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test152#1305");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test152");
    int int2=org.apache.commons.lang.StringUtils.indexOf("","###                                                                                       aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test153() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test153#1313");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test153");
    java.lang.String str2=org.apache.commons.lang.StringUtils.repeat("AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa",97);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa"+ "'",str2.equals("AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa"));
  }
  @Test public void test154() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test154#1321");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test154");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringBeforeLast("","                 ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test155() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test155#1329");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test155");
    double double3=org.apache.commons.lang.math.NumberUtils.max(0.0d,(double)(byte)0,0.0d);
    org.junit.Assert.assertTrue("'" + double3 + "' != '"+ 0.0d+ "'",double3 == 0.0d);
  }
  @Test public void test156() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test156#1337");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test156");
    java.lang.String str2=org.apache.commons.lang.StringUtils.strip("   ","                             hi!                                   A                             ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test157() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test157#1345");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test157");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringAfterLast("   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa","");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test158() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test158#1353");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test158");
    java.lang.String str3=org.apache.commons.lang.StringUtils.replace("4","!ih","444444444444444444444444444444444444444444444          44444444444444444444444444444444444444444444");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "4"+ "'",str3.equals("4"));
  }
  @Test public void test159() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test159#1361");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test159");
    java.lang.String str2=org.apache.commons.lang.StringUtils.getChomp("###                                                                                       aaaaaaaaa ","          aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "          aaaaaaaaa "+ "'",str2.equals("          aaaaaaaaa "));
  }
  @Test public void test160() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test160#1369");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test160");
    boolean boolean1=org.apache.commons.lang.StringUtils.isEmpty("###                     aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test161() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test161#1377");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test161");
    java.lang.String str1=org.apache.commons.lang.StringUtils.deleteWhitespace("          #############################################################################");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "#############################################################################"+ "'",str1.equals("#############################################################################"));
  }
  @Test public void test162() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test162#1385");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test162");
    java.lang.String str2=org.apache.commons.lang.StringUtils.getPrechomp("          #############################################################################","!iaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test163() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test163#1393");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test163");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.split("Hi!                                   A","");
    org.junit.Assert.assertNotNull(strArray2);
  }
  @Test public void test164() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test164#1401");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test164");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringBeforeLast("              ","");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "              "+ "'",str2.equals("              "));
  }
  @Test public void test165() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test165#1409");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test165");
    java.lang.String str3=org.apache.commons.lang.StringUtils.abbreviate("hi!                                   A",96,24);
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "...                    A"+ "'",str3.equals("...                    A"));
  }
  @Test public void test166() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test166#1417");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test166");
    java.lang.String str3=org.apache.commons.lang.StringUtils.rightPad("aaaaaaaaa ",(int)(byte)10,"... !ih...aaaaaaaaaaaaaaaaaaaa                                ");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "aaaaaaaaa "+ "'",str3.equals("aaaaaaaaa "));
  }
  @Test public void test167() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test167#1425");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test167");
    java.lang.String str1=org.apache.commons.lang.StringUtils.lowerCase("4444444hI!AAAAAAAAA                                                                                        ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "4444444hi!aaaaaaaaa                                                                                        "+ "'",str1.equals("4444444hi!aaaaaaaaa                                                                                        "));
  }
  @Test public void test168() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test168#1433");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test168");
    java.lang.String[] strArray1=org.apache.commons.lang.StringUtils.splitPreserveAllTokens("aaaaaaaaa                                                                                        ");
    java.lang.String str2=org.apache.commons.lang.StringUtils.concatenate((java.lang.Object[])strArray1);
    org.junit.Assert.assertNotNull(strArray1);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "aaaaaaaaa"+ "'",str2.equals("aaaaaaaaa"));
  }
  @Test public void test169() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test169#1443");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test169");
    java.lang.String str1=org.apache.commons.lang.StringUtils.chomp("                                                    ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "                                                    "+ "'",str1.equals("                                                    "));
  }
  @Test public void test170() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test170#1451");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test170");
    try {
      java.math.BigInteger bigInteger1=org.apache.commons.lang.math.NumberUtils.createBigInteger("hi!A");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!A\"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test171() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test171#1462");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test171");
    java.lang.String[] strArray1=org.apache.commons.lang.StringUtils.split("                          AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa                          ");
    org.junit.Assert.assertNotNull(strArray1);
  }
  @Test public void test172() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test172#1470");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test172");
    java.lang.String str3=org.apache.commons.lang.StringUtils.abbreviate("               ",4,9);
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "      ..."+ "'",str3.equals("      ..."));
  }
  @Test public void test173() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test173#1478");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test173");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAlphanumeric("aaaaaaaaa i!");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test174() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test174#1486");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test174");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAlpha("hi!                                   A");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test175() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test175#1494");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test175");
    java.lang.String str1=org.apache.commons.lang.StringUtils.trimToEmpty("   #######################################################################################");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "#######################################################################################"+ "'",str1.equals("#######################################################################################"));
  }
  @Test public void test176() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test176#1502");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test176");
    boolean boolean1=org.apache.commons.lang.math.NumberUtils.isNumber("A!ih");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test177() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test177#1510");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test177");
    java.lang.String[] strArray3=org.apache.commons.lang.StringUtils.splitPreserveAllTokens("                               ","aaaaaaaaaaaaaaaaaaaaAaaaaaaaa",(int)(short)0);
    org.junit.Assert.assertNotNull(strArray3);
  }
  @Test public void test178() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test178#1518");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test178");
    float float1=org.apache.commons.lang.math.NumberUtils.toFloat("          aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + float1 + "' != '"+ 0.0f+ "'",float1 == 0.0f);
  }
  @Test public void test179() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test179#1526");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test179");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAlphaSpace("#############################################################################          ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test180() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test180#1534");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test180");
    int int3=org.apache.commons.lang.math.NumberUtils.max(0,88,36);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ 88+ "'",int3 == 88);
  }
  @Test public void test181() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test181#1542");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test181");
    java.lang.String str2=org.apache.commons.lang.StringUtils.stripStart("   aaaaaaaaa                                        ","aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test182() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test182#1550");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test182");
    int int2=org.apache.commons.lang.StringUtils.indexOf("###                                                                                       aaaaaaaaa ",'#');
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 0+ "'",int2 == 0);
  }
  @Test public void test183() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test183#1558");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test183");
    java.lang.String str1=org.apache.commons.lang.StringUtils.deleteSpaces("iaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "iaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaA"+ "'",str1.equals("iaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaA"));
  }
  @Test public void test184() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test184#1566");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test184");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringBeforeLast("","          #############################################################################");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test185() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test185#1574");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test185");
    boolean boolean2=org.apache.commons.lang.StringUtils.containsOnly("aaaaaaaaa i!","aaaaaaaaaaaaaaaaaaaaAaaaaaaaa");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test186() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test186#1582");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test186");
    boolean boolean1=org.apache.commons.lang.StringUtils.isBlank("                                                                                       aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test187() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test187#1590");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test187");
    java.lang.String str3=org.apache.commons.lang.StringUtils.substring("Aa ",1,9);
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "a "+ "'",str3.equals("a "));
  }
  @Test public void test188() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test188#1598");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test188");
    float float2=org.apache.commons.lang.math.NumberUtils.toFloat("hi!A",(float)(byte)10);
    org.junit.Assert.assertTrue("'" + float2 + "' != '"+ 10.0f+ "'",float2 == 10.0f);
  }
  @Test public void test189() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test189#1606");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test189");
    java.lang.String str2=org.apache.commons.lang.StringUtils.reverseDelimited("4444444Hi!",' ');
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "4444444Hi!"+ "'",str2.equals("4444444Hi!"));
  }
  @Test public void test190() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test190#1614");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test190");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringAfter("... !ih..                                           ","iaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test191() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test191#1622");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test191");
    int int2=org.apache.commons.lang.StringUtils.countMatches("#########","               ");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 0+ "'",int2 == 0);
  }
  @Test public void test192() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test192#1630");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test192");
    int int2=org.apache.commons.lang.StringUtils.indexOfAny("aaaaaaaaa                                    ","                   ");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 9+ "'",int2 == 9);
  }
  @Test public void test193() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test193#1638");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test193");
    java.lang.String str1=org.apache.commons.lang.StringUtils.chompLast("      ...");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "      ..."+ "'",str1.equals("      ..."));
  }
  @Test public void test194() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test194#1646");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test194");
    try {
      java.lang.Float float1=org.apache.commons.lang.math.NumberUtils.createFloat("#######################################################################################");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"#######################################################################################\"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test195() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test195#1657");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test195");
    java.lang.String str3=org.apache.commons.lang.StringUtils.abbreviate("                                   ",29,63);
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "                                   "+ "'",str3.equals("                                   "));
  }
  @Test public void test196() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test196#1665");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test196");
    java.lang.String str2=org.apache.commons.lang.StringUtils.abbreviate("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",48);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"+ "'",str2.equals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
  }
  @Test public void test197() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test197#1673");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test197");
    double double2=org.apache.commons.lang.math.NumberUtils.toDouble("aaaaaaaaa i!",(double)52.0f);
    org.junit.Assert.assertTrue("'" + double2 + "' != '"+ 52.0d+ "'",double2 == 52.0d);
  }
  @Test public void test198() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test198#1681");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test198");
    boolean boolean2=org.apache.commons.lang.StringUtils.contains("...                    A",'#');
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test199() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test199#1689");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test199");
    double double2=org.apache.commons.lang.math.NumberUtils.toDouble("a                                                HI!                                                 ",(double)63);
    org.junit.Assert.assertTrue("'" + double2 + "' != '"+ 63.0d+ "'",double2 == 63.0d);
  }
  @Test public void test200() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test200#1697");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test200");
    java.lang.String str4=org.apache.commons.lang.StringUtils.overlay("                                                                                   aaaaaaaaa ","Hi!",(int)(byte)0,104);
    org.junit.Assert.assertTrue("'" + str4 + "' != '"+ "Hi!"+ "'",str4.equals("Hi!"));
  }
  @Test public void test201() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test201#1705");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test201");
    java.lang.String str1=org.apache.commons.lang.StringUtils.uncapitalize("                                                 !ih                                                ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "                                                 !ih                                                "+ "'",str1.equals("                                                 !ih                                                "));
  }
  @Test public void test202() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test202#1713");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test202");
    java.lang.String str1=org.apache.commons.lang.StringUtils.chopNewline("                                                                                                ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "                                                                                                "+ "'",str1.equals("                                                                                                "));
  }
  @Test public void test203() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test203#1721");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test203");
    java.lang.String str3=org.apache.commons.lang.StringUtils.replaceChars("###                     Aaaaaaaaa                                                                                        ",'#','#');
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "###                     Aaaaaaaaa                                                                                        "+ "'",str3.equals("###                     Aaaaaaaaa                                                                                        "));
  }
  @Test public void test204() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test204#1729");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test204");
    long long2=org.apache.commons.lang.math.NumberUtils.toLong("aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa ",0L);
    org.junit.Assert.assertTrue("'" + long2 + "' != '"+ 0L+ "'",long2 == 0L);
  }
  @Test public void test205() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test205#1737");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test205");
    int int3=org.apache.commons.lang.StringUtils.indexOf("                                              hi!",'4',0);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test206() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test206#1745");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test206");
    java.lang.String str1=org.apache.commons.lang.StringUtils.chompLast("aaaaaaaaai!");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "aaaaaaaaai!"+ "'",str1.equals("aaaaaaaaai!"));
  }
  @Test public void test207() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test207#1753");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test207");
    java.lang.String str2=org.apache.commons.lang.StringUtils.removeEnd("HHHHHHHHHH","4444444Hi!");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "HHHHHHHHHH"+ "'",str2.equals("HHHHHHHHHH"));
  }
  @Test public void test208() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test208#1761");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test208");
    int int2=org.apache.commons.lang.StringUtils.indexOfAnyBut("","                                          aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test209() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test209#1769");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test209");
    java.lang.String str2=org.apache.commons.lang.StringUtils.defaultIfEmpty("#########","                                                                                                         HI!");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "#########"+ "'",str2.equals("#########"));
  }
  @Test public void test210() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test210#1777");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test210");
    java.lang.String str1=org.apache.commons.lang.StringUtils.escape("                                                                                              !iH");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "                                                                                              !iH"+ "'",str1.equals("                                                                                              !iH"));
  }
  @Test public void test211() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test211#1785");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test211");
    int int1=org.apache.commons.lang.math.NumberUtils.stringToInt("Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai");
    org.junit.Assert.assertTrue("'" + int1 + "' != '"+ 0+ "'",int1 == 0);
  }
  @Test public void test212() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test212#1793");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test212");
    java.lang.Object[] objArray0=null;
    java.lang.String str2=org.apache.commons.lang.StringUtils.join(objArray0,'a');
    org.junit.Assert.assertNull(str2);
  }
  @Test public void test213() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test213#1802");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test213");
    float float3=org.apache.commons.lang.math.NumberUtils.min(0.0f,(float)1,(float)(short)10);
    org.junit.Assert.assertTrue("'" + float3 + "' != '"+ 0.0f+ "'",float3 == 0.0f);
  }
  @Test public void test214() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test214#1810");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test214");
    java.lang.String str3=org.apache.commons.lang.StringUtils.replaceChars("Aaaaaaaaa ",'#',' ');
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "Aaaaaaaaa "+ "'",str3.equals("Aaaaaaaaa "));
  }
  @Test public void test215() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test215#1818");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test215");
    byte byte3=org.apache.commons.lang.math.NumberUtils.max((byte)1,(byte)-1,(byte)1);
    org.junit.Assert.assertTrue("'" + byte3 + "' != '"+ (byte)1+ "'",byte3 == (byte)1);
  }
  @Test public void test216() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test216#1826");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test216");
    java.lang.String str2=org.apache.commons.lang.StringUtils.rightPad("Aaaaaaaaa ",(int)'#');
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "Aaaaaaaaa                          "+ "'",str2.equals("Aaaaaaaaa                          "));
  }
  @Test public void test217() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test217#1834");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test217");
    java.lang.String str2=org.apache.commons.lang.StringUtils.center("Hi!   #######################################################################################       A",(int)(byte)100);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "Hi!   #######################################################################################       A"+ "'",str2.equals("Hi!   #######################################################################################       A"));
  }
  @Test public void test218() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test218#1842");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test218");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.split("","");
    java.lang.String str4=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray2,"444444444444444444444444444444444444444444444          444444444444444444444444444444444444444444444");
    org.junit.Assert.assertNotNull(strArray2);
    org.junit.Assert.assertTrue("'" + str4 + "' != '"+ ""+ "'",str4.equals(""));
  }
  @Test public void test219() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test219#1852");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test219");
    java.lang.String str3=org.apache.commons.lang.StringUtils.abbreviate(" aaaaaaaaaaaaaaaaaaaa  aaaaaaaaa ",(int)(short)0,(int)(short)10);
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ " aaaaaa..."+ "'",str3.equals(" aaaaaa..."));
  }
  @Test public void test220() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test220#1860");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test220");
    byte byte3=org.apache.commons.lang.math.NumberUtils.min((byte)10,(byte)10,(byte)1);
    org.junit.Assert.assertTrue("'" + byte3 + "' != '"+ (byte)1+ "'",byte3 == (byte)1);
  }
  @Test public void test221() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test221#1868");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test221");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAsciiPrintable("#########");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test222() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test222#1876");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test222");
    short short3=org.apache.commons.lang.math.NumberUtils.max((short)10,(short)(byte)10,(short)0);
    org.junit.Assert.assertTrue("'" + short3 + "' != '"+ (short)10+ "'",short3 == (short)10);
  }
  @Test public void test223() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test223#1884");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test223");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.split("Aaaaaaaaa",'a');
    org.junit.Assert.assertNotNull(strArray2);
  }
  @Test public void test224() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test224#1892");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test224");
    java.lang.String str1=org.apache.commons.lang.StringUtils.uncapitalise("###                     Aaaaaaaaa                                                                                        ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "###                     Aaaaaaaaa                                                                                        "+ "'",str1.equals("###                     Aaaaaaaaa                                                                                        "));
  }
  @Test public void test225() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test225#1900");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test225");
    int int2=org.apache.commons.lang.StringUtils.lastIndexOf("                                          aaaaaaaaa "," aaaaaa");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 41+ "'",int2 == 41);
  }
  @Test public void test226() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test226#1908");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test226");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.split("#######################################################################################          ");
    int int3=org.apache.commons.lang.StringUtils.lastIndexOfAny("Hi!                                   A",strArray2);
    org.junit.Assert.assertNotNull(strArray2);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test227() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test227#1918");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test227");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.split("                                                    ","...                          ...");
    org.junit.Assert.assertNotNull(strArray2);
  }
  @Test public void test228() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test228#1926");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test228");
    boolean boolean1=org.apache.commons.lang.math.NumberUtils.isNumber("##Aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test229() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test229#1934");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test229");
    int int2=org.apache.commons.lang.StringUtils.getLevenshteinDistance("aaaaaaaaa ","#########");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 10+ "'",int2 == 10);
  }
  @Test public void test230() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test230#1942");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test230");
    boolean boolean1=org.apache.commons.lang.StringUtils.isBlank("                                                                                                                  HI!");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test231() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test231#1950");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test231");
    try {
      java.math.BigDecimal bigDecimal1=org.apache.commons.lang.math.NumberUtils.createBigDecimal("");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: A blank string is not a valid number");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test232() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test232#1961");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test232");
    try {
      java.lang.Float float1=org.apache.commons.lang.math.NumberUtils.createFloat("a ");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a\"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test233() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test233#1972");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test233");
    java.lang.String str2=org.apache.commons.lang.StringUtils.remove("A!ih",'#');
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "A!ih"+ "'",str2.equals("A!ih"));
  }
  @Test public void test234() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test234#1980");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test234");
    short short3=org.apache.commons.lang.math.NumberUtils.max((short)-1,(short)1,(short)0);
    org.junit.Assert.assertTrue("'" + short3 + "' != '"+ (short)1+ "'",short3 == (short)1);
  }
  @Test public void test235() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test235#1988");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test235");
    java.util.Collection collection0=null;
    java.lang.String str2=org.apache.commons.lang.StringUtils.join(collection0," 4            ");
    org.junit.Assert.assertNull(str2);
  }
  @Test public void test236() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test236#1997");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test236");
    java.lang.String str3=org.apache.commons.lang.StringUtils.rightPad("4444444Hi!",7,"Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!    ");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "4444444Hi!"+ "'",str3.equals("4444444Hi!"));
  }
  @Test public void test237() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test237#2005");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test237");
    java.lang.String str2=org.apache.commons.lang.StringUtils.remove("              ","4444444hi!aaaaaaaaa                                                                                        ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "              "+ "'",str2.equals("              "));
  }
  @Test public void test238() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test238#2013");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test238");
    java.lang.String str1=org.apache.commons.lang.StringUtils.chompLast("Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai"+ "'",str1.equals("Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai"));
  }
  @Test public void test239() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test239#2021");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test239");
    java.lang.String str4=org.apache.commons.lang.StringUtils.overlay("Aa ","hi!",9,(int)(byte)100);
    org.junit.Assert.assertTrue("'" + str4 + "' != '"+ "Aa hi!"+ "'",str4.equals("Aa hi!"));
  }
  @Test public void test240() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test240#2029");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test240");
    java.lang.String str3=org.apache.commons.lang.StringUtils.mid("          #############################################################################",41,0);
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ ""+ "'",str3.equals(""));
  }
  @Test public void test241() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test241#2037");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test241");
    java.lang.String str3=org.apache.commons.lang.StringUtils.substringBetween("hi!","","i!");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "h"+ "'",str3.equals("h"));
  }
  @Test public void test242() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test242#2045");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test242");
    java.lang.String str1=org.apache.commons.lang.StringUtils.reverse("Aaaaaaaaa                          ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "                          aaaaaaaaA"+ "'",str1.equals("                          aaaaaaaaA"));
  }
  @Test public void test243() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test243#2053");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test243");
    int int3=org.apache.commons.lang.StringUtils.indexOf("Hi!   #######################################################################################       A",' ',24);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ 93+ "'",int3 == 93);
  }
  @Test public void test244() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test244#2061");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test244");
    long[] longArray0=null;
    long[] longArray2=new long[]{'#'};
    long[] longArray6=new long[]{97,(-1),' '};
    boolean boolean7=org.apache.commons.lang.math.NumberUtils.equals(longArray2,longArray6);
    long long8=org.apache.commons.lang.math.NumberUtils.min(longArray6);
    boolean boolean9=org.apache.commons.lang.math.NumberUtils.equals(longArray0,longArray6);
    org.junit.Assert.assertNotNull(longArray2);
    org.junit.Assert.assertNotNull(longArray6);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '"+ false+ "'",boolean7 == false);
    org.junit.Assert.assertTrue("'" + long8 + "' != '"+ (-1L)+ "'",long8 == (-1L));
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '"+ false+ "'",boolean9 == false);
  }
  @Test public void test245() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test245#2078");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test245");
    try {
      java.math.BigInteger bigInteger1=org.apache.commons.lang.math.NumberUtils.createBigInteger(" 4            ");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \" 4   \"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test246() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test246#2089");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test246");
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
      double double17=org.apache.commons.lang.math.NumberUtils.min(doubleArray14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
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
  @Test public void test247() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test247#2117");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test247");
    boolean boolean1=org.apache.commons.lang.StringUtils.isNotBlank("4444444Hi!aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test248() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test248#2125");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test248");
    int int2=org.apache.commons.lang.StringUtils.getLevenshteinDistance("                                                                                                 ","                                ");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 65+ "'",int2 == 65);
  }
  @Test public void test249() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test249#2133");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test249");
    int int3=org.apache.commons.lang.StringUtils.indexOf("   aaaaaaaaa                                        ",'4',29);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test250() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test250#2141");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test250");
    double double2=org.apache.commons.lang.math.NumberUtils.toDouble("h",(double)(short)10);
    org.junit.Assert.assertTrue("'" + double2 + "' != '"+ 10.0d+ "'",double2 == 10.0d);
  }
  @Test public void test251() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test251#2149");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test251");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAlphanumeric("                         i!                         ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test252() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test252#2157");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test252");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringBeforeLast("... !ih..","Aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "... !ih.."+ "'",str2.equals("... !ih.."));
  }
  @Test public void test253() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test253#2165");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test253");
    boolean boolean1=org.apache.commons.lang.StringUtils.isWhitespace("                             Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test254() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test254#2173");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test254");
    java.lang.String str4=org.apache.commons.lang.StringUtils.replace("                                          aaaaaaaaa ","###                     aaaaaaaaa                                                                                        "," 4            ",24);
    org.junit.Assert.assertTrue("'" + str4 + "' != '"+ "                                          aaaaaaaaa "+ "'",str4.equals("                                          aaaaaaaaa "));
  }
  @Test public void test255() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test255#2181");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test255");
    java.lang.String str1=org.apache.commons.lang.StringUtils.uncapitalise("                                    aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa                                       hi!                                                 ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "                                    aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa                                       hi!                                                 "+ "'",str1.equals("                                    aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa                                       hi!                                                 "));
  }
  @Test public void test256() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test256#2189");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test256");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.splitPreserveAllTokens("                               "," aaaaaa...");
    org.junit.Assert.assertNotNull(strArray2);
  }
  @Test public void test257() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test257#2197");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test257");
    java.lang.String str1=org.apache.commons.lang.StringUtils.capitalize("                        aaaaaaaaaaaaaaaaaaaa                                                        ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "                        aaaaaaaaaaaaaaaaaaaa                                                        "+ "'",str1.equals("                        aaaaaaaaaaaaaaaaaaaa                                                        "));
  }
  @Test public void test258() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test258#2205");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test258");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringAfterLast("Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai","Hi!   #######################################################################################       A");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test259() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test259#2213");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test259");
    int int1=org.apache.commons.lang.math.NumberUtils.stringToInt("Aa");
    org.junit.Assert.assertTrue("'" + int1 + "' != '"+ 0+ "'",int1 == 0);
  }
  @Test public void test260() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test260#2221");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test260");
    java.lang.String str1=org.apache.commons.lang.StringUtils.capitaliseAllWords("...                          ...");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "...                          ..."+ "'",str1.equals("...                          ..."));
  }
  @Test public void test261() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test261#2229");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test261");
    java.lang.String str2=org.apache.commons.lang.StringUtils.stripStart("aa ","");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "aa "+ "'",str2.equals("aa "));
  }
  @Test public void test262() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test262#2237");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test262");
    java.lang.String str1=org.apache.commons.lang.StringUtils.chopNewline("#########");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "#########"+ "'",str1.equals("#########"));
  }
  @Test public void test263() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test263#2245");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test263");
    java.lang.String[] strArray3=org.apache.commons.lang.StringUtils.split("Aaaaaaaaa ","                                   ");
    java.lang.String[] strArray5=org.apache.commons.lang.StringUtils.stripAll(strArray3,"#######################################################################################");
    int int6=org.apache.commons.lang.StringUtils.lastIndexOfAny("#############################################################################          ",strArray3);
    org.junit.Assert.assertNotNull(strArray3);
    org.junit.Assert.assertNotNull(strArray5);
    org.junit.Assert.assertTrue("'" + int6 + "' != '"+ (-1)+ "'",int6 == (-1));
  }
  @Test public void test264() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test264#2257");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test264");
    byte byte3=org.apache.commons.lang.math.NumberUtils.max((byte)1,(byte)1,(byte)10);
    org.junit.Assert.assertTrue("'" + byte3 + "' != '"+ (byte)10+ "'",byte3 == (byte)10);
  }
  @Test public void test265() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test265#2265");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test265");
    double double2=org.apache.commons.lang.math.NumberUtils.toDouble("   #######################################################################################",(double)47);
    org.junit.Assert.assertTrue("'" + double2 + "' != '"+ 47.0d+ "'",double2 == 47.0d);
  }
  @Test public void test266() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test266#2273");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test266");
    boolean boolean1=org.apache.commons.lang.StringUtils.isBlank("aaaaaaaaai!");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test267() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test267#2281");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test267");
    long long3=org.apache.commons.lang.math.NumberUtils.max((long)32,(long)43,(long)108);
    org.junit.Assert.assertTrue("'" + long3 + "' != '"+ 108L+ "'",long3 == 108L);
  }
  @Test public void test268() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test268#2289");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test268");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringAfterLast("","");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test269() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test269#2297");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test269");
    java.util.Iterator iterator0=null;
    java.lang.String str2=org.apache.commons.lang.StringUtils.join(iterator0,"                             hi!                                   A                             ");
    org.junit.Assert.assertNull(str2);
  }
  @Test public void test270() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test270#2306");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test270");
    java.lang.String str2=org.apache.commons.lang.StringUtils.removeStart("","aaaaaaaaa                                    ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test271() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test271#2314");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test271");
    int int2=org.apache.commons.lang.StringUtils.indexOf("                 ","aaaaaaaaa                                                                                        ");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test272() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test272#2322");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test272");
    java.lang.String[] strArray3=org.apache.commons.lang.StringUtils.split("aaaaaaaaa                                                                                        ","          #############################################################################",97);
    java.lang.String[] strArray5=org.apache.commons.lang.StringUtils.stripAll(strArray3,"Hi!                                   A");
    java.lang.String str9=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray3," aaaaaaaaaaaaaaaaaaaa  aaaaaaaaa ",63,35);
    org.junit.Assert.assertNotNull(strArray3);
    org.junit.Assert.assertNotNull(strArray5);
    org.junit.Assert.assertTrue("'" + str9 + "' != '"+ ""+ "'",str9.equals(""));
  }
  @Test public void test273() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test273#2334");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test273");
    java.lang.String str3=org.apache.commons.lang.StringUtils.leftPad("4444444Hi!",(int)(byte)100,"aaaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!"+ "'",str3.equals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!"));
  }
  @Test public void test274() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test274#2342");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test274");
    java.lang.String str1=org.apache.commons.lang.StringUtils.chopNewline("h");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ ""+ "'",str1.equals(""));
  }
  @Test public void test275() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test275#2350");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test275");
    short short3=org.apache.commons.lang.math.NumberUtils.max((short)0,(short)(byte)-1,(short)10);
    org.junit.Assert.assertTrue("'" + short3 + "' != '"+ (short)10+ "'",short3 == (short)10);
  }
  @Test public void test276() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test276#2358");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test276");
    java.lang.String str1=org.apache.commons.lang.StringUtils.trimToNull("a ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "a"+ "'",str1.equals("a"));
  }
  @Test public void test277() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test277#2366");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test277");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringBefore("   #######################################################################################","          ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "   #######################################################################################"+ "'",str2.equals("   #######################################################################################"));
  }
  @Test public void test278() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test278#2374");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test278");
    java.lang.String str2=org.apache.commons.lang.StringUtils.prechomp("                                                hi!                                                 ","                                            aaaaaaaaa i!                                            ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                                                hi!                                                 "+ "'",str2.equals("                                                hi!                                                 "));
  }
  @Test public void test279() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test279#2382");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test279");
    int int2=org.apache.commons.lang.math.NumberUtils.compare(0.0f,(float)'#');
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test280() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test280#2390");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test280");
    int int2=org.apache.commons.lang.math.NumberUtils.compare((double)94,(double)(byte)1);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 1+ "'",int2 == 1);
  }
  @Test public void test281() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test281#2398");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test281");
    int int2=org.apache.commons.lang.StringUtils.indexOfAny("###                     aaaaaaaaa","");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test282() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test282#2406");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test282");
    boolean boolean1=org.apache.commons.lang.math.NumberUtils.isDigits("4444444Hi!aaaaaaaaa                                                                                        ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test283() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test283#2414");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test283");
    boolean boolean1=org.apache.commons.lang.StringUtils.isWhitespace("Hi!   #######################################################################################       A");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test284() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test284#2422");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test284");
    java.lang.String str3=org.apache.commons.lang.StringUtils.replace("","AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa","aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ ""+ "'",str3.equals(""));
  }
  @Test public void test285() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test285#2430");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test285");
    long long3=org.apache.commons.lang.math.NumberUtils.max(0L,(long)108,(long)9);
    org.junit.Assert.assertTrue("'" + long3 + "' != '"+ 108L+ "'",long3 == 108L);
  }
  @Test public void test286() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test286#2438");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test286");
    java.util.Iterator iterator0=null;
    java.lang.String str2=org.apache.commons.lang.StringUtils.join(iterator0," ");
    org.junit.Assert.assertNull(str2);
  }
  @Test public void test287() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test287#2447");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test287");
    java.lang.String str1=org.apache.commons.lang.StringUtils.chopNewline("                                                                                              !iH");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "                                                                                              !iH"+ "'",str1.equals("                                                                                              !iH"));
  }
  @Test public void test288() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test288#2455");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test288");
    java.lang.String str4=org.apache.commons.lang.StringUtils.overlay("hi!","                        AAAAAAAAAAAAAAAAAAAA                                                        ",(int)(short)1,(-1));
    org.junit.Assert.assertTrue("'" + str4 + "' != '"+ "                        AAAAAAAAAAAAAAAAAAAA                                                        i!"+ "'",str4.equals("                        AAAAAAAAAAAAAAAAAAAA                                                        i!"));
  }
  @Test public void test289() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test289#2463");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test289");
    java.lang.String str3=org.apache.commons.lang.StringUtils.center("aaaaaaaaa                                    ",104,"");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "                             aaaaaaaaa                                                                  "+ "'",str3.equals("                             aaaaaaaaa                                                                  "));
  }
  @Test public void test290() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test290#2471");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test290");
    java.lang.String str3=org.apache.commons.lang.StringUtils.getNestedString("#######################################################################################             "," aaaaaa","aaaaaaaaa                                    ");
    org.junit.Assert.assertNull(str3);
  }
  @Test public void test291() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test291#2479");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test291");
    int int3=org.apache.commons.lang.StringUtils.indexOf("AAAAAAAAA ",' ',(int)(byte)10);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test292() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test292#2487");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test292");
    java.lang.String str2=org.apache.commons.lang.StringUtils.leftPad("                                   ",96);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                                                                                                "+ "'",str2.equals("                                                                                                "));
  }
  @Test public void test293() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test293#2495");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test293");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringBetween("... !ih...","");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test294() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test294#2503");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test294");
    java.lang.String str1=org.apache.commons.lang.StringUtils.capitalise("###                                                                                       aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "###                                                                                       aaaaaaaaa "+ "'",str1.equals("###                                                                                       aaaaaaaaa "));
  }
  @Test public void test295() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test295#2511");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test295");
    boolean boolean1=org.apache.commons.lang.math.NumberUtils.isNumber("iaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaA");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test296() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test296#2519");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test296");
    int int2=org.apache.commons.lang.StringUtils.indexOfDifference("                                              hi","                          AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa                          ");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 26+ "'",int2 == 26);
  }
  @Test public void test297() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test297#2527");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test297");
    boolean boolean1=org.apache.commons.lang.StringUtils.isNotEmpty("           4            ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test298() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test298#2535");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test298");
    boolean boolean1=org.apache.commons.lang.StringUtils.isNotBlank("                                                                                       aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test299() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test299#2543");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test299");
    java.lang.String str1=org.apache.commons.lang.StringUtils.chopNewline("aaaaaaaaai!");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "aaaaaaaaai!"+ "'",str1.equals("aaaaaaaaai!"));
  }
  @Test public void test300() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test300#2551");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test300");
    java.lang.String str1=org.apache.commons.lang.StringUtils.deleteWhitespace("Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaai"+ "'",str1.equals("AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaai"));
  }
  @Test public void test301() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test301#2559");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test301");
    java.lang.String str2=org.apache.commons.lang.StringUtils.reverseDelimited("Aaaaaaaaa",' ');
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "Aaaaaaaaa"+ "'",str2.equals("Aaaaaaaaa"));
  }
  @Test public void test302() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test302#2567");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test302");
    java.lang.String str2=org.apache.commons.lang.StringUtils.getPrechomp("Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!","hi!                         ...");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test303() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test303#2575");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test303");
    boolean boolean1=org.apache.commons.lang.StringUtils.isWhitespace("##Aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test304() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test304#2583");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test304");
    java.lang.String str1=org.apache.commons.lang.StringUtils.strip("                                                                                       Aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "Aaaaaaaaa"+ "'",str1.equals("Aaaaaaaaa"));
  }
  @Test public void test305() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test305#2591");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test305");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAlphanumeric("              ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test306() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test306#2599");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test306");
    java.util.Collection collection0=null;
    java.lang.String str2=org.apache.commons.lang.StringUtils.join(collection0,"aa ");
    org.junit.Assert.assertNull(str2);
  }
  @Test public void test307() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test307#2608");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test307");
    java.lang.String str2=org.apache.commons.lang.StringUtils.left("                             hi!                                   A                             ",(int)(short)-1);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test308() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test308#2616");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test308");
    int int3=org.apache.commons.lang.StringUtils.ordinalIndexOf("aaaaaaaaa i!","aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa",32);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test309() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test309#2624");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test309");
    java.lang.String str2=org.apache.commons.lang.StringUtils.stripStart(" aaaaaaaaa","AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ " aaaaaaaaa"+ "'",str2.equals(" aaaaaaaaa"));
  }
  @Test public void test310() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test310#2632");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test310");
    int int3=org.apache.commons.lang.StringUtils.ordinalIndexOf("                                                                                       aaaaaaaaa ","aaaaaaaaai!",(int)'a');
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test311() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test311#2640");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test311");
    int int3=org.apache.commons.lang.StringUtils.lastIndexOf("   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",' ',97);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ 2+ "'",int3 == 2);
  }
  @Test public void test312() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test312#2648");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test312");
    java.lang.String str3=org.apache.commons.lang.StringUtils.rightPad("                             hi!                                   A                             ",20,'a');
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "                             hi!                                   A                             "+ "'",str3.equals("                             hi!                                   A                             "));
  }
  @Test public void test313() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test313#2656");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test313");
    java.lang.String str1=org.apache.commons.lang.StringUtils.deleteSpaces("i!");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "i!"+ "'",str1.equals("i!"));
  }
  @Test public void test314() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test314#2664");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test314");
    java.lang.String str2=org.apache.commons.lang.StringUtils.abbreviate("...                          ...",(int)(byte)100);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "...                          ..."+ "'",str2.equals("...                          ..."));
  }
  @Test public void test315() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test315#2672");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test315");
    java.lang.String str1=org.apache.commons.lang.StringUtils.trim("hi!");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "hi!"+ "'",str1.equals("hi!"));
  }
  @Test public void test316() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test316#2680");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test316");
    java.lang.String str1=org.apache.commons.lang.StringUtils.strip("AAAAAAAAA ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "AAAAAAAAA"+ "'",str1.equals("AAAAAAAAA"));
  }
  @Test public void test317() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test317#2688");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test317");
    java.lang.String str2=org.apache.commons.lang.StringUtils.remove("aaaaaaaaa                                        ",' ');
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "aaaaaaaaa"+ "'",str2.equals("aaaaaaaaa"));
  }
  @Test public void test318() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test318#2696");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test318");
    java.lang.String str1=org.apache.commons.lang.StringUtils.chop("Hi!                                                                                              ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "Hi!                                                                                             "+ "'",str1.equals("Hi!                                                                                             "));
  }
  @Test public void test319() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test319#2704");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test319");
    int int2=org.apache.commons.lang.StringUtils.countMatches("","#########");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 0+ "'",int2 == 0);
  }
  @Test public void test320() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test320#2712");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test320");
    boolean boolean1=org.apache.commons.lang.StringUtils.isBlank("4444444Hi!aaaaaaaaa                                                                                        ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test321() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test321#2720");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test321");
    java.lang.String[] strArray3=org.apache.commons.lang.StringUtils.split("444444444444444444444444444444444444444444444          444444444444444444444444444444444444444444444","                                                    ",0);
    java.lang.String[] strArray5=org.apache.commons.lang.StringUtils.stripAll(strArray3,"AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaai");
    org.junit.Assert.assertNotNull(strArray3);
    org.junit.Assert.assertNotNull(strArray5);
  }
  @Test public void test322() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test322#2730");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test322");
    java.lang.String str1=org.apache.commons.lang.StringUtils.chopNewline("                                                                                                    ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "                                                                                                    "+ "'",str1.equals("                                                                                                    "));
  }
  @Test public void test323() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test323#2738");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test323");
    int int3=org.apache.commons.lang.StringUtils.indexOf("Hi!                                                                                             ","4444444Hi!",0);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test324() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test324#2746");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test324");
    java.lang.String[] strArray3=org.apache.commons.lang.StringUtils.splitByWholeSeparator("                                              hi!","a                                                HI!",0);
    java.lang.String str5=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray3,"");
    org.junit.Assert.assertNotNull(strArray3);
    org.junit.Assert.assertTrue("'" + str5 + "' != '"+ "                                              hi!"+ "'",str5.equals("                                              hi!"));
  }
  @Test public void test325() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test325#2756");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test325");
    int int3=org.apache.commons.lang.StringUtils.ordinalIndexOf(" aaaaaa...","Hi!   #######################################################################################       A",7);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test326() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test326#2764");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test326");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.splitPreserveAllTokens("hi!","#######################################################################################          ");
    java.lang.String str6=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray2,'4',52,24);
    java.lang.Class<?> wildcardClass7=strArray2.getClass();
    java.lang.String str8=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray2);
    org.junit.Assert.assertNotNull(strArray2);
    org.junit.Assert.assertTrue("'" + str6 + "' != '"+ ""+ "'",str6.equals(""));
    org.junit.Assert.assertNotNull(wildcardClass7);
    org.junit.Assert.assertTrue("'" + str8 + "' != '"+ "hi!"+ "'",str8.equals("hi!"));
  }
  @Test public void test327() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test327#2778");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test327");
    int int3=org.apache.commons.lang.StringUtils.indexOf("                                                                                       aaaaaaaaa ",'a',100);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test328() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test328#2786");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test328");
    java.lang.String str1=org.apache.commons.lang.StringUtils.upperCase("AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaai!");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAI!"+ "'",str1.equals("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAI!"));
  }
  @Test public void test329() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test329#2794");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test329");
    int int3=org.apache.commons.lang.StringUtils.lastIndexOf("                             Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!","",(int)'4');
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ 52+ "'",int3 == 52);
  }
  @Test public void test330() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test330#2802");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test330");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAlphanumericSpace("                                                                                              !iH");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test331() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test331#2810");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test331");
    java.lang.String str2=org.apache.commons.lang.StringUtils.strip("                                                 !ih                                                "," 4            ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "!ih"+ "'",str2.equals("!ih"));
  }
  @Test public void test332() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test332#2818");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test332");
    java.lang.String str1=org.apache.commons.lang.StringUtils.swapCase("                                    aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa                                       hi!                                                 ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "                                    AAAAAAAAAAAAAAAAAAAA  aAAAAAAAA                                       HI!                                                 "+ "'",str1.equals("                                    AAAAAAAAAAAAAAAAAAAA  aAAAAAAAA                                       HI!                                                 "));
  }
  @Test public void test333() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test333#2826");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test333");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.splitPreserveAllTokens("IaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA",'#');
    org.junit.Assert.assertNotNull(strArray2);
  }
  @Test public void test334() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test334#2834");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test334");
    boolean boolean1=org.apache.commons.lang.StringUtils.isNumericSpace("aaaaaaaaaaaaaaaaaaaa##Aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test335() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test335#2842");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test335");
    java.lang.String str2=org.apache.commons.lang.StringUtils.right("4444444Hi!",(int)(byte)-1);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test336() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test336#2850");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test336");
    java.lang.String str3=org.apache.commons.lang.StringUtils.substringBetween("A!ih","h","");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ ""+ "'",str3.equals(""));
  }
  @Test public void test337() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test337#2858");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test337");
    java.lang.String[] strArray3=org.apache.commons.lang.StringUtils.splitByWholeSeparator("##A","Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai",41);
    org.junit.Assert.assertNotNull(strArray3);
  }
  @Test public void test338() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test338#2866");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test338");
    java.lang.String str1=org.apache.commons.lang.StringUtils.strip("                                    AAAAAAAAAAAAAAAAAAAA  aAAAAAAAA                                       HI!                                                 ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "AAAAAAAAAAAAAAAAAAAA  aAAAAAAAA                                       HI!"+ "'",str1.equals("AAAAAAAAAAAAAAAAAAAA  aAAAAAAAA                                       HI!"));
  }
  @Test public void test339() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test339#2874");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test339");
    long long3=org.apache.commons.lang.math.NumberUtils.min((long)(byte)100,0L,(long)10);
    org.junit.Assert.assertTrue("'" + long3 + "' != '"+ 0L+ "'",long3 == 0L);
  }
  @Test public void test340() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test340#2882");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test340");
    boolean boolean2=org.apache.commons.lang.StringUtils.equalsIgnoreCase("","hi!A");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test341() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test341#2890");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test341");
    java.lang.String str2=org.apache.commons.lang.StringUtils.prechomp("#############################################################################","A!ih");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "#############################################################################"+ "'",str2.equals("#############################################################################"));
  }
  @Test public void test342() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test342#2898");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test342");
    double double3=org.apache.commons.lang.math.NumberUtils.max((double)43,(double)108L,(double)29);
    org.junit.Assert.assertTrue("'" + double3 + "' != '"+ 108.0d+ "'",double3 == 108.0d);
  }
  @Test public void test343() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test343#2906");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test343");
    java.lang.String str1=org.apache.commons.lang.StringUtils.swapCase("                                                                                              !iH");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "                                                                                              !Ih"+ "'",str1.equals("                                                                                              !Ih"));
  }
  @Test public void test344() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test344#2914");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test344");
    java.lang.String str1=org.apache.commons.lang.StringUtils.clean("                                                    ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ ""+ "'",str1.equals(""));
  }
  @Test public void test345() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test345#2922");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test345");
    java.lang.String str2=org.apache.commons.lang.StringUtils.repeat("a ",(int)'4');
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a "+ "'",str2.equals("a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a "));
  }
  @Test public void test346() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test346#2930");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test346");
    java.lang.String str1=org.apache.commons.lang.StringUtils.stripToEmpty("A                                                hi!");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "A                                                hi!"+ "'",str1.equals("A                                                hi!"));
  }
  @Test public void test347() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test347#2938");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test347");
    java.lang.String str3=org.apache.commons.lang.StringUtils.leftPad("!ih",(int)(short)10,"##A");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "##A##A#!ih"+ "'",str3.equals("##A##A#!ih"));
  }
  @Test public void test348() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test348#2946");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test348");
    int int3=org.apache.commons.lang.StringUtils.indexOf("##A##A#!ih",'#',4);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ 4+ "'",int3 == 4);
  }
  @Test public void test349() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test349#2954");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test349");
    float float3=org.apache.commons.lang.math.NumberUtils.min((float)100,(float)41,(float)108L);
    org.junit.Assert.assertTrue("'" + float3 + "' != '"+ 41.0f+ "'",float3 == 41.0f);
  }
  @Test public void test350() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test350#2962");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test350");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringAfter("#######################################################################################","aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test351() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test351#2970");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test351");
    java.lang.String[] strArray4=org.apache.commons.lang.StringUtils.split("","hi!",(int)(byte)100);
    java.lang.String str5=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray4);
    java.lang.String[] strArray7=org.apache.commons.lang.StringUtils.stripAll(strArray4,"                                   ");
    int int8=org.apache.commons.lang.StringUtils.indexOfAny("",strArray7);
    java.lang.String str10=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray7,'4');
    org.junit.Assert.assertNotNull(strArray4);
    org.junit.Assert.assertTrue("'" + str5 + "' != '"+ ""+ "'",str5.equals(""));
    org.junit.Assert.assertNotNull(strArray7);
    org.junit.Assert.assertTrue("'" + int8 + "' != '"+ (-1)+ "'",int8 == (-1));
    org.junit.Assert.assertTrue("'" + str10 + "' != '"+ ""+ "'",str10.equals(""));
  }
  @Test public void test352() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test352#2986");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test352");
    int int2=org.apache.commons.lang.StringUtils.indexOf(" a                                                                                       "," ");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 0+ "'",int2 == 0);
  }
  @Test public void test353() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test353#2994");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test353");
    try {
      java.lang.Float float1=org.apache.commons.lang.math.NumberUtils.createFloat("aaaaaaaaa                                                                                        ");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaaaaaaa\"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test354() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test354#3005");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test354");
    java.lang.String str3=org.apache.commons.lang.StringUtils.rightPad("                                            aaaaaaaaa i!                                            ",100,' ');
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "                                            aaaaaaaaa i!                                            "+ "'",str3.equals("                                            aaaaaaaaa i!                                            "));
  }
  @Test public void test355() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test355#3013");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test355");
    java.lang.Object[] objArray0=null;
    java.lang.String str4=org.apache.commons.lang.StringUtils.join(objArray0,'a',(int)' ',43);
    org.junit.Assert.assertNull(str4);
  }
  @Test public void test356() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test356#3022");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test356");
    java.lang.String str3=org.apache.commons.lang.StringUtils.getNestedString("#######################################################################################             ","...                          ...","");
    org.junit.Assert.assertNull(str3);
  }
  @Test public void test357() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test357#3030");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test357");
    java.lang.String str3=org.apache.commons.lang.StringUtils.replaceChars("                        AAAAAAAAAAAAAAAAAAAA                                                        i!",' ','#');
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "########################AAAAAAAAAAAAAAAAAAAA########################################################i!"+ "'",str3.equals("########################AAAAAAAAAAAAAAAAAAAA########################################################i!"));
  }
  @Test public void test358() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test358#3038");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test358");
    java.lang.String str2=org.apache.commons.lang.StringUtils.defaultIfEmpty("","Hi!                                                                                              ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "Hi!                                                                                              "+ "'",str2.equals("Hi!                                                                                              "));
  }
  @Test public void test359() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test359#3046");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test359");
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
    double double45=org.apache.commons.lang.math.NumberUtils.min(doubleArray31);
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
    org.junit.Assert.assertTrue("'" + double45 + "' != '"+ (-1.0d)+ "'",double45 == (-1.0d));
  }
  @Test public void test360() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test360#3103");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test360");
    long long3=org.apache.commons.lang.math.NumberUtils.max((-1L),(long)88,0L);
    org.junit.Assert.assertTrue("'" + long3 + "' != '"+ 88L+ "'",long3 == 88L);
  }
  @Test public void test361() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test361#3111");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test361");
    java.lang.String str1=org.apache.commons.lang.StringUtils.capitaliseAllWords("aaaaaaaaaaaaaaaaaaaaAaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "AaaaaaaaaaaaaaaaaaaaAaaaaaaaa"+ "'",str1.equals("AaaaaaaaaaaaaaaaaaaaAaaaaaaaa"));
  }
  @Test public void test362() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test362#3119");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test362");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringBetween("","                                   ");
    org.junit.Assert.assertNull(str2);
  }
  @Test public void test363() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test363#3127");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test363");
    int int3=org.apache.commons.lang.math.NumberUtils.min(3,(-1),52);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test364() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test364#3135");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test364");
    try {
      java.lang.Integer int1=org.apache.commons.lang.math.NumberUtils.createInteger("AAAAAAAAAAAAAAAAAAAA  aAAAAAAAA                                       HI!");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"AAAAAAAAAAAAAAAAAAAA  aAAAAAAAA                                       HI!\"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test365() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test365#3146");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test365");
    java.lang.String str3=org.apache.commons.lang.StringUtils.replaceChars("Hi!                                   A",' ','#');
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "Hi!###################################A"+ "'",str3.equals("Hi!###################################A"));
  }
  @Test public void test366() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test366#3154");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test366");
    java.lang.String str1=org.apache.commons.lang.StringUtils.deleteSpaces("                             aaaaaaaaa                                                                  ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "aaaaaaaaa"+ "'",str1.equals("aaaaaaaaa"));
  }
  @Test public void test367() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test367#3162");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test367");
    java.lang.String str2=org.apache.commons.lang.StringUtils.removeEnd("aaaaaaaaaaaaaaaaaaaaAaaaaaaaa","");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "aaaaaaaaaaaaaaaaaaaaAaaaaaaaa"+ "'",str2.equals("aaaaaaaaaaaaaaaaaaaaAaaaaaaaa"));
  }
  @Test public void test368() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test368#3170");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test368");
    int int3=org.apache.commons.lang.StringUtils.lastIndexOf("aaaaaaaaaaaaaaaaaaaa##Aaaaaaaaa",'#',(int)'4');
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ 21+ "'",int3 == 21);
  }
  @Test public void test369() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test369#3178");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test369");
    int int2=org.apache.commons.lang.StringUtils.lastIndexOf("#######################################################################################             ","aaaaaaaaa                                        ");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test370() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test370#3186");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test370");
    short[] shortArray0=null;
    short[] shortArray4=new short[]{(short)-1,(short)1,(short)0};
    short short5=org.apache.commons.lang.math.NumberUtils.max(shortArray4);
    short[] shortArray8=new short[]{(byte)10,(byte)-1};
    short short9=org.apache.commons.lang.math.NumberUtils.max(shortArray8);
    short[] shortArray12=new short[]{(byte)1,(byte)1};
    boolean boolean13=org.apache.commons.lang.math.NumberUtils.equals(shortArray8,shortArray12);
    short[] shortArray16=new short[]{(byte)10,(byte)-1};
    short short17=org.apache.commons.lang.math.NumberUtils.max(shortArray16);
    short[] shortArray20=new short[]{(byte)1,(byte)1};
    boolean boolean21=org.apache.commons.lang.math.NumberUtils.equals(shortArray16,shortArray20);
    short short22=org.apache.commons.lang.math.NumberUtils.min(shortArray16);
    short short23=org.apache.commons.lang.math.NumberUtils.max(shortArray16);
    boolean boolean24=org.apache.commons.lang.math.NumberUtils.equals(shortArray8,shortArray16);
    boolean boolean25=org.apache.commons.lang.math.NumberUtils.equals(shortArray4,shortArray16);
    boolean boolean26=org.apache.commons.lang.math.NumberUtils.equals(shortArray0,shortArray16);
    org.junit.Assert.assertNotNull(shortArray4);
    org.junit.Assert.assertTrue("'" + short5 + "' != '"+ (short)1+ "'",short5 == (short)1);
    org.junit.Assert.assertNotNull(shortArray8);
    org.junit.Assert.assertTrue("'" + short9 + "' != '"+ (short)10+ "'",short9 == (short)10);
    org.junit.Assert.assertNotNull(shortArray12);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '"+ false+ "'",boolean13 == false);
    org.junit.Assert.assertNotNull(shortArray16);
    org.junit.Assert.assertTrue("'" + short17 + "' != '"+ (short)10+ "'",short17 == (short)10);
    org.junit.Assert.assertNotNull(shortArray20);
    org.junit.Assert.assertTrue("'" + boolean21 + "' != '"+ false+ "'",boolean21 == false);
    org.junit.Assert.assertTrue("'" + short22 + "' != '"+ (short)-1+ "'",short22 == (short)-1);
    org.junit.Assert.assertTrue("'" + short23 + "' != '"+ (short)10+ "'",short23 == (short)10);
    org.junit.Assert.assertTrue("'" + boolean24 + "' != '"+ true+ "'",boolean24 == true);
    org.junit.Assert.assertTrue("'" + boolean25 + "' != '"+ false+ "'",boolean25 == false);
    org.junit.Assert.assertTrue("'" + boolean26 + "' != '"+ false+ "'",boolean26 == false);
  }
  @Test public void test371() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test371#3223");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test371");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAlpha("###                     aaaaaaaaa                                                                                        ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test372() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test372#3231");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test372");
    java.lang.String str3=org.apache.commons.lang.StringUtils.replaceChars("                                                                                                 ##A","","i!");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "                                                                                                 ##A"+ "'",str3.equals("                                                                                                 ##A"));
  }
  @Test public void test373() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test373#3239");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test373");
    int int3=org.apache.commons.lang.math.NumberUtils.min(0,93,0);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ 0+ "'",int3 == 0);
  }
  @Test public void test374() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test374#3247");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test374");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.split("                                                 !ih                                                ",' ');
    org.junit.Assert.assertNotNull(strArray2);
  }
  @Test public void test375() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test375#3255");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test375");
    try {
      java.math.BigDecimal bigDecimal1=org.apache.commons.lang.math.NumberUtils.createBigDecimal("Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!    ");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test376() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test376#3266");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test376");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringBefore("aaaaaaaaaaaaaaaaaaaa##Aaaaaaaaa","                                                 !ih                                                ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "aaaaaaaaaaaaaaaaaaaa##Aaaaaaaaa"+ "'",str2.equals("aaaaaaaaaaaaaaaaaaaa##Aaaaaaaaa"));
  }
  @Test public void test377() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test377#3274");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test377");
    java.lang.String str1=org.apache.commons.lang.StringUtils.chomp("Aa");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "Aa"+ "'",str1.equals("Aa"));
  }
  @Test public void test378() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test378#3282");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test378");
    java.lang.String str1=org.apache.commons.lang.StringUtils.stripToNull("  ");
    org.junit.Assert.assertNull(str1);
  }
  @Test public void test379() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test379#3290");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test379");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringBefore("aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa","");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test380() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test380#3298");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test380");
    short short3=org.apache.commons.lang.math.NumberUtils.max((short)(byte)1,(short)(byte)10,(short)100);
    org.junit.Assert.assertTrue("'" + short3 + "' != '"+ (short)100+ "'",short3 == (short)100);
  }
  @Test public void test381() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test381#3306");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test381");
    int int3=org.apache.commons.lang.StringUtils.lastIndexOf("h","                                ",(int)'a');
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test382() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test382#3314");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test382");
    int int2=org.apache.commons.lang.StringUtils.indexOfAny("Aa ","aaaaaaaaaaaaaaaaaaaa                                ");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 1+ "'",int2 == 1);
  }
  @Test public void test383() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test383#3322");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test383");
    int int2=org.apache.commons.lang.math.NumberUtils.toInt(" aaaaaa",31);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 31+ "'",int2 == 31);
  }
  @Test public void test384() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test384#3330");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test384");
    java.lang.String str3=org.apache.commons.lang.StringUtils.substringBetween("###                     aaaaaaaaa                                                                                        ","                                                                                                 ##a","aaaaaaaaa                                        ");
    org.junit.Assert.assertNull(str3);
  }
  @Test public void test385() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test385#3338");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test385");
    boolean boolean2=org.apache.commons.lang.StringUtils.containsOnly("                        AAAAAAAAAAAAAAAAAAAA                                                        i!","iaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test386() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test386#3346");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test386");
    int int1=org.apache.commons.lang.math.NumberUtils.toInt("                   ");
    org.junit.Assert.assertTrue("'" + int1 + "' != '"+ 0+ "'",int1 == 0);
  }
  @Test public void test387() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test387#3354");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test387");
    java.lang.String str2=org.apache.commons.lang.StringUtils.repeat("                        AAAAAAAAAAAAAAAAAAAA                                                        i!",(int)(short)1);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                        AAAAAAAAAAAAAAAAAAAA                                                        i!"+ "'",str2.equals("                        AAAAAAAAAAAAAAAAAAAA                                                        i!"));
  }
  @Test public void test388() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test388#3362");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test388");
    boolean boolean1=org.apache.commons.lang.math.NumberUtils.isDigits("a");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test389() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test389#3370");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test389");
    java.lang.String str2=org.apache.commons.lang.StringUtils.abbreviate("AAAAAAAAAAAAAAAAAAAA  aAAAAAAAA                                       HI!",4);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "A..."+ "'",str2.equals("A..."));
  }
  @Test public void test390() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test390#3378");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test390");
    int int3=org.apache.commons.lang.StringUtils.lastIndexOf("",'4',(int)(short)0);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test391() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test391#3386");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test391");
    float float2=org.apache.commons.lang.math.NumberUtils.toFloat("iaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaA",(float)0L);
    org.junit.Assert.assertTrue("'" + float2 + "' != '"+ 0.0f+ "'",float2 == 0.0f);
  }
  @Test public void test392() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test392#3394");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test392");
    java.lang.String str3=org.apache.commons.lang.StringUtils.getNestedString("           4            ","4444444444444444444444444444444444                                4444444444444444444444444444444444","                                                                                                 ##a");
    org.junit.Assert.assertNull(str3);
  }
  @Test public void test393() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test393#3402");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test393");
    int int2=org.apache.commons.lang.StringUtils.indexOfAnyBut("                                              hi","                             hi!                                   A                             ");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test394() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test394#3410");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test394");
    java.lang.String str2=org.apache.commons.lang.StringUtils.reverseDelimitedString("                   ","aaaaaaaaaaaaaaaaaaaa##Aaaaaaaa");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                   "+ "'",str2.equals("                   "));
  }
  @Test public void test395() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test395#3418");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test395");
    java.lang.String str1=org.apache.commons.lang.StringUtils.stripToEmpty("... !ih...");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "... !ih..."+ "'",str1.equals("... !ih..."));
  }
  @Test public void test396() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test396#3426");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test396");
    int int3=org.apache.commons.lang.StringUtils.indexOf("                        AAAAAAAAAAAAAAAAAAAA                                                        ","",88);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ 88+ "'",int3 == 88);
  }
  @Test public void test397() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test397#3434");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test397");
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
    boolean boolean22=org.apache.commons.lang.math.NumberUtils.equals(byteArray0,byteArray16);
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
    org.junit.Assert.assertTrue("'" + boolean22 + "' != '"+ false+ "'",boolean22 == false);
  }
  @Test public void test398() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test398#3464");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test398");
    java.lang.String str2=org.apache.commons.lang.StringUtils.defaultIfEmpty("4444444hI!AAAAAAAAA                                                                                        ","                                                hi!                                                 ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "4444444hI!AAAAAAAAA                                                                                        "+ "'",str2.equals("4444444hI!AAAAAAAAA                                                                                        "));
  }
  @Test public void test399() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test399#3472");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test399");
    java.lang.String str1=org.apache.commons.lang.StringUtils.capitalize("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAI!");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAI!"+ "'",str1.equals("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAI!"));
  }
  @Test public void test400() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test400#3480");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test400");
    int int2=org.apache.commons.lang.StringUtils.indexOfDifference("                             hi!                                   A                             ","Aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 0+ "'",int2 == 0);
  }
  @Test public void test401() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test401#3488");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test401");
    long long3=org.apache.commons.lang.math.NumberUtils.min((long)(byte)0,(long)1,0L);
    org.junit.Assert.assertTrue("'" + long3 + "' != '"+ 0L+ "'",long3 == 0L);
  }
  @Test public void test402() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test402#3496");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test402");
    double double1=org.apache.commons.lang.math.NumberUtils.toDouble("Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!    ");
    org.junit.Assert.assertTrue("'" + double1 + "' != '"+ 0.0d+ "'",double1 == 0.0d);
  }
  @Test public void test403() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test403#3504");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test403");
    int int2=org.apache.commons.lang.StringUtils.lastIndexOf("","                                   ");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test404() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test404#3512");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test404");
    java.lang.String str3=org.apache.commons.lang.StringUtils.replaceChars("Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai",'#',' ');
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai"+ "'",str3.equals("Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai"));
  }
  @Test public void test405() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test405#3520");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test405");
    java.lang.String str1=org.apache.commons.lang.StringUtils.strip("a                                                HI!");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "a                                                HI!"+ "'",str1.equals("a                                                HI!"));
  }
  @Test public void test406() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test406#3528");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test406");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringBefore("                                                                                       aaaaaaaaa ","...                          ...");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                                                                                       aaaaaaaaa "+ "'",str2.equals("                                                                                       aaaaaaaaa "));
  }
  @Test public void test407() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test407#3536");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test407");
    java.lang.String str3=org.apache.commons.lang.StringUtils.rightPad("h",88,"#################...");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "h#################...#################...#################...#################...#######"+ "'",str3.equals("h#################...#################...#################...#################...#######"));
  }
  @Test public void test408() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test408#3544");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test408");
    java.lang.String[] strArray3=org.apache.commons.lang.StringUtils.splitPreserveAllTokens("                        aaaaaaaaaaaaaaaaaaaa                                                        ","4",(int)(short)-1);
    java.lang.String str4=org.apache.commons.lang.StringUtils.concatenate((java.lang.Object[])strArray3);
    org.junit.Assert.assertNotNull(strArray3);
    org.junit.Assert.assertTrue("'" + str4 + "' != '"+ "                        aaaaaaaaaaaaaaaaaaaa                                                        "+ "'",str4.equals("                        aaaaaaaaaaaaaaaaaaaa                                                        "));
  }
  @Test public void test409() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test409#3554");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test409");
    java.lang.String str2=org.apache.commons.lang.StringUtils.prechomp("          #############################################################################","Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "          #############################################################################"+ "'",str2.equals("          #############################################################################"));
  }
  @Test public void test410() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test410#3562");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test410");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAlpha("          aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test411() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test411#3570");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test411");
    java.lang.String str2=org.apache.commons.lang.StringUtils.remove("... !ih...aaaaaaaaaaaaaaaaaaaa                                ",'a');
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "... !ih...                                "+ "'",str2.equals("... !ih...                                "));
  }
  @Test public void test412() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test412#3578");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test412");
    boolean boolean1=org.apache.commons.lang.math.NumberUtils.isDigits(" 4            ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test413() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test413#3586");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test413");
    int int2=org.apache.commons.lang.StringUtils.lastIndexOf("aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa ","Aaaaaaaaa                          ");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test414() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test414#3594");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test414");
    java.lang.String str3=org.apache.commons.lang.StringUtils.mid("HHHHHHHHHH",35,0);
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ ""+ "'",str3.equals(""));
  }
  @Test public void test415() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test415#3602");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test415");
    java.lang.String str1=org.apache.commons.lang.StringUtils.upperCase("                                                                                   aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "                                                                                   AAAAAAAAA "+ "'",str1.equals("                                                                                   AAAAAAAAA "));
  }
  @Test public void test416() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test416#3610");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test416");
    java.lang.String str2=org.apache.commons.lang.StringUtils.getPrechomp("aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa ","AaaaaaaaaaaaaaaaaaaaAaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test417() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test417#3618");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test417");
    char[] charArray9=new char[]{'a','4',' ','4','#'};
    int int10=org.apache.commons.lang.StringUtils.indexOfAnyBut("hi!",charArray9);
    int int11=org.apache.commons.lang.StringUtils.indexOfAnyBut("                                ",charArray9);
    int int12=org.apache.commons.lang.StringUtils.indexOfAnyBut("",charArray9);
    int int13=org.apache.commons.lang.StringUtils.indexOfAnyBut("#############################################################################          ",charArray9);
    org.junit.Assert.assertNotNull(charArray9);
    org.junit.Assert.assertTrue("'" + int10 + "' != '"+ 0+ "'",int10 == 0);
    org.junit.Assert.assertTrue("'" + int11 + "' != '"+ (-1)+ "'",int11 == (-1));
    org.junit.Assert.assertTrue("'" + int12 + "' != '"+ (-1)+ "'",int12 == (-1));
    org.junit.Assert.assertTrue("'" + int13 + "' != '"+ (-1)+ "'",int13 == (-1));
  }
  @Test public void test418() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test418#3634");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test418");
    boolean boolean1=org.apache.commons.lang.StringUtils.isNumericSpace("AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test419() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test419#3642");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test419");
    java.lang.String str2=org.apache.commons.lang.StringUtils.removeEnd("                                                                                   aaaaaaaaa ","                        AAAAAAAAAAAAAAAAAAAA                                                        ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                                                                                   aaaaaaaaa "+ "'",str2.equals("                                                                                   aaaaaaaaa "));
  }
  @Test public void test420() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test420#3650");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test420");
    java.lang.String str1=org.apache.commons.lang.StringUtils.trimToEmpty("A                                                hi!");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "A                                                hi!"+ "'",str1.equals("A                                                hi!"));
  }
  @Test public void test421() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test421#3658");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test421");
    java.lang.String str2=org.apache.commons.lang.StringUtils.stripStart("a ","#######################################################################################             ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "a "+ "'",str2.equals("a "));
  }
  @Test public void test422() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test422#3666");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test422");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.splitPreserveAllTokens("HHHHHHHHHH","iaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaA");
    java.lang.String[] strArray4=org.apache.commons.lang.StringUtils.stripAll(strArray2,"");
    org.junit.Assert.assertNotNull(strArray2);
    org.junit.Assert.assertNotNull(strArray4);
  }
  @Test public void test423() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test423#3676");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test423");
    java.lang.String[] strArray3=org.apache.commons.lang.StringUtils.split("","hi!",(int)(byte)100);
    java.lang.String[] strArray4=org.apache.commons.lang.StringUtils.stripAll(strArray3);
    java.lang.String[] strArray5=org.apache.commons.lang.StringUtils.stripAll(strArray3);
    java.lang.Class<?> wildcardClass6=strArray3.getClass();
    org.junit.Assert.assertNotNull(strArray3);
    org.junit.Assert.assertNotNull(strArray4);
    org.junit.Assert.assertNotNull(strArray5);
    org.junit.Assert.assertNotNull(wildcardClass6);
  }
  @Test public void test424() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test424#3690");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test424");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.splitByWholeSeparator("a","aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    org.junit.Assert.assertNotNull(strArray2);
  }
  @Test public void test425() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test425#3698");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test425");
    java.lang.String str3=org.apache.commons.lang.StringUtils.substringBetween("                                                                                   AAAAAAAAA ","a ","aaaaaaaaaaaaaaaaaaaa                                ");
    org.junit.Assert.assertNull(str3);
  }
  @Test public void test426() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test426#3706");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test426");
    java.lang.String str3=org.apache.commons.lang.StringUtils.getNestedString("A!ih","          aaaaaaaaa ","");
    org.junit.Assert.assertNull(str3);
  }
  @Test public void test427() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test427#3714");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test427");
    java.lang.String str1=org.apache.commons.lang.StringUtils.reverse("                                                                                                 ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "                                                                                                 "+ "'",str1.equals("                                                                                                 "));
  }
  @Test public void test428() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test428#3722");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test428");
    java.util.Collection collection0=null;
    java.lang.String str2=org.apache.commons.lang.StringUtils.join(collection0,"          #############################################################################");
    org.junit.Assert.assertNull(str2);
  }
  @Test public void test429() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test429#3731");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test429");
    java.lang.String str1=org.apache.commons.lang.StringUtils.capitalize("##Aaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "##Aaaaaaaaa"+ "'",str1.equals("##Aaaaaaaaa"));
  }
  @Test public void test430() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test430#3739");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test430");
    java.lang.String str2=org.apache.commons.lang.StringUtils.center("a",(int)(byte)10);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "    a     "+ "'",str2.equals("    a     "));
  }
  @Test public void test431() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test431#3747");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test431");
    try {
      java.math.BigInteger bigInteger1=org.apache.commons.lang.math.NumberUtils.createBigInteger(" aaaaaaaaaaaaaaaaaaaa  aaaaaaaaa ");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \" aaaaa\"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test432() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test432#3758");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test432");
    int int1=org.apache.commons.lang.math.NumberUtils.toInt("4444444Hi!");
    org.junit.Assert.assertTrue("'" + int1 + "' != '"+ 0+ "'",int1 == 0);
  }
  @Test public void test433() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test433#3766");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test433");
    boolean boolean2=org.apache.commons.lang.StringUtils.equalsIgnoreCase("AaaaaaaaaaaaaaaaaaaaAaaaaaaaa","Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!    ");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test434() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test434#3774");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test434");
    int int2=org.apache.commons.lang.StringUtils.indexOfAny("###                     aaaaaaaaa                                                                                        ","4444444444444444444444444444444444                                4444444444444444444444444444444444");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 3+ "'",int2 == 3);
  }
  @Test public void test435() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test435#3782");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test435");
    java.lang.String str3=org.apache.commons.lang.StringUtils.leftPad("##Aaaaaaaaa",1,' ');
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "##Aaaaaaaaa"+ "'",str3.equals("##Aaaaaaaaa"));
  }
  @Test public void test436() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test436#3790");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test436");
    double double3=org.apache.commons.lang.math.NumberUtils.min(0.0d,0.0d,0.0d);
    org.junit.Assert.assertTrue("'" + double3 + "' != '"+ 0.0d+ "'",double3 == 0.0d);
  }
  @Test public void test437() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test437#3798");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test437");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAlphanumeric("AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test438() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test438#3806");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test438");
    java.lang.String[] strArray3=org.apache.commons.lang.StringUtils.splitPreserveAllTokens("                                                                                                    ","AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAI!",(int)(byte)100);
    org.junit.Assert.assertNotNull(strArray3);
  }
  @Test public void test439() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test439#3814");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test439");
    int int2=org.apache.commons.lang.StringUtils.indexOf("aaaaaaaaaaaaaaaaaaaa                                ",'4');
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test440() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test440#3822");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test440");
    float float1=org.apache.commons.lang.math.NumberUtils.toFloat("#############################################################################");
    org.junit.Assert.assertTrue("'" + float1 + "' != '"+ 0.0f+ "'",float1 == 0.0f);
  }
  @Test public void test441() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test441#3830");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test441");
    long long1=org.apache.commons.lang.math.NumberUtils.toLong("A");
    org.junit.Assert.assertTrue("'" + long1 + "' != '"+ 0L+ "'",long1 == 0L);
  }
  @Test public void test442() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test442#3838");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test442");
    java.lang.String str3=org.apache.commons.lang.StringUtils.getNestedString("          ","","a ");
    org.junit.Assert.assertNull(str3);
  }
  @Test public void test443() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test443#3846");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test443");
    try {
      java.lang.String str3=org.apache.commons.lang.StringUtils.abbreviate("aaaaaaaaaaaaaaaaaaaa",26,0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
    }
 catch (    java.lang.IllegalArgumentException e) {
    }
  }
  @Test public void test444() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test444#3857");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test444");
    java.lang.String str1=org.apache.commons.lang.StringUtils.chopNewline("Hi!###################################A");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "Hi!###################################A"+ "'",str1.equals("Hi!###################################A"));
  }
  @Test public void test445() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test445#3865");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test445");
    double double2=org.apache.commons.lang.math.NumberUtils.toDouble("4444444444444444444444444444444444                                4444444444444444444444444444444444",(double)100L);
    org.junit.Assert.assertTrue("'" + double2 + "' != '"+ 100.0d+ "'",double2 == 100.0d);
  }
  @Test public void test446() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test446#3873");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test446");
    java.lang.String[] strArray3=org.apache.commons.lang.StringUtils.split("","hi!",(int)(byte)100);
    java.lang.String str4=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray3);
    java.lang.String str8=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray3,"                                                                                                                  HI!",35,(-1));
    try {
      java.lang.String str12=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray3,'#',(int)(short)1,36);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
    }
 catch (    java.lang.ArrayIndexOutOfBoundsException e) {
    }
    org.junit.Assert.assertNotNull(strArray3);
    org.junit.Assert.assertTrue("'" + str4 + "' != '"+ ""+ "'",str4.equals(""));
    org.junit.Assert.assertTrue("'" + str8 + "' != '"+ ""+ "'",str8.equals(""));
  }
  @Test public void test447() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test447#3890");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test447");
    boolean boolean1=org.apache.commons.lang.StringUtils.isNumericSpace("########################AAAAAAAAAAAAAAAAAAAA########################################################i!");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test448() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test448#3898");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test448");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAlphanumeric("hi!A");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test449() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test449#3906");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test449");
    java.lang.String str1=org.apache.commons.lang.StringUtils.stripToEmpty("AAAAAAAAA");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "AAAAAAAAA"+ "'",str1.equals("AAAAAAAAA"));
  }
  @Test public void test450() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test450#3914");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test450");
    double double1=org.apache.commons.lang.math.NumberUtils.toDouble("aaaaaaaaa                                    ");
    org.junit.Assert.assertTrue("'" + double1 + "' != '"+ 0.0d+ "'",double1 == 0.0d);
  }
  @Test public void test451() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test451#3922");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test451");
    boolean boolean2=org.apache.commons.lang.StringUtils.equals("#######################################################################################          ","... !ih...aaaaaaaaaaaaaaaaaaaa                                ");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test452() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test452#3930");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test452");
    boolean boolean2=org.apache.commons.lang.StringUtils.containsIgnoreCase("","#################...");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test453() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test453#3938");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test453");
    short short3=org.apache.commons.lang.math.NumberUtils.max((short)1,(short)(byte)100,(short)(byte)1);
    org.junit.Assert.assertTrue("'" + short3 + "' != '"+ (short)100+ "'",short3 == (short)100);
  }
  @Test public void test454() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test454#3946");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test454");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringAfter("aaaaaaaaai!","Aa hi!");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test455() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test455#3954");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test455");
    boolean boolean1=org.apache.commons.lang.StringUtils.isWhitespace("aaaaaaaaa                                    ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test456() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test456#3962");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test456");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.split("444444444444444444444444444444444444444444444          44444444444444444444444444444444444444444444",'#');
    org.junit.Assert.assertNotNull(strArray2);
  }
  @Test public void test457() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test457#3970");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test457");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.splitPreserveAllTokens(" ",' ');
    java.lang.String str4=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray2,'a');
    org.junit.Assert.assertNotNull(strArray2);
    org.junit.Assert.assertTrue("'" + str4 + "' != '"+ "a"+ "'",str4.equals("a"));
  }
  @Test public void test458() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test458#3980");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test458");
    try {
      java.math.BigInteger bigInteger1=org.apache.commons.lang.math.NumberUtils.createBigInteger("iaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaA");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"iaaaaaaaA\"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test459() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test459#3991");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test459");
    java.lang.String str3=org.apache.commons.lang.StringUtils.center("##A##A#!ih",4,"");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "##A##A#!ih"+ "'",str3.equals("##A##A#!ih"));
  }
  @Test public void test460() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test460#3999");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test460");
    float float3=org.apache.commons.lang.math.NumberUtils.max((-1.0f),(float)41,48.0f);
    org.junit.Assert.assertTrue("'" + float3 + "' != '"+ 48.0f+ "'",float3 == 48.0f);
  }
  @Test public void test461() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test461#4007");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test461");
    java.lang.String str2=org.apache.commons.lang.StringUtils.removeEnd("                        AAAAAAAAAAAAAAAAAAAA                                                        i!","aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "                        AAAAAAAAAAAAAAAAAAAA                                                        i!"+ "'",str2.equals("                        AAAAAAAAAAAAAAAAAAAA                                                        i!"));
  }
  @Test public void test462() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test462#4015");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test462");
    java.lang.String str1=org.apache.commons.lang.StringUtils.deleteSpaces("aaaaaaaaa                                    ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "aaaaaaaaa"+ "'",str1.equals("aaaaaaaaa"));
  }
  @Test public void test463() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test463#4023");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test463");
    java.lang.String[] strArray1=org.apache.commons.lang.StringUtils.split("aaaaaaaaa                                    ");
    java.lang.String str2=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray1);
    org.junit.Assert.assertNotNull(strArray1);
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "aaaaaaaaa"+ "'",str2.equals("aaaaaaaaa"));
  }
  @Test public void test464() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test464#4033");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test464");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringAfter("h","                                              hi");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test465() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test465#4041");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test465");
    java.lang.String str1=org.apache.commons.lang.StringUtils.trimToNull("aaaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "aaaaaaaaaa"+ "'",str1.equals("aaaaaaaaaa"));
  }
  @Test public void test466() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test466#4049");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test466");
    java.lang.String str2=org.apache.commons.lang.StringUtils.prechomp("aaaaaaaaa                                        ","AaaaaaaaaaaaaaaaaaaaAaaaaaaaa");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "aaaaaaaaa                                        "+ "'",str2.equals("aaaaaaaaa                                        "));
  }
  @Test public void test467() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test467#4057");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test467");
    boolean boolean2=org.apache.commons.lang.StringUtils.contains("","                                                                                                 ");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test468() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test468#4065");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test468");
    int int3=org.apache.commons.lang.math.NumberUtils.max(29,41,(int)(byte)100);
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ 100+ "'",int3 == 100);
  }
  @Test public void test469() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test469#4073");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test469");
    java.lang.String[] strArray2=org.apache.commons.lang.StringUtils.splitPreserveAllTokens("          ",'a');
    java.lang.String str3=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray2);
    java.lang.String str4=org.apache.commons.lang.StringUtils.concatenate((java.lang.Object[])strArray2);
    try {
      java.lang.String str8=org.apache.commons.lang.StringUtils.join((java.lang.Object[])strArray2,"                                                                                                    ",20,35);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 20");
    }
 catch (    java.lang.ArrayIndexOutOfBoundsException e) {
    }
    org.junit.Assert.assertNotNull(strArray2);
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "          "+ "'",str3.equals("          "));
    org.junit.Assert.assertTrue("'" + str4 + "' != '"+ "          "+ "'",str4.equals("          "));
  }
  @Test public void test470() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test470#4090");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test470");
    try {
      java.math.BigInteger bigInteger1=org.apache.commons.lang.math.NumberUtils.createBigInteger("   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \" \"");
    }
 catch (    java.lang.NumberFormatException e) {
    }
  }
  @Test public void test471() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test471#4101");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test471");
    short short3=org.apache.commons.lang.math.NumberUtils.min((short)(byte)100,(short)(byte)0,(short)0);
    org.junit.Assert.assertTrue("'" + short3 + "' != '"+ (short)0+ "'",short3 == (short)0);
  }
  @Test public void test472() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test472#4109");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test472");
    java.lang.String str2=org.apache.commons.lang.StringUtils.strip("AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa","                                                                                                ");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa"+ "'",str2.equals("AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa"));
  }
  @Test public void test473() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test473#4117");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test473");
    int int3=org.apache.commons.lang.StringUtils.lastIndexOf("                               ",'4',(-1));
    org.junit.Assert.assertTrue("'" + int3 + "' != '"+ (-1)+ "'",int3 == (-1));
  }
  @Test public void test474() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test474#4125");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test474");
    short short3=org.apache.commons.lang.math.NumberUtils.min((short)(byte)10,(short)0,(short)(byte)100);
    org.junit.Assert.assertTrue("'" + short3 + "' != '"+ (short)0+ "'",short3 == (short)0);
  }
  @Test public void test475() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test475#4133");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test475");
    byte byte3=org.apache.commons.lang.math.NumberUtils.min((byte)-1,(byte)100,(byte)10);
    org.junit.Assert.assertTrue("'" + byte3 + "' != '"+ (byte)-1+ "'",byte3 == (byte)-1);
  }
  @Test public void test476() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test476#4141");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test476");
    java.lang.String str1=org.apache.commons.lang.StringUtils.trim(" 4            ");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "4"+ "'",str1.equals("4"));
  }
  @Test public void test477() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test477#4149");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test477");
    int int2=org.apache.commons.lang.math.NumberUtils.toInt("aaaaaaaaaaaaaaaaaaaa##Aaaaaaaaa",43);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 43+ "'",int2 == 43);
  }
  @Test public void test478() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test478#4157");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test478");
    boolean boolean2=org.apache.commons.lang.StringUtils.contains("4444444444444444444444444444444444                                4444444444444444444444444444444444","                                                                                                         HI!");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test479() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test479#4165");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test479");
    int int2=org.apache.commons.lang.StringUtils.indexOf("","a                                                HI!                                                 ");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test480() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test480#4173");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test480");
    int int1=org.apache.commons.lang.math.NumberUtils.toInt("   aaaaaaaaa                                        ");
    org.junit.Assert.assertTrue("'" + int1 + "' != '"+ 0+ "'",int1 == 0);
  }
  @Test public void test481() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test481#4181");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test481");
    boolean boolean1=org.apache.commons.lang.StringUtils.isAlphanumericSpace("      ...");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test482() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test482#4189");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test482");
    boolean boolean1=org.apache.commons.lang.StringUtils.isNotEmpty("4444444Hi!");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ true+ "'",boolean1 == true);
  }
  @Test public void test483() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test483#4197");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test483");
    java.lang.String str2=org.apache.commons.lang.StringUtils.substringAfter("aaaaaaaaaaaaaaaaaaaa                                ","!iaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ ""+ "'",str2.equals(""));
  }
  @Test public void test484() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test484#4205");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test484");
    float[] floatArray1=new float[]{(byte)1};
    float float2=org.apache.commons.lang.math.NumberUtils.max(floatArray1);
    float[] floatArray6=new float[]{(byte)-1,(-1.0f),(byte)100};
    float float7=org.apache.commons.lang.math.NumberUtils.max(floatArray6);
    boolean boolean8=org.apache.commons.lang.math.NumberUtils.equals(floatArray1,floatArray6);
    float float9=org.apache.commons.lang.math.NumberUtils.max(floatArray6);
    float float10=org.apache.commons.lang.math.NumberUtils.max(floatArray6);
    float float11=org.apache.commons.lang.math.NumberUtils.max(floatArray6);
    org.junit.Assert.assertNotNull(floatArray1);
    org.junit.Assert.assertTrue("'" + float2 + "' != '"+ 1.0f+ "'",float2 == 1.0f);
    org.junit.Assert.assertNotNull(floatArray6);
    org.junit.Assert.assertTrue("'" + float7 + "' != '"+ 100.0f+ "'",float7 == 100.0f);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '"+ false+ "'",boolean8 == false);
    org.junit.Assert.assertTrue("'" + float9 + "' != '"+ 100.0f+ "'",float9 == 100.0f);
    org.junit.Assert.assertTrue("'" + float10 + "' != '"+ 100.0f+ "'",float10 == 100.0f);
    org.junit.Assert.assertTrue("'" + float11 + "' != '"+ 100.0f+ "'",float11 == 100.0f);
  }
  @Test public void test485() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test485#4227");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test485");
    boolean boolean1=org.apache.commons.lang.math.NumberUtils.isDigits("");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test486() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test486#4235");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test486");
    boolean boolean1=org.apache.commons.lang.math.NumberUtils.isDigits("   #######################################################################################");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test487() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test487#4243");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test487");
    java.lang.String str2=org.apache.commons.lang.StringUtils.getNestedString("   aaaaaaaaa                                        ","                                    AAAAAAAAAAAAAAAAAAAA  aAAAAAAAA                                       HI!                                                 ");
    org.junit.Assert.assertNull(str2);
  }
  @Test public void test488() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test488#4251");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test488");
    double double3=org.apache.commons.lang.math.NumberUtils.max((double)100.0f,24.0d,32.0d);
    org.junit.Assert.assertTrue("'" + double3 + "' != '"+ 100.0d+ "'",double3 == 100.0d);
  }
  @Test public void test489() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test489#4259");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test489");
    java.lang.String str1=org.apache.commons.lang.StringUtils.trim("...                          ...");
    org.junit.Assert.assertTrue("'" + str1 + "' != '"+ "...                          ..."+ "'",str1.equals("...                          ..."));
  }
  @Test public void test490() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test490#4267");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test490");
    int int2=org.apache.commons.lang.math.NumberUtils.compare((float)0L,(float)(short)-1);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 1+ "'",int2 == 1);
  }
  @Test public void test491() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test491#4275");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test491");
    boolean boolean2=org.apache.commons.lang.StringUtils.containsNone("                                   ","                                                hi!                                                 ");
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '"+ false+ "'",boolean2 == false);
  }
  @Test public void test492() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test492#4283");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test492");
    int int2=org.apache.commons.lang.StringUtils.indexOfAnyBut("aaaaaaaaa i!","          aaaaaaaaa ");
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 10+ "'",int2 == 10);
  }
  @Test public void test493() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test493#4291");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test493");
    int int2=org.apache.commons.lang.StringUtils.indexOf("                                                                                                 ",'4');
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
  @Test public void test494() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test494#4299");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test494");
    java.lang.String str3=org.apache.commons.lang.StringUtils.replace("444444444444444444444444444444444444444444444          44444444444444444444444444444444444444444444","aaaaaaaaaaaaaaaaaaaa##Aaaaaaaa","");
    org.junit.Assert.assertTrue("'" + str3 + "' != '"+ "444444444444444444444444444444444444444444444          44444444444444444444444444444444444444444444"+ "'",str3.equals("444444444444444444444444444444444444444444444          44444444444444444444444444444444444444444444"));
  }
  @Test public void test495() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test495#4307");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test495");
    java.lang.String str2=org.apache.commons.lang.StringUtils.removeEnd("hi!A","");
    org.junit.Assert.assertTrue("'" + str2 + "' != '"+ "hi!A"+ "'",str2.equals("hi!A"));
  }
  @Test public void test496() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test496#4315");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test496");
    boolean boolean1=org.apache.commons.lang.StringUtils.isBlank("Hi!                                                                                             ");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '"+ false+ "'",boolean1 == false);
  }
  @Test public void test497() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test497#4323");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test497");
    long long3=org.apache.commons.lang.math.NumberUtils.min((long)'4',(long)43,35L);
    org.junit.Assert.assertTrue("'" + long3 + "' != '"+ 35L+ "'",long3 == 35L);
  }
  @Test public void test498() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test498#4331");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test498");
    long long2=org.apache.commons.lang.math.NumberUtils.toLong("                                                                                              !iH",0L);
    org.junit.Assert.assertTrue("'" + long2 + "' != '"+ 0L+ "'",long2 == 0L);
  }
  @Test public void test499() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test499#4339");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test499");
    int int2=org.apache.commons.lang.math.NumberUtils.compare((double)10,(double)10L);
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ 0+ "'",int2 == 0);
  }
  @Test public void test500() throws Throwable {
    auxiliary.Dumper.write("/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/result/randoop/testSet/Lang58b_Patch26/fixed",this,"\n.RegressionTest3::test500#4347");
    if (debug)     System.out.format("%n%s%n","RegressionTest3.test500");
    int int2=org.apache.commons.lang.StringUtils.indexOf("aaaaaaaaa                                                                                        ",'4');
    org.junit.Assert.assertTrue("'" + int2 + "' != '"+ (-1)+ "'",int2 == (-1));
  }
}
