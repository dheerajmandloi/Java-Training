import java.util.*;
public class ElectricityBill {
    public static void main(String[] args) {
        System.out.print("Enter the units consumed : ");
        Scanner sc = new Scanner(System.in);
        int units = sc.nextInt();
        double bill =50;

        if(units <100){
            bill += units *1.5;
        }
        else if(units <200){
            bill += 100*1.5 + (units-100) *3.5;
        }
        else{
            bill += 100*1.5 + 100 *3.5 + (units-200)*5;
        }

        if(bill>2000){
            bill = bill *1.1;
        }
        System.out.println("Total Bill : "+ bill);
        sc.close();
    }
}