package Arrays;

public class CinemaBooking {
    public static void main(String[] args) {
        int seats[]={1,0,0,0,1,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,};

        int i=0;
        int count=0;
        int max=0;
        while(i<seats.length)
        {
            if(seats[i]==0)
            {
                count++;
                
            }
            else if(seats[i]==1)
            {
                max=max<count?count:max;
                count=0;
            }
            max=max<count?count:max;
            i++;
        }
        System.out.println(max);

    }
    
}
