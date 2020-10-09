package HashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class ExampleTwo {

	public static void main(String[] args) {
	
		Scanner scan= new Scanner(System.in);
		HashMap<String,String> details = new HashMap<String,String> ();
		
		System.out.println(" enter user namme and phone number . when done enter 'exit'.");
		while(!(scan.hasNext("exit"))) {
			String data= scan.next();
			String []data1= data.split("=");
			details.put(data1[0],data1[1]);
		}	
		
		// fetching the keys 
		
		Set <String> keys= details.keySet();
		System.out.println("fetching the keys :");
		for(String tempkey:keys)
		{
			System.out.println(tempkey);
		}
		
		// fetching the values
		
		Collection <String> values = details.values();
		System.out.println("fetching the values :");
		for(String tempvalues:values)
		{
			System.out.println(tempvalues);
		}
		
		// feting the entire data(name and phone number);
		
		Set <Entry<String,String>> entryset = details.entrySet();
		
		for(Entry<String,String> tempentry:entryset) {
			System.out.println(tempentry);
		}
		scan.close();
	}

}
