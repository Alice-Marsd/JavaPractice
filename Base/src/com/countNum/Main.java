package com.countNum;

import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str=null;
		String c=null;
		int cnt=0;
		while(scan.hasNextLine())
		{
			str=scan.nextLine();
			
			c=scan.nextLine();
			cnt=countNum(str,c);
			System.out.println(cnt);
			
		}
	}

	private static int countNum(String str, String aa) {
		int i;
		int[] alph=new int[26];
		for(i=0;i<str.length();++i)
		{
			int cc=str.charAt(i);
			if(cc<='z' && cc>='a')
				alph[cc-'a']++;
			else if(cc<='Z' && cc>='A')
				alph[cc-'A']++;
		}
		int c=aa.charAt(0);
		if(c<='z' && c>='a')
			return alph[c-'a'];
		else 
			return alph[c-'A'];
		
	}
}
