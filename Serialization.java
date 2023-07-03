package com.externizable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.level2.Student;

public class Serialization {
	
	public static void main(String[] args) {
		//Serialization
				//step 1:
			    Employee s1 = new Employee(1, "chetana", "Pune", 
			    		"mh", "india", 7894561231L, "AXFD7852S", 25464568556852L);
				//step 2:
				String file= "C:\\Users\\CHETANA SADARE\\Desktop\\studentfile2.txt";
				FileOutputStream fos = null;
				ObjectOutputStream oos = null;
				try {
					fos = new FileOutputStream(file);
					//step 3:
					oos = new ObjectOutputStream(fos);
					//step 4:
					oos.writeObject(s1); //writeExternal();
					System.out.println("Serialization Completed");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally {
					
					try {
						if(null != oos ) {
						    oos.close();
						}
						if(fos !=null ) {
							fos.close();
						}
						
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
	}

}
