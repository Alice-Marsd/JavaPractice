package com.df;

import java.util.Scanner;
//100
public class Main {
	public static void main(String[] args)
	{
		int f1=1;
		int f2=1;
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		for(int i=3;i<=n;i++)
		{
			int t=f2;
			f2=(f1+f2)%10007;
			f1=t;
		}
		System.out.println(f2);
		scan.close();
	}
}
