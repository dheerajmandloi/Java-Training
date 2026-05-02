package OOPS;
import java.util.Scanner;

// Interface 1
interface UPI {
    default void payment() {
        System.out.println("Payment done using UPI");
    }
}

// Interface 2
interface CreditCard {
    default void payment() {
        System.out.println("Payment done using Credit Card");
    }
}

// Interface 3
interface DebitCard {
    default void payment() {
        System.out.println("Payment done using Debit Card");
    }
}

// Main class implementing all interfaces
class Payment implements UPI, CreditCard, DebitCard {

    // Must override because multiple default methods conflict
    public void payment(int choice) {

        if (choice == 1) {
            UPI.super.payment();
        } else if (choice == 2) {
            CreditCard.super.payment();
        } else if (choice == 3) {
            DebitCard.super.payment();
        } else {
            System.out.println("Invalid choice");
        }
    }
}

// Main class
public class Interface {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Payment p = new Payment();

        System.out.println("Choose Payment Method:");
        System.out.println("1. UPI");
        System.out.println("2. Credit Card");
        System.out.println("3. Debit Card");

        int choice = sc.nextInt();

        p.payment(choice);
    }
}