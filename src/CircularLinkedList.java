//class Node{
//	Node next;
//	int data;
//	Node(int i)
//	{
//		data=i;
//		next=null;
//	}
//}
//public class CircularLinkedList {
//	public static void main(String[] args) {
//		Node head=null;
//		if(head!=null)
//			head.next=head;
//		head=insertBegin(head, 30);
//		printlist(head);
//		System.out.println();
//		head=insertBegin(head, 20);
//		printlist(head);
//		System.out.println();
//		head=insertBegin(head, 10);	
//		printlist(head);
//		System.out.println();
//		head=insertEnd(head, 40);
//		printlist(head);
//		System.out.println();
//		head=deleteHead(head);
//		printlist(head);
//		System.out.println();
//		head=deleteKthNode(head, 2);
//		printlist(head);
//	}
//
//private static Node deleteKthNode(Node head, int k) {
//		if(head==null)
//			return head;
//		if(k==1)
//			return deleteHead(head);
//		else
//		{
//			Node curr=head;
//			for(int i=0; i<k-2; i++)
//				curr=curr.next;
//			curr.next=curr.next.next;
//			return head;
//		}
//	}
//
//private static Node deleteHead(Node head) {
//		if(head==null)
//			return null;
//		if(head.next==null)
//			return null;
//		else {
//			head.data=head.next.data;
//			head.next=head.next.next;
//			return head;
//		}
//	}
//
////private static Node deleteHead(Node head) {
////		if(head==null)
////			return head;
////		if(head.next==head)
////			return null;
////		else {
////			Node curr=head;
////			while(curr.next!=head)
////				curr=curr.next;
////			curr.next=head.next;
////			return head.next;
////		}
////		
////	}
//
//private static Node insertEnd(Node head, int i) {
//		Node temp=new Node(i);
//		if(head==null)
//		{
//			temp.next=temp;
//			return temp;
//		}
//		else
//		{
//			temp.next=head.next;
//			head.next=temp;
//			int t=temp.data;
//			temp.data=head.data;
//			head.data=t;
//			return temp;
//		}
//	}
//
////private static Node insertEnd(Node head, int i) {
////		Node temp=new Node(i);
////		if(head==null)
////		{
////			temp.next=temp;
////			return temp;
////		}
////		else
////		{
////			Node curr=head;
////			while(curr.next!=head)
////				curr=curr.next;
////			curr.next=temp;
////			temp.next=head;
////			return head;
////		}
////	}
//
//private static Node insertBegin(Node head, int i) {
//	Node temp=new Node(i);
//	if(head==null)
//	{
//		temp.next=temp;
//		return temp;
//	}
//	else
//	{
//		temp.next=head.next;
//		head.next=temp;
//		int t=head.data;
//		head.data=temp.data;
//		temp.data=t;
//		return head;
//	}
//	
//}
//
//private static void printlist(Node head) {
//		if(head==null)
//			return;
//		Node r=head;
//		do {
//			System.out.print(r.data+" ");
//			r=r.next;
//		}while(r!=head);
//		
//	}
//
////	private static void printlist(Node head) {
////		if(head==null)
////			return;
////		System.out.println(head.data+" ");
////		for(Node r=head.next; r!=head; r=r.next)
////			System.out.println(r.data+" ");
////		
////	}
//
////	private static Node insertBegin(Node head, int i) {
////		Node temp=new Node(i);
////		if(head==null)
////			temp.next=temp;
////		else
////		{
////			Node curr=head;
////			while(curr.next!=head)
////				curr=curr.next;
////			curr.next=temp;
////			temp.next=head;
////		}
////		return temp;
////	}
//	
//}
