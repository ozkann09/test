// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        class BasicOperations {
            // Addition
            public static int add(int num1, int num2) {
                return num1 + num2;
            }

            // Subtraction
            public static int subtract(int num1, int num2) {
                return num1 - num2 ;
            }

            // Multiplication
            public static int multiply(int num1, int num2) {
                return num1 * num2;
            }

            // Division
            public static double divide(double num1, double num2) {
                // Check if num2 is not zero to avoid division by zero
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    System.out.println("Error: Cannot divide by zero");
                    return Double.NaN; // Not a Number
                }
            }

            public static void main(String[] args) {
                // Example usage of the methods
                int resultAdd = add(5, 3);
                System.out.println("Addition: " + resultAdd);

                int resultSubtract = subtract(8, 4);
                System.out.println("Subtraction: " + resultSubtract);

                int resultMultiply = multiply(6, 7);
                System.out.println("Multiplication: " + resultMultiply);

                double resultDivide = divide(10.0, 2.0);
                System.out.println("Division: " + resultDivide);
            }
        }

    }
}