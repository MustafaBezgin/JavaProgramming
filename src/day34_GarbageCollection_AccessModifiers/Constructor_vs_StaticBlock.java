package day34_GarbageCollection_AccessModifiers;

public class Constructor_vs_StaticBlock {

    public Constructor_vs_StaticBlock(){
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        new Constructor_vs_StaticBlock(); // 1. object has its own copy
        new Constructor_vs_StaticBlock(); // 2. object has its own copy
        new Constructor_vs_StaticBlock(); // 3.object has its own copy
        new Constructor_vs_StaticBlock(); // 4. object has its own copy

    }

    static {
        System.out.println("Static Block");
    }

}
