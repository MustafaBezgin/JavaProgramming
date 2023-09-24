package day11_Switch_Scanner;

public class NumberOfDays {

    public static void main(String[] args) {

        // NICE TASK:

        int number = 2;
        int year = 2001;

        String result = "";

        if (number >= 1 && number <= 12) {

            switch (number) {

                case 2:
                    if (year % 4 == 0) { //veya "result = (year % 4 == 0) ? "29 days" : "28 days"; şeklinde ternary olarak da yazılabilir.
                        result = "29 days.";
                    } else
                        result = "28 days.";
                    break;

                case 4:
                case 6:
                case 9:
                case 11:
                    result = "30 days.";

                default:
                    result = "31 days.";
            }

        } else {
            result = "Invalid Number.";
        }

        System.out.println(result);


    }
}


/*
4. NumberOfDays
			28 Days: 2
			30 days: 4, 6, 9, 11
			31 days: 1, 3, 5, 7, 8, 10, 12

			If(1~12){


			}else{
				Invalid
			}
 */