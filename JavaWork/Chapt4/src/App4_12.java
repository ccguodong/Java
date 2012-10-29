import java.util.*;
public class App4_12
{
	public static void main(String args[])
	{
		int num;
		int sum=0;
		Scanner reader=new Scanner(System.in);
		System.out.print("请输入一个正整数：");
		num=reader.nextInt();
		if(num==2)
		{
			System.out.println(num+"以内的素数为：2");
			System.out.println(num+"以内的素数和为：2");
		}
		else if(num>2)
		{
			sum=2;
			System.out.print(num+"以内的素数为：2"+" ");
			for(int i=3;i<=num;i++)
			{
				if(i%2!=0)
				{
					int j=3;
					while(j<Math.sqrt(i)&&(i%j!=0))
						j++;
					if(j>Math.sqrt(i))
					{
						System.out.print(i+" ");
						sum=sum+i;
					}
				}
			}
			System.out.println();
			System.out.println(num+"以内的素数和为："+sum);
		}
		else
			System.out.println("请输入2以上的数");
	}
}