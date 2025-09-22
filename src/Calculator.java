import java.util.Scanner;
public class Calculator {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            char choice = 0;

            do {
                System.out.print("Enter first number: ");
                double num1 = scanner.nextDouble();

                System.out.print("Enter operator (+, -, *, /): ");
                char op = scanner.next().charAt(0);

                System.out.print("Enter second number: ");
                double num2 = scanner.nextDouble();

                double result;

                switch (op) {
                    case '+':
                        result = num1 + num2;
                        break;
                    case '-':
                        result = num1 - num2;
                        break;
                    case '*':
                        result = num1 * num2;
                        break;
                    case '/':
                        if (num2 != 0) {
                            result = num1 / num2;
                        } else {
                            System.out.println("Error! Division by zero.");
                            continue;
                        }
                        break;
                    default:
                        System.out.println("Invalid operator!");
                        continue;
                }

                System.out.println("Result: " + result);

                System.out.print("Do you want to perform another calculation? (y/n): ");
                choice = scanner.next().charAt(0);

            } while (choice == 'y' || choice == 'Y');

            System.out.println("Calculator exited. Goodbye!");
            scanner.close();
        }
    }
