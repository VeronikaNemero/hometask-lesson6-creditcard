import java.util.Scanner;

public class CreditCard {
    String accountNumber;

    double amount;

    public CreditCard(String accountNumber, double amount) {
        this.accountNumber = accountNumber;
        this.amount = amount;
    }

    public void replenishment() {
        System.out.println("How much do you want to invest?");
        Scanner scanner = new Scanner(System.in);
        double replenishmentSum = scanner.nextDouble();
        amount += replenishmentSum;
    }

    public void withdrawal() {
        System.out.println("How much do you want to withdraw?");
        Scanner scanner = new Scanner(System.in);
        double withdrawalSum = scanner.nextDouble();
        amount -= withdrawalSum;
    }

    public void viewInfo () {
        System.out.println("Your account number is " + accountNumber);
        System.out.println("Current amount is: " + amount);
    }
}
