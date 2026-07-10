package Recursion;

public class PrintNum {
    public static void main(String[] args) {
        fun(1);
    }

    static int fun(int i) {
        if (i == 10) {
            return i;
        }
        System.out.println(i);
        return fun(i + 1);
    }

}
