
// Problem : 279A - BOOKS
// https://codeforces.com/problemset/problem/279/B
// pattern : Two Pointers
// IDEA : Use a sliding window to find the maximum 
//        number of consecutive books whose total reading time does not exceed t.

// Time Complexity : O(n)    , Space Complexity : O(n)

import java.util.Scanner;

public class A279_Books{
    public static void main(String[] args) {                           // examlpe : books - 4   , time = 5
        Scanner sc = new Scanner(System.in);                           // each books take time to read = 3 ,2, 1, 1
                                                                       // output : 3 (2+1+1)  -> consecutive books
        System.out.print("Enter your no .of books :");
        int n = sc.nextInt();

        System.out.print("Enter your time :");
        int t = sc.nextInt();

    
        System.out.println("Enter the time can be read in minutes : ");
        int[] books = new int[n+1];

        for (int i = 0; i < n; i++) {
            books[i] = sc.nextInt();
        }

        int left = 0;                                             // Two Pointers (Sliding Window)  - left and right
        int maxBooks = 0;                                         // maxBooks gives the max Consecutive books
        int sum = 0;                                              // sum gives the total books can read at time (t)

        for (int right = 0; right < n; right++) {
            sum += books[left];                                   // add books one by one on sum

            while(sum > t){                                       // if sum exceeds the t
                sum -= books[left];                               // shrink the window (move left to forward and subract the books time)
                left++;
            }

            maxBooks = Math.max(maxBooks , right  - left +1);    // update the maxBooks 
        }

        System.out.println(maxBooks);                         
    }
}