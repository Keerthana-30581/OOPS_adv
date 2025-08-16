/*Q1: Write a Java program to declare variables of all primitive data types. 
 * Initialize them with valid values and print their sizes using appropriate wrappers.
 */
package basic_programs;
public class Q1 {
	public static void main(String[] args) {
        byte b = 100;
        short s = 30000;
        int i = 100000;
        long l = 10000000000L;
        float f = 3.14f;
        double d = 3.1415926535;
        char c = 'A';
        boolean bool = true;
        System.out.println("Primitive Data Types and Their Sizes:\n");
        System.out.println("byte    : " + b + " | Size: " + Byte.SIZE + " bits");
        System.out.println("short   : " + s + " | Size: " + Short.SIZE + " bits");
        System.out.println("int     : " + i + " | Size: " + Integer.SIZE + " bits");
        System.out.println("long    : " + l + " | Size: " + Long.SIZE + " bits");
        System.out.println("float   : " + f + " | Size: " + Float.SIZE + " bits");
        System.out.println("double  : " + d + " | Size: " + Double.SIZE + " bits");
        System.out.println("char    : " + c + " | Size: " + Character.SIZE + " bits");
        System.out.println("boolean : " + bool + " | Size: JVM-dependent (typically 1 bit or 1 byte)");
    }
}
