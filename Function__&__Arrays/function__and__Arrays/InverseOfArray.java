package function__and__Arrays;

import java.util.Arrays;

public class InverseOfArray {

	public static void main(String[] args) {
		
		int arr[]= {3,4,1,2,0};
		int ans[]=inverseOfArr(arr);
		System.out.println(Arrays.toString(ans));
		

	}
	
	public static int[] inverseOfArr(int arr[])
	{
		int new_arr[]=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			new_arr[arr[i]]=i;
		}
		
		return new_arr;
	}

}
