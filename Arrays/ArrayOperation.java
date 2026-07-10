package Arrays;

import java.util.Scanner;

public class ArrayOperation {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
     int n=5;
    int arr[]={1,2,3,4,5,6,8,7,8};
    int arr1[]=new int[]{10,20,30,40,50};
    int arr2[]=new int[n];

    for(int i=0; i<arr2.length;i++)
    {
    arr2[i]=sc.nextInt();
    }

    for(int i=0;i<arr2.length;i++)
    {
        System.out.println("Value :"+arr2[i]);
    }
  

   }

    
}

//Array : collecrtion of similar data types
//Array store data in contigous memory
//contigous and continues diffrence : Array store data in contigous memory
//Array is static size
//Array is derived data type
//Array elements only can be accessed by index
//why array index start with zero: 
//address = base address + index* data size
//1D ARRAY ,2D AARAY ,3D ARRAY


//Array List: collection of different data types
