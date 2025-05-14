package MiniProjects.ShoppingCartSystem;

public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getFinalPrice(){
        return price;
    }

    public String format() {
        return String.format("%-45s %s\n ", " Product name", getName()) +
               String.format("%-45s %.2f\n" ,"Product price", getFinalPrice());
    }
}
