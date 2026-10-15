package CodeForces;

// https://codeforces.com/problemset/problem/116/A
//IDEA : count passengers after every stop and store
//       the highest number reached as the minimum tram capacity

// Time Complexity : O(n)    ,  Space Complexity O(1)
import java.util.Scanner;

public class A116_Tram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);               // example: get input to the user
                                                           // 4 stops
        int passenger = sc.nextInt();                      // exit   : entry
                                                           // 0        3
        int current = 0;                                   // 2        5
        int max = 0;                                       // 4        2
                                                           // 4        0
        for (int i = 0; i <passenger ; i++) {
                                                          // for 1st iteration
            int exit = sc.nextInt();                      // current = 0 - 0 + 3
            int entry = sc.nextInt();                     // max = (3 , 0) , max=3

            current = current - exit + entry;            // passengers currently inside the tram
            max = Math.max(current , max);               // highest no .of passengers present at any stop
        }
        System.out.println(max);
    }
}
