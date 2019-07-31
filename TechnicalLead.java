import java.util.*;

public class TechnicalLead extends TechnicalEmployee{

    private List<Employee> reports = new ArrayList<Employee>();
    private static double salaryMultiplier = 1.3;


    public TechnicalLead(String name){
        super(name, salaryMultiplier);
    }

    public boolean addReport(Employee potentialReport){
        if(hasHeadCount() == true) {
            reports.add(potentialReport);
            potentialReport.setManager(this);
            return true;
        }else{
            return false;
        }
    }

    public List<Employee> getReports(){
        return this.reports;
    }

    public boolean hasHeadCount(){
        if(this.reports.size() < 4){
            return true;
        }else{
            return false;
        }
    }

    public boolean approveCheckIn(SoftwareEngineer e){
        if((this == e.getManager()) && (e.getCodeAccess() == true)){
            return true;
        }else{
            return false;
        }
    }

    public String getTeamStatus(){
        TechnicalLead currentManager = this;
        if(reports.size() == 0){
            return this.employeeStatus() + " and no reports yet";
        }else {
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
