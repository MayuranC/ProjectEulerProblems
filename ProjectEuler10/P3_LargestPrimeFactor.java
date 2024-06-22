package ProjectEuler10;

/**
 *
 * @author Mayuran
 *
 * What is the largest prime factor of the number 600851475143 ?
 */
public class P3_LargestPrimeFactor {

    public static void main(String[] args) {

        long num = 600851475143L;
        long max=1;
        System.out.println(primeCheck(num));
        
        while(!primeCheck(num)){
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    max=i;
                    num = num/i;
                    break;
                }
            }
            max = num;
        }
        
        System.out.println(num);

    }

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
