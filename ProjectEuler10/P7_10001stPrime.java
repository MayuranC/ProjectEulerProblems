package ProjectEuler10;


/**
 *
 * @author Mayuran
 * 
 * What is the 10 001st prime number?
 */

public class P7_10001stPrime {

    public static void main(String[] args) {
        int count = 0;
        int num = 1;
        
        while(count < 10001){       //While loop till 10 001 values of count variable
            
            if (primeCheck(num)) {
                count++;            //only increments count value if number is prime
            }
            num++;
        }
        System.out.println(num);
        
    }
    
    //Prime checker, returns boolean
    public static boolean primeCheck(long num) {
        if (num == 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }   

}
