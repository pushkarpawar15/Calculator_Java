package calculator;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App 
{
    private static final Logger logger = LogManager.getLogger(App.class);
    public static int add(int num1, int num2) {
        logger.info("Addition function executed");
        return num1 + num2;
    }

    public static int subtract(int num1, int num2) {
        logger.info("Subtraction function executed");
        return num1 - num2;
    }

    public static int multiply(int num1, int num2) {
        logger.info("Multiplication function executed");
        return num1 * num2;
    }

    public static double divide(double num1, double num2) {
        logger.info("Division function executed");

        if (num2 != 0) {
            return num1 / num2;
        } else {
            throw new ArithmeticException("Division by zero is not allowed");
        }
    }
    public static void main( String[] args )
    {
        // System.out.println("Log4j version: " + org.apache.logging.log4j.util.PropertiesUtil.class.getPackage().getImplementationVersion());
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Console Calculator!");
        System.out.println("Enter two numbers:");

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        System.out.println("Select operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Result: " + add(num1, num2));
                break;
            case 2:
                System.out.println("Result: " + subtract(num1, num2));
                break;
            case 3:
                System.out.println("Result: " + multiply(num1, num2));
                break;
            case 4:
                System.out.println("Result: " + divide(num1, num2));
                break;
            default:
                System.out.println("Invalid choice. Please choose a valid operation.");
        }

        scanner.close();
    }
}