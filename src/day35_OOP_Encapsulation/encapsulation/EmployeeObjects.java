package day35_OOP_Encapsulation.encapsulation;

public class EmployeeObjects {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Tatiana", 'F', 28, 110000);

        System.out.println(employee1);

        Employee employee2 = new Employee("", 'Q', 10, 0);

        System.out.println(employee2);

        employee1.setAge(32);

        System.out.println(employee1);

        Employee employee3 = new Employee("Aygun", 'F', 34, 125000);

        employee3.setSalary(employee3.getSalary() + 15000);

        employee3.setName("Elvira");

        System.out.println(employee3);



    }


}
