package day35_OOP_Encapsulation.Tasks;

public class BankAccountTest {

    public static void main(String[] args) {

        BankAccount account1 = new day35_OOP_Encapsulation.Tasks.BankAccount("Mustafa BEZGIN", 123456789, 0);

        System.out.println(account1);

        account1.deposit(15000);
        account1.withdraw(7500);

        account1.checkBalance();

        System.out.println(account1);

    }

}
