package day15_ForLoop;

import java.util.Scanner;

public class MaximumNumber {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int max = -232332432;

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter number 5 times.");
            int num = scan.nextInt();

            if (num > max ){
                max = num;
            }

            System.out.println(max);

        }
    }
}
