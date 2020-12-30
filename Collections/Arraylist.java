package Collections;
import java.util.*;

public class Arraylist
{
 public static void main(String args[])
 {
	 ArrayList<Integer> al = new ArrayList<Integer>();
     al.add(1);
     al.add(2);
     al.add(4);
     al.add(5);
     al.add(6);
     al.add(7);
     System.out.println("ArrayList values before insertion: ");
     for(int index=0; index < al.size(); index++)
         System.out.print(" "+al.get(index));
  System.out.println("\nEnter the element to insert: ");
  Scanner sc = new Scanner(System.in);
  int element = sc.nextInt();
  System.out.println("Enter the position to insert: ");
  int pos = sc.nextInt();
  
   al.add(pos-1,element);
System.out.println();
System.out.println("ArrayList values after insertion:");
   for(int index=0; index < al.size(); index++)
      System.out.print(" "+al.get(index));
   sc.close();
 }
}
