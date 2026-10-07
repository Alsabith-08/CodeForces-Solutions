package CodeForces;

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
