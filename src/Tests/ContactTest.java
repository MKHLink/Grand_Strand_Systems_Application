package Tests;

import static org.junit.Assert.*;
import org.junit.Test;
import Contact.Contact;
import Util.Checker;

public class ContactTest {

    @Test
    public void testContact() {
        Contact contact = new Contact("619","Rey","Mysterio","1234567890","619 Booyaka Lane");
        assertEquals("619", contact.getContactId());
        assertEquals("Rey", contact.getFirstName());
        assertEquals("Mysterio", contact.getLastName());
        assertEquals("1234567890", contact.getPhoneNumber());
        assertEquals("619 Booyaka Lane", contact.getContactAddress());
    }

    @Test
    public void testGetContactId() {
        Contact contact = new Contact("619","Rey","Mysterio","1234567890","619 Booyaka Lane");
        assertEquals("619", contact.getContactId());
    }

    @Test
    public void testGetFirstName() {
        Contact contact = new Contact("619","Rey","Mysterio","1234567890","619 Booyaka Lane");
        assertEquals("Rey", contact.getFirstName());
    }

    @Test
    public void testSetFirstName() {
        Contact contact = new Contact("619","Rey","Mysterio","1234567890","619 Booyaka Lane");
        contact.setFirstName("Dominick");
        assertEquals("Dominick", contact.getFirstName());
    }

    @Test
    public void testGetLastName() {
        Contact contact = new Contact("619","Rey","Mysterio","1234567890","619 Booyaka Lane");
        assertEquals("Mysterio", contact.getLastName());
    }

    @Test
    public void testSetLastName() {
        Contact contact = new Contact("619","Rey","Mysterio","1234567890","619 Booyaka Lane");
        contact.setLastName("Gurrero");
        assertEquals("Gurrero", contact.getLastName());
    }

    @Test
    public void testGetPhoneNumber() {
        Contact contact = new Contact("619","Rey","Mysterio","1234567890","619 Booyaka Lane");
        assertEquals("1234567890", contact.getPhoneNumber());
    }

    @Test
    public void testSetPhoneNumber() {
        Contact contact = new Contact("619","Rey","Mysterio","1234567890","619 Booyaka Lane");
        contact.setPhoneNumber("0987654321");
        assertEquals("0987654321", contact.getPhoneNumber());
    }

    @Test
    public void testGetContactAddress() {
        Contact contact = new Contact("619","Rey","Mysterio","1234567890","619 Booyaka Lane");
        assertEquals("619 Booyaka Lane", contact.getContactAddress());
    }

    @Test
    public void testSetContactAddress() {
        Contact contact = new Contact("619","Rey","Mysterio","1234567890","619 Booyaka Lane");
        contact.setContactAddress("619 Dirty Lane");
        assertEquals("619 Dirty Lane", contact.getContactAddress());
    }
    
    @Test(expected = NullPointerException.class)
    public void testDataCheckerNull() {
        Contact contact = new Contact(null, "ABASKJADSO:KHDFIOJAKHSD", "ALKJKSHIUGHQISJBDJALBSA", "324", " ");
        Checker.dataChecker(contact.getContactId()); 
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDataCheckerInvalid() {
        Contact contact = new Contact("1121324354675567", "ABASKJADSO:KHDFIOJAKHSD", "ALKJKSHIUGHQISJBDJALBSA", "324", " ");
        Checker.dataChecker(contact.getContactId());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPhoneCheckerInvalid() {
        Contact contact = new Contact("1121324354675567", "ABASKJADSO:KHDFIOJAKHSD", "ALKJKSHIUGHQISJBDJALBSA", "324", " ");
        Checker.addressChecker(contact.getPhoneNumber());  
    }
    
    @Test(expected = NullPointerException.class)
    public void testPhoneCheckerNull() {
        Contact contact = new Contact("21342", "asa", "asas", null, "saasasd");
        Checker.addressChecker(contact.getPhoneNumber()); 
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddressChekerInvalid() {
        Contact contact = new Contact("1121324354675567", "ABASKJADSO:KHDFIOJAKHSD", "ALKJKSHIUGHQISJBDJALBSA", "324", "kjsahdiluashdf;ofn;ojashfjk;abnsfipjgasfk;jasndflijsahdf;kjsadf;jikshfd;sadklfhasd;kjfhvo;iasdhf;lkjasdjnf;oiuasyhfpas;ODHNF;SLAKJHASD;OIHDSALKJHASD;JOF");
        Checker.phoneChecker(contact.getContactAddress());  
    }

    @Test(expected = NullPointerException.class)
    public void testAddressChekerNull() {
        Contact contact = new Contact("132", "kaojs", ";ojkajhs", "1234567890", null);
        Checker.phoneChecker(contact.getContactAddress());  
    }
}
