package Assignment.One;

import java.util.Scanner;

public class sumOdd {
  public static void main(String[] args) {
    Scanner object = new Scanner(System.in);
    System.out.println("Enter Number");
    int size = object.nextInt();
    if (size >= 0) {
      System.out.println("Sum of Odd integers from 0 to " + size +" = "+sumOffOdd(size));
    } else {
      System.out.println("OOps!! Can't work, Please enter positive number");
    }
    
  }
  public static int sumOffOdd(int n){
    int sum = 0;
    for (int i = 0; i <= n; i++) {
      if (i%2 !=0) {
        sum +=i;
      }
    }
    return sum;
  }
}
