package condition.practice;
import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : RailwayTicketBooking
 * Topic        : Nested if-else
 * Level        : Beginner / Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program checks railway ticket booking eligibility.
 *
 * Rules:
 * • Age < 5 → No ticket required
 * • Age ≥ 5 → Ticket required
 * • Valid ID required
 * • Seat must be available
 *
 * Key Concepts:
 * • Nested if-else
 * • Input validation
 * • Real-world logic
 *
 * Example:
 * Input  : age=25, ID=true, seat=true
 * Output : Booking successful
 *
 * Time Complexity  : O(1)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class RailwayTicketBooking {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("------ Railway Ticket Booking ------\n");

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        if (age < 0) {
            System.out.println("Invalid age ❌");
            return;
        }

        if (age < 5) {
            System.out.println("No ticket required 👶");
            return;
        }

        System.out.print("Is ID valid (true/false): ");
        boolean hasId = sc.nextBoolean();

        if (hasId) {

            System.out.print("Seat available (true/false): ");
            boolean hasSeat = sc.nextBoolean();

            if (hasSeat) {
                System.out.println("Booking successful ✔");
            } else {
                System.out.println("No seats available ❌");
            }

        } else {
            System.out.println("ID required ❌");
        }

        sc.close();
    }
}
