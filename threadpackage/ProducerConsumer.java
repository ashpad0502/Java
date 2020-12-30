package threadpackage;
import java.util.LinkedList;

public class ProducerConsumer 
{
 public static void main(String args[])
 {
	final PC pc = new PC();
	Thread t1 = new Thread(new Runnable()
			{
		     public void run()
		     {
		    	try 
		    	 {
		    		pc.produce();
		    	 }
		    	catch(InterruptedException e)
		    	{ System.out.println(e); }
		     }
			});
	Thread t2 = new Thread(new Runnable()
			{
			 public void run()
			 {
				 try
				 {
					 pc.consume();
				 }
				 catch(InterruptedException e)
				 { System.out.println(e); }
			 }
			});
	t1.start();
	t2.start();
 }
 public static class PC
 {
  LinkedList<Integer> ls = new LinkedList<>();
  int capacity = 5;
  int pvalue,cvalue = 0;
  public void produce() throws InterruptedException
  {
	 while(pvalue<=capacity)
 	 {
 	  synchronized(this)
 	  {
 		while(ls.size()==capacity)
 		  wait(); //Waits until value consumer notifies
 		ls.add(++pvalue);
 		System.out.println(pvalue+" produced");
 		notify(); //Notify the consumer thread to consume
 		Thread.sleep(500);
 	  }
 	 }
  }
  public void consume() throws InterruptedException
  {
 	while(cvalue<=capacity)
 	{
 	 synchronized(this)
 	 {
 		 while(ls.size()==0)
 			wait();
 		 cvalue = ls.removeFirst();
 		 System.out.println(cvalue+" consumed");
 		 notify();
 		Thread.sleep(500);
 	 }
 	}
  }
 }
}
