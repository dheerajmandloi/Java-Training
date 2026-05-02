public class finocci 
{
    
    public static void main(String[] args) 
    {
        int a=0,b=1,c=0,i=1,n=10;
        System.out.print(a+" "+b);
        while(i<=n)
        {
            c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
            i++;
        }
        
    }
}
