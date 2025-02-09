import java.util.HashMap;
import java.util.Map;

public class Shop {
     Map<Integer,Items> shopItems;

    Shop(){
        shopItems = new HashMap<>();

        initializeShop(); //setting up the shop at the start.
    }

    private void initializeShop(){
        shopItems.put(1, new Items("Socks", 4));
        shopItems.put(2, new Items("T-Shirt", 15));
        shopItems.put(3, new Items("Jeans", 30));
        shopItems.put(4, new Items("Shoes", 60));
        shopItems.put(5, new Items("Hoodie", 25));
        shopItems.put(6, new Items("Hat", 10));
        shopItems.put(7, new Items("Gloves", 8));
    }


    public void displayShopList(){
        System.out.println("*-------Displaying the Items----------*");
        for(Map.Entry<Integer,Items> shopItem : shopItems.entrySet()){
            System.out.println( "id:"+shopItem.getKey()+"," + shopItem.getValue().toString());
        }
    }

}

