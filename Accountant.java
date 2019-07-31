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
        this.supportedTeam = supportedManager;
        List<Employee> supportedReports = supportedManager.getReports();
        int supportedTeamSalary = findBudgetOfReports(supportedReports);
        int budgetAddition = supportedTeamSalary/10;
        int newBudget = supportedTeamSalary + budgetAddition;
        this.bonusBudget = newBudget;
        System.out.println(newBudget);
    }

    public int findBudgetOfReports(List<Employee> supportedReports){
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
