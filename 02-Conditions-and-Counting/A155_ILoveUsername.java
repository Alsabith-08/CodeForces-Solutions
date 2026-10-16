package CodeForces;

// Problem : 155A - I love username
// https://codeforces.com/problemset/problem/155/A
// IDEA : Count how many times a score becomes a new maximum or a
//        new minimum compared with all previous scores.

// Time Complexity : O()    , Space COmplexity : O()

import java.util.Scanner;                               // example : 5    -> 100 , 20 , 30 , 10 , 2
public class A155_ILoveUsername {                       // min & max = 100
    public static void main(String[] args) {            // then 2nd element - 20 > 100 X ,  20 < 100 (min) count +1
        Scanner sc = new Scanner(System.in);            // then 3rd element - 30 > 100 X , 30 < 20       (nothing happen) still count 1
                                                        // like this ......................
        int n =sc.nextInt();

        int min_Score = sc.nextInt();                    // assign min and max score as first element
        int max_score = min_Score;                       // initially count 0
        int count = 0;

        for (int i = 1; i < n; i++) {                    // traverse the numbers
            int score = sc.nextInt();                    // one by one compare

            if(score > max_score){                       // is score greater than max, assign to max increment count (NOT >=)
                max_score = score;
                count++;
            }else if(score < min_Score){                 // is score lesser than max, assign to min increment count (NOT >=)
                min_Score = score;
                count++;
            }
        }
        System.out.println(count);
    }
}
