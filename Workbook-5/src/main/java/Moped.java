public class Moped extends Vehicle{

    public Moped(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
    }

    public void test(){
        System.out.println(" color: " + getColor() + " fuel capacity: " + getFuelCapacity());
    }
}
