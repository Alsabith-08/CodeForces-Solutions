package CodeForces;

//https://codeforces.com/contest/4/problem/A
// 
import java.util.Scanner;
public class A_Watermelon {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Weight : ");
        int w = sc.nextInt();

        // divide into two parts and those two parts are must be an even value
        if(w > 2 && w%2 == 0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
