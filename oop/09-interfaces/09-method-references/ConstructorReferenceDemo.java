import java.util.function.Function;

/*
 * Program: ConstructorReferenceDemo
 *
 * Purpose:
 * Demonstrates Constructor References using
 * the Function Functional Interface.
 *
 * Concepts:
 * - Constructor Reference
 * - Function<T, R>
 * - ClassName::new
 * - Creating objects using method references
 */

class Employee {

    private String name;

    // Constructor
    public Employee(String name) {
        this.name = name;
    }

    // Getter
    public String getName() {
        return name;
    }
}

public class ConstructorReferenceDemo {

    public static void main(String[] args) {

        /*
         * Constructor Reference
         *
         * Equivalent Lambda:
         * text -> new StringBuilder(text)
         */
        Function<String, StringBuilder> builderCreator =
                StringBuilder::new;

        StringBuilder builder =
                builderCreator.apply("Hello Java");

        System.out.println("StringBuilder: " + builder);

        /*
         * Constructor Reference
         *
         * Equivalent Lambda:
         * name -> new Employee(name)
         */
        Function<String, Employee> employeeCreator =
                Employee::new;

        Employee employee =
                employeeCreator.apply("Aradhya");

        System.out.println(
                "Employee Name: " + employee.getName()
        );
    }
}
