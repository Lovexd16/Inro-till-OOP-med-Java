import java.util.Scanner;

public class Racetrack {

    public static Scanner input = new Scanner(System.in);
    public static boolean carOff = true;
    public static boolean run = true;

    public static void main(String[] args) {
        String ownerName;
        String brand;

        System.out.println("Vad heter du?");
        ownerName = input.nextLine();

        System.out.println("Vilket bilmärke har du?");
        brand = input.nextLine();

        Car userCar = new Car(brand, ownerName, 0);
        System.out.println("Nu börjar racet!");

        while (carOff) {
            run = false;
            showMenu();
            String choiceEngine = input.nextLine();
            checkChoiceEngine(userCar, choiceEngine);

        }

        while (run) {
            showMenu();
            String choice = input.nextLine();

            switch (choice) {
                case "1":
                    System.out.println("Bilen är redan igång!");
                    userCar.print();

                    break;

                case "2":
                    userCar.gas(0);
                    userCar.print();

                    break;

                case "3":
                    userCar.brake(0);
                    userCar.print();

                    break;

                case "4":
                    userCar.stopCar();
                    userCar.print();

                    break;

                case "5":
                    System.out.println("Du avslutade programmet.");
                    run = false;

                    break;

                default:
                    System.out.println("Du valde inte något av alternativen.");
            }
        }
        
    }

    private static void showMenu() {
        System.out.println("1. Starta bilen \n2. Gasa \n3. Bromsa \n4. Stanna bilen \n5. Avsluta");
    }

    public static void checkChoiceEngine(Car userCar, String choiceEngine) {
        if (choiceEngine.equals("1")) {
            carOff = false;
            run = true;
            userCar.startCar();

        } else if (choiceEngine.equals("2")) {
            System.out.println("Du måste starta bilen innan du kan gasa!");
        } else if (choiceEngine.equals("3")) {
            System.out.println("Du måste starta bilen innan du kan bromsa!");
        } else if (choiceEngine.equals("4")) {
            System.out.println("Bilen är redan avstängd!");
        } else if (choiceEngine.equals("5")) {
            System.out.println("Du avslutade programmet!");
            carOff = false;
        } else {
            System.out.println("Du valde inte något av alternativen!");
        }

    }
}
