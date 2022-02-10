
package youtubejava1;

import java.util.Scanner;

/**
 *
 * 3. Write a Java program to perform Prime number
   2,3,5,7,9,11,      number/2 != 0
 */
public class PrimeNumber {
    
    
    void run(){
      Scanner s = new Scanner(System.in);
      //get the value from user
      System.out.print("Enter a intger number: ");
      int number = s.nextInt();
      
      //check the number if it is not equal to zero after dividing the number on 2
      if(number%2 != 0){
        System.out.print("This is a prime number");
      }
      else if(number == 2){
         System.out.print("This is a prime number");
      }
      else if(number == 0){
           System.out.print("This is not a prime number");
      }
      else{
          System.err.print("Wrong option!!");
      }
    }
}
