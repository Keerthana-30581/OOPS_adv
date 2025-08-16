/*Q6: Evaluate and print the result of the following expressions:
10 + 2 * 5
(10 + 2) * 5
100 / 5 + 2 * 3 - 4
*/

package basic_programs;

public class Q6 {
	public static void main(String[] args) {
        int expr1 = 10 + 2 * 5;
        int expr2 = (10 + 2) * 5;
        int expr3 = 100 / 5 + 2 * 3 - 4;
        System.out.println("--- Expression Evaluation with Operator Precedence ---\n");
        System.out.println("1. 10 + 2 * 5");
        System.out.println("   = " + expr1);
        System.out.println("   Explanation: Multiplication (*) has higher precedence than addition (+)");
        System.out.println("   => 10 + (2 * 5) = 10 + 10 = 20\n");
        System.out.println("2. (10 + 2) * 5");
        System.out.println("   = " + expr2);
        System.out.println("   Explanation: Parentheses are evaluated first");
        System.out.println("   => (10 + 2) * 5 = 12 * 5 = 60\n");
        System.out.println("3. 100 / 5 + 2 * 3 - 4");
        System.out.println("   = " + expr3);
        System.out.println("   Explanation:");
        System.out.println("   Step 1: Division and multiplication are evaluated left to right (same precedence)");
        System.out.println("     => (100 / 5) = 20");
        System.out.println("     => (2 * 3) = 6");
        System.out.println("   Step 2: 20 + 6 - 4 = 22\n");
    }
}
