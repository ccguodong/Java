//求水仙花数
public class Pra4_6
{
	public static void main(String args[])
	{
		int bit,ten,hundred;
		int sum;
		System.out.print("水仙花数为：");
		for(int i=100;i<=999;i++)
		{
			hundred=i/100;
			ten=i/10-hundred*10;
			bit=i-hundred*100-ten*10;
			sum=hundred*hundred*hundred+ten*ten*ten+bit*bit*bit;
			if(sum==i)
				System.out.print(i+" ");
		}
	}
}