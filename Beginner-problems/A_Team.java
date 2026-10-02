package CodeForces;


// Problem : 231A
// https://codeforces.com/problemset/problem/231/A

// IDEA : For each problem, check whether at least 2 of the 3 friends think they can solve it.
// Time Complexity : O(n)
// Space Complexity : O(1)

import java.util.Scanner;
public class A_Team {
    public static void main(String[] args) {

        int answer = 0;
        Scanner sc = new Scanner(System.in);
                                            // Sample Input : 0 -> don't solve , 1 -> solve
        int n = sc.nextInt();               // 3

        for (int i = 0; i < n; i++) {        // petya vasya tonya
            int petya = sc.nextInt();        //  1     1      0
            int vasya = sc.nextInt();        //  1     1      1
            int tonya = sc.nextInt();        //  1     0      0

            if (petya + vasya + tonya >= 2) {   // sum is greater than or equal to 2 count it
                answer++;
            }
        }
        System.out.println( " No.Of Problems will Implemented in Contests : " +answer);
    }
}