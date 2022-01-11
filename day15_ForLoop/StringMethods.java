package day15_ForLoop;

public class StringMethods {

    public static void main(String[] args) {

        String str2 = " Cydeo    ";

        System.out.println(str2.isBlank());

        System.out.println("------------------------------------------");

        String s1 = "CYDEO";
        String s2 = "cydeo";

        System.out.println(s1.equals(s2)); //false
        System.out.println(s1.equalsIgnoreCase(s2));//true

        System.out.println("__________________________________________");

        String sentence = " My favorite programming language is Java";

        boolean hasCSharp = sentence.contains("C#");
        boolean hasJava = sentence.contains("Java");
        boolean hasJava2 = sentence.contains("java");
        boolean hasJava3 = sentence.toLowerCase().contains("java");

        System.out.println("hasCSharp = " + hasCSharp);
        System.out.println("hasJava = " + hasJava);
        System.out.println("hasJava3 = " + hasJava3);
    }
}


