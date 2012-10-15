import java.util.*;
public class Year   //给定一个数，判断是否为闰年
{
	public static void main(String args[])
	{
		int iyear;
		System.out.print("请输入一个年份：");
		Scanner reader=new Scanner(System.in);
		iyear=reader.nextInt();
		boolean a;
		a=(iyear%4==0&iyear%100!=0)||(iyear%400==0);
		if(a==true)
		System.out.println("该年为闰年");
		else
		System.out.println("该年为平年");

	}
}