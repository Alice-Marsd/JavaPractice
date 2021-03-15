package addList;

import java.util.Stack;

public class addList {

	public ListNode addInList (ListNode head1, ListNode head2) {
	       if(head1==null || head2 ==null) return head1==null?head2:head1;
	       Stack<Integer>stack1 = null,stack2 = null;
	       stack1 =new Stack<Integer>();
	       stack2 =new Stack<Integer>();
	       ListNode head = null,p = null,t = null;

	       while(head1!=null)
	       {
	    	   stack1.push(head1.val);
	    	   head1=head1.next;
	       }
	       while(head2!=null)
	       {
	    	   stack2.push(head2.val);
	    	   head2=head2.next;
	       }

	       int val=0,c=0;
	       while(!stack1.empty() || !stack2.empty())
	       {
	    	   if(!stack1.empty() && !stack2.empty())
	    		   val=stack1.pop()+stack2.pop()+c;
	    	   else if(stack1.empty())
	    		   val=stack2.pop()+c;
	    	   else if(stack2.empty())
	    		   val=stack1.pop()+c;	    	   
	    	   c= val / 10;
	    	   val=val%10;
	           p=new ListNode(val);
	    	   p.next =t;
	    	   t=p;              
	       }
	       if(c!=0) {
	           p=new ListNode(c);
	           p.next=t;
	       }
	        head=p;
	        return head;
	    }
	public static void main(String[] args) {
		addList s = new addList();
		ListNode head1 = null, head2 = null;
		int[] a = {9,3,7};	
		int[] b = {6,3};
		head1=createListNode(a);
		s.printLink(head1);

		head2=createListNode(b);
		s.printLink(head2);

		head1=s.addInList(head1, head2);
		s.printLink(head1);
	}
	private void printLink(ListNode head) {
		// TODO Auto-generated method stub
		while(head!= null)
		{
			System.out.print(head.val+" ");
			head=head.next;	
		}
		System.out.println();
	}
	private static ListNode createListNode(int[] a) {
		ListNode head = null,p = null,q = null ;
		int i;
		for(i = 0; i < a.length ;++i)
		{
			p= new ListNode(a[i]);
			if(head == null) head = q = p;
			else
			{
				q.next=p;	
				q=p;
			}
		}
		return head;
		
	}

}
