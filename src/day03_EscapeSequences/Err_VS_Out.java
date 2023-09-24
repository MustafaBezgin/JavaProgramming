package day03_EscapeSequences;

public class Err_VS_Out {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println("--------------------------");
        System.err.println("Hello");
        System.err.println("--------------------------");

        // short cut: type "serr" + Enter
        /*
        System.err.println(): used for printing error messages (red color)
        System.out.println(): regular outputs (black color)
         */
    }
}
