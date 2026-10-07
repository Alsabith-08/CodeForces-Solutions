package CodeForces;

import java.util.Scanner;

public class A_Bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int x = 0;
        for (int i = 0; i <n ; i++) {
            String operations = sc.next();

            if(operations.contains("++")){
                x++;
            }else{
                x--;
            }
        }
        System.out.println(x);
    }
}
