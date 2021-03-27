package com.recreateBITree;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []pre= {1,2,3,4,5,6,7}; //¸ù×óÓÒ
		int []in= {3,2,4,1,6,5,7};  //×ó¸ùÓÒ
		Main m= new Main();
		TreeNode root=m.reConstructBinaryTree(pre,in);
		m.PrintLink(root);
	}
	 private void PrintLink(TreeNode root) {
		TreeNode p=null;
		Queue<TreeNode> queue = new LinkedList<TreeNode>() ;
		queue.offer(root);
		while(queue.size()>0)
		{
			p=queue.poll();
			System.out.print(p.val+" ");
			if(p.left!=null)
				queue.offer(p.left);
			if(p.right!=null)
				queue.offer(p.right);
		}
		
	}
	 public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
         TreeNode root=reConstructBinaryTree(pre,0,pre.length-1,in,0,in.length-1);
        return root;
    }
    private TreeNode reConstructBinaryTree(int [] pre,int startPre,int endPre,int [] in,int startIn,int endIn) {
          
        if(startPre>endPre||startIn>endIn)
            return null;
        TreeNode root=new TreeNode(pre[startPre]);
          
        for(int i=startIn;i<=endIn;i++)
            if(in[i]==pre[startPre]){
                root.left=reConstructBinaryTree(pre,startPre+1,startPre+i-startIn,in,startIn,i-1);
                root.right=reConstructBinaryTree(pre,i-startIn+startPre+1,endPre,in,i+1,endIn);
            }
                  
        return root;
    }
}
