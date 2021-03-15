package com.dd;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n=0;
		n=IntSet();
		Fibonacci(1,1,n);
		

	}

	public static void Fibonacci(int i, int j, int n) {
		int sum=0;
		for (int k = 0; k < n-2; k++) 
		{
			sum=i+j;
			i=j;
			j=sum;
			
		}
		System.out.println("第"+n+"个Fibonacci数为"+sum);
		System.out.println(sum%10007);
		
	}

	public static int IntSet()  {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入斐波那契数的序号：");
		n=Integer.valueOf(sc.nextLine());
		return n;
	}

}
