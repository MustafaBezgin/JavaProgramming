package day36_OOP_Inheritance.Tasks.ScrumTask;

public class Tester extends Employee {

    public void createTicket() {
        System.out.println(getName() + " is creating ticket.");
    }

    public void testing() {
        System.out.println(getName() + " is testing.");
    }

}
