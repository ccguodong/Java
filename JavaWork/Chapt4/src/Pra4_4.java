//1!+2+!+...+n!µÄ½á¹û
import java.util.*;
public class Pra4_4
{
	public static void main(String args[])
	{
		int n;
		Scanner reader=new Scanner(System.in);
		n=reader.nextInt();
		int sum=0;
		for(int i=1;i<n;i++)
		{
			int temp=1;
			for(int j=1;j<=i;j++)
			{
				temp=temp*j;
			}
			sum=sum+temp;
			System.out.print(i+"!+");
		}
		int temp=1;
		for(int j=1;j<=n;j++)
			temp=temp*j;
		sum=sum+temp;
		System.out.print(n+"!=");
		System.out.println(sum);
	}
}