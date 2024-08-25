package Contact;

import Util.Checker;

public class Contact{
    private final String contactId;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String contactAddress;

    public Contact(String id, String first, String last, String phone, String address){
        Checker.dataChecker(id);
        this.contactId = id;
        Checker.dataChecker(first);
        this.firstName = first;
        Checker.dataChecker(last);
        this.lastName = last;
        Checker.phoneChecker(phone);
        this.phoneNumber = phone;
        Checker.addressChecker(address);
        this.contactAddress = address;
    }

    public String getContactId() {
        return this.contactId;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
    	Checker.dataChecker(firstName);
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
    	Checker.dataChecker(lastName);
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
    	Checker.phoneChecker(phoneNumber);
        this.phoneNumber = phoneNumber;
    }

    public String getContactAddress() {
        return this.contactAddress;
    }

    public void setContactAddress(String contactAddress) {
    	Checker.addressChecker(contactAddress);
        this.contactAddress = contactAddress;
    }
}