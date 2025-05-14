package MiniProjects.ShoppingCartSystem;

public class DiscountedProduct extends Product{
    private double discountedPercentage;

    public DiscountedProduct(String name, double price, double discountedPercentage) {
        super(name, price);
        this.discountedPercentage = discountedPercentage;
    }

    @Override
    public double getFinalPrice(){
        return getPrice() - (getPrice() * discountedPercentage);
    }

}
