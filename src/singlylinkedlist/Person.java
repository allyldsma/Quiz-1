/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singlylinkedlist;

/**
 *
 * @author User
 */
public class Person {
 
    private String firstname;
	private String lastname;
	private String address;
	private String fullname;
	
	public Person(String firstname, String lastname, String address) {
		
		
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
	}
	
	public void setFirstName(String firstname){
		this.firstname = firstname;
	}
	
	public void setLastName(String lastname){
		this.lastname = lastname;
	}
	
	public void setAddress(String address){
		this.address = address;
	}
	
	public String getFirstName(){
		return firstname;
	}
	
	public String getLastName(){
		return lastname;
	}
	
	public String getAddress(){
		return address;
	}
	
	public String getFullName(){
		return fullname = this.firstname + ", " + this.lastname + ", " + this.address;
	}
	
}



