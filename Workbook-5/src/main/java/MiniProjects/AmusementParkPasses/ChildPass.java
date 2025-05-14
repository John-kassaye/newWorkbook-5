package MiniProjects.AmusementParkPasses;

public class ChildPass extends Pass{
    public ChildPass(String holderName, double basePrice) {
        super(holderName, basePrice);
    }

    @Override
    public double getFinalPrice() {
        return getBasePrice() * 0.5;
    }
}
