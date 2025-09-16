import java.util.Scanner;
class Calculator {
    double a, b;
    String operation;
    Calculator(double a, double b, String operation) {
        this.a = a;
        this.b = b;
        this.operation = operation;
    }
    double calculate() {
        if (operation.equalsIgnoreCase("add")) {
            return a + b;
        } else if (operation.equalsIgnoreCase("sub")) {
            return a - b;
        } else if (operation.equalsIgnoreCase("mul")) {
            return a * b;
        } else if (operation.equalsIgnoreCase("div")) {
            if (b == 0) {
                System.out.println("Division by zero not allowed!");
                return 0;
            }
            return a / b;
        } else {
            System.out.println("Invalid operation!");
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter second number: ");
        double b = sc.nextDouble();
        System.out.print("Enter operation (add, sub, mul, div): ");
        String op = sc.next();
        Calculator c = new Calculator(a, b, op);
        System.out.println("Result: " + c.calculate());
    }
}
