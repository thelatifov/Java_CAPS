package Ders;

import java.util.Locale;

public class HomeWork {
    public static void main(String[] args) {
        String text = "Bug fix etməyən, developer olmaz";
//Tapsiriq 1
        System.out.println("Cumle uzunluq: " +text.length());
        System.out.println("ilk herf: "+ text.charAt(0));
        System.out.println("son herf: "+ text.charAt(31));
        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());
        /// ////////////////////////
        //
          //Tapsiriq 2

        String text2 = " Try etməyən, exception alar ";
        System.out.println(text2.length());
        System.out.println(text2.trim());
        System.out.println(text2.substring(0,4));
        System.out.println(text2.substring(25,29));
        /// ///////////
        //Tapsiriq 3
        String text3 ="Səhv etməyən öyrənməz";
        System.out.println(text3.indexOf("S"));
        System.out.println(text3.lastIndexOf("v"));
        /// ///////////////

        //Tapsiriq 4
        String text4 = "Welcome to Java course";
        System.out.println(text4.contains("Java"));
        System.out.println(text4.contains("Python"));
        /// //////////
        //Tapsiriq 5
        String text5 = "homework.java";
        System.out.println(text5.startsWith("home"));
        System.out.println(text5.endsWith(".java"));
        /// ////////////
        //Tapsiriq 6
        String name = "Ruslan ";
        String surname ="Latifov";
        System.out.println(name.concat(" ").concat(surname));
        /// //////////
        //Tapsiriq 7 bu tapsiriqda sual yarandi
        String s1 = "Java";
        String s2 = "Java";
        String s3 = new String("Java");
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));

/// //////////////
        //Tapsiriq 8
        String word = " IntelliJ IDEA ";
        System.out.println(word.trim());
        System.out.println(word.contains("IDEA"));
        System.out.println(word.startsWith("IntelliJ"));
    }
}
