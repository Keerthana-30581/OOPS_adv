/*
 * Q15: Write a Java program to demonstrate the use of this keyword with variables and this() for constructor chaining.
 * - Create a Student class with id, name, and course
 * - Use this() to call a parameterized constructor from the default constructor
 * - Use this.variable to differentiate instance variables
 * - Display student details using a method
 * - Create two objects (one with default and one with parameterized constructor)
 */

package basic_programs;

public class Q15 {
    int id;
    String name;
    String course;

    Q15() {
        this(1001, "Default Student", "CSE");
    }

    Q15(int id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    void display() {
        System.out.println("ID: " + this.id + ", Name: " + this.name + ", Course: " + this.course);
    }

    public static void main(String[] args) {
        Q15 s1 = new Q15();  
        Q15 s2 = new Q15(2002, "Keerthana", "AI/ML");

        s1.display();
        s2.display();
    }
}
