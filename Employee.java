
public abstract class Employee {

    private String name;
    private double baseSalary; //all employees have a base salary even though they are all differet, it was rticky to figure out how to get it working at this level
    private int employeeID;
    private Employee manager;
    private double bonus;

    private static int nextID=1;

    public Employee(String name, double baseSalary){ //turns out I had to create a constructor that would accept a salary parameter to declare the salary variable here - the subclass constructors call this superclass constructor
        this.name = name;
        this.baseSalary = baseSalary;
        employeeID=nextID++; //was tricky to figure out how to get the employee IDs to count up, I had to use 2 variables
    }

    public String toString(){
        return employeeID + " " + name;
    }

    public Employee getManager(){
        return this.manager;
    }

    public void setManager(Employee manager){

        this.manager = manager;
    }

    public boolean equals(Employee other){
        return (this.employeeID == other.employeeID);
    }

    public double getBaseSalary(){
        return this.baseSalary;
    }

    public int getEmployeeID(){
        return this.employeeID;
    }

    public String getName(){
        return this.name;
    }

    public String employeeStatus(){
        return this.getEmployeeID() + " " + this.getName(); //wanted to write this up here since it uses the abstract employee fields
    }

    public void setBonus(double bonus){
        this.bonus = bonus;
    }

    public double getBonus(){
        return this.bonus;
    }

}
