import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDeque_Ex {
	public static void main(String[] args) {
		Deque<Character> d = new ArrayDeque<Character>();
		d.push('S');
		d.push('J');
		System.out.println(d.peek());
		System.out.println(d.pop());
		System.out.println(d);
	}
}
