/*Q4: Write a program to demonstrate narrowing type conversion from double to int. 
 * Accept a double input and cast it to int. Print both values.
 */

package basic_programs;
import java.util.Scanner;
public class Q4 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number (double): ");
        double doubleValue = sc.nextDouble();
        int intValue = (int) doubleValue;
        System.out.println("\n--- Narrowing Conversion ---");
        System.out.println("Original double value : " + doubleValue);
        System.out.println("Converted int value   : " + intValue);
        sc.close();
    }

}
