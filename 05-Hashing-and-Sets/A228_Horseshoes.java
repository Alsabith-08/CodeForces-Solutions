
// Problem : 228 A -  Is your horseshoe on the other hoof ? 
// https://codeforces.com/problemset/problem/228/A
// IDEA : Using set to find the total distict element then subract by 4 

// Time Complexity : O(1)    , Space Complexity : O(1)

import java.util.HashSet;
import java.util.Scanner;

public class A228_Horseshoes {  
    public static void main(String[] args) {            // Example : 4 
         Scanner sc= new Scanner(System.in);            //           1 7 3 3

        int n = sc.nextInt();                           

        HashSet<Integer> set = new HashSet<>();         // create HashSet
        for (int i = 0; i < 4; i++) {                   // set removes duplicates automatically
            set.add(sc.nextInt());
        }

        System.out.println(4 - set.size());          // then subract set size by 4 
    }
}
