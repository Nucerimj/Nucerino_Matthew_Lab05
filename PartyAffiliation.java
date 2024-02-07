import java.util.Scanner;

public class PartyAffiliation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Party Affiliation Menu:");
        System.out.println("D - Democrat");
        System.out.println("R - Republican");
        System.out.println("I - Independent");
        System.out.println("Enter your choice: ");

        String userChoice = scanner.nextLine().toUpperCase();


        if (userChoice.equals("D")) {
            System.out.println("You get a Democratic Donkey.");
        } else if (userChoice.equals("R")) {
            System.out.println("You get a Republican Elephant.");
        } else if (userChoice.equals("I")) {
            System.out.println("You get an Independent Person.");
        } else {
            System.out.println("You get an Other.");
        }

        scanner.close();
    }
}
