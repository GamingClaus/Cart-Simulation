import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Cart cart = new Cart();
        boolean runShopSimulation = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to our Store!!");
        while(runShopSimulation) {
            System.out.println("-------------Options----------------");
            System.out.println("Press *1* To View Products.");
            System.out.println("Press *2* To Add Product To Your CART.");
            System.out.println("Press *3* TO REMOVE PRODUCT FROM CART.");
            System.out.println("PRESS *4* TO CHECKOUT YOUR ORDER.");
            System.out.println("PRESS *5* TO EXIT APPLICATION.");
            System.out.print("Enter your choice:");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println();
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
