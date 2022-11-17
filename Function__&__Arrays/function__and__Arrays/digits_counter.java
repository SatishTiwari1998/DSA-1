package function__and__Arrays;

public class digits_counter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(digitsCounter(912780434,4));

	}
	
	
	public static int digitsCounter(int num,int target)
	{
		int count=0;
		while(num>0)
		{
			if(num%10==target)
			{
				count++;
			}
			
			num=num/10;

		}
		
		return count;
	}

}
