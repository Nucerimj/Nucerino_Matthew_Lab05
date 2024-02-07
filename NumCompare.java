import java.util.Scanner;

public class NumCompare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");

        try {
            double num1 = Double.parseDouble(scanner.nextLine());

            System.out.print("Enter the second number: ");

            try {
                double num2 = Double.parseDouble(scanner.nextLine());

                if (num1 == num2) {
                    System.out.println("The numbers are equal.");
                } else {
                    System.out.println("The smaller number is: " + Math.min(num1, num2));
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input for the second number. Please enter a valid number.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input for the first number. Please enter a valid number.");
        }

        scanner.close();
    }
}
