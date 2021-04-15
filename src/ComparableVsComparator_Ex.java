import java.util.Comparator;
import java.util.TreeSet;

public class ComparableVsComparator_Ex {
	public static void main(String[] args) {
		TreeSet t = new TreeSet(new myComparator());
		
//		t.add(10);
//		t.add(0);
//		t.add(15);
//		t.add(5);
//		t.add(20);
//		t.add(20);
		
		t.add("K");
		t.add("Z");
		t.add("A");
		t.add("A");
		t.add("ABC");
		t.add("AA");
		t.add("BB");
		t.add("ABCD");
		t.add("C");
		
		t.add(new StringBuffer("A"));
		t.add(new StringBuffer("Z"));
		t.add(new StringBuffer("HIJ"));
		t.add(new StringBuffer("ABCD"));
		t.add(new StringBuffer("F"));
		t.add(new StringBuffer("BA"));
		
		System.out.println(t);
	}
}
class myComparator implements Comparator
{

	
	public int compare(Object o1, Object o2) {
		String s1 = o1.toString();
		String s2 = o2.toString();
		int l1 = s1.length();
		int l2 = s2.length();
		if(l1<l2)
		{
			return -1;
		}
		else if(l1>l2)
		{
			return 1;
		}
		else
		{
			return s1.compareTo(s2);
		}
		
	}
//	public int compare(Object obj1, Object obj2) {
//		Integer I1= (Integer)obj1;
//		Integer I2= (Integer)obj2;
//		//return I1.compareTo(I2);
//		return -I1.compareTo(I2);
//		//return -I2.compareTo(I1);
//		//return 1;
//	}
	
	
}