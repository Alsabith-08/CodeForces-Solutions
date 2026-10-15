package CodeForces;

// Problem : 148A - Insomnia cure
// https://codeforces.com/problemset/problem/148/A
// IDEA : count all attack and return it , NOTE : don't count overlapping attacks

// Time Complexity : O(n)     , Space Complexity : O(1)

import java.util.Scanner;

public class A148_InsomniaCure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                                                     // Example :
        int k = sc.nextInt();                        // k = 1
        int l = sc.nextInt();                        // l = 2
        int m = sc.nextInt();                        // m = 3
        int n = sc.nextInt();                        // n = 4

        int d = sc.nextInt();                        // d = 12 (total Dragons Head)

        int count = 0;                               // count  = 0 (initially)
        for (int i = 1; i <=d ; i++) {
            if(i % k ==0 ||i % l ==0 ||i % m ==0 ||i % n ==0 ){    // if any attack occur count it
                count++;
            }
        }                                                      
        System.out.println("Total Head attacks : " +count);    // output : 12
    }

}
