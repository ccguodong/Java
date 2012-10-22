/*输入n，计算1+2+。。。。+n*/
import java.util.*;
public class App4_8
{
	public static void main(String args[])
	{
		Scanner reader=new Scanner(System.in);
		int n;
		do{
			System.out.print("请输入一个正整数：");
			n=reader.nextInt();
		}
		while(n<0);
		int sum=0;
		int temp=1;
		do{
			sum=sum+temp;
			++temp;
		}
		while(temp<=n);
		System.out.println("1+2+...+"+n+"="+sum);
	}
}