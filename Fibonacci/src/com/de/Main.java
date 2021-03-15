package com.de;

import java.util.Scanner;
//60
public class Main {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		n=Integer.valueOf(sc.nextLine());
		int t = 0;
		int f1=1,f2=1;
		if(n==1)
		{
			t=1;
	
		}else if(n==2) {
			t=1;
		}else
		{
			for (int k = 0; k < n-2; k++) 
			{
				t=f1%10007+f2%10007;
				f1=f2;
				f2=t;
			}
	
		}
		System.out.println(t);	
	}
}
