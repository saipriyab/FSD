
import java.text.DecimalFormat;
import java.util.*;
public class Height {
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	System.out.println("enter");
	int n=s.nextInt();
	int sum=0;
	String k1="";
	int a[]=new int[n];
	for(int i=0;i<n;i++)
    a[i]=s.nextInt();
	int k=s.nextInt();
	Arrays.sort(a);
	double size=(n-(k*2));
	for(int j=k;j<n-k;j++)
	sum=sum+a[j];
	double h=sum/size;
	k1=k1+h;
	double d=Double.parseDouble(new DecimalFormat("##.##").format(h));
	System.out.println(d);
}
}

