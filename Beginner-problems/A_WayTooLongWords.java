package CodeForces;

// problem : 71A - Way Too Long Words
// https://codeforces.com/contest/71/problem/A
// difficulty : 800

// idea : find the word length + if length > 10 print first letter of word + reduce word length by 2 + print the last letter of word
// Time Compelexity : O(n x L)  , Space Complexity :O(L) -> for current word

import java.util.Scanner;

public class A_WayTooLongWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if(!sc.hasNextInt()){
            return;
        }
        int n = sc.nextInt();

        for (int i = 0; i <n ; i++) {
            String word = sc.next();
            int len = word.length();

            if(len > 10){
                System.out.println("" +word.charAt(0) + (len -2) + word.charAt(len-1));
            }else{
                System.out.println(word);
            }
        }
    }
}
