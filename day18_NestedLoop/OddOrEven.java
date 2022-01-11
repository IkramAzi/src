package day18_NestedLoop;

import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a number");
            int num = scan.nextInt();

            if (num % 2 == 0) {
                System.out.println(num + " is even Number");
            } else {
                System.out.println(num + " is odd Number");
            }

            System.out.println("Would you like to enter another Number");
            String a = scan.next().toLowerCase(); // to ignore case sensitivity

            while (!(a.equals("yes") || a.equals("no"))) {
                System.out.println("please re-enter another number");
                a = scan.next().toLowerCase();
            }
                if (a.equals("no")) {
                    break;
                }

            }
        }
    }

