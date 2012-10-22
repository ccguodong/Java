/*Fibonacci序列 f1=0; f2=1; fn=fn-1 + fn-2  (n>=3)*/
import java.util.*;
public class App4_5
{
	public static void main(String args[])
	{
		int num;
		long a=0,b=1;
		long c;
		int i=3;
		Scanner reader=new Scanner(System.in);
		System.out.println("您想要输出几项Fibonacci数列？");
		num=reader.nextInt();
		if(num==1)
		System.out.println("0");
		else if(num==2)
		System.out.println("0"+" "+"1");
		else if(num>=3)
		{
			System.out.print("0"+" "+"1"+" ");
			while(i<=num)
			{
				c=a+b;
				System.out.print(c+" ");
				a=b;
				b=c;
				i++;
			}
		}
		else
		System.out.println("输入无效！");
	}
}