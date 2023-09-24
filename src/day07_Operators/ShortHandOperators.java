package day07_Operators;

public class ShortHandOperators {

    public static void main(String[] args) {

        //ASSIGNMENT: = (not "equal" meaning. The meaning is "assign". We use assignment to update the data. It must be the same datatype.

        int number = 100;

        System.out.println("number = " + number); //100

        number = 200;

        System.out.println("number = " + number); //200 - Last

        String word = "Java Programming";

        System.out.println("word = " + word); //Java Programming

        word = "Wooden Spoon"; //not a new variable. Same variable but different value.

        System.out.println("word = " + word); //Wooden Spoon

        word = "Cydeo";

        System.out.println("word = " + word); //Cydeo

        word = "123" + 1; //Normalde double quote olmadan String olmadığı için olmazdı. Sonraki sayı da string den sonrası da string olduğu için oldu.

        System.out.println("word = " + word);

        System.out.println("\n\n--------------------------------------------------------\n\n");


        //ADDITION ASSIGNMENT:

        int x = 100;

        System.out.println("x = " + x); //100
        System.out.println(x + 200); //300

        // x = x + 200;
        x += 200;
        System.out.println("x = " + x);

        String str = "Wooden";
        str += " Spoon";
        System.out.println("str = " + str);

        double num1 = 2.5;
        System.out.println("num1 = " + num1);
        num1 += 5.5;
        System.out.println("num1 = " + num1);

        double availableBalance = 1000.5;
        //deposit: 300$
        availableBalance += 300; //availableBalance = 1000.5 + 300 = 1300.5
        System.out.println("availableBalance = " + availableBalance);


        System.out.println("\n\n--------------------------------------------------------\n\n");


        //SUBTRACTION ASSIGNMENT:

        // withdrawing 500$
        availableBalance -= 500;
        System.out.println("availableBalance = " + availableBalance);

        //withdrawing 200$, then depositing 400$
        availableBalance -= 200;
        availableBalance += 400;
        System.out.println("availableBalance = " + availableBalance);


        System.out.println("\n\n--------------------------------------------------------\n\n");


        //MULTIPLICATION ASSIGNMENT:

        double salary = 50000.5;
        System.out.println("salary = " + salary);

        salary *= 2;
        System.out.println("salary = " + salary + "\n");

        double doge = 0.00000001;
        doge *= 1000000;
        System.out.println("dodge = " + doge);


        System.out.println("\n\n--------------------------------------------------------\n\n");


        //DIVISION ASSIGNMENT:

        double num2 = 25000.0;
        num2 /= 2;      // num2 / 2;
        System.out.println("num2 = " + num2);


        System.out.println("\n\n--------------------------------------------------------\n\n");


        //REMAINDER ASSIGNMENT:

        int num3 = 100;
        num3 %= 3;
        System.out.println("num3 = " + num3);


        System.out.println("\n\n--------------------------------------------------------\n\n");

        int amount = 127; // cents

        int quarters = amount / 25;
        int cents = amount % 25;
        System.out.println("quarters = " + quarters);
        System.out.println("cents = " + cents);

        int cents2 = 127;
        cents2 %= 25;
        System.out.println("cents2 = " + cents2);


        System.out.println("\n\n--------------------------------------------------------\n\n");


        int y = 300;
        y %= 16;
        System.out.println("y = " + y + "\n");

        int balance = 3500;
        //insurance fee: $153
        balance %= 153;
        System.out.println("balance = " + balance);






    }
}
