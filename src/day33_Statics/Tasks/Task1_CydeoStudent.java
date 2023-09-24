package day33_Statics.Tasks;

import java.util.ArrayList;

public class Task1_CydeoStudent {

    public String name, batchNumber, groupNumber;
    public int age;
    public char gender, grade;
    public long ID;
    public static String schoolName, programmingLanguage;

    public Task1_CydeoStudent(String name, int age, char gender, long ID, char grade, String batchNumber, String groupNumber) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.ID = ID;
        this.grade = grade;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
    }

    public void study() {
        System.out.println(name + " is working.");
    }

    public void attendClass() {
        System.out.println(name + " is attending class.");
    }

    public static void printSchoolName() {
        System.out.println(schoolName);
    }

    public static void printProgrammingLanguage() {
        System.out.println(programmingLanguage);
    }


    public String toString() {
        return "Task1_CydeoStudent{" +
                "name='" + name + '\'' +
                ", batchNumber='" + batchNumber + '\'' +
                ", groupNumber='" + groupNumber + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", grade=" + grade +
                ", ID=" + ID +
                '}';
    }
}
