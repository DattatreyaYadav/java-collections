package Arraylist;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class ExampleTwo {

	public static void main(String[] args) {
		
		ArrayList <String> al = new ArrayList<String> ();
		
		Scanner  scan= new Scanner(System.in);
		
		System.out.println("enter the names , when done please enter 'exit' ");
		
		while(true) {
			String name = scan.nextLine();
			
			if(name.equalsIgnoreCase("exit")) {
				break;
			}
			else {
				al.add(name);
			}
		}
		
		ListIterator <String> itr = al.listIterator();
		
		System.out.println("printing from the beginning :");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("printing from the last :");
		while(itr.hasPrevious())
		{
			System.out.println(itr.previous());
		}
		
		System.out.println("coming from backward ");
		
		ListIterator <String> itr1= al.listIterator(al.size());
		
		while(itr.hasPrevious())
		{
			System.out.println(itr1.previous());
		}
		scan.close();
	}
}
