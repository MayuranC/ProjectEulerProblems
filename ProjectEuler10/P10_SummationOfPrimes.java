package ProjectEuler10;

/**
 *
 * @author Mayuran
 */

public class P10_SummationOfPrimes {

    public static void main(String[] args) {
        long sum=0;
        
        for (int i = 1; i <2000000 ; i++) {
            System.out.println(i);
            if (primeCheck(i)) {
                sum+=i;
            }
        }
        
        System.out.println(sum);
    }
    
    public static boolean primeCheck(int num) {
        if (num == 1) {
            return false;
        }
        if (num==2 || num==5 ) {
            return true;
        }
        
        String n = num +"";
        
        int lastNum = Integer.parseInt(n.charAt(n.length()-1)+""); 
        
        
        if (lastNum % 2 == 0 || lastNum % 5 == 0) {
            return false;
        }
        

        for (int i = 3; i < num/2; i+=2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    
}
