package day09_IfStatements;

public class NameOfTheMonth {

    public static void main(String[] args) {

        int number = 12;
        String monthName; // = "" eklenmeli

        if (number == 1) {
            monthName = "January";
        } else if (number == 2) {
            monthName = "February";
        } else if (number == 3) {
            monthName = "March";
        } else if (number == 4) {
            monthName = "April";
        } else if (number == 5) {
            monthName = "May";
        } else if (number == 6) {
            monthName = "June";
        } else if (number == 7) {
            monthName = "July";
        } else if (number == 8) {
            monthName = "August";
        } else if (number == 9) {
            monthName = "September";
        } else if (number == 10) {
            monthName = "October";
        } else if (number == 11) {
            monthName = "November";
        } else {                      // Bu haliyle 12 den büyük tüm sayılar da December sonucunu veriyor. NestedIf konusunda daha doğru örneği var.
            monthName = "December";
        }

        System.out.println("The current month is " + monthName + ".");


    }
}
