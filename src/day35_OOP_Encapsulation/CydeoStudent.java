package day35_OOP_Encapsulation;

public class CydeoStudent {

    public String name;
    public char gender;
    public int age, batchNumber, groupNumber;
    public long ID;
    public static String schoolName, programmingLanguage;
    public String fieldOfStudy;
    public static String secretCode;


    public CydeoStudent(String name, char gender, int age, int batchNumber, int groupNumber, long ID, String fieldOfStudy) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.ID = ID;
        this.fieldOfStudy = fieldOfStudy;
    }


    static {
        schoolName = "CYDEO";
        programmingLanguage = "JAVA";
        secretCode = "Wooden Spoon";
    }


    public static void printSchoolName() {
        System.out.println(schoolName);
    }

    public static void printProgrammingLanguage() {
        System.out.println(programmingLanguage);
    }

    public void attendClass() {
        System.out.println(name + " is attending class.");
    }

    public void study() {
        System.out.println(name + " is studying.");
    }


    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", ID=" + ID +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                ", school='" + schoolName + '\'' +
                ", programmin language='" + programmingLanguage + '\'' +
                '}';
    }
}


/*
	2. create a class named CydeoStudent
            Variables:
                name, gender, age, batchNumber, groupNumber, schoolName, fieldOfStudy, programmingLanguage, secretCode

            Add a constructor to initialize all the fields

            Add a static block to initialize all the statics

            methods:
                printSchoolName();
                printSecretCode();
                attendClass():
                study()
                toString()
 */