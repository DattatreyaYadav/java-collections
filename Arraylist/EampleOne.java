package Arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class EampleOne {

	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
		ArrayList <String> details= new ArrayList<>();
		
		System.out.println("enter username and phonenumber , when done enter 'exit' ");
		
		// enter the details in to the arraylist
		while(!(scan.hasNext("exit"))) {
			details.add(scan.nextLine());
		}
		
		// displaying the details from arrayList
		
		for(String temp: details) {
			System.out.println(temp);
		}
		scan.close();
	}
}
