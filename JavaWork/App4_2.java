import java.util.*;
public class App4_2
{
	public static void main(String args[])
	{
		float score;
		char grade;
		Scanner reader=new Scanner(System.in);
		System.out.print("请输入您的分数：");
		score=reader.nextFloat();
		if(score>=90&&score<=100)
		{
			grade='A';
		}
		else if(score>=80)
		{
			grade='B';
		}
		else if(score>=70)
		{
			grade='C';
		}
		else if(score>=60)
		{
			grade='D';
		}
		else if(score>=0&&score<60)
		{
			grade='E';
		}
		else
		System.out.println("您输入的分数无效！");
		System.out.println("Grade="+grade);
	}
}