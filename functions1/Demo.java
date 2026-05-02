package functions1;

public class Demo {
        

   static void add(int a,double b,String msg) 
    {
        
        a=50;
        b=80.0;
        double c=a+b;
        msg= "helloooooo....";
        System.out.println(c);
    }


    public static void main(String[] args) {
       int a= 10;
       float b= 20.0f;
       String ms="hiiiiiiiiii";

       add(a,b,ms);

       System.out.println("a = "+a);
       System.out.println("b = "+b);
       System.out.println(ms);
    }
    
}

//Methods : with object 
//Funtion: without object
//static : ye lagane se stack me jate hai or object banane ki need nhi hai 
//String constant pool : specific memory in java for the string 


