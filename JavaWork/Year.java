import java.util.*;
public class Year   //����һ�������ж��Ƿ�Ϊ����
{
	public static void main(String args[])
	{
		int iyear;
		System.out.print("������һ����ݣ�");
		Scanner reader=new Scanner(System.in);
		iyear=reader.nextInt();
		boolean a;
		a=(iyear%4==0&iyear%100!=0)||(iyear%400==0);
		if(a==true)
		System.out.println("����Ϊ����");
		else
		System.out.println("����Ϊƽ��");

	}
}