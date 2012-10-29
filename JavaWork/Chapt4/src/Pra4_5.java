import java.util.*;
public class Pra4_5
{
	public static void main(String args[])
	{
		int n;
		Scanner reader=new Scanner(System.in);
		System.out.print("ÇëÊäÈëÕûÊın:");
		n=reader.nextInt();
		double sum=0;
		for(int i=1;i<=n;i++)
		{
			double unit;
			double temp=1;
			double sign=i%2==0?-1:1;
			for(int j=1;j<=i;j++)
			{
				temp=temp*j;
			}
			unit=sign*(1/temp);
			sum=sum+unit;
		}
		System.out.println("1-1/2!+1/3!-...-(-1)n-1 1/n!="+sum);
	}
}