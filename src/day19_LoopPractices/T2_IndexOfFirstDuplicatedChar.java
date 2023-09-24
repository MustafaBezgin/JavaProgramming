package day19_LoopPractices;

import java.util.Scanner;

public class T2_IndexOfFirstDuplicatedChar {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a string: ");
        String str = scan.nextLine();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                char ch2 = str.charAt(j);

                if (ch == ch2) {
                    count++;
                }

                if (count > 1) {
                    System.out.println(i);
                    System.exit(0);
                }

            }

        }

    }

}

/*
2. Write a program that cna return the index number of the first duplicated character from a string
 */