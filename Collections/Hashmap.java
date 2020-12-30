package Collections;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
public class Hashmap 
{
 public static void main(String args[])
 {
	 HashMap<Integer,String> hm = new HashMap<Integer,String>(); //Accepts only unique keys
	 hm.put(2,"B");
	 hm.put(1,"S");
	 hm.put(1,"A");
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
