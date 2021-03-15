package longestCommonPrefix;

import java.util.Iterator;
import java.util.Stack;

public class kuohao {
	 public boolean isValid(String s) {
		 if(s.isEmpty()) return true;
		 
		 Stack<Character> stack=new Stack<Character>();
		 char cc;
		 boolean march=false;
		 try {
			for(char c:s.toCharArray())
			 {
				if(c=='(' || c=='[' || c=='{') 
				{
					stack.push(c);
				}else if(c==')' || c==']' ||c=='}')
				{
					cc=stack.pop();
					if(cc=='(' && c==')')
						march=true;
					else if(cc=='[' && c==']')
						march=true;
					else if(cc=='{' && c=='}')
						march=true;
					else
					{
						march=false;
						break;
					}
				}
			 }
		} catch (Exception e) {
			// TODO Auto-generated catch block
			march=false;
		}
		 if(!stack.empty())march=false;
		return march;
	    } 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
