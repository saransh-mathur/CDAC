import java.util.Scanner;

public class Employee {
    private static int totalEmployees = 0;
    private static double totalSalaryExpense = 0;

    private int id;
    private String name;
    private double salary;

    static {
    }

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        totalEmployees++;
        totalSalaryExpense += salary;
    }

    public static int getTotalEmployees() {
        return totalEmployees;
    }

    public static void applyRaise(double percentage) {
        totalSalaryExpense += totalSalaryExpense * (percentage / 100);
    }

    public static double calculateTotalSalaryExpense() {
        return totalSalaryExpense;
    }

    public void updateSalary(double newSalary) {
        totalSalaryExpense = totalSalaryExpense - this.salary + newSalary;
        this.salary = newSalary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Salary: " + salary;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee emp1 = null;
        Employee emp2 = null;

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Employee");
            System.out.println("2. Apply Raise to All Employees");
            System.out.println("3. Calculate Total Salary Expense");
            System.out.println("4. Update Salary of an Employee");
            System.out.println("5. Display Employee Details");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  

            switch (choice) {
                case 1:
                    System.out.print("Enter Employee ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Enter Employee Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Employee Salary: ");
                    double salary = scanner.nextDouble();
                    scanner.nextLine();  
                    if (emp1 == null) {
                        emp1 = new Employee(id, name, salary);
                    } else {
                        emp2 = new Employee(id, name, salary);
                    }
                    System.out.println("Employee added.");
                    break;

                case 2:
                    System.out.print("Enter percentage raise: ");
                    double percentage = scanner.nextDouble();
                    scanner.nextLine();  
                    Employee.applyRaise(percentage);
                    System.out.println("Raise applied to all employees.");
                    break;

                case 3:
                    System.out.println("Total Salary Expense: " + Employee.calculateTotalSalaryExpense());
                    break;

                case 4:
                    if (emp1 != null) {
                        System.out.print("Enter new salary for Employee " + emp1.getId() + ": ");
                        double newSalary = scanner.nextDouble();
                        scanner.nextLine(); 
                        emp1.updateSalary(newSalary);
                        System.out.println("Salary updated.");
                    } else {
                        System.out.println("No employee to update.");
                    }
                    break;

                case 5:
                    if (emp1 != null) {
                        System.out.println(emp1);
                    }
                    if (emp2 != null) {
                        System.out.println(emp2);
                    }
                    break;

                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}
