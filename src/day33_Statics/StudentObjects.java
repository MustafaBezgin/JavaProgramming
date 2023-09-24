package day33_Statics;

import java.util.Arrays;

public class StudentObjects {

    public static void main(String[] args) {

        Student student1 = new Student("Ahmet");

        System.out.println(student1);

        Student student2 = new Student("Aygun", 'F');

        Student student3 = new Student("Nigara", 123);

        Student student4 = new Student("Mert", 124, 'A');

        Student student5 = new Student("Cihad", 'M', 27);

        Student student6 = new Student("Suhaib", 'M', 29, 125);

        Student student7 = new Student("Ali", 'M', 42, 126, 'B');


        System.out.println(student1 == student2);

        Student[] students = {student1, student2, student3, student4, student5, student6, student7};

        System.out.println(Arrays.asList(students));





    }




}
