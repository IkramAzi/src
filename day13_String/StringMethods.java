package day13_String;

public class StringMethods {
    public static void main(String[] args) {

        String word = "Cydeo";

        char thirdChar = word.charAt(3);
        System.out.println("thirdChar = " + thirdChar);

        /*
        char tenthChar = word.charAt(9);
        System.out.println("tenthChar = " + tenthChar);
         */

        System.out.println("__________________________________");

        String s1 = "Batch 25 is the best batch";

        int count = s1.length();

        System.out.println("count = " + count);

        char lastChar = s1.charAt(s1.length()-1);
        System.out.println("lastChar = " + lastChar);


        String str = "wooden spoon";

        String upper = str.toUpperCase();
        String lower = str.toLowerCase();

        System.out.println(upper);
        System.out.println(lower);

        String s = "JAVA";
        s=s.toLowerCase();
        System.out.println("s = " + s);



    }
}
