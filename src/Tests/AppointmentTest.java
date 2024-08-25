package Tests;

import static org.junit.Assert.*;
import org.junit.Test;
import Appointment.Appointment;
import Util.Checker;

import java.util.Date;

public class AppointmentTest {
	private Date date = new Date(System.currentTimeMillis() + 86400000);

    @Test
    public void testAppointment() {
        Appointment appointment = new Appointment("1",date, "Description");
        assertEquals("1", appointment.getId());
        assertEquals(date, appointment.getDate());
        assertEquals("Description", appointment.getDescription());
    }

    @Test
    public void testGetId() {
        Appointment appointment = new Appointment("1",date, "Description");
        assertEquals("1", appointment.getId());
    }

    @Test
    public void testGetDate() {
        Appointment appointment = new Appointment("1",date, "Description");
        assertEquals(date, appointment.getDate());
    }

    @Test
    public void testSetDate() {
        Appointment appointment = new Appointment("1",date, "Description");
        appointment.setDate(date);
        assertEquals(date, appointment.getDate());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDateInPast() {
        Date badDate = new Date(System.currentTimeMillis() - 86400000); 
        Appointment appointment = new Appointment("1",date, "Description");
        appointment.setDate(badDate);
    }

    @Test(expected = NullPointerException.class)
    public void testSetDateNull() {
        Appointment appointment = new Appointment("1", date, "Description");
        appointment.setDate(null);
    }

    @Test
    public void testGetDescription() {
        Appointment appointment = new Appointment("1",date, "Description");
        assertEquals("Description", appointment.getDescription());
    }

    @Test
    public void testSetDescription() {
        Appointment appointment = new Appointment("1",date, "Description");
        appointment.setDescription("New Description");
        assertEquals("New Description", appointment.getDescription());
    }

    @Test(expected = NullPointerException.class)
    public void testIdCheckerNull() {
        Appointment appointment = new Appointment(null,date, "Description");
        Checker.dataChecker(appointment.getId());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIdCheckerInvalid() {
        Appointment appointment = new Appointment("kjsadoijuwsdfoikjnwoiehdoikwndoishjdsaijdisp",date, "Description");
        Checker.dataChecker(appointment.getId());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDescriptionCheckerInvalid() {
        Appointment appointment = new Appointment("1",date, "kajsiojasoijapoisuhapouhdupaghsadipjhsidudghsaiughdijasbdihjagsruiywyeuiyauisjdbshbcouyafsdiuhasojhdn;kjlsnciuscgafdo8ytqw97reoudtyqwpiouhpuosahdpuiygasfyuh");
        Checker.descriptionChecker(appointment.getDescription());
    }

    @Test(expected = NullPointerException.class)
    public void testDescriptionCheckerNull() {
        Appointment appointment = new Appointment("1",date, null);
        Checker.descriptionChecker(appointment.getDescription());
    }
}
