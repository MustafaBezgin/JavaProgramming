package day12_Scanner;

// import java.util.*; //wild import: import everything from the package.

import java.util.Scanner; // regular import: import one class.

public class ScannerPractice {

    public static void main(String[] args) {

             /*
        new Scanner(System.in).nextInt();
        new Scanner(System.in).nextInt();
        ...                                         Bu şekilde tekrar tekrar yazılarak tanımlanacak olursa hafızadan çok fazla yer harcar. "scan" tanımlanmalı.
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number between 1-7: ");

        int num = scan.nextInt();

        String result = "";

        if (num >= 1 && num <= 7) {
            //7
            //TERNARY

            result = (num == 1)? "Monday" : (num == 2) ? "Tuesday" : (num == 3) ? "Wednesday" : (num == 4) ? "Thursday"
                    : (num == 5) ? "Friday" : (num == 6) ? "Saturday" : "Sunday";

            /*
            Multi-branch if statements ile de yapılabilir.
             */

           /* Switch statement ile de yapılabilir.

           switch (num) {
                case 1:
                    result = "Monday";
                    break;
                case 2:
                    result = "Tuesday";
                    break;
                case 3:
                    result = "Wednesday";
                    break;
                case 4:
                    result = "Thursday";
                    break;
                case 5:
                    result = "Friday";
                    break;
                case 6:
                    result = "Saturday";
                    break;
                default:
                    result = "Sunday";
            } */

        } else {
            result = "Invalid number.";
        }

        System.out.println(result);

        scan.close();


    }
    
}
