package Services;

import java.util.ArrayList;
import java.util.List;

import Contact.Contact;

public class ContactService{
    public List<Contact> contactList = new ArrayList<>();

    public void addContact(String id, String firstName, String lastName, String phone, String address) throws Exception{
        for(Contact contact: contactList){
            if(contact.getContactId().equals(id)){
                throw new Exception("Duplicate Ids");
            }
        }
        Contact contact = new Contact(id, firstName, lastName, phone, address);
        contactList.add(contact);
        System.out.println("Added contact: "+ contact);
    }    
    
    public void deleteContact(String id){
        for(Contact contact:contactList){
            if(contact.getContactId().equals(id)){
                contactList.remove(contact);
                System.out.println("Removed contact: "+ contact);
                break;
            }
        }
    }

    public void updateContact(String id, String firstName, String lastName, String phone, String address){
        for(Contact contact:contactList){
            if(contact.getContactId().equals(id)){
                contact.setFirstName(firstName);
                contact.setLastName(lastName);
                contact.setPhoneNumber(phone);
                contact.setContactAddress(address);
            }
        }
    }
}