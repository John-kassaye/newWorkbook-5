package MiniProjects.RestaurantOrderSystem;

public class MenuItem {
    private String name;
    private double price;
    private int calories;

    public MenuItem(String name, double price, int calories) {
        this.name = name;
        this.price = price;
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getCalories() {
        return calories;
    }

    public String getDescription(){
        return "something";
    }
}
