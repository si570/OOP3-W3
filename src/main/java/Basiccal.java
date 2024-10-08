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
    }
}
