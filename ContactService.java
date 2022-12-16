/*
 * Jessica McAlum
 * SNHU CS 320
 * ContactService.java
 */

package service;

import java.util.ArrayList;

import model.Contact;

public class ContactService {

	private static ArrayList<Contact> contactList;
	
	public ContactService() {
		contactList = new ArrayList<Contact>();
	}
	
	
	// Adds contact to list with unique ID
	public boolean addContact(Contact contact) {
	
		boolean uniqueId = true;
		
		// Checks that the contact ID is unique
		for(Contact contact1: contactList) {
			if(contact1.getContactId().equals(contact.getContactId())) {
				uniqueId = false;
			}	
		}
		if(uniqueId == true) {
			// Adds contact to ArrayList
			contactList.add(contact);
			System.out.println("Contact has been added successfully.");
			return true;
			
		}
		else {
			System.out.println("Contact ID already in use");
			return false;
		
		}
	}
	
	// Deletes contact per contact ID
	public boolean deleteContact(String contactId) {
		for(Contact contact: contactList) {
			if(contact.getContactId().equals(contactId)){
				contactList.remove(contact);
				System.out.println("Contact has been deleted successfully.");
				return true;
			}
		}
		
		System.out.println("Contact ID not found.");
		return false;
	}
	
	// Updates first name per contact ID
	public boolean updateFirstName(String contactId, String firstName) {
		for(Contact contact: contactList) {
			if(contact.getContactId().equals(contactId)) {
				contact.setFirstName(firstName);
				System.out.println("First name has been updated successfully.");
				return true;
			}
		}

		System.out.println("Contact ID not found.");
		return false;
	}
	
	// Updates last name per contact ID
	public boolean updateLastName(String contactId, String lastName) {
		for(Contact contact: contactList) {
			if(contact.getContactId().equals(contactId)) {
				contact.setLastName(lastName);
				System.out.println("Last name has been updated successfully.");
				return true;
			}
		}
		
		System.out.println("Contact ID not found.");
		return false;
	}
	
	// Updates number per contact ID
	public boolean updateContactNumber(String contactId, String contactNumber) {
		for(Contact contact: contactList) {
			if(contact.getContactId().equals(contactId)) {
				contact.setContactNumber(contactNumber);
				System.out.println("Contact number has been updated successfully.");
				return true;
			}
		}

		System.out.println("Contact ID not found.");
		return false;
	}
	
	// Updates address per contact ID
	public boolean updateContactAddress(String contactId, String contactAddress) {
		for(Contact contact: contactList) {
			if(contact.getContactId().equals(contactId)) {
				contact.setContactAddress(contactAddress);
				System.out.println("Address has been updated successfully.");
				return true;
			}
		}

		System.out.println("Contact ID not found.");
		return false;
	}
}

