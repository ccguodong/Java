import java.util.*;
public class Pra4_1
{
	public static void main(String args[])
	{
		float score;
		int i=0;
		Scanner reader=new Scanner(System.in);
		score=reader.nextFloat();
		if(score>=90&&score<=100)
		{
			i=1;
		}
		else if(score>=80)
		{
			i=2;
		}
		else if(score>=70)
		{
			i=3;
		}
		else if(score>=60)
		{
			i=4;
		}
		else if(score>=0&&score<60)
		{
			i=5;
		}
		else
		{
			i=0;
		}
		switch(i)
		{
			case 1:
			System.out.println("您的成绩为优");
			break;
			case 2:
			System.out.println("您的成绩为良");
			break;
			case 3:
			System.out.println("您的成绩为中");
			break;
            case 4:
			System.out.println("您的成绩为及格");
			break;
			case 5:
			System.out.println("您的成绩为不及格");
			break;
			default:
			System.out.println("您输入的成绩不正确！");
		}
	}
}