package Hashset;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Linkhashset {

	public static void main(String[] args) {
    
	Scanner scan= new Scanner(System.in);
	
    LinkedHashSet <String> details= new LinkedHashSet <String> ();	
	
    System.out.println("enter number of names to be entered :-");
    int number=scan.nextInt();
    
    System.out.println("enter names");
    for(int i=0;i<number;i++)
    {
    	details.add(scan.nextLine());
    }
    Iterator <String> itr =details.iterator();
    while(itr.hasNext()){
    	String temp= itr.next();
    	if(temp.length()>4 && temp.length()<=10) {
    		System.out.println(temp);
    	}
    	else {
    		continue;
    	}
    }
    scan.close();
	}
}
