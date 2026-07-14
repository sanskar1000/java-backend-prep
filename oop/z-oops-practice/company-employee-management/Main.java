public class Main {

    /**

     * Program execution starts here.

     *

     * @param args command-line arguments

     */

    public static void main(String[] args) {

        System.out.println("=========================================");

        System.out.println("   Company Employee Management System");

        System.out.println("=========================================");

        // Create company

        Company company = new Company("Google", 3);

        // Create employees

        Employee e1 = new Employee("E101", "Raj", 50000.0);

        Employee e2 = new Employee("E102", "Raminta", 70000.0);

        Employee e3 = new Employee("E103", "Ram", 80000.0);

        // Hire employees

        company.hireEmployee(e1);

        company.hireEmployee(e2);

        company.hireEmployee(e3);

        // Display all employees

        System.out.println("\n===== All Employees =====");

        company.displayEmployees();

        // Increase salary

        System.out.println("\n===== Increase Raj's Salary =====");

        e1.increaseSalary(10);

        e1.displayDetails();

        // Search employee

        System.out.println("\n===== Search Employee =====");

        Employee found = company.findEmployee("E102");

        if (found != null) {

            found.displayDetails();

        }

        // Remove employee

        System.out.println("\n===== Remove Employee =====");

        company.removeEmployee("E103");

        // Display updated employee list

        System.out.println("\n===== Final Employee List =====");

        company.displayEmployees();

    }

}
