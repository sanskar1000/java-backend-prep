import java.util.TreeSet;

/**
 * ------------------------------------------------------------
 * Program Name : TreeSet Navigation Operations
 * Topic        : Java Collections - TreeSet
 * Level        : Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * Demonstrates TreeSet navigation methods used to find elements
 * relative to a given value.
 *
 * Key Concepts:
 * • first()   - returns the smallest element.
 * • last()    - returns the largest element.
 * • higher()  - returns the smallest element strictly greater.
 * • lower()   - returns the largest element strictly smaller.
 * • ceiling() - returns the smallest element greater than or equal.
 * • floor()   - returns the largest element less than or equal.
 *
 * TreeSet maintains elements in sorted order and does not
 * allow duplicate elements.
 *
 * Time Complexity:
 * • higher()  : O(log n)
 * • lower()   : O(log n)
 * • ceiling() : O(log n)
 * • floor()   : O(log n)
 * • first()   : O(log n)
 * • last()    : O(log n)
 *
 * Space Complexity : O(n)
 * ------------------------------------------------------------
 */
public class TreeSetNavigation {

    public static void main(String[] args) {

        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);
        numbers.add(70);

        System.out.println("TreeSet : " + numbers);

        // --------------------------------------------------------
        // Basic Navigation
        // --------------------------------------------------------

        // Smallest element
        System.out.println("Smallest : " + numbers.first());

        // Largest element
        System.out.println("Largest : " + numbers.last());

        // Smallest element strictly greater than 40
        System.out.println("Higher than 40 : " + numbers.higher(40));

        // Largest element strictly smaller than 40
        System.out.println("Lower than 40 : " + numbers.lower(40));

        // Smallest element greater than or equal to 40
        System.out.println("Ceiling of 40 : " + numbers.ceiling(40));

        // Largest element less than or equal to 40
        System.out.println("Floor of 40 : " + numbers.floor(40));

        // --------------------------------------------------------
        // Navigation When Element Does Not Exist
        // --------------------------------------------------------

        // Smallest element strictly greater than 45
        System.out.println("Higher than 45 : " + numbers.higher(45));

        // Largest element strictly smaller than 45
        System.out.println("Lower than 45 : " + numbers.lower(45));

        // Smallest element greater than or equal to 45
        System.out.println("Ceiling of 45 : " + numbers.ceiling(45));

        // Largest element less than or equal to 45
        System.out.println("Floor of 45 : " + numbers.floor(45));

        // --------------------------------------------------------
        // Add 45 and Observe the Difference
        // --------------------------------------------------------

        numbers.add(45);

        System.out.println("\nAfter adding 45:");
        System.out.println("TreeSet : " + numbers);

        System.out.println("Higher than 45 : " + numbers.higher(45));
        System.out.println("Lower than 45 : " + numbers.lower(45));
        System.out.println("Ceiling of 45 : " + numbers.ceiling(45));
        System.out.println("Floor of 45 : " + numbers.floor(45));

        // --------------------------------------------------------
        // Practical Example: Memory Capacities
        // --------------------------------------------------------

        TreeSet<Integer> capacities = new TreeSet<>();

        capacities.add(8);
        capacities.add(16);
        capacities.add(32);
        capacities.add(64);
        capacities.add(128);
        capacities.add(256);

        System.out.println("\nMemory Capacities : " + capacities);

        System.out.println("Smallest capacity greater than 50 : "
                + capacities.higher(50));

        System.out.println("Largest capacity less than 50 : "
                + capacities.lower(50));

        System.out.println("Smallest capacity >= 50 : "
                + capacities.ceiling(50));

        System.out.println("Largest capacity <= 50 : "
                + capacities.floor(50));

        // --------------------------------------------------------
        // Practical Example: Product Prices
        // --------------------------------------------------------

        TreeSet<Integer> prices = new TreeSet<>();

        prices.add(100);
        prices.add(250);
        prices.add(500);
        prices.add(750);
        prices.add(1000);
        prices.add(1500);
        prices.add(2000);

        System.out.println("\nPrices : " + prices);

        System.out.println(
                "Cheapest price strictly greater than ₹800 : "
                        + prices.higher(800)
        );

        System.out.println(
                "Most expensive price strictly less than ₹800 : "
                        + prices.lower(800)
        );

        System.out.println(
                "Cheapest price greater than or equal to ₹800 : "
                        + prices.ceiling(800)
        );

        System.out.println(
                "Most expensive price less than or equal to ₹800 : "
                        + prices.floor(800)
        );

        // --------------------------------------------------------
        // Target = 750
        // --------------------------------------------------------

        System.out.println("\nNavigation for ₹750:");

        System.out.println(
                "Cheapest price strictly greater than ₹750 : "
                        + prices.higher(750)
        );

        System.out.println(
                "Most expensive price strictly less than ₹750 : "
                        + prices.lower(750)
        );

        System.out.println(
                "Cheapest price greater than or equal to ₹750 : "
                        + prices.ceiling(750)
        );

        System.out.println(
                "Most expensive price less than or equal to ₹750 : "
                        + prices.floor(750)
        );
    }
}
