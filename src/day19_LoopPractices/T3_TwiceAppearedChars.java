package day19_LoopPractices;

import java.util.Scanner;

public class T3_TwiceAppearedChars {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a string: ");
        String str = scan.nextLine();

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                char ch2 = str.charAt(j);

                if (ch == ch2) {
                    count++;
                }

                if (count == 2) {
                    if (!result.contains(""+ch)) {
                        result += ch;
                    }
                }

            }

        }

        System.out.println(result);

    }
}

/*
3. Write a program that can display all the characters that appeared twice in the string.
 */