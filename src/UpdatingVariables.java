// UpperCamelCase for Classes-Interfaces
public class UpdatingVariables {
    public static void main(String[] args) {
        int salary = 1000;

        final String CONSTANT_EXAMPLE = "Hello World";

        salary += 200;

        System.out.println(salary);

        // LowerCamelCase for methods-variables
        String employeeName = "Santiago Molano";

        System.out.println(employeeName);

        employeeName = employeeName + " Holguin";

        System.out.println(employeeName);

        System.out.println(CONSTANT_EXAMPLE);
    }
}
