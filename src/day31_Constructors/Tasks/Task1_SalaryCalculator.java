package day31_Constructors.Tasks;

public class Task1_SalaryCalculator {

    public double hourlyRate, stateTaxRate, federalTaxRate;
    public int weeklyHours;

    public Task1_SalaryCalculator(double hourlyRate, double stateTaxRate, double federalTaxRate, int weeklyHours) {
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
        this.weeklyHours = weeklyHours;
    }

    public double salary(){
        double salary = (hourlyRate * weeklyHours) * 52;
        return salary;
    }

    public double stateTax(){
        double totalStateTax = salary() * stateTaxRate;
        return totalStateTax;
    }

    public double federalTax(){
        double totalFederalTax = salary() * federalTaxRate;
        return totalFederalTax;
    }

    public double salaryAfterTax(){
        double salaryAfterTax = salary() - (stateTax() + federalTax());
        return salaryAfterTax;
    }


    public String toString() {
        return "SalaryCalculator{" +
                "Salary = $" + salary() +
                ", State Tax = $" + stateTax() +
                ", Federal Tax = $" + federalTax() +
                ", Salary After Tax = $" + salaryAfterTax() +
                '}';
    }


    /*
    public static void main(String[] args) {

        SalaryCalculator salary1 = new SalaryCalculator(50, 0.15, 0.20, 40);

        System.out.println(salary1);
    }
     */
}
