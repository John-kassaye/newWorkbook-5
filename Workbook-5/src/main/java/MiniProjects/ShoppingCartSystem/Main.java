package MiniProjects.ShoppingCartSystem;

import MiniProjects.MagicWonderShop.Item;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addItem(new Product("burger",4));
        shoppingCart.addItem(new Product("pizza",4.99));
        shoppingCart.addItem(new DiscountedProduct("lemonade",7,0.10));
        shoppingCart.addItem(new DiscountedProduct("Tv",340,0.20));

        shoppingCart.printReceipt();
    }
}
