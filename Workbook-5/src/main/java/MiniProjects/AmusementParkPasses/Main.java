package MiniProjects.AmusementParkPasses;

public class Main {
    public static void main(String[] args) {
        GroupBooking groupBooking = new GroupBooking();
        groupBooking.addPass(new SeniorPass("Samuel",100));
        groupBooking.addPass(new AdultPass("John",100));
        groupBooking.addPass(new ChildPass("Olu's child",100));

        // Alternate way
//        SeniorPass seniorPass = new SeniorPass("Samuel",30);
//        groupBooking.addPass(seniorPass);

        groupBooking.printSummary();
    }
}
