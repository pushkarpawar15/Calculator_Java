package calculator;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
/**
 * Hello world!
 *
 */
public class App 
{
    private static final Logger logger = LogManager.getLogger(App.class);
    
    public static void main( String[] args )
    {
        logger.info("Hello World");
        System.out.println("Log4j version: " + org.apache.logging.log4j.util.PropertiesUtil.class.getPackage().getImplementationVersion());
        Calculator calculator = new Calculator();
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
                System.out.println("Result: " + calculator.add(num1, num2));
                break;
            case 2:
                System.out.println("Result: " + calculator.subtract(num1, num2));
                break;
            case 3:
                System.out.println("Result: " + calculator.multiply(num1, num2));
                break;
            case 4:
                System.out.println("Result: " + calculator.divide(num1, num2));
                break;
            default:
                System.out.println("Invalid choice. Please choose a valid operation.");
        }

        scanner.close();
    }
}