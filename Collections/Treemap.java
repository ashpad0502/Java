package Collections;

import java.util.TreeMap;
import java.util.Set;
import java.util.Map.Entry;

public class Treemap 
{
	public static void main(String args[])
	 {
		 TreeMap<Integer,String> hm = new TreeMap<Integer,String>();
		 hm.put(2,"B");
		 hm.put(1,"A");
		 hm.put(4,"D");
		 hm.put(5,"E");
		 hm.put(3,"C");
		 hm.put(6,"F");
		 Set<Entry<Integer,String>> set = hm.entrySet();
		 for(Entry<Integer,String> e : set)
		 {
			 System.out.println(e.getKey()+" "+e.getValue()); //Maintains sorted order
		 }
	 }
}
