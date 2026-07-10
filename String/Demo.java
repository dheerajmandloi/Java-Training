package String;

public class Demo {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("MS Dhoni");

        sb.append(new char[]{'7','1','4'});
        sb.deleteCharAt(3);
        sb.reverse();
        sb.insert(2, "am");
        sb.setCharAt(2, 'v');
        sb.replace(2, 4, "Dheeraj");

        System.out.println(sb);
    }
    
}

//Sequence of characters is called string.....

//String is a class

//String is immutable

//String is thread safe

//all methods are Syncronized

//SCP: String constant pool.........

//String buffer : mutable , final class ,thread safe , syncronized methods

//String builder : mutable , final class ,thread unsafe ,fast operation


