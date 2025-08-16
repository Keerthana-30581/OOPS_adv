/*
 * Q14: Write a Java program to demonstrate a Scenario of banking system using static keyword.
 * Use:
 * - Static variables – to represent values shared among all objects
 * - A static block – to initialize static data when the class is loaded
 * - Static methods – to operate on static data
 * - Instance variables and methods – to represent object-specific data
 */

package basic_programs;

public class Q14 {
    static String bankName;
    static double interestRate;

    static {
        bankName = "SBI";
        interestRate = 6.5;
        System.out.println("Static block executed: Bank initialized.");
    }

    int accNumber;
    String accHolder;

    Q14(int accNumber, String accHolder) {
        this.accNumber = accNumber;
        this.accHolder = accHolder;
    }

    static void updateInterestRate(double newRate) {
        interestRate = newRate;
    }

    void displayDetails() {
        System.out.println("Account No: " + accNumber + ", Name: " + accHolder +
                           ", Bank: " + bankName + ", Interest Rate: " + interestRate + "%");
    }

    public static void main(String[] args) {
        Q14 a1 = new Q14(1001, "Keer");
        Q14 a2 = new Q14(1002, "Prasad");

        a1.displayDetails();
        a2.displayDetails();

        System.out.println("\nUpdating interest rate...\n");
        Q14.updateInterestRate(7.2);

        a1.displayDetails();
        a2.displayDetails();
    }
}
