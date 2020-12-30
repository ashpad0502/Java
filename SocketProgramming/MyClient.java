package SocketProgramming;
import java.net.*;
import java.io.*;
public class MyClient 
{
 public static void main(String args[]) throws Exception
 {
	Socket s = new Socket("localhost",3333);
	DataInputStream din = new DataInputStream(s.getInputStream());
	DataOutputStream dout = new DataOutputStream(s.getOutputStream());
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String str = new String();
	String str2 = new String();
	
	while(!str.equals("stop"))
	{
		System.out.println("Respond to server: ");
		str = br.readLine();
		dout.writeUTF(str);
		dout.flush();
		str2 = din.readUTF();
		System.out.println("Server says: "+str2);
	}
	dout.close();
	din.close();
	s.close();
 }
}
