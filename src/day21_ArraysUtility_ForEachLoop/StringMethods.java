package day21_ArraysUtility_ForEachLoop;

import java.util.Arrays;

public class StringMethods {

    public static void main(String[] args) {

        String str = "Java";
        char[] chars = str.toCharArray();

        System.out.println(Arrays.toString(chars));

        for (char each : chars) {
            System.out.println(each);
        }

        System.out.println("\n-----------------------------------------------------------\n");

        String sentence = "Wooden Spoon";

        String[] words = sentence.split(" ");

        System.out.println(Arrays.toString(words));

        System.out.println("\n-----------------------------------------------------------\n");

        String email = "WoodenSpoon@cydeo.com";

        String[] arr = email.split("@");

        System.out.println(Arrays.toString(arr));

        System.out.println("\n-----------------------------------------------------------\n");

        String s = "Today is nice day. Today is Monday. Today we learn Java";

        String[] sentences = s.split("\\. ");

        System.out.println(Arrays.toString(sentences));

    }

    /*  public static int getDup(String[] arr) {

    String temp ="";

        for (String s : arr) {
            temp += " " + s;
        }

        for (String s : arr) {
            if (temp.indexOf(s) == temp.lastIndexOf(s)) {
                temp = temp.replace((" "+s), "");
            }
        }

        temp = temp.trim();
        String [] arr2 = temp.split(" ");
        return arr2.length;
  }

*/

    public static int getDup(String[] arr) {

        int countEach = 0, totalCount = 0;
        String duplicates = "";

        for (String each : arr) {
            countEach = 0;
            for (String element : arr) {
                if (each.equals(element)) {
                    countEach++;
                }
            }

            if (countEach != 1 && !duplicates.contains(each)) {
                duplicates += each;
                totalCount += countEach;

            }
        }

        return totalCount;

    }

}
