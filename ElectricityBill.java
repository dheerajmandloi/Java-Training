
import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the units consumed:");
        double units = sc.nextFloat();

        double bill=50;

        if(100>=units)
        {
            bill+=units*1.5;
        }
        else if(200>=units)
        {
            bill+=100*1.5+(units-100)*3.5;
        }
        else
        {
            bill+=100*1.5+100*3.5+(units-200)*5;
        }

        if(2000>=bill)  
        {
             bill=bill*1.1;
        System.out.println("Your bill is "+bill);
        }
        else
        {
            System.out.println("Your bill is "+bill);
        }
        sc.close();
      
    }
    
}
