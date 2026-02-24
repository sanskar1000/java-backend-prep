package methods;

/*
 Program: MethodOverloading
 Purpose: Demonstrate method overloading in Java
 Concept: Same method name with different parameter lists
*/

public class MethodOverloading {

    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println(add(5, 10));
        System.out.println(add(5, 10, 15));
    }
}
