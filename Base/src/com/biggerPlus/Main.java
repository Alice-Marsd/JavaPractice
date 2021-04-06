package com.biggerPlus;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main m=new Main();
		System.out.println(m.solve("1258994789086810959258888307221656691275942378416703768", "7007001981958278066472683068554254815482631701142544497"));

	}
	public String solve (String s, String t) {
		if(s==null || t==null) return s==null?t:s;
		int i,j;
		int len=s.length()>t.length()?s.length():t.length();
		char[] result=new char[len+1];
		int x=0,ov=0;
		for(i=s.length()-1,j=t.length()-1;len>=0;--i,--j,--len)
		{
			if(i>=0 && j>=0)
				x=s.charAt(i)-'0'+t.charAt(j);
			else if(i>=0)
				x=s.charAt(i);
			else if(j>=0)
				x=t.charAt(j);
			result[len]=(char) ((char) ((x-'0'+ov)%10)+'0');
			ov=(x-'0'+ov)/10;
		}
		result[0]=(char) (ov+'0');
		String str=String.valueOf(result);
		if(str.startsWith("0"))
			return str.substring(1);
		return str;
//		String str="";
//		boolean begin= false;
//		for(i=0;i<result.length;++i)
//		{
//			if(result[i]!='0')
//				begin=true;
//			if(begin)
//				str=str+result[i];
//		}
		
		
    }

}
