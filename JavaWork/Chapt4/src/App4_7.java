/*�û��ڼ������������ɸ�����ÿ����һ�����谴Enter����Table����ո��ȷ�ϣ�
 * ����ڼ���������һ���������ַ���������������������̣�Ȼ�������Щ���ĺ�*/
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
		System.out.println("����������"+n+"������"+"���Ϊ"+sum);
	}
}