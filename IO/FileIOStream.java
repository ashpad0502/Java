package IO;
import java.io.*;
import java.util.*;
public class FileIOStream
{
 public static void main(String args[])
 {
 try
 {
	FileOutputStream fout = new FileOutputStream("abc.txt");
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter text to be written to file: ");
	String s = sc.nextLine();
	sc.close();
	byte b[]=s.getBytes();
	fout.write(b);
	System.out.println("\n------Write Sucessful------\n");
	fout.close();
	System.out.println("\n------Reading from file------\n");
	FileInputStream fin = new FileInputStream("abc.txt");
	int i=0;
	while((i=fin.read())!=-1)
	{
	  System.out.print((char)i);
	}
	fin.close();
 }
 catch(Exception e)
 	{
	 System.out.println(e);
 	}
 }
}
