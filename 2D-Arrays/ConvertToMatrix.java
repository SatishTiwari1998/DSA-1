

public class ConvertToMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,2,3,4,5,6,7,8,9};
		int index=0;
		int row=3;
		int col=3;
		
		int matrix[][]=new int[row][col];
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				matrix[i][j]=arr[index++];
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		
			
		

	}

}
