package company_employee_management;
class Company {

    // Company name

    private String companyName;

    // Array to store employees

    private Employee[] employees;

    // Current number of employees

    private int employeeCount;

    /**

     * Constructs a Company object.

     *

     * @param companyName name of the company

     * @param size maximum number of employees

     */

    public Company(String companyName, int size) {

        if (companyName != null && !companyName.isBlank()) {

            this.companyName = companyName;

        } else {

            this.companyName = "Unknown";

            System.out.println("Invalid company name. Default value assigned.");

        }

        if (size > 0) {

            employees = new Employee[size];

        } else {

            employees = new Employee[10];

        }

        employeeCount = 0;

    }

    /**

     * Returns the company name.

     *

     * @return company name

     */

    public String getCompanyName() {

        return companyName;

    }

    /**

     * Hires a new employee.

     *

     * @param employee employee to be added

     */

    public void hireEmployee(Employee employee) {

        if (employeeCount >= employees.length) {

            System.out.println("Company capacity reached. Cannot hire more employees.");

            return;

        }

        if (employee == null) {

            System.out.println("Cannot hire a null employee.");

            return;

        }

        if (employeeExists(employee.getEmployeeId())) {

            System.out.println("An employee with this ID already exists.");

            return;

        }

        employees[employeeCount] = employee;

        employeeCount++;

        System.out.println(employee.getName() + " hired successfully.");

    }

    /**

     * Checks whether an employee already exists.

     *

     * @param employeeId employee ID

     * @return true if employee exists, otherwise false

     */

    private boolean employeeExists(String employeeId) {

        return findEmployee(employeeId) != null;

    }

    /**

     * Displays details of all employees.

     */

    public void displayEmployees() {

        if (employeeCount == 0) {

            System.out.println("No employees found.");

            return;

        }

        System.out.println("========================================");

        System.out.println("Company : " + companyName);

        System.out.println("========================================");

        System.out.println();

        for (int i = 0; i < employeeCount; i++) {

            employees[i].displayDetails();

        }

    }

    /**

     * Searches for an employee using the employee ID.

     *

     * @param employeeId employee ID

     * @return Employee object if found, otherwise null

     */

    public Employee findEmployee(String employeeId) {

        if (employeeId == null || employeeId.isBlank()) {

            return null;

        }

        for (int i = 0; i < employeeCount; i++) {

            if (employees[i].getEmployeeId().equals(employeeId)) {

                return employees[i];

            }

        }

        return null;

    }

    /**

     * Removes an employee from the company.

     *

     * @param employeeId employee ID

     * @return true if removed successfully, otherwise false

     */

    public boolean removeEmployee(String employeeId) {

        int removeIndex = findEmployeeIndex(employeeId);

        if (removeIndex == -1) {

            System.out.println("Employee with ID " + employeeId + " not found.");

            return false;

        }

        for (int i = removeIndex; i < employeeCount - 1; i++) {

            employees[i] = employees[i + 1];

        }

        employees[--employeeCount] = null;

        System.out.println("Employee with ID " + employeeId + " removed successfully.");

        return true;

    }

    /**

     * Returns the index of an employee.

     *

     * @param employeeId employee ID

     * @return employee index if found, otherwise -1

     */

    private int findEmployeeIndex(String employeeId) {

        if (employeeId == null || employeeId.isBlank()) {

            return -1;

        }

        for (int i = 0; i < employeeCount; i++) {

            if (employees[i].getEmployeeId().equals(employeeId)) {

                return i;

            }

        }

        return -1;

    }

}
