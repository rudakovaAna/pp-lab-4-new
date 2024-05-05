import employee.Employee;
import employee.Worker;
import employee.Manager;

@SuppressWarnings("unused")
public class Company {
    public static void main(String[] args) {
       
        Employee[] employees = new Employee[7];

        employees[0] = new Employee("Anna Crown", 3000);
        employees[1] = new Employee("Suisan White", 3500);
        employees[2] = new Employee("Emma P", 4000);
        employees[3] = new Employee("Jacob G", 3200);
        employees[4] = new Employee("Eva D", 3800);
        employees[5] = new Employee("Maria D", 3800);
        employees[6] = new Employee("Kate D", 3800);

        for (Employee employee : employees) {
            double newSalary = employee.getSalary() + 500;
            employee.setSalary(newSalary);
        }

        for (Employee employee : employees) {
            if (employee instanceof Manager) {
                ((Manager) employee).setNumberOfSubordinates(2); 
                employee.setSalary(7500);
            }
        }

        System.out.println("Zaktualizowane informacje o pracownikach:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}