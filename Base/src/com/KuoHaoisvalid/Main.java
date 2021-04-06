package com.KuoHaoisvalid;

import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main m=new Main();	
		System.out.println(m.isValid("[])"));
	}
	public boolean isValid (String s) {
	// write code here
	     boolean valid=true;
	     int i;
	     Stack<Character> stack=new  Stack<Character>();
	     for(i=0;i<s.length();++i)
	     {
	    	 char cc=s.charAt(i);
	    	 if(cc=='(' || cc=='[' || cc=='{')
	    	 {
	    		 stack.push(s.charAt(i));
	    	 }else if(stack.empty()) 
	    	 {
	    		 valid=false;
	    	 }else if(cc==')'){	 
	    		 char dd=stack.pop();
	    		 if(dd!='(')
	    		 {
	    			 valid = false;
	    			 break;
	    		 } 
	    	 }else if(cc==']'){	 
	    		 char dd=stack.pop();
	    		 if(dd!='[')
	    		 {
	    			 valid = false;
	    			 break;
	    		 } 
	    	 }else if(cc=='}'){	 
	    		 char dd=stack.pop();
	    		 if(dd!='{')
	    		 {
	    			 valid = false;
	    			 break;
	    		 } 
	    	 }
	     }
	     if(!stack.empty()) valid=false;
	     return valid;
	}

}
