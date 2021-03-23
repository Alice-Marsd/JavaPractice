package money;

import java.util.Scanner;

public class PrintTri {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		PrintSan(scan.nextInt());
		
	}

	private static void  PrintSan(int num) {
		int i,j;
		for(i=1;i <= num;++i)
		{
			for(j=1;j <= num-i;++j)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;++j)
			{
				System.out.print(j);
			}
			for(j=i-1;j>0;--j)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}

	
}
