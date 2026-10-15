package CodeForces;

// https://codeforces.com/contest/617/problem/A
// IDEA : use div + mod operations with the largest step

//Time Complexity : O()     ,  Space Complexity :O()

import java.util.Scanner;

public class A617_Elephant {                                    // example : 12
    public static void main(String[] args) {                    // d / 5 = 2
                                                                // d % 5 = 2        -> 2 != 0 then add 1
        Scanner sc = new Scanner(System.in);                    // so , 2+1 = output (3)

        System.out.println("Enter the distance : ");            // get the distance that elephant travel
        int d = sc.nextInt();

        int moves = d /5;                                      // calculate moves(1,2,3,4 or 5)
                                                               // divide the distance with 5 (because 5 is highest move we find the minimum steps to reach)
        if(d % 5 !=0){                                         // then module with 5 NOT EQUAL to 5 add 1
            moves = moves + 1;
        }
        System.out.println(moves);
    }
}
