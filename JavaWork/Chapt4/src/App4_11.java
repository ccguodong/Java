/*¼ÆËãÀÛ¼ÓºÍ*/
import java.util.*;
public class App4_11
{
	public static void main(String args[])
	{
		int s=0;
		int n;
		Scanner reader=new Scanner(System.in);
		n=reader.nextInt();
		int i=n;
		for(;i>1;i--)
		{
			s+=i;
			System.out.print(i+"+");
		}
		System.out.println(i+"="+(s+i));
	}
}