import java.util.*;

public class TechnicalLead extends TechnicalEmployee{

    private List<Employee> reports = new ArrayList<Employee>();
    private static double salaryMultiplier = 1.3; //using the same constructor method we can just change the multiplier from one place!


    public TechnicalLead(String name){
        super(name, salaryMultiplier);
    }
//adds a report to this manager
    public boolean addReport(Employee potentialReport){
        if(hasHeadCount() == true) {
            reports.add(potentialReport);
            potentialReport.setManager(this); //the "this" keyword took me like a half our to figure out, I was trying stuff like this.TechnicalLead and getting nowhere, was the simplest answer
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
        if((this == e.getManager()) && (e.getCodeAccess() == true)){ //checks if this employee has code access and the instance of the TechnicalLead being called on is indeed the employee that was passed in's manager
            return true;
        }else{
            return false;
        }
    }

    public String getTeamStatus(){ //works a lot like the toString method
        TechnicalLead currentManager = this;
        if(reports.size() == 0){
            return this.employeeStatus() + " and no reports yet";
        }else {
            System.out.println(currentManager + ", " + getTeamList());
            return currentManager + ", " + getTeamList();
        }
    }

    public String getTeamList(){ //found it easier to put this string builder function down here
        String teamList = "";
        for(int i = 0; i < reports.size(); i++){
            teamList += reports.get(i).employeeStatus() + ", ";
        }
        return teamList;
    }

}
