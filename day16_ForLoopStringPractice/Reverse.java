package day16_ForLoopStringPractice;

public class Reverse {

    public static void main(String[] args) {

        String str = "Wooden Spoon";

        String result = ""; // contain the reserved version of the str

        for (int i = str.length()-1; i >= 0; i--) { // i: index number of str(Starting ;ast index to index 0)
            result += str.charAt(i); // to get each of the character
        }

        //String result = ""; // contain the reserved version of the str

       // result += str.charAt(str.length()-1);

        System.out.println(result);


    }
}
