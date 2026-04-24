
import java.util.Scanner;

public class SmartTraffic {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your Speed:");
        int speed=sc.nextInt();
        double fine=0;

        System.out.println("Repeted (yes/no)");
        char repeated = sc.next().charAt(0);

        if(speed>=100)
        {
          fine=1000;
        }
        else if(speed>80)
        {
            fine=500;
        }
        
        if(repeated=='y')
        {
          fine=fine*2;
        }
        
        
        System.out.println("Total fine: "+fine);
        
    }
}
