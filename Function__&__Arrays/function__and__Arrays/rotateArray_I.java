package function__and__Arrays;


// Problem Statement:
// Given a array and a key array, for each element in key[i], rotate the array clockwise if key[i]>0 and anticlockwise if
// if key[i]<0.

public class rotateArray_I {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5};
		int key[] = {1,1,1,1,1};
		int sum=0;
		for(int i=0;i<key.length;i++)
		{
			if(key[i]>0)
			{
				rotateClockwise(arr);
				sum=arr[arr.length-1]-arr[0];
				
			}
			if(key[i]<0)
			{
				rotateAntiClockwise(arr);
				sum+=arr[arr.length-1]-arr[0];
				
			}
		}
		printArr(arr);
		System.out.println(sum);

		

	}
	
	public static void rotateClockwise(int arr[])
	{
		int start=0;
		int end=arr.length-1;
		while(start<end)
		{
			swap(arr,start,end);
			start++;
			end--;
		}
		
		start=0;
		end=arr.length-2;
		
		while(start<end)
		{
			swap(arr,start,end);
			start++;
			end--;
		}	
		
	}
	
	public static void rotateAntiClockwise(int arr[])
	{
		int start=0;
		int end=arr.length-1;
		while(start<end)
		{
			swap(arr,start,end);
			start++;
			end--;
		}
		
		start=1;
		end=arr.length-1;
		
		while(start<end)
		{
			swap(arr,start,end);
			start++;
			end--;
		}	
		
	}
	
	public static void swap(int arr[],int i,int j)
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	public static void printArr(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

}
