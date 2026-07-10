package Arrays;

public class CommonPrefix {
    public static void main(String[] args) {
        String strs[]={"flower","flow","flights","flight","flu","fluuuuur"};
         int check=0;
        int index=0;
        int strs1=0;
        for(int i=0;i<strs.length;i++)
        {
            strs1=strs[i].length();
            
            if(check<strs1)
            {
                check=strs1;
                index=i;
            }
        }
         for(int i=0;i<strs.length;i++)
        {
            strs1=strs[i].length();
            
            if(check>strs1)
            {
                check=strs1;
                index=i;
            }
        }
        
        for(int i=0;i<strs.length;i++)
        {
            
        }


        System.out.println(check);
        System.out.println(index);
        //System.out.println(check);
    }
    
}
