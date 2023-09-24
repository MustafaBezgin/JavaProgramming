package day35_OOP_Encapsulation.Tasks.scrumTask;

public class Developer {

    private String name;
    private long employeeID;
    private String jobTitle;
    private double salary;

    public Developer(String name, int employeeID, String jobTitle, double salary) {
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
        return "Developer{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $" + salary +
                '}';
    }


    public void coding() {
        System.out.println(name + " is coding.");
    }

    public void unitTesting() {
        System.out.println(name + " is unit testing.");
    }

    public void fixingBug() {
        System.out.println(name + " is fixing bug.");
    }

}



/*
create a class called Developer
	          Attributes:
	            name, employeeID, JobTitle, Salary

	          Add A constructor that can set all the fields

	          Actions:
	            coding(), unitTesting(), fixingBug(), toString()
 */