package com.reserveString;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main m=new Main();
		System.out.println(m.solve("abcd"));
	}
	public String solve (String str) {
        if(str==null || str.equals("")) return "";
        char[] aa=str.toCharArray();
        for(int i=0,j=aa.length-1;i<j;++i,--j)
        {
        	char temp= aa[i];
        	aa[i]=aa[j];
        	aa[j]=temp;
        	
        }
        
        return String.valueOf(aa);
    }
}
