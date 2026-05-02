package OOPS;

public class MethodOverload {
    static int add(int a,int b)
    {
        return a+b;
    }
    static int add(int a,int b,int c)
    {
        return a+b+c;
    }
    static double  add(double a,double b)
    {
        return a+b;
    }

}
public class Polimorphism {
    public static void main(String[] args) {
        
    }

    
}

//Notes: 
//Poli morphoism : Many form 

//type : Compile time and run time polimorphism 

//Compile time : method overloading 

//jab hamare pas no. of parameters list (inside parathises) same honge toh compile time polimorphism hoga.. 

//Run time : Method overriding

//jab hamare pas no. of parameters list (inside parathises) same nhi honge toh run time polimorphism hoga..
