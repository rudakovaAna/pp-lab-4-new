public class Employee {
    public class Employee {
        public Employee(String string, int i) {
        
        }
    
        public static void main(String[] args) {
    
            Employee[] employees = new Employee[5];
    
       
            employees[0] = new Employee("Anna Cwown", 3000);
            employees[1] = new Employee("Jacob Smith", 3500);
            employees[2] = new Employee("Magda Johnson", 4000);
            employees[3] = new Employee("Jan Brown", 3200);
            employees[4] = new Employee("Emma White", 3800);
    
          
            System.out.println("Dane dla pracownika o indeksie 3:");
            System.out.println(employees[3]);
    
          
            employees[3].setSalary(3500);
    
        
            System.out.println("\nDane dla wszystkich pracownikow:");
            for (Employee employee : employees) {
                System.out.println(employee);
            }
        }
    
        private void setSalary(int i) {
        
            throw new UnsupportedOperationException("Unimplemented method 'setSalary'");
        }
    }
    
    
}
