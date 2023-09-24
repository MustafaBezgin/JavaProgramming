package day09_IfStatements;

public class MaxNumber {

    public static void main(String[] args) {

        //SINGLE IF

        int n1 = 200,
                n2 = 100;

        boolean n1IsMax = n1 > n2;
        boolean n2IsMax = n2 > n1;
        boolean equal = n1 == n2;

        if (n1IsMax) {
            System.out.println(n1 + " is maximum number.");
        }

        if (n2IsMax) {
            System.out.println(n2 + " is maximum number.");
        }
        if (equal) {
            System.out.println(n1 + " is equal to " + n2 + ".");
        }


        //IF & ELSE STATEMENT TASK

        if (n1 > n2) { // if condition bu şekliyle de true/false sonucunu verdiğinden esasen boolean zaruri değil.
            System.out.println(n1 + " is maximum number.");
        } else {
            System.out.println(n2 + " is maximum number.");
        }
    }
}
