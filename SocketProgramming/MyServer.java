package SocketProgramming;
import java.net.*;
import java.io.*;
public class MyServer 
{
 public static void main(String args[]) throws Exception
 {
	ServerSocket ss = new ServerSocket(3333);
	Socket s = ss.accept();
	DataInputStream din = new DataInputStream(s.getInputStream());
	DataOutputStream dout = new DataOutputStream(s.getOutputStream());
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String str = new String();
	String str2 = new String();
	while(!str.equals("stop"))
	{
		str = din.readUTF();
		System.out.println("Client says: "+str);
		System.out.println("Respond to client: ");
		str2=br.readLine();
		dout.writeUTF(str2);
		dout.flush();
	}
	din.close();
	s.close();
	ss.close();
 }
}
