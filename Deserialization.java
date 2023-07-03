package com.externizable;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.level2.Student;

public class Deserialization {
	
	public static void main(String[] args) {
		//step 1:
		String file= "C:\\Users\\CHETANA SADARE\\Desktop\\studentfile2.txt";
		FileInputStream fis = null;
		 ObjectInputStream ois = null;
		try {
			 fis=new FileInputStream(file);
			 //step2 :
			 ois=new ObjectInputStream(fis);
			 //step 3:
			 Employee s2 =(Employee) ois.readObject();//readExternal()
			 
			 System.out.println(s2);
			 System.out.println("Deserialization completed.");
			 
		} catch ( IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
