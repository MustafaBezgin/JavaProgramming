package day34_GarbageCollection_AccessModifiers;

public class StaticMembers {

    int a;

    static class class1 { // Static Class
                          // outer class cant be static class. Inner class, on the contrary can be static class. But first condition: There must be nested classes.
                          // static belongs a class.



    }

    public static int num = 100; // Static variable

    public static void method() {
        // Static Method
    }

    static {
        // Static Block
    }

}

class A{ // Outer Class

    static class B{ // Inner Class

        public static void method(){
            // Static Method
        }

    }

}

class C{ // it can not be static class. Because there is not a nested classes.

    public static void main(String[] args) {

        A.B.method();

    }

}