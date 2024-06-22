package ProjectEuler20;

import java.text.DecimalFormat;
import java.util.Arrays;

/**
 *
 * @author Mayuran
 *
 * https://projecteuler.net/problem=17
 *
 * Count the number of letters in all numbers till 1,000. No spaces. 
 */
public class P17_NumberLetterCounts {

    public static void main(String[] args) {
        int sum1_99 = 0;
        int total =0;
        int decimalNumbers = 36;       //Number of letters in numbers 1-9
        sum1_99 += decimalNumbers;
        
        int tens =  6*2 + 7*2 + 8*4 + 9 + 3;        //Number of letters in numbers 10-19 (3 - "ten") (9 - "seventeen")
        sum1_99 += tens;
        
        int twenties = (10 * 6) + decimalNumbers;   //number of letters in 20-29 (10 * "twenty")
        sum1_99 += twenties;
        
        int thirthies = twenties;                   //number of letters in 30-39 (10 * "thirty"), both 6 letters
        sum1_99 += thirthies;
        
        int forties = (10 * 5) + decimalNumbers;    //number of letters in 40-49 (10 * "forty")
        sum1_99 += forties;
       
        int fifties = forties;                      //number of letters in 50-59 (10 * "fifty"), 
        sum1_99 += fifties ;
        
        int sixties = forties;                      //number of letters in 60-69 (10 * "sixty"), 
        sum1_99 += sixties;
        
        int seventies = (10 * 7) + decimalNumbers;  //number of letters in 70-79 (10 * "seventy")
        sum1_99 += seventies;
        
        int eighties = twenties;                    //number of letters in 80-89 (10 * "eighty")
        sum1_99 += eighties;
        
        int nineties = twenties;                    //number of letters in 90-99 (10 * "eighty")
        sum1_99 += nineties;
        
        total += sum1_99;
        
        ///////////////////////////// TOTAL = ALL NUMBERS FROM 1 - 99 /////////////////////////////
        
        int hundreds1 = 13*99 + 10 + sum1_99;           //numbers from 100-199 (13 = "one hundred and"), (10 is for "one hundred" alone)
        total += hundreds1;
        
        int hundreds2 = hundreds1;                      //numbers from 200-299 ("one" = "two" = 3 letters)
        total += hundreds2;
        
        int hundreds3 = 15*99 + 12 + sum1_99;           //numbers from 100-199 (15 = "three hundred and"), (12 is for "three hundred" alone)
        total += hundreds3;
        
        int hundreds4 = 14*99 + 11 + sum1_99;           //numbers from 400-499 (14 = "four hundred and"), (11 is for "four hundred" alone)
        total += hundreds4;
        
        int hundreds5 = hundreds4;                      //numbers from 500-599 ("four" = "five" = 4 letters)
        total += hundreds5;
    
        int hundreds6 = hundreds1;                       //numbers from 600-699 ("one" = "six" = 3 letters)
        total += hundreds6;
    
        int hundreds7 = hundreds3;                       //numbers from 400-499 ("three" = "seven" = 5 letters)
        total += hundreds7;
        
        int hundreds8 = hundreds3;                       //numbers from 400-499 ("three" = "eight" = 5 letters)
        total += hundreds8;
        
        int hundreds9 = hundreds4;                       //numbers from 400-499 ("four" = "nine" = 4 letters)
        total += hundreds9;
        
        total+= 11;                                     //"one thousand" = 11 letters
        
        ///////////////////////////// TOTAL = ALL NUMBERS FROM 1 - 1000 /////////////////////////////
        
        System.out.println(total);
    }

}
