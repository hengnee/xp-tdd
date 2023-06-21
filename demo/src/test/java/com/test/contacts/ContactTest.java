package com.test.contacts;

import org.junit.Test;

import static org.junit.Assert.*;

public class ContactTest {

  // TODO:
  // DONE first name is blank.
  //- DONE last name is blank.
  //- DONE phone number is blank.
  // DONE validate should return true when firstname, lastname and phonenumber is not blank
  //- length is not 10.
  //- contains other than digits.
  //- does not start with 0

  @Test public void
  should_be_a_valid_contact_when_firstname_lastname_phonenumber_not_blank() {
    Contact contact = new Contact("firstname", "lastname", "phone");
    boolean isValid = contact.validate();
    assertTrue(isValid);
  }

  @Test public void
  should_validate_firstname_not_blank() {
    Contact contact = new Contact("", "lastname", "phone");
    boolean isValid = contact.validate();
    assertFalse(isValid);
  }

  @Test public void
  should_validate_lastname_not_blank() {
    Contact contact = new Contact("firstname", "", "phone");
    boolean isValid = contact.validate();
    assertFalse(isValid);
  }

  @Test public void
  should_validate_phone_not_blank() {
    Contact contact = new Contact("firstname", "lastname", "");
    boolean isValid = contact.validate();
    assertFalse(isValid);
  }


}
