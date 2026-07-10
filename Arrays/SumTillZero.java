package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class SumTillZero {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc=new Scanner(System.in);

        int ele=1;

        while(ele!=0)
        {
         list.add(ele);
         ele=sc.nextInt();
        }
       
        System.out.println("PRINTING.....");
        for(int i:list)
        {
            System.out.println(list.get(2));
        }

    }
    
}


