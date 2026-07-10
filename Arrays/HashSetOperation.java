package Arrays;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetOperation {
    public static void main(String[] args) {

      
        HashSet<Integer> hs = new HashSet<>();

        Scanner sc=new Scanner(System.in);
        int ele=sc.nextInt();

        while(ele!=0)
        {
            hs.add(ele);
            ele=sc.nextInt();
        }
        System.out.println(hs);
        
    }
    
    
}

//Hashset order are unsorted
//HashSet is used to store unique elements
//List out atleast five funtions and use them in a seperate program 
//arraylist,hashset,hashmap

//Find the longest subarray whose sum is less <= k in a list of elements
//array = {1,2,1,0,1,1,0,1};
//output = 5;
//k=4;


