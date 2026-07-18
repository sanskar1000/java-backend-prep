/**
 * ------------------------------------------------------------
 * Program Name : EmployeeDemo
 * Topic        : Inheritance in Java
 * Level        : Beginner to Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program demonstrates Single Inheritance in Java
 * using an Employee Management System.
 *
 * The Employee class acts as the parent (superclass)
 * containing common employee information and behavior.
 *
 * The Developer and Manager classes inherit all common
 * properties from Employee and introduce their own
 * specialized fields and behaviors.
 *
 * OOP Concepts Demonstrated:
 * • Classes and Objects
 * • Constructors
 * • Constructor Chaining using super()
 * • Inheritance
 * • Code Reusability
 * • Encapsulation
 * • Method Reuse
 * • Data Validation
 *
 * Classes:
 *
 * Employee (Parent Class)
 * -----------------------
 * Fields:
 * • employeeId
 * • name
 * • salary
 *
 * Methods:
 * • getEmployeeId()
 * • getName()
 * • getSalary()
 * • work()
 * • displayEmployeeDetails()
 *
 * Developer (Child Class)
 * -----------------------
 * Additional Field:
 * • programmingLanguage
 *
 * Additional Methods:
 * • getProgrammingLanguage()
 * • writeCode()
 * • displayDeveloperDetails()
 *
 * Manager (Child Class)
 * ---------------------
 * Additional Field:
 * • teamSize
 *
 * Additional Methods:
 * • getTeamSize()
 * • conductMeeting()
 * • displayManagerDetails()
 *
 * Program Flow:
 * 1. Create Developer object.
 * 2. Create Manager object.
 * 3. Display employee details.
 * 4. Execute inherited methods.
 * 5. Execute child-specific methods.
 *
 * Time Complexity:
 * All operations : O(1)
 *
 * Space Complexity:
 * O(1)
 * ------------------------------------------------------------
 */
 /**
 * ------------------------------------------------------------
 * Class Name   : Employee
 * Type         : Parent Class (Superclass)
 *
 * Description:
 * Represents a generic employee of a company.
 * It stores common employee information and
 * provides behaviors shared by all employees.
 *
 * Features:
 * • Store employee details
 * • Validate employee information
 * • Display employee details
 * • Perform common work
 * ------------------------------------------------------------
 */
 class Employee{

    private String employeeId;
    private String name;
    private double salary;

    /**
    * Constructs an Employee object.
    *
    * @param employeeId unique employee ID
    * @param name employee name
    * @param salary employee salary
    */

    Employee(String employeeId, String name, double salary){

        if (employeeId != null && !employeeId.isBlank()){
            this.employeeId = employeeId;
        }else {
            this.employeeId = "Unknown";
            System.out.println("Invalid employee Id. Default value assigned");
        }

        if (name != null && !name.isBlank()){
            this.name = name;
        }else {
            this.name = "Unknown";
            System.out.println("Invalid name. Default value assigned");
        }

        if (salary >= 0){
            this.salary = salary;
        }else {
            this.salary = 0.0 ;
            System.out.println("Invalid salary. Default value assigned");
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
    * Simulates an employee performing work.
    */

    public void work(){
          System.out.println("Employee is working.");
      }

     /**
     * Displays employee information.
     */

     public void displayEmployeeDetails(){

          System.out.println("-------Employee Details-------");

          System.out.println("Employee Id : " + employeeId);
          System.out.println("Name        : " + name);
          System.out.printf("Salary      : ₹%.2f%n" , salary);
          System.out.println();
      }

}
/**
 * ------------------------------------------------------------
 * Class Name   : Developer
 * Type         : Child Class
 *
 * Description:
 * Represents a software developer.
 * Inherits all common employee properties
 * from the Employee class and adds a
 * programming language specialization.
 *
 * Additional Features:
 * • Store programming language
 * • Write code
 * • Display developer information
 * ------------------------------------------------------------
 */
 class Developer extends Employee{

    private String programmingLanguage;

    /**
    * Constructs a Developer object.
    *
    * @param employeeId unique employee ID
    * @param name employee name
    * @param salary employee salary
    * @param programmingLanguage programming language
    */

    public Developer(String employeeId,
              String name,
              double salary, String programmingLanguage){

        super(employeeId, name, salary);

        if (programmingLanguage != null && !programmingLanguage.isBlank()) {
            this.programmingLanguage = programmingLanguage;
        }else {
            this.programmingLanguage = "Unknown";
            System.out.println("Invalid programming language. Default value assigned");
        }
    }

    /**
    * Returns the programming language.
    *
    * @return programming language
    */ 

    public String getProgrammingLanguage() {
        return programmingLanguage;
    } 

    /**
    * Simulates writing source code.
    */

    public void writeCode(){
        System.out.println("Developer is writing code.");
    }

    /**
    * Displays complete developer information.
    */
    
    public void displayDeveloperDetails(){

        displayEmployeeDetails();
        System.out.println("----- Developer Details -----");
        System.out.println("Programming Language : " + programmingLanguage);

    }
}
/**
 * ------------------------------------------------------------
 * Class Name   : Manager
 * Type         : Child Class
 *
 * Description:
 * Represents a manager in the company.
 * Inherits common employee properties
 * and adds team management information.
 *
 * Additional Features:
 * • Store team size
 * • Conduct meetings
 * • Display manager information
 * ------------------------------------------------------------
 */
class Manager extends Employee{

   private int teamSize;

   /**
   * Constructs a Manager object.
   *
   * @param employeeId unique employee ID
   * @param name employee name
   * @param salary employee salary
   * @param teamSize number of team members
   */
 
   public Manager(String employeeId,
           String name,
           double salary, int teamSize){

       super(employeeId, name, salary);

       if (teamSize > 0) {
           this.teamSize = teamSize;
       } else {
           this.teamSize = 0;
           System.out.println("Invalid team size.");
       }
    }

    /**
    * Returns the team size.
    *
    * @return team size
    */

    public int getTeamSize() {
        return teamSize;
    }

    /**
    * Simulates conducting a team meeting.
    */
 
    public void conductMeeting(){

       System.out.println("Meeting is conducted.");
    }
  
    /**
    * Displays complete manager information.
    */
  
    public void displayManagerDetails(){

       displayEmployeeDetails();
       System.out.println("Team size : " + teamSize);
   }

}
/**
 * ------------------------------------------------------------
 * Class Name   : Main
 *
 * Description:
 * Entry point of the Employee Inheritance Demo.
 *
 * Demonstrates:
 * • Creating Developer and Manager objects
 * • Calling inherited methods
 * • Calling child-specific methods
 * • Understanding Single Inheritance
 * • Demonstrating code reuse through inheritance
 *
 * Execution Flow:
 * 1. Create Developer object
 * 2. Create Manager object
 * 3. Display employee information
 * 4. Call inherited methods
 * 5. Call child-specific methods
 * ------------------------------------------------------------
 */
public class Main {

    /**
    * Program execution starts here.
    *
    * @param args command-line arguments
    */

    public static void main(String[] args) {

      Developer e1 = new Developer("E404", "Pankaj", 50000.0, "Java");
      Manager e2 = new Manager("E909","Rohit", 90000.0, 2);

        System.out.println("=============== Employee 1 ===============");

        e1.displayDeveloperDetails();
        e1.work();
        e1.writeCode();

        System.out.println("=============== Employee 2 ===============");

        e2.displayManagerDetails();
        e2.work();
        e2.conductMeeting();


    }

}
