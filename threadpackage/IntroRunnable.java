package threadpackage;

class Intro1 implements Runnable
{
 public void run()
 {
	 try
	 {
		 System.out.println("Thread running: "+Thread.currentThread().getId());
	 }
	 catch(Exception e)
	 { System.out.println(e); }
 }
}
public class IntroRunnable 
{
 public static void main(String args[])
 {
	for(int i=0;i<5;i++)
	{
		Thread in = new Thread(new Intro1());
		in.start();
	}
 }
}
