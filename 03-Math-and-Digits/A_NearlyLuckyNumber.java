package CodeForces;

// Problem : 110A - NearlyLuckyNumber
// https://codeforces.com/problemset/problem/110/A
// IDEA : check character by character if that are 4 or 7 increment count +1
//       convert count to String , boolean variable initially true
//       check character of count is == be a 4 or 7 YES , otherWise NO

// Time Complexity: O(n)    , Space Complexity : O(n)
import java.util.Scanner;
public class A_NearlyLuckyNumber {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            String s = sc.next();
            int count = 0;
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i) == '4' || s.charAt(i) == '7'){
                    count ++;
                }
            }

            String c = String.valueOf(count);
            boolean lucky = true;
            for(int i=0 ; i<c.length() ; i++){
                if(s.charAt(i) != '4' && s.charAt(i) != '7'){
                    lucky = false;
                    break;
                }
            }

            if(lucky){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }

        }
}
