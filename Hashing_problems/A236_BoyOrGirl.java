package CodeForces;

// https://codeforces.com/problemset/problem/236/A
// Approach : HashSet
// IDEA : store the character to the hashSet (it stores only unique character
//        then its size is odd -> ignore him otherwise , chat with her

// Time Complexity : O(n)    , Space Complexity : O(n)

import java.util.*;

public class A236_BoyOrGirl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i <s.length() ; i++) {
            if(!set.contains(s.charAt(i))){
                set.add(s.charAt(i));
            }
        }

        int size =set.size();

        if(size % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        }else{
            System.out.println("IGNORE HIM!");
        }
    }
}
