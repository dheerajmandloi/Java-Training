
import java.util.Scanner;

public class LoginAttemptLock {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
       int i=0;
        while(i<3)
        {
            System.out.print("Enter password:");
            String password = sc.next();
            if(password.equals("dheeraj"))
            {
             System.out.println("Login successful");
             break;
            }
            else
            {
            System.out.println("Incorrect password");
            i++;
            }
        }
        if(i==3)
        {
            System.out.println("Account locked");
        }
    }
}
