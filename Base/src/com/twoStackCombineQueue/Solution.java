package com.twoStackCombineQueue;

import java.util.Scanner;
import java.util.Stack;

public class Solution {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    public static void main(String[] args) {
		Solution s=new Solution();
		/**
		 * ["PSH1","PSH2","PSH3","POP","POP","PSH4","POP","PSH5","POP","POP"]
		   ["PSH1","PSH2","POP","POP"]
		 * ****/
		s.push(1);
		s.push(2);
		s.push(3);
		s.pop();
		s.pop();
		s.push(4);
		s.pop();
		s.push(5);
		s.pop();
		s.pop();
	}
    public void push(int node) {
      stack1.push(node);
      System.out.println("放入"+node);
    }
    
    public int pop() {
    	if(!stack2.empty()) {    	
    		System.out.println("取出"+stack2.peek());
    		return stack2.pop();
    	}
    	int node;
    	while(!stack1.empty())
    	{
    		node=stack1.pop();
    		stack2.push(node);
    	}
    	System.out.println("取出"+stack2.peek());
		return stack2.pop();
    }
}
