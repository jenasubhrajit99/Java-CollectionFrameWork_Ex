import java.util.*;
public class Linked_List 
{
	public static void main(String[] args) 
	{
		LinkedList<String> obj = new LinkedList<String>(); 
		obj.add("S");
		obj.add("u");
		obj.add("b");
		obj.add("h");
		obj.add("r");
		obj.add("a");
		obj.add("j");
		obj.add("i");
		obj.add("t");
		
		System.out.println("The LinkedList is......." +obj);
		
		obj.remove();
		obj.removeFirst();
		obj.remove(4);
		obj.removeFirst();
		System.out.println("The LinkedList is.........." +obj);
		
		obj.add(3, "j");
		System.out.println("The LInkedList is......." +obj);
		
		boolean status = obj.contains("j");
		if(status)
			System.out.println("The LinkedList Contains j ");
		else
			System.out.println("The LinkedList not Contains j ");
		int size = obj.size();
		System.out.println("The size of the LinkedList is " +size);
		
		Object element = obj.get(5);
		System.out.println("The getting element is "+element);
		obj.set(2, "z");
		System.out.println("The LinkedList after set method is " +obj);
		
		LinkedList list = new LinkedList(obj);
		
		System.out.println("The New List is  :"+list);
		
		String s = list.toString();
		System.out.println(s);
		
		
		
	}
}
