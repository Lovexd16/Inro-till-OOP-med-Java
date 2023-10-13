import java.util.Scanner;

public class Customer {
    private String name;
    private int age;
    private String email;
    private double balance;
    private Scanner input = new Scanner(System.in);

    public Customer(String name, int age, String email, double balance) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.balance = balance;
    }

    public void addNewCustomer() {
        System.out.println("Skriv namn:");
        this.name = input.nextLine();

        System.out.println("Skriv ålder:");
        this.age = input.nextInt();
        
        System.out.println("Skriv email adress:");
        this.email = input.nextLine();

        System.out.println("Skriv nuvarande saldo:");
        this.balance = input.nextDouble();
    }

    public void customerInformation() {
        System.out.println("Kunden heter " + getName() + " och är " + getAge() + " år gammal och har emailen " + getEmail() + ". Saldot är " + getBalance() + "kr.");
    }

    public void customerWelcomeMessage() {
        System.out.println("Hej " + getName() + "!");
    }

    public void showBalance(double showBalance) {
        System.out.println("Du har " + getBalance() + "kr på kontot.");
    }

    public void depositMoney(double depositedMoney) {
        this.balance += depositedMoney;
        System.out.println("Intag lyckades. Ditt saldo är nu " + this.balance);
    }

    public void withdrawMoney(double withdrawnMoney) {
        if (this.balance < withdrawnMoney) {
            System.out.println("Uttag misslyckades. Du har " + this.balance + "kr på kontot.");
        } else {
            this.balance -= withdrawnMoney;
            System.out.println("Uttag lyckades. Ditt saldo är nu " + this.balance);
        }
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
       
}
