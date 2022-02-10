
package youtubejava1;

import java.util.Scanner;

/**
 *
 * 2. Write a java program to calculate the area of triangle and circle.
 * triangle weight * height /2
 * circle a = Br*2    B = 3.14
 */
public class Areas {
    
    void run(){
      Scanner s = new Scanner(System.in);
      
      System.out.println("1. The area of Triangle   2. the area of circle\n Enter one option: ");
      int option = s.nextInt();
      
      if(option == 1){
          //get the input
         System.out.println("Enter the weight: ");
         double w = s.nextDouble();
         //get the input
         System.out.print("Enter the height: ");
         double h = s.nextDouble();
         //do the process
         double areaT = (w*h)/2;
         //show  result
         System.out.print("The area of traingle: "+ areaT);
      }
      else if(option == 2){
          //get the input
         System.out.println("Enter the rudis: ");
         double r = s.nextDouble();
         
         //do the process
         double b = 3.14;
         double areaC = (r*2)*b;
         
         //show t result
         System.out.print("The area of circle: "+ areaC);
      }
      else{
        System.err.print("Wrong option !!");
      }
    }
    
}
