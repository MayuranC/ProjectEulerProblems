package ProjectEuler10;


/**
 *
 * @author Mayuran
 * 
 * Find the difference between the sum of the squares of the first one hundred natural numbers, 
 * and the square of the sum of the first one hundred natural numbers.
 */

public class P6_SumSquareDifference {

    public static void main(String[] args) {
        int squaresSum=0, sum=0;
        
        for (int i = 1; i < 101; i++) {
            sum+=i;
        }
        int sumSquared = sum*sum;
        
        for (int i = 1; i < 101; i++) {
            squaresSum += (i*i);
        }
        
        int diff =  sumSquared - squaresSum;
        
        System.out.println(diff);
    }

}
