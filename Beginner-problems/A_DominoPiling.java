package CodeForces;

// https://codeforces.com/problemset/problem/50/A
// Approach : simple calculation
// IDEA : : multiply row to col then divide by 2

// Time Complexity : O(1)   , Space Complexity : O(1)

import java.util.Scanner;

public class A_DominoPiling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the matrix Row :");
        int m = sc.nextInt();

        System.out.print("Enter the matrix Col :");
        int n = sc.nextInt();

        System.out.println("Answer :" +(m*n)/2);
    }
}
