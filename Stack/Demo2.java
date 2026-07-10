package Stack;

import java.util.*;

public class Demo2 {

    public static void main(String[] args) {

        int[] arr = { 2, 1, 5, 9, 7, 10 };
        int n = arr.length;
        int[] ans = new int[n];

        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {

            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                ans[i] = -1;
            } else {
                ans[i] = stack.peek();
            }

            stack.push(arr[i]);
        }

        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}

// we need to count how many days a price the price of stock is less then or
// eqaual to current price
// we are give with the set of history price of stock
// input : 50,80,60,70,60,100,90
// output : 1 2 2 3 3 6 6
