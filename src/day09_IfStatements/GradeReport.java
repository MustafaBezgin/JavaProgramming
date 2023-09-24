package day09_IfStatements;

public class GradeReport {

    public static void main(String[] args) {

        String name = "Mustafa";
        int score = 67;

        char result;

        if (score >= 90 && score <= 100) {
            result = 'A';
        } else if (score >= 80 && score < 90) {
            result = 'B';
        } else if (score >= 70 && score < 80) {
            result = 'C';
        } else if (score >= 60 && score < 70) {
            result = 'D';
        } else {
            result = 'F';
        }

        System.out.println(name + " got the " + result + " grade in this exam.");



    }
}

 /*
 score:
    90 ~ 100 ==> A
    80 ~ 89 ==> B
    70 ~ 79 ==> C
    60 ~ 69 ==> D
    0 ~ 59 ==> F
  */