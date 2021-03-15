package TwoSum;

import java.util.Arrays;
import java.util.HashMap;

public class twoSumSolution {
	 public int[] twoSum (int[] numbers, int target) 
	    {
			int[] result = new int[2];
			int i,n=numbers.length;
			HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
			for(i=0;i<n;++i)
			{
				if(map.containsKey(numbers[i]))
				{
					result[0]=map.get(numbers[i])+1;
					result[1]=i+1;
					break;
				}else {
					map.put(target-numbers[i], i);
				}
			}
			
	        return result;
	    }
	 public static void main(String[] args) {
		twoSumSolution s=new twoSumSolution();
		
		int numbers[]= {3,2,4};
		int[] result=s.twoSum(numbers, 6);
		for(int i=0;i < result.length;++i)
			System.out.println(result[i]+" ");
	}

}
