package Tests;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;
import Util.Checker;

public class CheckerTest {

    @Test
    public void testDataChecker_ValidData() {
        try {
            Checker.dataChecker("Valid Data");
        } catch (Exception e) {
            fail("Invalid Exception Thrown");
        }
    }

    @Test
    public void testDataChecker_InvalidData_Length() {
        assertThrows(IllegalArgumentException.class, () -> Checker.dataChecker("Invalid Length"));
    }

    @Test
    public void testDataChecker_InvalidData_Null() {
        assertThrows(NullPointerException.class, () -> Checker.dataChecker(null));
    }

    @Test
    public void testAddressChecker_ValidAddress() {
        try {
            Checker.addressChecker("Valid Address");
        } catch (Exception e) {
            fail("Invalid Exception Thrown");
        }
    }

    @Test
    public void testAddressChecker_InvalidAddress_Length() {
        assertThrows(IllegalArgumentException.class, () -> Checker.addressChecker("sljakdluioajhdihjnwqo;idusoi;hcnjmknadl;kdjasoi;duqio;whned;jkqwhdiuh"));
    }

    @Test
    public void testAddressChecker_InvalidAddress_Null() {
        assertThrows(NullPointerException.class, () -> Checker.addressChecker(null));
    }

    @Test
    public void testPhoneChecker_ValidPhone() {
        try {
            Checker.phoneChecker("0123456789");
        } catch (Exception e) {
            fail("Invalid Exception Thrown");
        }
    }

    @Test
    public void testPhoneChecker_InvalidPhone_Length() {
        assertThrows(IllegalArgumentException.class, () -> Checker.phoneChecker("12345"));
    }

    @Test
    public void testPhoneChecker_InvalidPhone_Null() {
        assertThrows(NullPointerException.class, () -> Checker.phoneChecker(null));
    }

    @Test
    public void testObjectChecker_ValidObject() {
        try {
            Checker.objectChecker("Valid");
        } catch (Exception e) {
            fail("Invalid Exception Thrown");
        }
    }

    @Test
    public void testObjectChecker_InvalidObject_Length() {
        assertThrows(IllegalArgumentException.class, () -> Checker.objectChecker("sfdfo;ieqkiuqwo;ihdnjoshgfiupagtsruioagh"));
    }

    @Test
    public void testObjectChecker_InvalidObject_Null() {
        assertThrows(NullPointerException.class, () -> Checker.objectChecker(null));
    }

    @Test
    public void testDescriptionChecker_ValidDescription() {
        try {
            Checker.descriptionChecker("Valid");
        } catch (Exception e) {
            fail("Invalid Exception Thrown");
        }
    }

    @Test
    public void testDescriptionChecker_InvalidDescription_Length() {
        assertThrows(IllegalArgumentException.class, () -> Checker.descriptionChecker("lkjahslojiahs;olkshfdiopqwyaweiouqywghriuj;fbdjhbfiuyadsfdig"));
    }

    @Test
    public void testDescriptionChecker_InvalidDescription_Null() {
        assertThrows(NullPointerException.class, () -> Checker.descriptionChecker(null));
    }

    @Test
    public void testDateChecker_ValidDate() {
        Date futureDate = new Date(System.currentTimeMillis() + 100000);
        try {
            Checker.dateChecker(futureDate);
        } catch (Exception e) {
            fail("Invalid Exception Thrown");
        }
    }

    @Test
    public void testDateChecker_InvalidDate_Past() {
        Date pastDate = new Date(System.currentTimeMillis() - 100000);
        assertThrows(IllegalArgumentException.class, () -> Checker.dateChecker(pastDate));
    }

    @Test
    public void testDateChecker_InvalidDate_Null() {
        assertThrows(NullPointerException.class, () -> Checker.dateChecker(null));
    }
}
