package Week1Exercises.Program7;

import java.util.Scanner;

public class AgeCalculatorAmend {

    public static void main(String[] args) {
      
        /*
         Scanner obtains the input of primitive data types
         */
        Scanner myObj = new Scanner(System.in);
        
        
          /*
          Establishing data types 
           */
        
          int age;
          int year;
          int dob;
          
          year = 2022;
        
          System.out.println("Enter your age:");
    
          age = myObj.nextInt();
    
        
          dob = (year - age);
    
          System.out.println ("You were born in in " + dob);
    
          }
        }
    

