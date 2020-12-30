package Collections;

import java.util.*;
public class Linkedhashset 
{
	public static void main(String args[])
	 {
		 LinkedHashSet<String> hs = new LinkedHashSet<String>(); //Accepts only unique value
		 hs.add("B");
		 hs.add("A");
		 hs.add("D");
		 hs.add("E");
		 hs.add("C");
		 hs.add("F");
		 System.out.println(hs); //Maintain insertion order
	 }
}
