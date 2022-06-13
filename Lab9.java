import java.util.LinkedList;
import java.util.ListIterator;

public class Lab9{
	LinkedList<String> employeeNames = new LinkedList<>();
	
	employeeNames.add("John");
	employeeNames.add("Emma");
	employeeNames.add("Luis");
	employeeNames.add("Carlos");
	employeeNames.add("Karla");
	employeeNames.add("Maria");
	
	Downsize.downsize(employeeNames, 2);
	Downsize.print(employeeNames);
	System.out.println("Expeted: John Luis Karla");
}