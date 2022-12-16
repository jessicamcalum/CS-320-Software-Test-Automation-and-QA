/*
 * Jessica McAlum
 * SNHU CS 320
 * ContactServiceTest.java
 */

package service;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

import model.Contact;
import service.ContactService;

class ContactServiceTest {

	@Test
	void testAddContact() {
		ContactService contactService = new ContactService();
		Contact contact1 = new Contact("1234", "firstname", "lastname", "1234567890", "1234 address");
		
		assertEquals(true, contactService.addContact(contact1));
	}
	
	@Test
	void testDeleteContact() {
		ContactService contactService = new ContactService();
		Contact contact1 = new Contact("1234", "firstname", "lastname", "1234567890", "1234 address");
		contactService.addContact(contact1);
		
		assertEquals(true, contactService.deleteContact("1234")); 
		
	}
	
	@Test
	void testUpdateContact() {
		ContactService contactService = new ContactService();
		Contact contact2 = new Contact("12345", "firstname", "lastname", "123", "address");
		contactService.addContact(contact2);
		
		assertEquals(true, contactService.updateFirstName("12345", "John"));
		assertEquals(true, contactService.updateLastName("12345", "Smith"));
		assertEquals(true, contactService.updateContactNumber("12345", "newNum"));
		assertEquals(true, contactService.updateContactAddress("12345", "newAddress"));
		
	}
	
}
