
import java.util.Scanner;

public class OddEvenGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
         int odd=0;
         int even=0;
        while(true)
        {
            System.out.print("Enter a number:");
            int num = sc.nextInt();

           if(num==0)
           {
               break;
           }
           else if(num%2==0)
           {
               even++;
           }
           else
           {
               odd++;
           }
        }
        System.out.println("Number of odd numbers: "+odd);
        System.out.println("Number of even numbers: "+even);
    }
}
