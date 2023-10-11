public class Monkey extends Animal{
    private String hasTwoLegs;

    public Monkey(String animalName, int amountOfAnimal, String hasTwoLegs) {
        super(animalName, amountOfAnimal);
        this.hasTwoLegs = hasTwoLegs;
    }

    public void sayAnimals() {
        System.out.println("Här har vi " + getAmountOfAnimal() + " stycken " + getAnimalName() + " och detta djuret har " + this.hasTwoLegs + "!");
    }

    public String getHasTwoLegs() {
        return hasTwoLegs;
    }

    public void setHasTwoLegs(String hasTwoLegs) {
        this.hasTwoLegs = hasTwoLegs;
    }

    
}
