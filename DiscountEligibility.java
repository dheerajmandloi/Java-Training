
import java.util.Scanner;

public class DiscountEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your amount:");
        double amount = sc.nextDouble();
         System.out.println("Enter premium or not (y/n):");
        char premium = sc.next().charAt(0);
        double premiumdiscount = 0;
        double discount = 0;

        if (premium == 'y') 
        {
           premiumdiscount=5;
        }
        

        if (amount >=5000) 
        {
           
           discount = amount * (20+premiumdiscount) / 100;
           amount= amount-discount;
        } 
        else if( amount>=300)
        {
            discount = amount * (10 + premiumdiscount)/ 100;
            amount = amount - discount;
        }
       
        
        System.out.println("Amount after discount is " + amount);
        sc.close();
    }
    
}
