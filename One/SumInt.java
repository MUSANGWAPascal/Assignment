package Assignment.One;

import java.util.Scanner;

public class SumInt {
  public static void main(String[] args) {
    int size;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter size to calculate sum of n integers");
    size = scanner.nextInt();
    if (size>=0) {
      sumOfInt(size);
    }
    else{
      System.out.println("OOps!! Can't work, Please enter positive number");
    }
  }
  public static int sumOfInt(int n){
    int sum = 0;
    for (int i = 0; i <= n; i++) {
      sum += i;
    }
      System.out.println("\n\n Sum of size: "+n+" = " + sum);
    return 0;
  }
}
