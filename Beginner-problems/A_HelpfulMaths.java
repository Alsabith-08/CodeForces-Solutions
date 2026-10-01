package CodeForces;

// https://codeforces.com/problemset/problem/339/A
// 
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class A_HelpfulMaths {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();

        if(line == null || line.isEmpty()) return;

        int[] count = new int[4];

        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);

            if(ch >= '1' && ch <= '3'){
                count[ch -'0']++;
            }
        }

        StringBuilder sb = new StringBuilder();
        boolean first = true;

        for (int val = 1; val <=3 ; val++) {
            while(count[val] > 0){
                if(!first){
                    sb.append('+');
                }
                sb.append(val);
                first = false;
                count[val]--;
            }
        }
        System.out.println(sb.toString());
    }
}
