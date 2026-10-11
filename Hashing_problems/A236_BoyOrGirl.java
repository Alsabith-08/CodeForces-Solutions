package CodeForces;

// Problem : 236A-BoyOrGirl
// https://codeforces.com/problemset/problem/236/A
// Approach : HashSet
// IDEA : store the character to the hashSet (it stores only unique character
//        then its size is odd -> ignore him otherwise , chat with her

// Time Complexity : O(n)    , Space Complexity : O(n)

import java.util.*;

public class A236_BoyOrGirl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();                                  // get the String from user

        HashSet<Character> set = new HashSet<>();             // create a set

        for (int i = 0; i <s.length() ; i++) {                // traverse from string length
            if(!set.contains(s.charAt(i))){                   // check each character is on set , if not add  , if already had ignore it
                set.add(s.charAt(i));
            }
        }

        int size =set.size();

        if(size % 2 == 0) {                                 // if the size of set is even -> Female
            System.out.println("CHAT WITH HER!");
        }else{                                              // if odd -> Male
            System.out.println("IGNORE HIM!");
        }
    }
}
