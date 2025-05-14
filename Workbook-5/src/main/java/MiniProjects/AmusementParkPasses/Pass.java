package MiniProjects.AmusementParkPasses;

public class Pass {
    private String holderName;
    private double BasePrice;

    public Pass(String holderName, double basePrice) {
        this.holderName = holderName;
        BasePrice = basePrice;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBasePrice() {
        return BasePrice;
    }

    public double getFinalPrice(){
        return getBasePrice();
    }

    public String format(){
        return String.format("%-45s %s","\nHolder name",getHolderName()) +
                String.format("%-45s %.2f","\nBase Price",getFinalPrice());
    }
}
