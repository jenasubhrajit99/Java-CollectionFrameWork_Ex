import java.util.HashMap;

public class IdentityHashMap_Ex {
	public static void main(String[] args) {
		HashMap m = new HashMap();
		Integer I1 = new Integer(10);
		Integer I2= new Integer(10);
		m.put(I1, "Jeet");
		m.put(I2, "Subhrajit");
		System.out.println(m);
	}
}
