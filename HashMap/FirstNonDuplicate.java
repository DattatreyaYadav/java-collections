package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class FirstNonDuplicate {
	static char firstNonDuplicateCharacter(String s)
	{
		HashMap<Character,Integer> char_count=new HashMap<Character,Integer>();
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(char_count.containsKey(c))
			{
				char_count.put(c,char_count.get(c)+1);	
			}
			else
			{
				char_count.put(c,1);
			}
		}
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(char_count.get(c)>1) return c;
		}
		return '-';
	}
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
	    System.out.println("enter the String : ");
	    String s=scan.nextLine().toLowerCase().trim();
	    System.out.println("first Duplicate character in the given string");
	    char result=firstNonDuplicateCharacter(s);
	    System.out.println(result);
	    scan.close();

	}

}
