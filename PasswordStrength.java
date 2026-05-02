
import java.util.*;

public class PasswordStrength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     System.out.println("Enter the password: ");
     String password = sc.next();

     System.out.println(password1(password));
        
    }
    static String password1(String password)
    {
      
      boolean digit = false;
      boolean uppercase = false ;
      boolean specialcase = false;
      boolean lowercase = false;
      
    
    for(char ch: password.toCharArray())
    {

     if(Character.isDigit(ch))
      {
         digit = true;
      }
     else if(Character.isUpperCase(ch))
      {
       uppercase = true;
      }
      else if(Character.isLowerCase(ch))
      {
        lowercase=true;
       }
       else
       {
        specialcase = true;
       }
      
    }
      if(password.length()>=8 && digit==true && uppercase==true && lowercase==true && specialcase ==true )
      {
         return "Strong password";
      }
      return "Weekpaassword";
    }
    
}
