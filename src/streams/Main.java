package streams;

interface EmpFunctionalInterface {
   abstract Employee createEmp(String name, String account, int salary);
}

public class Main {
    public static void main(String[] args) {
    	
    	EmpFunctionalInterface empFunctionalInterface = (String name, String account, int salary) -> {
    		return new Employee(name, account, salary);
    	};
    	Employee emp1 = empFunctionalInterface.createEmp("shree", "123456", 20000);
    	
    	System.out.println(" Object created using Lambda expression: ");
    	System.out.println("Name: " + emp1.name);
        System.out.println("Account: " + emp1.account);
        System.out.println("Salary: " + emp1.salary);
        
    	EmpFunctionalInterface empFI = Employee:: new;
    	Employee emp2 = empFI.createEmp("mohini", "111222", 40000);

    	System.out.println(" Object created using Constructor reference: ");
    	System.out.println("Name: " + emp2.name);
        System.out.println("Account: " + emp2.account);
        System.out.println("Salary: " + emp2.salary);
        
//        // Create an Employee object using the supplier
//        Employee employee = createEmployee(employeeSupplier, "John Doe", "12345", 50000.0);
//
//        // Get and display the details of the Employee object
//        System.out.println("Name: " + employee.getName());
//        System.out.println("Account: " + employee.getAccount());
//        System.out.println("Salary: " + employee.getSalary());
    }

//    // Method to create an Employee object using the supplier
//    public static Employee createEmployee(EmpSupplier supplier, String name, String account, int salary) {
//        return supplier.create(name, account, salary);
//    }
}
