package ProjectEuler20;

/**
 *
 * @author Mayuran
 *
 * Which starting number, under one million, produces the longest Collatz
 * Problem chain?
 *
 */
public class P14_LongestCollatzSequence {

    public static void main(String[] args) {
        int max=0, maxNum=1, count;
        long num;
        for (int i = 1; i < 1000000; i++) {
            num = i; 
            count = 1;

            while (num != 1) {
                count++;
                if (num % 2 == 0) {
                    num = num / 2;
                } else {
                    num = (3 * num) + 1;
                }
            }
            
            if (count > max) {
                max = count;
                maxNum = i;
            }
            
            System.out.println(i + " : " + count + " : " + max);
            
        }

        System.out.println(maxNum);

    }

}
