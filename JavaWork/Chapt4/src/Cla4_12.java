//巴贝奇函数x2+x+41到谁之后就不是素数
public class Cla4_12
{
	public static void main(String args[])
	{
		int num=0;
		boolean t=true;
		for(int i=1;t==true;i++)
		{
			num=i*i+i+41;
			for(int j=3;j<=Math.sqrt(num);j++)
			{
				if(num%j==0)
				{
					System.out.println(i);
					t=false;
				}
			}
		}
	}
}