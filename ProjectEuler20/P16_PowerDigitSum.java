package ProjectEuler20;

import java.math.BigInteger;


/**
 *
 * @author Mayuran
 * 
 * https://projecteuler.net/problem=16
 * 
 * To determine the sum of digits of 2^(1000).
 */

public class P16_PowerDigitSum {

    public static void main(String[] args) {
        int power = 15;
        
        BigInteger num = new BigInteger("1");
        BigInteger numTemp = new BigInteger("2");
        
        for (int i = 0; i < 999; i++) {
            num = numTemp.multiply(BigInteger.valueOf(2)); 
            numTemp = num;
        }
        
        String BigNum = num+"";
        System.out.println(BigNum);
        
        int sum=0;
        for (int i = 0; i < BigNum.length(); i++) {
            sum += Integer.parseInt(BigNum.charAt(i)+"");
        }
        
        
        System.out.println("Sum of Digits is: " + sum);
    }

}
