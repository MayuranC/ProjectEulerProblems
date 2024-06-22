package ProjectEuler10;

/**
 *
 * @author Mayuran
 *
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
public class P4_LargestPalindromeProduct {

    public static void main(String[] args) {
        int max = 0, prod=0;
        for (int i = 999; i > 99; i--) {

            for (int j = 999; j > 99; j--) {
                prod = i * j;
                if (palindrome(prod) && prod > max) {
                    System.out.println(prod);
                    max = prod;
                }
            }
        }
        System.out.println(prod);

    }

    public static boolean palindrome(int num) {
        if (num%10==0) {
            return false;
        }
        String pal = num + "";

        for (int i = 0, j = (pal.length() - 1); i < j; i++, j--) {
            if (pal.charAt(i) != pal.charAt(j)) {
                return false;
            }
        }
        return true;

    }
}
