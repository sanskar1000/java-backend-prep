/**
 * Demonstrates the basic hierarchy of exceptions in Java.
 *
 * <p>Java's exception hierarchy starts with {@link Throwable}.
 * The two major branches are {@link Error} and {@link Exception}.</p>
 *
 * <pre>
 * Throwable
 *    ├── Error
 *    │    ├── StackOverflowError
 *    │    └── OutOfMemoryError
 *    │
 *    └── Exception
 *         ├── RuntimeException
 *         │    ├── ArithmeticException
 *         │    ├── NullPointerException
 *         │    └── ArrayIndexOutOfBoundsException
 *         │
 *         └── Other checked exceptions
 *              └── IOException
 * </pre>
 */
public class ExceptionHierarchyDemo {

    public static void main(String[] args) {

        System.out.println("========== Exception Hierarchy ==========");

        System.out.println("\nThrowable");
        System.out.println("├── Error");
        System.out.println("│   ├── StackOverflowError");
        System.out.println("│   └── OutOfMemoryError");

        System.out.println("└── Exception");
        System.out.println("    ├── RuntimeException");
        System.out.println("    │   ├── ArithmeticException");
        System.out.println("    │   ├── NullPointerException");
        System.out.println("    │   └── ArrayIndexOutOfBoundsException");
        System.out.println("    │");
        System.out.println("    └── Checked Exceptions");
        System.out.println("        └── IOException");

        System.out.println("\n========== Key Classes ==========");

        // ArithmeticException is a RuntimeException.
        ArithmeticException arithmeticException =
                new ArithmeticException();

        // NullPointerException is a RuntimeException.
        NullPointerException nullPointerException =
                new NullPointerException();

        // RuntimeException is a subclass of Exception.
        RuntimeException runtimeException =
                new RuntimeException();

        // Exception is a subclass of Throwable.
        Exception exception =
                new Exception();

        // Error is also a direct subclass of Throwable.
        Error error =
                new Error();

        System.out.println(
                "ArithmeticException → "
                        + arithmeticException.getClass().getSimpleName()
        );

        System.out.println(
                "NullPointerException → "
                        + nullPointerException.getClass().getSimpleName()
        );

        System.out.println(
                "RuntimeException → "
                        + runtimeException.getClass().getSimpleName()
        );

        System.out.println(
                "Exception → "
                        + exception.getClass().getSimpleName()
        );

        System.out.println(
                "Error → "
                        + error.getClass().getSimpleName()
        );
    }
}
