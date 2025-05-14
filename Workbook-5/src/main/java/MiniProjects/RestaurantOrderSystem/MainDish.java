package MiniProjects.RestaurantOrderSystem;

public class MainDish extends MenuItem{
    private boolean vegetarian;

    public MainDish(String name, double price, int calories, boolean vegetarian) {
        super(name, price, calories);
        this.vegetarian = vegetarian;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    @Override
    public String getDescription(){
        return "it contains nuts.";
    }
}
