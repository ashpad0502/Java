package Serialization;
import java.io.*;
public class Student implements Serializable
{
 String name; 
 int id; 
 transient int age;
 public Student(int id,String name,int age)
 {
	this.id=id;
	this.name=name;
	this.age=age;
 }
 public static void main(String args[])
 {
	Student s = new Student(101,"Andree",23);
	//Serialization
	try
	{
	FileOutputStream fout = new FileOutputStream("abc.txt");
	ObjectOutputStream out = new ObjectOutputStream(fout);
	out.writeObject(s);
	out.flush();
	out.close();
	fout.close();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	System.out.println("\nObject Serialized");
	System.out.println("-----------------\n");
	//Deserialization
	try
	{
	 ObjectInputStream in = new ObjectInputStream(new FileInputStream("abc.txt"));
	 Student s1 = (Student)in.readObject();
	 System.out.print("ID: "+s1.id+"\nName: "+s1.name+"\nAge: "+s1.age);
	 in.close();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
 }
}
