import employee.Employee;
import employee.Worker;
import employee.Manager;

    public static void main(String[] args) {
       
        Employee[] employees = new Employee[7];

        employees[0] = new Manager("Anna Crown", 3000, 0);
        employees[1] = new Worker(extracted(), 3500, null);
        employees[2] = new Worker("Emma P", 4000, null);
        employees[3] = new Manager("Jacob G", 3200, 0);
        employees[4] = new Worker("Eva D", 3800, null);
        employees[5] = new Manager("Maria D", 3800, 0);
        employees[6] = new Worker("Kate D", 3800, null);

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

    private static String extracted() {
        return "Suisan White";
    }
