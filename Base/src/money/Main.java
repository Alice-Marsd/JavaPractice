package money;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		ArrayList<Integer> money = null;
		while(scan.hasNextInt())
		{
			money.add(scan.nextInt());
		}
		System.out.println(getMoney(money));

	}

	private static int getMoney(ArrayList<Integer> money) {
		// TODO Auto-generated method stub
		boolean[] visit=new boolean[money.size()];
		int max=0,count=0,flag=0;
		for (int i = 0; i < money.size(); i=i+2) 
		{
			count=count+money.get(i);
		}
		if(count>max)
			max=count;
		return max;
	}

}
