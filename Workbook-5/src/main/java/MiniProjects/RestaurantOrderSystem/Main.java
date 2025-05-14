package MiniProjects.RestaurantOrderSystem;

public class Main {

    public static void main(String[] args) {
        MenuItem menuItem = new MainDish("Burger",10,500,true);
        MenuItem menuItem2 = new Dessert("Chesse",4,90);
        MenuItem menuItem3 = new Drink("Soda",5,200);
        MenuItem menuItem4 = new MainDish("Pizza",7,390, false);
        MenuItem menuItem5 = new Drink("Lemonade",12,50);

        Order order = new Order();
        order.addItem(menuItem);
        order.addItem(menuItem5);
        order.addItem(menuItem2);
        order.addItem(menuItem3);
        order.addItem(menuItem4);

        order.printOrderSummary();

        // only vegetarian
        order.onlyVegetarian();
    }

}
