/*简易计算器  明天升级一下！！*/
import java.util.*;
import java.io.*;
public class App4_3
{
	public static void main(String args[]) throws IOException
	{
		double a,b;
		Scanner reader=new Scanner(System.in);
		a=reader.nextDouble();
		BufferedReader buf;
		char oper;
		buf=new BufferedReader(new InputStreamReader(System.in));
		oper=(char)buf.read();
		b=reader.nextDouble();
		switch(oper)
		{
			case '+':
			System.out.println("a+b="+(a+b));
			break;
			case '-':
			System.out.println("a-b="+(a-b));
			break;
			case '*':
			System.out.println("a*b="+(a*b));
			break;
			case '/':
			System.out.println("a/b="+(a/b));
			break;
			default:
			System.out.println("您输入的运算符不正确！");
		}
	}
}