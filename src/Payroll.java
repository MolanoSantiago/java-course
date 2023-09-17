// UpperCamelCase for Classes-Interfaces
public class Payroll {
    public static void main(String[] args) {
        final String EMPLOYEE_NAME = "Santiago Molano";
        int salaryBase = 1249898;
        double retentions = 0.09;

        salaryBase++;
        System.out.println(salaryBase);


        // Incrementador Prefijo
        salaryBase = 100 + ++salaryBase;
        System.out.println(salaryBase);

        // LowerCamelCase for methods-variables

        var finalSalary = salaryBase - (retentions * salaryBase);
        var retentionsCast = (int) (retentions * 100);

        System.out.println("Name: " + EMPLOYEE_NAME);
        System.out.println("Base salary: " + salaryBase);
        System.out.println("Retentions: " + retentionsCast + "%");
        System.out.println(" --- --- --- --- ");
        System.out.println(" ");
        System.out.println("Final salary: " + finalSalary);
    }
}
