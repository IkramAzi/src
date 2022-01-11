package day15_ForLoop;

public class Alphabet {

    public static void main(String[] args) {

        for (char i = 'a'; i <= 'z'; i++) {
            System.out.print(i+" ");
        }
        System.out.println();

        for (char i = 65; i <= 90 ; i++) {
            System.out.print(i+" ");
        }
        System.out.println();

        System.out.println("_____________________________________");

        for (char i = 'Z'; i >= 'A'; i--) {
            System.out.print(i+" ");

        }
    }
}
