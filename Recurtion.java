public class Recurtion {
    public static void main(String[] args) 
    {
        rec(1);
    }
    static void rec(int a)
    {
        if(a>5)
        {
            return;
        }
        
        a++;
        rec(a);
        System.out.println(a);
        
    }
}
