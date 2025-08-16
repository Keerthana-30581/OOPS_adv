/*
 * Q13: Write a Java program to demonstrate the use of static keyword in the context of a student management system,
 * which includes:
 * - A static variable to represent the college name shared by all students
 * - A static block to initialize the static variable
 * - A static method to change the college name
 * - Instance variables to store student ID and name
 * - A method to display student details, including the shared college name
 */

package basic_programs;

public class Q13 {
    int id;
    String name;
    static String college;

    static {
        college = "KL University";
        System.out.println("Static block executed: College initialized.");
    }

    static void changeCollege(String newCollege) {
        college = newCollege;
    }

    Q13(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", College: " + college);
    }

    public static void main(String[] args) {
        Q13 s1 = new Q13(101, "Keerthana");
        Q13 s2 = new Q13(102, "Raj");

        s1.display();
        s2.display();

        System.out.println("\nChanging college name...\n");
        Q13.changeCollege("IIT Hyderabad");

        s1.display();
        s2.display();
    }
}
