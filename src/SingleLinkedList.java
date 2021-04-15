import java.util.ArrayList;
import java.util.HashSet;

class Node{
        int data;
        Node next;
        Node(int x){
            data=x;
            next=null;
        }
    }
  
public class SingleLinkedList {     
    static Node insertBegin(Node head, int x){
        Node temp=new Node(x);
        temp.next=head;
        return temp;
    }
    
    public static void main(String[] args) 
    { 
        Node head=null;
        Node head1=null;
	    head=insertBegin(head,30);
	    head=insertBegin(head,20);
	    head=insertBegin(head,10);
	    head=insertBegin(head,30);
	    printlist(head);
	    head1=insertBegin(head1,60);
	    head1=insertBegin(head1,50);
	    head1=insertBegin(head1,40);
	    printlist(head1);
	    System.out.println();
	    head=mergeList(head, head1);
	    System.out.println("The Mearge LinkedList is : ");
	    printlist(head);
	    System.out.println();
	    head=insertEnd(head,40);
	    printlist(head);
	    System.out.println();
	    head=deleteHead(head);
	    printlist(head);
	    System.out.println();
	    head=deleteTail(head);
	    printlist(head);
	    System.out.println();
	    //head=insertBegin(head,10);
	    int pos = 3;
	    int data = 50;
	    head=insertNode(head, pos, data);
	    System.out.println();
	    printlist(head);
	    System.out.println();
	    head=insertSorted(head, 35);
	    printlist(head);
	    System.out.println();
	    head=insertSorted(head, 15);
	    printlist(head);
	    System.out.println();
	    printMiddle(head);
	    int x=searchData(head, 30);
	    System.out.println("The Position is : "+x);
	    printNthNodeFromEnd(head, 4);
	   
	    System.out.println("The list after reverse : ");
	    head=reverseList(head);
	    printlist(head);
	    System.out.println();
	    System.out.println("The list after reverse using code-2 is : ");
	    Node curr=head;
	    Node prev=null;
	    head=reverseList(curr, prev);
	    printlist(head);
	    System.out.println();
	    System.out.println("The list after removing the duplicate element : ");
	    head=removeDuplicate(head);
	    printlist(head);
	    System.out.println();
	    System.out.println("The Sorted List is : ");
	    head=sortedList(head);
	    printlist(head);
	    System.out.println();
	    int k=3;
	    head=reverseList(head, k);//reverse a linked list in groups of size K
	    System.out.println("The "+k+" reverse list is : ");
	    printlist(head); 
	    System.out.println();
	    boolean result=isLoop(head);
	    System.out.println(result);
	    System.out.println();
	    
    }

private static Node mergeList(Node head, Node head1) {
	 Node curr=head;
     Node curr1=head1;
     if(head==null||head1==null)
         return head;
     if(head1.next==null) {
     	return head1;
     }
     else{
         while(curr.next!=null)
         {
             curr=curr.next;
         }
         curr.next=curr1;	
     }
		return head;
	}

private static boolean isLoop(Node head) {
		HashSet<Node> s=new HashSet<Node>();
		for(Node curr=head; curr!=null; curr=curr.next)
		{
			if(s.contains(curr))
				return true;
			s.add(curr);
		}
		return false;
	}
// Naive Method to check isLoop
//private static boolean isLoop(Node head) {
//		Node temp=null;
//		Node curr=head;
//		while(curr!=null)
//		{
//			if(curr.next==null)
//				return false;
//			if(curr.next==temp)
//				return true;
//			curr.next=curr.next;
//			curr.next=temp;
//			curr=curr.next;
//		}
//		return false;
//	}

private static Node reverseList(Node head, int k) {
		Node curr=head, prevFirst=null;
		boolean isFirstPass=true;
		while(curr!=null)
		{
			Node first=curr;
			Node prev=null;
			int count=0;
			while(curr!=null&&count<k)
			{
				Node next=curr.next;
				curr.next=prev;
				prev=curr;
				curr=next;
				count++;
			}
			if(isFirstPass)
			{
				head=prev;
				isFirstPass=false;
			}
			else
			{
				prevFirst.next=prev;
			}
			prevFirst=first;
		}
		return head;
	}

//    private static Node reverseList(Node head, int k) {		
//    	Node curr=head,next=null,prev=null;
//        int count=0;
//        while(curr!=null&&count<k){
//            next=curr.next;
//            curr.next=prev;
//            prev=curr;
//            curr=next;
//            count++;
//        }
//        if(next!=null){
//            Node rest_head=reverseList(next,k);
//            head.next=rest_head;
//        }
//        return prev;
//	}

	private static Node sortedList(Node head) {
		Node curr=head, index;
		int temp;
		if(head==null)
			return head;
		else
		{
			while(curr!=null)
			{
				index=curr.next;
				while(index!=null)
				{
					if(curr.data>index.data)
					{
						temp=curr.data;
						curr.data=index.data;
						index.data=temp;
					}
					index=index.next;
				}
				curr=curr.next;
			}
			return head;
		}
		
	}

	private static Node removeDuplicate(Node head) {
		Node curr=head;
		while(curr!=null && curr.next!=null)
		{
			if(curr.data==curr.next.data)
				curr.next=curr.next.next;
			else
				curr=curr.next;
		}
		return head;
	}

//Recursive code-2 for reverse
private static Node reverseList(Node curr, Node prev) {
		if(curr==null) 
			return prev;
		else
		{
			Node next=curr.next;
			curr.next=prev;
			return reverseList(next, curr);
		}
	}

//Recursive code-1 for reverse
    private static Node reverseList(Node head) {
		if(head==null || head.next==null)
			return head;
		else {
			Node restHead=reverseList(head.next);
			Node tail=head.next;
			tail.next=head;
			head.next=null;
			return restHead;
		}
	}

//Normal Code for Reverse of a List
private static Node ReverseList(Node head) {
	Node curr=head;
    Node prev=null;
    while(curr!=null){
        Node next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
    }
    return prev;
	}

//private static Node ReverseList(Node head) {
//		ArrayList<Integer> arr=new ArrayList<Integer>();
//		for(Node curr=head; curr!=null; curr=curr.next)
//			arr.add(curr.data);
//		for(Node curr=head; curr!=null; curr=curr.next)
//		{
//			curr.data=arr.remove(arr.size()-1);
//		}
//		return head;
//}		

private static void printNthNodeFromEnd(Node head, int i) {
		if(head==null)
			return;
		Node first=head;
		for(int j=0; j<i; j++)
		{
			 if(first==null)
				 return;
			 first=first.next;
		}
		Node second=head;
		while(first!=null)
		{
			second=second.next;
			first=first.next;
		}
		System.out.println("The Data in this position is : "+second.data);
	}

//private static void printNthNodeFromEnd(Node head, int i) {
//		if(head==null)
//			return;
//		int count=0;
//		for(Node curr=head; curr!=null; curr=curr.next)
//			count++;
//		if(count<i)
//			return;
//		Node curr=head;
//		for(int j=1; j<count-i+1; j++)
//			curr=curr.next;
//		System.out.println(curr.data);
//	}

private static void printMiddle(Node head) {
		if(head==null)
			return;
		Node slow=head, fast=head;
		while(fast!=null && fast.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
		}
		System.out.println("The Middle Data is : "+slow.data);
		
	}

//private static void printMiddle(Node head) {
//		if(head==null)
//			return;
//		int count=0;
//		Node curr;
//		for(curr=head; curr.next!=null; curr=curr.next)
//			count++;
//		curr=head;
//		for(int i=0; i<count/2; i++)
//			curr=curr.next;
//		System.out.println(curr.data);
//	}

private static int searchData(Node head, int i) {
		if(head==null)
			return -1;
		if(head.data==i)
			return 1;
		else
		{
			int res = searchData(head.next, i);
			if(res==-1)
				return -1;
			else
				return (res+1);
		}
	}

//	private static int searchData(Node head, int i) {
//		int pos=1;
//		Node curr = head;
//		while(curr!=null)
//		{
//			if(curr.data==i)
//				return pos;
//			else {
//				pos++;
//				curr=curr.next;
//			}
//		}
//		return -1;
//	}

	private static Node insertSorted(Node head, int i) {
		Node temp=new Node(i);
		if(head==null) {
			temp.next=temp;
			return temp;
		}
		if(i<head.data)
		{
			temp.next=head;
			return temp;
		}
		else {
			Node curr=head;
			while(curr.next!=null && curr.next.data<i)
				curr=curr.next;
			temp.next=curr.next;
			curr.next=temp;
			return head;
		}
	}

	private static Node insertNode(Node head, int pos, int data) {
		Node temp = new Node(data);
		if(pos==1)
		{
			temp.next=head;
			return temp;
		}
		else
		{
			Node curr=head;
			for(int i =1; i<=pos-2 && curr!=null; i++)
			{
				curr=curr.next;
				if(curr==null)
					return head;
				temp.next=curr.next;
				curr.next=temp;
				
			}
		}
		return head;
	}

	private static Node deleteTail(Node head) {
		if(head==null)
			return null;
		if(head.next==null)
			return null;
		Node curr=head;
		while(curr.next.next!=null)
			curr=curr.next;
		curr.next=null;
		return head;
	}

	private static Node deleteHead(Node head) {
		if(head==null)
			return null;
		else
			return head.next;
	}

	private static Node insertEnd(Node head, int i) {
		Node temp=new Node(i);
		if(head==null)
			return temp;
		Node curr=head;
		while(curr.next!=null)
			curr=curr.next;
		curr.next=temp;
		return head;
	}

	private static void printlist(Node head) {
		if(head==null)
			return ;
		System.out.print(head.data+" ");
		printlist(head.next);
		
	} 
  
//    public static void printlist(Node head){
//        Node curr=head;
//        while(curr!=null){
//        System.out.print(curr.data+" ");
//        curr=curr.next;
//    }
//  }
} 







/*=======================================================================================================================*/







//class Node{
//int data;
//Node next;
//Node(int x)
//{
//	data = x;
//	next=null;
//}
//}
//public class SingleLinkedList {
//	public static void main(String[] args) {
////		Node head = new Node(10);
////		Node temp = new Node(20);
////		Node temp1 = new Node(30);			
////		head.next = temp;
////		temp.next = temp1;
//		
//		Node head = null;
//		head = insertBegin(head, 30);
//		head = insertBegin(head, 20);
//		head = insertBegin(head, 10);
//		
//		printList(head);
//	}
//	private static Node insertBegin(Node head, int i) {
//		Node temp = new Node(i);
//		temp.next=head;
//		return head;
//	}
//
//	private static void printList(Node head) {
//		if(head==null)
//		{
//			return;
//		}
//		else
//		{
//			System.out.println(head.data+" ");
//			printList(head.next);
//		}
//		
//	}
//	
////	public static void printList(Node head)
////	{
////		Node curr = head;
////		while(curr!=null)
////		{
////			System.out.println(curr.data+" ");
////			curr=curr.next;
////		}
////	}
//}