package day07_Operators;

public class UnaryOperators {

    public static void main(String[] args) {

        // + / - OPERATORS
        int num1 = +25;
        int num2 = -25;

        System.out.println(num1 < 0); // false.
        System.out.println(num2 < 0); //true.



        // INCREMENT/DECREMENT OPERATORS:
        int a = 5;
        ++a; //pre increment: increases the value by 1 immediately.

        System.out.println("\n\n" + a);

        --a; //pre decrement: decreases the value by 1 immediately.

        System.out.println(a); //Az önce arttırmıştık şimdi tekrar azaltıyoruz o yüzden 5 kalıyor. Önceki olmasa 4 olur.

        int b = 100;

        System.out.println("\n\n" + ++b); //pre increment

        int c = 100;

        System.out.println(c++); //post increment: first passes the current value, then increases the value by 1.
        System.out.println(c);

        System.out.println("----------------------------------------------------------");

        int x = 200;

        System.out.println( --x ); //pre decrement

        int y = 200;

        System.out.println( y-- ); //post decrement: first passes the current value, then decreases the value by 1.
        System.out.println(y);

        System.out.println("----------------------------------------------------------");

        int m = 25;
        System.out.println(m++);
        System.out.println(m--);

        /*
        ilk post increament kendisinden sonrakini 1 arttırdı. Sonraki post decreament olsa da hiç olmasa da değeri 26 olacak.
        Post decreament tan sonra gelen yine 25 olacak.
         */

        System.out.println(m);

        System.out.println("----------------------------------------------------------");

        int z = 45;

        System.out.println(++z); //46
        System.out.println(z++); //46
        System.out.println(z); //47


        int q = 30;

        System.out.println("\n\n" + --q); //29
        System.out.println(q--); //29
        System.out.println(q); //28


    }
}
