import java.util.*;
public class Cpra5_1
{
	public static boolean text(int k)  //测试一个数是否为素数
	{
		if(k>=0)
		{
			if(k==2)
				return true;
			else if(k%2==0)
				return false;
			else
			{
				int j=3;
				while(j<Math.sqrt(k)&&(k%j!=0))
					j++;
				if(j>Math.sqrt(k))
					return true;
			}
		}
     	return false;
	}
	public static void main(String args[])
	{
		int n;
		Scanner reader=new Scanner(System.in);
		n=reader.nextInt();
		for(int i=1;i<n/2;i++)
		{
			if(text(i))
			{
				if(text(n-i))
					System.out.println(n+"="+i+"+"+(n-i));
		//		break;
			}
		}
	}
}