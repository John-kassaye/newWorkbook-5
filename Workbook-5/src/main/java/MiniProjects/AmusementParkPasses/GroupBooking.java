package MiniProjects.AmusementParkPasses;

import java.util.ArrayList;
import java.util.List;

public class GroupBooking {
    List<Pass> passList = new ArrayList<>();

    public void addPass(Pass pass){
        passList.add(pass);
    }

    public void printSummary(){
        double total = 0;

        for (Pass pass : passList){
            System.out.println(pass.format());
            total+= pass.getFinalPrice();
        }

        System.out.printf("%-45s %.2f", "\nYour total revenue:" , total);
    }
}
