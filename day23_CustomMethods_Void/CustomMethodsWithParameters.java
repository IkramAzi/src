package day23_CustomMethods_Void;

public class CustomMethodsWithParameters {
    public static void main(String[] args) {
        oddOrEven(2); // method demands additional information to complete its task
        ageOfPerson(1995);
    }

    // create a function that can check if a number is odd number or even number == oddOrEven()

    public static void oddOrEven(int number){

        if (number% 2 ==0){
            System.out.println(number + " is even number");
        }else {
            System.out.println(number+ " is odd number");
        }

    }


    // create a function that can display the age of the person==> ageOfPerson()
    public static void ageOfPerson(int birthYear){
      int age = 2021 - birthYear;
        System.out.println("Your age is: " +age);

    }

    // create a function that can print all the number between x and y

    public static void printNumbers(int x, int y){

    }

}
