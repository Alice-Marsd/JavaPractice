package com.transfer;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int  result=0;
        while (scan.hasNextLine()) 
        { 
        	result=0;
            String str= scan.nextLine();
            result=transfer(str);
            System.out.println(result);
        }
    }

	private static int transfer(String str) {
		if(str.isEmpty()||str==null||str.length()<2)  return 0;
		int num=0,i=2;
		for(;i<str.length();++i)
		{
			char cc=str.charAt(i);
			switch (cc) 
			{
				case 'A':
					num=num*16+10;
					break;
				case 'B':
					num=num*16+11;
					break;
				case 'C':
					num=num*16+12;
					break;
				case 'D':
					num=num*16+13;
					break;
				case 'E':
					num=num*16+14;
					break;
				case 'F':
					num=num*16+15;
					break;
				default:
					if(cc<='9' && cc>='0')
					num=num*16+(Integer.valueOf(cc)-'0');
					break;
			}
			
		}
		return num;
	}
}
