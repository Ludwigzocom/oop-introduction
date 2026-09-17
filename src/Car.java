public class Car extends Vehicle {
    private int numDoors;

    //Skapar konstruktor för min CAR
    //VIKTIGT!!! att min super ligger längst upp här, vi vill första kalla på våran Superklass konstruktor
    //innan vi börjar bygga vidare med våran egna konstruktor
    public Car(String brand, int topSpeedmh, int productionYear, int numDoors) {
        super(brand, topSpeedmh, productionYear);
        this.numDoors = numDoors;
    }


    //En Override metod där jag skriver över funktionaliten av min Superklass och gör något annat eller ytterligare
    @Override
    public void describe(){
        //Här kallar jag först på bas metoden
        super.describe();
        //Här gör jag ytterligare saker utöver min basmetod
        System.out.println("Total doors: " +numDoors);
    }
}


