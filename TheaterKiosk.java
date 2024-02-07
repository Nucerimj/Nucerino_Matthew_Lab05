import java.util.Scanner;

public class TheaterKiosk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Welcome to the Theater Kiosk!\nPlease enter your age: ");

        try {
            int age = Integer.parseInt(scanner.nextLine());

            if (age >= 21) {
                System.out.println("Congratulations! You get a wristband.");
            } else {
                System.out.println("Sorry, you are not 21 or older. No wristband for you.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid age as a number.");
        }

        scanner.close();
    }
}
