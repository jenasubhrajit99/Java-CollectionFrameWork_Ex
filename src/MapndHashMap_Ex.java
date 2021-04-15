import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapndHashMap_Ex {
	public static void main(String[] args) {
		HashMap m = new HashMap();
		m.put("Chiranjivi", 700);
		m.put("Balaiah", 800);
		m.put("Venkatesh", 200);
		m.put("Nagarjuna", 500);
		System.out.println(m);
		System.out.println(m.put("Chiranjivi", 1000));
		Set s = m.keySet();
		System.out.println(s);
		Collection c = m.entrySet();
		System.out.println(c);
		Set s1 = m.entrySet();
		System.out.println(s1);
		Iterator itr = s1.iterator();
		while(itr.hasNext())
		{
			Map.Entry m1 = (Entry) itr.next();
			System.out.print(m1.getKey()+"...."+m1.getValue());
			if(m1.getKey().equals("Nagarjuna"))
			{
				m1.setValue(10000);
			}
		}
		System.out.println();
		System.out.println(m);
	}
}
