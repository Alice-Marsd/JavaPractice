package GetLeastNumber;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Solution{
	public static ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> output = null;
        int i,j;
        for(i=0;i<input.length;)
        {
            if(output.size()<k)
            {
                output.add(input[i]);
                for(j=output.size()-1;j>0;j--)
                {
                    if(output.get(j-1) > output.get(j))
                    {
                    	int temp=output.get(j-1);
                    	output.set(j-1, j);
                    	output.set(j, temp);
                    }
                }
                ++i;
            }else if(input[i] < output.get(k-1))
            {
                output.remove(k-1);
            }else
            {
                ++i;
            }
        }
        return output;
    }
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a[] = null;
		int k,i,n;
		n=s.nextInt();
		for(i=0;i<n;++i)
			a[i]=s.nextInt();
		k=s.nextInt();
		ArrayList<Integer> output=GetLeastNumbers_Solution(a,k);
		Iterator iterator = output.iterator(); 
		while(iterator.hasNext()) 
		{
			System.out.println(iterator.next());
			
		}
			
	}
}
