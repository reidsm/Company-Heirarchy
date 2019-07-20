public class TechnicalEmployee extends Employee{

    public static int baseSalary = 75000;

    public TechnicalEmployee(String name){
        super(name, baseSalary);
    }

    public TechnicalEmployee(String name, double salaryMultiplier){
        super(name, baseSalary * salaryMultiplier);
    }

}
