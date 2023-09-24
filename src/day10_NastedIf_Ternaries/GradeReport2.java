package day10_NastedIf_Ternaries;

public class GradeReport2 {

    public static void main(String[] args) {

        int score = 82;

        String result = ""; // Temporary. = "" yapılıyor çünkü variable tanımlanmadan önce print yazılırsa compile error verir.

        if (score >= 0 && score <= 100) { // if the score is valid (0 ~ 100 )

            if (score >= 90) { //false:  score < 90
                result = "Excellent";
            } else if (score >= 80) { // false: score < 80
                result = "Great";
            } else if (score >= 70) { // false: score < 70
                result = "Good";
            } else if (score >= 60) {// false: score < 60
                result = "Passed";
            } else {
                result = "Failed";
            }

        } else { // if the score is NOT valid
            result = "Invalid Score";
        }


        System.out.println(result);


        System.out.println("\n--------------------------------------------------------\n");


        // SOLUTION 2: use ternaries ONLY:


      String result2 =  (score >= 0 && score <= 100) ? (score >= 90) ? "Excellent" : (score >= 80) ? "Great" : (score >= 70) ? "Good" : (score >= 60) ? "Passed"
                      : "Failed" : "Invalid Score";

        System.out.println(result2);


        System.out.println("\n--------------------------------------------------------\n");


        // SOLUTION 3: Nested ıf statement ın ilk if inde değil de multi-branch olan ortadaki if lerde ternary kullanmak okunaklı olması adına daha yararlı olabilir.

        String result3 = "";

        if (score >= 0 && score <= 100) { // if the s is valid (0 ~ 100 )

            result3 = (score >= 90) ? "Excellent" : (score >= 80) ? "Great" : (score >= 70) ? "Good" : (score >= 60) ? "Passed" : "Failed";

        } else { // if the s is NOT valid
            result3 = "Invalid Score";
        }

        System.out.println(result3);


    }

}
