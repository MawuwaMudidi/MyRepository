//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Create an instance of CalculatorClass
        Calculator calculator = new CalculatorClass();

        // Define two numbers for calculation
        double a = 20;
        double b = 5;

        // Perform and display the sum
        System.out.println("Sum: " + calculator.sum(a, b));

        // Perform and display the subtraction
        System.out.println("Subtract: " + calculator.subtract(a, b));

        // Perform and display the multiplication
        System.out.println("Multiply: " + calculator.multiply(a, b));

        // Perform and display the division
        System.out.println("Divide: " + calculator.divide(a, b));

    }
}