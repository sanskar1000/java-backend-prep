package company_employee_management;
class Employee {

    // Employee ID

    private String employeeId;

    // Employee name

    private String name;

    // Employee salary

    private double salary;

    /**

     * Constructs an Employee object.

     *

     * @param employeeId unique employee ID

     * @param name employee name

     * @param salary employee salary

     */

    public Employee(String employeeId, String name, double salary) {

        if (employeeId != null && !employeeId.isBlank()) {

            this.employeeId = employeeId;

        } else {

            this.employeeId = "Unknown";

            System.out.println("Invalid employee ID. Default value assigned.");

        }

        if (name != null && !name.isBlank()) {

            this.name = name;

        } else {

            this.name = "Unknown";

            System.out.println("Invalid employee name. Default value assigned.");

        }

        if (salary >= 0) {

            this.salary = salary;

        } else {

            this.salary = 0.0;

            System.out.println("Invalid salary. Default value assigned.");

        }

    }

    /**

     * Returns the employee ID.

     *

     * @return employee ID

     */

    public String getEmployeeId() {

        return employeeId;

    }

    /**

     * Returns the employee name.

     *

     * @return employee name

     */

    public String getName() {

        return name;

    }

    /**

     * Returns the employee salary.

     *

     * @return employee salary

     */

    public double getSalary() {

        return salary;

    }

    /**

     * Increases the employee salary by the specified percentage.

     *

     * @param percent percentage increase

     */

    public void increaseSalary(double percent) {

        if (percent <= 0) {

            System.out.println("Salary increase percentage must be greater than 0.");

            return;

        }

        salary += salary * (percent / 100);

    }

    /**

     * Displays employee details.

     */

    public void displayDetails() {

        System.out.println("----------- Employee Details -----------");

        System.out.println("Employee ID : " + employeeId);

        System.out.println("Name        : " + name);

        System.out.printf("Salary      : ₹%.2f%n", salary);

        System.out.println("----------------------------------------");

        System.out.println();

    }

}
