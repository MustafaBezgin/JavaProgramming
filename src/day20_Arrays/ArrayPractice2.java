package day20_Arrays;

import java.util.Arrays;

public class ArrayPractice2 {

    public static void main(String[] args) {

        char[] letters = new char[26];
        /*
        letters[0] = 'A';
        letters[1] = 'B';
        letter[2] = 'C';
        ....
         */

        /*
        for (int i = 0, j = 'A'; i < letters.length ; i++, j++ ) { //i: index numbers 0 ~ last index
            letters[i] = (char)j ;
        }
         */

        char ch = 'A';
        for (int i = 0; i < letters.length; i++, ch++) {
            letters[i] = ch;
        }

        System.out.println(Arrays.toString(letters));  //[A~Z]


        System.out.println("\n-----------------------------------------------------------\n");


        char[] letters2 = new char[26];

        char ch2 = 'Z';
        for (int j = 0; j < letters2.length ; j++, ch2--) {
            letters2[j] = ch2;
        }

        System.out.println(Arrays.toString(letters2));  //[A~Z]

    }

}
