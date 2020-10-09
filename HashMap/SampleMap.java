package HashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;

public class SampleMap 
{
	public static void main(String[] args)
	{
		HashMap<String,Integer> data=new HashMap<String,Integer>();
		data.put("dattatreya yadav",988624);
		data.put("mallesh",988622);
		data.put("kusuma",123442);
		data.put("anji",134131);
		System.out.println(data.get("anji"));
		data.put("devi",231413);
		data.put("bhavya",313131);
		data.replace("anji", 413212);
		Integer k=data.replace("devi", 413242);
		System.out.println(k);//k will be having the old value
		System.out.println(data.get("anji"));
		System.out.println(data);
		//{dattatreya yadav=988624, anji=134131, bhavya=313131, mallesh=988622, devi=231413, kusuma=123442}
	    System.out.println(data.values());
	    //[988624, 134131, 313131, 988622, 231413, 123442]
	    System.out.println(data.values().size()); //6
	    //it give u the size of values
	    System.out.println(data.keySet());
        //[dattatreya yadav, anji, bhavya, mallesh, devi, kusuma]
	    System.out.println(data.keySet().size()); //6
	    //it give u the size of keyset 
	    System.out.println(data.entrySet());
	    //[dattatreya yadav=988624, anji=413212, bhavya=313131, mallesh=988622, devi=413242, kusuma=123442]
		System.out.println(data.containsKey("mallesh")); // true
		//Returns true if this map contains a mapping for the specified key.
		System.out.println(data.get("mallesh"));//988622
		//Returns true if this map contains a mapping for the specified key.
		System.out.println(data.size());//6
		//Returns the number of key-value mappings in this map.
		System.out.println(data.isEmpty());// false
		//Returns true if this map contains no key-value mappings
		System.out.println(data.containsValue(988624));//true
		//Returns true if this map maps one or more keys to the specified value.
		System.out.println(data.remove("anji"));// it returns value for this key after deleting //134131
		//Removes the mapping for the specified key from this map if present.
		System.out.println(data.remove("anji")); //null
		
	    System.out.println(data.remove("devi", 231413));// true
        //Removes the entry for the specified key only if it is currently mapped to the specified value.
	    System.out.println(data.remove("devi", 231413));// false
	    System.out.println("to print all keys");
	    Set<?> keys=data.keySet();
	    Iterator<?> i =keys.iterator();
	    while(i.hasNext())
	    {
	    	System.out.println(i.next());
	    }
	    System.out.println("to print all vlaues");	
	    Collection<?> values=data.values();//Returns a Collection view of the values contained in this map
        i=values.iterator();
        while(i.hasNext())
	    {
	    	System.out.println(i.next());
	    }
       Set<Entry<String,Integer>> entries = data.entrySet();
       Iterator<Entry<String,Integer>> itr=entries.iterator();
       while(itr.hasNext())
       {
    	   System.out.println(itr.next());//Returns the next element in the iteration.
       }
	}

}
