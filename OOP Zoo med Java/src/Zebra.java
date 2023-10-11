public class Zebra extends Animal{
    private String striped;

    public Zebra(String animalName, int amountOfAnimal, String striped) {
        super(animalName, amountOfAnimal);
        this.striped = striped;
    }

    public void sayAnimals() {
        System.out.println("Här har vi " + getAmountOfAnimal() + " stycken " + getAnimalName() + " och detta djuret är " + this.striped + "!");
    }

    public String getStriped() {
        return striped;
    }

    public void setStriped(String striped) {
        this.striped = striped;
    }
    
    
}
