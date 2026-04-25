
import java.util.Scanner;

public class AtmWithdrawal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter the available balance: ");
        int balance = sc.nextInt();

        System.out.print("Enter the amount to withdraw: ");
        int withdraw = sc.nextInt();

        
        if(balance<=withdraw) {
            System.out.println("Insufficient balance");
        }
        else if((balance+1000)>=withdraw)
        {
            System.out.println("Transaction Failed: Minimum balance violation");
        }
        else
        {
             System.out.println("Withdrawal successful");
        }
    }
    
}
