package com.lastWordNum;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		String str=null;
		int count=0;
		while(scan.hasNextLine())
		{
			str=scan.nextLine();
			count=CountNumber(str);
			System.out.println(count);
		}
		
	}

//	private static int CountNumber(String str) {
//		// TODO Auto-generated method stub
//		int count=0;
//		String[] strs=str.split(" ");
//		count=strs[strs.length-1].length();
//		return count;
//	}
	private static int CountNumber(String str) {
		// TODO Auto-generated method stub
		int count=0;
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)==' ')
			{
				count=0;
			}
			else
			{
				count++;
			}
		}
		return count;
	}
}
