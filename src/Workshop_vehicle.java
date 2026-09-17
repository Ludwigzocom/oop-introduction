public class Workshop_vehicle {
    //Jämför två Vehicle (Alla våra subklasser är ju också Vehicles)
    //Eftersom vi inte vill jämföra en Car klass mot en Motorcycle klass t.ex
    //Så kan vi använda oss av deras delade klass. dvs Vehicle, då de båda är Vehicles
    public static Vehicle compareTopSpeed(Vehicle a, Vehicle b) {

        //Checkar ifall objektets.getTopSpeed är mer än det andra
        if (a.getTopSpeedmh() > b.getTopSpeedmh()) {
            return a;
        } else {
            return b;
        }
    }


    static void main(String[] args) {

        //Skapar objekten utifrån deras egna klasser
        Car car = new Car("Mustang", 120, 1975, 4);
        Motorcycle bike = new Motorcycle("Yamaha", 175, 2010, true);
        Vehicle fordon = new Vehicle("Toyota", 52, 1995);
        Truck truck = new Truck("Volkswagen", 89, 1968);
        System.out.println("!=====================!");
        //If sats som checkar ifall isVintage() returnerar ett sant värde och gör något
        //om inte så gör den något annat.
        if (car.isVintage()) {
            System.out.println("Car is vintage");
        } else {
            System.out.println("This is not a vintage car");
        }

        System.out.println("!=====================!");

        //Skriver ut det returenrade objektets brand. compareTopSpeed returnerar ju objektet
        //Då kan vi enkelt ta det objektet som returneras och använda .getBrand metoden som alla har ärvt
        //av Vehicle
        System.out.println(compareTopSpeed(bike, fordon).getBrand());

        System.out.println(compareTopSpeed(truck, car).getBrand());
    }
}
