import employee.Employee;
import employee.Worker;
import employee.Manager;

@SuppressWarnings("unused")
public class Company {
    public static void main(String[] args) {
       
        Employee[] employees = new Employee[5];

        employees[0] = new Manager("Anna Crown", 3000, 0);
        employees[1] = new Worker("Ala P", 3500, null);
        employees[2] = new Worker("Emma P", 4000, null);
        employees[3] = new Manager("Jacob G", 3200, 0);
        employees[4] = new Worker("Eva D", 3800, null);

        int nonManagerEmployeesCount = 0;
        for (Employee employee : employees) {
            if (!(employee instanceof Manager)) {
                nonManagerEmployeesCount++;
            }
        }

        ((Manager)employees[0]).setNumberOfSubordinates(nonManagerEmployeesCount);

        employees[0].setSalary(7500);

        System.out.println("Dane dla wszystkich pracowników:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}