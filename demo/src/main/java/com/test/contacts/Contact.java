package com.test.contacts;

public class Contact {
  private final String firstname;
  private final String lastname;
  private final String phone;

  public Contact(String firstname, String lastname, String phone) {

    this.firstname = firstname;
    this.lastname = lastname;
    this.phone = phone;
  }

  public String getFirstName() {
    return firstname;
  }

  public String getLastName() {
    return lastname;
  }

  public String getPhoneNumber() {
    return phone;
  }

  public boolean validate() {
    return false;
  }
}
