package Assignment.One;

import java.util.Scanner;

public class sumSquare {
  public static void main(String[] args) {
    int size;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number");
    size = scanner.nextInt();
    if (size >= 0) {
      System.out.println("Sum of squares = "+ sum(size));
    } else {
      System.out.println("OOps!! Can't work, Please enter positive number");
    }
    
  }
  public static int sum(int n){
    
    int sum = 0;

    for (int i = 0; i < n; i++) {
      sum += (int) Math.pow(i, 2);

    }
    // System.out.println(sum);
    return sum;
  }
}
