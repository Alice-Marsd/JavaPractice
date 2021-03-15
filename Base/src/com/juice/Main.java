package com.juice;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int cnt=0;
		while(n!=0)
		{
			cnt=MaxJuice(n);
			System.out.println(cnt);
			n=scan.nextInt();
		}

	}

	private static int MaxJuice(int num) {
		// TODO Auto-generated method stub
		int cnt = 0;
		while(num!=1)
		{
			cnt += num/3;
			num=num%3+num/3;
			if(num==2)
			{
				cnt++;
				break;
			}
		}
		return cnt;
	}

}
