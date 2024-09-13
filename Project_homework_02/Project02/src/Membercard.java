public class Membercard {
    private String name;
    private double purchaseAmount;

    public Membercard(String name, double purchaseAmount) {
        this.name = name;
        this.purchaseAmount = purchaseAmount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPurchaseAmount() {
        return purchaseAmount;
    }

    public void setPurchaseAmout(double purchaseAmount) {
        this.purchaseAmount = purchaseAmount;
    }

    public double calculateDiscount() {
        return getPurchaseAmount();
    }


    public void display() {
        System.out.println("Customer name : " + name);
        System.out.println("Purchase Amout : " + purchaseAmount);
        System.out.println("Discount : " + calculateDiscount());
        System.out.println("total Amout : " + (purchaseAmount - calculateDiscount()));
    }

}
