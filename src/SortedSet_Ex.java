import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSet_Ex {
	public static void main(String[] args) {
		SortedSet<String> st = new TreeSet<String>();
		TreeSet<String> st1 = new TreeSet<String>();
		st.add("Subhrajit");
		st.add("Jena");
		st.add("Indian");
		System.out.println(st);
		st.add("Indian");
		System.out.println(st);
		st.remove("Indian");
		System.out.println(st);
		System.out.println("Iterating Over Set : ");
		Iterator<String> i=st.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		String check = "Jena";
		
		System.out.println(st.contains(check));
		System.out.println("First value :"+st.first());
		System.out.println("Last value : "+st.last());
		st.add("India");
		System.out.println();
		Iterator<String> i1 = st.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		System.out.println();
		st1=(TreeSet<String>) st;
		Iterator<String> i2 = st1.descendingIterator();
		while(i2.hasNext())
		{
			System.out.println(i2.next());
		}
		
		System.out.println();
		
	}
}
