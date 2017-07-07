package external;

import java.io.Console;
import java.util.Arrays;
import java.util.Scanner;

public class Absolutesort1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int[] ar = {-2,3,-1,4};
		int n=4,first=0,last = n-1;
		int[] output = new int[n];
		String sout = "";
		Arrays.sort(ar);
		while(first<=last)
		{
			n--;
			if(Math.abs(ar[first])>Math.abs(last))
			{
				output[n]=ar[first];
				first++;
			}else
			{
				output[n]=ar[last];
				last--;
			}
			sout  = output[n]+" "+sout;
		}
		System.out.print(sout);
	}
	public static int negcount(int[] ar)
	{
		int ncount=0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]<0)
			{
				ncount++;
			}
		}
		return ncount;
	}

	public static int poscount(int[] ar)
	{
		int ncount=0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]>0)
			{
				ncount++;
			}
		}
		return ncount;
	}
}
