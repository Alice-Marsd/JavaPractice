package test;

import java.util.Scanner;
import java.util.Stack;

public class FirstProgram {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String origin,result;
		int count=0;
		Scanner scan=new Scanner(System.in);
//		origin=scan.nextLine();
//		result=scan.nextLine();
		origin="ATTTAA";
		result="TTAATT";
		System.out.println(compare(origin,result));
	}

	private static <E> int compare(String origin, String result) {
		if(origin==null||result==null)
		return 0;
		int i=0;
		Stack<Integer> temp = null;
		int count=0;
		for(i=0;i<origin.length();++i)
		{
				if(origin.charAt(i)!=result.charAt(i))
				{
					if(origin.charAt(temp.size())!=origin.charAt(i))
					{	
						temp.pop();
						count++;
					}else{
						temp.push(i);
					}	
				}
			}
			return count;
	}
}
