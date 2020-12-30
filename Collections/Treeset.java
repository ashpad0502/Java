package Collections;

import java.util.TreeSet;

public class Treeset 
{
	public static void main(String args[])
	 {
		 TreeSet<String> hs = new TreeSet<String>(); //Accepts only unique value
		 hs.add("B");
		 hs.add("A");
		 hs.add("D");
		 hs.add("E");
		 hs.add("C");
		 hs.add("F");
		 System.out.println(hs); //Maintain sorting order
	 }
}