package MiniProjects.RestaurantOrderSystem;

public class Drink extends MenuItem{
    public Drink(String name, double price, int calories) {
        super(name, price, calories);
    }

    @Override
    public String getDescription(){
        return "cold and fizzy!";
    }
}
