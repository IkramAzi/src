package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueCharacters {

    public static void main(String[] args) {

        String str = "aaabcccdeeef";
        String [] arr = str.split("");

        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr)); // converts Strings to the Array list.

        System.out.println("list = " + list);
        String unique = "";

        for (String each : list) {
            int frequency = Collections.frequency(list,each); // finds frequency of each Characters
        if (frequency == 1){
            unique+= each;
        }
        }

        System.out.println("unique = " + unique);
    }
}
