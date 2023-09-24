package day19_LoopPractices;

import java.util.Scanner;

public class T4_IndexOfFirstUniqueChar {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a string: ");
        String str = scan.nextLine();

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i); //'A'
            int count = 0; // represents the frequency of the ch

            for (int j = 0; j < str.length(); j++) { //compares the character that outer loop picked, with each character of the string,
                char each = str.charAt(j); // each character of str
                if(ch == each){
                    count++;
                }
            }

/*
            if(count == 1){ // if the frequency of the character is 1, then the character is unique
                result += ch;
            }
 */
            if(count != 1){
                continue;
            }

            result += ch;

        }

        System.out.println(str.indexOf(result.charAt(0)));

    }

}
