import java.util.Scanner;

public class ShipCostCalculator
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        double priceOfItem;


        while (true) {
            System.out.print("Enter the price of the item: ");

            try {
                priceOfItem = Double.parseDouble(scanner.nextLine());

                if (priceOfItem > 0) {
                    break;
                } else {
                    System.out.println("Invalid input. Please enter a positive number.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }

        double shippingCost = getShippingCost(priceOfItem);
        double totalPrice = getTotalPrice(priceOfItem, shippingCost);

        System.out.printf("Shipping cost: $%.2f\n", shippingCost);
        System.out.printf("Total price: $%.2f\n", totalPrice);
    }

    public static double getShippingCost(double priceOfItem) {
        if (priceOfItem < 100) {
            return 0;
        } else {
            return priceOfItem * 0.02;
        }
    }

    public static double getTotalPrice(double priceOfItem, double shippingCost) {
        return priceOfItem + shippingCost;
    }
}
