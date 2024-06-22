package ProjectEuler20;

/**
 *
 * @author Mayuran
 *
 * https://projecteuler.net/problem=19
 *
 * Determine how many first days of the month were Sundays in the 20th century
 * (1 Jan 1901 to 31 Dec 2000)
 */
public class P19_CountingSundays {

    public static void main(String[] args) {

/////////////////////////////////// First attempt with no libraries /////////////////////////////////////////         
        int sundays = 0;
        int dayCount = 2;   //Starting on a Tuesday, 2nd day of the week
        int[] daysInAMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};      //Array with the number of days in a month

        for (int i = 1901; i < 2001; i++) {        //cycling through years

            daysInAMonth[1] = i % 4 == 0 ? 29 : 28; //checking for leap year and changing february days accordingly

            for (int j = 0; j < 12; j++) {      //cyclng through months in that year
                if (dayCount == 7) {            //adding a day if sunday is first of month
                    sundays++;
                }

                dayCount = dayCount + (daysInAMonth[j] - 28);   //changing the day of the week to the new first day of the month
                                                                // Every month, the 1st and 28th date have the same day, so we can just
                if (dayCount > 7) {                             //  subtract the difference in number of days
                    dayCount = dayCount - 7;
                }
            }
        }
        
        System.out.println(sundays);

    }

}
