package Check;

import java.util.*;

public class Problem1
{
	static int[] b=new int[10];
	static int k=0;
	
	public static int cal(int h)
	{
		
		b[k++]=Math.abs(h%10);
		return h/10;
	}

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int input2=sc.nextInt();
		int[] a=new int[input2];
		int check;
		int flag=0;
		for(int i=0;i<input2;i++)
		{
			a[i]=sc.nextInt();
			if(a[i]<0)
				flag=1;
		}
		
		if(flag==1)
		{
			 check=cal(a[0]);
					while(check>=0)
					{
						check=cal(a[check]);
					}
			int sum=b[0];
			for(int i=1;i<k;i++)
			{
				if(i%2==1)
					sum=sum+b[i];
				else
					sum=sum-b[i];
				
			}
			System.out.println(sum);
		
		}
		else
		{
			int min=9999;
			for(int i=0;i<input2;i++)
			{
				if(a[i]<min)
					min=a[i];
			}
			System.out.println(min);
		}
	sc.close();
	}

}
