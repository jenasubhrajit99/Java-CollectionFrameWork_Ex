import java.util.Stack;

public class Stack_Ex {
	public static void main(String[] args) {
		Stack stack = new Stack();
		System.out.println(stack);
		stack_push(stack);
		stack_pop(stack);
		System.out.println("Re-Pushing the elements");
		stack_push(stack);
		stack_peek(stack);
//		stack_search(stack, 4);
//		stack_search(stack, 6);
		
//		stack.push(33);
//		stack.push("Subhrajit");
//		stack.push(12.99);
//		stack.add(2, 100);
//		stack.addAll(1, stack);
//		System.out.println(stack.capacity());
//		System.out.println(stack.clone());
//		System.out.println(stack.contains(44));
//		stack.elements();
		
		//stack.clear();
		System.out.println("Final Stack is :"+stack);
	}

	private static void stack_search(Stack<Integer> stack, int element) {
		Integer f = (Integer) stack.search(element);
		if(f==-1)
		{
			System.out.println("Element is Not Found");
		}
		else
		{
			System.out.println("Element is found at position :"+f);
		}
		
	}

	private static void stack_peek(Stack<Integer> stack) {
		Integer element = stack.peek();
		System.out.println("Element on stack top is : "+element);
		
	}

	private static void stack_pop(Stack<Integer> stack) {
		for(int i=0; i<5; i++)
		{
			Integer y = stack.pop();
			System.out.println("Afetr POP Operation :"+y);
		}
		System.out.println(stack);
		
	}

	private static void stack_push(Stack<Integer> stack) {
		for(int i=0; i<5; i++)
		{
			stack.push(i);
		}
		System.out.println(stack);
		
	}
}
