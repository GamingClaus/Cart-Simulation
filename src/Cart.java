import java.util.ArrayList;
import java.util.Scanner;

public class Cart {
    Scanner scanner = new Scanner(System.in);
    Shop shop = new Shop();
    ArrayList<Items> cartItems = new ArrayList<>();
    Cart(){
        
    }

    public void addItem() {
        System.out.println("Which item do you want to add(Enter its id):");
        int itemId = scanner.nextInt();
        scanner.nextLine();
        if(shop.shopItems.containsKey(itemId)){
            Items itemToAdd = shop.shopItems.get(itemId);
            cartItems.add(itemToAdd);
            System.out.println(cartItems);
            System.out.println(" Successfully added "+ itemToAdd.getName() +" with the price $"+ itemToAdd.getPrice() +" to the cart.");
        }
        else{
            System.out.println("Error adding the item to the cart.");
        }
    }



    public void removeItem() {
        System.out.println("Which item do you want to remove");
        String name = scanner.next();

        for(int i = 0;i < cartItems.size();i++){
            //continuing later


        }
    }

    public void checkOut() {
    }


}
