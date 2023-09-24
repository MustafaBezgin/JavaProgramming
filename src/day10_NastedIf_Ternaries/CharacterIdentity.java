package day10_NastedIf_Ternaries;

public class CharacterIdentity {

    public static void main(String[] args) {
        char ch = '/';

        if (ch >= 48 && ch <= 57) {
            System.out.println("Digit");
        } else if ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)) {
            System.out.println("Alphabetic");
        } else {
            System.out.println("Special character");
        }

        /* OR:
          if (ch >= '0' && ch <= '9') {
            result = "Digit Character";
        } else if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            result = "Alphabetic Character";
        } else {
            result = "Special Character";
        }


        System.out.println(result);
         */

        System.out.println("\n--------------------------------------------------------\n");

        // TERNARY VERSION:

        String result = (ch >= 48 && ch <= 57) ? "Digit" : ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)) ? "Alphabetic Character" : "Special Character";

        System.out.println(result);


    }

}

/*
4. Create a class called Character Identity, and write a program that can identify if the given character is a digit or Alphabetic Character(A~Z or a~Z) or a special character
		Ex:
			ch = '@'
		output:
			Special Character
		HINT: You may wanna check out the numbers of the chracters on ASCII table
 */

