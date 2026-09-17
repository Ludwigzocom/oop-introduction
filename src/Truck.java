public class Truck extends Vehicle {

    private boolean canTow;


    public Truck(String brand, int topSpeedmh, int productionYear) {
        super(brand, topSpeedmh, productionYear);
        this.canTow = canTow;
    }

    @Override
    public void describe() {
        super.describe();
        if (canTow) {
            System.out.println("This is a towing truck");
        } else {
            System.out.println("This Truck cant tow...");
        }
    }
}
