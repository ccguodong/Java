/* s=n! ����һ������1������m,����s<mʱ����s��n*/
import java.util.*;
public class App4_10
{
	public static void main(String args[])
	{
			int s;
			int n=1;
			int m;
			Scanner reader=new Scanner(System.in);
			do{
			System.out.print("������һ������1 ��������");
			m=reader.nextInt();
			}
			while(m<1);
			do{
				s=1;
				for(int i=1;i<=n;i++)
				{
					s=s*i;
				}
				n++;
			}
			while(s<=m);
			n=n-1;
			s=s/n;
			n--;
			System.out.println("s="+s+";n="+n);
	}
}