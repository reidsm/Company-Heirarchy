public abstract class Employee {

    private String name;
    private double baseSalary;
    private int employeeID;
    private Employee manager;

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
        this.baseSalary = 0;
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

}
