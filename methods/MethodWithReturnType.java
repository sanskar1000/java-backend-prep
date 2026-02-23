package methods;


/*
 Program: MethodBasics
 Purpose: Demonstrate basic method creation and usage
 Concept: Method Return Type
*/

public class MethodWithReturnType {

    static int getSquare(int number) {
        return number * number;
    }

    public static void main(String[] args) {
        int result = getSquare(5);
        System.out.println("Square = " + result);
    }
}
