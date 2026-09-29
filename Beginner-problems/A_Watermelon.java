package CodeForces;

// problem : 4A - Watermelon
// https://codeforces.com/contest/4/problem/A
// Difficulty : 800

// idea : check whether the watermelon weight can be divided into two positive even parts
// Time Complexity : O(1)   , Space Complexity : O(1)

import java.util.Scanner;
public class A_Watermelon {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();

        // w can be divided into two positive even parts
        if(w > 2 && w%2 == 0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
