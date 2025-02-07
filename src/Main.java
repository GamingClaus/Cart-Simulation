import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Cart cart = new Cart();
        boolean runShopSimulation = true;
        Scanner scanner = new Scanner(System.in);
        while(runShopSimulation) {
            System.out.println("1. Open Shop");
            System.out.println("2. Add Item to Cart");
            System.out.println("3. Remove Item from Cart");
            System.out.println("4. Checkout");
            System.out.println("5. Exit the Program");
            System.out.print("Enter your choice:");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    shop.displayShopList();
                    break;
                case 2:
                    cart.addItem();
                    break;
                case 3:
                    cart.removeItem();
                    break;
                case 4:
                    cart.checkOut();
                    break;
                case 5:
                    runShopSimulation = false;
                    System.out.println("You have exited the program.");
                    break;
                default:
                    System.out.println("Enter a valid choice!");
                    break;
            }

        }
    }
}
