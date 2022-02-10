
package youtubejava1;

/**
 *
 *1.  Write a program in java to display the months having 30 days and 31 days using switch statement.
 * January
Jan	31
2	
February
Feb	28 (29 in leap years)
3	
March
Mar	31
4	
April
Apr	30
5	
May
May	31
6	
June
Jun	30
7	
July
Jul	31
8	
August
Aug	31
9	
September
Sep	30
10	
October
Oct	31
11	
November
Nov	30
12	
December
Dec	31
 */
public class Months {
    void run(){
        int day = 30;
        
        switch(day){
            case 28:
                System.out.print("Feb	28 (29 in leap years)");
                break;
            case 30:
                System.out.println("Apr	30, Jun	30, Sep	30, Nov	30");
            case 31:
                System.out.println("Jan	31, Mar	31, May	31, Jul	31, Aug	31, Oct	31, Dec	31");
                break;
            default: 
                System.err.print("Wrong option");
                break;
        }
    }
}
