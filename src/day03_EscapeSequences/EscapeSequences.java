package day03_EscapeSequences;

/**
Escape Sequences: MUST be given with double quote.
\n: Starts a new line
\t: Paragraph space (tab)
\\: It prints single backslash
\": Double quote
 */

public class EscapeSequences {
    public static void main(String[] args) {
        System.out.println("Java \nPhyton \nC#");

        System.out.println("----------------------------------");

        System.out.println(" Hello Cydeo! \n How are you all today? \n It's nice to see you all. \n What class do we have next week?");

        //all the escape sequences in java begin with "\".

        System.out.println("----------------------------------");

        System.out.println("\tJava is cool programming language.");

        System.out.println("/ \\"); // In order to print one backward slash, we need to give two backward slash.

        System.out.println("\" ... \"");
        System.out.println("My favorite TV show is \"Game of Thrones\"");

//CT (Ekstra 4 escape sequences)


        System.out.println("HelloWorld\b"); // \b: Bir adım geri gelme anlamına gelir.

        System.out.println("Hello\fWorld"); // \f: String in içine form feed koymak için

        System.out.println("Hello\rWorld"); // \r: String in içindeki cursor ı satır başına alıp insert (print screen tuşu aktifleştiriyor) aktifleştirmek için.

        char mycharacter = '1';
        char mycharacter2 = '\'';

    }
}
