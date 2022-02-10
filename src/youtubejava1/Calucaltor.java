
package youtubejava1;

import java.util.Scanner;

/**
 *
 *4. Write a Java program to perform basic Calculator operations(+,-,*,/
 */
public class Calucaltor {
    
    void run(){
        
      Scanner s = new Scanner(System.in);
      //read the numbers
      System.out.println("Enter number 1: ");
      double number1 = s.nextDouble();
      
      System.out.println("Enter number 2: ");
      double number2 = s.nextDouble();
      
      
      while(true){
      //display the menu
      System.out.println("1. Sum  2. Sub  3. Mul  4. Div  5. Exit\nEnter your option: ");
      int option = s.nextInt();
      
      switch(option){
          case 1:
              //calculate the sum
              double sum = number1+number2;
              System.out.println("The sum : "+sum);
              break;
          case 2:
              //calculate the sub
              double sub = number1-number2;
              System.out.println("The sub : "+sub);
              break;
              
          case 3:
              //calculate the mul
              double mul = number1*number2;
              System.out.println("The mul : "+mul);
              
             break;
          case 4:
              //calculate the div
              double div = number1/number2;
              System.out.println("The div : "+div);
              break;
          case 5:
              System.exit(0);
          default:
              System.err.println("Wrong option !!");
              break;
         }
      }
      
      
      
    }
    
}
