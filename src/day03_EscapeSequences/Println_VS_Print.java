package day03_EscapeSequences;

public class Println_VS_Print {
    public static void main(String[] args) {
        System.out.println("Hello Cydeo!");
        System.out.println("How are you all today?");
        System.out.println("-----------------------------");

        System.out.print("Hello Cydeo!");
        System.out.print("How are you all today?");
        System.out.print("-------------------------------");

        System.out.print("Hello Cydeo!");
        System.out.println("How are you all today?");
        System.out.print("-------------------------------");

        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println("Hello Cydeo!");
        System.out.println("How are you all today?");
        System.out.println("-----------------------------\n");

        System.out.print("Hello Cydeo!");
        System.out.print("How are you all today?");
        System.out.print("-------------------------------\n\n");

        System.out.print("Hello Cydeo!");
        System.out.println("How are you all today?");
        System.out.print("-------------------------------");

        /*
        println(): after printing the last character, appends a new line
        print(): after printing the last character, does not appends  new line
         */
    }



}
