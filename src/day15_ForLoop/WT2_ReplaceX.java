package day15_ForLoop;

public class WT2_ReplaceX {

    public static void main(String[] args) {

        String str = "xcodeX";

        String result = str.replace("x", "a").replace("X", "a");

        System.out.println(result);

    }

}
/*
	2. Write a program that asks user to enter a word. and replace all the x or X with character a
                    Input:
                        xcodeX
                    Output:
                        acodea
*/