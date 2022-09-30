import java.util.Scanner;

class Main3 {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);

    System.out.println("Enter the length of the rectangle:");
    System.out.println("Enter the height of the rectangle:");

    // Numerical input
    int length = myObj.nextInt();
    int height = myObj.nextInt();

    // Output input by user

    int sum = height *2 + length *2;
    int sum2 = height * length;

    System.out.println("The perimiter of the rectangle is " + sum);
    System.out.println("The area of the rectangle is " + sum2);
  }
}
