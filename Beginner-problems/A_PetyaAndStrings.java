package CodeForces;

// https://codeforces.com/contest/112/problem/A
// IDEA : convert to lowerCase / UpperCase
//        compare to String and store to integer variable ,
//        greater than 0 - return 1 ,
//        less than 0 - return -1 ,
//        otherWise - return 0

// Time Complexity : O(n)   
// Space Complexity : O(n)

import java.util.Scanner;

public class A_PetyaAndStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                                                    // INPUT : 
        String s1 = sc.next();                      // s1 = aaaA
        String s2 = sc.next();                      // s2 = AaaA

        s1 = s1.toLowerCase();                      // s1 = aaaa
        s2 = s2.toLowerCase();                      // s2 = aaaa
                                                                    //       ascii
        int result = s1.compareTo(s2);              // for s1   (aaaa - 'a' -  97 )   - 388
                                                    // for s2   (aaaa - 'a' -  97 )   - 388   , then 388 -388 = 0
        if(result < 0) {
            System.out.println(-1);                //  less than 0    -> return 1
        }else if(result > 0){                      //  greater than 0 -> return 1 
            System.out.println(1);
        }else{                                     //  otherWise      -> return 0
            System.out.println(0);
        }
    }
}
