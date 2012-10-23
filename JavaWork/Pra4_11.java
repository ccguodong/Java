import java.util.*;
public class Pra4_11
{
	public static void main(String[] args)
	{
		System.out.print("ÇëÊäÈëĞĞÊı:");
		Scanner reader=new Scanner(System.in);
		int num;
		num=reader.nextInt();
		int []list;
		list=new int[num+2];
		list[1]=1;
		int []lateral;
		lateral=new int[num+1];	
		for(int i=1;i<=num;i++)
		{
			lateral[i]=list[i];
			System.out.print(list[i]+" ");
			for(int j=i;j<num;j++)
			{
				lateral[j+1]=lateral[j]+j+1;
				System.out.print(lateral[j+1]+" ");
			}
			System.out.println();
			list[i+1]=list[i]+i;
		}
	}
}