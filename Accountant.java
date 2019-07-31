import java.util.*;
public class Accountant extends BusinessEmployee {

    private double bonusBudget;
    private TechnicalLead supportedTeam;

    public Accountant(String name){
        super(name);
        this.bonusBudget = 0;
    }

    public TechnicalLead getTeamSupported(){
        return this.supportedTeam;
    }

    public void supportTeam(TechnicalLead supportedManager){
        this.supportedTeam = supportedManager; //sets the supported team of this accountant to the passed in supported manager, actually set by the addReport method of the BusinessLead
        List<Employee> supportedReports = supportedManager.getReports(); //I stored the supported manager's reports here for ease  of access
        int supportedTeamSalary = findBudgetOfReports(supportedReports); //I decided to add up the salaries in a different method down there
        int budgetAddition = supportedTeamSalary/10; //takes the added up number and divides it by 10 to get 10%
        int newBudget = supportedTeamSalary + budgetAddition; //adds the total salaries and the bonus amount to get the right number
        this.bonusBudget = newBudget; //sets the new budget for the accountant
        System.out.println(newBudget);
    }

    public int findBudgetOfReports(List<Employee> supportedReports){ //adds up the salaries of the TechnicalLead's reports passed in
        int supportedTeamSalary = 0;
        for(int i=0; i < supportedReports.size(); i++){
            supportedTeamSalary += supportedReports.get(i).getBaseSalary();
        }
        return supportedTeamSalary;
    }

    public double getBonusBudget(){
        return this.bonusBudget;
    }

    public boolean approveBonus(int suggestedBonus){
        if(suggestedBonus < this.bonusBudget){
            return true;
        }else if(this.supportedTeam == null){
            return false;
        }else{
            return false;
        }
    }

    public String employeeStatus(){
        return super.employeeStatus() + " with a budget of " + this.bonusBudget + " is supporting " + this.supportedTeam.getName();
    }

}
