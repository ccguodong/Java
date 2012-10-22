/*用辗转相除法求两个整数的最大公约数*/
import java.util.*;
public class App4_9
{
	public static void main(String args[])
	{
		int n1,n2;
		int a,b,temp;
		Scanner reader=new Scanner(System.in);
		System.out.println("请输入两个整数");
		System.out.print("第一个整数：");
		n1=reader.nextInt();
		System.out.print("第二个整数：");
		n2=reader.nextInt();
		n1=n1>=0?n1:-n1;
		n2=n2>=0?n2:-n2;
	//	System.out.println(n1+" "+n2); 测试成功
		a=n1>=n2?n1:n2;
		b=n1<=n2?n1:n2;
	//	System.out.println(a+" "+b); 测试成功
		while(b!=0)
		{
			temp=b;
			b=a%b;
			a=temp;
		}
		System.out.println(n1+"和"+n2+"的最大公约数是"+a);
	}
}