import java.util.*;
public class BusinessLead extends BusinessEmployee {

    private static double salaryMultiplier = 2;
    private int headCount;
    private List<Employee> reports = new ArrayList<Employee>();
    private static double bonusBudget;

    public BusinessLead(String name){
        super(name, salaryMultiplier);
        this.headCount = 10;
    }

    public boolean hasHeadCount(){
        if(this.reports.size() < this.headCount);
        return true;
    }

    public boolean addReport(Accountant potentialReport, TechnicalLead supportTeam){ //this is actually what sets the TechnicalLead that the Accountant supports, hence the two parameters
        if(hasHeadCount() == true){
            reports.add(potentialReport);
            potentialReport.setManager(this);
            this.bonusBudget += ((potentialReport.getBaseSalary()) + (potentialReport.getBaseSalary()/10)); //every time you get a new report, add that report's base salary plus 10% of that report's base salary to your budget
            potentialReport.supportTeam(supportTeam); //this is how we update the Accountant to support the passed in TechnicalLead
            return true;
        }else{
            return false;
        }
    }

    public double getBonusBudget(){
        return this.bonusBudget;
    }

    public boolean requestBonus(Employee e, double bonus){
        if(bonus < this.bonusBudget){
            e.setBonus(bonus);
            this.bonusBudget -= bonus; //I didn't really understand the assignment so I created a "bonus" field for all employees (it's in the employee abstract class) to add to
            return true;
        }else{
            return false;
        }
    }

    public boolean approveBonus(Employee e, double bonus){
        for(int i = 0; i < this.reports.size(); i++){
            if((((Accountant) reports.get(i)).getTeamSupported() == e.getManager()) && (((Accountant) reports.get(i)).getBonusBudget() > bonus)){ //had to cast employee objects to accountant objects to access the getTeamSupported and getBonusBudget methods
                e.setBonus(bonus); //adds the bonus amount to the employee's bonus field
                this.bonusBudget -= bonus; //takes away from the BusinessLead's bonus budget
                return true;
            }else{
                return false;
            }
        }
        return false;
    }

    public String getTeamStatus(){ //this code (along with getTeamList) was so similar to the TechnicalLead's code I probably should have moved it up one level or something but since they have different superclasses I'm not suer how that would have worked
        BusinessLead currentManager = this;
        if(reports.size() > 0){
            return this.employeeStatus() + " and no reports yet";
        }else{
            System.out.println(currentManager + ", " + getTeamList());
            return currentManager + ", " + getTeamList();
        }
    }

    public String getTeamList(){
        String teamList = "";
        for(int i = 0; i < reports.size(); i++){
            teamList += reports.get(i).employeeStatus() + ", ";
        }
        return teamList;
    }

}
