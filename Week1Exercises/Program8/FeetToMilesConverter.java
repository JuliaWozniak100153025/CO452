package Week1Exercises.Program8;

import java.util.Scanner;

public class FeetToMilesConverter {

public static void main(String[] args) 

{
      
    /*
     Scanner obtains the input of primitive data types
     */
    Scanner myObj = new Scanner(System.in);
    
    
      /*
      Establishing data types 
       */
    
      int feet;
      double mile;
      double convertion;

      System.out.println("Input the feet you would like to convert into miles: ");

      convertion = myObj.nextInt();

      feet = 5280;
      mile = 0.000894;
      convertion = feet * 0.000894;

    
      System.out.println("The amount of feet inputted is equal to following miles - " + convertion);

      mile = myObj.nextInt();


    
}
}
    