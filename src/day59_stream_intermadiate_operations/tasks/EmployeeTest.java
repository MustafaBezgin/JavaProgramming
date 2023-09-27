package day59_stream_intermadiate_operations.tasks;

import java.util.Collection;
import java.util.List;

public class EmployeeTest {

    public static void main(String[] args) {


        System.out.println("\n-----------------Print all e-mails-----------------\n");

        EmployeeData.readAll()
//              .map(employee -> employee.getEmpEmail())
                .map(Employee::getEmpEmail)
                .forEach(System.out::println);


        System.out.println("\n-----------------Print all phone numbers-----------------\n");

        EmployeeData.readAll()
                .flatMap(employee -> employee.getEmpPhoneNumbers().stream())
                .forEach(System.out::println);


        System.out.println("\n-----------------Print all phone numbers with double colon-----------------\n");

        EmployeeData.readAll()
                .map(Employee::getEmpPhoneNumbers)
                .flatMap(List::stream)
                .forEach(System.out::println);


    }

}
