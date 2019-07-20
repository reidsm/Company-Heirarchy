public class TechnicalLead extends TechnicalEmployee{

    public static double salaryMultiplier = 1.3;

    public TechnicalLead(String name){
        super(name, salaryMultiplier);
    }
}
