package deadlock;
public class Deadlock 
{
	public static Object a1 = new Object();
	public static Object b1 = new Object();
	public static void main(String args[])
	{
		Thread t1 = new Thread() { 
	   public void run()
		{
		 synchronized(a1)
		 {
		  System.out.println("Holding obj a1");
		  try
		  {
			  Thread.sleep(100);
		  }
		  catch(InterruptedException e)
		  {
			  System.out.println(e);
		  }
		 
		 synchronized(b1)
		  {
			 System.out.println("Thread 1 now holding b1");
		  }
		 }
		}
	 };
	
	Thread t2 = new Thread() 
	{
		public void run()
		{
		 synchronized(b1)
		 {
			 System.out.println("Holding obj b1");
			 try
			  {
				  Thread.sleep(100);
			  }
			  catch(InterruptedException e)
			  {
				  System.out.println(e);
			  }
		 synchronized(a1)
		 {
			 System.out.println("Thread 2 now holding a1");
		 }
		} 
	 }
	};
	t1.start();
	t2.start();
   }
}
