package Arrays;

import java.util.*;

public class LongestSubsString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string:");
        String s = sc.nextLine();

        System.out.println("Enter value of k:");
        int k = sc.nextInt();

        HashMap<Character, Integer> map = new HashMap<>();

        int l = 0;
        int max = 0;

        for (int r = 0; r < s.length(); r++) {

            char ch = s.charAt(r);

            map.put(ch, map.getOrDefault(ch, 0) + 1);

            while (map.size() > k) {

                char leftChar = s.charAt(l);

                map.put(leftChar, map.get(leftChar) - 1);

                if (map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }

                l++;
            }

            max = Math.max(max, r - l + 1);
        }

        System.out.println("Length of longest substring is: " + max);

        sc.close();
    }
}