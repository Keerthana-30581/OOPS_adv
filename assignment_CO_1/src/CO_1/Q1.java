package CO_1;

public class Q1 {
    private String name;
    private int id;

    private static int employeeCount = 0;

    public Q1(String name, int id) {
        this.name = name;
        this.id = id;
        employeeCount++;
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
    }
    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + employeeCount);
    }

    public static void main(String[] args) {
        Q1 e1 = new Q1("Alice", 101);
        Q1 e2 = new Q1("Bob", 102);
        Q1 e3 = new Q1("Charlie", 103);

        System.out.println("----- Individual Employee Details -----");
        e1.displayEmployeeDetails();
        e2.displayEmployeeDetails();
        e3.displayEmployeeDetails();

        System.out.println("\n----- Total Employees -----");
        Q1.displayTotalEmployees();
    }
}

