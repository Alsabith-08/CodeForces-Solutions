
// Problem : 616A - Longest K-Good Segement
// https://codeforces.com/problemset/problem/616/D
// Pattern : Two Pointers + HashMap
// IDEA : Use a sliding window with a HashMap to find the longest contiguous segment 
//        containing at most k distinct elements 

// Time Complexity : O(n)     , Space COmplexity : O(n)

import java.util.* ;

public class D616_LongestkGoodSegment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] a = new int[n+1];

        for (int i = 0; i <n; i++) {
            a[i] = sc.nextInt();
        }

        HashMap<Integer , Integer> freq = new HashMap<>();    // create a hashMap

        int left = 0;                      // variables - left  , distinct 
        int distinct = 0;                  // bestLength - valid segement length found so far
                                           // bestLeft = starting index of bestSegement
        int bestLength = 0;                // bestRight  = ending index of bestSegement
        int bestLeft = 0;
        int bestRight = 0;

        for (int right = 0; right < n; right++) {               // loop through n
            int value = a[right];                               // if the current value is new add to map with frequency and increase distinct

            if(freq.getOrDefault(value, 0) == 0){
                distinct++;
            }

            freq.put(value , freq.getOrDefault(value , 0)+1);

            while(distinct > k){                           // if distinct exceeds the k 
                int leftValue = a[left];                   // remove the left value if that frequency is 0 then , decrease distinct      
                int count = freq.get(leftValue) - 1;   

                if (count == 0) {
                    freq.remove(leftValue);
                    distinct--;
                } else {
                    freq.put(leftValue, count);            // otherwise add to map and move left
                }

                left++;
            }

            int length = right - left +1;                // find the current length of window

            if(length > bestLength){                     // if length is better than bestLength update left , right , bestlength
                bestLength = length;
                bestLeft = left;
                bestRight = right;
            }
        }

        System.out.println((bestLeft + 1)   + " " + (bestRight + 1));  // for print the output add +1 because 1- based indices
    } 
}
