package com.externizable;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Employee implements Externalizable {
	
	int id;
	String name;
	String city;
	String state;
	String country;
	long mobileNo;
	String pancard;
    long adharcard;
	public Employee() {
		super();
	}
	public Employee(int id, String name, String city, String state, String country, long mobileNo, String pancard,
			long adharcard) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.state = state;
		this.country = country;
		this.mobileNo = mobileNo;
		this.pancard = pancard;
		this.adharcard = adharcard;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", city=" + city + ", state=" + state + ", country=" + country
				+ ", mobileNo=" + mobileNo + ", pancard=" + pancard + ", adharcard=" + adharcard + "]";
	}
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(name);//string
		out.writeLong(mobileNo);//long
		
	}
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name=(String) in.readObject();
		mobileNo=in.readLong();
		
	}
    
    
    

}
