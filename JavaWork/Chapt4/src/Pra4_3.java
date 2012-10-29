//100以内既能被3整除又能被7整除的数
public class Pra4_3
{
	public static void main(String args[])
	{
		System.out.print("100以内既能被3整除又能被7整除的数为：");
		for(int i=1;i<=100;i++)
		{
			if(i%3==0&&i%7==0)
				System.out.print(i+" ");
		}
	}
}