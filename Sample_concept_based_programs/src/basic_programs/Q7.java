/*
 * Q7: Accept three numbers and calculate the average using a single expression. 
 * Analyze how precedence affects the result.
 */

package basic_programs;
import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double n1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double n2 = sc.nextDouble();

        System.out.print("Enter third number: ");
        double n3 = sc.nextDouble();

        double average = (n1 + n2 + n3) / 3;

        System.out.println("\n--- Result ---");
        System.out.printf("Numbers entered are: %.2f, %.2f and %.2f\n", n1, n2, n3);
        System.out.printf("Average is: %.2f\n", average);

        System.out.println("\n--- Explanation ---");
        System.out.println("Expression used: (n1 + n2 + n3) / 3");
        System.out.println("1. Parentheses are evaluated first → (n1 + n2 + n3)");
        System.out.println("2. Then the result is divided by 3");
        System.out.println("This ensures correct operator precedence and accurate result.");

        sc.close();
    }
}
