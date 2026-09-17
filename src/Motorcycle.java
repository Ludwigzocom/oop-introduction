public class Motorcycle extends Vehicle{

    private boolean hasSidecar;

    public Motorcycle(String brand, int topSpeedmh, int productionYear, boolean hasSidecar) {
        super(brand, topSpeedmh, productionYear);
        this.hasSidecar = hasSidecar;
    }



    @Override
    public void describe() {
        super.describe();
        if(hasSidecar){
            System.out.println("Vehicle has side car");
        } else {
            System.out.println("Vehicle doesn't have side car");
        }
    }
}
