package MiniProjects.RestaurantOrderSystem;

public class Dessert extends MenuItem{
    public Dessert(String name, double price, int calories) {
        super(name, price, calories);
    }

    @Override
    public String getDescription(){
        return  "served hot!";
    }
}
