package OOPS;

class Car{
    String color;
    String model;
    int mileage;
    int no_of_gears;

    Car(String color,String model,int mileage,int no_of_gears){
        this.color=color;
        this.model=model;
        this.mileage=mileage;
        this.no_of_gears=no_of_gears;
    }

    void applySpeed(){
        System.out.println("Speed applied");
    }
    void applyGear(){
        System.out.println("Gear applied");
    }
    void applyBreak(){
        System.out.println("Break applied");
    }


}

class BMW extends Car{
    private int capacity;

    BMW(String color,String model,int mileage,int no_of_gears,int capacity){
        super(color,model,mileage,no_of_gears);
        this.capacity=capacity;

    }
    

    void airbags(){
        System.out.println("Airbags applied");
    }
    public void getCapacity(){
        System.out.println("Capacity is "+capacity);
    }
    public void setCapacity(int capacity){
        this.capacity=capacity;
    }
}
public class Inheritance {

    public static void main(String[] args) {
        BMW b=new BMW("Black","M3",100,5,4);
        b.applySpeed();
        b.applyGear();
        b.applyBreak();
        b.airbags();
    }
    
}


//Single level inheritance: A to B

//Multilevel inheritance: A to B to C

//Multiple inheritance: 

//Hierarchical inheritance: A to B and A to C

//Hybrid inheritance: A to B and B to C , D , E......

//Super keyword: 