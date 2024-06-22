package ProjectEuler20;


/**
 *
 * @author Mayuran
 * The sequence of triangle numbers is generated by adding the natural numbers. 
 * So the 7th triangle number would be 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28
 * 
 * Factors of 28, showing 5 divisors
 * 28: 1,2,4,7,14,28
 * 
 * What is the value of the first triangle number to have over five hundred divisors?
 */

public class P12_HighlyDivisibleTriangularNumbers {

    public static void main(String[] args) {
        boolean flag500 = false;
        
        long natrualNum = 1;
        long triangularNum=0;
        
        int factorCount, max=2;
        
        while(!flag500){
            factorCount=2;
            
            triangularNum+=natrualNum;
            
            
            long loopCount = triangularNum;         //This step massively reduces resource usage by
            for (int i = 2; i < loopCount; i++) {   // dividing the number by the lower number of the factor pair, and setting the 
                if (triangularNum % i ==0) {        // loop count variable to the higher value
                    factorCount+=2;
                    loopCount=triangularNum/i;      //RUNTIME WAS CUT FROM 8 MIN TO 0 SECONDS!!!
                }
            }
            if (max<factorCount) {
                max = factorCount;
            }
            
            System.out.println(natrualNum + " : "+ factorCount+ " : " + max);
            natrualNum++;
            if (factorCount>=500) {
                flag500=true;
                System.out.println(triangularNum);
            }
            
        }
        
        
    }

}