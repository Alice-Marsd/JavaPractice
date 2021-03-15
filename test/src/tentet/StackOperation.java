package tentet;

import java.util.Queue;
import java.util.Scanner;

public class StackOperation {
	public static Queue<Integer> queue;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int T,Q,x;
		Scanner scan=new Scanner(System.in);	
		T=scan.nextInt();
		
		if(T>0)
		{
			for (int i = 0; i < T; i++) {
			{
				
				Q=scan.nextInt();
				if(Q>0)
					Operation(Q);
			}
			}
		}
	}

	public static void Operation(int q) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String str;
		for (int i = 0; i < q; i++)
		{
			str=scan.nextLine();
			if(str.contains("PUSH"))
			{
				String[] op=str.split(" ");
				Integer x=Integer.valueOf(op[1]);
				for (int j = 0; j < op.length; j++) {
					System.out.println(j+"  "+op[j]);
				}
				System.out.println(x);
				queue.add(x);
				
			}else if(str.equals("TOP"))
			{
				if(queue.size()==0)
					System.out.println("-1");
				else
					queue.iterator();
			}else if(str.equals("POP")){
				if(queue.size()==0)
					System.out.println("-1");
				else
					queue.remove();
			}
			else if(str.equals("SIZE")) {
				System.out.println(queue.size());
			}else if(str.equals("ClEAR"))
			{
				queue.clear();
			}
		}
		
	}
}
