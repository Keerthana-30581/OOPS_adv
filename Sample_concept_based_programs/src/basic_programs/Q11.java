/*
 * Q11: Write a program using final keyword to define a constant PI = 3.14159 
 * and use it to calculate the area and circumference of a circle. 
 * Take radius as input.
 */

package basic_programs;
import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double PI = 3.14159;

        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();

        double area = PI * radius * radius;
        double circumference = 2 * PI * radius;

        System.out.println("\n--- Circle Calculations ---");
        System.out.printf("Radius         : %.2f\n", radius);
        System.out.printf("Area           : %.2f\n", area);
        System.out.printf("Circumference  : %.2f\n", circumference);

        System.out.println("\n--- Explanation ---");
        System.out.println("We used 'final double PI = 3.14159' to define a constant.");
        System.out.println("Area = PI * r * r");
        System.out.println("Circumference = 2 * PI * r");

        sc.close();
    }
}
