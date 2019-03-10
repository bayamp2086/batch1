package com.bayamp.sonia.training.objects;

import java.util.UUID;

public abstract class Person {

	protected String fName;
	protected String lname;
	protected Address address;
	protected long id;
	protected static int count;

	protected Person(String fname, String lname, Address address) {
		this.fName = fname;
		this.lname = lname;
		this.address = address;
		Person.count = Person.count + 1;
		this.id = UUID.randomUUID().getMostSignificantBits();

	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public static int getCount() {
		return count;
	}

	public void setCount(int count) {
		Person.count = count;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public long getId() {
		return id;
	}

	public String toString() {
		return "First Name :" + this.fName + "\nLast NAme :" + this.lname + "\nId :" + this.id + "\nStudent Address :"
				+ address + "\nTotal Person :" + count;

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((fName == null) ? 0 : fName.hashCode());
		result = prime * result + ((lname == null) ? 0 : lname.hashCode());
		return result;
	}

	@Override
	
	  public boolean equals(Object o) {
	  
	  System.out.println("In Person Override method");
	  
	  if (!(o instanceof Person)) { return false; }
	  
	  Person p = (Person) o; if (this.fName.equals(p.fName) &&
	  this.lname.equals(p.lname) && this.address.equals(p.address)) { return true;
	  } else { return false; }
	  
	  }
	 

	
	  public boolean equals(Student P) {
	  
	  System.out.println("In Person Student"); 
	  return true; 
	  
	  }
	  
	
	  public boolean equals(Person P) {
	  
	  System.out.println("In Person "); return true;
	  
	  }
	 
	 

}
