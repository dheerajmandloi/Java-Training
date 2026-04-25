import java.util.Scanner;

public class GameInFunction {
    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);
        do{ 
            game();
            System.out.println("Do you want to play again? (yes/no)");
           
            String choice = sc.next();
            if(choice.equals("no"))
            {
                break;
            }   
        } while (true);

    }
    
static void game()
{
      Scanner sc = new Scanner(System.in);
        
        String stone;
        String scissor;
        String paper;
        int user1score=0;
        int user2score=0;
        
        int i=0;
        while(i<3)
        {
        System.out.println("Enter First user move (stone/scissor/paper):");
        String user1 = sc.next();
        
        System.out.println("Enter Second user move (stone/scissor/paper) :");
        String user2 = sc.next();

        if(user1.equals(user2))
        {
            System.out.println("Draw");
        }
        else if(user1.equals("stone") && user2.equals("scissor"))
        {
            user1score=user1score+1;
            System.out.println("User 1 wins");
        }
        else if(user1.equals("scissor") && user2.equals("paper"))
        {
            user1score=user1score+1;
            System.out.println("User 1 wins");
        }
        else if(user1.equals("paper") && user2.equals("stone"))
        {
            user1score=user1score+1;
            System.out.println("User 1 wins");
        }
        else if(user1.equals("scissor") && user2.equals("stone"))
        {
            user2score=user2score+1;
            System.out.println("User 2 wins");
        }
        else if(user1.equals("stone") && user2.equals("paper"))
        {
             user2score=user2score+1;
            System.out.println("User 2 wins");
        }
        else if(user1.equals("paper") && user2.equals("secissor"))
        {
               user2score=user2score+1;
            System.out.println("User 2 wins");
        }
        else
        {
            System.out.println("Invalid input");
        }
        i++;
        }

        System.out.println("User 1 score :"+user1score);
        System.out.println("User 2 score :"+user2score);
        if(user1score>user2score)
        {
            System.out.println("User 1 wins the game");
        }
        else if(user1score<user2score)
        {
            System.out.println("User 2 wins the game");
        }
        else
        {
            System.out.println("Draw");
        }
        
     
}
}