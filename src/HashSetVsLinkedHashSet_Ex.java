import java.util.*;

public class HashSetVsLinkedHashSet_Ex {
	public static void main(String[] args) {
//		HashSet h = new HashSet();
//		h.add("A");
//		h.add("B");
//		h.add("C");
//		h.add("D");
//		h.add(10);
//		h.add(null);
//		System.out.println(h.add("C"));
//		System.out.println(h.add("c"));
//		System.out.println(h);
		
		
		LinkedHashSet h = new LinkedHashSet();
		h.add("A");
		h.add("B");
		h.add("C");
		h.add("D");
		h.add(10);
		h.add(null);
		System.out.println(h.add("C"));
		System.out.println(h.add("c"));
		System.out.println(h);
	}
}
