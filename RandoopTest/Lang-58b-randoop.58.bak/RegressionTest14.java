import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest14 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test01");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.stripToEmpty("Hi!");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hi!" + "'", str1.equals("Hi!"));
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test02");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNumericSpace("                                                                                           ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test03");
        double[] doubleArray4 = new double[] { (-1.0f), '#', 1.0f, 35L };
        double[] doubleArray5 = new double[] {};
        boolean boolean6 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray4, doubleArray5);
        double[] doubleArray7 = new double[] {};
        double[] doubleArray12 = new double[] { (-1.0f), '#', 1.0f, 35L };
        double[] doubleArray13 = new double[] {};
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray12, doubleArray13);
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray7, doubleArray13);
        boolean boolean16 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray4, doubleArray7);
        double[] doubleArray21 = new double[] { (-1.0f), '#', 1.0f, 35L };
        double[] doubleArray22 = new double[] {};
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray21, doubleArray22);
        boolean boolean24 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray7, doubleArray21);
        double double25 = org.apache.commons.lang.math.NumberUtils.max(doubleArray21);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 35.0d + "'", double25 == 35.0d);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test04");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) 28, (long) (byte) 100, (-1L));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test05");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.left("", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test06");
        int int2 = org.apache.commons.lang.StringUtils.indexOf("", "                       AAAAAAAAA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeEnd("            hi!            ", "                                                   ");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "            hi!            " + "'", str2.equals("            hi!            "));
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test08");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.split("", "hi!", (int) (byte) 100);
        java.lang.String str4 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray3);
        java.lang.String str5 = org.apache.commons.lang.StringUtils.concatenate((java.lang.Object[]) strArray3);
        java.lang.String str7 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray3, "");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test09");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("                                                      ", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test10");
        try {
            java.lang.Float float1 = org.apache.commons.lang.math.NumberUtils.createFloat("                                                                                              !Ih                                                                                              !Ih                                                                                              !Ih                                                                                              !Ih                                                                                              !Ih                                                                                              !Ih                                                                                              !Ih                                                                                              !Ih                                                                                              !Ih");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"!Ih                                                                                              !Ih                                                                                              !Ih                                                                                              !Ih                                                                                              !Ih                                                                                              !Ih                                                                                              !Ih                                                                                              !Ih                                                                                              !Ih\"");
        } catch (java.lang.NumberFormatException e) {
        }
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test11");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.split("hA         A         A         A         A         A         A         A         A         A       i!##a##a", "i", (int) (short) -1);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test12");
        long long1 = org.apache.commons.lang.math.NumberUtils.toLong("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test13");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("4444444444444444444444444444444444                            ...");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test14");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.repeat("4ahi!", (int) '4');
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4ahi!4ahi!4ahi!4ahi!4ahi!4ahi!4ahi!4ahi!4ahi!4ahi!4ahi!4ahi!4ahi!4ahi!4ahi!4ahi!4ahi!4ahi!4ahi!4ahi!4ahi!4ahi!4ahi!4ahi!4ahi!4ahi!4ahi!4ahi!4ahi!4ahi!4ahi!4ahi!4ahi!4ahi!4ahi!4ahi!4ahi!4ahi!4ahi!4ahi!4ahi!4ahi!4ahi!4ahi!4ahi!4ahi!4ahi!4ahi!4ahi!4ahi!4ahi!4ahi!" + "'", str2.equals("4ahi!4ahi!4ahi!4ahi!4ahi!4ahi!4ahi!4ahi!4ahi!4ahi!4ahi!4ahi!4ahi!4ahi!4ahi!4ahi!4ahi!4ahi!4ahi!4ahi!4ahi!4ahi!4ahi!4ahi!4ahi!4ahi!4ahi!4ahi!4ahi!4ahi!4ahi!4ahi!4ahi!4ahi!4ahi!4ahi!4ahi!4ahi!4ahi!4ahi!4ahi!4ahi!4ahi!4ahi!4ahi!4ahi!4ahi!4ahi!4ahi!4ahi!4ahi!4ahi!"));
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test15");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("", (long) 4);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4L + "'", long2 == 4L);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test16");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test17");
        char[] charArray6 = new char[] {};
        int int7 = org.apache.commons.lang.StringUtils.indexOfAnyBut("", charArray6);
        int int8 = org.apache.commons.lang.StringUtils.indexOfAny("hi!                                   A", charArray6);
        int int9 = org.apache.commons.lang.StringUtils.indexOfAnyBut("a                                                HI!                                                 ", charArray6);
        int int10 = org.apache.commons.lang.StringUtils.indexOfAny("                        AAAAAAAAAAAAAAAAAAAA                                                        i!", charArray6);
        int int11 = org.apache.commons.lang.StringUtils.indexOfAnyBut("Aaaaaaaaa444444444444444444444444444444444444444444444          444444444444444444444444444444444444444444444", charArray6);
        int int12 = org.apache.commons.lang.StringUtils.indexOfAnyBut("                                                                                                 ##a", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test18");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.split("4444444444444444444444444444444444                                4444444444444444444444444444444444", "444444444444444444444444444444444444444444444          444444444444444444444444444444444444444444444");
        java.lang.String str6 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray2, 'a', 96, 13);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test19");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 87, 134.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test20");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 100, (short) (byte) -1, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test21");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.uncapitalize("4444444hi!aaaaaaaaa                        ");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "4444444hi!aaaaaaaaa                        " + "'", str1.equals("4444444hi!aaaaaaaaa                        "));
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test22");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsIgnoreCase("           HI!            ", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test23");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.leftPad("                     4444444Hi!                     ", 47, "");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "                     4444444Hi!                     " + "'", str3.equals("                     4444444Hi!                     "));
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test24");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.capitaliseAllWords("Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai" + "'", str1.equals("Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai"));
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test25");
        boolean boolean2 = org.apache.commons.lang.StringUtils.equalsIgnoreCase("...aaaa", "                                                 !ih                                                ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test26");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBeforeLast("########         A#########", "");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "########         A#########" + "'", str2.equals("########         A#########"));
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test27");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.chompLast("aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa ");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa " + "'", str1.equals("aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa "));
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test28");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test29");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceChars("aaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaa#############################################################aaaaaaaA##aaaaaaaaaaaaaaaaaaaa#############################", "hi!   #######################################################################################       a", "AAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str3.equals("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"));
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test30");
        double[] doubleArray4 = new double[] { (-1.0f), '#', 1.0f, 35L };
        double[] doubleArray5 = new double[] {};
        boolean boolean6 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray4, doubleArray5);
        double[] doubleArray7 = null;
        boolean boolean8 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray5, doubleArray7);
        double[] doubleArray14 = new double[] { (-1.0d), 41, 24.0d, 36, 48L };
        double double15 = org.apache.commons.lang.math.NumberUtils.min(doubleArray14);
        double[] doubleArray20 = new double[] { (-1.0f), '#', 1.0f, 35L };
        double[] doubleArray21 = new double[] {};
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray20, doubleArray21);
        double[] doubleArray27 = new double[] { (-1.0f), '#', 1.0f, 35L };
        double[] doubleArray28 = new double[] {};
        boolean boolean29 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray27, doubleArray28);
        double[] doubleArray34 = new double[] { (-1.0f), '#', 1.0f, 35L };
        double[] doubleArray35 = new double[] {};
        boolean boolean36 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray34, doubleArray35);
        double[] doubleArray37 = null;
        boolean boolean38 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray35, doubleArray37);
        boolean boolean39 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray28, doubleArray37);
        double[] doubleArray44 = new double[] { (-1.0f), '#', 1.0f, 35L };
        double[] doubleArray45 = new double[] {};
        boolean boolean46 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray44, doubleArray45);
        boolean boolean47 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray28, doubleArray44);
        double[] doubleArray48 = null;
        double[] doubleArray53 = new double[] { (-1.0f), '#', 1.0f, 35L };
        double[] doubleArray54 = new double[] {};
        boolean boolean55 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray53, doubleArray54);
        boolean boolean56 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray48, doubleArray54);
        boolean boolean57 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray44, doubleArray48);
        double[] doubleArray62 = new double[] { (-1.0f), '#', 1.0f, 35L };
        double[] doubleArray63 = new double[] {};
        boolean boolean64 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray62, doubleArray63);
        double[] doubleArray65 = new double[] {};
        double[] doubleArray70 = new double[] { (-1.0f), '#', 1.0f, 35L };
        double[] doubleArray71 = new double[] {};
        boolean boolean72 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray70, doubleArray71);
        boolean boolean73 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray65, doubleArray71);
        boolean boolean74 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray62, doubleArray65);
        double double75 = org.apache.commons.lang.math.NumberUtils.max(doubleArray62);
        double[] doubleArray80 = new double[] { (-1.0f), '#', 1.0f, 35L };
        double[] doubleArray81 = new double[] {};
        boolean boolean82 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray80, doubleArray81);
        double[] doubleArray83 = new double[] {};
        double[] doubleArray88 = new double[] { (-1.0f), '#', 1.0f, 35L };
        double[] doubleArray89 = new double[] {};
        boolean boolean90 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray88, doubleArray89);
        boolean boolean91 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray83, doubleArray89);
        boolean boolean92 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray80, doubleArray83);
        boolean boolean93 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray62, doubleArray80);
        boolean boolean94 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray44, doubleArray80);
        boolean boolean95 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray21, doubleArray44);
        boolean boolean96 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray14, doubleArray44);
        boolean boolean97 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray7, doubleArray44);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 35.0d + "'", double75 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertNotNull(doubleArray88);
        org.junit.Assert.assertNotNull(doubleArray89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test31");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsNone("", "    ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test32");
        int int2 = org.apache.commons.lang.StringUtils.indexOfAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "               ...                          ...               ...                          ...               ...                          ...               ...                          ...               ...                          ...               ...                          ...               ...                          ...               ...                          ...               ...                          ...               ...                          ...               ...                          ...               ...                          ...               ...                          ...               ...                          ...               ...                          ...               ...                          ...               ...                          ...               ...                          ...               ...                          ...               ...                          ...               ...                          ...               ...                          ...               ...                          ...               ...                          ...               ...                          ...               ...                          ...               ...                          ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test33");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("aaaaaaaaaaaaaaaaaaaa##Aaaaaaaa", "                                    AAAAAAAAAAAAAAAAAAAA  aAAAAAAAA                                       HI!                                                 ");
        org.junit.Assert.assertNotNull(strArray2);
    }
}

