package MiniProjects.ShoppingCartSystem;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> productList = new ArrayList<>();

    public void addItem(Product product){
        productList.add(product);
    }

    public void printReceipt(){
        double total = 0;
        for (Product product : productList){
            System.out.println(product.format());
            total+= product.getFinalPrice();
        }

        double taxAmount = total * 0.21;
        double afterTax =  total + taxAmount ;

        System.out.println("\nFinal price before tax " + total);
        System.out.println("Tax amount " + taxAmount);
        System.out.println("Final price after tax " + afterTax);

    }
}
