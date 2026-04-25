
import java.util.Scanner;

public class Warehouse 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter total no. stock:");
        int n= sc.nextInt();
        int total=0;

        for (int i = 1; i <= n; i++) {
            
         System.out.println("\nProduct " + i);
        System.out.print("Enter Minimum Required Stock");
        int Minimum= sc.nextInt();

        System.out.print("Enter Current Stock");
        int current= sc.nextInt();

        if(current<Minimum)
        {
            System.out.println("Restock needed:"+i);
            total++;
        }
        else
        {
            System.out.println("No restock needed");
        }
    }
    System.out.println("Total no of products:"+total);

    }
}