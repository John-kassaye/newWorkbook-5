package AssetManager;

public class House extends Asset{
    private String address;
    private int condition;
    private int squareFoot;
    private int lotSize;


    public House(String description, String dateAcquired, double originalCost, String address, int condition, int squareFoot, int lotSize) {
        super(description, dateAcquired, originalCost);
        this.address = address;
        this.squareFoot = squareFoot;
        this.condition = condition;
        this.lotSize = lotSize;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }

    @Override
    public double getValue(){

        double value = 0;
        switch (getCondition()){
            case 1:
                value+= 180 * getSquareFoot();
                break;
            case 2:
                value+= 130 * getSquareFoot();
                break;
            case 3:
                value+= 90 * getSquareFoot();
                break;
            case 4:
                value+= 80 * getSquareFoot();
                break;
            default:
                System.out.println("Invalid");
        }
        return value;
    }

    @Override
    public String toString(){
        return super.toString () +
                String.format(" %-30s %s\n", "address:" , address ) +
                String.format(" %-30s %s\n", "condition:" , condition) +
                String.format(" %-30s %s\n", "square foot:", squareFoot) +
                String.format(" %-30s %s", "lot size:", lotSize);
    }
}
