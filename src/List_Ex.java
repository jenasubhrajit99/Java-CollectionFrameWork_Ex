
import java.util.*;

public class List_Ex {
	public static void main(String[] args) {
//		List<Integer> list=new ArrayList<Integer>();
//		list.add(0, 1);
//		list.add(1, 2);
//		System.out.println(list);
//		
//		List<Integer> list1 = new ArrayList<Integer>();
//		list1.add(22);
//		list1.add(44);
//		list1.add(55);
//		list1.add(99);
//		System.out.println(list1);
//		
//		list1.addAll(3, list1);
//		System.out.println(list1);
//		list1.remove(3);
//		System.out.println(list1);
//		System.out.println(list1.get(5));
//		list1.set(0, 5);
//		System.out.println(list1);
//		
//		System.out.println();
//		System.out.println();
//		
//		List<String> list11 = new ArrayList<String>();
//		list11.add("Jeet");
//		list11.add("Jannu");
//		list11.add("Love");
//		System.out.println(list11);
//		for(int i=0; i<list11.size(); i++)
//		{
//			System.out.println(list11.get(i)+" ");
//		}
//		System.out.println();
//		for(String s : list11)
//		{
//			System.out.println(s);
//		}
		
		
		int n=5;
		List<Integer> list = new ArrayList<Integer>(n);
		for(int i=1; i<=n; i++)
		{
			list.add(i);
		}
		System.out.println(list);
		list.remove(3);
		System.out.println(list);
		for(int i=0; i<list.size(); i++)
		{
			System.out.print(list.get(i)+" ");
		}
		
		
		
	}
}
