package Collections;

import java.util.Hashtable;
import java.util.Set;
import java.util.Map.Entry;
public class HashTable 
{
	public static void main(String args[])
	 {
		 Hashtable<Integer,String> hm = new Hashtable<Integer,String>(); //Accepts only unique keys. Is synchonized.
		 hm.put(2,"B");
		 hm.put(1,"A");
		 hm.put(4,"D");
		 hm.put(5,"E");
		 hm.put(3,"C");
		 hm.put(6,"F");
		 Set<Entry<Integer,String>> set = hm.entrySet();
		 for(Entry<Integer,String> e : set)
		 {
			 System.out.println(e.getKey()+" "+e.getValue());
		 }
	 }
}
