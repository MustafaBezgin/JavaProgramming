package day09_IfStatements;

public class MedianNumber {

    public static void main(String[] args) {

        //SINGLE IF

        int n1 = 10;
        int n2 = 15;
        int n3 = 20;

        // if we have three different numbers, one MUST maximum, one MUST be minimum and one MUST be Median

        boolean median1 = (n2 < n1 && n1 < n3) || (n3 < n1 && n1 < n2);  // n1=15, n2=10, n3=20  OR  n1=15, n3=10, n2=20 etc...
        boolean median2 = (n1 < n2 && n2 < n3) || (n3 < n2 && n2 < n1);  // n2=15, n1=10, n3=20  OR  n2=15, n3=10, n1=20 etc...
        boolean median3 = !median2 && !median1;   // boolean median3 = (n1 < n3 && n3 < n2) || (n2 < n3 && n3 < n1);    // n3=15, n1=10, n2=20  OR  n3=15, n2=10, n1=20 etc...

        /*
            in order for "a" to be the median number:
                    1. if c is the maximum number & b is the minimum number, then "a" is the median number
                    2. if b is the maximum number & c is the minimum number, then "a" is the median number
             */

        if (median1) {

            System.out.println(n1 + " is the median number.");
        }

        if (median2) {

            System.out.println(n2 + " is the median number.");
        }

        if (median3) {

            System.out.println(n3 + " is the median number.");
        }


    }
}

/*
2. Create a class called MedianNumber. write a program that can find the median number between three DIFFERENT given integers
			Ex:
				a = 10, b= 15, c = 20;
			Output:
				15 is the median number
			Possibility #1: a could be median number
			Possibility #2: b could be median number
			Possibility #3: c could be median number
 */