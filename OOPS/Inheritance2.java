package OOPS;

class Bikes{
    String color;
    String model;
    String milage;

    Bikes(String color, String model,String milage)
    {
        this.color=color;
        this.model=model;
        this.milage=milage; 
    }

    void Speed(){
        System.out.println("Speed applied");
    }
    void Break()
    {
        System.out.println("Break applied");
    }
}

class Honda extends Bikes{
    private int price;

    Honda(String color,String model,String milage,int price){
        super(color,model,milage);
        this.price=price;
    }

    public void getPrice(){
        System.out.println("Price is "+price);
    }
    public void setPrice(int price)
    {
        this.price=price;
    }



}
public class Inheritance2 {
    Honda b=new Honda(null, null, null, 0);
    
    
}
