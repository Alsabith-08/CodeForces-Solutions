package CodeForces;

// Problem : 158A
// https://codeforces.com/contest/158/problem/A

// IDEA : compare the k value for others if greater than or equal, increase the answer count
// Time Complexity : O(n)   , Space Complexity : O(n)


import java.util.Scanner;

public class A_NextRound {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);              // INPUT from user

        int n = sc.nextInt();                             // n = 8
        int k = sc.nextInt();                             // k = 5

        int[] score  = new int[n];                        // create empty an array of size n (score)

        for (int i = 0; i <n ; i++) {                     // traverse through n
            score[i] = sc.nextInt();                      // store one by one value in array
        }

        int answer = 0;                                   // initially 0

        for (int i = 0; i < n; i++) {
            if(score[i] >= score[k -1] && score[i] >0){      // NOTE : must be greater than 0
                answer++;
            }
        }

        System.out.println(answer);
    }
}
