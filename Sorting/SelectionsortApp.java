package Sorting;
import java.util.*;
public class SelectionsortApp 
{
 public static void main(String args[])
 {
  int arr[] = new int[10];
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the array size <10: ");
  int n=sc.nextInt();
  System.out.println("Enter array elements: ");
  for(int i=0;i<n;i++)
   arr[i]=sc.nextInt();
  Selectionsort ss = new Selectionsort();
  int sorted [] = ss.selectionsort(arr, n);
  System.out.println("Sorted array after Selection Sort: ");
  for(int i=0;i<n;i++)
  System.out.print(sorted[i]+" ");
  sc.close();
 }
}
