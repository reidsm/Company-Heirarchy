
public class CompanyStructureMain {
    public static void main(String args[]){
        TechnicalLead CTO = new TechnicalLead("Satya Nadella");
        SoftwareEngineer seA = new SoftwareEngineer("Kasey");
        SoftwareEngineer seB = new SoftwareEngineer("Balleus");
        SoftwareEngineer seC = new SoftwareEngineer("Testiclees");
        SoftwareEngineer seD = new SoftwareEngineer("Monica");
        CTO.addReport(seA);
        CTO.addReport(seB);
        CTO.addReport(seC);
        CTO.addReport(seD);
        System.out.println(CTO);
        System.out.println(seA);
        System.out.println(CTO.getReports());
        System.out.println(seA.getManager());
        System.out.println(CTO.hasHeadCount());
        System.out.println(seC.getManager());
        seA.setCodeAccess(true);
        System.out.println(seA.getCodeAccess());
        seA.checkinCode();
        seA.checkinCode();
        System.out.println(seA.getSuccessfulCheckins());
        System.out.println(seA.employeeStatus());
        CTO.getTeamStatus();
    }
}
