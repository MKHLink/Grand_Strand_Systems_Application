package Services;

import java.util.HashMap;
import java.util.Map;

import Contact.Contact;

public class ContactService{
	public Map<String, Contact> contacts = new HashMap<>();

    public void addContact(String id, String firstName, String lastName, String phone, String address) throws Exception{
    	try {
    		if(contacts.containsKey(id)) {
    			throw new Exception();
    		}else {
    			Contact contact = new Contact(id, firstName, lastName, phone, address);
    			contacts.put(id, contact);
    			System.out.println("Added contact: "+ contact);
    		}
    	}catch(Exception e) {
    		System.out.println("Duplicate Ids");
    		throw new Exception();
    	}
    	
    }    
    
    public void deleteContact(String id) throws Exception{
    	try {
    		if(contacts.containsKey(id)) {
    			contacts.remove(id);
    			System.out.println("Removed contact with id: "+ id);
    		}else {
    			throw new Exception();
    		}
    	}catch(Exception e) {
    		System.out.println("No contact found with id: "+ id);
    		throw new Exception();
    	}
    }

    public void updateContact(String id, String firstName, String lastName, String phone, String address) throws Exception{
    	try {
    		if(contacts.containsKey(id)) {
        		Contact contact = new Contact(id,firstName,lastName,phone,address);
        		contacts.put(id, contact);
        		System.out.println("Updated contact with id: "+id);
        	}else {
        		throw new Exception();
        	}
    	}catch(Exception e) {
    		System.out.println("Contact with id: "+id+" does not exist");
    		throw new Exception();
    	}
    }
}