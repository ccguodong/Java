/*�������������ж������������ֵ��Сֵ*/
import java.util.*;
public class App4_1
{
	public static void main(String args[])
	{
		double a,b,c;
		double max,min;
		System.out.println("������������");
		Scanner reader=new Scanner(System.in);
		a=reader.nextDouble();
		b=reader.nextDouble();
		c=reader.nextDouble();
		if(a>=b)
		{
			max=a;
			min=b;
		}
		else
		{
			max=b;
			min=a;
		}
		if(max<=c)
		max=c;
		else
		{
			if(min>=c)
			min=c;
		}
		System.out.println("max="+max);
		System.out.println("min="+min);
	}
}