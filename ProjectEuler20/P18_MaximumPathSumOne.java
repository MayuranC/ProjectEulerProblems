package ProjectEuler20;

import java.util.Arrays;

/**
 *
 * @author Mayuran
 *
 * https://projecteuler.net/problem=18
 *
 * Given a pyramid of numbers, and working down, calculate the largest sum of
 * all paths
 */
public class P18_MaximumPathSumOne {

    public static void main(String[] args) {

        int[][] p1 = {{3}, {7, 4}, {2, 4, 6}, {8, 5, 9, 3}};

        int[][] pyramid = {
        {75},
        {95, 64},
        {17, 47, 82},
        {18, 35, 87, 10},
        {20, 4, 82, 47, 65},
        {19, 1, 23, 75, 3, 3},
        {88, 2, 77, 73, 7, 63, 67},
        {99, 65, 4, 28, 6, 16, 70, 92},
        {41, 41, 26, 56, 83, 40, 80, 70, 33},
        {41, 48, 72, 33, 47, 32, 37, 16, 94, 29},
        {53, 71, 44, 65, 25, 43, 91, 52, 97, 51, 14},
        {70, 11, 33, 28, 77, 73, 17, 78, 39, 68, 17, 57},
        {91, 71, 52, 38, 17, 14, 91, 43, 58, 50, 27, 29, 48},
        {63, 66, 04, 68, 89, 53, 67, 30, 73, 16, 69, 87, 40, 31},
        {4, 62, 98, 27, 23, 9, 70, 98, 73, 93, 38, 53, 60, 4, 23}};

        int pyrLenght = pyramid.length;
        int[] tempB = pyramid[pyrLenght-1];
        int[] tempA = new int[pyrLenght - 1];    

        /**
         * Reversing the pyramid, I calculated the largest sums from the bottom up. 
         * This way means I don't have to check each path individually, and I am only using 2 Arrays at a time for calculations
         */
        
        
        for (int j = pyrLenght - 1; j > 0; j--) {                               
            int x = 0;                                                          
            for (int i = 0; i < pyramid[j - 1].length; i++) {
                int sum1 = pyramid[j - 1][i] + tempB[i];
                int sum2 = pyramid[j - 1][i] + tempB[i + 1];
                tempA[x] = sum1 > sum2 ? sum1 : sum2;
                x++;
            }
            
            tempB = tempA;
            

            tempA = new int[tempB.length - 1];
            System.out.println(Arrays.toString(tempB));
        }
        
        

    }

}
