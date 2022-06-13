package Assignment.Two;

import java.util.Scanner;

public class AddMatrices {
  public static void main(String[] args) {
    int row1, col1, row2, col2;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter number of row of first matrix");
    row1 = scanner.nextInt();
    System.out.println("Enter number of Colums of first matrix");
    col1 = scanner.nextInt();

    int[][] first = new int[row1][col1];
    
    int[][] result = new int[row1][col1];

    System.out.println("Enter First Matrix");
    
    for (int i = 0; i < row1; i++) {
      for (int j = 0; j < col1; j++) {
        first[i][j] = scanner.nextInt();
      }
    }

    for (int i = 0; i < row1; i++) {
      for (int j = 0; j < col1; j++) {
        System.out.print(first[i][j]+ " ");
      }
      System.out.println();
    }
    System.out.println("Enter number of row of second matrix");
    row2 = scanner.nextInt();
    System.out.println("Enter number of Colums of second matrix");
    col2 = scanner.nextInt();
    int[][] second = new int[row2][col2];
    System.out.println("Enter Second Matrix");
    for (int i = 0; i < row2; i++) {
      for (int j = 0; j < col2; j++) {
        second[i][j] = scanner.nextInt();
      }
    }

    for (int i = 0; i < row2; i++) {
      for (int j = 0; j < col2; j++) {
        System.out.print(second[i][j]+ " ");
      }
      System.out.println();
    }
    System.out.println("\nThe Result after adding first matrix and Second one\n");
    if (row1 == row2 && col1 == col2) {
      for (int i = 0; i < row2; i++) {
        for (int j = 0; j < col2; j++) {
          result[i][j] = first[i][j] + second[i][j];
          System.out.print(result[i][j]+ " ");
        }
        System.out.println();
      }
    }
    else{
      System.out.println("For addition of two matrices, they should always have same order");
    }
  }
}
