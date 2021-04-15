//class Node{
//	int data;
//	Node next;
//	Node prev;
//	Node(int d)
//	{
//		data=d;
//		next=prev=null;
//	}
//	
//}
//public class DoublyLinkedList {
//	public static void main(String[] args) {
//		Node head=null;
//		head=insertBegin(head, 20);
//		head=insertBegin(head, 30);
//		head=insertEnd(head, 10);
//		System.out.println("The List is : ");
//		printlist(head);
//		head=reverseDll(head);
//		System.out.println("After reversing the list");
//		System.out.println();
//		printlist(head);
//		head=delHead(head);
//		System.out.println("After deleting the head Node");
//		printlist(head);
//		System.out.println();
//		head=deleteLastNode(head);
//		System.out.println("After deleting the Last Node");
//		printlist(head);
//		
//		
//	}
//
//	private static Node deleteLastNode(Node head) {
//		if(head==null)
//			return null;
//		if(head.next==null)
//			return null;
//		else
//		{
//			Node curr=head;
//			while(curr.next!=null)
//			{
//				curr=curr.next;
//			}
//			curr.prev.next=null;
//			return head;
//		}
//	}
//
//	private static Node delHead(Node head) {
//		if(head==null)
//			return null;
//		if(head.next==null)
//			return null;
//		else
//		{
//			head=head.next;
//			head.prev=null;
//			return head;
//		}
//	}
//
//	private static Node reverseDll(Node head) {
//		if(head==null || head.next==null)
//			return head;
//		Node prev=null;
//		Node curr=head;
//		while(curr!=null)
//		{
//			prev=curr.prev;
//			curr.prev=curr.next;
//			curr.next=prev;
//			curr=curr.prev;
//		}
//		return prev.prev;
//	}
//
//	private static Node insertEnd(Node head, int i) {
//		Node temp=new Node(i);
//		if(head==null)
//			return temp;
//		else {
//			Node curr=head;
//			while(curr.next!=null)
//				curr=curr.next;
//			curr.next=temp;
//			temp.prev=curr;
//		}
//		return head;
//	}
//
//	private static void printlist(Node head) {
//		Node curr=head;
//		while(curr!=null) {
//			System.out.println(curr.data+" ");
//			curr=curr.next;
//		}
//		
//	}
//
//	private static Node insertBegin(Node head, int i) {
//		Node temp=new Node(i);
//		temp.next=head;
//		if(head!=null)
//			head.prev=temp;
//		return temp;
//	}
//}
