package com.maxNoRepititionLength;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main m=new Main();
		int[] arr= {2,2,3,4,3}; 
		System.out.println(m.maxLength(arr));
	}
    public int maxLength (int[] arr) 
    {
        ArrayList<Integer> list= new ArrayList<Integer>();
        int i=0;
        int maxsize=0;
        for(i=0;i<arr.length;++i)
        {
        	while(list.contains(arr[i])) 
        	{
        		list.remove(0);
        	}
        	list.add(arr[i]);
        	if(list.size()>maxsize)
        		maxsize=list.size();	
        }
        return maxsize;
    }
	public int maxLength1 (int[] arr) {
		int[] lastPos = new int[100005];
        int len=arr.length;
        int start = 0;
        int res = 0;
        for(int i=0; i < len ;++i)
        {
            int now=arr[i];
            start=Math.max(start,lastPos[now]);
            res=Math.max(res,i-start+1);
            lastPos[now]=i+1;
        }
        return res;
    }
}
