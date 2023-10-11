public class Elephant extends Animal{
    private String hasTrunk;

    public Elephant(String animalName, int amountOfAnimal, String hasTrunk) {
        super(animalName, amountOfAnimal);
        this.hasTrunk = hasTrunk;
    }

    public void sayAnimals() {
        System.out.println("Här har vi " + getAmountOfAnimal() + " stycken " + getAnimalName() + " och detta djuret har en " + this.hasTrunk + "!");
    }

    public String getHasTrunk() {
        return hasTrunk;
    }

    public void setHasTrunk(String hasTrunk) {
        this.hasTrunk = hasTrunk;
    }

    
}
