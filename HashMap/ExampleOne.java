package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class ExampleOne {

	public static void main(String[] args) {
	  Scanner scan = new Scanner(System.in);
	  
	  HashMap <String,Integer> table= new HashMap<String,Integer>();
	  
	  System.out.println("enter number of employess");
	  int size= scan.nextInt();
	  
	  System.out.println("enter details of employees ");
	  
	  for(int i =0;i<size;i++)
	  {
		  String data = scan.nextLine().trim();
		  String [] data1= data.split("=");
		  // put() method is used to insert the data in to HashMap
		  table.put(data1[0],Integer.parseInt(data1[1]));
		  // Integer.parseInt() is used to convert string data in to integer data;
	  }
	  String [] names=new String[size];
	  System.out.println("enter the names to fetch the details");
	  
	  for(int i =0;i<names.length;i++)
	  {
		  names[i]=scan.next();
	  }
	  
	  // displaying the result;
	  
	  for(String name:names)
	  {
		  // containsKey will return t/f based on the key that we input 
		  if(table.containsKey(name)) {
			  //get() is used to get the value based on the key that we input.
			  System.out.println(table.get(name));
		  }
		  else {
			  System.out.println("person is missing!!!!");
		  }
	  }
	  scan.close();
	}
}
