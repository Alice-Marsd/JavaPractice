package com.maxSubString;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str;
		while(scan.hasNextLine())
		{
			str = scan.nextLine();
			System.out.println(maxSubString(str));
		}
	}

	private static int  maxSubString(String str) {
		// TODO Auto-generated method stub
		if(str.isEmpty() || str.equals("")) return 0;
		int []num=new int[26];
		int count=0,max=0,j=0;
		for (int i = 0; i < num.length; i++) {
			num[i]=0;
		}
		for (int i = 0; i < str.length(); i++) {
			char temp=str.charAt(i);
			if(temp <= 'z' && temp >='a' && num[temp-'a']<2)
			{
				num[temp-'a']++;
				count++;
			}else
			{
				if(count > max)
					max=count;
				if(str.charAt(j)!=temp)
					count=0;
				else
					j++;
			}
			
		}
		if(count > max)
			max=count;
		return max;
	}

}
