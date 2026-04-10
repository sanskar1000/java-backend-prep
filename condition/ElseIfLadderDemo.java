package condition;

import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : ElseIfLadderDemo
 * Topic        : Conditional Statements (Else-If Ladder)
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program demonstrates the use of an else-if ladder
 * to classify student grades based on marks.
 *
 * Grading Criteria:
 * • Marks ≥ 90  → Grade A
 * • Marks ≥ 75  → Grade B
 * • Marks ≥ 60  → Grade C
 * • Marks ≥ 40  → Grade D
 * • Marks < 40  → Fail
 *
 * Input:
 * • Integer value representing marks
 *
 * Output:
 * • Corresponding grade based on marks
 *
 * Example:
 * Input  : 82
 * Output : Grade: B
 *
 * Time Complexity  : O(1)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class ElseIfLadderDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        if (marks >= 90) {
            System.out.println("Grade: A");
        } 
        else if (marks >= 75) {
            System.out.println("Grade: B");
        } 
        else if (marks >= 60) {
            System.out.println("Grade: C");
        } 
        else if (marks >= 40) {
            System.out.println("Grade: D");
        } 
        else {
            System.out.println("Grade: Fail");
        }

        sc.close();
    }
}
