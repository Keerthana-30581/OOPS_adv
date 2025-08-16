/*Q5: Accept a character from the user and display its ASCII value. 
 * Also convert that ASCII value into an integer.
 */

package basic_programs;
import java.util.Scanner;
public class Q5 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        int ascii = (int) ch;
        System.out.println("\n--- ASCII Conversion ---");
        System.out.println("Character entered : " + ch);
        System.out.println("ASCII value       : " + ascii);
        sc.close();
    }
}
