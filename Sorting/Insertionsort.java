package Sorting;
public class Insertionsort 
{
	public int[] sort(int arr[], int n)
	 {
		int temp,j;
		for(int i=1;i<n;i++)
		{
			temp = arr[i];
			for(j=i-1;j>=0;j--)
			{
				if(arr[j]>temp)
				    arr[j+1] = arr[j];
				else
					break;
			}
			arr[j+1] = temp;
		}
		return arr;
	 }
}
