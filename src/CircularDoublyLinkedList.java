//class Node{
//	int data;
//	Node next;
//	Node prev;
//	Node(int i)
//	{
//		data=i;
//		next=prev=null;
//	}
//}
//public class CircularDoublyLinkedList {
//	public static void main(String[] args) {
//		Node head=new Node(30);
//		if(head!=null)
//		{
//			head.next=head;
//			head.prev=head;
//		}
//		head=insertBegin(head, 10);
//		head=insertBegin(head, 20);
//		printlist(head);
//		System.out.println();
//		head=insertEnd(head, 40);
//		head=insertEnd(head, 50);
//		printlist(head);
//	}
//
//	private static Node insertEnd(Node head, int i) {
//		Node temp=new Node(i);
//		if(head==null)
//		{
//			temp.next=temp;
//			temp.prev=temp;
//			return temp;
//		}
//		else {
//			temp.prev=head.prev;
//			temp.next=head;
//			head.prev.next=temp;
//			head.prev=temp;			
//			return head;
//		}
//	}
//
//	private static void printlist(Node head) {
//		if(head==null)
//			return;
//		System.out.println(head.data+" ");
//		for(Node r=head.next; r!=head; r=r.next)
//			System.out.println(r.data+" ");
//		
//	}
//
//	private static Node insertBegin(Node head, int i) {
//		Node temp=new Node(i);
//		if(head==null) {
//			temp.next=temp;
//			temp.prev=temp;
//			return temp;
//		}
//		else
//		{
//			temp.prev=head.prev;
//			temp.next=head;
//			head.prev.next=temp;
//			head.prev=temp;
//			return temp;
//		}
//	}
//}
