package Week1Exercises.Program4;

import java.util.Scanner;

class AverageNumberCalculator {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);

    //User input & output

    System.out.println("Input an number:");

    double number1 = myObj.nextInt();
    
    System.out.println("Input another number:");

    double number2 = myObj.nextInt();

    // Equation for average of 2 numbers

    double sum = (number1 + number2) / 2;

    // Output 
    System.out.println("This is the average of two numbers entered " + sum);

  }
  
} 
