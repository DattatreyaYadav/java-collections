package HashMap;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class EaxmpleThree {

	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
	    HashMap <String,Integer> details = new HashMap<String,Integer>();
	    
	    System.out.println("enter the string:-");
	    String data= scan.nextLine().trim();
	    String []data1 =data.split(" ");
	    for(int i=0;i<data1.length;i++)
	    {
	    	if(details.containsKey(data1[i]))
	    	{
	    		Integer count=details.get(data1[i]);
	    		details.put(data1[i],++count);
	    	}
	    	else {
	    		details.put(data1[i],1);
	    	}
	    }
	    // fetching the data:
	    
	    Set <String> keys= details.keySet();
	    
	    System.out.println("fetching the details :- ");
	    for(String tempkey:keys)
	    {
	    	System.out.println(tempkey+" "+details.get(tempkey));
	    }
	    scan.close();
	}

}
