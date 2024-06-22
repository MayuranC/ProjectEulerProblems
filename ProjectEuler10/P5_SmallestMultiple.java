package ProjectEuler10;

/**
 *
 * @author Mayuran
 *
 * What is the smallest positive number that is evenly divisible by all of the
 * numbers from 1 to 20?
 */
public class P5_SmallestMultiple {

    public static void main(String[] args) {
        int num = 21;
        int count;
        
        boolean rem = false;

        while (!rem) {                      //first while loop runs as long as a remainder exists for divisors 1-20
            
            count = 2;
            rem = true;
            while (count < 21) {            //Inner loop is checking for a remainder to run the outer loop
                if (num % count != 0) {
                    num++;
                    count = 12;
                    rem = false;
                }
                count++;
            
            }

        }
        System.out.println(num);
    }
}
