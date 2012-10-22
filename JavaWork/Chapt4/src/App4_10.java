/* s=n! 输入一个大于1的整数m,满足s<m时最大的s及n*/
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
			System.out.print("请输入一个大于1 的整数：");
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