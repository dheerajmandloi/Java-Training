package Arrays;

public class LongestSubaaray {
    public static void main(String[] args) {
        int arr[]={1,2,1,0,1,1,0,1};
        int k=4;
        int sum=0;
        int max=0;
        int left=0;

        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
           
            while(sum>k)
            {
                sum=sum-arr[left];
                left++;
            }
             if(sum<=k &&max<i-left+1)
            {
                max=i-left+1;
            }
        }
      
        System.out.println(max);
    }
    
}


//Array has three types : 
//Sliding window 
//fixed or variable size

//Find the longest subarray whos sum is even in a list of eliments