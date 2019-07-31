public class BusinessEmployee extends Employee {
//very similar to TechnicalEmployee
    private static int baseSalary = 50000;

    public BusinessEmployee(String name){
        super(name, baseSalary);
    }

    public BusinessEmployee(String name, double salaryMultiplier){
        super(name, baseSalary * salaryMultiplier);
    }

    public String employeeStatus(){
        return super.employeeStatus();
    }

}
