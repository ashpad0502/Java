package threadpackage;
import java.util.Scanner;

public class InterthreadCommunication 
{
 public static void main(String args[])
 {
	 final PC pc = new PC();
	 Thread producer = new Thread(new Runnable()
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
	 Thread consumer = new Thread(new Runnable()
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
	 producer.start();
	 consumer.start();
	 
 }
 public static class PC
 {
  public void produce() throws InterruptedException
  {
 	synchronized(this)
 	{
	 System.out.println("Producer thread running");
 	 wait();
 	 System.out.println("Producer thread resuming and completed");
 	} 
  }
  public void consume() throws InterruptedException
  {
 	synchronized(this)
 	{
	 Thread.sleep(2000);
 	 Scanner sc = new Scanner(System.in);
 	 System.out.print("Consumer thread running. Press any key: ");
 	 sc.next();
 	 notify();
 	 System.out.println("Consumer thread completed. Passing control to producer after notify");
 	 Thread.sleep(2000);
 	} 
  }
 }
}
