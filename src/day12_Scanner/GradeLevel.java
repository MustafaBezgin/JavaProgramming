package day12_Scanner;

public class GradeLevel {

    public static void main(String[] args) {

        byte grade = 19;
        String result = "";

        switch (grade) { // 1 ~ 18
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                result = "Elementary School";
                break;

            case 6:
            case 7:
            case 8:
                result = "Middle School";
                break;

            case 9:
            case 10:
            case 11:
            case 12:
                result = "High School";
                break;

            case 13:
            case 14:
            case 15:
                result = "Collage";
                break;

            case 16:
            case 17:
            case 18:
                result = "Grad School";
                break;

            default:
                result = "Invalid Grade Level";

        }

        System.out.println(result);



                /* SOLUTION 2:


        if (grade >= 1 && grade <= 18) { // 1 ~ 18

            switch (grade) { // 1 ~ 18
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    result = "Elementary School";
                    break;

                case 6:
                case 7:
                case 8:
                    result = "Middle School";
                    break;

                case 9:
                case 10:
                case 11:
                case 12:
                    result = "High School";
                    break;

                case 13:
                case 14:
                case 15:
                    result = "Collage";
                    break;

                default: // 16 ~ 18
                    result = "Grad School";
            }
        } else
            result = "Invalid Grade Level";

        System.out.println(result);
         */

    }
}

/*
    1. Create a class called GradeLevel, Given a number(byte) grade level determine and print which school type someone is in.
                grade level and types are:
                        1-5: Elementary school
                        6-8: Middle school
                        9-12: High school
                        13-16: College
                        17-18: Grad School

                        For Any Other grade: Invalid grade level given

                Note:
                    Solution 1: Use switch statement
                    Solution 2: use if & switch both
 */