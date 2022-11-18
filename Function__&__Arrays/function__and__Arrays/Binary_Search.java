package function__and__Arrays;

public class Binary_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {10,20,30,35,40,55,73,87,110,112};
		
		System.out.println(binarySearch(arr,110));

	}
	
	public static int binarySearch(int arr[], int target)
	{
		int pos=-1;
		int start=0;
		int end=arr.length-1;
		
		while(start<=end)
		{
			int mid=start+(end-start)/2;
			if(arr[mid]==target)
			{
				pos=mid;
				return pos;
			}
			else if(arr[mid]>target)
			{
				end-=1;
			}
			else
			{
				start+=1;
			}
		}
		
		return pos;
	}

}
