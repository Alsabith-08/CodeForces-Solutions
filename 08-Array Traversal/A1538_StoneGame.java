package Array;

// Problem  : 1538A - Stone Game
// https://codeforces.com/problemset/problem/1538/a
// IDEA : Find the indices of the smallest and largest elements, 
//        calculate the moves needed using the left, right, and both-end strategies, and return the minimum.

// Time Complexity : O(n)     , Space Complexity : O(1)
import java.util.Scanner;

public class A1538_StoneGame{
    public static void main(String[] args) {       // examlple : 1 - t
        Scanner sc = new Scanner(System.in);       // 10 - n
                                                   // 3 2 1 5 4 7 6 9 8 10           -- output(4)
        int t = sc.nextInt();                      // first remove right end 10 then 3 , 2 , 1 
                                                   // total minimum step to remove largest and smallest in that array is 4
        while(t-- > 0){
            int n = sc.nextInt();

            int maxValue = Integer.MIN_VALUE;     // variables :
            int minValue = Integer.MAX_VALUE;

            int minIndex = 0;
            int maxIndex = 0;

            for (int i = 0; i < n; i++) {            // traverse to find min Value with index and maxValue with index
                int x = sc.nextInt();

                if(x < minValue){
                    minValue = x;
                    minIndex = i;
                }

                if(x > maxValue){
                    maxValue = x;
                    maxIndex = i;
                }
            }

            int left = Math.max(maxIndex , minIndex) +1;               //remove both from left
            int right = n - Math.min(maxIndex  , minIndex);            // remove both from right
            int both = Math.min(minIndex, maxIndex) + 1                // remove one from each end
                     + n - Math.max(minIndex, maxIndex);

            int answer = Math.min(left, Math.min(right, both));            // find minimum

            System.out.println(answer);
        }
    }
 }