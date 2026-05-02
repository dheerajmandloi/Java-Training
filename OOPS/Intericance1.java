package OOPS;
class Car{
    String color;
    String model;
    String brand;
    int mileage;
    int no_of_gears;

    Car(String color,String model,String brand,int mileage,int no_of_gears){
        this.color = color;
        this.brand = brand;
        this.model = model;
        this.mileage = mileage;
        this.no_of_gears=no_of_gears;
    }

    void applyBrake(){
        System.out.println("Breaking");
    }
    void applySpeed(){
        System.out.println("Speed....");
    }
    void shiftGear(){
        System.out.println("Speed....");
    }
}

class Verna extends Car{
    
}
public class Intericance1 {
    
}