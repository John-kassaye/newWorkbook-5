package MiniProjects.RestaurantOrderSystem;

public class MainDish extends MenuItem{
    public MainDish(String name, double price, int calories) {
        super(name, price, calories);
    }

    @Override
    public String getDescription(){
        return "it contains nuts.";
    }
}
