/*
 * Jessica McAlum
 * SNHU CS 320
 * Contact.java
 */

package model;

public class Contact {
	private String contactId;
	private String firstName;
	private String lastName;
	private String contactNumber;
	private String contactAddress;
	
	public Contact(String contactId, String firstName, String lastName, String contactNumber, String contactAddress) {
		if(contactId == null || contactId.length()>10) {
			throw new IllegalArgumentException("Invalid contact ID");	
		}
		if(firstName == null || firstName.length()>10) {
			throw new IllegalArgumentException("Invalid first name");
		}
		if(lastName == null || lastName.length()>10) {
			throw new IllegalArgumentException("Invalid last name");
		}
		if(contactNumber == null || contactNumber.length()>10) {	
			throw new IllegalArgumentException("Invalid number");
		}
		if(contactAddress == null || contactAddress.length()>30) {
			throw new IllegalArgumentException("Invalid address");
		}
		 setContactId(contactId);
		 setFirstName(firstName);
		 setLastName(lastName);
		 setContactNumber(contactNumber);
		 setContactAddress(contactAddress);
	} 
	
	public String getContactId() {
		return contactId;
	}
	
	public void setContactId(String id) {
		contactId = id;
	}
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String fName) {
		firstName = fName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lName) {
		lastName = lName;
	}
	
	public String getContactNumber() {
		return contactNumber;
	}
	
	public void setContactNumber(String conNumber) {
		contactNumber = conNumber;
	}
	
	public String getContactAddress() {
		return contactAddress;
	}
	
	public void setContactAddress(String conAddress) {
		contactAddress = conAddress;
	}
}
