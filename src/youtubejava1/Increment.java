
package youtubejava1;

import java.util.Scanner;

/**
 *
 * 5. Write a program in Java to perform Increment(++) /Decrement(--)
operators
 */
public class Increment {
    void run(){
      Scanner s= new Scanner(System.in);
      int option =0;
      //take the input
      System.out.print("Enter intger value: ");
      int number = s.nextInt();
      do{
       System.out.println("1. Increment  2. Decrement  3. Exit\nEnter option: ");
       option = s.nextInt();
      
      if(option == 1){
         number = number +1;
         //number++;
         //number +=1; 
      }else if(option == 2){
       number = number - 1;
       
      }else if(option == 3){
      System.exit(0);
      }else{
        System.err.print("wrong option !!");
      }
      System.out.println("The value is: "+ number);
        
      }while(option != 3);
     
    }
}
