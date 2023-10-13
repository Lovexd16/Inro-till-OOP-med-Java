import java.util.Scanner;

public class Bank {

    public static boolean customerChoice = true;
    public static Scanner input = new Scanner(System.in);
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        Customer customer1 = new Customer("Love", 21, "lovebandy@hotmail.se", 0);
        Customer customer2 = new Customer("Anna", 42, "anna@hotmail.com", 0);
        Customer customer3 = new Customer("Billy", 92,"billyiscool@gmail.com", 0);
        //customer1.addNewCustomer();

        System.out.println("Pengar på kontot: " + customer1.getBalance());
        customer1.setBalance(100);
        customer1.customerInformation();

 
        }

    public static void showChoiceMessage() {
        System.out.println("Vad vill du göra? \n1. Se saldo \n2. Ta ut pengar \n3. Sätt in pengar \n4. Avsluta");
    }

    public static void withdrawAmountQuestion() {
        System.out.println("Hur mycket vill du ta ut?");
    }

    public static void depositAmountQuestion() {
        System.out.println("Hur mycket vill du sätta in?");
    }

    public static void checkAmountDouble() {
        while (!scan.hasNextDouble()) {
            scan.next();

            System.out.println("Du gav inte en siffra.");
        }
    }
}
