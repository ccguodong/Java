import java.util.*;
public class Pra4_2
{
	public static void main(String args[])
	{
		float score;
		char grade='0';
		Scanner reader=new Scanner(System.in);
		score=reader.nextFloat();
		int iscore=(int)score/5;
		switch(iscore)
		{
			case 20:
			case 19:
			case 18:
			case 17:
			grade='A';
			break;
			case 16:
			case 15:
			case 14:
			grade='B';
			break;
			case 13:
			case 12:
			grade='C';
			break;
			case 11:
			case 10:
			case 9:
			case 8:
			case 7:
			case 6:
			case 5:
			case 4:
			case 3:
			case 2:
			case 1:
			case 0:
			grade='D';
			break;
			default:
		    System.out.println("您输入的成绩不正确！");
		}
		System.out.println("grade="+grade);

	}
}