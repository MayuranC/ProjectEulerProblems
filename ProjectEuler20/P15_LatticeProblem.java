package ProjectEuler20;

import java.util.Arrays;

/**
 *
 * @author Mayuran
 * 
 * https://projecteuler.net/problem=15
 * 
 * My solution involved realising I can make a matrix with the possible path numbers as the matrix values. Where the bottom right value is the 2 for a 1x1 block that
 * scales upward diagonally for the nxn blocks I need
 */
public class P15_LatticeProblem {

    public static void main(String[] args) {

        int num = 20;        //Number of blocks in lattice, must be larger than 2
        int bot = num+1;    //Value of max number of bottom row matrix
        long[][] vals = new long[num][num];
        
        //Initiliasing bottom and side matrix row
        for (int i = 0; i < num; i++) {
            vals[num-1][i] = bot;
            vals[i][num-1] = bot;
            bot--;
        }
        
        //Filling the sums of the rest of the answer matrix
        for (int i = num-2; i >= 0; i--) {
            for (int j = num-2; j >= 0; j--) {
                vals[i][j] = vals[i+1][j] + vals[i][j+1];
            }
        }
        
               
        //printing answer matrix
        for (int i = 0; i < num; i++) {
            System.out.println(Arrays.toString(vals[i]));
            
        }
        System.out.println("\nThe Final answer is: " + vals[0][0]);
    }

}
