package day11_Switch_Scanner;

public class NameOfMonth {

    public static void main(String[] args) {

        int number = 7;
        String month = "";

        if (number >= 1 && number <= 12) {

            switch (number) {
                case 1:
                    month = "January";
                    break;
                case 2:
                    month = "February";
                    break;
                case 3:
                    month = "March";
                    break;
                case 4:
                    month = "April";
                    break;
                case 5:
                    month = "May";
                    break;
                case 6:
                    month = "June";
                    break;
                case 7:
                    month = "July";
                    break;
                case 8:
                    month = "August";
                    break;
                case 9:
                    month = "September";
                    break;
                case 10:
                    month = "October";
                    break;
                case 11:
                    month = "November";
                    break;
                default:
                    month = "December";
            }
        } else {
            month = "Invalid Number";
        }

        System.out.println(month);

    }

}
