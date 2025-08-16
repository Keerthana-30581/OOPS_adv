/*
 * Q16: Write a Java program to demonstrate the use of super keyword.
 * - Create a Person class with a constructor and a method
 * - Create a Student class that extends Person
 * - Use super() to call the parent class constructor
 * - Use super.method() to call the parent class method
 * - Display student details including inherited data
 */

package basic_programs;

class Person {
    String name;

    Person(String name) {
        this.name = name;
        System.out.println("Person constructor called.");
    }

    void showDetails() {
        System.out.println("Person Name: " + name);
    }
}

public class Q16 extends Person {
    int id;

    Q16(int id, String name) {
        super(name);
        this.id = id;
        System.out.println("Student constructor called.");
    }

    void showDetails() {
        super.showDetails(); 
        System.out.println("Student ID: " + id);
    }

    public static void main(String[] args) {
        Q16 s = new Q16(101, "Keer");
        s.showDetails();
    }
}
