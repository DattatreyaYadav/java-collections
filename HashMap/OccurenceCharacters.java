package HashMap;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class OccurenceCharacters {

	public static void main(String[] args) {
        HashMap <Character,Integer> table= new HashMap<Character,Integer>();
        Scanner scan=new Scanner(System.in);
        String data=scan.next();
        for(int i=0;i<data.length();i++)
        {
        	char c=data.charAt(i);
        	if(table.containsKey(c)) {
        		Integer count=table.get(c);
        		table.put(c,++count);
        	}
        	else {
        		table.put(c,1);
        	}	
        }
        Set <Character> keys=table.keySet();
        for(Character tempkey:keys) {
        	System.out.println(tempkey+" "+table.get(tempkey));
        }
        scan.close();
	}
}
