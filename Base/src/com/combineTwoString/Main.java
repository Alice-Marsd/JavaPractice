package com.combineTwoString;

public class Main {

	public static void main(String[] args) {
		 ListNode l1=new ListNode(1);
		 ListNode l2=new ListNode(2);
		 PrintLink(l1);
		 PrintLink(l2);
		 l1=mergeTwoLists(l1,l2);
		 PrintLink(l1);
	}
	private static void PrintLink(ListNode l1) {
		if(l1== null) return ;
		while(l1!=null)
		{
			System.out.print(l1.val+" ");
			l1=l1.next;
		}
		System.out.println();
	}
	public static ListNode mergeTwoLists (ListNode l1, ListNode l2) {
        // write code here
		if(l1==null || l2==null) return l1==null?l2:l1;
		ListNode head = null,p=null,q=null;
		
		while( l1!=null && l2!=null )
		{
			if(l1.val < l2.val)
			{
				p=l1;
				l1=l1.next;
			}
			else 
			{
				p=l2;
				l2=l2.next;
			}
			if(head == null) head=q=p;
			else {
				q.next=p;
				q=p;
			}
		}
		if(l1!=null)
			q.next=l1;
		else if(l2!=null)
			q.next=l2;
		return head;
    }
}
