package day06_PrimitiveTypeCastings;

public class PrimitiveCastings {

    public static void main(String[] args) {

        //IMPLICIT CASTING
        byte a = 100;
        short b = a;
        //short b = (short)a; Smaller primitives can be directly assigned to larger primitive type.

        int c = b;
        //int c = (int)b;

        long d = c;
        //long = (long)c;

        float e = d;
        double f = e;


        //EXPLICIT CASTING:Larger primitives can NOT be directly assigned to smaller primitive types (need to be cast manually).

        int x = 55;
        short y = (short)x;

        System.out.println(x + " : " + y + "\n\n");

        long j = 1000000;
        short k = (short)j;

        System.out.println(j + " : " + k + "\n\n");

        double l = 2.5;
        float m = (float)l;

        System.out.println(l + " : " + m + "\n\n");

        double n = 10.8;
        int s = (int)n; // The result is 10.

        System.out.println(n + " : " + s + "\n\n");

        //Shortcut to fix compile error about explicit casting: Click alt and hit the enter and choose the first (default) solution.
        double d1 = 20.5;
        short s1 = (short) d1;




    }
}
