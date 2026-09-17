public class Dog extends Animal {


    private boolean smellingSense;

    public Dog(String name, boolean smellingSense) {
        super(name);
        this.smellingSense = smellingSense;

    }

   @Override
    public String makeSound(){
        return "woof";
    }

}
