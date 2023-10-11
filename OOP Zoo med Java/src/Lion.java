public class Lion extends Animal {
    private String predator;

    public Lion(String animalName, int amountOfAnimal, String predator) {
        super(animalName, amountOfAnimal);
        this.predator = predator;
    }

    public void sayAnimals() {
        System.out.println("Här har vi " + getAmountOfAnimal() + " stycken " + getAnimalName() + " och detta djuret är ett " + this.predator + "!");
    }

    public String getPredator() {
        return predator;
    }

    public void setPredator(String predator) {
        this.predator = predator;
    }

    
}
