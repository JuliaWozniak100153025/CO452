//package Week 1 Exercises.Program 3;

import java.util.Scanner;

class PerimeterAreaCalculator {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);

    //User input & output

    System.out.println("Enter the length of the rectangle:");

    int length = myObj.nextInt();

    System.out.println("Enter the height of the rectangle:");

    int height = myObj.nextInt();

    // Equation for area and perimiter

    int sum = height *2 + length *2;
    int sum2 = height * length;

    // Print area and perimiter
    System.out.println("The perimiter of the rectangle is " + sum);
    System.out.println("The area of the rectangle is " + sum2);
  }
}