package CodeForces.B_problems;

// https://codeforces.com/problemset/problem/266/B
// IDEA : Repeat for t seconds, scanning adjacent students and swapping whenever BG appears. After each swap,
//        skip the next position so no student moves twice in the same second.

// Time Complexity : O(n*t)    , Space Complexity :O(n)

import java.util.Scanner;

public class B266_QueueAtTheSchool {
    public static void main(String[] args) {                       // example : n = 5 (five characters), t = 1 (1 second)
        Scanner sc = new Scanner(System.in);                       // s = BGBGG
                                                                   // convert s to char[] -> ['B','G','B','G','G']
        int n = sc.nextInt();
        int t= sc.nextInt();                                       // traverse through t times so one swap of all characters
                                                                   // swap BG -> GB     , BG -> GB   , G
        String s = sc.next();
        char[] ch = s.toCharArray();                               // Output : GBGBG

        for (int second = 0; second <t ; second++) {                  // iterate through t times
            for (int i = 0; i < n-1; i++) {                           // iterate through n-1 times (because i compare to i+1)
                if(ch[i] == 'B' && ch[i+1] == 'G'){                   // ith is B and i+1th is G
                    char temp = ch[i];                                // swap
                    ch[i] = ch[i+1];
                    ch[i+1] = temp;

                    i++;                                              // then move two-step forward
                }
            }
        }
        System.out.println(new String(ch));                          // return a new string of ch
    }
}
