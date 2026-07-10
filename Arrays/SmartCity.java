package Arrays;

import java.util.Scanner;

public class SmartCity {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter teh vallue of k:");
        int k=sc.nextInt();
        int arr[]={4,8,15,3,10,12,5,9};
        int max=0;
        int sum=0;
        
        for(int i=0;i<k;i++)
        {
            sum=sum+arr[i];
        }
        max=max<sum?sum:max;

        for(int i=k;i<arr.length;i++)
        {
            sum=sum+arr[i]-arr[i-k];
            max=max<sum?sum:max;
        }
        System.out.println(max);
        


    }
    
}
