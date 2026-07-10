package Arrays;

import java.util.HashMap;
import java.util.Scanner;

public class LongestSubStringBySir {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the string:");
    String str=sc.nextLine();

    System.out.println("Enter value of k:");
    int k=sc.nextInt(); 

    HashMap<Character, Integer> map=new HashMap<>();
    int l=0,max=0;
    
    for(int i=0;i<str.length();i++)
    {
        char c = str.charAt(i);
        map.put(c,map.getOrDefault(c,0)+1);

        while(map.size()>k)
        {

            if(map.get(str.charAt(l))-1 ==0)
            {
                map.remove(str.charAt(l));
                l++;
                continue;
            }
            map.put(c,map.get(str.charAt(l))-1);
            l++;
        }
        if(max<i-l+1)
        {
            max=i-l+1;
        }
    }
    System.out.println(max);
   }
}



//k : fixed 
//negative value : prefix sum 
//postive value : sliding window 
