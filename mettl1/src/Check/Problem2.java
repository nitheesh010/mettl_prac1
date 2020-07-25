package Check;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem2
{
	public static String check(int n,String[] k,int[] a)
	{
		ArrayList<Integer> hh=new ArrayList<>();
		for(int i=0;i<n;i++)
		{
		hh.add(a[i]);
		}
		int x;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					x=a[i];
					a[i]=a[j];
					a[j]=x;
				}
			}
		}
		for(int i=0;i<n-2;i++)
        {

            int ap=a[i+1];
            int ap1=a[i+2];
            if(a[i]+1==ap && ap+1==ap1)
            {
                return k[hh.indexOf(ap1)]+":"+k[hh.indexOf(ap)]+":"+k[hh.indexOf(a[i])];
            }
        } 
		
        return "NONE";
	}
	
	
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		String k[]=new String[n];
		for(int i=0;i<n;i++)
		{
			k[i]=sc.next();
		}
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		String fin=check(n,k,a);
		
		System.out.println(fin);
		sc.close();
	}

}
