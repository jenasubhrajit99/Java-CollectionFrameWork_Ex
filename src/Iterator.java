import java.io.*;
import java.util.*;
public class Iterator {
public static void main(String[] args) {
	ArrayList<String> list =new ArrayList<String>();
	list.add("A");
	list.add("B");
	list.add("C");
	list.add("D");
	java.util.Iterator<String> iterator = list.iterator();
	System.out.println("The List Elements are :");
	while(iterator.hasNext())
		System.out.print(iterator.next() +" ");
	System.out.println();		
}
}
