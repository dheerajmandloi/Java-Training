
//find the length of longest subarray whose sum == k
//input : {1,2,3,-2,5,2}
//k: 5

package Arrays;

import java.util.*;

public class PrefixSum {

    public static void main(String[] args) {
        int arr[]={1,2,3,-2,5,2};
        int k=5;
        int n=arr.length;
        int max=0,l=0,sum=0;

        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
            if(sum ==k && max<i+1)
            {
                max=i+1;
            }
            if(map.containsKey(sum-k))
            {
                max = max > i-map.get(sum-k) ? max : i-map.get(sum-k);
            }
            if(!map.containsKey(sum))
            {
                    map.put(sum,i);
            }  
        }
        System.out.println(max);

    }
    
}