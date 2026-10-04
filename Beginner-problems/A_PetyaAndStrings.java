package CodeForces;

// https://codeforces.com/contest/112/problem/A
// IDEA : convert to lowerCase / UpperCase
//        compare to String and store to integer variable ,
//        greater than 0 - return 1 ,
//        less than 0 - return -1 ,
//        otherWise - return 0

// Time Complexity : O(n)   , Space Complexity : O(n)
import java.util.Scanner;

public class A_PetyaAndStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        int result = s1.compareTo(s2);

        if(result < 0) {
            System.out.println(-1);
        }else if(result > 0){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}
