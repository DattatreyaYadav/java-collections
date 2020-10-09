package Arraylist;

import java.util.ArrayList;

public class Program {

	public static void main(String[] args) {
		ArrayList<Integer> array1=new ArrayList<Integer>();
		array1.add(10);
		array1.add(20);
		array1.add(30);
		array1.add(40);
		array1.add(50);
		array1.add(60);
        System.out.println(array1);
//      ArrayList array2=new ArrayList();
//      array2.add(10);
//		array2.add("20");
//		array2.add(true);
//		array2.add('r');
//		array2.add(20.44);
//		array2.add(323);
//		System.out.println(array2);
		array1.add(2, 345);
		System.out.println(array1);
		System.out.println(array1.size());//7
		System.out.println(array1.remove(2));//345
		System.out.println(array1.contains(40));//true
		System.out.println(array1.get(2));//30
		System.out.println(array1.getClass());//class java.util.ArrayList
		System.out.println(array1.indexOf(30));//2
		ArrayList<Integer> array3=new ArrayList<Integer>();
		array3.add(100);
		array3.add(200);
		array3.add(300);
		array3.add(400);
		System.out.println(array3);
		System.out.println(array1.addAll(2,array3));//true
		System.out.println(array1);
		System.out.println(array1.set(3,999));//200
		System.out.println(array1);
		System.out.println(array1.removeAll(array3));//true
		System.out.println(array1);
		System.out.println(array1.subList(2,5));//999,30,40 only 3 elements
	    int sum=0;
		for(int numbers: array1)
	    {
	    	System.out.println(numbers);
	        sum=sum+numbers;
	    }
		System.out.println(sum);
		array1.ensureCapacity(20);
		//now we can store 20 elements in that array1
		System.out.println(array1.size());//7
		System.out.println(array1.isEmpty());
		
	}
	
	

}
