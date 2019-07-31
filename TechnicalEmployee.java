public class TechnicalEmployee extends Employee{

    private static int baseSalary = 75000;


    public TechnicalEmployee(String name){
        super(name, baseSalary); //passing back this salary as a parameter, now we can just change the base salary in one place :D
    }

    public TechnicalEmployee(String name, double salaryMultiplier){

        super(name, baseSalary * salaryMultiplier);
    }

    public String employeeStatus(){
        return super.employeeStatus(); //basically just a placeholder, calls the superclass, the oens down the line are more interesting
    }

}
