//Java Program to count words in a sentence and display in alphabetical order
package Trees;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
public class TreeMapDemo {
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a sentence: ");
	String so = sc.nextLine(); int count;
	String s = so.toLowerCase();
	TreeMap<String,Integer> tm  = new TreeMap<>();
	String[] arr = s.split(" ");
	for(String s1 : arr)
	{
		count=0;
		for(String ssub : arr)
		{
			if(s1.equals(ssub)) count+=1; 
		}
		tm.put(s1, count);
	}
	Set eset = tm.entrySet();
	Iterator i = eset.iterator();
	while(i.hasNext())
	{
	 Map.Entry me = (Map.Entry)i.next();
	 System.out.println(me.getKey()+" "+me.getValue());
	}
}
}
