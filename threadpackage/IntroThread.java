package threadpackage;

class Intro extends Thread
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
public class IntroThread 
{
 public static void main(String args[])
 {
	
	for(int i=0;i<5;i++)
	{
		Intro in = new Intro();
		in.start();
	}
 }
}