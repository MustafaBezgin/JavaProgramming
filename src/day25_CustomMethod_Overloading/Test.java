package day25_CustomMethod_Overloading;

import utilities.StringUtility;

public class Test {

    public static void main(String[] args) {

        String str = "Java Programming Language";
        StringUtility.printEachChar(str);

        System.out.println("\n-----------------------------------------------------------\n");

        String s1 = "Cydeo School";
        String reverse = StringUtility.reverse(s1);
        System.out.println(reverse);

        System.out.println("\n-----------------------------------------------------------\n");

        String word = "Java";
        boolean palindrome = StringUtility.isPalindrome(word);
        System.out.println("palindrome = " + palindrome);

        System.out.println("\n-----------------------------------------------------------\n");

        String[] names = {"Anna", "Java", "Python", "racecar", "Mom", "Cydeo"};
        int count = 0;

        for (String each : names) {
            if (StringUtility.isPalindrome(each)) {
                count++;
            }
        }

        System.out.println(count);

        System.out.println("\n-----------------------------------------------------------\n");

        String str1 = "asdfgh", str2 = "ahsgdf";
        System.out.println( StringUtility.anagram(str1, str2) );

        System.out.println("\n-----------------------------------------------------------\n");

        String s2 = "aaaaabbbbbbccccddddd";
        String nonDup = StringUtility.removeDuplicates(s2);
        System.out.println(nonDup);


    }

}