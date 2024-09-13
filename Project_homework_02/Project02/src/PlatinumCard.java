public class PlatinumCard extends Membercard {
    public PlatinumCard(String name, double purchaseAmount) {
        super(name, purchaseAmount);
    }

    @Override
    public double calculateDiscount() { 
        return super.getPurchaseAmount() * .15d;
    }
}