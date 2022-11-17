package function__and__Arrays;

public class decimalToAnyBaseConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(decimalToBase(63,8));
		
	}
	
	public static int decimalToBase(int n, int b)
	{
		int rv=0;
		int p=1;
		
		while(n>0)
		{
			int digit=n%b;
			rv+=digit*p;
			p=p*10;
			n=n/b;
		}
		
		return rv;
	}

}
