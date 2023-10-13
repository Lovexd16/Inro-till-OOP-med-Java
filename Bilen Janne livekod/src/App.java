import java.util.Scanner;

public class App {

    public static Racetrack racetrack = new Racetrack("Monaco");

    public static void main(String[] args) throws Exception {
        System.out.println("Hello Racetrack!");
        Scanner input = new Scanner(System.in);
        boolean run = true;

        //Ha kvar när man testar så man slipper lägga till varje gång man ska testa något
        racetrack.addCar("Mercedes", "Nico");
        racetrack.addCar("Ferarri", "Kimi");

        //Fast koda in en start hastighet på bil
        //racetrack.speedUp("Kimi", 150);

        while (run) {
            System.out.println("Vad vill du göra? 1: Lägg till ny förare. 2: Gasa. 3: Titta på banan. 4: Avsluta.");
            String choice = input.nextLine();

            switch(choice) {
                case "1":
                System.out.println("Vilken bil model?");
                String model = input.nextLine();
                System.out.println("Namn på förare?");
                String driver = input.nextLine();
                racetrack.addCar(model, driver);
                break;

                case "2":
                System.out.println("Vilken förare ska gasa?");
                String findDriver = input.nextLine();
                System.out.println("Hur mycket?");
                int setSpeed = input.nextInt();
                input.nextLine(); //Fångar enterslaget och tömmer buffer
                racetrack.speedUp(findDriver, setSpeed);
                break;

                case "3":
                System.out.println("Så här ser banan ut nu:");
                printRacetrack();
                break;

                case "4":
                System.out.println("Du avslutade racet!");
                run = false;
                break;

                default:
                System.out.println("Du valde inte ett av alternativen.");
                
            }
        }

        printRacetrack();


        input.close();
    }

    public static void printRacetrack() {
        for (Car car : racetrack.getCars()) {
            System.out.println(car.getModel() + " körs utav " + car.getDriver() + ". Bilen kör i " + car.getSpeed() + " km/h.");
        }
    }
}
