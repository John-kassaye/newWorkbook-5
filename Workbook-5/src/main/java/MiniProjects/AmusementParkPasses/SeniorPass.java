package MiniProjects.AmusementParkPasses;

public class SeniorPass extends Pass{
    public SeniorPass(String holderName, double basePrice) {
        super(holderName, basePrice);
    }

    @Override
    public double getFinalPrice() {
        return getBasePrice() * 0.3;
    }
}
