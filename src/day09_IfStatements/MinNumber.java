package day09_IfStatements;

public class MinNumber {

    public static void main(String[] args) {

        //SINGLE IF

        int n1 = 100,
                n2 = 200;

        boolean n1IsMin = n1 < n2;
        boolean n2IsMin = n1 > n2;
        boolean equal = n1 == n2;

        /*
        Hiç boolean variable ı oluşturmadan direkt if condition ın içine "n1 < n2" vs ifadeleri yazsak da yeterli olur.
         */

        if (n1IsMin) { //if n1 is the minimum number

            System.out.println(n1 + " is minimum number.");
        }

        if (n2IsMin) { //if n2 is the minimum number

            System.out.println(n2 + " is minimum number.");
        }

        if (equal) { //if n1 is equal to n2

            System.out.println(n1 + " is equal to " + n2 + ".");
        }


        //IF & ELSE STATEMENT TASK

        if (n1 < n2) { // if condition bu şekliyle de true/false sonucunu verdiğinden esasen boolean zaruri değil.
            System.out.println(n1 + " is minimum number.");
        } else {
            System.out.println(n2 + " is minimum number.");
        }

    }
}
