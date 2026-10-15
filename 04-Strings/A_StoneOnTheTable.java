package CodeForces;

// Problem : 266A - Stone On the Table
// https://codeforces.com/contest/266/problem/A
// IDEA : if index and nextIndex have a same value update answe +1

// Time Complexity : O(n)   , Time Complexity : O(1)

public class A_StoneOnTheTable {
    public static void main(String[] args) {
        String s = "RRBRBB";
        int answer = 0;
        for (int i = 0; i <s.length()-1 ; i++) {
            if(s.charAt(i) == s.charAt(i+1)){
                answer++;
            }
        }
        System.out.println(answer);
    }
}
