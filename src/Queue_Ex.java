import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_Ex {
	public static void main(String[] args) {
//		Queue<Integer> q = new LinkedList<Integer>();
//		for(int i=0; i<5; i++)
//		{
//			q.add(i);
//		}
//		System.out.println(q);
//		int remove = q.remove();
//		System.out.println(q);
//		System.out.println(q.peek());
//		System.out.println(q.size());
		
		
		Queue<String> pq = new PriorityQueue<String>();
		pq.add("Java");
		pq.add("For");
		pq.add("Abs");
		pq.add("Subhrajit");
		System.out.println(pq);
		pq.remove();
		System.out.println(pq);
		pq.poll();
		System.out.println(pq);
		Iterator iterator = pq.iterator();
		while(iterator.hasNext())
		{
			System.out.print(iterator.next()+" ");
		}
		
		
		
	}
}
