import java.util.*;

public class SoftwareEngineer extends TechnicalEmployee{

    private int checkinCount;
    private boolean hasCodeAccess;

    public SoftwareEngineer(String name){
        super(name);
    }

    public int getSuccessfulCheckins(){
        return this.checkinCount;
    }

    public boolean getCodeAccess(){
        return this.hasCodeAccess;
    }

    public void setCodeAccess(boolean externalAccess){
        this.hasCodeAccess = externalAccess;
    }

    public boolean checkinCode(){
        TechnicalLead thisManager = ((TechnicalLead) this.getManager()); //had to cast the employee to a TechnicalLead so I could access the approveCheckin method
        if(thisManager.approveCheckIn(this)){
            checkinCount = checkinCount + 1; //increments the checkin count
            return true;
        }else{
            return false;
        }
    }

    public String employeeStatus(){
        return super.employeeStatus() + " has " + checkinCount + " successful checkins";
    }

}
