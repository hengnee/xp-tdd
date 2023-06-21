package com.test.contacts;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ContactTest {

  @Test public void
  should_be_able_to_create_a_contact_with_firstname_lastname_phone() {
    Contact contact = new Contact("firstname", "lastname", "phone");
    assertEquals("firstname", contact.getFirstName());
    assertEquals("lastname", contact.getLastName());
    assertEquals("phone", contact.getPhoneNumber());
  }
}
