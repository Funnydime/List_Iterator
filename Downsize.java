import java.util.LinkedList;
import java.util.ListIterator;

public class Downsize{

	public static void downsize(LinkedList<String> employeeNames, int n){
		ListIterator<String> iterator = employeeNames.listIterator(); //Making the itereator
		int a = employeeNames.size()/n; // will use to quantify the size
		for(int b = 0; b < a; b++){      //Looping to skip the nth number
			for(int c = 0; c < n; c++){
				iterator.next();
			}
			iterator.remove();
		}
	}
	
	public static void print(LinkedList<String> employeeNames){
		System.out.println("The content of the Linked List is:");
		System.out.println(employeeNames);
	}
}