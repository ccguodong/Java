/*��շת��������������������Լ��*/
import java.util.*;
public class App4_9
{
	public static void main(String args[])
	{
		int n1,n2;
		int a,b,temp;
		Scanner reader=new Scanner(System.in);
		System.out.println("��������������");
		System.out.print("��һ��������");
		n1=reader.nextInt();
		System.out.print("�ڶ���������");
		n2=reader.nextInt();
		n1=n1>=0?n1:-n1;
		n2=n2>=0?n2:-n2;
	//	System.out.println(n1+" "+n2); ���Գɹ�
		a=n1>=n2?n1:n2;
		b=n1<=n2?n1:n2;
	//	System.out.println(a+" "+b); ���Գɹ�
		while(b!=0)
		{
			temp=b;
			b=a%b;
			a=temp;
		}
		System.out.println(n1+"��"+n2+"�����Լ����"+a);
	}
}