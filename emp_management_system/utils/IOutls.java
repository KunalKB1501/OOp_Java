package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

import com.app.emp.Employee;

@SuppressWarnings("unused")
public interface IOutls {

//	static void storedetails(String filename,HashMap<String , Employee>maps) throws FileNotFoundException, IOException
//	{
//		try(ObjectOutputStream obj=new ObjectOutputStream(new FileOutputStream(filename)))
//		{
//			obj.writeObject(maps);
//		} 
//	}
//	
//	
//	@SuppressWarnings("unchecked")
//	static HashMap<String , Employee> restoredetails(String filename) throws FileNotFoundException, IOException, ClassNotFoundException
//	{
//		try(ObjectInputStream in=new ObjectInputStream(new FileInputStream(filename)))
//		{
//			return (HashMap<String, Employee>)in.readObject();
//		}
//	}
	
	//add a static method to store emp details
	
	static void storeDetails(HashMap<String, Employee>maps,String filename) throws IOException
	{
		
		try(ObjectOutputStream out =new ObjectOutputStream(new FileOutputStream(filename)))
		{
			out.writeObject(maps);
		}
	}
	
	////add a static method to restore emp details
	@SuppressWarnings("unchecked")
	static HashMap<String, Employee> restoreDetails(String filename) throws IOException
	{
		
		try(ObjectInputStream in =new ObjectInputStream(new FileInputStream(filename)))
		{
			return (HashMap<String, Employee>)in.readObject();
		}
		catch (Exception e) {
			System.out.println("return empty map");
		return new HashMap<String, Employee>();
		}
	}
	

}
