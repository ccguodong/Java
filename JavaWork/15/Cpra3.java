/*�����û��������������ȷ�����ܷ�2��3��5��6��10��15��30����*/
import java.util.*;
public class Cpra3
{
	public static void main(String args[])
	{
		int a;
		Scanner reader=new Scanner(System.in);
		System.out.println("������һ��������");
		a=reader.nextInt();
		if(a%30==0)
		System.out.println(a+"�ܱ�2��3��5��6��10��15��30����");
		else if(a%15==0)
		System.out.println(a+"�ܱ�3,5,15����");
		else if(a%10==0)
		System.out.println(a+"�ܱ�2,5,10����");
		else if(a%6==0)
		System.out.println(a+"�ܱ�2,3,6����");
		else if(a%5==0)
		System.out.println(a+"�ܱ�5����");
		else if(a%3==0)
		System.out.println(a+"�ܱ�3����");
		else if(a%2==0)
		System.out.println(a+"�ܱ�2����");
		else
		System.out.println(a+"���ܱ�2��3��5��6��10��15��30����");
	}
}