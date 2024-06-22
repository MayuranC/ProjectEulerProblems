package ProjectEuler10;


/**
 *
 * @author Mayuran
 * 
 * 
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product a*b*c.
 */

public class P9_SpecialPythagoreanTriple {

    public static void main(String[] args) {
        
        for (int i = 1; i < 1001; i++) {                //Triple for loop to test all values
            for (int j = 1; j < 1001; j++) {
                for (int k = 1; k < 1001; k++) {
                    if (Check(i, j, k)) {
                        System.out.println(i+ " " + j + " " + k);       //print values and product when conditions are met;
                        System.out.println(i*j*k);
                        
                    }
                }
            }
        }
        
    }
    
    public static boolean Check(int a, int b, int c){
        int pyth= (a*a) + (b*b);
        
        if (a+b+c==1000 && pyth == (c*c)) {
            return true;
        }
        return false;
    }
    
    

}
