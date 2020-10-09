package Hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class RemoveDuplicate {

	public static void main(String[] args) {
		
	  Scanner scan= new Scanner(System.in);
	  HashSet <Character> details = new HashSet<Character> ();
	  System.out.println("enter the String :-");
	  String word= scan.next();
	  
	  for(int i =0;i<word.length();i++)
	  {
		  details.add(word.charAt(i));
	  } 
	  
	  Iterator <Character> itr = details.iterator();
	  
	  while(itr.hasNext()) {
		  System.out.println(itr.next());
	  }
	  scan.close();
	}
}
