public class GoldCard extends Membercard {
    public GoldCard(String name, double purchaseAmount) {
        super(name, purchaseAmount);
    }

    @Override
    public double calculateDiscount() {
        if (getPurchaseAmount() >= 1500) {
            return getPurchaseAmount() * .03d;
        }
        return 0;
    }
}