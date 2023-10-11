import java.util.Scanner;

public class Zoo {
    public static Scanner input = new Scanner(System.in);
    public static boolean run = true;
    public static void main(String[] args) {
        
        Place stockholm = new StockholmZoo("Stockholm", "Skansken", 10, "Detta zoo:t är säkert!");
        Place gothenburg = new GothenburgZoo("Göteborg", "Universeum", 6, "I detta zoo:t finns en pool!");

        Animal lion = new Lion("lejon", 5, "rovdjur");
        Animal monkey = new Monkey("apor", 4, "två ben");
        Animal elephant = new Elephant("elefanter", 2, "snabel");
        Animal zebra = new Zebra("zebror", 10, "randigt");

        while (run) {
            System.out.println("Vilken stads zoo vill du lära dig mer om? \n1. Stockholm \n2. Göteborg \n3. Avsluta");
            String cityChoice = input.nextLine();

            switch(cityChoice) {
                case "1":
                    stockholm.sayZooWelcome();
                    lion.sayAnimals();
                    monkey.sayAnimals();

                    break;

                case "2":
                    gothenburg.sayZooWelcome();
                    elephant.sayAnimals();
                    zebra.sayAnimals();

                    break;

                case "3":
                    System.out.println("Du avslutade programmet!");
                    run = false;

                    break;

                default:
                    System.out.println("Du valde inte något av alternativen!");
            }
        }

    }
}
