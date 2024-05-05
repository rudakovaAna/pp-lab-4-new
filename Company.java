import employee.Employee;
import employee.Worker;
import employee.Manager;

@SuppressWarnings("unused")
public class Company {
    public static void main(String[] args) {
       
        Employee[] employees = new Employee[5];

        employees[0] = new Employee("Anna Crown", 3000);
        employees[1] = new Employee("Suisan White", 3500);
        employees[2] = new Employee("Emma P", 4000);
        employees[3] = new Employee("Jacob G", 3200);
        employees[4] = new Employee("Eva D", 3800);

        System.out.println("Dane dla wszystkich pracowników:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
