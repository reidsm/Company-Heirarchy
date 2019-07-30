public class TechnicalEmployee extends Employee{

    private static int baseSalary = 75000;


    public TechnicalEmployee(String name){
        super(name, baseSalary);
    }

    public TechnicalEmployee(String name, double salaryMultiplier){

        super(name, baseSalary * salaryMultiplier);
    }

    public String employeeStatus(){
        return super.employeeStatus();
    }

}
