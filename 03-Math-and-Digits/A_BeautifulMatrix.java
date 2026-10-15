package CodeForces;

// https://codeforces.com/problemset/problem/263/A
//
// Time Complexity : O(n2)    , Space Complexity : O(1)
import java.util.Scanner;

public class A_BeautifulMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));

        int[][] matrix = new int[5][5];             // create a empty 2D array of 5x5

        int row = 0;                               // initially row , col , moves = 0
        int col = 0;
        int moves = 0;

        for (int i = 0; i <matrix.length ; i++) {                     // enter the values
            for (int j = 0; j < matrix[0].length ; j++) {

                matrix[i][j] = sc.nextInt();

                if(matrix[i][j] == 1){                               // find where is 1 put the i into row , j into col
                     row = i;
                     col = j;
                }
                moves = Math.abs(row - 2) + Math.abs(col - 2);     // for 5x5(0 based indexing) 2,2 is center     and those row and col value
                                                                   // you find how many moves to reach that 1 to center
            }
        }
        System.out.println(moves);
    }
}
