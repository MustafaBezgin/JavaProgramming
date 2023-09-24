package day08_IfStatements;

public class GradeLevel {

    public static void main(String[] args) {

        byte gradeLevel = 11;

        boolean elementary = gradeLevel >= 1 && gradeLevel <= 5;
        boolean middle = gradeLevel >= 6 && gradeLevel <= 8;
        boolean high = gradeLevel >= 9 && gradeLevel <= 12;
        boolean collage = gradeLevel >= 13 && gradeLevel <= 16;
        boolean grad = !elementary && !middle && !high && !collage; // or "gradeLevel == 17 && gradeLevel == 18;"

        if (elementary) {
            System.out.println("Elementary School.");
        }

        if (middle) {
            System.out.println("Middle School.");
        }

        if (high) {
            System.out.println("High School.");
        }

        if (collage) {
            System.out.println("Collage.");
        }

        if (grad) {
            System.out.println("Grad School.");
        }


    }

}
