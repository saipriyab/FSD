

	import java.util.*;
	public class Longest {
	public static void main(String args[])
	{
		System.out.println("enter");
		Scanner s=new Scanner(System.in);
		String g=s.next();
		ArrayList a1=new ArrayList();
		int l=g.length();
		for(int i=0;i<l;i++)
		{
			for(int j=i+1;j<=l;j++)
			{
				a1.add(g.substring(i,j));
			}
		}
		int max=0,min=0,flag=0,count=0;
		Iterator i2=a1.iterator();
		while(i2.hasNext())
		{
			String g1=(String)i2.next();
			String g2=new StringBuffer(g1).reverse().toString();
		    if(g1.equals(g2))  	
		    {
		    	int l1=g1.length();
		    	count++;
		    	if(l1>max)
		    	{
		    	max=l1;
		    	}
		    	if(count==1&&flag==0)
		    	{
		    		min=l1;
		    		flag=1;
		    	}
		    	if(l1<min)
		    		min=l1;
		    }
		}
		System.out.println(max-min);
		//System.out.println(min);
	}
	}

