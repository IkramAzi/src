package day01_JavaIntro;


import utilities.StringUtility;

public class Test {
    public static void main(String[] args) {

        String str = "Java";
       String  reverse = StringUtility.reverse(str);
        System.out.println("reverse = " + reverse);
    }
}

