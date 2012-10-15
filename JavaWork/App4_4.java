import java.io.*;
public class App4_4
{
	public static void main(String args[]) throws IOException
	{
		int day,mounth;	
		BufferedReader buf;
		String str;
		buf=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("«Î ‰»Î‘¬∑›");
		str=buf.readLine();
		mounth=Integer.parseInt(str);
		switch(mounth)
		{
			case 2:
			day=28;
			break;
			case 4:
			case 6:
			case 9:
			case 11:
			day=30;
			break;
			default:
			day=31;
			break;
		}
		System.out.println("day="+day);
	}
}