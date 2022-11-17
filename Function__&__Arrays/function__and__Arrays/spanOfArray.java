package function__and__Arrays;

public class spanOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {2,5,3,65,45,23,45,12,9,45};
		
		System.out.println(arraySpan(arr));

	}
	
	public static int arraySpan(int arr[])
	{
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++)
		{
			max=Math.max(max, arr[i]);
			
			min=Math.min(min, arr[i]);
		}
		
		return max-min;
	}

}
