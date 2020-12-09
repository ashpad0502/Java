package Sorting;
public class Selectionsort
{
 public int[] selectionsort(int arr[], int n)
 {
	 int min,temp;
	 for(int i=0;i<n-1;i++)
	{   
		 min = i;
		for(int j=i+1;j<n;j++)
		{ 
		  if(arr[j]<arr[i])
			min = j;  
		}
		 temp = arr[i];
		 arr[i] = arr[min];
		 arr[min] = temp;
	}
	return arr;
 }
}
