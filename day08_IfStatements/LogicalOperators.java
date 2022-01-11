package day08_IfStatements;

public class LogicalOperators {
    public static void main(String[] args) {

        String name = "Steven";
        int age = 19;
        String citizen = "USA";

        boolean isEligible = age >= 18 && citizen == "UK";

        System.out.println(name+ " is eligible to vote: " +isEligible);


        System.out.println("--------------------------------------------------------");

        String name2 = "Josh";

        int creditScore = 720;
        int age2 = 19;
        int income = 40000;

        boolean isEligible2 = creditScore >= 700 && age2>= 21 && income >= 60000;

        System.out.println(name2+ " is eligible for loan: " +isEligible2);

        System.out.println("___________________________________________________________");

        String name3 = " Shay";

        int age3 = 21;
        char gender = 'F';

        boolean isEligible3 = age3 >= 18 &&  (gender == 'M' || gender == 'F');

        System.out.println(name3+ " Is eligible to register: "+isEligible3);

        System.out.println("------------------------------------------------------");


        String student = "Anna";

        double gpa = 3.5;
        int familyIncome = 100000;

        boolean isEligible5 = gpa >= 3.5 || familyIncome <= 60000;

    }
}
