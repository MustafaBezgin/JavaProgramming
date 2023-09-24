package day05_StringConcatenation;

public class StudentInfo {

    public static void main(String[] args) {

        String studentName = "Muhtar";
        int age = 45;
        char gender = 'M';
        String schoolName = "Cydeo";
        String phoneNumber = "(123)-456-7890"; //or long phoneNumber = 911    *** Çizgi yerine alt çizgi kullanılsa boşluksuz sayı olarak çıkar.
        boolean isFullTime = true;
        double GPA = 3.12;


        System.out.println("studentName = " + studentName);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("schoolName = " + schoolName);
        System.out.println("phoneNumber = " + phoneNumber);
        System.out.println("isFullTime = " + isFullTime);
        System.out.println("GPA = " + GPA);
    }
}

/*
2. Create a class called StudentInfo and declare variables for the followings:

            1. Student name (String)
            2. Age (int)
            3. Gender (char)
            4. School name (String)
            5. Phone number (String) - (###)-###-####
            6. Full time (boolean)
            7. GPA (double)
 */