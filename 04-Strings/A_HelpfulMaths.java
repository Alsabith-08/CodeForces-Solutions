package CodeForces;

// problem : 339A - Heplful Maths
// https://codeforces.com/problemset/problem/339/A

// IDEA : Count frequency + Reconstruct String in order
// Time Complexity : O(n)   
// Space Complexity : O(1)

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class A_HelpfulMaths {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));      // Buffered Reader -> read the input efficiently
        String line = reader.readLine();                                                   // store the input as a String

        if(line == null || line.isEmpty()) return;                                         // check whether string is Empty or null

        int[] count = new int[4];                                                          // create a count (array) of size 4

        for (int i = 0; i < line.length(); i++) {                                          // that store the frequency of each numbers
            char ch = line.charAt(i);

            if(ch >= '1' && ch <= '3'){
                count[ch -'0']++;                                                          // update into array
            }
        }

        StringBuilder sb = new StringBuilder();                                            // String Builder => use for adding character efficiently
        boolean first = true;                                                              // this boolean uses for adding '+' after each number

        for (int val = 1; val <=3 ; val++) {                                               // use a while loop for adding number if has duplicates
            while(count[val] > 0){ 
                if(!first){                                                                // initially the first is number so true
                    sb.append('+');
                }
                sb.append(val);                                                            // store that value int stringBuilder
                first = false;                                                             // then make it false and decrement the count value of that number
                count[val]--;
            }
        }
        System.out.println(sb.toString());                                                 // convert into string and return
    }
}
