
// hashset basically doesnot conatin duplicates in it we store elements from the array to the hashset when ever 
// we find first duplicate we will return that value;
package Hashset;

import java.util.HashSet;

public class FirstDuplicate {

	static int firstDuplicateNumber(int array[])
	{
		HashSet<Integer> seen =new HashSet<Integer>();
		for(int i =0;i<array.length;i++)
		{
			if(seen.contains(array[i]))
			{
				return array[i];
			}
			else
			{
				seen.add(array[i]);
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int array[]= {2,1,3,5,3,2};
		int result=firstDuplicateNumber(array);
		System.out.println("First Duplicate Number in the  given array ");
		System.out.println(result);
	}

}
