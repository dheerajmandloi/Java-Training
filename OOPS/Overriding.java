package OOPS;

class A{
    void add(int a,int b)
    {
      System.out.println("Total from A:"+(a+b));
    }
}
class B extends A{
    void add(int a,int b)
    {
      System.out.println("Total from B :"+(a*b));
    }
}
public class Overriding {
    public static void main(String[] args) {
        B b=new B();
        b.add(10, 20);
    }
    
}
