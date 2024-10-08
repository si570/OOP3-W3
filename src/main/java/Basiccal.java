import java.util.Scanner;

public class Basiccal {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);


        System.out.println("Please enter a number: ");
        double num1 = scan1.nextDouble();
        System.out.println("You entered: " + num1);

        System.out.println("Please enter a second number: ");
        double num2 = scan1.nextDouble();
        System.out.println("You entered: " + num2);

        System.out.println("Choose an operation (add, subtract, multiply, divide): ");
        String operation = scan1.next();

        // If user inputs 0 and divide, an error pops up and the program ends
        if (num2 == 0 && operation.equals("divide")) {
            System.out.println("Warning: Cannot divide by zero.");
            System.exit(0);
        }

        // Get result based on the operation
        double result = switch (operation) {
            case "add" -> add(num1, num2);

            case "subtract" -> subtract(num1, num2);

            case "multiply" -> multiply(num1, num2);


            default -> {
                System.out.println("Invalid operation");
                yield 0; // Yield 0 for invalid operation
            }
        };

        // Print the result only if it's valid
        if (result != 0) {
            System.out.println("The result is: " + result);
        }
    }

    // Updated methods to return the result
    public static double add(double num1, double num2) {
        return num1 + num2; // Return the result
    }
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }
}
