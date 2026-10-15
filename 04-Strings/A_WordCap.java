package CodeForces;

// Problem : 281A - Word Capitalization
// https://codeforces.com/contest/281/problem/A
// IDEA : convert the String into char array   and change the first index letter to uppercase
//        then store the array into string and return

// Time Complexity : O()     , Sapce Complexity : 0(n)
import java.util.Scanner;

public class A_WordCap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        char[] ch = s.toCharArray();
        ch[0] = Character.toUpperCase(ch[0]);

        String result = new String(ch);

        System.out.println(result);
    }
}
