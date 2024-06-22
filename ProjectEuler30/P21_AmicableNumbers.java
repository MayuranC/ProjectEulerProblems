package ProjectEuler30;

/**
 *
 * @author Mayuran
 *
 * https://projecteuler.net/problem=21
 *
 * Calculate the sum of all amicable numbers under 1000
 */
public class P21_AmicableNumbers {

    public static void main(String[] args) {

        int total = 0;
        for (int i = 4; i < 10000; i++) {                                       //Checking all numbers till 10 000
            int div1 = divisorSum(i);                                           //Creating divisor sums
            int div2 = divisorSum(div1);
            if (div1 != div2 && i == div2) {                                    //Ensuring the divisor sums aren't equal and that they match
                System.out.println(div1 + " | " + div2 + " | " + i);
                total+=div1;
            }
        }
        
        System.out.println(total);

    }

    //Method for creating the sum of all divisors
    public static int divisorSum(int num) {
        int total = 1;

        int temp = num;
        for (int j = 2; j < temp; j++) {
            int tempD = num/j;
            if (num % j == 0) {
                total = (j == tempD) ? total + j : total + (tempD + j) ;
            }
            temp = tempD;

        }

        return total;
    }

}
