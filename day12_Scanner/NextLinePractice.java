package day12_Scanner;

import java.util.Scanner;

public class NextLinePractice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your Age");
        int age = input.nextInt();

        input.nextLine(); // Enter

        System.out.println("Enter you full name");
        String fullName = input.nextLine();

        System.out.println("Enter your GPA");
        double gpa = input.nextDouble();

        input.nextLine();//Enter

        System.out.println("Enter you school name");
        String schoolName = input.nextLine();

        System.out.println("age = " + age);
        System.out.println("fullNamew = " + fullName);
        System.out.println("gpa = " + gpa);
        System.out.println("schoolName = " + schoolName);

        input.close();

    }
}
