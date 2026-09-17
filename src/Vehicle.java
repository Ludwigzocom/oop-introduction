public class Vehicle {
    //SUPERCLASS i denna uppgift, alla fordon ärver sedan denna (Inheritance)
    //Skapar fields för mina Vehicle, vad har alla gemensamt
    //Fields är privata, är bara nåbara om jag själv bestämmer det genom getters o setters
    private String brand;
    private int topSpeedmh;
    private int productionYear;

    //Constructor, när NEW kallas. använder vi våran konstruktor för att bygga objektet utifrån mallen(klassen)
    public Vehicle(String brand, int topSpeedmh, int productionYear) {
        this.brand = brand;
        this.topSpeedmh = topSpeedmh;
        this.productionYear = productionYear;
    }

    //Returnerar en boolean beroende på om productionyear är mindre än 2010
    public boolean isVintage() {
        return productionYear < 2010;
    }

    //Getters för mina Vehicle, där jag själv kan skriva logiken för hur jag vill att värdet ska returneras
    public int getTopSpeedmh() {
        return topSpeedmh;
    }

    public String getBrand() {
        return brand;
    }

    //En metod som skriver ut information om mina Vehicle
    //Denna kan jag sedan Overrida i de klasser som ärver(subklasser)
    public void describe(){
        System.out.println("Brand: " +brand);
        System.out.println("Top speed: " + topSpeedmh);
        System.out.println("Year of production: "+ productionYear);

    }
}
