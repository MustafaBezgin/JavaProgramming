package day35_OOP_Encapsulation.Tasks.scrumTask;

public class Tester {

    private String name;
    private long employeeID;
    private String jobTitle;
    private double salary;

    public Tester(String name, int employeeID, String jobTitle, double salary) {
        setName(name);
        setEmployeeID(employeeID);
        setJobTitle(jobTitle);
        setSalary(salary);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(long employeeID) {


        if (employeeID <= 0){
            System.out.println("Invalid employee ID : " + employeeID);
            System.exit(1);
        }

        this.employeeID = employeeID;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {

        if (salary < 0){
            System.out.println("Invalid salary : " + salary + " Employee: " + employeeID);
            System.exit(1);
        }

        this.salary = salary;
    }


    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $" + salary +
                '}';
    }


    public void smokeTesting(){
        System.out.println(name + " is smoke testing.");
    }

    public void creatingTicket(){
        System.out.println(name + " is creating ticket.");
    }


}

/*
create a class called Tester
	        Attributes:
	            name, employeeID, JobTitle, Salary

	        Add A constructor that can set all the fields

	        Actions:
	           smokeTesting(),  creatingTicket(), dailyStandUp() toString()

 */