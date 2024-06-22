package ProjectEuler10;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Mayuran
 * 
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */

public class P1_MultiplesOf3or5 {

    public static void main(String[] args) {
        
        List<Integer> nums = new ArrayList<>();
        int sum=0;
        
        for (int i = 1; i < 1000; i++) {
            nums.add(i);
        }
        System.out.println(nums);
        for(int x : nums){
            if (x%3==0 || x%5==0) {
                sum += x;
                //System.out.println(x);
            }
        }
        
        System.out.println(sum);
    }

}
