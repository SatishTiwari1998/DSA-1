package function__and__Arrays;

public class RotateArray_II {

	public static void main(String[] args) {
		
		char arr[]= {'a','b','c','d','e'};
		rotate(arr,-4);
		printArr(arr);
		
	}
	
	public static void reverse(char arr[],int start,int end)
	{
		while(start<end)
		{
			char temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	}
	
	public static void rotate(char arr[], int k)
	{
		k=k%arr.length;
		if(k<0)
		{
			k=k+arr.length;
		}
		reverse(arr,0,arr.length-1);
		reverse(arr,0,arr.length-k-1);
		reverse(arr,arr.length-k,arr.length-1);
	}
	
	public static void printArr(char arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

}
