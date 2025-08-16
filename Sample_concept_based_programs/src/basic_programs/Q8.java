/*
 * Q8: Accept two numbers and perform all arithmetic operations (+, -, *, /, %) 
 * and print the results.
 */

package basic_programs;
import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        float division = 0;
        int remainder = 0;

        if (b != 0) {
            division = (float) a / b;
            remainder = a % b;
        } else {
            System.out.println("\nDivision and modulus by 0 is not allowed.");
        }

        System.out.println("\n--- Arithmetic Results ---");
        System.out.println("Addition       : " + a + " + " + b + " = " + sum);
        System.out.println("Subtraction    : " + a + " - " + b + " = " + difference);
        System.out.println("Multiplication : " + a + " * " + b + " = " + product);
        
        if (b != 0) {
            System.out.println("Division       : " + a + " / " + b + " = " + division);
            System.out.println("Modulus        : " + a + " % " + b + " = " + remainder);
        }

        sc.close();
    }
}
