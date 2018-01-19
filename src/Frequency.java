
import java.util.*;
public class Frequency  {
public static void main(String args[])
{
	LinkedHashSet a1=new LinkedHashSet();
	Scanner s=new Scanner(System.in);
	System.out.println("enter");
	int o=s.nextInt();
	int count=0,max=0,p=0,max1=0;
	String k="";
	String input1[]=new String[o];
	for(int j=0;j<o;j++)
		input1[j]=s.next();
	int c[]=new int[o];
	for(int i=0;i<o;i++)
	{
		String l=input1[i];
		char a[]=l.toCharArray();
		count=0;max=0;
		for(int j=0;j<a.length;j++) {
			a1.add(a[j]);
		}
		Iterator i2=a1.iterator();
		while(i2.hasNext())
		{
			char g=(Character)i2.next();
             count=0;
			for(int d=0;d<a.length;d++)
			{
				if(a[d]==g)
				count++;
			}
			if(count>max)
			max=count;
		}
		if(max>max1)
		{
		 max1=max;
		 k=input1[i];
		}
		
	}
		System.out.println(k);
}
}


