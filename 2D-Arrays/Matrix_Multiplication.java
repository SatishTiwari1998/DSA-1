
public class Matrix_Multiplication {

	public static void main(String[] args) {
		
		int A[][]=generateMatrix(4,3);
//		int B[][]=generateMatrix(3,2);
//		int C[][]=matrixMultiplication(A,B);
//		
		printMatrix(A);
//		printMatrix(B);
//		printMatrix(C);
		
		stateOfWakanda_I(A);
		
		
		

	}
	
	public static int[][] generateMatrix(int row,int col)
	{
		int mat[][]=new int[row][col];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				mat[i][j]=randomInt();
			}
		}
		
		return mat;
		
	}
	
	public static int randomInt()
	{
		int min=3;
		int max=9;
		
		return min+(int)(Math.random()*((max-min)+1));
	}
	
	public static void printMatrix(int mat[][])
	{
		int row=mat.length;
		int col=mat[0].length;
		
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static int[][] matrixMultiplication(int A[][], int B[][])
	{
		int X[][]= {{-1,-1},{-1,-1}};
		
		int r1=A.length; int c1=A[0].length;
		int r2=B.length; int c2=B[0].length;
		
		if(c1!=r2)
		{
			return X;
		}
		
		int ans[][]=new int[r1][c2];
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c2;j++)
			{
				int sum=0;
				for(int k=0;k<c1;k++)
				{
					sum+=A[i][k]*B[k][j];
				}
				ans[i][j]=sum;
			}
		}
		
		return ans;
		
		
	}

	public static void stateOfWakanda_I(int mat[][])
	{
		int row=mat.length;
		int col=mat[0].length;
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(mat[j][i]+" ");
			}
		}
	}
}
