import java.util.Scanner;

public class Car {
    private String brand;
    private String ownerName;
    private int speed;
    private static Scanner scan = new Scanner(System.in);

    public Car(String brand, String ownerName, int speed) {
        this.brand = brand;
        this.ownerName = ownerName;
        this.speed = speed;
    }

    public void print() {
        System.out.println("Namn på ägare: " + this.ownerName + ". Bilmärmke: " + this.brand + ". Hastighet: " + this.speed + "km/h.");
    }

    public void startCar() {
        System.out.println(this.ownerName + "s " + this.brand + " startade.");
    }

    public void stopCar() {
        this.speed = 0;
        System.out.println(this.ownerName + "s " + this.brand + " stannade.");
    }

    public void gas(int gasAmount) {
        System.out.println("Hur mycket snabbare vill du köra?");
        checkInt();
        gasAmount = scan.nextInt();
        while (gasAmount > 0) {

            this.speed += gasAmount;
            System.out.println("Du ökde farten med " + gasAmount + "km/h.");

            break;
        }

        if (gasAmount <= 0) {
            System.out.println("Du kan inte öka farten med 0 eller ett negativt tal!");
        }

    }

    public void brake(int brakeAmount) {

        System.out.println("Hur mycket långsammare vill du köra?");
        checkInt();
        brakeAmount = scan.nextInt();

        if (this.speed > 0 && this.speed >= brakeAmount) {
            this.speed -= brakeAmount;
            System.out.println("Du sänkte farten med " + brakeAmount + "km/h.");

        } else if (this.speed < brakeAmount) {
            System.out.println("Du kör redan i lägre hastighet äv vad du vill bromsa!");
        } else {
            System.out.println("Du kan inte bromsa med 0 eller ett negativt tal!");
        }

    }

    public static void checkInt() {
        while (!scan.hasNextInt()) {
            scan.next();

            System.out.println("Du gav inte en siffra!");
        }
    }
}

