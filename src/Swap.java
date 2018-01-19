

	import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
	public class Swap {
		static int count=0;
		static String g="";
		static char a2[];
	public static void main(String args[])
	{
		System.out.println("enter");
		Scanner s=new Scanner(System.in);
		g=s.next();
		String g1=new StringBuffer(g).reverse().toString();
		LinkedHashSet a1=new LinkedHashSet();
		int count=0,flag=0,flag1=0,count1=0;
		a2=g.toCharArray();
		if(g.equals(g1))
	    System.out.println(0);
		else
		{
			if(g.length()%2!=0)
			{
				char a[]=g.toCharArray();
				for(int i=0;i<a.length;i++)
				a1.add(a[i]);
				Iterator i2=a1.iterator();
				while(i2.hasNext())
				{
					count=0;
					char c=(Character)i2.next();
					for(int j=0;j<a.length;j++)
					{
						if(c==a[j])
						count++;
					}
					if(count%2==0)
						flag=1;
					if(count%2!=0)
					{
						count1++;
						flag=1;
					}
					if(count1>1)
						flag=0;
				}
			}
			else
			{
				char a[]=g.toCharArray();
				for(int i=0;i<a.length;i++)
				a1.add(a[i]);
				Iterator i2=a1.iterator();
				while(i2.hasNext())
				{
					count=0;
					char c=(Character)i2.next();
					for(int j=0;j<a.length;j++)
					{
						if(c==a[j])
						count++;
					}
					if(count%2==0)
						flag=1;
					else
						flag=0;
				}
			}
			if(flag==0)
				System.out.println("impossible");
			else
			{
				//int l1=g.length();
			//makePalindrome(g.toCharArray());
			if(makePalindrome(a2)==0)
				makePalindrome(a2);
				System.out.println(count);
				}
				
			}
		}
	static int makePalindrome(char a2[]){
		int i,l1,j;
		 l1=a2.length;
		for( i=0; i <= (l1/2-1); i++ ) {
			j = charLast( a2, a2[i], i+1, l1-i-1 );
			if(j==-1){
				sendToLast(a2,i,l1/2);
				return 0;
			}
			if(i!=(l1-j-1))
				sendToLast(a2,j,l1-i-1);
		}
		return 1;
	}
	static void sendToLast(char a2[], int limit1, int limit2){
		int i;
		char ch;
		ch=a2[limit1];
		for(i=limit1;i<limit2;i++)
			a2[i]=a2[i+1];
		a2[i]=ch;
		count=count+(limit2-limit1);
	}
	static int charLast(char a2[], char ch, int limit1,int limit2){
		int i;
		for(i=limit2;i>=limit1;i--){
			if(a2[i]==ch)
				return i;
		}
		return -1;
	}
	}
