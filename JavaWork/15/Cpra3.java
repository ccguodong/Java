/*接收用户输入的整型数，确定它能否被2，3，5，6，10，15，30整除*/
import java.util.*;
public class Cpra3
{
	public static void main(String args[])
	{
		int a;
		Scanner reader=new Scanner(System.in);
		System.out.println("请输入一个整型数");
		a=reader.nextInt();
		if(a%30==0)
		System.out.println(a+"能被2，3，5，6，10，15，30整除");
		else if(a%15==0)
		System.out.println(a+"能被3,5,15整除");
		else if(a%10==0)
		System.out.println(a+"能被2,5,10整除");
		else if(a%6==0)
		System.out.println(a+"能被2,3,6整除");
		else if(a%5==0)
		System.out.println(a+"能被5整除");
		else if(a%3==0)
		System.out.println(a+"能被3整除");
		else if(a%2==0)
		System.out.println(a+"能被2整除");
		else
		System.out.println(a+"不能被2，3，5，6，10，15，30整除");
	}
}