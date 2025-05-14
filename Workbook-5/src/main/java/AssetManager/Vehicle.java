package AssetManager;

import java.time.LocalDate;

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
//        double cost = 0;
//        double originalCost = getOriginalCost();
//        if (0 <= year && year <= 3){
//            if (getOdometer() > 100000 && !getMakeModel().contains("Honda") && !getMakeModel().contains("Toyota")){
//            cost += originalCost - (getOriginalCost() - (0.03 * getOriginalCost() * getYear())) * 0.25;
//            } else {
//               cost += getOriginalCost() - (0.03 * getOriginalCost() * getYear());
//            }
//        }
//        if ( 4 <= year && year <= 6){
//            if (getOdometer() > 100000 && !getMakeModel().contains("Honda") && !getMakeModel().contains("Toyota")) {
//                cost += originalCost - (getOriginalCost() - 0.06 * getOriginalCost() * getYear()) * 0.25;
//            } else {
//                cost =  getOriginalCost() - 0.06 * getOriginalCost() * getYear();
//            }
//        }
//
//        if (7 <= year && year <= 10){
//            if (getOdometer() > 100000 && !getMakeModel().contains("Honda") && !getMakeModel().contains("Toyota")) {
//                cost+= originalCost - (getOriginalCost() - 0.08 * getOriginalCost() * getYear()) * 0.25;
//            } else {
//                cost+= getOriginalCost() - 0.08 * getOriginalCost() * getYear();
//            }
//        }
//
//        if (year > 10){
//            if (getOdometer() > 100000 && !getMakeModel().contains("Honda") && !getMakeModel().contains("Toyota")) {
//                cost = 1000 * 0.25;
//            } else {
//                cost = 1000;
//            }
//        }

        double cost = 0;
        int currentYear = LocalDate.now().getYear();
        int age = currentYear - getYear();

        if (age <= 3){
            cost= getOriginalCost();
            for (int i = 0; i < age; i++){
                cost-= cost * 0.03;
            }
        } else if (age <=6){
            cost= getOriginalCost();
            for (int i = 0; i < age; i++){
                cost-= cost * 0.06;
            }
        } else if (age <8) {
            cost= getOriginalCost();
            for (int i = 0; i < age; i++){
                cost-= cost * 0.08;
            }
        } else {
            cost = 1000;
        }

    if (getOdometer() > 100000 && !getMakeModel().contains("Honda")
            && !getMakeModel().contains("Toyota")){
            cost*= 0.25;
        }
        return cost;
    }

    @Override
    public String toString(){
        return super.toString () +
                String.format(" %-30s %s\n", "address:" , makeModel ) +
                String.format(" %-30s %s\n", "condition:" , year) +
                String.format(" %-30s %d", "square foot:", odometer);
    }

}
