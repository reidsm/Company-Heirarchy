public class CompanyStructureMain {
    public static void main(String args[]){
        Employee employee1 = new TechnicalLead("bob");
        Employee employee2 = new TechnicalEmployee("fred");
        System.out.println(employee1);
        System.out.println(employee2);
        employee1.setManager(employee2);
        System.out.println(employee1.getManager());
        System.out.println(employee1.getBaseSalary());
        System.out.println(employee2.getBaseSalary());
    }
}
