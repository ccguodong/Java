/*用户在键盘上输入若干个数，每输入一个数需按Enter键或Table键或空格键确认，
 * 最后在键盘上输入一个非数字字符串结束整个输入操作过程，然后计算这些数的和*/
import java.util.*;
public class App4_7
{
	public static void main(String args[])
	{
		double num;
		double sum=0;
		int n=0;
		Scanner reader=new Scanner(System.in);
		while(reader.hasNextDouble())
		{
			num=reader.nextDouble();
			sum=sum+num;
			n++;
		}
		System.out.println("您共输入了"+n+"个数，"+"其和为"+sum);
	}
}