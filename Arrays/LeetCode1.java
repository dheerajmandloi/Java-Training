package Arrays;


public class LeetCode1 {
    public static void main(String[] args) {
        int arr[]=new int []{ 5,6,4,3,8,2,7};
        int max =0;
        int smax = 0;
        int  min = Integer.MAX_VALUE, smin = Integer.MAX_VALUE,tmin= Integer.MAX_VALUE;
        for (int num  : arr) {
            if (num>max)  
            {
                smax = max; 
                max = num;  
            }
            else if (smax< num && max!= num) 
            {
                smax= num;    
            }
            if (num<min) {
                tmin = smin;
                smin = min;
                min = num;
                
            }
            else if (num<smin && num!= min) {
                tmin= smin;
                smin =  num;
            }

            else if ( num<tmin&& num!= smin) {
                tmin= num;
                
            }
            
        }
        System.out.println("Second max:"+ smax);
        System.out.println("third min:"+ tmin);
       
        }
    }