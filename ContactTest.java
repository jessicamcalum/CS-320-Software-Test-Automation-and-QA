/*
 * Jessica McAlum
 * SNHU CS 320
 * ContactTest.java
 */

package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import model.Contact;

class ContactTest {

	@Test
	void testContact() {
		Contact testContact = new Contact("ID12345", "firstname", "lastname", "1234567890", "1234 address");
		assertTrue(testContact.getContactId().equals("ID12345"));
		assertTrue(testContact.getFirstName().equals("firstname"));
		assertTrue(testContact.getLastName().equals("lastname"));
		assertTrue(testContact.getContactNumber().equals("1234567890"));
		assertTrue(testContact.getContactAddress().equals("1234 address"));
	}
	
	@Test
	void testContactIdTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("ID1234567890", "firstname", "lastname", "1234567890", "1234 address");
		}); 
	}
	
	@Test
	void testContactIdIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(null, "firstname", "lastname", "1234567890", "1234 address");
		});
	}
	
    @Test
    void testFirstNameTooLong() {
    	Assertions.assertThrows(IllegalArgumentException.class, () -> {
    		new Contact("ID12345", "longfirstname", "lastname", "1234567890", "1234 address");
    	});
    	
    }
    
	@Test
	void testFirstNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("ID12345", null, "lastname", "1234567890", "1234 address");
		});
	}
	
	@Test
    void testLastNameTooLong() {
    	Assertions.assertThrows(IllegalArgumentException.class, () -> {
    		new Contact("ID12345", "firstname", "longlastname", "1234567890", "1234 address");
    	});	
    }
	
	@Test
	void testLastNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("ID12345", "firstname", null, "1234567890", "1234 address");
		});
	}
	
	@Test
    void testContactNumberTooLong() {
    	Assertions.assertThrows(IllegalArgumentException.class, () -> {
    		new Contact("ID12345", "firstname", "lastname", "12345678901", "1234 address");
    	});	
    }
	
	@Test
	void testContactNumberIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("ID12345", "firstname", "lastname", null, "1234 address");
		});
	}
	
	@Test
    void testContactAddressTooLong() {
    	Assertions.assertThrows(IllegalArgumentException.class, () -> {
    		new Contact("ID12345", "firstname", "lastname", "1234567890", "1234 address this address is too long");
    	});	
    }
	
	@Test
	void testContactAddressIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("ID12345", "firstname", "lastname", "1234567890", null);
		});
	}
}
