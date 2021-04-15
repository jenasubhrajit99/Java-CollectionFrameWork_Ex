import java.util.*;

public class ConcurrentCollectionException_Ex extends Thread {
	static ArrayList al = new ArrayList();
	public void run()
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {}
		System.out.println("Child Thread Updating List");
		al.add("D");
	}
	public static void main(String[] args) throws InterruptedException {
		al.add("A");
		al.add("B");
		al.add("C");
		ConcurrentCollectionException_Ex cce = new ConcurrentCollectionException_Ex();
		cce.start();
		java.util.Iterator itr = al.iterator();
		System.out.println("Main Thread Iterating List....");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			Thread.sleep(3000);
		}
		System.out.println(al);
			
		
	}
}
