package threadpackage;

class Sender
{
	public void send(String msg)
	{
		System.out.println("Sending message: "+msg);
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e)
		{ System.out.println(e); }
		System.out.println("Message "+msg+" sent");
	}
}

class ThreadSend extends Thread
{
	String msg=null;
	Sender sender = new Sender();
	ThreadSend(String msg, Sender obj)
	{
		this.msg = msg;
		this.sender = obj;
	}
	public void run()
	{
	 synchronized(sender)
	 {
		sender.send(msg);
	 }
	}
}
public class SynchronizedDemo
{
 public static void main(String args[])
 {
	String msg1="A"; String msg2="B";
	Sender s = new Sender();
	ThreadSend ts1 = new ThreadSend(msg1,s);
	ThreadSend ts2 = new ThreadSend(msg2,s);
	ts1.start();
	ts2.start();
 }
}