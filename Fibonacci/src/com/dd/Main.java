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
		System.out.println("��"+n+"��Fibonacci��Ϊ"+sum);
		System.out.println(sum%10007);
		
	}

	public static int IntSet()  {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("������쳲�����������ţ�");
		n=Integer.valueOf(sc.nextLine());
		return n;
	}

}
