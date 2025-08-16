/*Q3: Write a program to demonstrate widening type conversion from int → long → float. 
 * Show that no data is lost.
 */

package basic_programs;

public class Q3 {
	public static void main(String[] args) {
        int numInt = 123456789;
        long numLong = numInt;           
        float numFloat = numLong;        
        System.out.println("Original int value      : " + numInt);
        System.out.println("After widening to long  : " + numLong);
        System.out.println("After widening to float : " + numFloat);
        if (numInt == (int)numFloat) {
            System.out.println("\nNo data loss during widening conversion.");
        } else {
            System.out.println("\nData may be lost in float conversion.");
        }
    }
}
