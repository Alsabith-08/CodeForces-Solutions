
// Problem : 381A
// https://codeforces.me/problemset/problem/381/A
// Approach : Two pointers + Greedy
// IDEA : use two pointer to pick the larger end card on each turn , alter between 
//       sereja and dima while updating their scores

// Time Complexity : O(n)      , Space Complexity : O(1)

import java.util.Scanner;

public class A381_SerejaandDima{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);            // example : 4 
                                                        // 4 1 2 10
        int n = sc.nextInt();                           // first turn sereja , she pick larger end card 10
                                                        // then 10 will be gone , then dima pick the next larger end card 4
        int[] cards = new int[n];                       // while this continue until card will be 0

        for (int i = 0; i < n; i++) {
            cards[i] = sc.nextInt();
        }

        int left = 0 , right = n-1;                     // two Pointers : left = 0 , right = n-1
        int sereja = 0 , dima = 0;                      // initially both player points are 0
        int turn = 0;                                   // turn initially 0

        while(left <= right){
            int card;

            if(cards[left] >= cards[right]){           // check which is larger card
                card = cards[left];                    // store to card (variable)
                left++;                                // if left is larger move left ++(forward)
            }else{
                card = cards[right];
                right--;                               // otherwise move right -- (backward)
            }

            if(turn % 2 == 0){                         // turn is even that sereja turn add the card value to sereja
                sereja += card;                        // is odd that dima turn add the card value to dima
            }else{
                dima += card;
            }

            turn++;                                    // increase turn 
        }
        System.out.println(sereja + " " + dima);       
    }
}