package com.test.contacts;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class ContactTest {

  // TODO:
  // first name is blank.
  //- last name is blank.
  //- phone number is blank.
  //- length is not 10.
  //- contains other than digits.
  //- does not start with 0

  @Test public void
  should_be_able_to_create_a_contact_with_firstname_lastname_phone() {
    Contact contact = new Contact("firstname", "lastname", "phone");
    assertEquals("firstname", contact.getFirstName());
    assertEquals("lastname", contact.getLastName());
    assertEquals("phone", contact.getPhoneNumber());
  }

  @Test public void
  should_validate_firstname_not_be_blank() {
    Contact contact = new Contact("", "lastname", "phone");
    boolean isValid = contact.validate();
    assertFalse(isValid);
  }


}
