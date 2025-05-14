public class main {
    public static void main(String[] args) {
        Moped ride = new Moped("red",3,8,7);
        ride.test();

        Car car = new Car("blue",2,10,49,4,4);
        car.test();

        SemiTruck semiTruck = new SemiTruck("black",4,100,123,4,4);
        semiTruck.test();

        Vehicle vehicle;
        vehicle = new Car("blue",12,2,3,4,5);

    }
}
