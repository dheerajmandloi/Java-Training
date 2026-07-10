package Recursion;

import java.util.ArrayList;
import java.util.List;

public class SubArrayPrint {
    public static void findSubsets(int[] arr, int index, List<Integer> current) {

        System.out.println(current);
        for (int i = index; i < arr.length; i++) {
            current.add(arr[i]);
            findSubsets(arr, i + 1, current);
            current.remove(current.size() - 1);

        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2 };
        findSubsets(arr, 0, new ArrayList<>());
    }
}