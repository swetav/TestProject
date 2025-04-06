package logicalQuestions;

import java.util.Scanner;

// Custom Exception
class NegativeSalaryException extends Exception {
    public NegativeSalaryException(String message) {
        super(message);
    }
}

// Employee Class
class Employee {
    private String name;
    private double basicSalary, hra, da, tax, netSalary;

    public Employee(String name, double basicSalary) throws NegativeSalaryException {
        if (basicSalary < 0) {
            throw new NegativeSalaryException("❌ Salary cannot be negative.");
        }

        this.name = name;
        this.basicSalary = basicSalary;
        calculateSalary();
    }

    private void calculateSalary() {
        hra = 0.10 * basicSalary;
        da = 0.05 * basicSalary;
        double grossSalary = basicSalary + hra + da;

        if (grossSalary > 50000) {
            tax = 0.10 * grossSalary;
        } else {
            tax = 0;
        }

        netSalary = grossSalary - tax;
    }

    public void displaySalaryDetails() {
        System.out.println("\n--- Employee Salary Details ---");
        System.out.println("👤 Name: " + name);
        System.out.println("💼 Basic Salary: ₹" + basicSalary);
        System.out.println("🏠 HRA (10%): ₹" + hra);
        System.out.println("📈 DA (5%): ₹" + da);
        System.out.println("💸 Tax: ₹" + tax);
        System.out.println("🧾 Net Salary: ₹" + netSalary);
    }
}

// Main Class
public class EmployeePayrollSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter employee name: ");
            String name = scanner.nextLine();

            System.out.print("Enter basic salary: ₹");
            double salary = scanner.nextDouble();

            Employee emp = new Employee(name, salary);
            emp.displaySalaryDetails();

        } catch (NegativeSalaryException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(" Invalid input. Please enter correct data.");
        } finally {
            scanner.close();
        }
    }
}