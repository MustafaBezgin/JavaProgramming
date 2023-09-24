package day32_Constructors;

public class ConstructorCalls {

    public ConstructorCalls(){
        // this(); -> Violated 5. rule
        // this(9);  -> Violated 5. rule -> public ConstructorCalls(int a)
        System.out.println("Default Constructor");
    }

    public ConstructorCalls(int a){
        this();
        // ConstructorCalls(); -> Violated 1. rule
        System.out.println("Constructor with int argument");
        // this(); -> Violated 3. rule

    }

    public ConstructorCalls(String str){
        this(10);
        // this(); -> Violated 3. & 4. rule
        System.out.println("Constructor with String argument");
    }


    public static void main(String[] args) {

        ConstructorCalls obj1 = new ConstructorCalls();

        System.out.println("\n-----------------------------------------------------------\n");

        ConstructorCalls obj2 = new ConstructorCalls(10);

        System.out.println("\n-----------------------------------------------------------\n");

        ConstructorCalls obj3 = new ConstructorCalls("Java");




    }

}

/*
Constructor Call:
		1. Constructor can not be called by its name ( this() need to be used )
		2. Only a constructor can call another constructor
		3. Constructor call MUST be at the first step
		4. One constructor can not call more than one constructor
		5. Constructor can not call or contain itself
 */