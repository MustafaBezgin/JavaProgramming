package day36_OOP_Inheritance.Tasks.EmployeeTask;

public class EmployeeObjects{

    public static void main(String[] args) {

        Developer developer1 = new Developer();
        Tester tester1 = new Tester();
        Teacher teacher1 = new Teacher();
        Driver driver1 = new Driver();

        developer1.setInfo("Mustafa", 'M', 25, 1355, "Java Developer", 18000);
        tester1.setInfo("Ertuğrul", 'M', 25, 1258, "QA", 12000);
        teacher1.setInfo("Muhtar", 'M', 28, 1478, "Instructor", 115000);
        driver1.setInfo("Seyfettin", 'M', 55, 1687, "Driver", 55000);

        developer1.work();
        tester1.testing();
        teacher1.teaching();
        driver1.driving();
        tester1.work();
        developer1.fixingBugs();

        System.out.println(developer1);
        System.out.println(tester1);
        System.out.println(teacher1);
        System.out.println(driver1);

    }



}
