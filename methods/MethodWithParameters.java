package methods;

/*
 Program: MethodBasics
 Purpose: Demonstrate basic method creation and usage
 Concept: Method parameters
*/

public class MethodWithParameters {

    static void printSum(int a, int b) {
        int sum = a + b;
        System.out.println("Sum = " + sum);
    }

    public static void main(String[] args) {
        printSum(10, 20);
    }
}
