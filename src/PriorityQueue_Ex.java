import java.util.*;

public class PriorityQueue_Ex {
	public static void main(String[] args) {
//		PriorityQueue q = new PriorityQueue();
//		System.out.println(q.peek());
//		for(int i = 0; i<=10; i++)
//		{
//			q.offer(i);
//		}
//		System.out.println(q);
//		System.out.println(q.poll());
//		System.out.println(q);//Output - [1, 3, 2, 7, 4, 5, 6, 10, 8, 9] {Because some OS won't provide proper support for priority queue}

		PriorityQueue q = new PriorityQueue(15, new MeComparator());
		q.offer("A");
		q.offer("Z");
		q.offer("L");
		q.offer("B");
		System.out.println(q);
	}
}
class MeComparator implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		String s1 = (String)o1;
		String s2 = (String)o2;
		
		return -s1.compareTo(s2);
	}
	
}
