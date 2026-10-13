package CodeForces;

// problem  : 791A - Bear And BigBrother
// https://codeforces.com/problemset/problem/791/A
// IDEA : multiply a with 3 and multiply b with 2 until a > b
//        Each multiply increase years

// Time Complexity : O(log n)     , Space Complexity : O(1)

import java.util.Scanner;

public class A791_BearAndBigBrother {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();                        // a's weights = 4
        int b = sc.nextInt();                        // b's weights = 7
        int years = 0;                               // initially years = 0

        while(a <= b){                                // check whether  a's weights over b's
            a = a * 3;                                // a weight increase 3 in a year   and b weight increase 2 in a year
            b = b * 2;

            years++;                                 // increase a years +1
        }
        System.out.println("Total Years :" + years);
    }
}
