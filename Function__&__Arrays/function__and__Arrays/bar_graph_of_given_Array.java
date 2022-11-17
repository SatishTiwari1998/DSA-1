package function__and__Arrays;

public class bar_graph_of_given_Array {

	public static void main(String[] args) {
		
		int arr[]= {14,0,2,6,3,43,8,7,9,10,12,34,56,23,45,12,45,62,12,34,89,34,56,87,30,45};
		barGraph(arr);
	

	}
	
	public static void barGraph(int arr[])
	{
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			max=Math.max(max,arr[i]);
		}
		
		for(int floor=max;floor>=1;floor--)
		{
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]>=floor)
				{
					System.out.print("|--|\t");
				}
				else
				{
					System.out.print("----\t");
				}
			}
			
			System.out.println();
		}
	}

}
