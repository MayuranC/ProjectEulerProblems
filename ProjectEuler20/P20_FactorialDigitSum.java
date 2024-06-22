package ProjectEuler20;

import java.math.BigInteger;

/**
 *
 * @author Mayuran
 * 
 * https://projecteuler.net/problem=20
 * 
 * 
 */
public class P20_FactorialDigitSum {

    public static void main(String[] args) {

        int num = 100;
        BigInteger ans = new BigInteger("1");

        for (int i = 1; i <= num; i++) {
            ans = ans.multiply(new BigInteger(i + ""));
        }

        System.out.println(ans);

        String number = ans + "";
        int total = 0;
        for (int i = 0; i < number.length(); i++) {
            total += Integer.parseInt(number.charAt(i)+"");
        }
        
        System.out.println(total);
    }

}
