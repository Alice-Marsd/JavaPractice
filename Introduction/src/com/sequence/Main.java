package com.sequence;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		long n=scan.nextInt();
		long sum=0;
		long j=n;
		for (long i = 1; i <=j ; i++) 
		{
			sum+=i+j;
			j--;
		}
		System.out.println(sum);
		scan.close();
	}
}