package Assignment.Two;

import java.util.Scanner;

public class LinearSearch {
  public static int search(int[] arr, int index){
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == index) {
        return i;
      } 
    }
    return -1;
  }
  public static void main(String[] args) {
    int[] array = new int[10];
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter array");
    for (int i = 0; i < array.length; i++) {
      array[i] = scanner.nextInt();
    }
    int key;
    System.out.println("Please enter the element you want to search");
    key = scanner.nextInt();
    int result = search(array, key);
    if (result == -1) {
      System.out.println("The element is not present in array");
    } else {
      System.out.println("Element " + key + " Is found at index " + result);
    }
  }   
}
