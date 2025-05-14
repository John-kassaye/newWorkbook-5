package MiniProjects.MagicWonderShop;

public class Item {
    private String name;
    private double price;
    private static int numOfItem;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
        numOfItem++;
    }

    public static int getNumOfItem() {
        return numOfItem;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void use(){
        System.out.println("Boom!");
    }
}
