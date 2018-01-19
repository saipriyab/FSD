

	import java.util.Scanner;
	public class Reverse {
	public static void main(String args[])
	{
		System.out.println("enter");
		Scanner s=new Scanner(System.in);
		String g=s.next();
		int input1=s.nextInt();
		int input2=s.nextInt();
		String str1="";
		String str5=g;
		int count=0;
		while(!g.equals(str1))
		{
			String str2=str5.substring(str5.length()-input1,str5.length());
			str1=str2.concat(str5.substring(0,str5.length()-input1));
			count++;
			if(!g.equals(str1))
			{
				str5=str1;
				String str3=str5.substring(str5.length()-input2,str5.length());
				str1=str3.concat(str5.substring(0,str5.length()-input2));
				count++;
			}
			str5=str1;
		}
		System.out.println(count);
	}
	}


