package day04_Variables;

public class SalaryCalculator {

    public static void main(String[] args) {

        // hourlyRate, WeeklyHours

        int hourlyRate = 50;
        int weeklyHours= 40;
        int numbersOfWeek =52;

        int salary = hourlyRate * weeklyHours * numbersOfWeek;
        System.out.println("hourlyRate = $" + hourlyRate);
        System.out.println("weeklyHours = " + weeklyHours);
        System.out.println("salary = $" + salary);
    }
}
