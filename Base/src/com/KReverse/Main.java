package com.KReverse;

import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head=new ListNode();
		ListNode node1=new ListNode();
		ListNode node2=new ListNode();
		ListNode node3=new ListNode();
		ListNode node4=new ListNode();
		ListNode node5=new ListNode();
		ListNode node6=new ListNode();
		head.val=1;
		head.next=node1;
		node1.val=2;
		node1.next=node2;
		node2.val=3;
		node2.next=node3;
		node3.val=4;
		node3.next=node4;
		node4.val=5;
		node4.next=node5;
		node5.val=6;
		node5.next=node6;
		node6.val=7;
		head=reverseKGroup(head,4);
		PrintHead(head);
	}
	private static void PrintHead(ListNode head) {
		if(head==null) return;
		ListNode  p=head;
		while(p!=null)
		{
			System.out.print(p.val+" ");
			p=p.next;	
		}
		System.out.println();
		
	}
	 public static ListNode reverseKGroup(ListNode head, int k) {
	     if (head == null || head.next == null) {
	         return head;
	     }
	     ListNode tail = head;
	     for (int i = 0; i < k; i++) {
	         //剩余数量小于k的话，则不需要反转。
	         if (tail == null) {
	             return head;
	         }
	         tail = tail.next;
	     }
	     // 反转前 k 个元素
	     ListNode newHead = reverse(head, tail);
	     //下一轮的开始的地方就是tail
	     head.next = reverseKGroup(tail, k);

	     return newHead;
	 }

	 /*
	 左闭又开区间
	  */
	 private static ListNode reverse(ListNode head, ListNode tail) {
	     ListNode pre = null;
	     ListNode next = null;
	     while (head != tail) {
	         next = head.next;
	         head.next = pre;
	         pre = head;
	         head = next;
	     }
	     return pre;

	 }



}
