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

    public boolean addReport(Accountant potentialReport, TechnicalLead supportTeam){
        if(hasHeadCount() == true){
            reports.add(potentialReport);
            potentialReport.setManager(this);
            this.bonusBudget += ((potentialReport.getBaseSalary()) + (potentialReport.getBaseSalary()/10));
            potentialReport.supportTeam(supportTeam);
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
            this.bonusBudget -= bonus;
            return true;
        }else{
            return false;
        }
    }

    public boolean approveBonus(Employee e, double bonus){
        for(int i = 0; i < this.reports.size(); i++){
            if((((Accountant) reports.get(i)).getTeamSupported() == e.getManager()) && (((Accountant) reports.get(i)).getBonusBudget() > bonus)){
                e.setBonus(bonus);
                return true;
            }else{
                return false;
            }
        }
        return false;
    }

    public String getTeamStatus(){
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
