package day35_OOP_Encapsulation.Tasks;

public class BankAccount {

    private String accountHolder;
    private long accountNumber;
    private double balance;


    public BankAccount(String accountHolder, long accountNumber, double balance) {
        setAccountHolder(accountHolder);
        setAccountNumber(accountNumber);
        setBalance(balance);
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void checkBalance() {
        System.out.println("Your available balance is: $" + balance);
    }

    public void deposit(double amount) {

        if (amount <= 0) {
            System.out.println("Depositing amount can not be zero or negative.");
            return; // it exits the method. (exit(0) is terminate every thing)
        }

        System.out.println("Depositing $"+amount+" to the account "+ accountNumber);
        balance += amount;
    }


    public void withdraw(double amount) {

        if (amount > balance) { // if withdrawing amount is greater than available balance.
            System.out.println("Insufficient balance.");
            return; // it exits the method.
        }

        if (amount <= 0) { // if withdrawing amount is negative or zero
            System.out.println("Withdrawing amount can not be zero or negative.");
            return; // it exits the method.
        }

        System.out.println("Withdrawing $"+amount+" from the account "+accountNumber);
        balance -= amount;

    }

    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }
}

/*

3. create a class named BankAccount
        Private variables:
            accountHolder, accountNumber, balance

        encapsulate all the fields

        Add a constructor that allows user to set all the fields when the object is created.
                        (If the arguments not valid it should not be set to the instances)

        Extra methods:
                deposit()
                withdraw()
                checkbalance()
                toString()

            DO NOT duplicate any code fragments

 */