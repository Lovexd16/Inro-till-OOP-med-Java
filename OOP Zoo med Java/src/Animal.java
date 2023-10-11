public class Animal {
    private String animalName;
    private int amountOfAnimal;

    public Animal(String animalName, int amountOfAnimal) {
        this.animalName = animalName;
        this.amountOfAnimal = amountOfAnimal;
    }

    public void sayAnimals() {
        System.out.println("Här har vi " + this.amountOfAnimal + " stycken " + this.animalName);
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public int getAmountOfAnimal() {
        return amountOfAnimal;
    }

    public void setAmountOfAnimal(int amountOfAnimal) {
        this.amountOfAnimal = amountOfAnimal;
    }
    
}
