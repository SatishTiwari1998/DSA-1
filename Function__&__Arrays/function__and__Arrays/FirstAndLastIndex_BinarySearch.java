package function__and__Arrays;

import java.util.Arrays;

public class FirstAndLastIndex_BinarySearch {

	public static void main(String[] args) {
		
		int arr[]= {4,5,5,5,6,6,8,8,8,8,10,12,15,22,22,22,22,22,22,45,67,89,89,89,100};
		int ans[]= {-1,-1};
		ans[0]=search(arr,22,true);
		ans[1]=search(arr,22,false);
		
		System.out.println(Arrays.toString(ans));
		
		

	}
	
	public static int search(int arr[], int target, boolean findFirstIndex)
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
				if(findFirstIndex)
				{
					end=mid-1;
				}
				else
				{
					start=mid+1;
				}
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
