package ProjectEuler10;


/**
 *
 * @author Mayuran
 * 
 * By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
 */

public class P2_EvenFibonacciNumbers {

    public static void main(String[] args) {
        
        int num1 = 1;
        int num2 = 2;
        int temp,sum=0;
        
        while(num2 < 4000000){
            if (num2 % 2 == 0) {
                sum += num2;
            }
            temp = num2;
            num2 = num1+num2;
            num1 = temp;
        }
        
        System.out.println(sum);
    }

}
