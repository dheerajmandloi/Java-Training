
import java.util.Scanner;

class Demo
{
    public static void main(String[] args)
    {

        Scanner sc=new Scanner(System.in);
        while (true)
      { 
        System.out.println("Enter your your Tray no.");
        System.out.println("a: Lays,b: Mazza,c: Kitkat,n: Exit");
        System.out.print("Choose:");
        char a=sc.next().charAt(0);
         switch(a)
         {
         case 'a':
         {
            System.out.println("Lays:10$");
            break;
         }
         case 'b':
         {
            System.out.println("Mazza:20$");
            break;
         }   
         case 'c':
        {
                System.out.println("Kitkat");
                break;
        }
        case 'n':
        {
            System.out.println("Exit");
            return;
        }
        default:
        {
            System.out.println("Invalid option");
            break;
        }

         }
        }
    }
}