package AssetManager;

public class Vehicle extends Asset {
    private String makeModel;
    private int year;
    private int odometer;

    public Vehicle(String description, String dateAcquired, double originalCost, String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    @Override
    public double getValue(){
        double cost = 0;
        double originalCost = getOriginalCost();
        if (0 <= year && year <= 3){
            if (getOdometer() > 100000 && !getMakeModel().contains("Honda") && !getMakeModel().contains("Toyota")){
            cost += originalCost - (getOriginalCost() - (0.03 * getOriginalCost() * getYear())) * 0.25;
            } else {
               cost += getOriginalCost() - (0.03 * getOriginalCost() * getYear());
            }
        }
        if ( 4 <= year && year <= 6){
            if (getOdometer() > 100000 && !getMakeModel().contains("Honda") && !getMakeModel().contains("Toyota")) {
                cost += originalCost - (getOriginalCost() - 0.06 * getOriginalCost() * getYear()) * 0.25;
            } else {
                cost =  getOriginalCost() - 0.06 * getOriginalCost() * getYear();
            }
        }

        if (7 <= year && year <= 10){
            if (getOdometer() > 100000 && !getMakeModel().contains("Honda") && !getMakeModel().contains("Toyota")) {
                cost+= originalCost - (getOriginalCost() - 0.08 * getOriginalCost() * getYear()) * 0.25;
            } else {
                cost+= getOriginalCost() - 0.08 * getOriginalCost() * getYear();
            }
        }

        if (year > 10){
            if (getOdometer() > 100000 && !getMakeModel().contains("Honda") && !getMakeModel().contains("Toyota")) {
                cost = 1000 * 0.25;
            } else {
                cost = 1000;
            }
        }

        return cost;
    }

}
