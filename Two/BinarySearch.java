package Assignment.Two;
import java.util.Scanner;

public class BinarySearch {
  public static void binarySearch(int arr[], int first, int last, int key){  
    int mid = (first + last)/2;  
    while( first <= last ){  
       if ( arr[mid] < key ){  
         first = mid + 1;     
       }else if ( arr[mid] == key ){  
         System.out.println("Element is found at index: " + mid);  
         break;  
       }else{  
          last = mid - 1;  
       }  
       mid = (first + last)/2;  
    }  
    if ( first > last ){  
       System.out.println("Element is not found!");  
    }  
  }  
  public static void main(String args[]){  
    int[] arr = new int[10];
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter array");
    for (int i = 0; i < arr.length; i++) {
      System.out.print("At index "+ i + " : ");
      arr[i] = scanner.nextInt();
    }
    int key;
    System.out.println("Please enter the element you want to search");
    key = scanner.nextInt();
    int last=arr.length-1;  
    
    binarySearch(arr,0,last,key);     
  } 
}
