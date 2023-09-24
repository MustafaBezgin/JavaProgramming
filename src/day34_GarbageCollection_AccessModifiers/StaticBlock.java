package day34_GarbageCollection_AccessModifiers;

public class StaticBlock {

    public static void main(String[] args) {

        System.out.println("Main Method");

    }


    static { // runs before anything, and only runs one time

        // Static Block
        System.out.println("Static Block");

    }

    static {

        System.out.println("Static Block 2");

    }

    static {

        System.out.println("Static Block 3");

    }


}
