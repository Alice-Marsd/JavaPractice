package Ancestor;

import java.util.ArrayList;

import addList.ListNode;

public class ComminAncestor {
	   public int lowestCommonAncestor (TreeNode root, int o1, int o2) {
	        // write code her 
	        if(root== null) return -1;
			if(root.val == o1 || root.val == o2) return root.val;
			int left=lowestCommonAncestor(root.left,o1,o2);
			int right=lowestCommonAncestor(root.right,o1,o2);
			if(left==-1) return right;
	        if(right==-1) return left;
			return root.val;
	    }
	   public ArrayList<ArrayList<Integer>> pathSum (TreeNode root, int sum) {	  
			ArrayList<ArrayList<Integer>> results = new ArrayList<ArrayList<Integer>>();		
			if(root == null) return results;
	           
	        ArrayList<Integer>  result=new ArrayList<Integer>();
			pathSumCore(root,0, sum,result,results); 
			 return results;
		    }
	
	
	public void pathSumCore(TreeNode root, int res, int sum, ArrayList<Integer> result,ArrayList<ArrayList<Integer>> results) {
		if(root == null) return ;
		else if(root.left == null && root.right ==null)
		{
			if(res+root.val == sum)
			{
				result.add(root.val);
				results.add(new ArrayList<Integer>(result));
				result.remove(result.size()-1);
			}
		}else {
			result.add(root.val);
			pathSumCore(root.left,res+root.val,sum,result,results);
			pathSumCore(root.right,res+root.val,sum,result,results);
			result.remove(result.size()-1);
		}	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	private static TreeNode createTreeNode(char[] a) {
		TreeNode root = null,p = null,q=null;
		int i;
		for(i=0 ; i<a.length;++i)
		{
			
			if(a[i]<='9' && a[i]>='0')
			{
				p=new TreeNode(a[i]);
				if(root == null) root=q=p;
				else if(q.left == null){
					q.left=p;
				}else if(q.right == null){
					q.right=p;
					q=q.left;
				}
			}else 
			{
				
			}
			
		}
		
		
		return root;
		
	}

}
