package Stack;

import java.util.*;

public class Demo1 {

    public static void main(String[] args) {

        int[] arr = {2, 1, 5, 9, 7, 10};
        int n = arr.length;
        int[] ans = new int[n];

        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = n - 1; i >= 0; i--) {

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

//-1 2 -1 9 -1 9 -1