package OOPS;

class Student
{
    private int rollno;
   private  String name;
   private  int age;
   private  String section;

    Student(int rollno,String name,int age, String Section) 
    {
      this.rollno = rollno;
      this.name = name;
      this.age = age;
      this.section = Section;
    }

   
    private void study()
    {
        System.out.println("Dont dusturb me i am study");
    }
   private void sleep()
    {
        System.out.println("Sleeping..........");
    }
    public int getRollno() {
        return this.rollno;
    }
    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return this.age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getSection() {
        return this.section;
    }
    public void setSection(String section) {
        this.section = section;
    }

    public void callstudy()
    {
        this.study();
    }
    public void callsleep()
    {
        this.sleep();
    }

}
public class Demo {
    public static void main(String[] args) {
        Student s=new Student(123,"Dheeraj",18,"CSH"); //new memory  allocated //
        
        System.out.println(s.getAge());
        s.callstudy();
      
    }
}

//Class Component: 

// Member data : Attributes/Characterstics...
// Member funtion: Behavior of person =(Eat,sleep)

//Encapsulation : 

//Binding in a single 

//Constructor : 

//Quetion : Create a Bank class with the following attributes : account no ,password,acc holder name ,balance 
//and behaviors as follow : withdraw ,diposite,check balance...
//you need to implement it by followingg encapsulation
//note : write getter or setter  where you need it......