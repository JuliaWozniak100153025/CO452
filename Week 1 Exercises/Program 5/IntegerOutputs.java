//package Week 1 Exercises.Program 5;

import java.util.Scanner;

class IntegerOutputs {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);

    
    //User input & output

    System.out.println("Input an number:");

    int number1 = myObj.nextInt();
    
    System.out.println("Input another number:");

    int number2 = myObj.nextInt();

    // Output in original entered order

    System.out.println("The original order of numbers entered is " + number1 + " and " + number2);

    // Output in reverse entered order

    System.out.println("The reverse order of numbers entered is " + number2 + " and " + number1);

  }
}
