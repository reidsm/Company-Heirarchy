
public abstract class Employee {

    private String name;
    private double baseSalary;
    private int employeeID;
    private Employee manager;
    private double bonus;

    private static int nextID=1;

    public Employee(String name, double baseSalary){
        this.name = name;
        this.baseSalary = baseSalary;
        employeeID=nextID++;
    }

    public Employee(String name){
        this.name = name;
        //this.baseSalary = 0;
        employeeID=nextID++;
    }

    public Employee(){
        this.name = "";
        //this.baseSalary = 0;
        this.employeeID = nextID++;
        this.manager = null;
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
        return this.getEmployeeID() + " " + this.getName();
    }

    public void setBonus(double bonus){
        this.bonus = bonus;
    }

    public double getBonus(){
        return this.bonus;
    }

}
