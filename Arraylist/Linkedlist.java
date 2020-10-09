package Arraylist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
	LinkedList <Integer>ll=new LinkedList <Integer>();
     ll.add(10);
     ll.add(20);
     ll.add(30);
     ll.add(40);
     ll.add(50);
     System.out.println(ll);
     ll.addFirst(1);
     ll.addLast(99);
     //System.out.println(ll.addFirst(1)); gives u an error 
     System.out.println(ll);
     System.out.println(ll.removeFirst());//1
     System.out.println(ll.removeLast());//99
     System.out.println(ll);
    
     System.out.println(ll.get(0));//10
     System.out.println(ll.getClass());//linkedlist class
     System.out.println(ll.getFirst());//10
     System.out.println(ll.getLast());//50
     System.out.println(ll.peek());//10
     System.out.println(ll.peekFirst());//10
     System.out.println(ll.peekLast());//50
     System.out.println(ll);//[10, 20, 30, 40, 50]
     System.out.println(ll.poll());//10
     System.out.println(ll.pollFirst());//20
     System.out.println(ll.pollLast());//50
     System.out.println(ll);//[30, 40]
     System.out.println(ll.offer(99));//true
     System.out.println(ll.offerFirst(9));//true
     System.out.println(ll.offerLast(999));//true
     System.out.println(ll);
     ArrayList<Integer> array=new ArrayList<Integer>();
     array.add(22);
     array.add(33);
     array.add(44);
     LinkedList <Integer>ll1=new LinkedList <Integer>(array);
     ll1.add(55);
     ll1.add(65);
     ll1.add(75);
     ll1.add(95);
     ll1.add(85);
     ll1.add(5);
     ll1.add(15);
     ll1.offer(55);
     System.out.println(ll1);
     System.out.println(ll1.removeAll(array));
     System.out.println(ll1);
     //creating stack using linked list
     LinkedList<Integer> stack=new LinkedList <Integer>();
     stack.add(99);
     stack.push(9);
     stack.push(19);
     stack.push(39);
     System.out.println(stack);
	}
}
