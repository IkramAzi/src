package day09_IfStatements;

public class MinNumber {
    public static void main(String[] args) {


        int n1 = 100;
        int n2 = 200;

        boolean n3 = n2 > n1 && n1 < n2;

        if (n3){
            System.out.println(n1+ " is the minimum number");
        }
        if (!n3){
            System.out.println(n2+ " is the minimum number");
        }
    }
}
