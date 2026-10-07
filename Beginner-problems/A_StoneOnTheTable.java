package CodeForces;

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
