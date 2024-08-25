package Tests;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import Services.ContactService;
import Contact.Contact;

public class ContactServiceTest {
    private ContactService contactService;

    @Before
    public void setUp() {
        contactService = new ContactService();
    }

    @Test
    public void testAddContact() throws Exception {
        contactService.addContact("619","Rey","Mysterio","1234567890","619 Booyaka Lane");
        Contact contact = contactService.contactList.get(0);
        assertEquals("619", contact.getContactId());
        assertEquals("Rey", contact.getFirstName());
        assertEquals("Mysterio", contact.getLastName());
        assertEquals("1234567890", contact.getPhoneNumber());
        assertEquals("619 Booyaka Lane", contact.getContactAddress());
    }

    @Test(expected = Exception.class)
    public void testAddContactDuplicateId() throws Exception {
        contactService.addContact("619","Rey","Mysterio","1234567890","619 Booyaka Lane");
        contactService.addContact("619","Dominick","Mysterio","0987654321","619 Booyaka Lane");
    }

    @Test
    public void testDeleteContact() throws Exception {
        contactService.addContact("619","Rey","Mysterio","1234567890","619 Booyaka Lane");
        contactService.deleteContact("619");
        assertTrue(contactService.contactList.isEmpty());
    }

    @Test
    public void testUpdateContact() throws Exception {
        contactService.addContact("619","Rey","Mysterio","1234567890","619 Booyaka Lane");
        contactService.updateContact("619","Dominick","Mysterio","0987654321","619 DirtyDom Lane");
        Contact contact = contactService.contactList.get(0);
        assertEquals("Dominick", contact.getFirstName());
        assertEquals("Mysterio", contact.getLastName());
        assertEquals("0987654321", contact.getPhoneNumber());
        assertEquals("619 DirtyDom Lane", contact.getContactAddress());
    }
}
